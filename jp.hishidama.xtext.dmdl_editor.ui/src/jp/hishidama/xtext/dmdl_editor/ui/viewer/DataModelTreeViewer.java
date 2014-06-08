package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.DMDLFileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.DataModelTypeUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode.ModelTreeNodePredicate;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.ModelNode;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class DataModelTreeViewer extends TreeViewer implements ICheckable {
	/**
	 * List of check state listeners (element type:
	 * <code>ICheckStateListener</code>).
	 */
	private ListenerList checkStateListeners = new ListenerList();

	/**
	 * Last item clicked on, or <code>null</code> if none.
	 */
	private TreeItem lastClickedItem = null;

	private ModelTreeNodePredicate predicate;

	public DataModelTreeViewer(Composite parent, int style, int nameWidth, int attrWidth) {
		this(parent, style, nameWidth, attrWidth, false);
	}

	public DataModelTreeViewer(Composite parent, int style, int nameWidth, int attrWidth, boolean enableDrag) {
		super(parent, style);
		setLabelProvider(new DMDLTreeLabelProvider());

		if (enableDrag) {
			int operations = DND.DROP_COPY | DND.DROP_DEFAULT;
			Transfer[] transferTypes = { DMDLTreeDataTransfer.getInstance() };
			addDragSupport(operations, transferTypes, new DMDLTreeDataDragListener(this));
		}

		Tree tree = getTree();
		tree.setHeaderVisible(true);
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("name");
			column.setWidth(nameWidth);
		}
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("attribute");
			column.setWidth(attrWidth);
		}

		if ((style & SWT.CHECK) != 0) {
			addCheckStateListener(new ICheckStateListener() {
				public void checkStateChanged(CheckStateChangedEvent event) {
					refreshChecked(event.getElement());
				}
			});
			tree.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					Point point = new Point(e.x, e.y);
					Tree tree = (Tree) e.widget;
					TreeItem item = tree.getItem(point);
					if (item != null && item.getBounds(0).contains(point)) {
						item.setChecked(!item.getChecked());
						refreshChecked(item.getData());
					}
				}
			});
		}

		addFilter(new DataModelFilter());
	}

	public void setLayoutData(Object layoutData) {
		getTree().setLayoutData(layoutData);
	}

	public void createFilterField(Composite composite, Object layoutData) {
		Composite field = new Composite(composite, SWT.NONE);
		field.setLayoutData(layoutData);
		field.setLayout(new GridLayout(6, false));

		Text fileNameText = createFilterTextField(field, "file name filter :");
		registerFileFilter(fileNameText);
		createLabel(field, "");
		createLabel(field, "");
		Combo modelTypeCombo = createTypeCombo(field, "model type :");

		Text modelNameText = createFilterTextField(field, "model name filter :");
		Text modelDescText = createFilterTextField(field, "description :");
		Text modelAttrText = createFilterTextField(field, "attribute :");
		registerModelFilter(modelNameText, modelDescText, modelAttrText, modelTypeCombo);
		modelNameText.setFocus();

		Text propNameText = createFilterTextField(field, "property name filter :");
		Text propDescText = createFilterTextField(field, "description :");
		Text propAttrText = createFilterTextField(field, "attribute :");
		registerPropertyFilter(propNameText, propDescText, propAttrText);
	}

	private Text createFilterTextField(Composite field, String label) {
		createLabel(field, label);

		return createText(field);
	}

	private void createLabel(Composite field, String label) {
		new Label(field, SWT.NONE).setText(label);
	}

	private Text createText(Composite field) {
		Text text = new Text(field, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(text);
		return text;
	}

	private Combo createTypeCombo(Composite field, String label) {
		createLabel(field, label);

		final Combo combo = new Combo(field, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo.add("");
		for (DataModelType type : DataModelType.values()) {
			combo.add(type.displayName());
		}

		return combo;
	}

	public void createExpandButtonField(Composite composite, Object layoutData) {
		Composite field = new Composite(composite, SWT.NONE);
		field.setLayoutData(layoutData);
		field.setLayout(new FillLayout(SWT.HORIZONTAL));

		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("Expand Model");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					collapseAll();
					expandToLevel(2);
				}
			});
		}
		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("Expand All");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					expandAll();
				}
			});
		}
		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("Collapse All");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					collapseAll();
				}
			});
		}
	}

	// CheckboxTreeViewer

	public void addCheckStateListener(ICheckStateListener listener) {
		checkStateListeners.add(listener);
	}

	public void removeCheckStateListener(ICheckStateListener listener) {
		checkStateListeners.remove(listener);
	}

	public boolean getChecked(Object element) {
		Widget widget = findItem(element);
		if (widget instanceof TreeItem) {
			return ((TreeItem) widget).getChecked();
		}
		return false;
	}

	public boolean setChecked(Object element, boolean state) {
		Assert.isNotNull(element);
		Widget widget = internalExpand(element, false);
		if (widget instanceof TreeItem) {
			((TreeItem) widget).setChecked(state);
			return true;
		}
		return false;
	}

	@Override
	protected void handleDoubleSelect(SelectionEvent event) {

		if (lastClickedItem != null) {
			TreeItem item = lastClickedItem;
			Object data = item.getData();
			if (data != null) {
				boolean state = item.getChecked();
				setChecked(data, !state);
				fireCheckStateChanged(new CheckStateChangedEvent(this, data, !state));
			}
			lastClickedItem = null;
		} else {
			super.handleDoubleSelect(event);
		}
	}

	@Override
	protected void handleSelect(SelectionEvent event) {

		lastClickedItem = null;
		if (event.detail == SWT.CHECK) {
			TreeItem item = (TreeItem) event.item;
			lastClickedItem = item;
			super.handleSelect(event);

			Object data = item.getData();
			if (data != null) {
				fireCheckStateChanged(new CheckStateChangedEvent(this, data, item.getChecked()));
			}
		} else {
			super.handleSelect(event);
		}
	}

	/**
	 * Notifies any check state listeners that the check state of an element has
	 * changed. Only listeners registered at the time this method is called are
	 * notified.
	 * 
	 * @param event
	 *            a check state changed event
	 * 
	 * @see ICheckStateListener#checkStateChanged
	 */
	protected void fireCheckStateChanged(final CheckStateChangedEvent event) {
		Object[] array = checkStateListeners.getListeners();
		for (int i = 0; i < array.length; i++) {
			final ICheckStateListener l = (ICheckStateListener) array[i];
			SafeRunnable.run(new SafeRunnable() {
				public void run() {
					l.checkStateChanged(event);
				}
			});
		}

	}

	private void refreshChecked(Object obj) {
		if (obj instanceof DMDLTreeData.FileNode) {
			TreeItem row = (TreeItem) findItem(obj);
			boolean c = getChecked(obj);
			row.setGrayed(false);
			for (TreeItem item : row.getItems()) {
				item.setChecked(c);
			}
		} else if (obj instanceof DMDLTreeData.ModelNode) {
			TreeItem row = (TreeItem) findItem(((DMDLTreeData.ModelNode) obj).getParent());
			int empty = 0, checked = 0;
			TreeItem[] items = row.getItems();
			for (TreeItem item : items) {
				if (item.getChecked()) {
					checked++;
				} else {
					empty++;
				}
			}
			if (empty == items.length) {
				row.setChecked(false);
				row.setGrayed(false);
			} else if (checked == items.length) {
				row.setChecked(true);
				row.setGrayed(false);
			} else {
				row.setChecked(true);
				row.setGrayed(true);
			}
		}
	}

	public void setChildrenPredicate(ModelTreeNodePredicate predicate) {
		this.predicate = predicate;
	}

	public void setInputAll(IProject project) {
		setInputAll(project, 3);
	}

	public void setInputAll(IProject project, int depth) {
		setContentProvider(new DMDLTreeContentProvider());

		IResourceSetProvider provider = InjectorUtil.getInstance(IResourceSetProvider.class);
		ResourceSet resourceSet = provider.get(project);

		List<IFile> files = DMDLFileUtil.getDmdlFiles(project);
		List<DMDLTreeData> list = new ArrayList<DMDLTreeData>(files.size());
		for (IFile file : files) {
			FileNode node = new DMDLTreeData.FileNode(file, resourceSet, depth);
			node.setChildrenPredicate(predicate);
			list.add(node);
		}
		setInput(list);
	}

	public void setInputList(List<DMDLTreeData> list) {
		setContentProvider(new DMDLTreeContentProvider());
		setInput(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DMDLTreeData> getInput() {
		return (List<DMDLTreeData>) super.getInput();
	}

	public void setInputModels(IProject project, String... modelNames) {
		List<DMDLTreeData> list = new ArrayList<DMDLTreeData>(modelNames.length);
		for (String modelName : modelNames) {
			if (StringUtil.isEmpty(modelName)) {
				continue;
			}
			ModelDefinition model = ModelUiUtil.findModel(project, modelName);
			if (model == null) {
				continue;
			}
			DMDLTreeData.ModelNode modelNode = new DMDLTreeData.ModelNode(project, null, model);
			list.add(modelNode);
		}
		setInputList(list);
	}

	@Override
	public ITreeSelection getSelection() {
		return (ITreeSelection) super.getSelection();
	}

	protected class DataModelFilter extends ViewerFilter {

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof DMDLTreeData.FileNode) {
				return select(viewer, parentElement, (DMDLTreeData.FileNode) element, true);
			}
			if (element instanceof DMDLTreeData.ModelNode) {
				return select(viewer, parentElement, (DMDLTreeData.ModelNode) element, true);
			}
			if (element instanceof DMDLTreeData.PropertyNode) {
				return select(viewer, parentElement, (DMDLTreeData.PropertyNode) element, true);
			}
			return true;
		}

		private boolean select(Viewer viewer, Object parentElement, DMDLTreeData.FileNode node, boolean direct) {
			if (fileNameFilter != null) {
				if (!node.select(fileNameFilter)) {
					return false;
				}
			}
			for (DMDLTreeData child : node.getChildren()) {
				if (select(viewer, node, (DMDLTreeData.ModelNode) child, false)) {
					return true;
				}
			}
			return false;
		}

		private boolean select(Viewer viewer, Object parentElement, DMDLTreeData.ModelNode node, boolean direct) {
			if (modelNameFilter != null || modelDescFilter != null || modelAttrFilter != null
					|| modelTypeFilter != null) {
				if (!node.select(modelNameFilter, modelDescFilter, modelAttrFilter, modelTypeFilter)) {
					return false;
				}
			}
			for (DMDLTreeData child : node.getChildren()) {
				if (select(viewer, node, (DMDLTreeData.PropertyNode) child, false)) {
					return true;
				}
			}
			return false;
		}

		private boolean select(Viewer viewer, Object parentElement, DMDLTreeData.PropertyNode node, boolean direct) {
			return node.select(propNameFilter, propescFilter, propAttrFilter);
		}
	}

	private Pattern fileNameFilter;
	private DataModelType modelTypeFilter;
	private Pattern modelNameFilter, modelDescFilter, modelAttrFilter;
	private Pattern propNameFilter, propescFilter, propAttrFilter;

	public void registerFileFilter(final Text nameText) {
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				fileNameFilter = DMDLStringUtil.getPattern(nameText.getText());
				refresh();
			}
		});
	}

	public void registerModelFilter(final Text nameText, final Text descText, final Text attrText, final Combo typeCombo) {
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelNameFilter = DMDLStringUtil.getNamePattern(nameText.getText());
				refresh();
				expandToLevel(2);
			}
		});
		descText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelDescFilter = DMDLStringUtil.getPattern(descText.getText());
				refresh();
				expandToLevel(2);
			}
		});
		attrText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelAttrFilter = DMDLStringUtil.getPattern(attrText.getText());
				refresh();
				expandToLevel(2);
			}
		});
		typeCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String s = typeCombo.getText();
				if (s.trim().isEmpty()) {
					modelTypeFilter = null;
				} else {
					modelTypeFilter = DataModelTypeUtil.valueOf(s);
				}
				refresh();
				expandToLevel(2);
			}
		});
	}

	public void registerPropertyFilter(final Text nameText, final Text descText, final Text attrText) {
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propNameFilter = DMDLStringUtil.getNamePattern(nameText.getText());
				refresh();
				expandAll();
			}
		});
		descText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propescFilter = DMDLStringUtil.getPattern(descText.getText());
				refresh();
				expandAll();
			}
		});
		attrText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propAttrFilter = DMDLStringUtil.getPattern(attrText.getText());
				refresh();
				expandAll();
			}
		});
	}

	public ModelDefinition findModel(String modelName) {
		List<DMDLTreeData> list = getInput();
		return findModel(list, modelName);
	}

	private ModelDefinition findModel(List<DMDLTreeData> list, String modelName) {
		if (list == null) {
			return null;
		}
		for (DMDLTreeData node : list) {
			if (node instanceof DMDLTreeData.FileNode) {
				ModelDefinition model = findModel(node.getChildren(), modelName);
				if (model != null) {
					return model;
				}
			}
			if (node instanceof DMDLTreeData.ModelNode) {
				ModelDefinition model = (ModelDefinition) node.getData();
				if (model.getName().equals(modelName)) {
					return model;
				}
			}
		}
		return null;
	}

	public List<DMDLTreeData.ModelNode> getCheckedModelList() {
		List<ModelNode> list = new ArrayList<DMDLTreeData.ModelNode>();
		for (TreeItem row : getTree().getItems()) {
			for (TreeItem item : row.getItems()) {
				if (item.getChecked()) {
					DMDLTreeData data = (DMDLTreeData) item.getData();
					if (data != null) {
						list.add((ModelNode) data);
					}
				}
			}
		}
		return list;
	}
}

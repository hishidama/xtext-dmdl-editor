package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.util.ArrayList;
import java.util.Arrays;
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
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.PropertyNode;
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
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
import org.eclipse.swt.widgets.Item;
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

	private boolean autoSelection = true;
	private boolean joinModelOnly;
	private boolean summarizeModelOnly;
	private ModelTreeNodePredicate predicate;

	private Text modelNameText;

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

		modelNameText = createFilterTextField(field, "model name filter :");
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

		Text text = createText(field);
		text.addKeyListener(FILTER_TEXT_KEY_LESTENER);
		return text;
	}

	private KeyListener FILTER_TEXT_KEY_LESTENER = new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.keyCode == SWT.ARROW_DOWN) {
				getTree().setFocus();
			}
		}
	};

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
		List<DataModelType> types = getDataModelTypes();
		for (DataModelType type : types) {
			if (type == null) {
				combo.add("");
			} else {
				combo.add(type.displayName());
			}
		}
		if (types.size() == 1) {
			combo.select(0);
		}

		return combo;
	}

	public void setJoinModelOnly() {
		this.joinModelOnly = true;
	}

	public void setSummarizeModelOnly() {
		this.summarizeModelOnly = true;
	}

	protected List<DataModelType> getDataModelTypes() {
		if (joinModelOnly) {
			return Arrays.asList(DataModelType.JOINED);
		}
		if (summarizeModelOnly) {
			return Arrays.asList(DataModelType.SUMMARIZED);
		}

		List<DataModelType> list = new ArrayList<DataModelType>();
		list.add(null);
		for (DataModelType type : DataModelType.values()) {
			list.add(type);
		}
		return list;
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
					selectAuto();
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
					selectAuto();
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

	public void setModelNameFilter(String filter) {
		modelNameText.setText(filter);
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
		if (obj instanceof FileNode) {
			TreeItem row = (TreeItem) findItem(obj);
			boolean c = getChecked(obj);
			row.setGrayed(false);

			List<DMDLTreeData> children = ((FileNode) obj).getChildren();
			if (children.size() != row.getItemCount()) {
				for (DMDLTreeData child : children) {
					internalExpand(child, false);
				}
			}
			for (TreeItem item : row.getItems()) {
				item.setChecked(c);
			}
		} else if (obj instanceof ModelNode) {
			TreeItem row = (TreeItem) findItem(((ModelNode) obj).getParent());
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
			FileNode node = new FileNode(file, resourceSet, depth);
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
			ModelNode modelNode = new ModelNode(project, null, model);
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
			if (element instanceof FileNode) {
				return select(viewer, parentElement, (FileNode) element, true);
			}
			if (element instanceof ModelNode) {
				return select(viewer, parentElement, (ModelNode) element, true);
			}
			if (element instanceof PropertyNode) {
				return select(viewer, parentElement, (PropertyNode) element, true);
			}
			return true;
		}

		private boolean select(Viewer viewer, Object parentElement, FileNode node, boolean direct) {
			if (fileNameFilter != null) {
				if (!node.select(fileNameFilter)) {
					return false;
				}
			}
			for (DMDLTreeData child : node.getChildren()) {
				if (select(viewer, node, (ModelNode) child, false)) {
					return true;
				}
			}
			return false;
		}

		private boolean select(Viewer viewer, Object parentElement, ModelNode node, boolean direct) {
			if (modelNameFilter != null || modelDescFilter != null || modelAttrFilter != null || modelTypeFilter != null) {
				if (!node.select(modelNameFilter, modelDescFilter, modelAttrFilter, modelTypeFilter)) {
					return false;
				}
			}
			for (DMDLTreeData child : node.getChildren()) {
				if (select(viewer, node, (PropertyNode) child, false)) {
					return true;
				}
			}
			return false;
		}

		private boolean select(Viewer viewer, Object parentElement, PropertyNode node, boolean direct) {
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
				selectAuto();
			}
		});
	}

	public void registerModelFilter(final Text nameText, final Text descText, final Text attrText, final Combo typeCombo) {
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelNameFilter = DMDLStringUtil.getNamePattern(nameText.getText());
				refresh();
				expandToLevel(2);
				selectAuto();
			}
		});
		descText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelDescFilter = DMDLStringUtil.getPattern(descText.getText());
				refresh();
				expandToLevel(2);
				selectAuto();
			}
		});
		attrText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				modelAttrFilter = DMDLStringUtil.getPattern(attrText.getText());
				refresh();
				expandToLevel(2);
				selectAuto();
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
				selectAuto();
			}
		});
	}

	public void registerPropertyFilter(final Text nameText, final Text descText, final Text attrText) {
		nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propNameFilter = DMDLStringUtil.getNamePattern(nameText.getText());
				refresh();
				expandAll();
				selectAuto();
			}
		});
		descText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propescFilter = DMDLStringUtil.getPattern(descText.getText());
				refresh();
				expandAll();
				selectAuto();
			}
		});
		attrText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				propAttrFilter = DMDLStringUtil.getPattern(attrText.getText());
				refresh();
				expandAll();
				selectAuto();
			}
		});
	}

	protected void selectAuto() {
		if (!autoSelection) {
			return;
		}

		ITreeSelection selection = getSelection();
		if (!selection.isEmpty()) {
			return;
		}

		Item expand = null;
		loop: for (Widget widget = getControl(); widget != null;) {
			Item[] children = getChildren(widget);
			for (Item item : children) {
				if (getExpanded(item)) {
					widget = item;
					continue loop;
				}
				expand = item;
				break;
			}
			break;
		}
		if (expand != null) {
			setSelection(Arrays.asList(expand));
		}
		updateSelection(getSelection());
	}

	public ModelDefinition findModel(String modelName) {
		ModelNode node = findModelNode(modelName);
		if (node != null) {
			return node.getData();
		}
		return null;
	}

	public ModelNode findModelNode(String modelName) {
		List<DMDLTreeData> list = getInput();
		return findModelNode(list, modelName);
	}

	private ModelNode findModelNode(List<DMDLTreeData> list, String modelName) {
		if (list == null) {
			return null;
		}
		for (DMDLTreeData node : list) {
			if (node instanceof FileNode) {
				ModelNode model = findModelNode(node.getChildren(), modelName);
				if (model != null) {
					return model;
				}
			}
			if (node instanceof ModelNode) {
				ModelDefinition model = (ModelDefinition) node.getData();
				if (model.getName().equals(modelName)) {
					return (ModelNode) node;
				}
			}
		}
		return null;
	}

	public PropertyNode findPropertyNode(String modelName, String propertyName) {
		ModelNode mnode = findModelNode(modelName);
		if (mnode == null) {
			return null;
		}

		for (DMDLTreeData node : mnode.getChildren()) {
			PropertyNode pnode = (PropertyNode) node;
			if (propertyName.equals(pnode.getData().getName())) {
				return pnode;
			}
		}

		return null;
	}

	public List<ModelNode> getCheckedModelList() {
		List<ModelNode> list = new ArrayList<ModelNode>();
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

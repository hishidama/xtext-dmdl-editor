package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DataModelPreviewDialog;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeDataTransfer;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public abstract class CreateDataModelPage<R extends DataModelRow> extends WizardPage {
	private DataModelType type;
	protected IProject project;
	protected String modelName;
	protected String modelDescription;
	private String modelAttribute;

	protected List<R> defineList = new ArrayList<R>();

	protected DataModelTreeViewer sourceViewer;
	protected TableViewer tableViewer;
	private Button copyButton;
	private Button defCopyButton;
	private Button referenceButton;
	private List<Button> selectionButtonList = new ArrayList<Button>();

	public CreateDataModelPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName);
		setTitle(pageTitle);
		setDescription(pageDescription);
	}

	protected String getSourceLabelText() {
		return "参考データモデル";
	}

	protected String getTargetLabelText() {
		return "データモデル定義";
	}

	public void setDataModelType(DataModelType type) {
		this.type = type;
	}

	public DataModelType getDataModelType() {
		return type;
	}

	public void setProject(IProject project) {
		this.project = project;
		if (sourceViewer != null) {
			setInput();
		}
	}

	protected abstract void setInput();

	public void setModelName(String name, String description) {
		this.modelName = name;
		this.modelDescription = description;
	}

	public void setModelAttribute(String attribute) {
		this.modelAttribute = attribute;
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(3, false));
		}
		{
			Label label1 = new Label(composite, SWT.NONE);
			label1.setText(getSourceLabelText());
			Label label2 = new Label(composite, SWT.NONE);
			label2.setText(""); // dummy
			Label label3 = new Label(composite, SWT.NONE);
			label3.setText(getTargetLabelText());
		}

		{
			sourceViewer = new DataModelTreeViewer(composite, SWT.BORDER | SWT.MULTI, true);
			GridData grid = new GridData(GridData.FILL_BOTH);
			sourceViewer.getTree().setLayoutData(grid);
			sourceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					ITreeSelection selection = (ITreeSelection) event.getSelection();
					doSelectionChange(selection);
				}
			});
			sourceViewer.addDoubleClickListener(new IDoubleClickListener() {
				public void doubleClick(DoubleClickEvent event) {
					ITreeSelection selection = (ITreeSelection) event.getSelection();
					doSelectionChange(selection);
					if (copyButton.isEnabled()) {
						doCopy();
					}
				}
			});
		}
		{
			Composite column = new Composite(composite, SWT.NONE);
			column.setLayout(new GridLayout(1, true));
			{
				Button button = new Button(column, SWT.NONE);
				button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				button.setText("copy->");
				button.setToolTipText(getCopyToolTipText());
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doCopy();
					}
				});
				copyButton = button;
			}
			if (visibleReference()) {
				Button button = new Button(column, SWT.NONE);
				button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				button.setText("reference->");
				button.setToolTipText(getReferenceToolTipText());
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doReference();
					}
				});
				referenceButton = button;
			}
			if (visibleDefCopy()) {
				Button button = new Button(column, SWT.NONE);
				button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				button.setText("def copy->");
				button.setToolTipText(getDefCopyToolTipText());
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doDefCopy();
					}
				});
				defCopyButton = button;
			}
		}
		{
			Composite column = new Composite(composite, SWT.NONE);
			{
				column.setLayoutData(new GridData(GridData.FILL_BOTH));
				GridLayout layout = new GridLayout(1, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				column.setLayout(layout);
			}

			createTableViewer(column);

			Composite field = new Composite(column, SWT.NONE);
			field.setLayoutData(new GridData(SWT.LEFT, SWT.END, true, false));
			GridLayout layout = new GridLayout(6, true);
			layout.marginWidth = 0;
			layout.marginHeight = 0;
			field.setLayout(layout);

			createButton(field, "add", false, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doAdd();
				}
			});
			createButton(field, "edit", true, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doEdit();
				}
			});
			createButton(field, "up", true, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doMove(-1);
				}
			});
			createButton(field, "down", true, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doMove(+1);
				}
			});
			createButton(field, "delete", true, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doRemove();
				}
			});
			createButton(field, "preview", false, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doPreview();
				}
			});
			refreshSelectionButton();
		}

		doSelectionChange(null);
		validate(false);
		setControl(composite);
	}

	private Button createButton(Composite field, String text, boolean select, SelectionListener listener) {
		Button button = new Button(field, SWT.PUSH);
		button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		button.setText(text);
		button.addSelectionListener(listener);
		if (select) {
			selectionButtonList.add(button);
		}
		return button;
	}

	protected List<String> cprops = new ArrayList<String>();

	private void createTableViewer(Composite column) {
		tableViewer = new TableViewer(column, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new ModelContentProvider());
		tableViewer.setLabelProvider(new ModelLabelProvider());
		tableViewer.setInput(defineList);
		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		defineColumns(table);

		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				refreshSelectionButton();
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				doEdit();
			}
		});

		tableViewer.setColumnProperties(cprops.toArray(new String[cprops.size()]));

		int operations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_DEFAULT;
		Transfer[] transferTypes = { DMDLTreeDataTransfer.getInstance() };
		tableViewer.addDropSupport(operations, transferTypes, new DropTargetAdapter() {
			@Override
			public void dragEnter(DropTargetEvent event) {
				if (DMDLTreeDataTransfer.getInstance().isSupportedType(event.currentDataType)) {
					ITreeSelection selection = (ITreeSelection) event.data;
					if (selection == null) {
						selection = sourceViewer.getSelection();
					}
					if (enableCopy(selection)) {
						event.detail = DND.DROP_COPY;
					} else {
						event.detail = DND.DROP_NONE;
					}
				}
			}

			@Override
			public void drop(DropTargetEvent event) {
				if (DMDLTreeDataTransfer.getInstance().isSupportedType(event.currentDataType)) {
					int index = -1;
					{
						DropTarget target = (DropTarget) event.widget;
						Table table = (Table) target.getControl();
						Point point = event.display.map(null, table, event.x, event.y);
						TableItem item = table.getItem(point);
						if (item != null) {
							index = table.indexOf(item);
						}
					}

					ITreeSelection selection = (ITreeSelection) event.data;
					doCopy(selection, index);
				}
			}
		});
	}

	protected abstract void defineColumns(Table table);

	protected final void addColumn(String text, int width, String propName) {
		Table table = tableViewer.getTable();
		TableColumn column = new TableColumn(table, SWT.NONE);
		column.setText(text);
		column.setWidth(width);

		cprops.add(propName);
	}

	public static Map<String, Integer> getComboIndexMap(Map<String, Integer> map, String[] list) {
		if (map == null) {
			map = new HashMap<String, Integer>();
			int i = 0;
			for (String s : list) {
				map.put(s, i++);
			}
		}
		return map;
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			if (sourceViewer.getInput() == null) {
				setInput();
			}
		}
		doVisible(visible);
		super.setVisible(visible);
	}

	protected void doVisible(boolean visible) {
		// do override
	}

	private class ModelLabelProvider extends CellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			@SuppressWarnings("unchecked")
			R row = (R) cell.getElement();
			String value = row.getText(cell.getColumnIndex());
			cell.setText(value);
		}
	}

	protected static class ModelContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			List<?> list = (List<?>) inputElement;
			return list.toArray();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}
	}

	void refreshSelectionButton() {
		boolean enable = !tableViewer.getSelection().isEmpty();
		for (Button button : selectionButtonList) {
			button.setEnabled(enable);
		}
	}

	void doAdd() {
		int index = tableViewer.getTable().getSelectionIndex();
		doAdd(index);
	}

	protected void doAdd(int index) {
		R row = newAddRow();
		if (!doEditDialog(row)) {
			return;
		}

		if (index < 0) {
			defineList.add(row);
			index = defineList.size() - 1;
		} else {
			defineList.add(index, row);
		}
		tableViewer.refresh();
		validate(true);

		Table table = tableViewer.getTable();
		table.setSelection(index);
		table.showSelection();
		refreshSelectionButton();
	}

	protected abstract R newAddRow();

	void doEdit() {
		int index = tableViewer.getTable().getSelectionIndex();
		if (index < 0 || index >= defineList.size()) {
			return;
		}
		R row = defineList.get(index);
		if (!doEditDialog(row)) {
			return;
		}
		tableViewer.refresh();
		validate(true);
	}

	protected abstract boolean doEditDialog(R row);

	protected void doRemove() {
		int[] index = tableViewer.getTable().getSelectionIndices();
		for (int i = index.length - 1; i >= 0; i--) {
			defineList.remove(index[i]);
		}
		tableViewer.refresh();
		validate(true);
	}

	void doMove(int z) {
		Table table = tableViewer.getTable();
		int[] index = table.getSelectionIndices();

		Set<R> set = new HashSet<R>();
		for (int i : index) {
			set.add(defineList.get(i));
		}

		int start;
		if (z < 0) {
			start = 0;
		} else {
			start = index.length - 1;
		}

		int[] newIndex = new int[index.length];
		for (int i = start; 0 <= i && i < index.length; i -= z) {
			int s = index[i];
			int t = s + z;
			if (t < 0 || t >= defineList.size()) {
				newIndex[i] = s;
				continue;
			}
			if (set.contains(defineList.get(t))) {
				newIndex[i] = s;
				continue;
			}
			swap(defineList, s, t);
			newIndex[i] = t;
		}
		tableViewer.refresh();
		validate(true);

		table.setSelection(newIndex);
		table.showSelection();
	}

	private void swap(List<R> list, int s, int t) {
		R sr = list.get(s);
		R tr = list.get(t);
		list.set(t, sr);
		list.set(s, tr);
	}

	protected void doSelectionChange(ITreeSelection selection) {
		boolean copy = false;
		boolean defc = false;
		boolean refe = false;

		if (selection != null) {
			for (@SuppressWarnings("unchecked")
			Iterator<DMDLTreeData> i = selection.iterator(); i.hasNext();) {
				DMDLTreeData data = i.next();
				Object obj = data.getData();
				if (obj instanceof ModelDefinition) {
					ModelDefinition model = (ModelDefinition) obj;
					copy |= enableCopy(model, null);
					defc |= enableDefCopy(model, null);
					refe |= enableReference(model, null);
				} else if (obj instanceof Property) {
					ModelDefinition model = (ModelDefinition) data.getParent().getData();
					Property prop = (Property) obj;
					copy |= enableCopy(model, prop);
					defc |= enableDefCopy(model, prop);
					refe |= enableReference(model, prop);
				}
			}
		}

		copyButton.setEnabled(copy);
		if (defCopyButton != null) {
			defCopyButton.setEnabled(defc);
		}
		if (referenceButton != null) {
			referenceButton.setEnabled(refe);
		}
	}

	boolean enableCopy(ITreeSelection selection) {
		boolean copy = false;

		for (@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> i = selection.iterator(); i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				copy |= enableCopy(model, null);
			} else if (obj instanceof Property) {
				ModelDefinition model = (ModelDefinition) data.getParent().getData();
				Property prop = (Property) obj;
				copy |= enableCopy(model, prop);
			}
		}

		return copy;
	}

	protected abstract String getCopyToolTipText();

	protected abstract boolean enableCopy(ModelDefinition model, Property prop);

	void doCopy() {
		ITreeSelection selection = sourceViewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		int index = tableViewer.getTable().getSelectionIndex();
		doCopy(selection, index);
	}

	protected void doCopy(ITreeSelection selection, int index) {
		@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> iterator = selection.iterator();
		doCopy(index, iterator);
		tableViewer.refresh();
		validate(true);
	}

	protected abstract void doCopy(int index, Iterator<DMDLTreeData> iterator);

	protected abstract R newCopyRow(ModelDefinition model, Property prop);

	protected boolean visibleDefCopy() {
		return false; // do override
	}

	protected String getDefCopyToolTipText() {
		return null; // do override
	}

	protected boolean enableDefCopy(ModelDefinition model, Property prop) {
		return false; // do override
	}

	void doDefCopy() {
		ITreeSelection selection = sourceViewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		int index = tableViewer.getTable().getSelectionIndex();
		doDefCopy(selection, index);
	}

	protected void doDefCopy(ITreeSelection selection, int index) {
		@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> iterator = selection.iterator();
		doDefCopy(index, iterator);
		tableViewer.refresh();
		validate(true);
	}

	protected void doDefCopy(int index, Iterator<DMDLTreeData> iterator) {
		for (Iterator<DMDLTreeData> i = iterator; i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				List<EObject> properties = ModelUtil.getRawProperties(model);
				for (EObject object : properties) {
					if (object instanceof Property) {
						Property p = (Property) object;
						R row = newDefCopyRow(model, p, false);
						index = addToList(index, row);
					} else if (object instanceof ModelReference) {
						ModelReference ref = (ModelReference) object;
						R row = newReferenceRow(ref.getName(), null);
						index = addToList(index, row);
					}
				}
			} else if (obj instanceof Property) {
				Property p = (Property) obj;
				ModelDefinition model = (ModelDefinition) data.getParent().getData();
				R row = newDefCopyRow(model, p, false);
				index = addToList(index, row);
			}
		}
	}

	protected abstract R newDefCopyRow(ModelDefinition model, Property prop, boolean copyAttribute);

	protected boolean visibleReference() {
		return true; // do override
	}

	protected String getReferenceToolTipText() {
		return null; // do override
	}

	protected boolean enableReference(ModelDefinition model, Property prop) {
		return false; // do override
	}

	protected void doReference() {
		ITreeSelection selection = sourceViewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		int index = tableViewer.getTable().getSelectionIndex();
		for (Iterator<?> i = selection.iterator(); i.hasNext();) {
			R row = null;
			DMDLTreeData data = (DMDLTreeData) i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				row = newReferenceRow(model, null);
			} else if (obj instanceof Property) {
				ModelDefinition model = (ModelDefinition) data.getParent().getData();
				Property p = (Property) obj;
				row = newReferenceRow(model, p);
			}
			if (row != null) {
				index = addToList(index, row);
			}
		}
		tableViewer.refresh();
		validate(true);
	}

	protected R newReferenceRow(ModelDefinition model, Property prop) {
		return null; // do override
	}

	protected final int addToList(int index, R row) {
		if (index < 0) {
			defineList.add(row);
		} else {
			defineList.add(index++, row);
		}
		return index;
	}

	void doPreview() {
		String text = getDataModelText();
		DataModelPreviewDialog dialog = new DataModelPreviewDialog(getShell(), "DataModel preview");
		dialog.setText(text);
		dialog.open();
	}

	protected void validate(boolean setError) {
		setPageComplete(false);

		if (defineList.isEmpty()) {
			String message = getDefineEmptyMessage();
			if (message != null) {
				if (setError) {
					setErrorMessage(message);
				}
				return;
			}
		}
		int line = 1;
		for (R row : defineList) {
			String message = row.validate();
			if (message != null) {
				if (setError) {
					setErrorMessage(MessageFormat.format("{0}（{1}行目）", message, line));
				}
				return;
			}
			line++;
		}

		String message = validateOther();
		if (message != null) {
			if (setError) {
				setErrorMessage(message);
			}
			return;
		}

		setErrorMessage(null);
		setPageComplete(true);
	}

	protected String getDefineEmptyMessage() {
		return "データモデルのプロパティーを追加して下さい。";
	}

	protected String validateOther() {
		return null; // override
	}

	public final String getDataModelText() {
		DataModelTextGenerator gen = new DataModelTextGenerator();
		gen.setModelType(getModelType());
		gen.setModelName(modelName);
		gen.setModelDescription(modelDescription);
		gen.setModelAttribute(modelAttribute);

		Table table = tableViewer.getTable();
		TableItem[] items = table.getItems();
		setGenerator(gen, items);

		return gen.getText();
	}

	protected abstract String getModelType();

	protected void setGenerator(DataModelTextGenerator gen, TableItem[] items) {
		for (TableItem item : items) {
			@SuppressWarnings("unchecked")
			R row = (R) item.getData();
			setGeneratorProperty(gen, row);
		}
	}

	protected abstract void setGeneratorProperty(DataModelTextGenerator gen, R row);

	public List<? extends DataModelRow> getDefinedPropertyList() {
		return defineList;
	}
}

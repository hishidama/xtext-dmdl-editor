package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DataModelPreviewDialog;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeDataTransfer;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;
import jp.hishidama.xtext.dmdl_editor.validation.ErrorStatus;
import jp.hishidama.xtext.dmdl_editor.validation.WarningStatus;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
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
import org.eclipse.swt.widgets.TableItem;

public abstract class CreateDataModelPage<R extends DataModelRow> extends WizardPage {
	protected String[] sourceModels;
	private DataModelType type;
	protected IProject project;
	protected String modelName;
	protected String modelDescription;
	private String modelAttribute;

	protected DataModelTreeViewer sourceViewer;
	private DataModelTable table;
	protected TableViewer tableViewer;
	private Button copyButton;
	private Button defCopyButton;
	private Button referenceButton;

	public CreateDataModelPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName);
		setTitle(pageTitle);
		setDescription(pageDescription);
	}

	public void setSourceModels(String[] models) {
		this.sourceModels = models;
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
			Composite panel = new Composite(composite, SWT.NONE);
			{
				panel.setLayoutData(new GridData(GridData.FILL_BOTH));

				GridLayout layout = new GridLayout(2, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				layout.horizontalSpacing = 0;
				panel.setLayout(layout);
			}

			sourceViewer = new DataModelTreeViewer(panel, SWT.BORDER | SWT.MULTI, 256 + 128, 128, true);
			GridData grid = new GridData(GridData.FILL_BOTH);
			grid.heightHint = 192;
			grid.horizontalSpan = 2;
			sourceViewer.setLayoutData(grid);
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

			createSourceViewerFilterField(panel);
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
			layout.horizontalSpacing = 0;
			field.setLayout(layout);

			table.createButtonArea(field);
			createButton(field, "preview", false, new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doPreview();
				}
			});
			createOtherButton(field);
			table.refresh();
		}

		doSelectionChange(null);
		validate(false);
		setControl(composite);
	}

	protected void createSourceViewerFilterField(Composite panel) {
		sourceViewer.createFilterField(panel, GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
	}

	protected final Button createButton(Composite field, String text, boolean select, SelectionListener listener) {
		Button button = table.createPushButton(field, text, select);
		button.addSelectionListener(listener);
		return button;
	}

	protected void createOtherButton(Composite field) {
		// do override
	}

	private void createTableViewer(Composite column) {
		table = new DataModelTable(column);
		tableViewer = table.getTableViewer();
		defineColumns();
	}

	protected class DataModelTable extends ModifiableTable<R> {

		public DataModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);

			int operations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_DEFAULT;
			Transfer[] transferTypes = { DMDLTreeDataTransfer.getInstance() };
			viewer.addDropSupport(operations, transferTypes, new DropTargetAdapter() {
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

		@Override
		protected Button createPushButton(Composite parent, String text) {
			Button button = super.createPushButton(parent, text);
			button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			return button;
		}

		public Button createPushButton(Composite parent, String text, boolean select) {
			Button button = createPushButton(parent, text);
			if (select) {
				selectionButton.add(button);
			}
			return button;
		}

		@Override
		protected String getText(R element, int columnIndex) {
			return element.getText(columnIndex);
		}

		@Override
		protected void doAdd() {
			R row = createElement();
			if (doEditDialog(row)) {
				super.doAdd(row);
			}
		}

		@Override
		protected R createElement() {
			return newAddRow();
		}

		@Override
		protected void editElement(R element) {
			doEditDialog(element);
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	protected abstract void defineColumns();

	protected final void addColumn(String text, int width) {
		table.addColumn(text, width, SWT.NONE);
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

	protected abstract R newAddRow();

	protected abstract boolean doEditDialog(R row);

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
		int index = table.getSelectionIndex();
		doCopy(selection, index);
	}

	protected void doCopy(ITreeSelection selection, int index) {
		@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> iterator = selection.iterator();
		doCopy(index, iterator);
		table.refresh();
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
		int index = table.getSelectionIndex();
		doDefCopy(selection, index);
	}

	protected void doDefCopy(ITreeSelection selection, int index) {
		@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> iterator = selection.iterator();
		doDefCopy(index, iterator);
		table.refresh();
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
						R row = newReferenceModel(model, ref.getName());
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
		int index = table.getSelectionIndex();
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
		table.refresh();
		validate(true);
	}

	protected R newReferenceModel(ModelDefinition model, ModelDefinition refModel) {
		return newReferenceRow(refModel, null);
	}

	protected R newReferenceRow(ModelDefinition model, Property prop) {
		return null; // do override
	}

	protected final int addToList(int index, R row) {
		List<R> defineList = table.getElementList();
		if (index < 0) {
			defineList.add(row);
		} else {
			defineList.add(index++, row);
		}
		return index;
	}

	public void doPreview() {
		String text = getDataModelText();
		DataModelPreviewDialog dialog = new DataModelPreviewDialog(getShell(), "DataModel preview");
		dialog.setText(text);
		dialog.open();
	}

	protected final void validate(boolean setError) {
		IStatus status = doValidate();
		if (status == null) {
			status = Status.OK_STATUS;
		}
		switch (status.getSeverity()) {
		case IStatus.ERROR:
			setPageComplete(false);
			if (setError) {
				setErrorMessage(status.getMessage());
			}
			return;
		case IStatus.WARNING:
			setErrorMessage(null);
			if (setError) {
				setMessage(status.getMessage(), IMessageProvider.WARNING);
			}
			break;
		default:
			setErrorMessage(null);
			setMessage(null, IMessageProvider.WARNING);
			break;
		}

		setPageComplete(true);
	}

	private IStatus doValidate() {
		IStatus warning = null;

		List<R> defineList = table.getElementList();
		if (defineList.isEmpty()) {
			String message = getDefineEmptyMessage();
			if (message != null) {
				return new ErrorStatus(message);
			}
		}
		int line = 1;
		for (R row : defineList) {
			IStatus status = row.validate();
			switch (status.getSeverity()) {
			case IStatus.ERROR: {
				String message = MessageFormat.format("{0}（{1}行目 {2}）", status.getMessage(), line, row.name);
				return new ErrorStatus(message);
			}
			case IStatus.WARNING:
				if (warning == null) {
					String message = MessageFormat.format("{0}（{1}行目 {2}）", status.getMessage(), line, row.name);
					warning = new WarningStatus(message);
				}
				break;
			default:
				break;
			}
			line++;
		}

		String message = validateOther();
		if (message != null) {
			return new ErrorStatus(message);
		}

		return warning;
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

	public List<R> getDefinedPropertyList() {
		return table.getElementList();
	}

	public TableItem[] getTableItems() {
		return table.getItems();
	}
}

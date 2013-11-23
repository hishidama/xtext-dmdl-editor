package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ModifyPropertyAttributePage extends WizardPage {

	private final CreateDataModelPage<?> createPage;
	private final IProject project;
	private ModelDefinition model;
	private List<DataModelRow> propertyList;

	private TableViewer viewer;
	private List<Button> selectionButtonList = new ArrayList<Button>();

	public ModifyPropertyAttributePage(CreateDataModelPage<?> createPage, IProject project) {
		super("ModifyPropertyAttributePage");
		setTitle("プロパティーの属性の指定");
		setDescription("プロパティーの属性の内容を指定して下さい。");
		this.createPage = createPage;
		this.project = project;
	}

	public void setPropertyList(ModelDefinition model, List<? extends DataModelRow> list) {
		this.model = model;
		this.propertyList = new ArrayList<DataModelRow>(list.size());
		for (DataModelRow row : list) {
			if (row.getName() != null) {
				propertyList.add(row);
			}
		}
		if (viewer != null) {
			viewer.setInput(propertyList);
		}
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(1, false));
		setControl(composite);

		viewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		Table table = viewer.getTable();
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		addColumn("name", 128);
		addColumn("description", 128);
		addColumn("type", 96);
		addColumn("attribute", 512);
		viewer.setContentProvider(new ContentProvider());
		viewer.setLabelProvider(new TableLabelProvider());
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				editRow();
			}
		});
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				boolean enable = !event.getSelection().isEmpty();
				for (Button button : selectionButtonList) {
					button.setEnabled(enable);
				}
			}
		});
		if (propertyList != null) {
			viewer.setInput(propertyList);
		}

		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new GridLayout(3, true));
		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("edit");
			button.setToolTipText("プロパティーを編集します。");
			button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					editRow();
				}
			});
			button.setEnabled(false);
			selectionButtonList.add(button);
		}
		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("replace selection");
			button.setToolTipText("選択されたプロパティーを一括設定します。");
			button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					replaceRows();
				}
			});
			button.setEnabled(false);
			selectionButtonList.add(button);
		}
		{
			Button button = new Button(field, SWT.PUSH);
			button.setText("preview");
			button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					createPage.doPreview();
				}
			});
		}
	}

	private void addColumn(String name, int width) {
		Table table = viewer.getTable();
		TableColumn column = new TableColumn(table, SWT.NONE);
		column.setText(name);
		column.setWidth(width);
	}

	private static class ContentProvider implements IStructuredContentProvider {

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object inputElement) {
			List<?> list = (List<?>) inputElement;
			return list.toArray();
		}
	}

	private static class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			DataModelRow row = (DataModelRow) element;
			switch (columnIndex) {
			case 0:
				return row.getName();
			case 1:
				return row.getDescription();
			case 2:
				return row.getDataType();
			case 3:
				return row.getAttribute();
			default:
				throw new UnsupportedOperationException("index=" + columnIndex);
			}
		}
	}

	void editRow() {
		int index = viewer.getTable().getSelectionIndex();
		if (index < 0 || index >= propertyList.size()) {
			return;
		}
		DataModelRow row = propertyList.get(index);
		ModifyPropertyAttributeDialog dialog = new ModifyPropertyAttributeDialog(getShell(), row);
		if (dialog.open() == Window.OK) {
			viewer.refresh();
		}
	}

	void replaceRows() {
		int[] index = viewer.getTable().getSelectionIndices();
		if (index.length <= 0) {
			return;
		}
		List<DataModelRow> list = new ArrayList<DataModelRow>(index.length);
		for (int i : index) {
			list.add(propertyList.get(i));
		}

		SetPropertyAttributeDialog dialog = new SetPropertyAttributeDialog(getShell(), project, model, list);
		if (dialog.open() == Window.OK) {
			viewer.refresh();
		}
	}
}

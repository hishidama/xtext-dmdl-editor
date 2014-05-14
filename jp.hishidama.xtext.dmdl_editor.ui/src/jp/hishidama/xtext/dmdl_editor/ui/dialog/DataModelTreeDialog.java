package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode.ModelTreeNodePredicate;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;

public abstract class DataModelTreeDialog extends EditDialog {
	private IProject project;
	private String name;
	protected DMDLTreeData treeData;

	private DataModelTreeViewer tree;
	private ModelTreeNodePredicate predicate;

	public DataModelTreeDialog(Shell parentShell, IProject project, String windowTitle) {
		super(parentShell, windowTitle);
		this.project = project;
	}

	public void setSummarizeModelOnly() {
		predicate = new ModelTreeNodePredicate() {
			// @Override
			public boolean isAddChildren(ModelDefinition model) {
				return ModelUtil.getSummarizeExpression(model) != null;
			}
		};
	}

	public void setJoinModelOnly() {
		predicate = new ModelTreeNodePredicate() {
			// @Override
			public boolean isAddChildren(ModelDefinition model) {
				return ModelUtil.getJoinExpression(model) != null;
			}
		};
	}

	public void setInitialModel(String name) {
		this.name = name;
	}

	@Override
	protected void createFields(Composite composite) {
		Text ptext = createTextField(composite, "project :");
		ptext.setText(project.getName());
		ptext.setEditable(false);

		final Text filter = createTextField(composite, "filter :");
		filter.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				tree.setFilterText(filter.getText().trim());
			}
		});

		tree = createDataModelTreeField(composite, "data model :");
		tree.setChildrenPredicate(predicate);
		tree.setInputAll(project);
		tree.expandToLevel(getInitialExpandLevel());

		Composite field = new Composite(composite, SWT.NONE);
		{
			GridData grid = GridDataFactory.swtDefaults().span(2, 1).grab(true, false).create();
			field.setLayoutData(grid);
			field.setLayout(new FillLayout(SWT.HORIZONTAL));

			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("expand all");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						tree.expandAll();
					}
				});
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("collapse all");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						tree.collapseAll();
					}
				});
			}
		}

		filter.setFocus();
	}

	private DataModelTreeViewer createDataModelTreeField(Composite composite, String label) {
		createLabel(composite, label);

		DataModelTreeViewer viewer = createDataModelTree(composite);
		return viewer;
	}

	private DataModelTreeViewer createDataModelTree(Composite composite) {
		DataModelTreeViewer viewer = new DataModelTreeViewer(composite, SWT.BORDER | SWT.SINGLE);
		initializeTree(viewer.getTree());

		return viewer;
	}

	protected int getInitialExpandLevel() {
		return 1;
	}

	@Override
	protected void refresh() {
		all: for (TreeItem row : tree.getTree().getItems()) {
			for (TreeItem item : row.getItems()) {
				DMDLTreeData data = (DMDLTreeData) item.getData();
				if (data == null) {
					continue;
				}
				Object obj = data.getData();
				if (obj instanceof ModelDefinition) {
					ModelDefinition model = (ModelDefinition) obj;
					if (model.getName().equals(name)) {
						this.treeData = data;
						tree.getTree().setSelection(item);
						if (expandProperty()) {
							tree.expandToLevel(data, 1);
						}
						break all;
					}
				}
			}
		}
		refreshOkButton();
	}

	protected boolean expandProperty() {
		return false;
	}

	@Override
	protected boolean validate() {
		TreeItem[] select = tree.getTree().getSelection();
		if (select.length != 1) {
			return false;
		}
		TreeItem item = select[0];
		DMDLTreeData data = (DMDLTreeData) item.getData();
		Object obj = data.getData();
		if (!validateData(obj)) {
			return false;
		}

		treeData = data;
		if (obj instanceof ModelDefinition) {
			ModelDefinition model = (ModelDefinition) obj;
			name = model.getName();
		}
		return true;
	}

	protected abstract boolean validateData(Object obj);

	protected final DMDLTreeData getSelectionData() {
		return treeData;
	}
}

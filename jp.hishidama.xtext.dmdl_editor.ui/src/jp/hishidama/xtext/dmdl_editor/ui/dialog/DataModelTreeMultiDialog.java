package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode.ModelTreeNodePredicate;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;

public abstract class DataModelTreeMultiDialog extends EditDialog {
	private IProject project;
	private Set<String> names = new HashSet<String>();
	protected List<DMDLTreeData> treeData = new ArrayList<DMDLTreeData>();

	private DataModelTreeViewer tree;
	private ModelTreeNodePredicate predicate;

	public DataModelTreeMultiDialog(Shell parentShell, IProject project, String windowTitle) {
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

	public void setInitialModel(String... name) {
		names.clear();
		for (String s : names) {
			names.add(s);
		}
	}

	@Override
	protected void createFields(Composite composite) {
		Text ptext = createTextField(composite, "project :");
		ptext.setText(project.getName());
		ptext.setEditable(false);

		Text filter = createTextField(composite, "filter :");

		tree = createDataModelTreeField(composite, "data model :");
		tree.setChildrenPredicate(predicate);
		tree.setInputAll(project);
		tree.expandToLevel(getInitialExpandLevel());
		tree.addFilterListenerTo(filter);

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
		DataModelTreeViewer viewer = new DataModelTreeViewer(composite, SWT.BORDER | SWT.MULTI);
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
					if (names.contains(model.getName())) {
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
		if (select.length < 1) {
			return false;
		}

		treeData.clear();
		names.clear();
		for (TreeItem item : select) {
			DMDLTreeData data = (DMDLTreeData) item.getData();
			treeData.add(data);

			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				names.add(model.getName());
			}
		}
		return true;
	}

	protected final List<DMDLTreeData> getSelectionDataList() {
		return treeData;
	}
}

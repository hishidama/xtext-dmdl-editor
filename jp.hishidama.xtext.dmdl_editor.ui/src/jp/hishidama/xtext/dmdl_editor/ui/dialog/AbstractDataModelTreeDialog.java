package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode.ModelTreeNodePredicate;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;

public abstract class AbstractDataModelTreeDialog extends EditDialog {
	protected final IProject project;

	private boolean joinModelOnly;
	private boolean summarizeModelOnly;

	protected DataModelTreeViewer tree;
	private ModelTreeNodePredicate predicate;

	public AbstractDataModelTreeDialog(Shell parentShell, IProject project, String windowTitle) {
		super(parentShell, windowTitle);
		this.project = project;
	}

	public void setSummarizeModelOnly() {
		this.summarizeModelOnly = true;
		predicate = new ModelTreeNodePredicate() {
			// @Override
			public boolean isAddChildren(ModelDefinition model) {
				return ModelUtil.getSummarizeExpression(model) != null;
			}
		};
	}

	public void setJoinModelOnly() {
		this.joinModelOnly = true;
		predicate = new ModelTreeNodePredicate() {
			// @Override
			public boolean isAddChildren(ModelDefinition model) {
				return ModelUtil.getJoinExpression(model) != null;
			}
		};
	}

	@Override
	protected void createFields(Composite composite) {
		Text ptext = createTextField(composite, "project :");
		ptext.setText(project.getName());
		ptext.setEditable(false);

		tree = createDataModelTreeField(composite, "data model :");
		tree.setChildrenPredicate(predicate);
		tree.setInputAll(project);
		tree.expandToLevel(getInitialExpandLevel());
		tree.createFilterField(composite, GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
		tree.createExpandButtonField(composite, GridDataFactory.swtDefaults().span(2, 1).grab(true, false).create());
	}

	private DataModelTreeViewer createDataModelTreeField(Composite composite, String label) {
		createLabel(composite, label);

		DataModelTreeViewer viewer = createDataModelTree(composite);
		return viewer;
	}

	private DataModelTreeViewer createDataModelTree(Composite composite) {
		DataModelTreeViewer viewer = new DataModelTreeViewer(composite, getDataModelTreeStyle(), 256 + 96, 128);
		if (joinModelOnly) {
			viewer.setJoinModelOnly();
		} else if (summarizeModelOnly) {
			viewer.setSummarizeModelOnly();
		}
		initializeTree(viewer.getTree());

		return viewer;
	}

	protected abstract int getDataModelTreeStyle();

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
					if (isSelectedModel(data, model)) {
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

	protected abstract boolean isSelectedModel(DMDLTreeData data, ModelDefinition model);

	protected boolean expandProperty() {
		return false;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeItem;

public abstract class DataModelTreeDialog extends AbstractDataModelTreeDialog {
	private String name;
	protected DMDLTreeData treeData;

	public DataModelTreeDialog(Shell parentShell, IProject project, String windowTitle) {
		super(parentShell, project, windowTitle);
	}

	public void setInitialModel(String name) {
		this.name = name;
	}

	@Override
	protected int getDataModelTreeStyle() {
		return SWT.BORDER | SWT.SINGLE;
	}

	@Override
	protected boolean isSelectedModel(DMDLTreeData data, ModelDefinition model) {
		if (model.getName().equals(name)) {
			this.treeData = data;
			return true;
		}
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

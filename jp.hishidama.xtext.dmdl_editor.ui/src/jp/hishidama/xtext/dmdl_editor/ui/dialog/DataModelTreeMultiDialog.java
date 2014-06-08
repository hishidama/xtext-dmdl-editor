package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeItem;

public abstract class DataModelTreeMultiDialog extends AbstractDataModelTreeDialog {
	private Set<String> names = new HashSet<String>();
	protected List<DMDLTreeData> treeData = new ArrayList<DMDLTreeData>();

	public DataModelTreeMultiDialog(Shell parentShell, IProject project, String windowTitle) {
		super(parentShell, project, windowTitle);
	}

	public void setInitialModel(String... name) {
		names.clear();
		for (String s : names) {
			names.add(s);
		}
	}

	@Override
	protected int getDataModelTreeStyle() {
		return SWT.BORDER | SWT.MULTI;
	}

	@Override
	protected boolean isSelectedModel(DMDLTreeData data, ModelDefinition model) {
		return names.contains(model.getName());
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

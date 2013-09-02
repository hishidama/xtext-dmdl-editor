package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class DmdlFileSelectionDialog extends DataModelTreeDialog {

	public DmdlFileSelectionDialog(Shell parentShell, IProject project) {
		super(parentShell, project, "DMDLファイル選択");
	}

	@Override
	protected boolean validateData(Object obj) {
		return true;
	}

	public IFile getSelectedFile() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof IFile) {
				return (IFile) obj;
			}
		}
		return null;
	}

	public String getSelectedModelName() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				return ((ModelDefinition) obj).getName();
			}
		}
		return null;
	}
}

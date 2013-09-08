package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class DmdlModelSelectionDialog extends DataModelTreeDialog {

	public DmdlModelSelectionDialog(Shell parentShell, IProject project) {
		super(parentShell, project, "データモデル選択");
	}

	@Override
	protected int getInitialExpandLevel() {
		return 2;
	}

	@Override
	protected boolean validateData(Object obj) {
		return (obj instanceof ModelDefinition) || (obj instanceof Property);
	}

	public ModelDefinition getSelectedDataModel() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				return (ModelDefinition) obj;
			}
		}
		return null;
	}
}

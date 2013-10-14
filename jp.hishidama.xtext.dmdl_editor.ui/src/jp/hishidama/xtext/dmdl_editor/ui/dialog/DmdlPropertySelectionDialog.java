package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class DmdlPropertySelectionDialog extends DataModelTreeDialog {

	public DmdlPropertySelectionDialog(Shell parentShell, IProject project) {
		super(parentShell, project, "プロパティー選択");
	}

	@Override
	protected int getInitialExpandLevel() {
		return 2;
	}

	@Override
	protected boolean expandProperty() {
		return true;
	}

	@Override
	protected boolean validateData(Object obj) {
		return (obj instanceof Property);
	}

	public Property getSelectedProperty() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof Property) {
				return (Property) obj;
			}
		}
		return null;
	}
}

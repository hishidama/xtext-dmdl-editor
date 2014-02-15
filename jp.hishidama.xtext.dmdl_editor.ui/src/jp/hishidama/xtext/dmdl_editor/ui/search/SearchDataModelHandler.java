package jp.hishidama.xtext.dmdl_editor.ui.search;

import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DataModelTreeDialog;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public class SearchDataModelHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = ProjectUtil.getProject(event);
		if (project == null) {
			return false;
		}
		DmdlSelectionDialog dialog = new DmdlSelectionDialog(null, project);
		if (dialog.open() == Window.OK) {
			Object selected = dialog.getSelected();
			if (selected instanceof IFile) {
				FileUtil.openEditor((IFile) selected);
			} else if (selected instanceof EObject) {
				ModelUiUtil.openEditor((EObject) selected);
			}
		}
		return null;
	}

	private static class DmdlSelectionDialog extends DataModelTreeDialog {

		public DmdlSelectionDialog(Shell parentShell, IProject project) {
			super(parentShell, project, "データモデル検索");
		}

		@Override
		protected int getInitialExpandLevel() {
			return 1;
		}

		@Override
		protected boolean validateData(Object obj) {
			return true;
		}

		public Object getSelected() {
			for (DMDLTreeData data = getSelectionData(); data != null;) {
				return data.getData();
			}
			return null;
		}
	}
}

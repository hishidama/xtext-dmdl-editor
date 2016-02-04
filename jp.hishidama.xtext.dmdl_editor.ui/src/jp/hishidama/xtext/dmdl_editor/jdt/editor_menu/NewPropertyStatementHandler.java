package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.eclipse_plugin.util.DocumentUtil;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewPropertyStatementWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;

public class NewPropertyStatementHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof ITextEditor) {
			ISelection selection = ((ITextEditor) editor).getSelectionProvider().getSelection();
			int offset = ((ITextSelection) selection).getOffset();

			IFile file = FileUtil.getFile(editor);
			IDocument document = DocumentUtil.findEditorDocument(file);
			if (document != null) {
				try {
					execute(file.getProject(), document, offset);
				} catch (Exception e) {
					IStatus status = LogUtil.logError("NewPropertyStatementHandler", e);
					ErrorDialog.openError(null, "NewPropertyStatementHandler error", "エラーが発生しました。", status);
				}
			}
		}

		return null;
	}

	private void execute(IProject project, IDocument document, int offset) throws JavaModelException {
		NewPropertyStatementWizard wizard = new NewPropertyStatementWizard();
		wizard.init(project, document, offset);
		WizardDialog dialog = new WizardDialog(null, wizard);
		dialog.open();
	}
}

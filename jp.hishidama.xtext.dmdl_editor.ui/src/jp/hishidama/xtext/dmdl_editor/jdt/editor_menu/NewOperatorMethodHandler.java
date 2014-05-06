package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.eclipse_plugin.util.DocumentUtil;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewOperatorMethodWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;

public class NewOperatorMethodHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof ITextEditor) {
			ISelection selection = ((ITextEditor) editor).getSelectionProvider().getSelection();
			int offset = ((ITextSelection) selection).getOffset();

			IFile file = FileUtil.getFile(editor);
			IDocument document = DocumentUtil.findEditorDocument(file);
			ICompilationUnit cu = JdtUtil.getJavaUnit(file);
			if (document != null && cu != null) {
				try {
					execute(document, cu, offset);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	private void execute(IDocument document, ICompilationUnit cu, int offset) throws JavaModelException {
		IType type = findType(cu, offset);
		if (type == null) {
			return;
		}

		NewOperatorMethodWizard wizard = new NewOperatorMethodWizard();
		wizard.init(document, type, offset);
		WizardDialog dialog = new WizardDialog(null, wizard);
		dialog.open();
	}

	private IType findType(ICompilationUnit cu, int offset) throws JavaModelException {
		for (IType type : cu.getAllTypes()) {
			ISourceRange range = type.getSourceRange();
			if (range.getOffset() <= offset && offset < range.getOffset() + range.getLength()) {
				return type;
			}
		}
		return null;
	}

}

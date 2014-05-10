package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jdt.util.AnnotationUtil;
import jp.hishidama.eclipse_plugin.util.DocumentUtil;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.ModifyFlowpartClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.ModifyJobflowClassWizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;

public class ModifyFlowClassHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof ITextEditor) {
			IFile file = FileUtil.getFile(editor);
			IDocument document = DocumentUtil.findEditorDocument(file);
			ICompilationUnit cu = JdtUtil.getJavaUnit(file);
			if (document != null && cu != null) {
				try {
					execute(document, cu);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	private void execute(IDocument document, ICompilationUnit cu) throws JavaModelException {
		IWizard wizard = findType(document, cu);
		if (wizard == null) {
			MessageDialog.openWarning(null, "error", "選択されているクラスはJobFlowやFlowPartではありません。");
			return;
		}
		WizardDialog dialog = new WizardDialog(null, wizard);
		dialog.open();
	}

	private IWizard findType(IDocument document, ICompilationUnit cu) throws JavaModelException {
		for (IType type : cu.getAllTypes()) {
			if (AnnotationUtil.getAnnotation(type, FlowUtil.JOBFLOW_NAME) != null) {
				ModifyJobflowClassWizard wizard = new ModifyJobflowClassWizard();
				wizard.init(document, type);
				return wizard;
			}
			if (AnnotationUtil.getAnnotation(type, FlowUtil.FLOWPART_NAME) != null) {
				ModifyFlowpartClassWizard wizard = new ModifyFlowpartClassWizard();
				wizard.init(document, type);
				return wizard;
			}
		}
		return null;
	}
}

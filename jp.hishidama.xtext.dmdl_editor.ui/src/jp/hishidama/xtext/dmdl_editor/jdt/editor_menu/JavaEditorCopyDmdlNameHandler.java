package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.DeclaredDmdlHyperlink;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.OpenDeclaredDmdlHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.OpenKeyDmdlHyperlinkDetector;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.ui.editor.copyqualifiedname.ClipboardUtil;

@SuppressWarnings("restriction")
public class JavaEditorCopyDmdlNameHandler extends AbstractHandler {
	private OpenDeclaredDmdlHyperlinkDetector detector = new OpenDeclaredDmdlHyperlinkDetector();
	private OpenKeyDmdlHyperlinkDetector keyDetector = new OpenKeyDmdlHyperlinkDetector();

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ITextEditor editor = (ITextEditor) HandlerUtil.getActiveEditor(event);
		if (editor == null) {
			return null;
		}
		ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
		int offset = selection.getOffset();

		IHyperlink[] links = detector.detectHyperlinks(editor, offset);
		if (links == null || links.length <= 0) {
			links = keyDetector.detectHyperlinks(editor, offset);
		}
		if (links != null && links.length >= 1) {
			DeclaredDmdlHyperlink link = (DeclaredDmdlHyperlink) links[0];
			copyToClipboard(link.getName());
			return null;
		}

		MessageDialog.openInformation(null, "Copy DMDL Name", "No Element to DMDL found in selection.");
		return null;
	}

	private void copyToClipboard(String name) {
		ClipboardUtil.copy(name);
	}
}

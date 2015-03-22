package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.DeclaredDmdlHyperlink;

public class JavaEditorCopyDmdlNameHandler extends JavaEditorCopyDmdlHandler {

	@Override
	protected String getTitle() {
		return "Copy DMDL Name";
	}

	@Override
	protected String getCopyText(DeclaredDmdlHyperlink link) {
		return link.getName();
	}
}

package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.DeclaredDmdlHyperlink;

public class JavaEditorCopyDmdlDescriptionHandler extends JavaEditorCopyDmdlHandler {

	@Override
	protected String getTitle() {
		return "Copy DMDL Description";
	}

	@Override
	protected String getCopyText(DeclaredDmdlHyperlink link) {
		Property property = link.getProperty();
		if (property != null) {
			return PropertyUtil.getDecodedDescription(property);
		}
		ModelDefinition model = link.getModel();
		return ModelUtil.getDecodedDescription(model);
	}
}

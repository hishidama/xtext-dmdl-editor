package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.DeclaredDmdlHyperlink;

public class JavaEditorCopyDmdlJavaNameHandler extends JavaEditorCopyDmdlHandler {

	@Override
	protected String getTitle() {
		return "Copy DMDL Java name";
	}

	@Override
	protected String getCopyText(DeclaredDmdlHyperlink link) {
		Property property = link.getProperty();
		if (property != null) {
			String name = property.getName();
			return StringUtil.toCamelCase(name);
		}
		ModelDefinition model = link.getModel();
		String modelName = model.getName();
		return StringUtil.toCamelCase(modelName);
	}
}

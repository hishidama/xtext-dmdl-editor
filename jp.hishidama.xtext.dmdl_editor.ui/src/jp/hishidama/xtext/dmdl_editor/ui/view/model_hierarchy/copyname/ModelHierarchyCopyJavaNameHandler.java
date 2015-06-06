package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.copyname;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;

public class ModelHierarchyCopyJavaNameHandler extends AbstractModelHierarychyCopyHandler {

	@Override
	protected String getText(ModelProperty property) {
		return StringUtil.toCamelCase(property.getProperty().getName());
	}
}

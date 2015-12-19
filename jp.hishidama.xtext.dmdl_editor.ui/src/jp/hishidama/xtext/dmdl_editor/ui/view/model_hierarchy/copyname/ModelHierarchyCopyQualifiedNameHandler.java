package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.copyname;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;

public class ModelHierarchyCopyQualifiedNameHandler extends AbstractModelHierarchyCopyHandler {

	@Override
	protected String getText(ModelProperty property) {
		String parent = property.getModel().getName();
		String name = property.getProperty().getName();
		return parent + "." + name;
	}
}

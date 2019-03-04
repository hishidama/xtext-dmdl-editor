package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.property;

import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;

public class IndexPropertyDefinition extends IndexProperty implements PropertyDefinition {

	public IndexPropertyDefinition(PropertyDefinition property) {
		super(property);
	}

	private PropertyDefinition property() {
		return (PropertyDefinition) super.property;
	}

	public Type getType() {
		return property().getType();
	}

	public void setType(Type value) {
		property().setType(value);
	}

	public PropertyExpression getExpression() {
		return property().getExpression();
	}

	public void setExpression(PropertyExpression value) {
		property().setExpression(value);
	}
}

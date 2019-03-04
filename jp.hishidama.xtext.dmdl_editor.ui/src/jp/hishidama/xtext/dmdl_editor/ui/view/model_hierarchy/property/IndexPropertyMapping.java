package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.property;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;

public class IndexPropertyMapping extends IndexProperty implements PropertyMapping {

	public IndexPropertyMapping(PropertyMapping property) {
		super(property);
	}

	private PropertyMapping property() {
		return (PropertyMapping) super.property;
	}

	public Property getFrom() {
		return property().getFrom();
	}

	public void setFrom(Property value) {
		property().setFrom(value);
	}
}

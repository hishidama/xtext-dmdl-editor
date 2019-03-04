package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.property;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;

public class IndexPropertyFolding extends IndexProperty implements PropertyFolding {

	public IndexPropertyFolding(PropertyFolding property) {
		super(property);
	}

	private PropertyFolding property() {
		return (PropertyFolding) super.property;
	}

	public String getAggregator() {
		return property().getAggregator();
	}

	public void setAggregator(String value) {
		property().setAggregator(value);
	}

	public Property getFrom() {
		return property().getFrom();
	}

	public void setFrom(Property value) {
		property().setFrom(value);
	}
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;

public class AutoProjectionAttributeCompletion implements DMDLAttributeCompletion {

	// @Override
	public String getCompletionModelAttributeName() {
		return "auto_projection";
	}

	// @Override
	public List<String> getCompletionModelAttributeElementNameList(String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeName(Property property) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementNameList(Property property, String name, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element,
			String elementName, String version) {
		return null;
	}
}

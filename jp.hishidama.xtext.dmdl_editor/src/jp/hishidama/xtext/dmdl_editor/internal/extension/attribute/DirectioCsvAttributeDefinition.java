package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioCsvAttributeDefinition extends DMDLAttributeWizardDefinition implements DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.csv";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.csv");
			attribute.addq("charset", "UTF-8").completionq("UTF-8", "MS932");
			attribute.add("allow_linefeed", "FALSE").completion("TRUE", "FALSE");
			attribute.add("has_header", "FALSE").completion("TRUE", "FALSE");
			attribute.addq("true", "true").completionq("true");
			attribute.addq("false", "false").completionq("false");
			attribute.addq("date", "yyyy-MM-dd").completionq("yyyy-MM-dd");
			attribute.addq("datetime", "yyyy-MM-dd HH:mm:ss").completionq("yyyy-MM-dd HH:mm:ss");
			attribute.addq("compression", "org.apache.hadoop.io.compress.GzipCodec", "0.5.2").completionq(
					"org.apache.hadoop.io.compress.GzipCodec");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			{
				DMDLAttribute a = propertyAttribute.create("directio.csv.field", true);
				a.addq("name", "$(name)");
			}
			propertyAttribute.create("directio.csv.ignore", false);
			propertyAttribute.create("directio.csv.file_name", false).dataType("TEXT");
			propertyAttribute.create("directio.csv.line_number", false).dataType("INT", "LONG");
			propertyAttribute.create("directio.csv.record_number", false).dataType("INT", "LONG");
		}
		return propertyAttribute;
	}

	@Override
	public String getAddModelAttribute(String version) {
		return getModelAttribute().getAddAttribute(version);
	}

	@Override
	public String getAddPropertyAttribute(String version) {
		return getPropertyAttributes().getAddAttribute(version);
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return getModelAttribute().getRemoveAttribute();
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		return getPropertyAttributes().getRemoveAttribute();
	}

	// @Override
	public String getCompletionModelAttributeName() {
		return getModelAttribute().getName();
	}

	// @Override
	public List<String> getCompletionModelAttributeElementNameList(String version) {
		return getModelAttribute().getElementNameList(version);
	}

	// @Override
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version) {
		return getModelAttribute().getElementValueList(name, version);
	}

	// @Override
	public List<String> getCompletionPropertyAttributeName(Property property) {
		return getPropertyAttributes().getAttributeNameList(property);
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementNameList(Property property, String name, String version) {
		return getPropertyAttributes().getElementNameList(name, version);
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element,
			String elementName, String version) {
		if ("directio.csv.field".equals(attributeName) && "name".equals(elementName)) {
			return DMDLAttribute.getPropertyNameValueList(element);
		}
		return getPropertyAttributes().getElementValueList(attributeName, elementName, version);
	}
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioHiveOrcAttributeDefinition extends DMDLAttributeWizardDefinition implements
		DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.hive.orc";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.hive.orc");
			attribute.addq("table_name", "$(modelName)");
			attribute.addq("field_mapping", "position").completionq("name", "position");
			attribute.addq("on_missing_source", "logging").completionq("ignore", "logging", "fail");
			attribute.addq("on_missing_target", "logging").completionq("ignore", "logging", "fail");
			attribute.addq("on_incompatible_type", "fail").completionq("ignore", "logging", "fail");
			attribute.addq("format_version", "0.12").completionq("0.11", "0.12");
			attribute.addq("compression", "snappy").completionq("none", "zlib", "snappy", "lzo");
			attribute.add("stripe_size", "67108864").completion("67108864");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			{
				DMDLAttribute a = propertyAttribute.create("directio.hive.field", true);
				a.addq("name", "$(name)");
			}
			propertyAttribute.create("directio.hive.string", false).dataType("DECIMAL", "DATE", "DATETIME");
			{
				DMDLAttribute a = propertyAttribute.create("directio.hive.decimal", false).dataType("DECIMAL");
				a.add("precision", "38").completion("1", "38");
				a.add("scale", "38").completion("0", "38");
			}
			propertyAttribute.create("directio.hive.timestamp", false).dataType("DATE");
			{
				DMDLAttribute a = propertyAttribute.create("directio.hive.char", false).dataType("TEXT");
				a.add("length", "256").completion("1", "256");
			}
			{
				DMDLAttribute a = propertyAttribute.create("directio.hive.varchar", false).dataType("TEXT");
				a.add("length", "65536").completion("1", "65536");
			}
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
		if ("table_name".equals(name)) {
			return DMDLAttribute.getModelNameValueList(element);
		}
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
		if ("directio.hive.field".equals(attributeName) && "name".equals(elementName)) {
			return DMDLAttribute.getPropertyNameValueList(element);
		}
		return getPropertyAttributes().getElementValueList(attributeName, elementName, version);
	}
}

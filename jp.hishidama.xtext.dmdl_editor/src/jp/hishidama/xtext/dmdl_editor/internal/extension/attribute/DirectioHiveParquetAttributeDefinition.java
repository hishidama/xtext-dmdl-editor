package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioHiveParquetAttributeDefinition extends DMDLAttributeWizardDefinition implements
		DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.hive.parquet";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.hive.parquet");
			attribute.addq("table_name", "$(modelName)");
			attribute.addq("field_mapping", "position").completionq("name", "position");
			attribute.addq("on_missing_source", "logging").completionq("ignore", "logging", "fail");
			attribute.addq("on_missing_target", "logging").completionq("ignore", "logging", "fail");
			attribute.addq("on_incompatible_type", "fail").completionq("ignore", "logging", "fail");
			attribute.addq("format_version", "v1").completionq("v1", "v2");
			attribute.addq("compression", "snappy").completionq("uncompressed", "gzip", "snappy", "lzo");
			attribute.add("block_size", "134217728").completion("134217728");
			attribute.add("data_page_size", "1048576").completion("1048576");
			attribute.add("dictionary_page_size", "1048576").completion("1048576");
			attribute.add("enable_dictionary", "TRUE").completion("TRUE", "FALSE");
			attribute.add("enable_validation", "FALSE").completion("TRUE", "FALSE");
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

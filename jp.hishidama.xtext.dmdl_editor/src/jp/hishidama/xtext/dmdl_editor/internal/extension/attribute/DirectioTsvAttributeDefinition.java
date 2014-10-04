package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioTsvAttributeDefinition extends DMDLAttributeWizardDefinition implements DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.tsv";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.tsv", "Direct I/O TSVファイル");
			attribute.addq("charset", "ファイルの文字エンコーディング", "UTF-8").completionq("UTF-8", "MS932");
			attribute.add("has_header", "ヘッダー行を使うかどうか", "FALSE").completion("TRUE", "FALSE").version("0.5.3");
			attribute
					.addq("compression", "ファイルの圧縮形式", "gzip")
					.completionq("gzip", "org.apache.hadoop.io.compress.DefaultCodec",
							"org.apache.hadoop.io.compress.GzipCodec").version("0.5.2");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			{
				DMDLAttribute a = propertyAttribute.create("directio.tsv.field", "TSV フィールド名", true);
				a.addq("name", "フィールド名", "$(name)");
			}
			propertyAttribute.create("directio.tsv.ignore", "無視するフィールド", false);
			propertyAttribute.create("directio.tsv.file_name", "ファイル名", false).dataType("TEXT");
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
		if ("directio.tsv.field".equals(attributeName) && "name".equals(elementName)) {
			return DMDLAttribute.getPropertyNameValueList(element);
		}
		return getPropertyAttributes().getElementValueList(attributeName, elementName, version);
	}

	// @Override
	public String getAttributeTooltip(Attribute attribute, String name) {
		String s = getModelAttribute().getAttributeTooltip(attribute, name);
		if (s != null) {
			return s;
		}
		return getPropertyAttributes().getAttributeTooltip(attribute, name);
	}

	// @Override
	public String getElementTooltip(String attributeName, AttributeElement element, String elementName) {
		String s = getModelAttribute().getElementTooltip(attributeName, element, elementName);
		if (s != null) {
			return s;
		}
		return getPropertyAttributes().getElementTooltip(attributeName, element, elementName);
	}
}

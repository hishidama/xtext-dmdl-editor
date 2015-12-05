package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioLineAttributeDefinition extends DMDLAttributeWizardDefinition implements DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.line";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.line", "Direct I/O テキストファイル");
			attribute.addq("charset", "ファイルの文字エンコーディング", "UTF-8").completionq("UTF-8", "MS932");
			attribute.addq("compression", "ファイルの圧縮形式", "gzip").completionq("gzip",
					"org.apache.hadoop.io.compress.DefaultCodec", "org.apache.hadoop.io.compress.GzipCodec");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			propertyAttribute.create("directio.line.body", "テキストデータ", true).dataType("TEXT");
			propertyAttribute.create("directio.line.file_name", "ファイル名", false).dataType("TEXT");
			propertyAttribute.create("directio.line.line_number", "テキスト行番号（1起算）", false).dataType("INT", "LONG");
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

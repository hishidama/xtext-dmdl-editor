package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
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
			attribute = new DMDLAttribute("directio.csv", "Direct I/O CSVファイル");
			attribute.addq("charset", "ファイルの文字エンコーディング", "UTF-8").completionq("UTF-8", "MS932");
			attribute.add("allow_linefeed", "値の中に改行を入れられるかどうか", "FALSE").completion("TRUE", "FALSE");
			attribute.add("has_header", "ヘッダー行を使うかどうか", "FALSE").completion("TRUE", "FALSE");
			attribute.add("force_header", "ヘッダー行（形式チェックを行わない）を使うかどうか", "FALSE").completion("TRUE", "FALSE")
					.version("0.7.3");
			attribute.addq("true", "TRUE値の表現形式", "true").completionq("true");
			attribute.addq("false", "FALSE値の表現形式", "false").completionq("false");
			attribute.addq("date", "DATE型の表現形式", "yyyy-MM-dd").completionq("yyyy-MM-dd");
			attribute.addq("datetime", "DATETIME型の表現形式", "yyyy-MM-dd HH:mm:ss").completionq("yyyy-MM-dd HH:mm:ss");
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
				DMDLAttribute a = propertyAttribute.create("directio.csv.field", "CSV フィールド名", true);
				a.addq("name", "フィールド名", "$(name)");
			}
			propertyAttribute.create("directio.csv.ignore", "無視するフィールド", false);
			propertyAttribute.create("directio.csv.file_name", "ファイル名", false).dataType("TEXT");
			propertyAttribute.create("directio.csv.line_number", "テキスト行番号（1起算）", false).dataType("INT", "LONG");
			propertyAttribute.create("directio.csv.record_number", "レコード番号（1起算）", false).dataType("INT", "LONG");
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

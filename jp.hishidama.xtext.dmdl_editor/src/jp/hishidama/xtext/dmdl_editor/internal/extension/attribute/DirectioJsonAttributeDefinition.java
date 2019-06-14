package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

// https://github.com/asakusafw/asakusafw/tree/master/directio-project/asakusa-directio-dmdl/src/main/java/com/asakusafw/dmdl/directio/json/driver
public class DirectioJsonAttributeDefinition extends DMDLAttributeWizardDefinition implements DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "directio.json";
	}

	private DMDLAttribute attribute;

	private DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.json", "Direct I/O JSONファイル");
			attribute.add("format", "入力ファイルのJSON形式", "json").completion("json", "jsonl");
			attribute.addq("charset", "ファイルの文字エンコーディング", "UTF-8").completionq("UTF-8", "MS932");
			attribute.addq("compression", "ファイルの圧縮形式", "gzip").completionq("gzip", "org.apache.hadoop.io.compress.DefaultCodec", "org.apache.hadoop.io.compress.GzipCodec");
			attribute.add("line_separator", "【出力時】レコード間を区切る改行文字の種類", "unix").completion("unix", "windows");
			fieldAttribute(attribute);
			attribute.add("on_unknown_input", "【入力時】未対応のキー文字列が検出された場合の動作", "error").completion("error", "report", "ignore");
		}
		return attribute;
	}

	private void fieldAttribute(DMDLAttribute attribute) {
		attribute.addq("date_format", "DATEの形式", "yyyy-MM-dd").completionq("yyyy-MM-dd");
		attribute.addq("datetime_format", "DATETIMEの形式", "yyyy-MM-dd HH:mm:ss").completionq("yyyy-MM-dd HH:mm:ss");
		attribute.add("null_style", "【出力時】対象プロパティーがnullだった場合の出力内容", "value").completion("value", "absent");
		attribute.add("on_malformed_input", "【入力時】不正な値検出された場合の動作", "error").completion("error", "report", "ignore");
		attribute.add("on_missing_input", "【入力時】対応するキー文字列が出現しなかった場合の動作", "ignore").completion("error", "report", "ignore");
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			{
				DMDLAttribute a = propertyAttribute.create("directio.json.field", "JSON フィールド名", true);
				a.addq("name", "フィールド名", "$(name)");
				fieldAttribute(a);
			}
			propertyAttribute.create("directio.json.ignore", "無視するフィールド", false);
			propertyAttribute.create("directio.json.file_name", "ファイル名", false).dataType("TEXT");
			propertyAttribute.create("directio.json.line_number", "テキスト行番号（1起算）", false).dataType("INT", "LONG");
			propertyAttribute.create("directio.json.record_number", "レコード番号（1起算）", false).dataType("INT", "LONG");
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
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element, String elementName, String version) {
		if ("directio.json.field".equals(attributeName) && "name".equals(elementName)) {
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

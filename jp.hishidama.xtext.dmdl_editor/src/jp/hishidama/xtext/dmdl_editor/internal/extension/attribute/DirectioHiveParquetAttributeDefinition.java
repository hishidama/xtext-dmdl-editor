package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
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
			attribute = new DMDLAttribute("directio.hive.parquet", "Direct I/O Hive ParquetFile");
			attribute.addq("table_name", "Hiveメタストア上のテーブル名", "$(modelName)");
			attribute.addq("field_mapping", "【ファイル入力】カラム名のマッピング方式", "position").completionq("name", "position");
			attribute.addq("on_missing_source", "【ファイル入力】入力ファイル内にカラムが無い場合の動作", "logging").completionq("ignore",
					"logging", "fail");
			attribute.addq("on_missing_target", "【ファイル入力】データモデル内にカラムが無い場合の動作", "logging").completionq("ignore",
					"logging", "fail");
			attribute.addq("on_incompatible_type", "【ファイル入力】入力ファイルとデータモデルでカラム型に互換性が無い場合の動作", "fail").completionq(
					"ignore", "logging", "fail");
			attribute.addq("format_version", "【ファイル出力】Parquetバージョン", "v1").completionq("v1", "v2");
			attribute.addq("compression", "【ファイル出力】圧縮コーデック", "snappy").completionq("uncompressed", "gzip", "snappy",
					"lzo");
			attribute.add("block_size", "【ファイル出力】Parquetブロックサイズ[Byte]", "134217728").completion("134217728");
			attribute.add("data_page_size", "【ファイル出力】Parquetページサイズ[Byte]", "1048576").completion("1048576");
			attribute.add("dictionary_page_size", "【ファイル出力】Parquetディクショナリーページサイズ[Byte]", "1048576").completion(
					"1048576");
			attribute.add("enable_dictionary", "【ファイル出力】Parquetディクショナリーを使用するかどうか", "TRUE").completion("TRUE", "FALSE");
			attribute.add("enable_validation", "【ファイル出力】Parquetデータスキーマ検査を行うかどうか", "FALSE").completion("TRUE", "FALSE");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = DirectioHiveOrcAttributeDefinition.createPropertyAttributes();
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

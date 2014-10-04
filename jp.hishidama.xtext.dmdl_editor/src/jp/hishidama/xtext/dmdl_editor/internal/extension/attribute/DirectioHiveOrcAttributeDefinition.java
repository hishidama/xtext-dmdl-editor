package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
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
			attribute = new DMDLAttribute("directio.hive.orc", "Direct I/O Hive ORCFile");
			attribute.addq("table_name", "Hiveメタストア上のテーブル名", "$(modelName)");
			attribute.addq("field_mapping", "【ファイル入力】カラム名のマッピング方式", "position").completionq("name", "position");
			attribute.addq("on_missing_source", "【ファイル入力】入力ファイル内にカラムが無い場合の動作", "logging").completionq("ignore",
					"logging", "fail");
			attribute.addq("on_missing_target", "【ファイル入力】データモデル内にカラムが無い場合の動作", "logging").completionq("ignore",
					"logging", "fail");
			attribute.addq("on_incompatible_type", "【ファイル入力】入力ファイルとデータモデルでカラム型に互換性が無い場合の動作", "fail").completionq(
					"ignore", "logging", "fail");
			attribute.addq("format_version", "【ファイル出力】ORCFileバージョン", "0.12").completionq("0.11", "0.12");
			attribute.addq("compression", "【ファイル出力】圧縮コーデック", "snappy").completionq("none", "zlib", "snappy", "lzo");
			attribute.add("stripe_size", "【ファイル出力】ORCFileストライプサイズ[Byte]", "67108864").completion("67108864");
		}
		return attribute;
	}

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = createPropertyAttributes();
		}
		return propertyAttribute;
	}

	static DMDLAttributeList createPropertyAttributes() {
		DMDLAttributeList propertyAttribute = new DMDLAttributeList();
		{
			DMDLAttribute a = propertyAttribute.create("directio.hive.field", "Hive フィールド名", true);
			a.addq("name", "フィールド名", "$(name)");
		}
		propertyAttribute.create("directio.hive.string", "Hive STRING型", false).dataType("DECIMAL", "DATE", "DATETIME");
		{
			DMDLAttribute a = propertyAttribute.create("directio.hive.decimal", "Hive DECIMAL型", false).dataType(
					"DECIMAL");
			a.add("precision", "精度", "38").completion("1", "38");
			a.add("scale", "スケール", "38").completion("0", "38");
		}
		propertyAttribute.create("directio.hive.timestamp", "Hive TIMESTAMP型", false).dataType("DATE");
		{
			DMDLAttribute a = propertyAttribute.create("directio.hive.char", "Hive CHAR型", false).dataType("TEXT");
			a.add("length", "最大文字列長", "256").completion("1", "256");
		}
		{
			DMDLAttribute a = propertyAttribute.create("directio.hive.varchar", "Hive VARCHAR型", false)
					.dataType("TEXT");
			a.add("length", "最大文字列長", "65536").completion("1", "65536");
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

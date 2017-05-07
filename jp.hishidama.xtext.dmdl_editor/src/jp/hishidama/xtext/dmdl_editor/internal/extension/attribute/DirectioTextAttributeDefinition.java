package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

// https://github.com/asakusafw/asakusafw/tree/master/directio-project/asakusa-directio-dmdl/src/main/java/com/asakusafw/dmdl/directio/text
public abstract class DirectioTextAttributeDefinition extends DMDLAttributeWizardDefinition implements
		DMDLAttributeCompletion {

	protected void initializeAttributeTextField(DMDLAttribute attribute) {
		String adapter = "com.example.MyFieldAdapter";
		attribute.add("adapter", "フィールドデータ変換クラス（com.asakusafw.runtime.io.text.driver.FieldAdapter<T>）", adapter)
				.completionq(adapter);
		attribute.addq("null_format", "NULLを表す文字列", "").completionq("");
		attribute.addq("true_format", "TRUEを表す文字列", "true").completionq("true");
		attribute.addq("false_format", "FALSEを表す文字列", "false").completionq("false");
		attribute.addq("number_format", "数値型の形式", "0.#").completionq("0.#");
		attribute.addq("date_format", "DATEの形式", "yyyy-MM-dd").completionq("yyyy-MM-dd");
		attribute.addq("datetime_format", "DATETIMEの形式", "yyyy-MM-dd HH:mm:ss").completionq("yyyy-MM-dd HH:mm:ss");
		attribute.addq("timezone", "タイムゾーン", "UTC").completionq("GMT", "UTC", "Asia/Tokyo");
		attribute.add("decimal_output_style", "DECIMALの出力形式", "scientific").completion("plain", "scientific",
				"engineering");
		attribute.add("trim_input", "【入力時】フィールドの先頭末尾の空白文字を除去するかどうか", "false").completion("true", "false");
		attribute.add("skip_empty_input", "【入力時】フィールドの文字列が空である場合の動作", "false").completion("true", "false");
		attribute.add("on_malformed_input", "【入力時】不正なフィールド文字列が検出された場合の動作", "error").completion("error", "report",
				"ignore");
		attribute.add("on_unmappable_output", "【出力時】不正な文字が含まれている場合の動作", "error")
				.completion("error", "report", "ignore");
		attribute.add("quote_style", "【出力時】クォート方式", "needed").completion("always", "never", "nedded");
	}

	protected void initializeAttributeTextFormat(DMDLAttribute attribute, String lineSeparator, String fieldSeparator) {
		attribute.addq("charset", "ファイルの文字エンコーディング", "UTF-8").completionq("UTF-8", "MS932");
		attribute.add("header", "ファイルヘッダーの処理方法", "nothing").completion("nothing", "force", "skip", "auto");
		attribute.addq("compression", "ファイルの圧縮形式", "gzip").completionq("gzip",
				"org.apache.hadoop.io.compress.DefaultCodec", "org.apache.hadoop.io.compress.GzipCodec");
		attribute.add("line_separator", "【出力時】レコード間を区切る改行文字の種類", lineSeparator).completion("unix", "windows");
		attribute.addq("field_separator", "フィールド間の区切り文字", fieldSeparator).completionq("\\t", ",");
		attribute.add("on_less_input", "【入力時】データのフィールドが不足している場合の動作", "error").completion("error", "report", "ignore");
		attribute.add("on_more_input", "【入力時】データに余剰フィールドがある場合の動作", "error").completion("error", "report", "ignore");
		String transformer = "com.example.MyTransformer";
		attribute.addq("input_transformer", "【入力時】行データ変換クラス（UnaryOperator<CharSequence>）", transformer).completionq(
				transformer);
		attribute.addq("output_transformer", "【出力時】行データ変換クラス（UnaryOperator<CharSequence>）", transformer).completionq(
				transformer);
	}

	// CSV
	protected void initializeAttributeQuote(DMDLAttribute attribute) {
		attribute.addq("quote_character", "フィールドのクォート文字", "\\\"").completionq("\\\"");
		attribute.add("allow_linefeed", "フィールドにLFを含められるかどうか", "false").completion("true", "false");
		attribute.add("quote_style", "【出力時】クォート方式", "needed").completion("always", "never", "nedded");
		attribute.add("header_quote_style", "【出力時】ヘッダーのクォート方式", "needed").completion("always", "never", "nedded");
	}

	// tabular
	protected void initializeAttributeEscape(DMDLAttribute attribute) {
		attribute.addq("escape_character", "エスケープ文字", "\\\\").completionq("\\\\");
		// TODO example value/completion for escape_sequence map
		attribute.add("escape_sequence", "エスケープ文字一覧", "{ : }").completion("{ : }");
		attribute.add("escape_line_separator", "改行文字をエスケープ可能にするかどうか", "false").completion("true", "false");
	}

	protected abstract DMDLAttribute getModelAttribute();

	private DMDLAttributeList propertyAttribute;

	private DMDLAttributeList getPropertyAttributes() {
		if (propertyAttribute == null) {
			propertyAttribute = new DMDLAttributeList();
			{
				DMDLAttribute a = propertyAttribute.create("directio.text.field", "フィールド名", true);
				a.addq("name", "フィールド名", "$(name)");
				initializeAttributeTextField(a);
			}
			propertyAttribute.create("directio.text.ignore", "無視するフィールド", false);
			propertyAttribute.create("directio.text.file_name", "ファイル名", false).dataType("TEXT");
			propertyAttribute.create("directio.text.line_number", "テキスト行番号（1起算）", false).dataType("INT", "LONG");
			propertyAttribute.create("directio.text.record_number", "レコード番号（1起算）", false).dataType("INT", "LONG");
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
		if ("directio.text.field".equals(attributeName) && "name".equals(elementName)) {
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

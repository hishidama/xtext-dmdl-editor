package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

// https://github.com/asakusafw/asakusafw/blob/fb2ac9d16aa7726c2fb3ea006b5a66fbab20bc97/directio-project/asakusa-directio-dmdl/src/main/java/com/asakusafw/dmdl/directio/text/csv/CsvTextDriver.java
public class DirectioTextCsvAttributeDefinition extends DirectioTextAttributeDefinition {

	@Override
	public String getName() {
		return "directio.text.csv";
	}

	private DMDLAttribute attribute;

	@Override
	protected DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.text.csv", "Direct I/O CSVファイル");
			initializeAttributeTextFormat(attribute, "windows", ",");
			initializeAttributeQuote(attribute);
			initializeAttributeTextField(attribute);
		}
		return attribute;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioTextCsvImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.text.csv";
	}

	@Override
	public boolean isExporter() {
		return false;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)FromCsv";
	}

	@Override
	public void initializeFields() {
		addFieldDirectioCsv();
		addFieldDirectioImporterOptional();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sCsvTextInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".text.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOptional(sb);
		appendMethodDataSize(sb);
	}
}

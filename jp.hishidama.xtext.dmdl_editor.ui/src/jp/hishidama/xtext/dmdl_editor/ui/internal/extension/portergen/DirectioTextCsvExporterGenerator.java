package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioTextCsvExporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.text.csv";
	}

	@Override
	public boolean isExporter() {
		return true;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)ToCsv";
	}

	@Override
	public void initializeFields() {
		addFieldDirectioCsv();
		addFieldDirectioCsvExporter();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sCsvTextOutputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".text.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOrder(sb);
		appendMethodDeletePatterns(sb);
	}
}

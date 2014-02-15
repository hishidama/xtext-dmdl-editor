package jp.hishidama.xtext.dmdl_editor.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.extension.DirectioGenerator;

public class DirectioTsvExporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.tsv";
	}

	@Override
	public boolean isExporter() {
		return true;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)ToTsv";
	}

	@Override
	public void initializeFields() {
		addFieldDirectioCsv();
		addFieldDirectioCsvExporter();
	}

	@Override
	protected String getExtendsClassName(String modelCamelName) {
		String sname = String.format("Abstract%sTsvOutputDescription", modelCamelName);
		return getGeneratedClassName(".dmdl.tsv.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOrder(sb);
		appendMethodDeletePatterns(sb);
	}
}

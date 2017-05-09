package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioTextTabularExporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.text.tabular";
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
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sTabularTextOutputDescription", modelCamelName);
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

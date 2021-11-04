package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioLineExporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.line";
	}

	@Override
	public boolean isExporter() {
		return true;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)ToTxt";
	}

	@Override
	public void initializeFields() {
		addFieldDirectio("txt");
		addFieldDirectioExporter("txt");
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sLineOutputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".line.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOrder(sb);
		appendMethodDeletePatterns(sb);
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioJsonExporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.json";
	}

	@Override
	public boolean isExporter() {
		return true;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)ToJson";
	}

	@Override
	public void initializeFields() {
		addFieldDirectio("json");
		addFieldDirectioExporter("json");
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sJsonOutputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".json.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOrder(sb);
		appendMethodDeletePatterns(sb);
	}
}

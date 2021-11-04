package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioJsonImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.json";
	}

	@Override
	public boolean isExporter() {
		return false;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)FromJson";
	}

	@Override
	public void initializeFields() {
		addFieldDirectio("json");
		addFieldDirectioImporterOptional();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sJsonInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".json.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOptional(sb);
		appendMethodDataSize(sb);
	}
}

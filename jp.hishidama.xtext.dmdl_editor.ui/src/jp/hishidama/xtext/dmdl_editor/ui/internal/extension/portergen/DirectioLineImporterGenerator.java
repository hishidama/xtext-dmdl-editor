package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioLineImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.line";
	}

	@Override
	public boolean isExporter() {
		return false;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)FromTxt";
	}

	@Override
	public void initializeFields() {
		addFieldDirectio("txt");
		addFieldDirectioImporterOptional();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sLineInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".line.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOptional(sb);
		appendMethodDataSize(sb);
	}
}

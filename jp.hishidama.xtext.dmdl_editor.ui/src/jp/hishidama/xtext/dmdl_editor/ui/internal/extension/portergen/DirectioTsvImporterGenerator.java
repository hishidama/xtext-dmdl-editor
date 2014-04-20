package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioTsvImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.tsv";
	}

	@Override
	public boolean isExporter() {
		return false;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)FromTsv";
	}

	@Override
	public void initializeFields() {
		addFieldDirectioCsv();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sTsvInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".tsv.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodDataSize(sb);
	}
}

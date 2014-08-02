package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioCsvImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.csv";
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
		String sname = String.format("Abstract%sCsvInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".csv.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodOptional(sb);
		appendMethodDataSize(sb);
	}
}

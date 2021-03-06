package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.WindgateGenerator;

public class WindgateCsvImporterGenerator extends WindgateGenerator {

	@Override
	public String getName() {
		return "@windgate.csv";
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
		addFieldWindgate();
		addFieldWindgateCsv();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sCsvImporterDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".csv.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodProfileName(sb);
		appendMethodPath(sb);
		appendMethodDataSize(sb);
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.WindgateGenerator;

public class WindgateCsvExporterGenerator extends WindgateGenerator {

	@Override
	public String getName() {
		return "@windgate.csv";
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
		addFieldWindgate();
		addFieldWindgateCsv();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sCsvExporterDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".csv.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodProfileName(sb);
		appendMethodPath(sb);
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.WindgateGenerator;

public class WindgateJdbcExporterGenerator extends WindgateGenerator {

	@Override
	public String getName() {
		return "@windgate.jdbc";
	}

	@Override
	public boolean isExporter() {
		return true;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)ToTable";
	}

	@Override
	public void initializeFields() {
		addFieldWindgate();
		addFieldWindgateJdbc();
		addFieldWindgateJdbcExporter();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sJdbcExporterDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".jdbc.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodProfileName(sb);
		appendMethodTableName(sb);
		appendMethodColumnNames(sb);
		appendMethodCustomTruncate(sb);
	}
}

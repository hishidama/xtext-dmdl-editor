package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;

public class WindgateTsvExporterGenerator extends WindgateTsvGenerator {

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
		addFieldWindgate();
		addFieldWindgatePath(GROUP_WINDGATE_TSV);
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		return PorterUtil.WINDGATE_FS_EXPORTER_NAME;
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodModelType(sb);
		appendMethodStreamSupport(sb);
		appendMethodProfileName(sb);
		appendMethodPath(sb);
	}
}

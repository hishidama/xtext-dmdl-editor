package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;

public class WindgateTsvImporterGenerator extends WindgateTsvGenerator {

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
		addFieldWindgate();
		addFieldWindgatePath(GROUP_WINDGATE_TSV);
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		return PorterUtil.WINDGATE_FS_IMPORTER_NAME;
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodModelType(sb);
		appendMethodStreamSupport(sb);
		appendMethodProfileName(sb);
		appendMethodPath(sb);
		appendMethodDataSize(sb);
	}
}

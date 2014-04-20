package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DirectioGenerator;

public class DirectioSeqfileImporterGenerator extends DirectioGenerator {

	@Override
	public String getName() {
		return "@directio.sequence_file";
	}

	@Override
	public boolean isExporter() {
		return false;
	}

	@Override
	public String getDefaultClassName() {
		return "$(modelName.toCamelCase)FromSeq";
	}

	@Override
	public void initializeFields() {
		addFieldDirectioSeqfile();
		addFieldImporterDataSize();
	}

	@Override
	protected String getExtendsClassName(String modelName, String modelCamelName) {
		String sname = String.format("Abstract%sSequenceFileInputDescription", modelCamelName);
		return getGeneratedClassName(modelName, ".sequencefile.", sname);
	}

	@Override
	protected void appendMethods(StringBuilder sb) {
		appendMethodBasePath(sb);
		appendMethodResourcePattern(sb);
		appendMethodDataSize(sb);
	}
}

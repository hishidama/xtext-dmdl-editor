package jp.hishidama.xtext.dmdl_editor.ui.internal.extension.portergen;

import jp.hishidama.xtext.dmdl_editor.ui.extension.WindgateGenerator;

public abstract class WindgateTsvGenerator extends WindgateGenerator {
	public static final String GROUP_WINDGATE_TSV = "@windgate.tsv";

	@Override
	public String getName() {
		return "@windgate.tsv";
	}

	protected void appendMethodStreamSupport(StringBuilder sb) {
		String sname = getSimpleName(getValue(KEY_MODEL_CLASS_NAME)) + "StreamSupport";
		String streamName = getCachedClassName(getGeneratedClassName(model.getName(), ".stream.", sname));
		String rtype = String.format("Class<%s>", streamName);
		String value = String.format("%s.class", streamName);
		appendMethod(sb, rtype, "getStreamSupport", value, "");
	}
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.Arrays;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

// http://asakusafw.s3.amazonaws.com/documents/sandbox/ja/html/windgate/stream.html
public class WindgateTsvAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "windgate.tsv";
	}

	@Override
	public String getAddModelAttribute(String version) {
		return "@windgate.stream_format(type=\"tsv\")";
	}

	@Override
	public String getAddPropertyAttribute(String version) {
		return "";
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@windgate.stream_format");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		return Arrays.asList("");
	}
}

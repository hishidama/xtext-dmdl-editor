package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioSeqfileAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "directio.sequence_file";
	}

	@Override
	public String getAddModelAttribute(String version) {
		return "@directio.sequence_file\n";
	}

	@Override
	public String getAddPropertyAttribute(String version) {
		return null;
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@directio.sequence_file");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		return Collections.emptyList();
	}
}

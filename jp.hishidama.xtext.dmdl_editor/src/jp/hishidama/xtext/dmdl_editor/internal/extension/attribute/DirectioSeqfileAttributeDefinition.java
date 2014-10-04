package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioSeqfileAttributeDefinition extends DMDLAttributeWizardDefinition implements
		DMDLAttributeCompletion {

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

	// @Override
	public String getCompletionModelAttributeName() {
		return "directio.sequence_file";
	}

	// @Override
	public List<String> getCompletionModelAttributeElementNameList(String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeName(Property property) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementNameList(Property property, String name, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element,
			String elementName, String version) {
		return null;
	}
}

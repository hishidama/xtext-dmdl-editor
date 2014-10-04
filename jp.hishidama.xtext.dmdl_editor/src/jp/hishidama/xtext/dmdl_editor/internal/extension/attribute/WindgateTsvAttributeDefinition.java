package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.Arrays;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

// http://asakusafw.s3.amazonaws.com/documents/sandbox/ja/html/windgate/stream.html
public class WindgateTsvAttributeDefinition extends DMDLAttributeWizardDefinition implements DMDLAttributeCompletion {

	@Override
	public String getName() {
		return "windgate.tsv";
	}

	@Override
	public String getAddModelAttribute(String version) {
		return "@windgate.stream_format(type = \"tsv\")";
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

	// @Override
	public String getCompletionModelAttributeName() {
		return "windgate.stream_format";
	}

	// @Override
	public List<String> getCompletionModelAttributeElementNameList(String version) {
		return Arrays.asList("type");
	}

	// @Override
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version) {
		if ("type".equals(name)) {
			return Arrays.asList("\"tsv\"");
		}
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

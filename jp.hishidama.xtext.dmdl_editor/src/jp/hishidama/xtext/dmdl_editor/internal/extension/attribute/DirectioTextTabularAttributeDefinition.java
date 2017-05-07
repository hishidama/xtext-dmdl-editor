package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

// https://github.com/asakusafw/asakusafw/blob/master/directio-project/asakusa-directio-dmdl/src/main/java/com/asakusafw/dmdl/directio/text/tabular/TabularTextDriver.java
public class DirectioTextTabularAttributeDefinition extends DirectioTextAttributeDefinition {

	@Override
	public String getName() {
		return "directio.text.tabular";
	}

	private DMDLAttribute attribute;

	@Override
	protected DMDLAttribute getModelAttribute() {
		if (attribute == null) {
			attribute = new DMDLAttribute("directio.text.tabular", "Direct I/O TSVファイル");
			initializeAttributeTextFormat(attribute, "unix", "\\t");
			initializeAttributeEscape(attribute);
			initializeAttributeTextField(attribute);
		}
		return attribute;
	}
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.Arrays;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class WindgateJdbcAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "windgate.jdbc";
	}

	@Override
	public String getAddModelAttribute(String version) {
		return "@windgate.jdbc.table(name = \"$(modelName.toUpper)\")";
	}

	@Override
	public String getAddPropertyAttribute(String version) {
		return "@windgate.jdbc.column(name = \"$(name.toUpper)\")";
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@windgate.jdbc.table");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		return Arrays.asList("@windgate.jdbc.column");
	}
}

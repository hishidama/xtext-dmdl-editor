package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioHiveOrcAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "directio.hive.orc";
	}

	@Override
	public String getAddModelAttribute(String version) {
		List<String> list = new ArrayList<String>();
		list.add("table_name = \"$(modelName)\"");
		list.add("field_mapping = \"position\"");
		list.add("on_missing_source = \"logging\"");
		list.add("on_missing_target = \"logging\"");
		list.add("on_incompatible_type = \"fail\"");
		list.add("format_version = \"0.12\"");
		list.add("compression = \"snappy\"");
		list.add("stripe_size = 67108864");

		StringBuilder sb = new StringBuilder(256);
		sb.append("@directio.hive.orc(\n");
		for (String s : list) {
			sb.append("  ");
			sb.append(s);
			sb.append(",\n");
		}
		sb.append(")");
		return sb.toString();
	}

	@Override
	public String getAddPropertyAttribute(String version) {
		return "@directio.hive.field(name = \"$(name)\")";
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@directio.hive.orc");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		List<String> r = new ArrayList<String>();
		r.add("@directio.hive.field");
		r.add("@directio.hive.string");
		r.add("@directio.hive.decimal");
		r.add("@directio.hive.timestamp");
		r.add("@directio.hive.char");
		r.add("@directio.hive.varchar");
		return r;
	}
}

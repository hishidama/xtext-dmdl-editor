package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioCsvAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "directio.csv";
	}

	@Override
	public String getAddModelAttribute(String version) {
		List<String> list = new ArrayList<String>();
		list.add("charset = \"UTF-8\"");
		list.add("allow_linefeed = FALSE");
		list.add("has_header = FALSE");
		list.add("true = \"true\"");
		list.add("false = \"false\"");
		list.add("date = \"yyyy-MM-dd\"");
		list.add("datetime = \"yyyy-MM-dd HH:mm:ss\"");
		if (AsakusafwConfiguration.compareVersion("0.5.2", version) <= 0) {
			list.add("compression = \"org.apache.hadoop.io.compress.GzipCodec\"");
		}

		StringBuilder sb = new StringBuilder(256);
		sb.append("@directio.csv(\n");
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
		return "@directio.csv.field(name = \"$(name)\")";
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@directio.csv");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		List<String> r = new ArrayList<String>();
		r.add("@directio.csv.field");
		r.add("@directio.csv.file_name");
		r.add("@directio.csv.line_number");
		r.add("@directio.csv.record_number");
		return r;
	}
}

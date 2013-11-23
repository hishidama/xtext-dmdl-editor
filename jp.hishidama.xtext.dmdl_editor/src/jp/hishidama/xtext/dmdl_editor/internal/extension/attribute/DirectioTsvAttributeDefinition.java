package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

public class DirectioTsvAttributeDefinition extends DMDLAttributeWizardDefinition {

	@Override
	public String getName() {
		return "directio.tsv";
	}

	@Override
	public String getAddModelAttribute(String version) {
		List<String> list = new ArrayList<String>();
		list.add("charset = \"UTF-8\"");
		if (AsakusafwConfiguration.compareVersion("0.5.2", version) <= 0) {
			list.add("compression = \"org.apache.hadoop.io.compress.GzipCodec\"");
		}

		StringBuilder sb = new StringBuilder(256);
		sb.append("@directio.tsv(\n");
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
		return null;
	}

	@Override
	protected List<String> getRemoveModelAttributeList(String version) {
		return Arrays.asList("@directio.tsv");
	}

	@Override
	protected List<String> getRemovePropertyAttributeList(String version) {
		List<String> r = new ArrayList<String>();
		r.add("@directio.tsv.ignore");
		r.add("@directio.tsv.file_name");
		return r;
	}
}

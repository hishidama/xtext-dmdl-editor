package jp.hishidama.xtext.dmdl_editor.util;

import static jp.hishidama.eclipse_plugin.util.StringUtil.*;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;

import org.eclipse.core.resources.IProject;

public class DMDLStringUtil {

	public static String getModelClass(IProject project, String modelName) {
		AsakusafwProperties bp = BuildPropertiesUtil.getBuildProperties(project, false);
		if (bp == null) {
			return null;
		}
		String pack = bp.getModelgenPackage();
		if (pack == null) {
			return null;
		}
		String sname = toCamelCase(modelName);
		return pack + ".dmdl.model." + sname;
	}

	public static String replace(String s, String modelName, String propName, String propDesc) {
		StringBuilder sb = new StringBuilder(s.length());
		for (int pos = 0;;) {
			int n = s.indexOf("$(", pos);
			if (n >= 0) {
				sb.append(s.substring(pos, n));
				pos = n;
				int m = s.indexOf(")", pos);
				if (m >= 0) {
					String key = s.substring(n + 2, m);
					sb.append(convert(key, modelName, propName, propDesc));
					pos = m + 1;
				} else {
					String key = s.substring(n + 2);
					sb.append(convert(key, modelName, propName, propDesc));
					break;
				}
			} else {
				sb.append(s.substring(pos));
				break;
			}
		}
		return sb.toString();
	}

	private static String convert(String key, String modelName, String propName, String propDesc) {
		String s;
		if ("modelName".equals(key)) {
			s = modelName;
		} else if ("modelName.toUpper".equals(key)) {
			s = modelName.toUpperCase();
		} else if ("modelName.toCamelCase".equals(key)) {
			s = toCamelCase(modelName);
		} else if ("name".equals(key)) {
			s = propName;
		} else if ("name.toUpper".equals(key)) {
			s = propName.toUpperCase();
		} else if ("description".equals(key)) {
			s = decodeDescription(propDesc);
		} else {
			s = "";
		}
		return (s != null) ? s : "";
	}

	public static String escapeQuote(String s) {
		return s.replaceAll("\"", "\\\"");
	}

	public static String decodeDescription(String s) {
		if (s == null) {
			return s;
		}
		if (s.startsWith("\"")) {
			s = s.substring(1);
		}
		if (s.endsWith("\"")) {
			s = s.substring(0, s.length() - 1);
		}
		s = s.replaceAll("\\\\\"", "\"");
		return s;
	}

	public static String encodeDescription(String s) {
		if (s == null) {
			return null;
		}
		s = s.replaceAll("\"", "\\\\\"");
		return "\"" + s + "\"";
	}
}

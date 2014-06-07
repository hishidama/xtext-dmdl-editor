package jp.hishidama.xtext.dmdl_editor.util;

public class DMDLStringUtil {

	public static String escapeQuote(String s) {
		return s.replaceAll("\"", "\\\"");
	}

	public static String decodeDescription(String s) {
		if (s == null) {
			return null;
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

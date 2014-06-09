package jp.hishidama.xtext.dmdl_editor.util;

import java.util.regex.Pattern;

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

	public static Pattern getPattern(String filter) {
		if (filter == null || filter.trim().isEmpty()) {
			return null;
		}

		StringBuilder sb = new StringBuilder(filter.length() * 2);
		int wildcard = 0;
		for (int i = 0; i < filter.length();) {
			int c = filter.codePointAt(i);
			switch (c) {
			case '.':
				sb.append("\\.");
				break;
			case '?':
				sb.append(".");
				wildcard++;
				break;
			case '*':
				sb.append(".*");
				wildcard++;
				break;
			default:
				sb.appendCodePoint(c);
				break;
			}
			i += Character.charCount(c);
		}
		String pattern = (wildcard > 0) ? sb.toString() : ".*" + sb + ".*";
		return Pattern.compile(pattern, Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
	}

	public static Pattern getNamePattern(String filter) {
		if (filter == null || filter.trim().isEmpty()) {
			return null;
		}

		StringBuilder sb = new StringBuilder(filter.length() * 2);
		int wildcard = 0;
		for (int i = 0; i < filter.length();) {
			int c = filter.codePointAt(i);
			if (('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
				sb.append("_?");
				sb.appendCodePoint(Character.toLowerCase(c));
			} else {
				switch (c) {
				case '?':
					sb.append(".");
					wildcard++;
					break;
				case '*':
					sb.append(".*");
					wildcard++;
					break;
				default:
					sb.appendCodePoint(c);
					break;
				}
			}
			i += Character.charCount(c);
		}
		if (wildcard > 0) {
			return Pattern.compile(sb.toString());
		}
		return Pattern.compile(".*" + sb + ".*");
	}
}

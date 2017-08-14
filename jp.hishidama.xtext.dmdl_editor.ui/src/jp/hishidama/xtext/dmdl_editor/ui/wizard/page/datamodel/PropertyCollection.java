package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.PropertyExpressionType;

public class PropertyCollection {

	public static class CollectionEntry {
		public String key;
		/** property name */
		public String name;

		public CollectionEntry(String key, String name) {
			this.key = key;
			this.name = name;
		}
	}

	public static String toText(PropertyExpressionType expression) {
		if (expression == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder(128);

		String type = PropertyUtil.getDataTypeText(expression.getType());
		List<Property> list = expression.getList();
		Map<String, Property> map = expression.getMap();
		Property ref = expression.getReference();

		if (!type.isEmpty()) {
			sb.append(type);
			sb.append(" ");
		}
		sb.append("= ");

		if (list != null) {
			if (list.isEmpty()) {
				sb.append("{}");
			} else {
				sb.append("{ ");
				boolean first = true;
				for (Property p : list) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(p.getName());
				}
				sb.append(" }");
			}
		} else if (map != null) {
			if (map.isEmpty()) {
				sb.append("{:}");
			} else {
				sb.append("{ ");
				boolean first = true;
				for (Entry<String, Property> entry : map.entrySet()) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append("\"");
					sb.append(entry.getKey());
					sb.append(" \":");
					sb.append(entry.getValue().getName());
				}
				sb.append(" }");
			}
		} else if (ref != null) {
			String modelName = PropertyUtil.getModelName(ref);
			if (modelName != null) {
				sb.append(modelName);
				sb.append(".");
			}
			sb.append(ref.getName());
		}

		return sb.toString();
	}

	public static String toText(boolean isMap, String elementType, List<CollectionEntry> nameList) {
		StringBuilder sb = new StringBuilder(128);

		if (elementType != null && !elementType.isEmpty()) {
			sb.append("{");
			if (isMap) {
				sb.append(":");
			}
			sb.append(elementType);
			sb.append("} ");
		}
		sb.append("= ");

		if (nameList.isEmpty()) {
			if (isMap) {
				sb.append("{:}");
			} else {
				sb.append("{}");
			}
		} else {
			sb.append("{ ");
			boolean first = true;
			for (CollectionEntry entry : nameList) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				if (isMap) {
					sb.append('"');
					sb.append(entry.key);
					sb.append("\":");
				}
				sb.append(entry.name);
			}
			sb.append(" }");
		}

		return sb.toString();
	}

	public static String toText(boolean isMap, String elementType, String referenceName) {
		StringBuilder sb = new StringBuilder(128);

		if (elementType != null && !elementType.isEmpty()) {
			sb.append("{");
			if (isMap) {
				sb.append(":");
			}
			sb.append(elementType);
			sb.append("} ");
		}
		sb.append("= ");

		sb.append(referenceName);

		return sb.toString();
	}

	public static boolean isList(String text) {
		if (isListOrMap(text)) {
			return text.indexOf(':') < 0;
		}
		return false;
	}

	public static boolean isMap(String text) {
		if (isListOrMap(text)) {
			return text.indexOf(':') >= 0;
		}
		return false;
	}

	public static boolean isListOrMap(String text) {
		int n = text.indexOf('=');
		if (n >= 0) {
			return text.indexOf('{', n + 1) >= 0;
		}
		return text.indexOf('{') >= 0;
	}

	public static boolean isReference(String text) {
		int n = text.indexOf('=');
		if (n >= 0) {
			return text.indexOf('{', n + 1) < 0;
		}
		return text.indexOf('{') < 0;
	}

	public static String getType(String text) {
		int n = text.indexOf('=');
		if (n < 0) {
			return null;
		}
		text = text.substring(0, n).trim();
		if (text.isEmpty()) {
			return null;
		}
		return text;
	}

	public static String getElementType(String text) {
		String type = getType(text);
		if (type == null) {
			return null;
		}
		return trim(type, "{", "}");
	}

	public static String getExpressionText(String text) {
		int n = text.indexOf('=');
		if (n >= 0) {
			return text.substring(n + 1).trim();
		}
		return text.trim();
	}

	public static List<CollectionEntry> getNameList(String text) {
		text = trim(getExpressionText(text), "{", "}");

		String[] ss = text.split(",");
		List<CollectionEntry> list = new ArrayList<CollectionEntry>(ss.length);
		int index = 0;
		for (String s : ss) {
			String key, name;
			int n = s.indexOf(':');
			if (n >= 0) {
				key = trim(s.substring(0, n).trim(), "\"", "\"").trim();
				name = s.substring(n + 1).trim();
			} else {
				key = Integer.toString(index);
				name = s.trim();
			}
			if (!name.isEmpty()) {
				list.add(new CollectionEntry(key, name));
				index++;
			}
		}
		return list;
	}

	public static String getReferenceName(String text) {
		String name = getExpressionText(text);

		if (name.startsWith("{")) {
			List<CollectionEntry> list = getNameList(text);
			if (list.isEmpty()) {
				return "";
			}
			return list.get(0).name;
		}

		return name;
	}

	private static String trim(String text, String prefix, String suffix) {
		if (text.startsWith(prefix)) {
			text = text.substring(prefix.length());
		}
		if (text.endsWith(suffix)) {
			text = text.substring(0, text.length() - suffix.length());
		}
		return text;
	}
}

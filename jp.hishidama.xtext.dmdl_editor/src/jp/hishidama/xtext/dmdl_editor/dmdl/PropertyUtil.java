package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.HashSet;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class PropertyUtil {

	public static void appendTooltipPropertyName(StringBuilder sb, Property property) {
		String desc = property.getDescription();
		if (desc != null) {
			sb.append(desc);
			sb.append("<br>");
		}

		String name = property.getName();
		sb.append("<b>");
		sb.append(name);
		sb.append("</b>");

		Type type = getResolvedDataType(property);
		if (type != null) {
			sb.append(" : ");
			sb.append(type);
		}
	}

	public static String getDecodedDescription(Property property) {
		return DMDLStringUtil.decodeDescription(property.getDescription());
	}

	public static String getDecodedDescriptionText(Property property) {
		return StringUtil.nonNull(getDecodedDescription(property));
	}

	public static String getResolvedDataTypeText(Property property) {
		Type type = getResolvedDataType(property);
		if (type != null) {
			return type.name();
		}
		return "";
	}

	public static Type getResolvedDataType(Property property) {
		return resoloveDataType(property, new HashSet<String>());
	}

	private static Type resoloveDataType(Property property, Set<String> set) {
		if (property == null) {
			return null;
		}

		ModelDefinition model = ModelUtil.getModel(property);
		if (model == null) {
			return null;
		}
		String modelName = model.getName();
		if (set.contains(modelName)) {
			return null;
		}
		set.add(modelName);

		if (property instanceof PropertyDefinition) {
			PropertyDefinition p = (PropertyDefinition) property;
			return p.getType();
		}
		if (property instanceof PropertyMapping) {
			PropertyMapping p = (PropertyMapping) property;
			return resoloveDataType(p.getFrom(), set);
		}
		if (property instanceof PropertyFolding) {
			PropertyFolding p = (PropertyFolding) property;
			String aggr = p.getAggregator();
			if ("count".equals(aggr)) {
				return Type.LONG;
			}

			Type r = resoloveDataType(p.getFrom(), set);
			if ("sum".equals(aggr)) {
				if (r == null) {
					return null;
				}
				switch (r) {
				case BYTE:
				case SHORT:
				case INT:
				case LONG:
					return Type.LONG;
				case FLOAT:
				case DOUBLE:
					return Type.DOUBLE;
				case DECIMAL:
					return Type.DECIMAL;
				default:
					return null;
				}
			}
			return r;
		}
		throw new IllegalStateException("property=" + property);
	}

	public static String getModelName(EObject object) {
		ModelDefinition model = ModelUtil.getModel(object);
		if (model != null) {
			return model.getName();
		}
		return null;
	}

	public static Property getProperty(EObject object) {
		while (object != null) {
			if (object instanceof Property) {
				return (Property) object;
			}
			object = object.eContainer();
		}
		return null;
	}

	public static String getAttributeString(Property property) {
		if (property == null) {
			return null;
		}
		AttributeList alist = property.getAttributes();
		if (alist == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(128);
		for (Attribute a : alist.getAttributes()) {
			ICompositeNode node = NodeModelUtils.getNode(a);
			if (node != null) {
				if (sb.length() != 0) {
					sb.append("\n");
				}
				sb.append(NodeModelUtils.getTokenText(node));
			}
		}
		return sb.toString();
	}

	public static class NamePosition {
		private int start;
		private int end;

		public NamePosition(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int getOffset() {
			return start;
		}

		public int getLength() {
			return end - start;
		}

		public int getEnd() {
			return end;
		}

		public String getName(String text) {
			return text.substring(start, end);
		}
	}

	public static NamePosition findName(String text) {
		int start = 0;
		for (; start < text.length(); start++) {
			char c = text.charAt(start);
			if (isPropertyNameChar(c)) {
				break;
			}
		}
		int end = start;
		for (; end < text.length(); end++) {
			char c = text.charAt(end);
			if (!isPropertyNameChar(c)) {
				break;
			}
		}

		if (start != end) {
			NamePosition pos = new NamePosition(start, end);
			return pos;
		}

		return null;
	}

	public static NamePosition nameIndexOf(String text, String name) {
		NamePosition pos = findName(text);
		if (pos == null) {
			return null;
		}

		String s = pos.getName(text);
		if (s.equals(name) || s.equals(StringUtil.toLowerCamelCase(name))) {
			return pos;
		}

		return null;
	}

	private static boolean isPropertyNameChar(char c) {
		return Character.isJavaIdentifierPart(c);
	}

	public static String cutMethodName(String name) {
		if (name.startsWith("set")) {
			name = name.substring(3);
		} else if (name.startsWith("get")) {
			name = name.substring(3);
		}
		if (name.endsWith("Option")) {
			name = name.substring(0, name.length() - 6);
		} else if (name.endsWith("AsString")) {
			name = name.substring(0, name.length() - 8);
		}
		return StringUtil.toFirstLower(name);
	}
}

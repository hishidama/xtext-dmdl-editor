package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
			String typeText = getDataTypeText(type);
			sb.append(" : ");
			sb.append(typeText);
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
		return getDataTypeText(type);
	}

	public static String getDataTypeText(Type type) {
		if (type != null) {
			CollectionType ctype = type.getCollectionType();
			if (ctype != null) {
				if (ctype.isMap()) {
					return String.format("{:%s}", getDataTypeText(ctype.getElementType()));
				} else {
					return String.format("{%s}", getDataTypeText(ctype.getElementType()));
				}
			}

			// ReferenceType rtype = type.getReferenceType();
			// if (rtype != null) {
			// Property property = rtype.getName();
			// if (property != null) {
			// return getResolvedDataTypeText(property);
			// }
			// return "<reference>";
			// }

			// BasicType(enum)にはデフォルト値が入る（nullにならない）ことがあるので、最後に判定する
			BasicType btype = type.getBasicType();
			if (btype != null) {
				return btype.name();
			}
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
			Type type = p.getType();
			if (type != null) {
				return type;
			}
			PropertyExpression exp = p.getExpression();
			if (exp != null) {
				EObject object = exp.getExpression();
				if (object instanceof PropertyExpressionList) {
					PropertyExpressionList list = (PropertyExpressionList) object;
					for (Property element : list.getElements()) {
						Type t = getResolvedDataType(element);
						if (t != null) {
							return newCollectionType(t, false);
						}
					}
					return null;
				}
				if (object instanceof PropertyExpressionMap) {
					PropertyExpressionMap map = (PropertyExpressionMap) object;
					for (PropertyExpressionMapEntry entry : map.getElements()) {
						Type t = getResolvedDataType(entry.getProperty());
						if (t != null) {
							return newCollectionType(t, true);
						}
					}
					return null;
				}
				if (object instanceof PropertyExpressionRefernce) {
					PropertyExpressionRefernce ref = (PropertyExpressionRefernce) object;
					return getResolvedDataType(ref.getName());
				}
			}
			return null;
		}
		if (property instanceof PropertyMapping) {
			PropertyMapping p = (PropertyMapping) property;
			return resoloveDataType(p.getFrom(), set);
		}
		if (property instanceof PropertyFolding) {
			PropertyFolding p = (PropertyFolding) property;
			String aggr = p.getAggregator();
			if ("count".equals(aggr)) {
				return newType(BasicType.LONG);
			}

			Type r = resoloveDataType(p.getFrom(), set);
			if ("sum".equals(aggr)) {
				if (r == null) {
					return null;
				}
				BasicType btype = r.getBasicType();
				if (btype == null) {
					return null;
				}
				switch (btype) {
				case BYTE:
				case SHORT:
				case INT:
				case LONG:
					return newType(BasicType.LONG);
				case FLOAT:
				case DOUBLE:
					return newType(BasicType.DOUBLE);
				case DECIMAL:
					return newType(BasicType.DECIMAL);
				default:
					return null;
				}
			}
			return r;
		}
		throw new IllegalStateException("property=" + property);
	}

	private static Type newType(BasicType basicType) {
		Type type = DmdlFactory.eINSTANCE.createType();
		type.setBasicType(basicType);
		return type;
	}

	private static Type newCollectionType(Type elementType, boolean isMap) {
		CollectionType ctype = DmdlFactory.eINSTANCE.createCollectionType();
		ctype.setElementType(EcoreUtil.copy(elementType));
		ctype.setMap(isMap);

		Type type = DmdlFactory.eINSTANCE.createType();
		type.setCollectionType(ctype);
		return type;
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

	private final static Pattern RESOURCE_PATTERN_PROPERTY_PATTERN = Pattern.compile("\\{(?<name>.*?)(\\:.*?)?\\}");

	public static List<NamePosition> getResourcePatternProperties(String text) {
		List<NamePosition> list = new ArrayList<NamePosition>();

		Matcher matcher = RESOURCE_PATTERN_PROPERTY_PATTERN.matcher(text);
		while (matcher.find()) {
			int start = matcher.start(1);
			if (start >= 2 && text.charAt(start - 2) == '$') {
				continue;
			}
			NamePosition pos = new NamePosition(start, matcher.end(1));
			list.add(pos);
		}
		return list;
	}

	private static boolean isPropertyNameChar(char c) {
		return Character.isJavaIdentifierPart(c);
	}

	public static String cutMethodName(String name) {
		if (name.startsWith("set")) {
			name = name.substring(3);
		} else if (name.startsWith("get")) {
			name = name.substring(3);
		} else if (name.startsWith("is")) {
			name = name.substring(2);
		}
		if (name.endsWith("Option")) {
			name = name.substring(0, name.length() - 6);
		} else if (name.endsWith("AsString")) {
			name = name.substring(0, name.length() - 8);
		}
		return StringUtil.toFirstLower(name);
	}
}

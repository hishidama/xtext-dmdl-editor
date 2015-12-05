package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

public class DMDLAttributeList {

	private List<DMDLAttribute> attributeList = new ArrayList<DMDLAttribute>();

	/**
	 * DMDLAttribute作成.
	 * 
	 * @param name
	 *            属性名
	 * @param tooltip
	 *            ツールチップ
	 * @param append
	 *            {@link #getAddAttribute(String)} で出力するかどうか
	 * @return DMDLAttribute
	 */
	public DMDLAttribute create(String name, String tooltip, boolean append) {
		DMDLAttribute a = new DMDLAttribute(name, tooltip, append);
		attributeList.add(a);
		return a;
	}

	public DMDLAttribute get(String name) {
		for (DMDLAttribute a : attributeList) {
			if (name.equals(a.getName())) {
				return a;
			}
		}
		return null;
	}

	public String getAddAttribute(String version) {
		if (attributeList.isEmpty()) {
			return null;
		}

		StringBuilder sb = new StringBuilder(256);
		for (DMDLAttribute a : attributeList) {
			if (a.isAppend()) {
				String s = a.getAddAttribute(version);
				if (s != null) {
					if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
						sb.append("\n");
					}
					sb.append(s);
				}
			}
		}
		return sb.toString();
	}

	public List<String> getRemoveAttribute() {
		List<String> list = new ArrayList<String>(attributeList.size());
		for (DMDLAttribute a : attributeList) {
			list.add("@" + a.getName());
		}
		return list;
	}

	public List<String> getAttributeNameList(Property property) {
		String type = PropertyUtil.getResolvedDataTypeText(property);

		List<String> list = new ArrayList<String>(attributeList.size());
		for (DMDLAttribute a : attributeList) {
			List<String> dataTypeList = a.getDataTypeList();
			if (dataTypeList.isEmpty() || dataTypeList.contains(type)) {
				list.add(a.getName());
			}
		}

		return list;
	}

	public List<String> getElementNameList(String name, String version) {
		DMDLAttribute a = get(name);
		if (a == null) {
			return null;
		}
		return a.getElementNameList(version);
	}

	public List<String> getElementValueList(String attributeName, String elementName, String version) {
		DMDLAttribute a = get(attributeName);
		if (a == null) {
			return null;
		}
		return a.getElementValueList(elementName, version);
	}

	public String getAttributeTooltip(Attribute attribute, String attributeName) {
		for (DMDLAttribute a : attributeList) {
			String s = a.getAttributeTooltip(attribute, attributeName);
			if (s != null) {
				return s;
			}
		}
		return null;
	}

	public String getElementTooltip(String attributeName, AttributeElement element, String elementName) {
		for (DMDLAttribute a : attributeList) {
			String s = a.getElementTooltip(attributeName, element, elementName);
			if (s != null) {
				return s;
			}
		}
		return null;
	}
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

public class DMDLAttributeList {

	private List<DMDLAttribute> attributeList = new ArrayList<DMDLAttribute>();

	public DMDLAttribute create(String name, boolean append) {
		DMDLAttribute a = new DMDLAttribute(name, append);
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
}

package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

public class DMDLAttribute {

	private String name;
	private boolean append;

	private List<String> dataTypeList;

	public static class DmdlAttributeElement {
		private String version;
		private String name;
		private String value;
		private List<String> completionList;

		public void completionq(String... completions) {
			String[] c = new String[completions.length];
			int i = 0;
			for (String s : completions) {
				c[i++] = String.format("\"%s\"", s);
			}
			completion(c);
		}

		public void completion(String... completions) {
			if (completionList == null) {
				completionList = new ArrayList<String>();
			}
			completionList.addAll(Arrays.asList(completions));
		}
	}

	private List<DmdlAttributeElement> elementList = new ArrayList<DmdlAttributeElement>();

	public DMDLAttribute(String name) {
		this(name, true);
	}

	public DMDLAttribute(String name, boolean append) {
		this.name = name;
		this.append = append;
	}

	public String getName() {
		return name;
	}

	public boolean isAppend() {
		return append;
	}

	public DmdlAttributeElement add(String name, String value) {
		return add(name, value, null);
	}

	public DmdlAttributeElement addq(String name, String value) {
		return addq(name, value, null);
	}

	public DmdlAttributeElement addq(String name, String value, String version) {
		return add(name, String.format("\"%s\"", value), version);
	}

	public DmdlAttributeElement add(String name, String value, String version) {
		DmdlAttributeElement element = new DmdlAttributeElement();
		element.version = version;
		element.name = name;
		element.value = value;

		elementList.add(element);
		return element;
	}

	public DMDLAttribute dataType(String... types) {
		if (dataTypeList == null) {
			dataTypeList = new ArrayList<String>();
		}
		dataTypeList.addAll(Arrays.asList(types));

		return this;
	}

	public List<String> getDataTypeList() {
		if (dataTypeList == null) {
			return Collections.emptyList();
		}
		return dataTypeList;
	}

	public String getAddAttribute(String version) {
		List<DmdlAttributeElement> list = new ArrayList<DmdlAttributeElement>(elementList.size());
		for (DmdlAttributeElement element : elementList) {
			if (element.version == null || AsakusafwConfiguration.compareVersion(element.version, version) <= 0) {
				list.add(element);
			}
		}

		StringBuilder sb = new StringBuilder(256);
		sb.append("@");
		sb.append(getName());
		sb.append("(");

		if (list.size() <= 1) {
			for (DmdlAttributeElement element : list) {
				sb.append(element.name);
				if (element.value != null) {
					sb.append(" = ");
					sb.append(element.value);
				}
			}
		} else {
			sb.append("\n");
			for (DmdlAttributeElement element : list) {
				sb.append("  ");
				sb.append(element.name);
				if (element.value != null) {
					sb.append(" = ");
					sb.append(element.value);
				}
				sb.append(",\n");
			}
		}

		sb.append(")");
		return sb.toString();
	}

	public List<String> getRemoveAttribute() {
		return Arrays.asList("@" + getName());
	}

	public List<String> getElementNameList(String version) {
		List<String> list = new ArrayList<String>(elementList.size());
		for (DmdlAttributeElement element : elementList) {
			if (element.version == null || AsakusafwConfiguration.compareVersion(element.version, version) <= 0) {
				list.add(element.name);
			}
		}
		return list;
	}

	public List<String> getElementValueList(String name, String version) {
		for (DmdlAttributeElement element : elementList) {
			if (name.equals(element.name)) {
				return element.completionList;
			}
		}
		return null;
	}

	public static List<String> getModelNameValueList(AttributeElement element) {
		ModelDefinition model = PropertyUtil.getModelDefinition(element);
		if (model != null) {
			String modelName = model.getName();
			if (modelName != null) {
				return Arrays.asList(String.format("\"%s\"", modelName),
						String.format("\"%s\"", modelName.toUpperCase()));
			}
		}
		return null;
	}

	public static List<String> getPropertyNameValueList(AttributeElement element) {
		Property property = PropertyUtil.getProperty(element);
		if (property != null) {
			List<String> list = new ArrayList<String>();
			String propertyName = property.getName();
			if (propertyName != null) {
				list.add(String.format("\"%s\"", propertyName));
				list.add(String.format("\"%s\"", propertyName.toUpperCase()));
			}
			String desc = PropertyUtil.getDecodedDescription(property);
			if (desc != null) {
				list.add(String.format("\"%s\"", desc));
			}
			return list;
		}
		return null;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

public class GetModelPropertyName {

	public static GetModelPropertyName create(String action) {
		if (action == null) {
			action = "SimpleName/vertical";
		}
		GetModelPropertyName getter = create0(action);

		if (getter != null) {
			getter.setVertical(action.contains("vertical"));
		}

		return getter;
	}

	private static GetModelPropertyName create0(String action) {
		boolean name = action.contains("SimpleName");
		boolean java = action.contains("JavaName");
		boolean desc = action.contains("Description");
		boolean type = action.contains("DataType");
		return new GetModelPropertyName(name, java, desc, type);
	}

	private final boolean putName;
	private final boolean putJava;
	private final boolean putDesc;
	private final boolean putType;

	private boolean vertical;

	private final List<StringBuilder> list = new ArrayList<StringBuilder>();
	private StringBuilder names;
	private StringBuilder javas;
	private StringBuilder descs;
	private StringBuilder types;

	public GetModelPropertyName(boolean name, boolean javaName, boolean desc, boolean type) {
		this.putName = name;
		this.putJava = javaName;
		this.putDesc = desc;
		this.putType = type;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;

		if (!vertical) {
			if (putDesc) {
				list.add(descs = new StringBuilder());
			}
			if (putName) {
				list.add(names = new StringBuilder());
			}
			if (putJava) {
				list.add(javas = new StringBuilder());
			}
			if (putType) {
				list.add(types = new StringBuilder());
			}
		}
	}

	public void append(ModelDefinition model) {
		if (vertical) {
			StringBuilder sb = new StringBuilder();
			if (putDesc) {
				appendTo(sb, ModelUtil.getDecodedDescription(model));
			}
			if (putName) {
				appendTo(sb, model.getName());
			}
			if (putJava) {
				appendTo(sb, StringUtil.toCamelCase(model.getName()));
			}
			if (putType) {
				appendTo(sb, null);
			}
			list.add(sb);
			return;
		}

		if (putDesc) {
			appendTo(descs, ModelUtil.getDecodedDescription(model));
		}
		if (putName) {
			appendTo(names, model.getName());
		}
		if (putJava) {
			appendTo(javas, StringUtil.toCamelCase(model.getName()));
		}
		if (putType) {
			appendTo(types, null);
		}
	}

	public void append(Property property) {
		if (vertical) {
			StringBuilder sb = new StringBuilder();
			if (putDesc) {
				appendTo(sb, PropertyUtil.getDecodedDescription(property));
			}
			if (putName) {
				appendTo(sb, property.getName());
			}
			if (putJava) {
				appendTo(sb, StringUtil.toCamelCase(property.getName()));
			}
			if (putType) {
				appendTo(sb, PropertyUtil.getResolvedDataTypeText(property));
			}
			list.add(sb);
			return;
		}

		if (putDesc) {
			appendTo(descs, PropertyUtil.getDecodedDescription(property));
		}
		if (putName) {
			appendTo(names, property.getName());
		}
		if (putJava) {
			appendTo(javas, StringUtil.toCamelCase(property.getName()));
		}
		if (putType) {
			appendTo(types, PropertyUtil.getResolvedDataTypeText(property));
		}
	}

	protected final void appendTo(StringBuilder sb, String s) {
		if (s == null) {
			s = "";
		}
		sb.append(s);
		sb.append('\t');
	}

	private String result = null;

	public final String getText() {
		if (result == null) {
			result = createText();
		}
		return result;
	}

	private String createText() {
		if (list.isEmpty()) {
			return null;
		}
		if (list.size() == 1) {
			StringBuilder s = list.get(0);
			s.setLength(s.length() - 1);
			return s.toString();
		}

		int len = 0;
		for (CharSequence s : list) {
			len += s.length() + 1;
		}
		StringBuilder sb = new StringBuilder(len);

		boolean first = true;
		for (StringBuilder s : list) {
			if (first) {
				first = false;
			} else {
				sb.append('\n');
			}

			s.setLength(s.length() - 1);
			sb.append(s);
		}
		return sb.toString();
	}
}

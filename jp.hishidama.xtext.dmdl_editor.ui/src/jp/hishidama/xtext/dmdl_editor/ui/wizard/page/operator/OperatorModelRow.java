package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorModelRow {
	private static final String MODEL_CLASS_DELIMITTER = " & ";

	public String name;
	public String comment;
	private String modelClassName;
	public String modelName;
	public String modelDescription;
	public boolean projective;
	public String genericsName;

	public void setModelClassName(String modelClassName) {
		this.modelClassName = modelClassName;
	}

	public String getModelClassName() {
		return modelClassName;
	}

	public String[] getModelClassNames() {
		return modelClassName.split(MODEL_CLASS_DELIMITTER);
	}

	public static String catModelClassName(String s, String name) {
		if (name == null) {
			return s;
		}
		if (s == null) {
			return name;
		} else {
			return s + MODEL_CLASS_DELIMITTER + name;
		}
	}

	public String getModelTypeName() {
		if (projective) {
			return genericsName;
		}
		return modelClassName;
	}

	public String getLabel() {
		if (comment != null) {
			return comment;
		}
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}
}

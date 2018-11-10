package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowpartClassModifier.FlowPartClassModifierRow;

public class FlowpartModelRow implements Cloneable, FlowPartClassModifierRow {
	private static final String MODEL_CLASS_DELIMITTER = " & ";
	public static final String MODEL_NAME_DELIMITTER = " + ";
	private static final String MODEL_DESC_DELIMITTER = ", ";

	public boolean in;
	public String name;
	public String comment;
	private String modelClassName;
	public String modelName;
	public String modelDescription;
	public String genericsName;

	public String getIn() {
		return in ? "in" : "out";
	}

	public String getName() {
		return name;
	}

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

	public static String catModelName(String s, String name) {
		assert name != null;
		if (s == null) {
			return name;
		} else {
			return s + MODEL_NAME_DELIMITTER + name;
		}
	}

	public static String catModelDescription(String s, String description) {
		assert description != null;
		if (s == null || s.isEmpty()) {
			return description;
		} else {
			if (!description.isEmpty()) {
				return s + MODEL_DESC_DELIMITTER + description;
			}
			return s;
		}
	}

	public boolean isGenerics() {
		return genericsName != null && !genericsName.isEmpty();
	}

	public String getModelTypeName() {
		if (isGenerics()) {
			return genericsName;
		}
		return modelClassName;
	}

	public String getLabel() {
		if (StringUtil.nonEmpty(comment)) {
			return comment;
		}
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}

	@Override
	protected FlowpartModelRow clone() {
		try {
			return (FlowpartModelRow) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}

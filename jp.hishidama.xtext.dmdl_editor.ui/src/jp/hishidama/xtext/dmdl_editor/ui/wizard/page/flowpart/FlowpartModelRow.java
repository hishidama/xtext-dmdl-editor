package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class FlowpartModelRow implements Cloneable {
	public boolean in;
	public String name;
	public String comment;
	private String modelClassName;
	public String modelName;
	public String modelDescription;
	public boolean projective;
	public String genericsName;

	public String getIn() {
		return in ? "in" : "out";
	}

	public void setModelClassName(String modelClassName) {
		this.modelClassName = modelClassName;
	}

	public String getModelClassName() {
		return modelClassName;
	}

	public String getModelTypeName() {
		if (projective) {
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

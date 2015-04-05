package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorModelRow {
	public String name;
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

	public String getModelTypeName() {
		if (projective) {
			return genericsName;
		}
		return modelClassName;
	}

	public String getLabel() {
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorOutputModelRow extends OperatorModelRow {

	public String getLabel() {
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}
}

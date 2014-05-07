package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorInputModelRow {
	public String name;
	public String modelClassName;
	public String modelName;
	public String modelDescription;
	public List<String> keyList;
	public List<String> orderList;

	public String getLabel() {
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}

	public String getKeyText() {
		return StringUtil.mkString(keyList);
	}

	public String getOrderText() {
		return StringUtil.mkString(orderList);
	}
}

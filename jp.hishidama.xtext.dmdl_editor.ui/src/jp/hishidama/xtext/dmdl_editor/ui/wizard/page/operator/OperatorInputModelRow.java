package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorInputModelRow extends OperatorModelRow {
	public List<String> keyList;
	public List<String> orderList;

	public String getKeyText() {
		return StringUtil.mkString(keyList);
	}

	public String getOrderText() {
		return StringUtil.mkString(orderList);
	}
}

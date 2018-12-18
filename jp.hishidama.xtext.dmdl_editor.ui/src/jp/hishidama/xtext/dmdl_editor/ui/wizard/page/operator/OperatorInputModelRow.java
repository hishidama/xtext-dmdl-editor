package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class OperatorInputModelRow extends OperatorModelRow {
	public List<String> keyList;
	public List<String> orderList;
	public boolean spill = false;
	public boolean once = false;
	public String listClassName = "java.util.List";

	public String getKeyText() {
		return StringUtil.mkString(keyList);
	}

	public String getOrderText() {
		return StringUtil.mkString(orderList);
	}
}

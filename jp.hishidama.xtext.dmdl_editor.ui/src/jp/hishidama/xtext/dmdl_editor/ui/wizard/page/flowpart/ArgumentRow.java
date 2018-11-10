package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowpartClassModifier.FlowPartClassModifierRow;

public class ArgumentRow implements Cloneable, FlowPartClassModifierRow {
	public String name;
	public String type;
	public String comment;

	public String getName() {
		return name;
	}

	public String getLabel() {
		if (StringUtil.nonEmpty(comment)) {
			return comment;
		}
		return "TODO " + name;
	}

	@Override
	protected ArgumentRow clone() {
		try {
			return (ArgumentRow) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}

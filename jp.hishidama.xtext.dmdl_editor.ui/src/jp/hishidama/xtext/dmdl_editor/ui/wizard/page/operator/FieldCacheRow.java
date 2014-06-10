package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class FieldCacheRow {
	public String name;
	public String modelClassName;
	public String modelName;
	public String modelDescription;

	public String getLabel() {
		if (StringUtil.nonEmpty(modelDescription)) {
			return modelDescription;
		}
		return modelName;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class JobflowPorterRow implements Cloneable {
	public boolean in;
	public String name = "";
	public String comment = "";
	public String porterClassName = "";
	public String modelClassName = "";
	public String modelName = "";
	public String modelDescription;

	public String getIn() {
		return in ? "Importer" : "Exporter";
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
	protected JobflowPorterRow clone() {
		try {
			return (JobflowPorterRow) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}

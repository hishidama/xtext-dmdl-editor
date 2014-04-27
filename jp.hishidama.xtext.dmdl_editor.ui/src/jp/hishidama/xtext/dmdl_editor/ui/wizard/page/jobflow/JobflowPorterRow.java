package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

public class JobflowPorterRow {
	public boolean in;
	public String name = "";
	public String porterClassName = "";
	public String modelClassName = "";
	public String modelName = "";
	public String modelDescription;

	public String getIn() {
		return in ? "Importer" : "Exporter";
	}
}

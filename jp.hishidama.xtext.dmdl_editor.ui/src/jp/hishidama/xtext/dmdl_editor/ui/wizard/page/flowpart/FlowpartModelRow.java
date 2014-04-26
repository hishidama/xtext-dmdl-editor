package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

public class FlowpartModelRow {
	public boolean in;
	public String name;
	public String modelClassName;
	public String modelName;
	public String modelDescription;

	public String getIn() {
		return in ? "in" : "out";
	}
}

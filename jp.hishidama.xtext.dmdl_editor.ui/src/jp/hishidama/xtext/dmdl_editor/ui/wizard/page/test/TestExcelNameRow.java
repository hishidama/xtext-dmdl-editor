package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

public class TestExcelNameRow {
	public boolean in;
	public String name;
	public String modelClassName;
	public String modelName;
	public String modelDescription;
	public String excelDstFileName;
	public String sheetName;
	public String ruleName;

	public String getIn() {
		return in ? "In" : "Out";
	}
}

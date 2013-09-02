package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

public enum DataModelType {
	NORMAL, SUMMARIZED, JOINED, PROJECTIVE;

	public String displayName() {
		return name().toLowerCase();
	}
}

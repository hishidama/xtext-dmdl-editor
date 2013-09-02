package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

public abstract class DataModelRow {

	public abstract String getText(int columnIndex);

	public abstract Object getValue(String property);

	public abstract boolean modify(String property, Object value);

	public abstract String validate();

	protected static String nonNull(String s) {
		return (s != null) ? s : "";
	}
}

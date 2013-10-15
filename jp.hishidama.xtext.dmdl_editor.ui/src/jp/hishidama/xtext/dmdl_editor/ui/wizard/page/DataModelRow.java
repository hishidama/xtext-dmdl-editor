package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

public abstract class DataModelRow {

	protected String name;
	protected String description;
	protected String dataType;
	protected String refModelName;
	protected String refPropertyName;
	protected String attribute;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRefModelName() {
		return refModelName;
	}

	public void setRefModelName(String refModelName) {
		this.refModelName = refModelName;
	}

	public String getRefPropertyName() {
		return refPropertyName;
	}

	public void setRefPropertyName(String refProperty) {
		this.refPropertyName = refProperty;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public abstract String getText(int columnIndex);

	public abstract String validate();
}

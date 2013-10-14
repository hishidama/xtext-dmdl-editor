package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

public abstract class DataModelRow {
	public static final String TP_NAME = "name";
	public static final String TP_DESC = "description";
	public static final String TP_DATATYPE = "dataType";
	public static final String TP_REF_MODEL = "refModel";
	public static final String TP_REF_PROPERTY = "refProperty";

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

	public abstract Object getValue(String property);

	public abstract boolean modify(String property, Object value);

	public abstract String validate();
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.text.MessageFormat;
import java.util.Map;

import static jp.hishidama.eclipse_plugin.util.StringUtil.*;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Table;

class DataModelNormalRow extends DataModelRow {
	public static final String[] DATA_TYPE = { "INT", "LONG", "FLOAT", "DOUBLE", "TEXT", "DECIMAL", "DATE", "DATETIME",
			"BOOLEAN", "BYTE", "SHORT" };

	@Override
	public String getText(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return name;
		case 1:
			return description;
		case 2:
			return dataType;
		case 3:
			return refModelName;
		default:
			throw new UnsupportedOperationException(MessageFormat.format("index={0}", columnIndex));
		}
	}

	private static Map<String, Integer> dataTypeComboMap;

	@Override
	public Object getValue(String property) {
		if (property.equals(TP_NAME)) {
			return nonNull(name);
		}
		if (property.equals(TP_DESC)) {
			return nonNull(description);
		}
		if (property.equals(TP_DATATYPE)) {
			dataTypeComboMap = CreateDataModelPage.getComboIndexMap(dataTypeComboMap, DATA_TYPE);
			Integer n = dataTypeComboMap.get(dataType);
			if (n == null) {
				return -1;
			}
			return n;
		}
		if (property.equals(TP_REF_MODEL)) {
			return nonNull(refModelName);
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public boolean modify(String property, Object value) {
		if (property.equals(TP_NAME)) {
			String text = ((String) value).trim();
			this.name = text;
			return true;
		}
		if (property.equals(TP_DESC)) {
			String text = ((String) value).trim();
			this.description = text;
			return false;
		}
		if (property.equals(TP_DATATYPE)) {
			int n = (Integer) value;
			if (0 <= n && n < DATA_TYPE.length) {
				this.dataType = DATA_TYPE[n];
			}
			return true;
		}
		if (property.equals(TP_REF_MODEL)) {
			String text = ((String) value).trim();
			this.refModelName = text;
			return true;
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public String validate() {
		if (nonEmpty(name)) {
			IStatus status = ValidationUtil.validateName("プロパティー名", name);
			if (!status.isOK()) {
				return status.getMessage();
			}
		}
		if (isEmpty(refModelName)) {
			if (isEmpty(name)) {
				return "プロパティー名は必須です。";
			}
			if (isEmpty(dataType)) {
				return "プロパティーの型は必須です。";
			}
		}
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getDataType() {
		return dataType;
	}
}

public class CreateDataModelNormalPage extends CreateDataModelMainPage<DataModelNormalRow> {

	public CreateDataModelNormalPage() {
		this("CreateDataModelNormalPage", "データモデルの定義", "データモデルを定義して下さい。");
	}

	protected CreateDataModelNormalPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName, pageTitle, pageDescription);
	}

	@Override
	protected void defineColumns(Table table) {
		addColumn("name", 128, DataModelNormalRow.TP_NAME, new TextCellEditor(table));
		addColumn("description", 128, DataModelNormalRow.TP_DESC, new TextCellEditor(table));
		addColumn("type", 96, DataModelNormalRow.TP_DATATYPE, new ComboBoxCellEditor(table,
				DataModelNormalRow.DATA_TYPE));
		addColumn("ref model", 128, DataModelNormalRow.TP_REF_MODEL, new TextCellEditor(table));
	}

	@Override
	protected DataModelNormalRow newAddRow() {
		return new DataModelNormalRow();
	}

	@Override
	protected boolean doEditDialog(DataModelNormalRow row) {
		EditNormalPropertyDialog dialog = new EditNormalPropertyDialog(getShell(), project, row);
		return dialog.open() == Window.OK;
	}

	@Override
	protected String getCopyToolTipText() {
		return "データモデルのプロパティーをコピーします。\n" + "例えばp1とp2をコピーすると、\n" + "model = { p1:TYPE; p2:TYPE; };\n" + "となります。";
	}

	@Override
	protected DataModelNormalRow newCopyRow(ModelDefinition model, Property prop) {
		DataModelNormalRow row = new DataModelNormalRow();
		row.name = prop.getName();
		row.description = DMDLStringUtil.decodeDescription(prop.getDescription());
		row.dataType = PropertyUtil.getResolvedDataTypeText(prop);
		return row;
	}

	@Override
	protected DataModelNormalRow newDefCopyRow(ModelDefinition model, Property prop, boolean copyAttribute) {
		DataModelNormalRow row = newCopyRow(model, prop);
		if (copyAttribute) {
			row.attribute = PropertyUtil.getAttributeString(prop);
		}
		return row;
	}

	@Override
	protected String getReferenceToolTipText() {
		return "データモデルの参照を作成します。\n" + "例えばm1とm2を参照すると、\n" + "model = m1 + m2;\n" + "となります。";
	}

	@Override
	protected boolean enableReference(ModelDefinition model, Property prop) {
		return model != null;
	}

	@Override
	protected DataModelNormalRow newReferenceRow(ModelDefinition model, Property prop) {
		DataModelNormalRow row = new DataModelNormalRow();
		row.refModelName = model.getName();
		return row;
	}

	@Override
	protected String getDefineEmptyMessage() {
		return null;
	}

	@Override
	protected String getModelType() {
		return null;
	}

	@Override
	protected void setGeneratorProperty(DataModelTextGenerator gen, DataModelNormalRow row) {
		if (nonEmpty(row.dataType)) {
			gen.appendProperty(row.name, row.description, row.dataType, row.attribute);
		} else if (nonEmpty(row.refModelName)) {
			gen.appendRefProperty(row.refModelName);
		} else {
			gen.appendProperty(row.name, row.description, row.dataType, row.attribute);
		}
	}
}

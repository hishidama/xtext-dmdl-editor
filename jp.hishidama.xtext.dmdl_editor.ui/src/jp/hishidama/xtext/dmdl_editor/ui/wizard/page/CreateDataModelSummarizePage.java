package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.text.MessageFormat;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Table;
import org.eclipse.xtext.EcoreUtil2;

class DataModelSummarizeRow extends DataModelRow {
	public static final String TP_KEY = "key";
	public static final String TP_NAME = "name";
	public static final String TP_DESC = "description";
	public static final String TP_SUM_TYPE = "sumType";
	public static final String TP_REF_MODEL = "refModel";
	public static final String TP_REF_PROPERTY = "refProperty";
	public static final String[] SUM_TYPE = { "any", "sum", "min", "max", "count" };

	public boolean key;
	public String name;
	public String description;
	public String sumType;
	public String refModelName;
	public String refProperty;

	@Override
	public String getText(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return key ? "key" : "";
		case 1:
			return name;
		case 2:
			return description;
		case 3:
			return sumType;
		case 4:
			return refModelName;
		case 5:
			return refProperty;
		default:
			throw new UnsupportedOperationException(MessageFormat.format("index={0}", columnIndex));
		}
	}

	private static Map<String, Integer> sumTypeComboMap;

	@Override
	public Object getValue(String property) {
		if (property.equals(TP_KEY)) {
			return key;
		}
		if (property.equals(TP_NAME)) {
			return nonNull(name);
		}
		if (property.equals(TP_DESC)) {
			return nonNull(description);
		}
		if (property.equals(TP_SUM_TYPE)) {
			sumTypeComboMap = CreateDataModelPage.getComboIndexMap(sumTypeComboMap, SUM_TYPE);
			Integer n = sumTypeComboMap.get(sumType);
			if (n == null) {
				return -1;
			}
			return n;
		}
		if (property.equals(TP_REF_MODEL)) {
			return nonNull(refModelName);
		}
		if (property.equals(TP_REF_PROPERTY)) {
			return nonNull(refProperty);
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public boolean modify(String property, Object value) {
		if (property.equals(TP_KEY)) {
			this.key = (Boolean) value;
			return false;
		}
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
		if (property.equals(TP_SUM_TYPE)) {
			int n = (Integer) value;
			if (0 <= n && n < SUM_TYPE.length) {
				this.sumType = SUM_TYPE[n];
			}
			return true;
		}
		if (property.equals(TP_REF_MODEL)) {
			String text = ((String) value).trim();
			this.refModelName = text;
			return true;
		}
		if (property.equals(TP_REF_PROPERTY)) {
			String text = ((String) value).trim();
			this.refProperty = text;
			return true;
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public String validate() {
		if (StringUtil.isEmpty(name) && StringUtil.isEmpty(refProperty)) {
			return "プロパティー名は必須です。";
		}
		if (StringUtil.nonEmpty(name)) {
			IStatus status = ValidationUtil.validateName("プロパティー名", name);
			if (!status.isOK()) {
				return status.getMessage();
			}
		}
		if (StringUtil.isEmpty(sumType)) {
			return "集約関数は必須です。";
		}
		if (StringUtil.isEmpty(refModelName)) {
			return "集計元データモデルは必須です。";
		}
		return null;
	}
}

public class CreateDataModelSummarizePage extends CreateDataModelMainPage<DataModelSummarizeRow> {

	public CreateDataModelSummarizePage() {
		super("CreateDataModelNormalPage", "集計データモデルの定義", "集計データモデルを定義して下さい。");
	}

	@Override
	protected String getSourceLabelText() {
		return "集計対象データモデルの候補";
	}

	@Override
	protected void defineColumns(Table table) {
		addColumn("key", 40, DataModelSummarizeRow.TP_KEY, new CheckboxCellEditor(table));
		addColumn("name", 128, DataModelSummarizeRow.TP_NAME, new TextCellEditor(table));
		addColumn("description", 128, DataModelSummarizeRow.TP_DESC, new TextCellEditor(table));
		addColumn("aggregate", 64, DataModelSummarizeRow.TP_SUM_TYPE, new ComboBoxCellEditor(table,
				DataModelSummarizeRow.SUM_TYPE));
		addColumn("src model", 128, DataModelSummarizeRow.TP_REF_MODEL, new TextCellEditor(table));
		addColumn("src property", 128, DataModelSummarizeRow.TP_REF_PROPERTY, new TextCellEditor(table));
	}

	@Override
	protected DataModelSummarizeRow newAddRow() {
		return new DataModelSummarizeRow();
	}

	@Override
	protected String getCopyToolTipText() {
		return "データモデルのプロパティーを集計対象にします。\n" + "例えばp1とp2をコピーすると、\n"
				+ "summarized model = src => { any p1->p1; any p2->p2; }\n" + "となります。";
	}

	@Override
	protected DataModelSummarizeRow newCopyRow(ModelDefinition model, Property prop) {
		DataModelSummarizeRow row = new DataModelSummarizeRow();
		row.name = prop.getName();
		row.description = DMDLStringUtil.decodeDescription(prop.getDescription());
		row.sumType = "any";
		row.refModelName = model.getName();
		row.refProperty = prop.getName();
		row.key = false;
		return row;
	}

	@Override
	protected boolean visibleDefCopy() {
		return true;
	}

	@Override
	protected String getDefCopyToolTipText() {
		return "集計データモデルの定義をコピーします。";
	}

	@Override
	protected boolean enableDefCopy(ModelDefinition model, Property prop) {
		return "summarized".equals(model.getType());
	}

	@Override
	protected DataModelSummarizeRow newDefCopyRow(ModelDefinition model, Property prop) {
		DataModelSummarizeRow row = new DataModelSummarizeRow();
		row.name = prop.getName();
		row.description = DMDLStringUtil.decodeDescription(prop.getDescription());

		if (prop instanceof PropertyFolding) {
			PropertyFolding folding = (PropertyFolding) prop;
			row.sumType = folding.getAggregator();
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(folding.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refProperty = folding.getFrom().getName();
			row.key = ModelUtil.containsSummarizeKey(model, row.name);
		} else if (prop instanceof PropertyMapping) {
			PropertyMapping mapping = (PropertyMapping) prop;
			row.sumType = "any";
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(mapping.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refProperty = mapping.getFrom().getName();
			row.key = ModelUtil.containsSummarizeKey(model, row.name);
		} else {
			row.sumType = "any";
			row.refModelName = model.getName();
			row.refProperty = prop.getName();
			row.key = false;
		}

		return row;
	}

	@Override
	protected boolean visibleReference() {
		return false;
	}

	@Override
	protected String validateOther() {
		String refModelName = null;
		for (DataModelSummarizeRow row : defineList) {
			if (refModelName == null) {
				refModelName = row.refModelName;
				continue;
			}
			if (!refModelName.equals(row.refModelName)) {
				return "集計元データモデルは全てのプロパティーで同一である必要があります。";
			}
		}
		return null;
	}

	@Override
	protected String getModelType() {
		return "summarized";
	}

	@Override
	protected void setGeneratorProperty(DataModelTextGenerator gen, DataModelSummarizeRow row) {
		gen.appendSumProperty(row.name, row.description, row.sumType, row.refModelName, row.refProperty);
		if (row.key) {
			gen.appendKey(row.name, row.refProperty);
		}
	}
}

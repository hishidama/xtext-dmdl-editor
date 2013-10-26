package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import static jp.hishidama.eclipse_plugin.util.StringUtil.isEmpty;
import static jp.hishidama.eclipse_plugin.util.StringUtil.nonEmpty;

import java.text.MessageFormat;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Table;
import org.eclipse.xtext.EcoreUtil2;

class DataModelSummarizeRow extends DataModelRow {

	public boolean key;
	public String sumType;

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
			return refPropertyName;
		default:
			throw new UnsupportedOperationException(MessageFormat.format("index={0}", columnIndex));
		}
	}

	@Override
	public String validate() {
		if (isEmpty(name) && isEmpty(refPropertyName)) {
			return "プロパティー名は必須です。";
		}
		if (nonEmpty(name)) {
			IStatus status = ValidationUtil.validateName("プロパティー名", name);
			if (!status.isOK()) {
				return status.getMessage();
			}
		}
		if (isEmpty(sumType)) {
			return "集約関数は必須です。";
		}
		if (isEmpty(refModelName)) {
			return "集計元データモデルは必須です。";
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
		addColumn("key", 40);
		addColumn("name", 128);
		addColumn("description", 128);
		addColumn("aggregate", 64);
		addColumn("src model", 128);
		addColumn("src property", 128);
	}

	@Override
	protected DataModelSummarizeRow newAddRow() {
		return new DataModelSummarizeRow();
	}

	@Override
	protected boolean doEditDialog(DataModelSummarizeRow row) {
		String initialModelName = row.getRefModelName();
		if (StringUtil.isEmpty(initialModelName)) {
			for (int i = defineList.size() - 1; i >= 0; i--) {
				DataModelSummarizeRow r = defineList.get(i);
				if (StringUtil.nonEmpty(r.getRefModelName())) {
					initialModelName = r.getRefModelName();
					break;
				}
			}
		}

		EditSummarizePropertyDialog dialog = new EditSummarizePropertyDialog(getShell(), project, row, initialModelName);
		return dialog.open() == Window.OK;
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
		row.description = PropertyUtil.getDecodedDescription(prop);
		row.sumType = "any";
		row.refModelName = model.getName();
		row.refPropertyName = prop.getName();
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
	protected DataModelSummarizeRow newDefCopyRow(ModelDefinition model, Property prop, boolean copyAttribute) {
		DataModelSummarizeRow row = new DataModelSummarizeRow();
		row.name = prop.getName();
		row.description = PropertyUtil.getDecodedDescription(prop);
		if (copyAttribute) {
			row.attribute = PropertyUtil.getAttributeString(prop);
		}

		if (prop instanceof PropertyFolding) {
			PropertyFolding folding = (PropertyFolding) prop;
			row.sumType = folding.getAggregator();
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(folding.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refPropertyName = folding.getFrom().getName();
			row.key = ModelUtil.containsSummarizeKey(model, row.name);
		} else if (prop instanceof PropertyMapping) {
			PropertyMapping mapping = (PropertyMapping) prop;
			row.sumType = "any";
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(mapping.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refPropertyName = mapping.getFrom().getName();
			row.key = ModelUtil.containsSummarizeKey(model, row.name);
		} else {
			row.sumType = "any";
			row.refModelName = model.getName();
			row.refPropertyName = prop.getName();
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
		gen.appendSumProperty(row.name, row.description, row.sumType, row.refModelName, row.refPropertyName,
				row.attribute);
		if (row.key) {
			gen.appendKey(row.name, row.refPropertyName);
		}
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import static jp.hishidama.eclipse_plugin.util.StringUtil.isEmpty;
import static jp.hishidama.eclipse_plugin.util.StringUtil.nonEmpty;

import java.text.MessageFormat;
import java.util.Collection;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ErrorStatus;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.window.Window;

class DataModelRecordRow extends DataModelRow {

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

	@Override
	public IStatus validate() {
		IStatus warning = Status.OK_STATUS;
		if (nonEmpty(name)) {
			IStatus status = ValidationUtil.validateName("プロパティー名", name);
			if (status.getSeverity() == IStatus.ERROR) {
				return status;
			}
			if (status.getSeverity() == IStatus.WARNING) {
				warning = status;
			}
		}
		if (isEmpty(refModelName)) {
			if (isEmpty(name)) {
				return new ErrorStatus("プロパティー名は必須です。");
			}
			if (isEmpty(dataType)) {
				return new ErrorStatus("プロパティーの型は必須です。");
			}
		}
		return warning;
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

public class CreateDataModelRecordPage extends CreateDataModelMainPage<DataModelRecordRow> {

	public CreateDataModelRecordPage() {
		this("CreateDataModelRecordPage", "データモデルの定義", "データモデルを定義して下さい。");
	}

	protected CreateDataModelRecordPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName, pageTitle, pageDescription);
	}

	@Override
	protected void defineColumns() {
		addColumn("name", 128);
		addColumn("description", 128);
		addColumn("type", 96);
		addColumn("ref model", 128);
	}

	@Override
	protected String createModelNameFilter(Collection<String> modelNames) {
		if (modelName == null) {
			return null;
		}
		return "^" + modelName + "$";
	}

	@Override
	protected DataModelRecordRow newAddRow() {
		return new DataModelRecordRow();
	}

	@Override
	protected boolean doEditDialog(DataModelRecordRow row) {
		EditRecordPropertyDialog dialog = new EditRecordPropertyDialog(getShell(), project, row);
		return dialog.open() == Window.OK;
	}

	@Override
	protected String getCopyToolTipText() {
		return "データモデルのプロパティーをコピーします。\n" + "例えばp1とp2をコピーすると、\n" + "model = { p1:TYPE; p2:TYPE; };\n" + "となります。";
	}

	@Override
	protected DataModelRecordRow newCopyRow(ModelDefinition model, Property prop) {
		DataModelRecordRow row = new DataModelRecordRow();
		row.name = prop.getName();
		row.description = PropertyUtil.getDecodedDescription(prop);
		row.dataType = PropertyUtil.getResolvedDataTypeText(prop);
		return row;
	}

	@Override
	protected DataModelRecordRow newDefCopyRow(ModelDefinition model, Property prop, boolean copyAttribute) {
		DataModelRecordRow row = newCopyRow(model, prop);
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
	protected DataModelRecordRow newReferenceRow(ModelDefinition model, Property prop) {
		DataModelRecordRow row = new DataModelRecordRow();
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
	protected void setGeneratorProperty(DataModelTextGenerator gen, DataModelRecordRow row) {
		if (nonEmpty(row.dataType)) {
			gen.appendProperty(row.name, row.description, row.dataType, row.attribute);
		} else if (nonEmpty(row.refModelName)) {
			gen.appendRefProperty(row.refModelName);
		} else {
			gen.appendProperty(row.name, row.description, row.dataType, row.attribute);
		}
	}
}

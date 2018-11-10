package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelMultiSelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SelectOperatorOutputModelPage extends SelectOperatorModelPage<OperatorOutputModelRow> {

	private boolean isResult = false;

	public SelectOperatorOutputModelPage(IProject project, OperatorType opType) {
		this(project, opType, null);
	}

	public SelectOperatorOutputModelPage(IProject project, OperatorType opType, String description) {
		super("SelectOperatorOutputModelPage", project);

		setTitle(MessageFormat.format("{0}の出力モデルの指定", opType.getName()));
		if (description == null) {
			description = "演算子の出力となるデータモデルを選択して下さい。";
		}
		setDescription(description);
	}

	public void setOutputIsResult(boolean b) {
		this.isResult = b;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		createLabel(composite, "data model:");
		table = new ModelTable(composite);
		switch (roleList.size()) {
		case 0:
			break;
		case 1:
			table.setEnableButton(false, true, false, false);
			break;
		default:
			table.setEnableButton(false, true, true, false);
			break;
		}
		table.addColumn("role", 64, SWT.NONE);
		table.addColumn("generics name", 32, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);

		for (int i = 0; i < roleList.size(); i++) {
			OperatorOutputModelRow row = new OperatorOutputModelRow();
			table.addItem(row);
		}

		table.refresh();

		return composite;
	}

	protected class ModelTable extends ModifiableTable<OperatorOutputModelRow> {

		public ModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(OperatorOutputModelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return getRoleName(element);
			case 1:
				return element.genericsName;
			case 2:
				return element.name;
			case 3:
				return element.modelName;
			case 4:
				return element.modelDescription;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			DmdlModelMultiSelectionDialog dialog = new DmdlModelMultiSelectionDialog(getShell(), project);
			if (joinOnly) {
				dialog.setJoinModelOnly();
			} else if (summarizeOnly) {
				dialog.setSummarizeModelOnly();
			}
			if (dialog.open() != Window.OK) {
				return;
			}

			List<ModelDefinition> list = dialog.getSelectedDataModelList();
			for (ModelDefinition model : list) {
				String modelName = model.getName();

				OperatorOutputModelRow row = createElement();
				row.name = StringUtil.toLowerCamelCase(modelName);
				row.setModelClassName(ModelUiUtil.getModelClassName(project, modelName));
				row.modelName = modelName;
				row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
				row.projective = ModelUtil.isProjective(model);
				if (row.projective) {
					row.genericsName = modelName.substring(0, 1).toUpperCase();
				}
				super.doAdd(row);
			}
		}

		@Override
		protected OperatorOutputModelRow createElement() {
			return new OperatorOutputModelRow();
		}

		@Override
		protected void editElement(OperatorOutputModelRow element) {
			OperatorOutputModelDialog dialog = new OperatorOutputModelDialog(getShell(), project, getRoleName(element), element, joinOnly, summarizeOnly);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(isVisible());
		}
	}

	@Override
	protected String validate(OperatorOutputModelRow row, int i) {
		String message = super.validate(row, i);
		if (message != null) {
			return message;
		}

		boolean genericsNameFound = false;

		int j = 1;
		for (OperatorInputModelRow inputRow : getInputElementList()) {
			if (row.projective && inputRow.projective) {
				if (row.genericsName.equals(inputRow.genericsName)) {
					if (!row.modelName.equals(inputRow.modelName)) {
						return MessageFormat
								.format("型引数{1}の射影モデルが入力ページで指定されている射影モデルと一致していません。（{0,number,#}行目={2}, 入力ページ{3,number,#}行目={4}）", i, row.genericsName, row.modelName, j, inputRow.modelName);
					}
					genericsNameFound = true;
				}
			}

			j++;
		}
		if (isResult && row.projective) {
			if (!genericsNameFound) {
				return MessageFormat.format("射影モデルを使う場合、型引数が入力ページで定義されている必要があります。（{0,number,#}行目, 型引数名={1}）", i, row.genericsName);
			}
		}
		return null;
	}
}

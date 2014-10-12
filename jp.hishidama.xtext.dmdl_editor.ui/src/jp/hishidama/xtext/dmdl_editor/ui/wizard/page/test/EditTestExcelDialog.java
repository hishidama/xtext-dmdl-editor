package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;

import org.apache.poi.ss.util.WorkbookUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditTestExcelDialog extends EditDialog {

	private TestExcelNameRow row;

	private Text inText;
	private Text nameText;
	private Text modelNameText;
	private Text modelDescText;
	private Text excelText;
	private Text sheetText;
	private Text ruleText;

	public EditTestExcelDialog(Shell parentShell, TestExcelNameRow row) {
		super(parentShell, "テスト用Excelファイル編集", 3);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		inText = createTextField(composite, "In/Out");
		inText.setText(row.getIn());
		inText.setEnabled(false);
		nameText = createTextField(composite, "name");
		nameText.setText(row.name);
		nameText.setEditable(false);
		modelNameText = createTextField(composite, "model name");
		modelNameText.setText(nonNull(row.modelName));
		modelNameText.setEditable(false);
		modelDescText = createTextField(composite, "model description");
		modelDescText.setText(nonNull(row.modelDescription));
		modelDescText.setEditable(false);
		excelText = createTextField(composite, "excel filename");
		excelText.setText(nonNull(row.excelDstFileName));
		sheetText = createTextField(composite, "data sheet name");
		sheetText.setText(nonNull(row.sheetName));
		if (!row.in) {
			ruleText = createTextField(composite, "rule sheet name");
			ruleText.setText(nonNull(row.ruleName));
		}
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (!validateSheetName(sheetText.getText().trim())) {
			return false;
		}
		if (ruleText != null) {
			if (!validateSheetName(ruleText.getText().trim())) {
				return false;
			}
		}

		return true;
	}

	private boolean validateSheetName(String sheetName) {
		if (!sheetName.isEmpty()) {
			try {
				WorkbookUtil.validateSheetName(sheetName);
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.excelDstFileName = excelText.getText().trim();
		row.sheetName = sheetText.getText().trim();
		if (ruleText != null) {
			row.ruleName = ruleText.getText().trim();
		}

		super.okPressed();
	}
}

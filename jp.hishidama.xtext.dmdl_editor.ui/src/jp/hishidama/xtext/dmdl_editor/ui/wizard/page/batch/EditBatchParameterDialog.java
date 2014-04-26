package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditBatchParameterDialog extends EditDialog {

	private BatchParameterRow row;

	private Text nameText;
	private Text commentText;
	private Button requiredCheck;
	private Text patternText;

	public EditBatchParameterDialog(Shell parentShell, BatchParameterRow row) {
		super(parentShell, "バッチ実行時引数編集", 3);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		commentText = createTextField(composite, "comment");
		commentText.setText(nonNull(row.comment));
		requiredCheck = createCheckButtonField(composite, "required", "required");
		requiredCheck.setSelection(row.required);
		patternText = createTextField(composite, "pattern");
		patternText.setText(nonNull(row.pattern));
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (StringUtil.isEmpty(nameText.getText().trim())) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		row.comment = commentText.getText();
		row.required = requiredCheck.getSelection();
		row.pattern = patternText.getText();

		super.okPressed();
	}
}

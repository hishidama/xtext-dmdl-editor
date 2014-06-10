package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FieldCacheDialog extends EditDialog {

	private FieldCacheRow fieldRow;

	private Text nameText;
	private Text modelNameText;
	private Text modelDescText;

	public FieldCacheDialog(Shell parentShell, FieldCacheRow row) {
		super(parentShell, "フィールド名入力", 2);
		this.fieldRow = row;
	}

	@Override
	protected void createFields(Composite composite) {
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(fieldRow.name));
		modelNameText = createTextField(composite, "model name");
		modelNameText.setText(nonNull(fieldRow.modelName));
		modelNameText.setEditable(false);
		modelDescText = createTextField(composite, "model description");
		modelDescText.setText(nonNull(fieldRow.modelDescription));
		modelDescText.setEditable(false);
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
		fieldRow.name = nameText.getText().trim();

		super.okPressed();
	}
}

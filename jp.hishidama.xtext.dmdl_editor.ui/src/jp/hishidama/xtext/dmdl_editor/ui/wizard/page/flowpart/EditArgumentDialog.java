package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditArgumentDialog extends EditDialog {
	private static final String[] TYPE_LIST = { "boolean", "byte", "short", "int", "long", "floag", "double",
			"java.lang.String" };

	private ArgumentRow row;

	private Text nameText;
	private Combo typeCombo;
	private Text descText;

	public EditArgumentDialog(Shell parentShell, ArgumentRow row) {
		super(parentShell, "引数編集", 3);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		typeCombo = createComboField(composite, "type", TYPE_LIST);
		typeCombo.setText(nonNull(row.type));
		descText = createTextField(composite, "comment");
		descText.setText(nonNull(row.comment));
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (nameText.getText().trim().isEmpty()) {
			return false;
		}
		if (typeCombo.getText().isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		row.type = typeCombo.getText();
		row.comment = descText.getText();

		super.okPressed();
	}
}

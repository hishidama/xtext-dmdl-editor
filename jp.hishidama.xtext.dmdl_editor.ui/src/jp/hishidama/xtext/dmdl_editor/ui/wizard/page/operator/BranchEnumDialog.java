package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetBranchEnumPage.EnumRow;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class BranchEnumDialog extends EditDialog {

	private EnumRow row;

	private Text nameText;
	private Text commentText;

	public BranchEnumDialog(Shell parentShell, EnumRow row) {
		super(parentShell, "列挙定数の編集", 2);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		commentText = createTextField(composite, "comment");
		commentText.setText(nonNull(row.comment));
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
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

		super.okPressed();
	}
}

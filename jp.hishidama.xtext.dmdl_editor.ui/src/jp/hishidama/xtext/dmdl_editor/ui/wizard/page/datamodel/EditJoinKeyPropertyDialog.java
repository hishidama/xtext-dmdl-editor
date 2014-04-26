package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class EditJoinKeyPropertyDialog extends EditDialog {
	private DataModelJoinKey row;

	private List<Combo> comboList;

	public EditJoinKeyPropertyDialog(Shell parentShell, DataModelJoinKey row) {
		super(parentShell, "結合キー編集", 3);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		int columns = row.getColumns();
		comboList = new ArrayList<Combo>(columns);
		for (int i = 0; i < columns; i++) {
			String modelName = row.getModelName(i);
			String propName = row.get(modelName);
			String value = null;

			String[] ss = row.getComboList(modelName);
			for (String s : ss) {
				int n = s.indexOf(' ');
				if (n < 0) {
					if (s.equals(propName)) {
						value = s;
						break;
					}
				} else {
					if (s.substring(0, n).equals(propName)) {
						value = s;
						break;
					}
				}
			}

			String label;
			{
				String desc = row.getModelDescription(i);
				if (StringUtil.isEmpty(desc)) {
					label = modelName;
				} else {
					label = modelName + " " + desc;
				}
			}
			Combo combo = createComboField(composite, label, ss);
			comboList.add(combo);
			combo.setText(nonNull(value));
		}
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		for (Combo combo : comboList) {
			if (StringUtil.isEmpty(combo.getText())) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		for (int i = 0; i < comboList.size(); i++) {
			String name = row.getModelName(i);
			String value = comboList.get(i).getText();
			int n = value.indexOf(' ');
			if (n >= 0) {
				value = value.substring(0, n);
			}
			row.set(name, value);
		}

		super.okPressed();
	}
}

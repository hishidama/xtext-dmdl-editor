package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog;
import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditArgumentDialog extends EditDialog {
	private static final String ENUM = "enum";
	private static final String[] TYPE_LIST = { "boolean", "byte", "short", "int", "long", "floag", "double", "java.lang.String", ENUM };

	private IJavaProject javaProject;
	private ArgumentRow row;

	private Text nameText;
	private Combo typeCombo;
	private Text enumText;
	private Button enumButton;
	private Text descText;

	public EditArgumentDialog(Shell parentShell, IJavaProject javaProject, ArgumentRow row) {
		super(parentShell, "引数編集", 3);
		this.javaProject = javaProject;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		boolean isEnum = isEnum(row.type);

		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		typeCombo = createComboField(composite, "type", TYPE_LIST);
		typeCombo.setText(isEnum ? ENUM : nonNull(row.type));
		typeCombo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				refreshEnumText();
			}
		});
		TextButtonPair enumPair = createTextButtonField(composite, "enum", "Select");
		enumText = enumPair.text;
		enumText.setText(isEnum ? nonNull(row.type) : "");
		enumButton = enumPair.button;
		enumButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectEnum();
			}
		});
		refreshEnumText();

		descText = createTextField(composite, "comment");
		descText.setText(nonNull(row.comment));
	}

	private boolean isEnum(String type) {
		if (StringUtil.isEmpty(type)) {
			return false;
		}
		for (String s : TYPE_LIST) {
			if (s.equals(type) && !s.equals(ENUM)) {
				return false;
			}
		}
		return true;
	}

	private void refreshEnumText() {
		if (enumText != null) {
			boolean enable = typeCombo.getText().equals(ENUM);
			enumText.setEnabled(enable);
			enumButton.setEnabled(enable);
		}
	}

	void selectEnum() {
		ClassSelectionDialog dialog = ClassSelectionDialog.createEnum(getShell(), javaProject, null, null);
		if (dialog.open() == Window.OK) {
			enumText.setText(nonNull(dialog.getSelectedClassName()).replace('$', '.'));
		}
		validate();
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
		if (typeCombo.getText().equals(ENUM)) {
			if (enumText.getText().trim().isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		String type = typeCombo.getText();
		if (type.equals(ENUM)) {
			row.type = enumText.getText();
		} else {
			row.type = type;
		}
		row.comment = descText.getText();

		super.okPressed();
	}
}

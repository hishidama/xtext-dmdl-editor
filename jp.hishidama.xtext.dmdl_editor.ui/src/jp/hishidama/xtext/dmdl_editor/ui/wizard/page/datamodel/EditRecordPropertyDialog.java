package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelSelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditRecordPropertyDialog extends EditDialog {
	public static final String[] DATA_TYPE = { "INT", "LONG", "FLOAT", "DOUBLE", "TEXT", "DECIMAL", "DATE", "DATETIME",
			"BOOLEAN", "BYTE", "SHORT" };

	private IProject project;
	private DataModelRecordRow row;

	private Button radio1, radio2;
	private Text nameText;
	private Text descText;
	private Combo typeCombo;
	private Text refModelText;
	private Button refModelButton;

	public EditRecordPropertyDialog(Shell parentShell, IProject project, DataModelRecordRow row) {
		super(parentShell, "プロパティー編集");
		this.project = project;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		{
			Button button = new Button(composite, SWT.RADIO);
			button.setText("プロパティー");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					refreshField(true, false);
					refreshOkButton();
				}
			});
			radio1 = button;

			Group group = new Group(composite, SWT.SHADOW_IN);
			GridData grid = new GridData(GridData.FILL_HORIZONTAL);
			group.setLayoutData(grid);
			group.setLayout(new GridLayout(2, false));

			nameText = createTextField(group, "name");
			nameText.setText(nonNull(row.getName()));
			descText = createTextField(group, "description");
			descText.setText(nonNull(row.getDescription()));
			typeCombo = createComboField(group, "type", DATA_TYPE);
			typeCombo.setText(nonNull(row.getDataType()));
		}
		{
			Button button = new Button(composite, SWT.RADIO);
			button.setText("データモデル参照");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					refreshField(false, true);
					refreshOkButton();
				}
			});
			radio2 = button;

			Group group = new Group(composite, SWT.SHADOW_IN);
			GridData grid = new GridData(GridData.FILL_HORIZONTAL);
			group.setLayoutData(grid);
			group.setLayout(new GridLayout(3, false));
			TextButtonPair r = createTextButtonField(group, "reference model name", "select");
			refModelText = r.text;
			refModelText.setText(nonNull(row.getRefModelName()));
			refModelButton = r.button;
			refModelButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					referenceModel();
				}
			});
		}

		nameText.setFocus();
	}

	void refreshField(boolean enable1, boolean enable2) {
		nameText.setEnabled(enable1);
		descText.setEnabled(enable1);
		typeCombo.setEnabled(enable1);
		refModelText.setEnabled(enable2);
		refModelButton.setEnabled(enable2);
	}

	void referenceModel() {
		DmdlModelSelectionDialog dialog = new DmdlModelSelectionDialog(getShell(), project);
		dialog.setInitialModel(refModelText.getText().trim());
		if (dialog.open() == Window.OK) {
			ModelDefinition model = dialog.getSelectedDataModel();
			refModelText.setText(nonNull(model.getName()));
		}
	}

	@Override
	protected void refresh() {
		if (refModelText.getText().isEmpty()) {
			radio1.setSelection(true);
			refreshField(true, false);
		} else {
			radio2.setSelection(true);
			refreshField(false, true);
		}
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (radio1.getSelection()) {
			if (StringUtil.isEmpty(nameText.getText().trim())) {
				return false;
			}
			if (StringUtil.isEmpty(typeCombo.getText())) {
				return false;
			}
		}
		if (radio2.getSelection()) {
			if (StringUtil.isEmpty(refModelText.getText().trim())) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		if (radio1.getSelection()) {
			row.setName(nameText.getText().trim());
			row.setDescription(descText.getText());
			row.setDataType(typeCombo.getText());
			row.setRefModelName(null);
		}
		if (radio2.getSelection()) {
			row.setName(null);
			row.setDescription(null);
			row.setDataType(null);
			row.setRefModelName(refModelText.getText().trim());
		}

		super.okPressed();
	}
}

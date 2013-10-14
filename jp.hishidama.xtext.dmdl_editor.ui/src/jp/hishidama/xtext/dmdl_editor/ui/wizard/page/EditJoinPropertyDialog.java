package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlPropertySelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditJoinPropertyDialog extends EditDialog {

	private IProject project;
	private DataModelJoinRow row;
	private String initialModelName;

	private Text nameText;
	private Text descText;
	private Text refModelText;
	private Text refPropertyText;
	private Button refPropertyButton;

	public EditJoinPropertyDialog(Shell parentShell, IProject project, DataModelJoinRow row, String initialModelName) {
		super(parentShell, "プロパティー編集", 3);
		this.project = project;
		this.row = row;
		this.initialModelName = initialModelName;
	}

	@Override
	protected void createFields(Composite composite) {
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.getName()));
		descText = createTextField(composite, "description");
		descText.setText(nonNull(row.getDescription()));
		refModelText = createTextField(composite, "source model name");
		refModelText.setText(nonNull(initialModelName));
		TextButtonPair r = createTextButtonField(composite, "source property name", "select");
		refPropertyText = r.text;
		refPropertyText.setText(nonNull(row.getRefPropertyName()));
		refPropertyButton = r.button;
		refPropertyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				referenceProperty();
			}
		});
	}

	void referenceProperty() {
		DmdlPropertySelectionDialog dialog = new DmdlPropertySelectionDialog(getShell(), project);
		dialog.setInitialModel(refModelText.getText().trim());
		if (dialog.open() == Window.OK) {
			Property property = dialog.getSelectedProperty();
			refModelText.setText(nonNull(PropertyUtil.getModelName(property)));
			refPropertyText.setText(nonNull(property.getName()));
			if (nameText.getText().trim().isEmpty()) {
				nameText.setText(nonNull(property.getName()));
			}
			if (descText.getText().isEmpty()) {
				descText.setText(PropertyUtil.getDecodedDescriptionText(property));
			}
		}
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (StringUtil.isEmpty(refModelText.getText().trim())) {
			return false;
		}
		if (StringUtil.isEmpty(refPropertyText.getText().trim())) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		String name = nameText.getText().trim();
		String refName = refPropertyText.getText().trim();
		if (StringUtil.nonEmpty(name)) {
			row.setName(name);
		} else {
			row.setName(refName);
		}
		row.setDescription(descText.getText());
		row.setRefModelName(refModelText.getText().trim());
		row.setRefPropertyName(refName);

		super.okPressed();
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlPropertySelectionDialog;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditSummarizePropertyDialog extends EditDialog {
	public static final String[] SUM_TYPE = { "any", "sum", "min", "max", "count" };

	private static final String SETTINGS_AGGR = "EditSummarizePropertyDialog.aggregator";

	private IProject project;
	private DataModelSummarizeRow row;
	private String initialModelName;

	private Button keyButton;
	private Text nameText;
	private Text descText;
	private Combo aggrCombo;
	private Text refModelText;
	private Text refPropertyText;
	private Button refPropertyButton;

	public EditSummarizePropertyDialog(Shell parentShell, IProject project, DataModelSummarizeRow row,
			String initialModelName) {
		super(parentShell, "プロパティー編集", 3);
		this.project = project;
		this.row = row;
		this.initialModelName = initialModelName;
	}

	@Override
	protected void createFields(Composite composite) {
		keyButton = createCheckButtonField(composite, "key", "key");
		keyButton.setSelection(row.key);
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.getName()));
		descText = createTextField(composite, "description");
		descText.setText(nonNull(row.getDescription()));
		aggrCombo = createComboField(composite, "type", SUM_TYPE);
		aggrCombo.setText(nonNull(getInitialAggregator()));
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

	private String getInitialAggregator() {
		if (StringUtil.nonEmpty(row.sumType)) {
			return row.sumType;
		}
		IDialogSettings settings = DMDLActivator.getInstance().getDialogSettings();
		return settings.get(SETTINGS_AGGR);
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
		if (StringUtil.isEmpty(aggrCombo.getText())) {
			return false;
		}
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
		row.key = keyButton.getSelection();
		String name = nameText.getText().trim();
		String refName = refPropertyText.getText().trim();
		if (StringUtil.nonEmpty(name)) {
			row.setName(name);
		} else {
			row.setName(refName);
		}
		row.setDescription(descText.getText());
		row.sumType = aggrCombo.getText();
		row.setRefModelName(refModelText.getText().trim());
		row.setRefPropertyName(refName);

		IDialogSettings settings = DMDLActivator.getInstance().getDialogSettings();
		settings.put(SETTINGS_AGGR, row.sumType);

		super.okPressed();
	}
}

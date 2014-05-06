package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelSelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class OperatorOutputModelDialog extends EditDialog {

	private IProject project;
	private String role;
	private OperatorOutputModelRow row;
	private boolean joinOnly;
	private boolean summarizeOnly;

	private Text roleText;
	private Text nameText;
	private String modelClassName;
	private Text modelNameText;
	private Text modelDescText;

	public OperatorOutputModelDialog(Shell parentShell, IProject project, String role, OperatorOutputModelRow row,
			boolean joinOnly, boolean summarizeOnly) {
		super(parentShell, "出力データモデル選択", 3);
		this.project = project;
		this.role = role;
		this.row = row;
		this.joinOnly = joinOnly;
		this.summarizeOnly = summarizeOnly;
	}

	@Override
	protected void createFields(Composite composite) {
		roleText = createTextField(composite, "role");
		roleText.setText(nonNull(role));
		roleText.setEnabled(false);
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		modelClassName = row.modelClassName;
		TextButtonPair pair = createTextButtonField(composite, "model name", "select");
		modelNameText = pair.text;
		modelNameText.setText(nonNull(row.modelName));
		modelNameText.setEditable(false);
		pair.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectDataModel();
			}
		});
		modelDescText = createTextField(composite, "model description");
		modelDescText.setText(nonNull(row.modelDescription));
		modelDescText.setEditable(false);
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	protected void selectDataModel() {
		DmdlModelSelectionDialog dialog = new DmdlModelSelectionDialog(getShell(), project);
		if (joinOnly) {
			dialog.setJoinModelOnly();
		} else if (summarizeOnly) {
			dialog.setSummarizeModelOnly();
		}
		dialog.setInitialModel(modelNameText.getText());
		if (dialog.open() != Window.OK) {
			return;
		}

		ModelDefinition model = dialog.getSelectedDataModel();
		String modelName = nonNull(model.getName());
		modelNameText.setText(modelName);
		modelDescText.setText(ModelUtil.getDecodedDescriptionText(model));
		this.modelClassName = ModelUiUtil.getModelClassName(project, modelName);
		if (nameText.getText().trim().isEmpty()) {
			nameText.setText(StringUtil.toLowerCamelCase(modelName));
		}
	}

	@Override
	protected boolean validate() {
		if (StringUtil.isEmpty(nameText.getText().trim())) {
			return false;
		}
		if (StringUtil.isEmpty(modelNameText.getText().trim())) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		row.modelClassName = modelClassName;
		row.modelName = modelNameText.getText();
		row.modelDescription = modelDescText.getText();

		super.okPressed();
	}
}

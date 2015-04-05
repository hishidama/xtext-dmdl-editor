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

public class OperatorModelDialog<R extends OperatorModelRow> extends EditDialog {

	protected final IProject project;
	protected final String role;
	protected final R row;
	private boolean selectModel = true;
	protected final boolean joinOnly;
	protected final boolean summarizeOnly;

	private Text roleText;
	private Text nameText;
	private String modelClassName;
	private Text modelNameText;
	private Text modelDescText;
	private Text genericsNameText;

	public OperatorModelDialog(Shell parentShell, String title, IProject project, String role, R row, boolean joinOnly,
			boolean summarizeOnly) {
		super(parentShell, title, 3);
		this.project = project;
		this.role = role;
		this.row = row;
		this.joinOnly = joinOnly;
		this.summarizeOnly = summarizeOnly;
	}

	public void setSelectModel(boolean enable) {
		this.selectModel = enable;
	}

	@Override
	protected void createFields(Composite composite) {
		roleText = createTextField(composite, "role");
		roleText.setText(nonNull(role));
		roleText.setEnabled(false);

		genericsNameText = createTextField(composite, "generics name");
		genericsNameText.setText(nonNull(row.genericsName));
		genericsNameText.setEditable(row.projective);
		genericsNameText.setToolTipText("射影モデルを使う場合は、型変数名を入力して下さい。");

		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		nameText.setFocus();
		modelClassName = row.getModelClassName();
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
		pair.button.setEnabled(selectModel);
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
		selectDataModel(model, modelName);
	}

	protected void selectDataModel(ModelDefinition model, String modelName) {
		modelNameText.setText(modelName);
		modelDescText.setText(ModelUtil.getDecodedDescriptionText(model));
		this.modelClassName = ModelUiUtil.getModelClassName(project, modelName);
		if (nameText.getText().trim().isEmpty()) {
			nameText.setText(StringUtil.toLowerCamelCase(modelName));
		}
		if (ModelUtil.isProjective(model)) {
			genericsNameText.setEditable(true);
			if (genericsNameText.getText().trim().isEmpty()) {
				genericsNameText.setText(modelName.substring(0, 1).toUpperCase());
			}
		} else {
			genericsNameText.setEditable(false);
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
		if (genericsNameText.getEditable()) {
			if (StringUtil.isEmpty(genericsNameText.getText().trim())) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		row.setModelClassName(modelClassName);
		row.modelName = modelNameText.getText().trim();
		row.modelDescription = modelDescText.getText();
		row.projective = genericsNameText.getEditable();
		if (row.projective) {
			row.genericsName = genericsNameText.getText().trim();
		} else {
			row.genericsName = null;
		}

		super.okPressed();
	}
}

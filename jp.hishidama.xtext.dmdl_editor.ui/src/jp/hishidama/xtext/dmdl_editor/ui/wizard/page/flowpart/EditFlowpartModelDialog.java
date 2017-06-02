package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.List;
import java.util.regex.Pattern;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelMultiSelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditFlowpartModelDialog extends EditDialog {

	private IProject project;
	private FlowpartModelRow row;

	private Button inButton;
	private Text nameText;
	private Text commentText;
	private String modelClassName;
	private Text modelNameText;
	private Text modelDescText;
	private Text genericsNameText;

	public EditFlowpartModelDialog(Shell parentShell, IProject project, FlowpartModelRow row) {
		super(parentShell, "In/Out編集", 3);
		this.project = project;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		List<Button> buttons = createRadioField(composite, "in/out", "in", "out");
		inButton = buttons.get(0);
		inButton.setSelection(row.in);
		buttons.get(1).setSelection(!row.in);

		genericsNameText = createTextField(composite, "generics name");
		genericsNameText.setText(nonNull(row.genericsName));
		genericsNameText.setToolTipText("射影モデルを使う場合は、型変数名を入力して下さい。");

		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		commentText = createTextField(composite, "comment");
		commentText.setText(nonNull(row.comment));
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
		modelDescText = createTextField(composite, "model description");
		modelDescText.setText(nonNull(row.modelDescription));
		modelDescText.setEditable(false);

		pair.button.setFocus();
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	private static final String MODEL_NAME_DELIMITTER_PATTERN = Pattern.quote(FlowpartModelRow.MODEL_NAME_DELIMITTER);

	protected void selectDataModel() {
		DmdlModelMultiSelectionDialog dialog = new DmdlModelMultiSelectionDialog(getShell(), project);
		dialog.setInitialModel(modelNameText.getText().split(MODEL_NAME_DELIMITTER_PATTERN));
		if (dialog.open() != Window.OK) {
			return;
		}

		List<ModelDefinition> list = dialog.getSelectedDataModelList();
		String modelName = null;
		String modelDescription = null;
		String modelClassName = null;
		String genericsName = null;
		for (ModelDefinition model : list) {
			String mname = nonNull(model.getName());
			modelName = FlowpartModelRow.catModelName(modelName, mname);
			modelDescription = FlowpartModelRow.catModelDescription(modelDescription, ModelUtil.getDecodedDescriptionText(model));
			modelClassName = FlowpartModelRow.catModelClassName(modelClassName, ModelUiUtil.getModelClassName(project, mname));

			if (genericsName == null) {
				if (list.size() >= 2 || ModelUtil.isProjective(model)) {
					genericsName = mname.substring(0, 1).toUpperCase();
				}
			}
		}
		modelNameText.setText(modelName);
		modelDescText.setText(modelDescription);
		this.modelClassName = modelClassName;
		if (nameText.getText().trim().isEmpty()) {
			nameText.setText(StringUtil.toLowerCamelCase(modelName.replaceAll(MODEL_NAME_DELIMITTER_PATTERN, "_")));
		}
		if (commentText.getText().isEmpty()) {
			commentText.setText(modelDescription);
		}
		if (genericsName != null) {
			if (genericsNameText.getText().trim().isEmpty()) {
				genericsNameText.setText(genericsName);
			}
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
		row.in = inButton.getSelection();
		row.name = nameText.getText().trim();
		row.comment = commentText.getText();
		row.setModelClassName(modelClassName);
		row.modelName = modelNameText.getText();
		row.modelDescription = modelDescText.getText();
		row.genericsName = genericsNameText.getText().trim();

		super.okPressed();
	}
}

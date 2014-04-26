package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog.Filter;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionImplementsFilter;
import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.jdt.util.ReflectionUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditJobflowPorterDialog extends EditDialog {

	private IJavaProject javaProject;
	private JobflowPorterRow row;

	private Text inText;
	private Text nameText;
	private Text classText;
	private String modelClassName;
	private Text modelNameText;
	private Text modelDescText;

	public EditJobflowPorterDialog(Shell parentShell, IJavaProject javaProject, JobflowPorterRow row) {
		super(parentShell, "Importer/Exporter編集", 3);
		this.javaProject = javaProject;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		inText = createTextField(composite, "importer/exporter");
		inText.setText(row.getIn());
		inText.setEnabled(false);
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		TextButtonPair pair = createTextButtonField(composite, "class", "...");
		classText = pair.text;
		classText.setText(nonNull(row.porterClassName));
		pair.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectPorterClass();
			}
		});
		modelClassName = row.modelClassName;
		modelNameText = createTextField(composite, "model name");
		modelNameText.setText(nonNull(row.modelName));
		modelNameText.setEditable(false);
		modelDescText = createTextField(composite, "model description");
		modelDescText.setText(nonNull(row.modelDescription));
		modelDescText.setEditable(false);
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	protected void selectPorterClass() {
		Filter filter;
		if (row.in) {
			filter = new ClassSelectionImplementsFilter("com.asakusafw.vocabulary.external.ImporterDescription");
		} else {
			filter = new ClassSelectionImplementsFilter("com.asakusafw.vocabulary.external.ExporterDescription");
		}
		ClassSelectionDialog dialog = ClassSelectionDialog.create(getShell(), javaProject, null, filter);
		dialog.setTitle("Select " + row.getIn());
		if (dialog.open() != Window.OK) {
			return;
		}

		String className = dialog.getSelectedClass();
		classText.setText(className);

		try {
			Class<?> clazz = ReflectionUtil.loadClass(javaProject, className);
			Object object = clazz.newInstance();
			Class<?> modelType = ReflectionUtil.get(object, "getModelType");
			String modelClassName = modelType.getName();
			this.modelClassName = modelClassName;
			ModelDefinition model = ModelUiUtil.findModelByClass(javaProject.getProject(), modelClassName);
			if (model != null) {
				String modelName = nonNull(model.getName());
				modelNameText.setText(modelName);
				modelDescText.setText(ModelUtil.getDecodedDescriptionText(model));
				if (nameText.getText().trim().isEmpty()) {
					nameText.setText(StringUtil.toLowerCamelCase(modelName));
				}
			} else {
				modelNameText.setText(nonNull(modelClassName));
				modelDescText.setText("");
			}
		} catch (Exception e) {
			LogUtil.warnStatus("Importer/Exporter invoke error. className=" + className, e);
			modelNameText.setText("");
			modelDescText.setText("");
		}
	}

	@Override
	protected boolean validate() {
		if (StringUtil.isEmpty(nameText.getText().trim())) {
			return false;
		}
		if (StringUtil.isEmpty(classText.getText().trim())) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.name = nameText.getText().trim();
		row.porterClassName = classText.getText().trim();
		row.modelClassName = modelClassName;
		row.modelName = modelNameText.getText();
		row.modelDescription = modelDescText.getText();

		super.okPressed();
	}
}

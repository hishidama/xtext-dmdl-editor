package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import java.util.HashMap;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog.Filter;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionImplementsFilter;
import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.jdt.util.JavadocUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditJobflowPorterDialog extends EditDialog {

	private final IJavaProject javaProject;
	private final JobflowPorterRow row;
	private final String nameRule;
	private final int number;

	private Text inText;
	private Text nameText;
	private Text commentText;
	private Text classText;
	private String modelClassName;
	private Text modelNameText;
	private Text modelDescText;

	public EditJobflowPorterDialog(Shell parentShell, IJavaProject javaProject, JobflowPorterRow row, String nameRule,
			int number) {
		super(parentShell, "Importer/Exporter編集", 3);
		this.javaProject = javaProject;
		this.row = row;
		this.nameRule = nameRule;
		this.number = number;
	}

	@Override
	protected void createFields(Composite composite) {
		inText = createTextField(composite, "importer/exporter");
		inText.setText(row.getIn());
		inText.setEnabled(false);
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.name));
		commentText = createTextField(composite, "comment");
		commentText.setText(nonNull(row.comment));
		TextButtonPair pair = createTextButtonField(composite, "class", "select");
		classText = pair.text;
		classText.setText(nonNull(row.porterClassName));
		classText.setEditable(false);
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
			filter = new ClassSelectionImplementsFilter(PorterUtil.IMPORTER_NAME);
		} else {
			filter = new ClassSelectionImplementsFilter(PorterUtil.EXPORTER_NAME);
		}
		ClassSelectionDialog dialog = ClassSelectionDialog.create(getShell(), javaProject, null, filter);
		dialog.setTitle("Select " + row.getIn());
		if (dialog.open() != Window.OK) {
			return;
		}

		String className = dialog.getSelectedClassName();
		classText.setText(className);

		try {
			IType type = javaProject.findType(className);
			String header = JavadocUtil.getHeader(JavadocUtil.getJavadoc(type));
			if (header != null) {
				commentText.setText(header);
			}
		} catch (JavaModelException e) {
			// ignore
		}

		try {
			String modelClassName = PorterUtil.getModelClassName(javaProject, className);
			this.modelClassName = modelClassName;
			ModelDefinition model = ModelUiUtil.findModelByClass(javaProject.getProject(), modelClassName);
			if (model != null) {
				String modelName = nonNull(model.getName());
				modelNameText.setText(modelName);
				String modelDescription = ModelUtil.getDecodedDescriptionText(model);
				modelDescText.setText(modelDescription);
				if (nameText.getText().trim().isEmpty()) {
					nameText.setText(getName(className, modelName, modelDescription));
				}
				if (commentText.getText().isEmpty()) {
					commentText.setText(modelDescription);
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

	private String getName(String porterClassName, String modelName, String modelDescription) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("in", Boolean.toString(row.in));
		map.put("className", StringUtil.getSimpleName(porterClassName));
		map.put("modelName", modelName);
		map.put("modelDescription", modelDescription);
		map.put("number", Integer.toString(this.number));

		String name = DMDLVariableTableUtil.replaceVariable(this.nameRule, map);
		if (StringUtil.nonEmpty(name)) {
			return name;
		}
		return StringUtil.toFirstLower(StringUtil.getSimpleName(porterClassName));
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
		row.comment = commentText.getText();
		row.porterClassName = classText.getText().trim();
		row.modelClassName = modelClassName;
		row.modelName = modelNameText.getText();
		row.modelDescription = modelDescText.getText();

		super.okPressed();
	}
}

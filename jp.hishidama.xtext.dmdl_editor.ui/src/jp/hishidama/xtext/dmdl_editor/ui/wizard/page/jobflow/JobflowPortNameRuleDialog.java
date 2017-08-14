package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import jp.hishidama.xtext.dmdl_editor.ui.dialog.SelectRuleDialog;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class JobflowPortNameRuleDialog extends SelectRuleDialog {

	public JobflowPortNameRuleDialog(Shell parentShell) {
		super(parentShell, "Select JobFlow port name rule");
	}

	@Override
	protected void createFields(Composite composite) {
		createRadioButton(composite, "Importer/Exporter class name", "$(className.toLowerCamelCase)");
		createRadioButton(composite, "model name", "$(modelName.toLowerCamelCase)");
		createRadioButton(composite, "model name + In/Out", "$(modelName.toLowerCamelCase)$(in?In:Out)");
		createRadioButton(composite, "model name + sequencial numer", "$(modelName.toLowerCamelCase)$(number.1.%d)");
		createRadioButton(composite, "in/out + sequencial numer", "$(in?in:out)$(number.1.%d)");
	}
}

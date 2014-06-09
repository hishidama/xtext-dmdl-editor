package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class FlowpartPortNameRuleDialog extends PortNameRuleDialog {

	public FlowpartPortNameRuleDialog(Shell parentShell) {
		super(parentShell, "Select FlowPart port name rule");
	}

	@Override
	protected void createFields(Composite composite) {
		createRadioButton(composite, "model name", "$(modelName.toLowerCamelCase)");
		createRadioButton(composite, "model name + In/Out", "$(modelName.toLowerCamelCase)$(in?In:Out)");
		createRadioButton(composite, "model name + sequencial numer", "$(modelName.toLowerCamelCase)$(number.1)");
		createRadioButton(composite, "in/out + sequencial numer", "$(in?in:out)$(number.1)");
	}
}

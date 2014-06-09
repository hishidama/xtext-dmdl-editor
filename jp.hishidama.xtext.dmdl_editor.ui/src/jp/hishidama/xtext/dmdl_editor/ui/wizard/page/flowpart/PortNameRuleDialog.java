package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class PortNameRuleDialog extends EditDialog {

	private List<Button> radioList = new ArrayList<Button>();

	private String selectedValue;

	public PortNameRuleDialog(Shell parentShell, String windowTitle) {
		super(parentShell, windowTitle);
	}

	protected Button createRadioButton(Composite composite, String label, String value) {
		Button button = new Button(composite, SWT.RADIO);
		button.setText(label);
		button.setData(value);
		Text text = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(text);
		text.setText(value);

		button.addSelectionListener(SELECT_REFRESH_LISTENER);
		radioList.add(button);
		return button;
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		for (Button button : radioList) {
			if (button.getSelection()) {
				selectedValue = (String) button.getData();
				return true;
			}
		}
		return false;
	}

	public String getSelectedValue() {
		return selectedValue;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class SelectRuleDialog extends EditDialog {

	private List<Button> radioList = new ArrayList<Button>();

	private String selectedValue;

	public SelectRuleDialog(Shell parentShell, String windowTitle) {
		super(parentShell, windowTitle);
	}

	public static class ButtonTextPair {
		public Button button;
		public Text text;

		public ButtonTextPair(Button button, Text text) {
			this.button = button;
			this.text = text;
		}
	}

	protected ButtonTextPair createRadioButton(Composite composite, String label, String value) {
		return createRadioButton(composite, label, SWT.BORDER | SWT.READ_ONLY, value);
	}

	protected ButtonTextPair createRadioButton(Composite composite, String label, int textStyle, String value) {
		Button button = new Button(composite, SWT.RADIO);
		button.setText(label);
		button.setData(value);
		Text text = new Text(composite, textStyle);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(text);
		text.setText(value);

		button.addSelectionListener(SELECT_REFRESH_LISTENER);
		radioList.add(button);

		return new ButtonTextPair(button, text);
	}

	protected final List<Button> getButtonList() {
		return radioList;
	}

	protected final void setSelection(Button select) {
		for (Button button : radioList) {
			button.setSelection(button == select);
		}
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

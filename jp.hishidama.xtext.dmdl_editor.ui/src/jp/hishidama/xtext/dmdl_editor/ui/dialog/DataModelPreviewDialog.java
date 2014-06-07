package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DataModelPreviewDialog extends EditDialog {
	private String text;

	private Text textArea;

	public DataModelPreviewDialog(Shell parentShell, String windowTitle) {
		super(parentShell, windowTitle, 1);
	}

	@Override
	protected void createFields(Composite composite) {
		textArea = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.H_SCROLL | SWT.V_SCROLL);
		// textArea.setFont(composite.getFont());
		GridData grid = new GridData(GridData.FILL_BOTH);
		grid.widthHint = 256 + 32;
		grid.heightHint = 256;
		textArea.setLayoutData(grid);
		if (text != null) {
			textArea.setText(text);
		}
	}

	public void setText(String text) {
		this.text = text;
		if (textArea != null) {
			textArea.setText(text);
		}
	}

	@Override
	protected void refresh() {
		// do nothing
	}

	@Override
	protected boolean validate() {
		// do nothing
		return true;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}
}

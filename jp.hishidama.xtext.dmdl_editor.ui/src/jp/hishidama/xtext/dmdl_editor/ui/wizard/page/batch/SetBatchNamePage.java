package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewBatchClassWizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetBatchNamePage extends EditWizardPage {

	private Text nameText;
	private Text commentText;
	private Button strictCheck;

	public SetBatchNamePage() {
		super("SetBatchNamePage");

		setTitle("Set Batch name");
		setDescription("Set Batch name.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		nameText = createTextField(composite, nColumns - 1, "Batch name:");
		commentText = createTextField(composite, nColumns - 1, "comment:");
		strictCheck = createCheckButtonField(composite, "strict:", "parameterで指定していない引数を利用できないようにする");
		strictCheck.setSelection(false);

		return composite;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			if (nameText != null && nameText.getText().trim().isEmpty()) {
				nameText.setText(getWizard().getTypeName());
			}
			nameText.setFocus();
		}
	}

	@Override
	public NewBatchClassWizard getWizard() {
		return (NewBatchClassWizard) super.getWizard();
	}

	@Override
	protected String validate() {
		{
			String text = getBatchName();
			if (text.trim().isEmpty()) {
				return "Batch name is empty.";
			}
		}
		return null;
	}

	public String getBatchName() {
		return nameText.getText();
	}

	public String getComment() {
		return commentText.getText();
	}

	public boolean isStrict() {
		return strictCheck.getSelection();
	}
}

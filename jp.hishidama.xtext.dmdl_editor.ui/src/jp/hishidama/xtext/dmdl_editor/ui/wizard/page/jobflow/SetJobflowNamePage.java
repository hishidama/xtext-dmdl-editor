package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewJobflowClassWizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetJobflowNamePage extends EditWizardPage {

	private Text nameText;
	private Text descText;

	public SetJobflowNamePage() {
		super("SetJobflowNamePage");

		setTitle("Set JobFlow name");
		setDescription("Set JobFlow name.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		nameText = createTextField(composite, nColumns - 1, "JobFlow name:");
		descText = createTextField(composite, nColumns - 1, "comment:");

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
	public NewJobflowClassWizard getWizard() {
		return (NewJobflowClassWizard) super.getWizard();
	}

	@Override
	protected String validate() {
		{
			String text = getJobflowName();
			if (text.trim().isEmpty()) {
				return "JobFlow name is empty.";
			}
		}
		return null;
	}

	public String getJobflowName() {
		return nameText.getText();
	}

	public String getJobDescription() {
		return descText.getText();
	}
}

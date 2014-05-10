package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetFlowpartNamePage extends EditWizardPage {

	private Text descText;

	public SetFlowpartNamePage() {
		super("SetFlowpartNamePage");

		setTitle("Set FlowPart comment");
		setDescription("Set FlowPart comment.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		descText = createTextField(composite, nColumns - 1, "comment:");

		return composite;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			descText.setFocus();
		}
	}

	@Override
	protected String validate() {
		return null;
	}

	public String getComment() {
		return descText.getText();
	}
}

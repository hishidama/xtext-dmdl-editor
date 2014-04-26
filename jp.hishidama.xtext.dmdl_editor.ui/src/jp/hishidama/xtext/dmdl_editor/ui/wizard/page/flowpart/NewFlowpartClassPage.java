package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import jp.hishidama.eclipse_plugin.wizard.page.NewClassWizardPage;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewFlowpartClassPage extends NewClassWizardPage {

	public NewFlowpartClassPage() {
		super("NewFlowpartClassPage");

		setTitle("New FlowPart Class");
		setDescription("Create a new FlowPart class.");
	}

	@Override
	protected void init() {
		setMethodStubSelection(false, true, true, false);
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 4;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		// pick & choose the wanted UI components

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createTypeNameControls(composite, nColumns);
		createSuperClassControls(composite, nColumns);
		setSuperClass("com.asakusafw.vocabulary.flow.FlowDescription", false);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}
}

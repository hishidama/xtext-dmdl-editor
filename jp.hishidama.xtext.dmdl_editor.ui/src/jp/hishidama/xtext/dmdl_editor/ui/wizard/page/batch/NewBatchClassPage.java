package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import jp.hishidama.eclipse_plugin.wizard.page.NewClassWizardPage;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewBatchClassPage extends NewClassWizardPage {

	public NewBatchClassPage() {
		super("NewBatchClassPage");

		setTitle("New Batch Class");
		setDescription("Create a new Batch class.");
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
		setSuperClass("com.asakusafw.vocabulary.batch.BatchDescription", false);

		setControl(composite);

		Dialog.applyDialogFont(composite);
	}
}

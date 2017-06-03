package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.wizard.page.NewTestClassWizardPage;
import jp.hishidama.xtext.dmdl_editor.validation.ErrorStatus;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class NewFlowTestClassPage extends NewTestClassWizardPage {

	private boolean isJobFlow;

	private Button flowPartTesterButton;
	private Button jobFlowTesterButton;

	public NewFlowTestClassPage() {
		super("NewFlowTestClassPage");

		setTitle("New JobFlow/FlowPart Test Class");
		setDescription("Create a new JobFlow/FlowPart Test class.");
	}

	@Override
	protected void init() {
		setMethodStubSelection(false, false, false, false);
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
		setSuperClass("java.lang.Object", true);

		createSeparator(composite, nColumns);
		createClassUnderTestControls(composite, nColumns);
		createTesterControls(composite);

		setControl(composite);

		// set default and focus
		initDefaultTypeName();

		Dialog.applyDialogFont(composite);
	}

	private void createTesterControls(Composite parent) {
		new Label(parent, SWT.NONE).setText("Tester class:");

		GridLayout layout = new GridLayout();
		layout.makeColumnsEqualWidth = true;
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		Composite buttonComposite = new Composite(parent, SWT.NONE);
		buttonComposite.setFont(parent.getFont());
		buttonComposite.setLayout(layout);

		flowPartTesterButton = createSelectionButton("FlowPartTester", buttonComposite);
		jobFlowTesterButton = createSelectionButton("JobFlowTester", buttonComposite);
		updateTesterButton();
	}

	private Button createSelectionButton(String text, Composite group) {
		Button button = new Button(group, SWT.RADIO | SWT.LEFT);
		button.setFont(group.getFont());
		button.setText(text);
		button.setEnabled(false);
		button.setSelection(false);
		button.setLayoutData(new GridData());
		return button;
	}

	private void updateTesterButton() {
		if (jobFlowTesterButton == null || flowPartTesterButton == null) {
			return;
		}

		if (isJobFlow) {
			jobFlowTesterButton.setEnabled(true);
			jobFlowTesterButton.setSelection(true);
			flowPartTesterButton.setEnabled(true);
			flowPartTesterButton.setSelection(false);
		} else {
			jobFlowTesterButton.setEnabled(false);
			jobFlowTesterButton.setSelection(false);
			flowPartTesterButton.setEnabled(true);
			flowPartTesterButton.setSelection(true);
		}
	}

	@Override
	protected IStatus classUnderTestChanged() {
		IStatus status = super.classUnderTestChanged();

		IType type = getClassUnderTest();
		if (type != null) {
			boolean jobFlow = FlowUtil.isJobFlow(type);
			boolean flowPart = FlowUtil.isFlowPart(type);
			if (!jobFlow && !flowPart) {
				((Wizard) getWizard()).setWindowTitle("New JobFlow/FlowPart Test Class");
				return new ErrorStatus("{0} is not JobFlow or FlowPart class.", getClassUnderTestText());
			}

			this.isJobFlow = jobFlow;
			((Wizard) getWizard()).setWindowTitle(jobFlow ? "New JobFlow Test Class" : "New FlowPart Test Class");
			updateTesterButton();
		}

		return status;
	}

	public boolean isJobFlow() {
		return isJobFlow;
	}

	public boolean isJobFlowTester() {
		return jobFlowTesterButton.getSelection();
	}
}

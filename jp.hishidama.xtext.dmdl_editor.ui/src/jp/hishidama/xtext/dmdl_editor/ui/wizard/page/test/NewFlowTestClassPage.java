package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.wizard.page.NewTestClassWizardPage;
import jp.hishidama.xtext.dmdl_editor.validation.ErrorStatus;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewFlowTestClassPage extends NewTestClassWizardPage {

	private boolean isJobFlow;

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

		setControl(composite);

		// set default and focus
		initDefaultTypeName();

		Dialog.applyDialogFont(composite);
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
		}

		return status;
	}

	public boolean isJobFlow() {
		return isJobFlow;
	}
}

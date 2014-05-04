package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.wizard.page.NewTestClassWizardPage;
import jp.hishidama.xtext.dmdl_editor.validation.ErrorStatus;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewFlowpartTestClassPage extends NewTestClassWizardPage {

	public NewFlowpartTestClassPage() {
		super("NewFlowpartTestClassPage");

		setTitle("New FlowPart Test Class");
		setDescription("Create a new FlowPart Test class.");
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
		if (!status.matches(IStatus.ERROR)) {
			IType type = getClassUnderTest();
			if (type != null) {
				if (!FlowUtil.isFlowPart(type)) {
					return new ErrorStatus("{0} is not FlowPart class.", getClassUnderTestText());
				}
			}
		}
		return status;
	}
}

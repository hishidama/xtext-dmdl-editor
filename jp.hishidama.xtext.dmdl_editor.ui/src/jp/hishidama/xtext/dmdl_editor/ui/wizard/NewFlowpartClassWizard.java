package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.NewFlowpartClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.NewFlowpartClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetArgumentPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetFlowpartModelPage;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewFlowpartClassWizard extends NewClassWizard {

	private NewFlowpartClassPage classPage;
	private SetFlowpartModelPage modelPage;
	private SetArgumentPage argPage;

	public NewFlowpartClassWizard() {
		setWindowTitle("New FlowPart Class");
	}

	@Override
	public void addPages() {
		classPage = new NewFlowpartClassPage();
		classPage.setWizard(this);
		classPage.init(getSelection());
		addPage(classPage);

		modelPage = new SetFlowpartModelPage();
		addPage(modelPage);

		argPage = new SetArgumentPage();
		addPage(argPage);
	}

	public String getTypeName() {
		return classPage.getTypeName();
	}

	public IProject getProject() {
		return classPage.getJavaProject().getProject();
	}

	@Override
	public boolean performFinish() {
		NewFlowpartClassGenerator gen = new NewFlowpartClassGenerator(classPage.getJavaProject().getProject(),
				classPage.getPackageFragmentRoot().getPath());
		try {
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), modelPage.getDataModelList(),
					argPage.getArgumentList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", e.getStatus());
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", status);
		}

		return true;
	}
}

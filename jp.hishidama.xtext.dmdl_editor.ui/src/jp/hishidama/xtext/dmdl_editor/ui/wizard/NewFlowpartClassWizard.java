package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.NewFlowpartClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.NewFlowpartClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetFlowpartPortPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetFlowpartNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetArgumentPage;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewFlowpartClassWizard extends NewClassWizard implements TypeWizard {

	private NewFlowpartClassPage classPage;
	private SetFlowpartNamePage namePage;
	private SetFlowpartPortPage portPage;
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

		namePage = new SetFlowpartNamePage();
		addPage(namePage);

		portPage = new SetFlowpartPortPage();
		addPage(portPage);

		argPage = new SetArgumentPage(getJavaProject(), null);
		addPage(argPage);
	}

	public String getTypeName() {
		return classPage.getTypeName();
	}

	public IJavaProject getJavaProject() {
		return classPage.getJavaProject();
	}

	public IResource getDir() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean performFinish() {
		portPage.saveDialogSettings();

		NewFlowpartClassGenerator gen = new NewFlowpartClassGenerator(getJavaProject().getProject(), classPage.getPackageFragmentRoot().getPath());
		try {
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), namePage.getComment(), portPage.getDataModelList(), argPage.getArgumentList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", e.getStatus());
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", status);
		}

		return true;
	}
}

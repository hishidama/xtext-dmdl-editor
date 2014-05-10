package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.NewJobflowClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.NewJobflowClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.SetJobflowNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.SetJobflowPorterPage;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewJobflowClassWizard extends NewClassWizard implements TypeWizard {

	private NewJobflowClassPage classPage;
	private SetJobflowNamePage namePage;
	private SetJobflowPorterPage porterPage;

	public NewJobflowClassWizard() {
		setWindowTitle("New JobFlow Class");
	}

	@Override
	public void addPages() {
		classPage = new NewJobflowClassPage();
		classPage.setWizard(this);
		classPage.init(getSelection());
		addPage(classPage);

		namePage = new SetJobflowNamePage();
		addPage(namePage);

		porterPage = new SetJobflowPorterPage();
		addPage(porterPage);
	}

	public String getTypeName() {
		return classPage.getTypeName();
	}

	public IJavaProject getJavaProject() {
		return classPage.getJavaProject();
	}

	public IResource getDir() {
		IPackageFragment fragment = classPage.getPackageFragment();
		return fragment.getResource();
	}

	@Override
	public boolean performFinish() {
		NewJobflowClassGenerator gen = new NewJobflowClassGenerator(classPage.getJavaProject().getProject(), classPage
				.getPackageFragmentRoot().getPath());
		try {
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), namePage.getJobflowName(),
					namePage.getJobDescription(), porterPage.getPorterList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "JobFlow generate error", "JobFlow generate error.", e.getStatus());
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "JobFlow generate error", "JobFlow generate error.", status);
		}

		return true;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.NewBatchClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.NewBatchClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.SetBatchDescribePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.SetBatchNamePage;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewBatchClassWizard extends NewClassWizard {

	private NewBatchClassPage classPage;
	private SetBatchNamePage namePage;
	private SetBatchDescribePage jobPage;

	public NewBatchClassWizard() {
		setWindowTitle("New Batch Class");
	}

	@Override
	public void addPages() {
		classPage = new NewBatchClassPage();
		classPage.setWizard(this);
		classPage.init(getSelection());
		addPage(classPage);

		namePage = new SetBatchNamePage();
		addPage(namePage);

		jobPage = new SetBatchDescribePage();
		addPage(jobPage);
	}

	public String getTypeName() {
		return classPage.getTypeName();
	}

	public IJavaProject getJavaProject() {
		return classPage.getJavaProject();
	}

	@Override
	public boolean performFinish() {
		NewBatchClassGenerator gen = new NewBatchClassGenerator(classPage.getJavaProject().getProject(), classPage
				.getPackageFragmentRoot().getPath());
		try {
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), namePage.getBatchName(),
					namePage.getComment(), namePage.isStrict(), namePage.getParameterList(), jobPage.getJobList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "Batch generate error", "Batch generate error.", e.getStatus());
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "Batch generate error", "Batch generate error.", status);
		}

		return true;
	}
}

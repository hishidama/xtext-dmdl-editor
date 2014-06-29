package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewJobflowTestClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewJobflowTestClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.SetExcelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.TestExcelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel.TestExcelGenerateTask;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewJobflowTestClassWizard extends NewClassWizard {

	private NewJobflowTestClassPage classPage;
	private SetExcelPage excelPage;

	public NewJobflowTestClassWizard() {
		setWindowTitle("New JobFlow Test Class");
	}

	@Override
	public void addPages() {
		classPage = new NewJobflowTestClassPage();
		classPage.setWizard(this);
		classPage.init(getSelection());
		addPage(classPage);

		excelPage = new SetExcelPage(classPage);
		addPage(excelPage);
	}

	@Override
	public boolean canFinish() {
		return excelPage.isPageComplete();
	}

	public String getTypeName() {
		return classPage.getTypeName();
	}

	public IResource getDir() {
		IPackageFragment fragment = classPage.getPackageFragment();
		return fragment.getResource();
	}

	public IJavaProject getJavaProject() {
		return classPage.getJavaProject();
	}

	public IType getClassUnderTest() {
		return classPage.getClassUnderTest();
	}

	@Override
	public boolean performFinish() {
		try {
			excelPage.saveDialogSettings();

			copyExcelFiles();

			NewJobflowTestClassGenerator gen = new NewJobflowTestClassGenerator(
					classPage.getJavaProject().getProject(), classPage.getPackageFragmentRoot().getPath());
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), classPage.getSuperClass(),
					classPage.getClassUnderTestText(), excelPage.getExcelList(), excelPage.getParameterList());
		} catch (InterruptedException e) {
			return false;
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "JobFlow Test generate error", "JobFlow Test generate error.",
					e.getStatus());
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(LogUtil.getMessage(e), e);
			ErrorDialog.openError(getShell(), "JobFlow Test generate error", "JobFlow Test generate error.", status);
			return false;
		}

		return true;
	}

	private void copyExcelFiles() throws CoreException, InvocationTargetException, InterruptedException {
		IProject project = getJavaProject().getProject();
		String dstDir = "src/test/resources/" + classPage.getPackageText().replaceAll("\\.", "/") + "/";
		AsakusafwProperties bp = BuildPropertiesUtil.getBuildProperties(project, false);
		String srcDir = bp.getTestDataSheetOutput();
		if (!srcDir.endsWith("/")) {
			srcDir += "/";
		}

		TestExcelGenerateTask task = new TestExcelGenerateTask(project);

		List<TestExcelRow> list = excelPage.getExcelList();
		for (TestExcelRow row : list) {
			if (row.copy) {
				String excelName = dstDir + row.excelDstFileName;
				if (row.in) {
					task.add(excelName, row.sheetName, row.modelName, "input");
				} else {
					task.add(excelName, row.sheetName, row.modelName, "output");
					task.add(excelName, row.ruleName, row.modelName, "rule");
				}
			}
		}

		getContainer().run(false, true, task);
	}
}

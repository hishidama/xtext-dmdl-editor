package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewFlowTestClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewFlowTestClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewFlowpartTestClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewJobflowTestClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.SelectExcelSheetPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.SetExcelNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.TestSheetRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel.TestExcelGenerateTask;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

public class NewFlowTestClassWizard extends NewClassWizard {

	private NewFlowTestClassPage classPage;
	private SetExcelNamePage namePage;
	private SelectExcelSheetPage sheetPage;

	public NewFlowTestClassWizard() {
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setWindowTitle("New JobFlow/FlowPart Test Class");
	}

	@Override
	public void addPages() {
		classPage = new NewFlowTestClassPage();
		classPage.setWizard(this);
		classPage.init(getSelection());
		addPage(classPage);

		namePage = new SetExcelNamePage(classPage);
		addPage(namePage);

		sheetPage = new SelectExcelSheetPage(namePage);
		addPage(sheetPage);
	}

	@Override
	public boolean canFinish() {
		return sheetPage.isPageComplete();
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
			namePage.saveDialogSettings();
			sheetPage.saveDialogSettings();
		} catch (Exception e) {
			LogUtil.logWarn(LogUtil.getMessage(e));
		}

		try {
			generateExcelFiles();
		} catch (InterruptedException e) {
			return false;
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "Flow Test generate error", "Excel file generate error.", e.getStatus());
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(LogUtil.getMessage(e), e);
			LogUtil.log(status);
			ErrorDialog.openError(getShell(), "Flow Test generate error", "Excel file generate error.", status);
			return false;
		}

		try {
			NewFlowTestClassGenerator gen = createGenerator();
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), classPage.getSuperClass(),
					classPage.getClassUnderTestText(), namePage.getExcelList(), namePage.getParameterList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "Flow Test generate error", "Flow Test generate error.", e.getStatus());
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(LogUtil.getMessage(e), e);
			ErrorDialog.openError(getShell(), "Flow Test generate error", "Flow Test generate error.", status);
			return false;
		}

		return true;
	}

	private NewFlowTestClassGenerator createGenerator() {
		if (classPage.isJobFlow()) {
			return new NewJobflowTestClassGenerator(classPage.getJavaProject().getProject(), classPage
					.getPackageFragmentRoot().getPath());
		} else {
			return new NewFlowpartTestClassGenerator(classPage.getJavaProject().getProject(), classPage
					.getPackageFragmentRoot().getPath());
		}
	}

	private void generateExcelFiles() throws CoreException, InvocationTargetException, InterruptedException {
		IProject project = getJavaProject().getProject();
		String dstDir = "src/test/resources/" + classPage.getPackageText().replaceAll("\\.", "/") + "/";
		AsakusafwProperties bp = BuildPropertiesUtil.getBuildProperties(project, false);
		String srcDir = bp.getTestDataSheetOutput();
		if (!srcDir.endsWith("/")) {
			srcDir += "/";
		}

		TestExcelGenerateTask task = new TestExcelGenerateTask(project);
		task.set(classPage.getClassUnderTestText(), sheetPage.getIndexSheetName());

		List<TestSheetRow> list = sheetPage.getSheetList();
		for (TestSheetRow row : list) {
			String excelName = dstDir + row.excelDstFileName;
			task.add(excelName, row.sheetName, "", row.modelName, row.modelDescription, row.sheetType);
		}

		if (task.nonEmpty()) {
			getContainer().run(false, true, task);
		}
	}
}

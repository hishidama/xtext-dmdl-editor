package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.ExcelCopy;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewFlowpartTestClassGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.NewFlowpartTestClassPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.SetExcelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.TestExcelRow;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;

public class NewFlowpartTestClassWizard extends NewClassWizard {

	private NewFlowpartTestClassPage classPage;
	private SetExcelPage excelPage;

	public NewFlowpartTestClassWizard() {
		setWindowTitle("New FlowPart Test Class");
	}

	@Override
	public void addPages() {
		classPage = new NewFlowpartTestClassPage();
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
		copyExcelFiles();

		NewFlowpartTestClassGenerator gen = new NewFlowpartTestClassGenerator(classPage.getJavaProject().getProject(),
				classPage.getPackageFragmentRoot().getPath());
		try {
			gen.generate(classPage.getPackageText(), classPage.getTypeName(), classPage.getSuperClass(),
					classPage.getClassUnderTestText(), excelPage.getExcelList(), excelPage.getParameterList());
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "FlowPart Test generate error", "FlowPart Test generate error.",
					e.getStatus());
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "FlowPart Test generate error", "FlowPart Test generate error.", status);
		}

		return true;
	}

	private void copyExcelFiles() {
		IProject project = getJavaProject().getProject();
		String dstDir = "src/test/resources/" + classPage.getPackageText().replaceAll("\\.", "/") + "/";
		AsakusafwProperties bp = BuildPropertiesUtil.getBuildProperties(project, false);
		String srcDir = bp.getTestDataSheetOutput();
		if (!srcDir.endsWith("/")) {
			srcDir += "/";
		}

		ExcelCopy copy = new ExcelCopy(project);

		List<TestExcelRow> list = excelPage.getExcelList();
		for (TestExcelRow row : list) {
			if (row.copy) {
				String excelName = dstDir + row.excelDstFileName;
				String srcExcelName = srcDir + row.modelName + ".xls";
				if (row.in) {
					copy.add(excelName, row.sheetName, srcExcelName, "input");
				} else {
					copy.add(excelName, row.sheetName, srcExcelName, "output");
					copy.add(excelName, row.ruleName, srcExcelName, "rule");
				}
			}
		}

		copy.execute();
	}
}

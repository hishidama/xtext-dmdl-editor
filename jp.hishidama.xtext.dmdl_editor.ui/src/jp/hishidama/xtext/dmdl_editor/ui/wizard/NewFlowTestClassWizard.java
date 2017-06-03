package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.wizard.NewClassWizard;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.ModelHierarchy;
import jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.ModelHierarchy.ModelInfo;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
			LogUtil.logWarn(LogUtil.getMessage(e), e);
		}

		Map<String, String> typeParameterMap;
		try {
			typeParameterMap = getTypeParameterClassName();
		} catch (InterruptedException e) {
			return false;
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "Flow Test generate error", "type parameter check error.", e.getStatus());
			return false;
		} catch (InvocationTargetException e) {
			IStatus status = LogUtil.errorStatus(LogUtil.getMessage(e.getCause()), e);
			LogUtil.log(status);
			ErrorDialog.openError(getShell(), "Flow Test generate error", "type parameter check error.", status);
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.errorStatus(LogUtil.getMessage(e), e);
			LogUtil.log(status);
			ErrorDialog.openError(getShell(), "Flow Test generate error", "type parameter check error.", status);
			return false;
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
			NewFlowTestClassGenerator gen = createGenerator(typeParameterMap);
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

	private Map<String, String> getTypeParameterClassName() throws InvocationTargetException, InterruptedException,
			CoreException {
		final IProject project = getJavaProject().getProject();

		class Generics {
			public List<String> classList = new ArrayList<String>();
			public Set<String> modelSet;
		}

		final Map<String, Generics> tempMap = new LinkedHashMap<String, Generics>();
		getContainer().run(false, true, new IRunnableWithProgress() {
			// @Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				Map<String, String[]> map = namePage.getTypeParameterMap();
				for (Entry<String, String[]> entry : map.entrySet()) {
					Generics result = new Generics();
					tempMap.put(entry.getKey(), result);
					for (String className : entry.getValue()) {
						ModelDefinition model = ModelUiUtil.findModelByClass(project, className);
						if (model == null) {
							result.classList.add(className);
							continue;
						}
						Set<String> set = toSet(model, project, monitor);
						if (result.modelSet == null) {
							result.modelSet = set;
						} else {
							result.modelSet.retainAll(set);
						}
					}
				}
			}

			private ModelHierarchy hierarchy = null;

			private Set<String> toSet(ModelDefinition model, IProject project, IProgressMonitor monitor) {
				Set<String> set = new TreeSet<String>();
				if (ModelUtil.isProjective(model)) {
					if (hierarchy == null) {
						hierarchy = new ModelHierarchy();
						hierarchy.initializeModels(getJavaProject().getProject(), monitor);
					}
					ModelInfo info = hierarchy.getModel(model.getName());
					if (info != null) {
						for (ModelDefinition sub : info.subList) {
							set.add(sub.getName());
						}
						for (ModelDefinition sub : info.autoSubList) {
							set.add(sub.getName());
						}
					}
					return set;
				}

				set.add(model.getName());
				return set;
			}
		});

		Map<String, String> resultMap = new LinkedHashMap<String, String>();
		for (Entry<String, Generics> entry : tempMap.entrySet()) {
			Generics value = entry.getValue();
			String className = null;
			if (value.modelSet == null) {
				if (!value.classList.isEmpty()) {
					className = value.classList.get(0);
				}
			} else {
				if (value.modelSet.isEmpty()) {
					IStatus status = LogUtil.errorStatus(MessageFormat.format(
							"type parameter<{0}> can not resolved concrete model.", entry.getKey()), null);
					throw new CoreException(status);
				}
				className = ModelUiUtil.getModelClassName(project, value.modelSet.iterator().next());
			}
			if (className == null) {
				className = "java.lang.Object";
			}
			resultMap.put(entry.getKey(), className);
		}

		return resultMap;
	}

	private NewFlowTestClassGenerator createGenerator(Map<String, String> typeParameterMap) {
		if (classPage.isJobFlowTester()) {
			return new NewJobflowTestClassGenerator(classPage.getJavaProject().getProject(), classPage
					.getPackageFragmentRoot().getPath());
		} else {
			return new NewFlowpartTestClassGenerator(classPage.getJavaProject().getProject(), classPage
					.getPackageFragmentRoot().getPath(), typeParameterMap);
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

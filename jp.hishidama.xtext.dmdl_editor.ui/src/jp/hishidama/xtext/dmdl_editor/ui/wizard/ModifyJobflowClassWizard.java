package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.JobflowClassModifier;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow.SetJobflowPorterPage;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.Wizard;

public class ModifyJobflowClassWizard extends Wizard implements TypeWizard {

	private IDocument document;
	private IType type;

	private SetJobflowPorterPage porterPage;

	public ModifyJobflowClassWizard() {
		setWindowTitle("Modify JobFlow Constructor/Field");
	}

	public void init(IDocument document, IType type) {
		this.document = document;
		this.type = type;
	}

	@Override
	public void addPages() {
		porterPage = new SetJobflowPorterPage();
		porterPage.init(type);
		addPage(porterPage);
	}

	public IJavaProject getJavaProject() {
		return type.getJavaProject();
	}

	public IResource getDir() {
		return type.getResource();
	}

	@Override
	public boolean performFinish() {
		porterPage.saveDialogSettings();

		JobflowClassModifier mon = new JobflowClassModifier(document, type, porterPage);
		try {
			mon.execute();
		} catch (CoreException e) {
			LogUtil.log(e.getStatus());
			ErrorDialog.openError(getShell(), "JobFlow generate error", "JobFlow generate error.", e.getStatus());
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.logError(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "JobFlow generate error", "JobFlow generate error.", status);
			return false;
		}

		return true;
	}
}

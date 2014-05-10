package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowpartClassModifier;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetFlowpartModelPage;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.Wizard;

public class ModifyFlowpartClassWizard extends Wizard implements TypeWizard {

	private IDocument document;
	private IType type;

	private SetFlowpartModelPage portPage;

	public ModifyFlowpartClassWizard() {
		setWindowTitle("Modify FlowPart Constructor/Field");
	}

	public void init(IDocument document, IType type) {
		this.document = document;
		this.type = type;
	}

	@Override
	public void addPages() {
		portPage = new SetFlowpartModelPage();
		portPage.init(type);
		addPage(portPage);
	}

	public IJavaProject getJavaProject() {
		return type.getJavaProject();
	}

	public IResource getDir() {
		return type.getResource();
	}

	@Override
	public boolean performFinish() {
		FlowpartClassModifier mon = new FlowpartClassModifier(document, type, portPage);
		try {
			mon.execute();
		} catch (CoreException e) {
			LogUtil.log(e.getStatus());
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", e.getStatus());
			return false;
		} catch (Exception e) {
			IStatus status = LogUtil.logError(e.getMessage(), e);
			ErrorDialog.openError(getShell(), "FlowPart generate error", "FlowPart generate error.", status);
			return false;
		}

		return true;
	}
}

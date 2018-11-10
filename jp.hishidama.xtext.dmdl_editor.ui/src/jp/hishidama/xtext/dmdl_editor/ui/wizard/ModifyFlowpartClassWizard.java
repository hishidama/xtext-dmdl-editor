package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowPartConstructorParser;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowpartClassModifier;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetArgumentPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.SetFlowpartPortPage;

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

	private SetFlowpartPortPage portPage;
	private SetArgumentPage argPage;

	public ModifyFlowpartClassWizard() {
		setWindowTitle("Modify FlowPart Constructor/Field");
	}

	public void init(IDocument document, IType type) {
		this.document = document;
		this.type = type;
	}

	@Override
	public void addPages() {
		FlowPartConstructorParser parser = new FlowPartConstructorParser(type);

		portPage = new SetFlowpartPortPage();
		portPage.init(parser);
		addPage(portPage);

		argPage = new SetArgumentPage();
		argPage.init(parser);
		addPage(argPage);
	}

	public IJavaProject getJavaProject() {
		return type.getJavaProject();
	}

	public IResource getDir() {
		return type.getResource();
	}

	@Override
	public boolean performFinish() {
		portPage.saveDialogSettings();

		FlowpartClassModifier mon = new FlowpartClassModifier(document, type, portPage, argPage);
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

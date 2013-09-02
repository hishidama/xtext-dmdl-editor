package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.DMDLFileUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectAddRemovePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage.ModelFile;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetAddAttributePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetAttributePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetRemoveAttributePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeUpdater;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class AttributeWizard extends Wizard implements IWorkbenchWizard {

	private IProject project;
	private List<IFile> list;

	private SelectDataModelPage modelPage;
	private SelectAddRemovePage selectPage;
	private SetAddAttributePage setAddAttrPage;
	private SetRemoveAttributePage setRemoveAttrPage;

	public AttributeWizard() {
		setWindowTitle("属性の追加/削除");
		setDialogSettings(DMDLActivator.getInstance().getDialogSettings());
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		list = DMDLFileUtil.getSelectionDmdlFiles(selection);
		if (!list.isEmpty()) {
			this.project = list.get(0).getProject();
		}
	}

	@Override
	public void addPages() {
		modelPage = new SelectDataModelPage("変更するデータモデルの指定", list);
		modelPage.setDescription("属性を変更するデータモデルを選択して下さい。");
		addPage(modelPage);
		selectPage = new SelectAddRemovePage();
		addPage(selectPage);
		setAddAttrPage = new SetAddAttributePage();
		addPage(setAddAttrPage);
		setRemoveAttrPage = new SetRemoveAttributePage();
		addPage(setRemoveAttrPage);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == setAddAttrPage) {
			page = setRemoveAttrPage;
		}
		IWizardPage nextPage = super.getNextPage(page);
		return getPage(nextPage);
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		if (page == setRemoveAttrPage) {
			page = setAddAttrPage;
		}
		IWizardPage prevPage = super.getPreviousPage(page);
		return getPage(prevPage);
	}

	private IWizardPage getPage(IWizardPage page) {
		if (page == setAddAttrPage || page == setRemoveAttrPage) {
			return getSetAttributePage();
		}
		return page;
	}

	private SetAttributePage getSetAttributePage() {
		if (selectPage.isAdd()) {
			return setAddAttrPage;
		} else {
			return setRemoveAttrPage;
		}
	}

	@Override
	public boolean canFinish() {
		IWizardPage[] pages = getPages();
		for (IWizardPage p : pages) {
			IWizardPage page = getPage(p);
			if (!page.isPageComplete()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean performFinish() {
		SetAttributePage setAttrPage = getSetAttributePage();
		String modelAttr = setAttrPage.getModelAttribute();
		String propAttr = setAttrPage.getPropertyAttribute();
		List<ModelFile> list = modelPage.getModelList();

		try {
			AttributeUpdater updater = setAttrPage.getUpdater(selectPage);
			updater.setAttribute(modelAttr, propAttr);
			if (!updater.execute(list)) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		if (project != null) {
			// TODO 属性変更後にエラーチェックを呼び出すか？
			// DMDLErrorCheckHandler handler = new DMDLErrorCheckHandler();
			// handler.execute(project, getContainer());
		}
		return true;
	}
}

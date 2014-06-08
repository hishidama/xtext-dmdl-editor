package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.ModifyModelAttributePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.ModifyPropertyAttributePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.SetDataModelNamePage;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.IWizardPage;

public class EditDataModelWizard extends NewDataModelWizard {

	private ModelDefinition model;

	private ModifyModelAttributePage modelAttrPage;
	private ModifyPropertyAttributePage propAttrPage;

	public void init(IFile file, ModelDefinition model, DataModelType fixType, String description) {
		super.init(file.getProject(), fixType);

		this.model = model;
		this.modelName = model.getName();
		this.modelDescription = description;
		this.defaultFile = file.getProjectRelativePath().toPortableString();

		setWindowTitle("データモデルの編集 : " + modelName);
	}

	@Override
	public void addPages() {
		super.addPages();
		CreateDataModelPage<?> createPage = (CreateDataModelPage<?>) getPages()[0];

		modelAttrPage = new ModifyModelAttributePage(project);
		modelAttrPage.setAttribute(ModelUtil.getAttributeString(model));
		addPage(modelAttrPage);
		propAttrPage = new ModifyPropertyAttributePage(createPage, project);
		addPage(propAttrPage);
	}

	@Override
	protected void addModelPage(SetDataModelNamePage page) {
		page.setDataModelName(modelName);
		page.setDataModelDescription(modelDescription);

		// ページの追加は行わない（super.addPage()は呼ばない）
	}

	@Override
	protected IWizardPage getPage(IWizardPage page) {
		if (page == propAttrPage) {
			CreateDataModelPage<?> createPage = getFirstCreatePage();
			propAttrPage.setPropertyList(model, createPage.getDefinedPropertyList());
		}
		if (page != modelAttrPage) {
			for (IWizardPage p : getCreatePages()) {
				CreateDataModelPage<?> createPage = (CreateDataModelPage<?>) p;
				createPage.setModelAttribute(modelAttrPage.getModelAttribute());
			}
		}

		return super.getPage(page);
	}

	@Override
	public boolean canFinish() {
		for (IWizardPage page : getPages()) {
			if (!page.isPageComplete()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean performFinish() {
		CreateDataModelPage<?> createPage = getLastCreatePage();
		createPage.setModelAttribute(modelAttrPage.getModelAttribute());

		return super.performFinish();
	}
}

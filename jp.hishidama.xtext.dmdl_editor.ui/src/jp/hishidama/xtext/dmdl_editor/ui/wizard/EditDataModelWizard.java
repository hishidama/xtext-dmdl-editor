package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.DataModelType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetDataModelNamePage;

import org.eclipse.core.resources.IFile;

public class EditDataModelWizard extends NewDataModelWizard {

	public void init(IFile file, ModelDefinition model, DataModelType fixType, String description) {
		init(file, fixType, model.getName(), description);
	}

	private void init(IFile file, DataModelType fixType, String modelName, String description) {
		super.init(file.getProject(), fixType);

		this.modelName = modelName;
		this.modelDescription = description;
		this.defaultFile = file.getProjectRelativePath().toPortableString();

		setWindowTitle("データモデルの編集 : " + modelName);
	}

	@Override
	protected void addModelPage(SetDataModelNamePage page) {
		page.setDataModelName(modelName);
		page.setDataModelDescription(modelDescription);

		// ページの追加は行わない（super.addPage()は呼ばない）
	}
}

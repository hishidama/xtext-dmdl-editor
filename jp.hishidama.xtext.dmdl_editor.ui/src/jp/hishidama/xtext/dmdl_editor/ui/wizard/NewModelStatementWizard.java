package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement.ModelStatementGenerator;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement.SetStatementPage;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.Wizard;

public class NewModelStatementWizard extends Wizard {

	private IProject project;
	private IDocument document;
	private int offset;

	private SelectDataModelPage modelPage;
	private SetStatementPage statementPage;

	public NewModelStatementWizard() {
		setWindowTitle("データモデルを用いたステートメント一括生成");
		setDialogSettings(DMDLActivator.getInstance().getDialogSettings());
	}

	public void init(IProject project, IDocument document, int offset) {
		this.project = project;
		this.document = document;
		this.offset = offset;
	}

	@Override
	public void addPages() {
		modelPage = new SelectDataModelPage("使用するデータモデルの指定", project, null, true, true);
		modelPage.setDescription("対象となるデータモデルを選択して下さい。");
		addPage(modelPage);

		statementPage = new SetStatementPage(false);
		addPage(statementPage);
	}

	@Override
	public boolean performFinish() {
		statementPage.saveDialogSettings();

		ModelStatementGenerator gen = new ModelStatementGenerator();
		try {
			gen.execute(document, offset, modelPage, statementPage);
		} catch (Exception e) {
			IStatus status = LogUtil.logError("generate statement error.", e);
			ErrorDialog.openError(getShell(), "error", "generate statement error.", status);
			return false;
		}

		return true;
	}
}

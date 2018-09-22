package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.MasterJoinInputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectMasterSelectionTargetPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorInputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorOutputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorTypePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetBranchEnumPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetCacheFieldPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetMasterSelectionPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetOperatorNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen.OperatorGenerator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class NewOperatorMethodWizard extends Wizard {

	private IDocument document;
	private IType type;
	private IProject project;
	private int offset;

	private SelectOperatorTypePage typePage;
	private SetOperatorNamePage namePage;
	private Map<OperatorType, List<IWizardPage>> pageMap = new EnumMap<OperatorType, List<IWizardPage>>(OperatorType.class);

	public NewOperatorMethodWizard() {
		setWindowTitle("演算子メソッドの作成");
		setDialogSettings(DMDLActivator.getInstance().getDialogSettings());
	}

	public void init(IDocument document, IType type, int offset) {
		this.document = document;
		this.type = type;
		this.project = type.getJavaProject().getProject();
		this.offset = offset;
	}

	@Override
	public void addPages() {
		typePage = new SelectOperatorTypePage();
		addPage(typePage);

		namePage = new SetOperatorNamePage(type, offset);
		addPage(namePage);

		addBranchPages();
		addUpdatePages();
		addConvertPages();
		addExtractPages();
		addMasterCheckPages();
		addMasterJoinPages();
		addMasterBranchPages();
		addMasterJoinUpdatePages();
		addMasterSelectionPages();
		addCoGroupPages();
		addSplitPages();
		addSummarizePages();
		addFoldPages();
		addGroupSortPages();
		addLoggingPages();
	}

	private void addBranchPages() {
		OperatorType opType = OperatorType.BRANCH;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.addRole("in");
		addPage(opType, inputPage);

		SetBranchEnumPage outputPage = new SetBranchEnumPage(type, opType);
		addPage(opType, outputPage);
	}

	private void addUpdatePages() {
		OperatorType opType = OperatorType.UPDATE;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.addRole("in/out");
		addPage(opType, inputPage);
	}

	private void addConvertPages() {
		OperatorType opType = OperatorType.CONVERT;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.addRole("in");
		addPage(opType, inputPage);

		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType) {
			@Override
			protected String validate(OperatorOutputModelRow row, int i) {
				if (row.projective) {
					return "変換演算子の出力には射影モデルを指定できません。";
				}
				return super.validate(row, i);
			}
		};
		outputPage.addRole("out");
		outputPage.setInputPage(inputPage);
		addPage(opType, outputPage);

		SetCacheFieldPage fieldPage = new SetCacheFieldPage(type, opType, null, outputPage, true);
		addPage(opType, fieldPage);
	}

	private void addExtractPages() {
		OperatorType opType = OperatorType.EXTRACT;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.addRole("in");
		addPage(opType, inputPage);

		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType);
		outputPage.setOutputIsResult(true);
		outputPage.setInputPage(inputPage);
		addPage(opType, outputPage);

		SetCacheFieldPage fieldPage = new SetCacheFieldPage(type, opType, null, outputPage, false);
		addPage(opType, fieldPage);
	}

	private void addMasterCheckPages() {
		OperatorType opType = OperatorType.MASTER_CHECK;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, true, false);
		inputPage.addRole("master");
		inputPage.addRole("tx");
		addPage(opType, inputPage);

		SetMasterSelectionPage msPage = new SetMasterSelectionPage(type, opType);
		addPage(opType, msPage);
	}

	private void addMasterJoinPages() {
		OperatorType opType = OperatorType.MASTER_JOIN;
		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType, "結合モデル（MasterJoin演算子の出力となるデータモデル）を選択して下さい。");
		outputPage.setJoinModelOnly();
		outputPage.addRole("out");
		addPage(opType, outputPage);

		MasterJoinInputModelPage inputPage = new MasterJoinInputModelPage(project, outputPage);
		inputPage.addRole("master");
		inputPage.addRole("tx");
		addPage(opType, inputPage);

		SetMasterSelectionPage msPage = new SetMasterSelectionPage(type, opType);
		addPage(opType, msPage);
	}

	private void addMasterBranchPages() {
		OperatorType opType = OperatorType.MASTER_BRANCH;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, true, false);
		inputPage.addRole("master");
		inputPage.addRole("tx");
		addPage(opType, inputPage);

		SetBranchEnumPage outputPage = new SetBranchEnumPage(type, opType);
		addPage(opType, outputPage);

		SetMasterSelectionPage msPage = new SetMasterSelectionPage(type, opType);
		addPage(opType, msPage);
	}

	private void addMasterJoinUpdatePages() {
		OperatorType opType = OperatorType.MASTER_JOIN_UPDATE;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, true, false);
		inputPage.addRole("master");
		inputPage.addRole("tx");
		addPage(opType, inputPage);

		SetMasterSelectionPage msPage = new SetMasterSelectionPage(type, opType);
		addPage(opType, msPage);
	}

	private void addMasterSelectionPages() {
		OperatorType opType = OperatorType.MASTER_SELECTION;

		SelectMasterSelectionTargetPage msPage = new SelectMasterSelectionTargetPage(type, offset);
		addPage(opType, msPage);
	}

	private void addCoGroupPages() {
		OperatorType opType = OperatorType.CO_GROUP;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, true, true, true);
		addPage(opType, inputPage);

		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType);
		outputPage.setOutputIsResult(true);
		outputPage.setInputPage(inputPage);
		addPage(opType, outputPage);

		SetCacheFieldPage fieldPage = new SetCacheFieldPage(type, opType, null, outputPage, false);
		addPage(opType, fieldPage);
	}

	private void addSplitPages() {
		OperatorType opType = OperatorType.SPLIT;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.setJoinModelOnly();
		inputPage.addRole("in");
		addPage(opType, inputPage);
	}

	private void addSummarizePages() {
		OperatorType opType = OperatorType.SUMMARIZE;
		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType, "集計モデル（Summarize演算子の出力となるデータモデル）を選択して下さい。");
		outputPage.setSummarizeModelOnly();
		outputPage.addRole("out");
		addPage(opType, outputPage);
	}

	private void addFoldPages() {
		OperatorType opType = OperatorType.FOLD;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, true, false);
		inputPage.addRole("in/out");
		addPage(opType, inputPage);
	}

	private void addGroupSortPages() {
		OperatorType opType = OperatorType.GROUP_SORT;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, true, true, true);
		inputPage.addRole("in");
		addPage(opType, inputPage);

		SelectOperatorOutputModelPage outputPage = new SelectOperatorOutputModelPage(project, opType);
		outputPage.setOutputIsResult(true);
		outputPage.setInputPage(inputPage);
		addPage(opType, outputPage);

		SetCacheFieldPage fieldPage = new SetCacheFieldPage(type, opType, null, outputPage, false);
		addPage(opType, fieldPage);
	}

	private void addLoggingPages() {
		OperatorType opType = OperatorType.LOGGING;
		SelectOperatorInputModelPage inputPage = new SelectOperatorInputModelPage(project, opType, false, false, false);
		inputPage.addRole("in/out");
		addPage(opType, inputPage);
	}

	private void addPage(OperatorType opType, IWizardPage page) {
		addPage(page);

		List<IWizardPage> list = pageMap.get(opType);
		if (list == null) {
			list = new ArrayList<IWizardPage>();
			pageMap.put(opType, list);
		}
		list.add(page);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == namePage) {
			List<IWizardPage> list = getPageList(getOperatorType());
			return list.get(0);
		} else if (page != typePage) {
			List<IWizardPage> list = getPageList(getOperatorType());
			if (page == list.get(list.size() - 1)) {
				return null;
			}
		}
		return super.getNextPage(page);
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		if (page != namePage && page != typePage) {
			List<IWizardPage> list = getPageList(getOperatorType());
			if (page == list.get(0)) {
				return namePage;
			}
		}
		return super.getPreviousPage(page);
	}

	private OperatorType getOperatorType() {
		return typePage.getOperatorType();
	}

	private List<IWizardPage> getPageList(OperatorType opType) {
		return pageMap.get(opType);
	}

	@Override
	public boolean canFinish() {
		if (!typePage.isPageComplete()) {
			return false;
		}
		if (!namePage.isPageComplete()) {
			return false;
		}

		List<IWizardPage> list = getPageList(getOperatorType());
		for (IWizardPage page : list) {
			if (!page.isPageComplete()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean performFinish() {
		try {
			OperatorType opType = getOperatorType();
			OperatorGenerator generator = OperatorGenerator.create(opType);
			generator.prepare(document, type, namePage, getPageList(opType));
			generator.execute();
		} catch (Exception e) {
			IStatus status;
			if (e instanceof CoreException) {
				status = ((CoreException) e).getStatus();
			} else {
				status = LogUtil.logError("error", e);
			}
			ErrorDialog.openError(getShell(), "error", e.getClass().getName(), status);
			return false;
		}

		typePage.saveDialogSettings();
		return true;
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;

public class MasterJoinInputModelPage extends SelectOperatorInputModelPage {

	private SelectOperatorOutputModelPage outputPage;
	private String joinModelName;

	public MasterJoinInputModelPage(IProject project, SelectOperatorOutputModelPage outputPage) {
		super(project, OperatorType.MASTER_JOIN, false, false);
		this.outputPage = outputPage;

		setDescription("結合モデルのマスター/トランザクションを選択して下さい。");
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			initializeTable();
		}
	}

	private void initializeTable() {
		String name = getJoinModelName();
		if (name.equals(joinModelName)) {
			return;
		}
		this.joinModelName = name;

		List<OperatorInputModelRow> list = super.getElementList();

		ModelDefinition model = ModelUiUtil.findModel(project, name);
		JoinExpression rhs = ModelUtil.getJoinExpression(model);
		if (rhs == null) {
			MessageDialog.openError(getShell(), "MasterJoinInputModelPage error", MessageFormat.format(
					"結合モデル{0}の情報が取得できませんでした。\nデータモデルにエラーが無いか、DMDLのコンパイルやEclipseのビルドが正常に行われているか等を確認して下さい。", name));
			joinModelName = null;
			table.refresh();
			return;
		}
		int i = 0;
		for (JoinTerm term : rhs.getTerms()) {
			ModelReference ref = term.getReference();
			if (ref != null) {
				ModelDefinition rmodel = ref.getName();
				if (rmodel != null) {
					OperatorInputModelRow row = list.get(i++);
					String modelName = rmodel.getName();
					if (StringUtil.isEmpty(row.name) || row.name.equals(StringUtil.toLowerCamelCase(row.modelName))) {
						row.name = StringUtil.toLowerCamelCase(modelName);
					}
					row.modelName = modelName;
					row.modelDescription = ModelUtil.getDecodedDescriptionText(rmodel);
					row.setModelClassName(ModelUiUtil.getModelClassName(project, modelName));
				}
			}
			if (i >= 2) {
				break;
			}
		}
		table.refresh();
		validate(false);
	}

	private String getJoinModelName() {
		List<OperatorOutputModelRow> olist = outputPage.getElementList();
		for (OperatorOutputModelRow row : olist) {
			return row.modelName;
		}
		throw new IllegalStateException();
	}

	@Override
	protected OperatorInputModelDialog createOperatorInputModelDialog(OperatorInputModelRow element) {
		OperatorInputModelDialog dialog = super.createOperatorInputModelDialog(element);
		dialog.setSelectModel(false);
		return dialog;
	}
}

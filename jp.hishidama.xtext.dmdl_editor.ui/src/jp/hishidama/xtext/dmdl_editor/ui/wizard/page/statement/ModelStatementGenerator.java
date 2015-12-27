package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage.ModelFile;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class ModelStatementGenerator {

	public void execute(IDocument document, int offset, SelectDataModelPage modelPage, SetStatementPage statementPage)
			throws BadLocationException {
		String statement = getStatementText(statementPage);

		List<ModelFile> modelList = modelPage.getModelList();

		StringBuilder sb = new StringBuilder(statement.length() * modelList.size() * 2);
		for (ModelFile row : modelList) {
			String s = DMDLVariableTableUtil.replaceVariable(statement, row.model, null);
			sb.append(s);
		}

		document.replace(offset, 0, sb.toString());
	}

	private String getStatementText(SetStatementPage statementPage) {
		String statement = statementPage.getStatementText();
		String[] ss = statement.split("\n");
		StringBuilder sb = new StringBuilder(statement.length() + ss.length);
		for (String s : ss) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}
}

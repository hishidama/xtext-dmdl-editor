package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class PropertyStatementGenerator {

	public void execute(IDocument document, int offset, SelectPropertyPage propertyPage, SetStatementPage statementPage)
			throws BadLocationException {
		String statement = getStatementText(statementPage);

		List<PropertyRow> propertyList = propertyPage.getPropertyList();

		StringBuilder sb = new StringBuilder(statement.length() * propertyList.size() * 2);
		for (PropertyRow row : propertyList) {
			String s = DMDLVariableTableUtil.replaceVariable(statement, null, null, row.name, row.description);
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

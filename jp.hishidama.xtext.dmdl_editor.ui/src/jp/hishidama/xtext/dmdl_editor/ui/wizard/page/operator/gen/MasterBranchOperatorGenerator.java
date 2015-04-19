package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetBranchEnumPage;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class MasterBranchOperatorGenerator extends BranchOperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return getMasterAnnotaion(OperatorType.MASTER_BRANCH);
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name, row.keyList, null));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}
	}

	@Override
	protected Block getBody() {
		Block block = ast.newBlock();
		@SuppressWarnings("unchecked")
		List<Statement> slist = block.statements();
		slist.add(newCommentStatement());
		slist.add(newReturnStatement(ast.newNullLiteral()));
		return block;
	}

	private EmptyStatement newCommentStatement() {
		String name = null;
		List<OperatorInputModelRow> ilist = getInputModelList();
		if (ilist.size() >= 1) {
			OperatorInputModelRow row = ilist.get(0);
			name = row.name;
		}

		SetBranchEnumPage page = getBranchEnumPage();
		String enumName = StringUtil.getSimpleName(page.getEnumName());

		ASTRewrite rewriter = getAstRewrite();
		String comment = "// TODO MasterBranchでは、マスターが無い場合にnullが渡ってくるので、nullチェックが必要です。";
		if (name != null) {
			comment += String.format("\n// if (%s == null) {\n" + "// return %s.MISSED;\n" + "// }", name, enumName);
		}
		EmptyStatement statement = (EmptyStatement) rewriter.createStringPlaceholder(comment, ASTNode.EMPTY_STATEMENT);
		return statement;
	}

	@Override
	protected ASTNode insertOther(ListRewrite listRewrite, MethodDeclaration method) {
		ASTNode prev = super.insertOther(listRewrite, method);
		if (prev == null) {
			prev = method;
		}
		return insertMasterSelectionMethod(listRewrite, prev);
	}
}

package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class ExtractOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.EXTRACT.getTypeName());
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}

		addViewParameters(plist, javadoc, true);

		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			plist.add(newResultParameter(row.getModelTypeName(), row.name));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}
	}

	@Override
	protected Block getBody() {
		Block block = ast.newBlock();
		@SuppressWarnings("unchecked")
		List<Statement> slist = block.statements();
		slist.add(newResultCommentStatement());
		return block;
	}

	@Override
	protected ASTNode insertOther(ListRewrite listRewrite, MethodDeclaration method) {
		createDataModelFields(listRewrite, method);
		return method;
	}
}

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
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class MasterJoinOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return getMasterAnnotaion(OperatorType.MASTER_JOIN);
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			addJavadocReturn(javadoc, row.getLabel());
			return row.getModelTypeName();
		}
		throw new IllegalStateException();
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}
	}

	@Override
	protected Block getBody() {
		return null;
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

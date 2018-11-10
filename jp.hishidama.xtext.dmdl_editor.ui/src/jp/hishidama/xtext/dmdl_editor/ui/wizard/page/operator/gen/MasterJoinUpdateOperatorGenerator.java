package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class MasterJoinUpdateOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return getMasterAnnotaion(OperatorType.MASTER_JOIN_UPDATE);
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name, row.keyList, null));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}

		addViewParameters(plist, javadoc, true);
	}

	@Override
	protected Block getBody() {
		return newEmptyBlock();
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

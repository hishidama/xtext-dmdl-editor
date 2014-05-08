package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;

public class ConvertOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.CONVERT.getTypeName());
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		OperatorOutputModelRow row = getReturnRow();
		addJavadocReturn(javadoc, row.getLabel());
		return row.modelClassName;
	}

	private OperatorOutputModelRow getReturnRow() {
		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			return row;
		}
		throw new IllegalStateException();
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.modelClassName, row.name));
			addJavadocParam(javadoc, row.name, row.getLabel());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Block getBody() {
		ASTRewrite rewriter = getAstRewrite();

		Block block = ast.newBlock();
		List<Statement> slist = block.statements();

		OperatorOutputModelRow rrow = getReturnRow();
		String resultClass = getImportRewrite().addImport(rrow.modelClassName);
		slist.add((Statement) rewriter.createStringPlaceholder(
				String.format("%s result = new %s();", resultClass, resultClass), ASTNode.EMPTY_STATEMENT));

		addStatement(slist, rrow);

		ReturnStatement ret = ast.newReturnStatement();
		ret.setExpression(ast.newSimpleName("result"));
		slist.add(ret);
		return block;
	}

	private void addStatement(List<Statement> slist, OperatorOutputModelRow rrow) {
		OperatorInputModelRow row = getInputRow();
		Set<String> set = new HashSet<String>();
		{
			List<Property> plist = ModelUiUtil.getProperties(getProject(), row.modelName);
			if (plist != null) {
				for (Property property : plist) {
					set.add(property.getName());
				}
			}
		}

		List<Property> plist = ModelUiUtil.getProperties(getProject(), rrow.modelName);
		if (plist != null) {
			ASTRewrite rewriter = getAstRewrite();
			for (Property property : plist) {
				String name = property.getName();
				String dst = String.format("set%sOption", StringUtil.toCamelCase(name));
				String src = set.contains(name) ? String.format("%s.get%sOption()", row.name,
						StringUtil.toCamelCase(name)) : "/*TODO*/null";

				slist.add((Statement) rewriter.createStringPlaceholder(String.format("result.%s(%s);", dst, src),
						ASTNode.EMPTY_STATEMENT));
			}
		}
	}

	private OperatorInputModelRow getInputRow() {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			return row;
		}
		throw new IllegalStateException();
	}
}

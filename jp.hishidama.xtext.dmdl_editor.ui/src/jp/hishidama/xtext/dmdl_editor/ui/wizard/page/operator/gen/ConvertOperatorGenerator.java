package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.text.MessageFormat;
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
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

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
		Block block = ast.newBlock();
		List<Statement> slist = block.statements();

		OperatorOutputModelRow rrow = getReturnRow();
		String fieldName = getFieldName();
		slist.add(newVariableDeclarationStatement(rrow.modelClassName, "result", ast.newSimpleName(fieldName)));
		slist.add(newMethodInvocationStatement("result", "reset"));

		addStatement(slist, rrow);

		slist.add(newReturnStatement(ast.newSimpleName("result")));
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
				String camelName = StringUtil.toCamelCase(name);

				Expression arg;
				if (set.contains(name)) {
					arg = newMethodInvocation(row.name, String.format("get%sOption", camelName));
				} else {
					arg = (NullLiteral) rewriter.createStringPlaceholder("/*TODO*/null", ASTNode.NULL_LITERAL);
				}

				slist.add(newMethodInvocationStatement("result", String.format("set%sOption", camelName), arg));
			}
		}
	}

	@Override
	protected ASTNode insertOther(ListRewrite listRewrite, MethodDeclaration method) {
		FieldDeclaration field = createField();
		listRewrite.insertBefore(field, method, null);
		return method;
	}

	private FieldDeclaration createField() {
		String name = getFieldName();
		OperatorOutputModelRow row = getReturnRow();
		String className = row.modelClassName;
		FieldDeclaration field = newFieldDeclaration(className, name, true);

		String inputClassName = getImportRewrite().addImport(getInputRow().modelClassName);
		String comment = MessageFormat.format("'{'@link #{0}({1})'}'で利用するデータモデル.", methodName, inputClassName);
		Javadoc javadoc = newJavadoc(comment);
		field.setJavadoc(javadoc);

		return field;
	}

	private String getFieldName() {
		String name = methodName + "ResultModel";
		return name;
	}

	private OperatorInputModelRow getInputRow() {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			return row;
		}
		throw new IllegalStateException();
	}
}

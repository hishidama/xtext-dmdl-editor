package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;

public class FoldOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.FOLD.getTypeName());
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			String left = getLeftName(row);
			String right = getRightName(left);
			plist.add(newSimpleParameter(row.getModelTypeName(), left, row.keyList, null));
			plist.add(newSimpleParameter(row.getModelTypeName(), right));
			addJavadocParam(javadoc, left, row.getLabel());
			addJavadocParam(javadoc, right, row.getLabel());
			return;
		}
	}

	private String getLeftName(OperatorInputModelRow row) {
		return row.name;
	}

	private String getRightName(String left) {
		return "right".equals(left) ? "other" : "right";
	}

	@Override
	protected Block getBody() {
		Block block = ast.newBlock();
		@SuppressWarnings("unchecked")
		List<Statement> slist = block.statements();

		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			addStatement(slist, row);
			break;
		}
		return block;
	}

	private void addStatement(List<Statement> slist, OperatorInputModelRow row) {
		String left = getLeftName(row);
		String right = getRightName(left);

		List<Property> plist = ModelUiUtil.getProperties(getProject(), row.modelName);
		if (plist != null) {
			for (Property property : plist) {
				if (PropertyUtil.isPropertyReference(property)) {
					continue;
				}
				String name = property.getName();
				String camelName = StringUtil.toCamelCase(name);

				Expression arg = newMethodInvocation(right, String.format("get%sOption", camelName));
				slist.add(newMethodInvocationStatement(left, String.format("set%sOption", camelName), arg));
			}
		}
	}
}

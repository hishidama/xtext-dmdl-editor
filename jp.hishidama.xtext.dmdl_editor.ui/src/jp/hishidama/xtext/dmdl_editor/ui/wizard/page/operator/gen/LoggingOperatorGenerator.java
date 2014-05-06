package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class LoggingOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		String name = OperatorType.LOGGING.getTypeName();
		String value = getImportRewrite().addImport("com.asakusafw.vocabulary.operator.Logging") + ".Level.ERROR";
		return newSingleMemberAnnotation(name, value);
	}

	@Override
	protected String getReturnTypeName() {
		return "java.lang.String";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.modelClassName, row.name));
		}
	}

	@Override
	protected Block getBody() {
		return newReturnNullBlock();
	}
}

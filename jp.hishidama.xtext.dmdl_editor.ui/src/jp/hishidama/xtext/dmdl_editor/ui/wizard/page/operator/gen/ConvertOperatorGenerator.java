package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class ConvertOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.CONVERT.getTypeName());
	}

	@Override
	protected String getReturnTypeName() {
		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			return row.modelClassName;
		}
		throw new IllegalStateException();
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

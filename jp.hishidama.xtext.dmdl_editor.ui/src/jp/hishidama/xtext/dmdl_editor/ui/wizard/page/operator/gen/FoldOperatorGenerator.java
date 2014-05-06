package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;

import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class FoldOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.FOLD.getTypeName());
	}

	@Override
	protected String getReturnTypeName() {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.modelClassName, "left", row.keyList, null));
			plist.add(newSimpleParameter(row.modelClassName, "right"));
			return;
		}
	}

	@Override
	protected Block getBody() {
		return newEmptyBlock();
	}
}

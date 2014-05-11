package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.internal.ui.javaeditor.EditorUtility;
import org.eclipse.ui.texteditor.ITextEditor;

@SuppressWarnings("restriction")
public class DmdlJdtPropertyTester extends PropertyTester {

	// @Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		ITextEditor editor = (ITextEditor) receiver;
		ITypeRoot element = EditorUtility.getEditorInputJavaElement(editor, true);
		if (element != null) {
			if ("isFlowClass".equals(property)) {
				return isFlowClass(element);
			}
		}
		return false;
	}

	private boolean isFlowClass(ITypeRoot root) {
		IType type = root.findPrimaryType();
		if (type != null) {
			return FlowUtil.isFlow(type);
		}
		return false;
	}
}

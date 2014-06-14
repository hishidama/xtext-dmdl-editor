package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.OutlineCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public class OutlineCopyJavaNameHandler extends AbstractCopyJavaNameHandler {

	@Override
	protected String getName(ExecutionEvent event) {
		IOutlineNode outlineNode = getOutlineNode(event);
		if (outlineNode == null) {
			return null;
		}
		if (outlineNode instanceof EStructuralFeatureNode) {
			EStructuralFeatureNode sfNode = (EStructuralFeatureNode) outlineNode;
			Object text = sfNode.getText();
			if (text instanceof String) {
				return StringUtil.toCamelCase((String) text);
			}
		}
		return outlineNode.readOnly(new IUnitOfWork<String, EObject>() {
			// @Override
			public String exec(EObject selectedElement) throws Exception {
				return getJavaName(selectedElement);
			}
		});
	}

	private IOutlineNode getOutlineNode(ExecutionEvent event) {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (!(currentSelection instanceof IStructuredSelection)) {
			return null;
		}
		IStructuredSelection structuredSelection = (IStructuredSelection) currentSelection;
		return (IOutlineNode) structuredSelection.getFirstElement();
	}
}

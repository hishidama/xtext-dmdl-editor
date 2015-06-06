package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.OutlineCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public class OutlineCopyJavaNameHandler extends AbstractCopyJavaNameHandler {

	@Override
	protected String getName(ExecutionEvent event) {
		List<String> list = getNames(event);
		if (list.isEmpty()) {
			return null;
		}
		return StringUtil.toString(list);
	}

	protected List<String> getNames(ExecutionEvent event) {
		List<IOutlineNode> nodeList = getOutlineNode(event);
		List<String> list = new ArrayList<String>(nodeList.size());

		for (IOutlineNode node : nodeList) {
			String name = getName(node);
			if (name != null) {
				list.add(name);
			}
		}

		return list;
	}

	@SuppressWarnings("unchecked")
	private List<IOutlineNode> getOutlineNode(ExecutionEvent event) {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (!(currentSelection instanceof IStructuredSelection)) {
			return Collections.emptyList();
		}

		IStructuredSelection structuredSelection = (IStructuredSelection) currentSelection;
		return structuredSelection.toList();
	}

	private String getName(IOutlineNode outlineNode) {
		Object text = outlineNode.getText();
		if (text instanceof String) {
			String s = (String) text;
			int n = s.indexOf(':');
			return StringUtil.toCamelCase((n < 0) ? s : s.substring(0, n).trim());
		}

		return outlineNode.readOnly(new IUnitOfWork<String, EObject>() {
			// @Override
			public String exec(EObject selectedElement) throws Exception {
				return getJavaName(selectedElement);
			}
		});
	}
}

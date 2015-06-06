package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.copyname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.copyqualifiedname.ClipboardUtil;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.AbstractCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public abstract class AbstractModelHierarychyCopyHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String qualifiedName = getText(event);
		return ClipboardUtil.copy(qualifiedName);
	}

	protected String getText(ExecutionEvent event) {
		List<String> list = getTextList(event);
		if (list.isEmpty()) {
			return null;
		}
		return StringUtil.toString(list);
	}

	protected List<String> getTextList(ExecutionEvent event) {
		List<ModelProperty> propertyList = getPropertyList(event);
		List<String> list = new ArrayList<String>(propertyList.size());

		for (ModelProperty property : propertyList) {
			String name = getText(property);
			if (name != null) {
				list.add(name);
			}
		}

		return list;
	}

	@SuppressWarnings("unchecked")
	private List<ModelProperty> getPropertyList(ExecutionEvent event) {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (!(currentSelection instanceof IStructuredSelection)) {
			return Collections.emptyList();
		}

		IStructuredSelection structuredSelection = (IStructuredSelection) currentSelection;
		return structuredSelection.toList();
	}

	protected abstract String getText(ModelProperty property);
}

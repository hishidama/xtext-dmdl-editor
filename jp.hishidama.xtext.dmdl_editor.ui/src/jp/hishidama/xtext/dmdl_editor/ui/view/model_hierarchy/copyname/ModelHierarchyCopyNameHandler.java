package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.copyname;

import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;
import jp.hishidama.xtext.dmdl_editor.ui.editor.copyname.GetModelPropertyName;

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
public class ModelHierarchyCopyNameHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String text = getText(event);
		return ClipboardUtil.copy(text);
	}

	protected String getText(ExecutionEvent event) {
		List<ModelProperty> list = getPropertyList(event);
		if (list.isEmpty()) {
			return null;
		}

		String action = event
				.getParameter("jp.hishidama.xtext.dmdl_editor.ui.editor.copyname.ModelHierarchyCopyName.action");
		GetModelPropertyName getter = GetModelPropertyName.create(action);
		if (getter == null) {
			return null;
		}

		for (ModelProperty object : list) {
			if (object.hasProperty()) {
				getter.append(object.getProperty());
			} else {
				getter.append(object.getModel());
			}
		}
		return getter.getText();
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
}

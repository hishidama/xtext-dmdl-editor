package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.copyqualifiedname.ClipboardUtil;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.OutlineCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public class OutlineCopyNameHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String text = getText(event);
		return ClipboardUtil.copy(text);
	}

	protected String getText(ExecutionEvent event) {
		List<EObject> list = getEObjects(event);
		if (list.isEmpty()) {
			return null;
		}

		String action = event.getParameter("jp.hishidama.xtext.dmdl_editor.ui.editor.copyname.OutlineCopyName.action");
		GetModelPropertyName getter = GetModelPropertyName.create(action);
		if (getter == null) {
			return null;
		}

		for (EObject object : list) {
			if (object instanceof Property) {
				Property property = (Property) object;
				getter.append(property);
			} else if (object instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) object;
				getter.append(model);
			}
		}
		return getter.getText();
	}

	protected List<EObject> getEObjects(ExecutionEvent event) {
		List<IOutlineNode> nodeList = getOutlineNode(event);
		List<EObject> list = new ArrayList<EObject>(nodeList.size());

		for (IOutlineNode node : nodeList) {
			EObject obj = getEObject(node);
			if (obj != null) {
				list.add(obj);
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

	private EObject getEObject(IOutlineNode outlineNode) {
		return outlineNode.readOnly(new IUnitOfWork<EObject, EObject>() {
			// @Override
			public EObject exec(EObject selectedElement) throws Exception {
				for (EObject object = selectedElement; object != null; object = object.eContainer()) {
					if (object instanceof ModelDefinition) {
						return object;
					}
					if (object instanceof ModelReference) {
						ModelDefinition model = ((ModelReference) object).getName();
						return model;
					}
					if (object instanceof Property) {
						return object;
					}
					if (object instanceof AttributeList) {
						return null;
					}
					if (object instanceof Grouping) {
						return null;
					}
				}
				return null;
			}
		});
	}
}

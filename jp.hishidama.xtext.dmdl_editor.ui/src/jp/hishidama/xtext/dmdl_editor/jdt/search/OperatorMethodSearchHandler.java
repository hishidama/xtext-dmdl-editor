package jp.hishidama.xtext.dmdl_editor.jdt.search;

import java.lang.reflect.InvocationTargetException;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.ui.actions.SelectionConverter;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.ui.actions.FindReferencesAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

@SuppressWarnings("restriction")
public class OperatorMethodSearchHandler extends AbstractHandler {

	// @Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof JavaEditor) {
			return findReferences((JavaEditor) editor);
		}
		return null;
	}

	private IJavaElement findReferences(JavaEditor editor) {
		try {
			IJavaElement[] elements = SelectionConverter.codeResolveForked(editor, true);
			if (elements.length <= 0) {
				return null;
			}
		} catch (InvocationTargetException e) {
			return null;
		} catch (InterruptedException e) {
			return null;
		}

		final IJavaElement[] returnTarget = { null };
		FindReferencesAction action = new FindReferencesAction(editor) {
			@Override
			public void run(IJavaElement element) {
				IJavaElement target = null;
				if (element instanceof IMethod) {
					target = getTargetMethod((IMethod) element);
				} else if (element instanceof IType) {
					target = getTargetType((IType) element);
				}

				if (target != null) {
					super.run(target);
					returnTarget[0] = target;
				}
			}
		};

		ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
		action.run(selection);

		return returnTarget[0];
	}

	private IMethod getTargetMethod(IMethod method) {
		IType type = method.getDeclaringType();
		if (FlowUtil.isFlowPart(type)) {
			IType flowType = getTargetType(type);
			return TypeUtil.findMethod(flowType, "create");
		}

		IType factoryType = getFactoryType(type);
		String methodName = OperatorUtil.convertUnderscoreName(method.getElementName());
		IMethod factoryMethod = TypeUtil.findMethod(factoryType, methodName);
		return factoryMethod;
	}

	private IType getTargetType(IType type) {
		return getFactoryType(type);
	}

	private IType getFactoryType(IType type) {
		String name = type.getFullyQualifiedName();
		name = StringUtil.removeEnds(name, "Impl");
		if (!name.endsWith("Factory")) {
			name += "Factory";
		}
		IType factoryType = TypeUtil.findType(type.getJavaProject(), name);
		return factoryType;
	}
}

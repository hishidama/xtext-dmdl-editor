package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.copyqualifiedname.ClipboardUtil;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.AbstractCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public abstract class AbstractCopyJavaNameHandler extends AbstractHandler {

	// @Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String qualifiedName = getName(event);
		return ClipboardUtil.copy(qualifiedName);
	}

	protected abstract String getName(ExecutionEvent event);

	protected String getJavaName(EObject selectedElement) {
		for (EObject object = selectedElement; object != null; object = object.eContainer()) {
			if (object instanceof ModelDefinition) {
				String modelName = ((ModelDefinition) object).getName();
				return StringUtil.toCamelCase(modelName);
			}
			if (object instanceof ModelReference) {
				ModelDefinition model = ((ModelReference) object).getName();
				if (model != null) {
					String modelName = model.getName();
					return StringUtil.toCamelCase(modelName);
				}
			}
			if (object instanceof Property) {
				String name = ((Property) object).getName();
				return StringUtil.toCamelCase(name);
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
}

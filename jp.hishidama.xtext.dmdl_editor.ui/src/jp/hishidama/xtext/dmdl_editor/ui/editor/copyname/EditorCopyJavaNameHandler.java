package jp.hishidama.xtext.dmdl_editor.ui.editor.copyname;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

/**
 * @see org.eclipse.xtext.ui.editor.copyqualifiedname.EditorCopyQualifiedNameHandler
 */
@SuppressWarnings("restriction")
public class EditorCopyJavaNameHandler extends AbstractCopyJavaNameHandler {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Override
	protected String getName(ExecutionEvent event) {
		XtextEditor activeXtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (activeXtextEditor == null) {
			return null;
		}
		final ITextSelection selection = getTextSelection(activeXtextEditor);
		return activeXtextEditor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {
			// @Override
			public String exec(XtextResource xTextResource) throws Exception {
				EObject selectedElement = getSelectedName(selection, xTextResource);
				return getJavaName(selectedElement);
			}
		});
	}

	private EObject getSelectedName(final ITextSelection selection, XtextResource xTextResource) {
		return eObjectAtOffsetHelper.resolveElementAt(xTextResource, selection.getOffset());
	}

	private ITextSelection getTextSelection(XtextEditor activeXtextEditor) {
		return (ITextSelection) activeXtextEditor.getSelectionProvider().getSelection();
	}
}

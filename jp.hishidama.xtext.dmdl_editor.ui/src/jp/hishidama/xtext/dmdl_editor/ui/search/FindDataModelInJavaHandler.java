package jp.hishidama.xtext.dmdl_editor.ui.search;

import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.actions.FindReferencesAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

//@see org.eclipse.xtext.ui.editor.findrefs.FindReferencesHandler
public class FindDataModelInJavaHandler extends AbstractHandler {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		try {
			final XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
			if (editor != null) {
				final ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
				editor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process(XtextResource state) throws Exception {
						EObject target = eObjectAtOffsetHelper.resolveElementAt(state, selection.getOffset());
						Property property = PropertyUtil.getProperty(target);
						if (property != null) {
							findReferences(event, property);
							return;
						}
						ModelDefinition model = ModelUtil.getModel(target);
						if (model != null) {
							findReferences(event, editor, model);
							return;
						}
					}
				});
			}
		} catch (Exception e) {
			LogUtil.logError("Error finding references", e);
		}

		return null;
	}

	private void findReferences(ExecutionEvent event, XtextEditor editor, ModelDefinition model) {
		IProject project = ProjectUtil.getProject(event);
		String className = ModelUiUtil.getModelClassName(project, model.getName());
		IJavaProject javaProject = JavaCore.create(project);
		IType type = TypeUtil.findType(javaProject, className);
		if (type != null) {
			IWorkbenchSite site = editor.getEditorSite();
			FindReferencesAction action = new FindReferencesAction(site);
			action.run(type);
		}
	}

	private void findReferences(ExecutionEvent event, Property property) {
		IProject project = ProjectUtil.getProject(event);
		String modelName = PropertyUtil.getModelName(property);
		String propertyName = property.getName();

		FindDataModelInJavaSearchData data = new FindDataModelInJavaSearchData(project, modelName, propertyName);
		data.initializeWorkspaceScope();
		ISearchQuery query = new FindDataModelInJavaSearchQuery(data);

		NewSearchUI.activateSearchResultView();
		NewSearchUI.runQueryInBackground(query);
	}
}

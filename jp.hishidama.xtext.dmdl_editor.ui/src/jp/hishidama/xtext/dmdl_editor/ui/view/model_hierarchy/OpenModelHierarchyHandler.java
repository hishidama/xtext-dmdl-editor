package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.WorkbenchPart;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @see org.eclipse.xtext.ui.editor.hyperlinking.OpenDeclarationHandler
 */
public class OpenModelHierarchyHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor != null) {
			ITextSelection selection = (ITextSelection) xtextEditor.getSelectionProvider().getSelection();
			IRegion region = new Region(selection.getOffset(), selection.getLength());
			ISourceViewer sourceViewer = xtextEditor.getInternalSourceViewer();
			EObject object = getEObject(sourceViewer, region);
			ModelDefinition model = null;
			if (object instanceof ModelReference) {
				ModelReference ref = (ModelReference) object;
				model = ref.getName();
			} else {
				model = PropertyUtil.getModelDefinition(object);
			}
			if (model != null) {
				ModelHierarchyView view = openView(xtextEditor);
				if (view != null) {
					IProject project = ProjectUtil.getProject(event);
					view.setInput(project, model);
				}
			}
		}
		return null;
	}

	private EObject getEObject(ISourceViewer textViewer, final IRegion region) {
		return ((IXtextDocument) textViewer.getDocument()).readOnly(new IUnitOfWork<EObject, XtextResource>() {
			public EObject exec(XtextResource resource) throws Exception {
				IParseResult parseResult = resource.getParseResult();
				if (parseResult != null) {
					ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), region.getOffset());
					return leaf.getSemanticElement();
				}
				return null;
			}
		});
	}

	private ModelHierarchyView openView(WorkbenchPart editor) {
		String ID = ModelHierarchyView.ID;

		IViewPart view;
		{
			IWorkbenchPage page = editor.getSite().getWorkbenchWindow().getActivePage();
			try {
				view = page.showView(ID, null, IWorkbenchPage.VIEW_VISIBLE);
			} catch (PartInitException e) {
				view = page.findView(ID);
			}
		}
		if (view instanceof ModelHierarchyView) {
			return (ModelHierarchyView) view;
		}
		return null;
	}
}

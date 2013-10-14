package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.DataModelType;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class EditDataModelHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof XtextEditor) {
			execute((XtextEditor) editor);
		}

		return null;
	}

	private void execute(XtextEditor editor) {
		EditDataModelWizard wizard = init(editor);
		if (wizard == null) {
			return;
		}
		WizardDialog dialog = new WizardDialog(editor.getSite().getShell(), wizard);
		dialog.setHelpAvailable(false);
		dialog.open();
	}

	private EditDataModelWizard init(XtextEditor editor) {
		IFile file = ((FileEditorInput) editor.getEditorInput()).getFile();
		IXtextDocument doc = XtextDocumentUtil.get(editor);
		if (doc != null) {
			ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
			final int offset = ts.getOffset();
			ModelDefinition model = doc.readOnly(new IUnitOfWork<ModelDefinition, XtextResource>() {
				public ModelDefinition exec(XtextResource state) throws Exception {
					EList<EObject> list = state.getContents();
					for (EObject object : list) {
						Script script = (Script) object;
						for (ModelDefinition model : script.getList()) {
							ICompositeNode node = NodeModelUtils.findActualNodeFor(model);
							if (node.getTotalOffset() <= offset && offset <= node.getTotalEndOffset()) {
								return model;
							}
						}
					}
					return null;
				}
			});
			if (model != null) {
				EditDataModelWizard wizard = new EditDataModelWizard();
				DataModelType type = DataModelType.valueOf(model);
				String desc = DMDLStringUtil.decodeDescription(model.getDescription());
				wizard.init(file, model, type, desc);
				return wizard;
			}
		}
		return null;
	}
}

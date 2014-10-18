package jp.hishidama.xtext.dmdl_editor.ui.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class DMDLEditorCallback extends NatureAddingEditorCallback {

	@Inject
	private ToggleXtextNatureAction toggleNature;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		IResource resource = editor.getResource();
		if (resource != null) {
			IProject project = resource.getProject();
			if (!hasNature(project) && project.isAccessible() && !project.isHidden()) {
				addNature(project);
			}
		}

		super.afterCreatePartControl(editor);
	}

	public boolean hasNature(IProject project) {
		return toggleNature.hasNature(project);
	}

	public void addNature(IProject project) {
		toggleNature.toggleNature(project);
	}
}

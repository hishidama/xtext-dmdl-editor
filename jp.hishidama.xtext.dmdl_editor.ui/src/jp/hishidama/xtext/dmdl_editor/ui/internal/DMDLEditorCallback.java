package jp.hishidama.xtext.dmdl_editor.ui.internal;

import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class DMDLEditorCallback extends AbstractDirtyStateAwareEditorCallback {

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);

		IResource resource = editor.getResource();
		if (resource == null) {
			return;
		}
		IProject project = resource.getProject();
		if (!XtextProjectHelper.hasNature(project) && project.isAccessible() && !project.isHidden()) {
			addNature(project);
		}
	}

	private void addNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = Arrays.copyOf(natures, natures.length + 1);
			newNatures[natures.length] = XtextProjectHelper.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			LogUtil.log(e.getStatus());
		}
	}
}

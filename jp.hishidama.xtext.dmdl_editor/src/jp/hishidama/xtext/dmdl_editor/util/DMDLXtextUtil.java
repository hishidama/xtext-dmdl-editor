package jp.hishidama.xtext.dmdl_editor.util;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DMDLXtextUtil {

	public static IProject getProject(EObject object) {
		if (object == null) {
			return null;
		}

		URI uri = EcoreUtil.getURI(object);
		List<String> segments = uri.segmentsList();
		if (segments.size() >= 2) {
			if ("resource".equals(segments.get(0))) {
				String projectName = segments.get(1);

				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				return root.getProject(projectName);
			}
		}

		return null;
	}
}

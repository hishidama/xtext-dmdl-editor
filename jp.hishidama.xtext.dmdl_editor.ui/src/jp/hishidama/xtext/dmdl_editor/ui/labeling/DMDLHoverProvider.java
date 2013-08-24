package jp.hishidama.xtext.dmdl_editor.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class DMDLHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
		String label = getLabel(o);
		return (label != null) ? " <b>" + label + "</b>" : "";
	}

	@Override
	protected String getDocumentation(EObject o) {
		return super.getDocumentation(o);
	}
}

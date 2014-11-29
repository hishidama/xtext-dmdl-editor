package jp.hishidama.xtext.dmdl_editor.ui.util;

import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Injector;

public class DMDLXtextUiUtil {

	public static EObject getEObject(EObjectNode node) {
		URI uri = node.getEObjectURI();
		return getEObject(uri);
	}

	public static EObject getEObject(URI uri) {
		Injector injector = DMDLActivator.getInstance().getInjector(DMDLActivator.JP_HISHIDAMA_XTEXT_DMDL_EDITOR_DMDL);
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);

		return resourceSet.getEObject(uri, true);
	}
}

package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.search.DMDLEObjectSearch;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;

public class ModelUiUtil {

	public static ModelDefinition findModel(IProject project, String modelName) {
		if (project == null || modelName == null) {
			return null;
		}
		DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName());

		Iterable<IEObjectDescription> list = search.findMatches(modelName, ModelDefinition.class.getSimpleName());
		for (IEObjectDescription i : list) {
			ModelDefinition model = (ModelDefinition) i.getEObjectOrProxy();
			if (model.eIsProxy()) {
				ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);
				model = (ModelDefinition) EcoreUtil.resolve(model, resourceSet);
			}
			String mname = model.getName();
			if (modelName.equals(mname)) {
				return model;
			}
		}
		return null;
	}

	public static ModelDefinition findModelByClass(IProject project, String modelClassName) {
		if (project == null || modelClassName == null) {
			return null;
		}
		DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName());

		String pattern = DMDLEObjectSearch.getPattern(modelClassName);
		Iterable<IEObjectDescription> list = search.findMatches(pattern, ModelDefinition.class.getSimpleName());
		for (IEObjectDescription i : list) {
			ModelDefinition model = (ModelDefinition) i.getEObjectOrProxy();
			if (model.eIsProxy()) {
				ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);
				model = (ModelDefinition) EcoreUtil.resolve(model, resourceSet);
			}
			String mname = model.getName();
			mname = StringUtil.toCamelCase(mname);
			if (modelClassName.equals(mname)) {
				return model;
			}
		}
		return null;
	}

	public static boolean openEditor(IProject project, String modelName) {
		ModelDefinition model = findModel(project, modelName);
		if (model == null) {
			return false;
		}
		URI uri = EcoreUtil.getURI(model);

		GlobalURIEditorOpener opener = InjectorUtil.getInstance(GlobalURIEditorOpener.class);
		IEditorPart editor = opener.open(uri, true);
		return editor != null;
	}

	public static List<Property> getProperties(IProject project, String modelName) {
		ModelDefinition model = findModel(project, modelName);
		if (model != null) {
			return ModelUtil.getProperties(model);
		}
		return null;
	}
}

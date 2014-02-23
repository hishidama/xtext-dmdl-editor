package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.search.DMDLEObjectSearch;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;

public class ModelUiUtil {

	public static ModelDefinition findModel(IProject project, String modelName, IRunnableContext container) {
		if (project == null || modelName == null) {
			return null;
		}
		SearchModelTask task = new SearchModelTask(project, modelName);
		try {
			container.run(true, true, task);
			return task.getModel();
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			return null;
		}
	}

	private static class SearchModelTask implements IRunnableWithProgress {
		private IProject project;
		private String modelName;
		private ModelDefinition model;

		public SearchModelTask(IProject project, String modelName) {
			this.project = project;
			this.modelName = modelName;
		}

		public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			monitor.beginTask("search DataModel", IProgressMonitor.UNKNOWN);
			try {
				DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName(), monitor);
				model = findModel(search, modelName);
			} catch (RuntimeException e) {
				Throwable cause = e.getCause();
				if (cause instanceof InterruptedException) {
					throw (InterruptedException) cause;
				}
				throw e;
			} finally {
				monitor.done();
			}
		}

		public ModelDefinition getModel() {
			return model;
		}
	}

	public static ModelDefinition findModel(IProject project, String modelName) {
		if (project == null || modelName == null) {
			return null;
		}
		DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName());
		return findModel(search, modelName);
	}

	private static ModelDefinition findModel(DMDLEObjectSearch search, String modelName) {
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
		modelClassName = StringUtil.getSimpleName(modelClassName);
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

	public static List<ModelDefinition> getAllModels(IProject project, IRunnableContext container) {
		if (project == null) {
			return null;
		}
		CollectModelTask task = new CollectModelTask(project);
		try {
			container.run(true, true, task);
			return task.getModels();
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			return null;
		}
	}

	private static class CollectModelTask implements IRunnableWithProgress {
		private IProject project;
		private List<ModelDefinition> list = new ArrayList<ModelDefinition>();

		public CollectModelTask(IProject project) {
			this.project = project;
		}

		public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			monitor.beginTask("listing DataModel", IProgressMonitor.UNKNOWN);
			try {
				DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName(), monitor);
				collectModel(list, search);
			} catch (RuntimeException e) {
				Throwable cause = e.getCause();
				if (cause instanceof InterruptedException) {
					throw (InterruptedException) cause;
				}
				throw e;
			} finally {
				monitor.done();
			}
		}

		public List<ModelDefinition> getModels() {
			return list;
		}
	}

	private static void collectModel(List<ModelDefinition> result, DMDLEObjectSearch search) {
		Iterable<IEObjectDescription> list = search.findMatches("*", ModelDefinition.class.getSimpleName());
		for (IEObjectDescription i : list) {
			ModelDefinition model = (ModelDefinition) i.getEObjectOrProxy();
			if (model.eIsProxy()) {
				ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);
				model = (ModelDefinition) EcoreUtil.resolve(model, resourceSet);
			}
			result.add(model);
		}
	}

	public static boolean openEditor(IProject project, String modelName) {
		ModelDefinition model = findModel(project, modelName);
		return openEditor(model);
	}

	public static boolean openEditor(EObject object) {
		if (object == null) {
			return false;
		}
		URI uri = EcoreUtil.getURI(object);

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

	public static List<Property> getProperties(IProject project, String modelName, IRunnableContext container) {
		ModelDefinition model = findModel(project, modelName, container);
		if (model != null) {
			return ModelUtil.getProperties(model);
		}
		return null;
	}
}

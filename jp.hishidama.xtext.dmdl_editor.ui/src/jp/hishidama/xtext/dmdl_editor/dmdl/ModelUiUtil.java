package jp.hishidama.xtext.dmdl_editor.dmdl;

import static jp.hishidama.eclipse_plugin.util.StringUtil.toCamelCase;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.config.AsakusafwProperties;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.DeclaredDmdlHyperlink;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.OpenDeclaredDmdlHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.OpenKeyDmdlHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.search.DMDLEObjectSearch;
import jp.hishidama.xtext.dmdl_editor.ui.util.DMDLXtextUiUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class ModelUiUtil {

	public static String getModelClassName(IProject project, String modelName) {
		String pack = getModelPackageName(project, modelName);
		if (pack == null) {
			return null;
		}

		String sname = toCamelCase(modelName);
		return pack + ".model." + sname;
	}

	public static String getModelPackageName(IProject project, String modelName) {
		if (project == null || modelName == null) {
			return null;
		}
		AsakusafwProperties bp = BuildPropertiesUtil.getBuildProperties(project, false);
		if (bp == null) {
			return null;
		}
		String pack = bp.getModelgenPackage();
		if (pack == null) {
			return null;
		}
		ModelDefinition model = findModel(project, modelName);
		String name = getNamespace(model);
		if (name == null) {
			name = "dmdl";
		} else if (name.contains("_")) {
			StringBuilder sb = new StringBuilder(name.length());
			String[] ss = name.split("_");
			boolean first = true;
			for (String s : ss) {
				if (first) {
					sb.append(s);
					first = false;
				} else {
					if (s.length() > 0) {
						sb.append(Character.toUpperCase(s.charAt(0)));
						sb.append(s.substring(1));
					}
				}
			}
			name = sb.toString();
		}
		return pack + "." + name;
	}

	private static String getNamespace(ModelDefinition model) {
		if (model == null) {
			return null;
		}
		AttributeList attributeList = model.getAttributes();
		if (attributeList == null) {
			return null;
		}
		for (Attribute attribute : attributeList.getAttributes()) {
			if ("namespace".equals(attribute.getName())) {
				AttributeElementBlock block = attribute.getElementBlock();
				if (block == null) {
					return null;
				}
				AttributeElementList elementList = block.getElements();
				if (elementList == null) {
					return null;
				}
				for (AttributeElement element : elementList.getElements()) {
					if ("value".equals(element.getName())) {
						EObject object = element.getValue().getValue();
						if (object instanceof QualifiedNameObject) {
							QualifiedNameObject value = (QualifiedNameObject) object;
							return value.getName();
						}
						return null;
					}
				}
				return null;
			}
		}
		return null;
	}

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

	public static ModelProperty findModel(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object element = ss.getFirstElement();
			if (element instanceof ModelProperty) {
				return (ModelProperty) element;
			}
			if (element instanceof EObjectNode) {
				ModelDefinition model = null;
				Property property = null;
				for (EObjectNode node = (EObjectNode) element; node != null; node = (EObjectNode) node.getParent()) {
					EObject object = DMDLXtextUiUtil.getEObject(node);
					if (object instanceof Property) {
						property = (Property) object;
					} else if (object instanceof ModelDefinition) {
						model = (ModelDefinition) object;
						break;
					}
				}
				if (model != null) {
					return new ModelProperty(model, property);
				}
			}
		}

		return null;
	}

	private static ModelProperty findModel(IXtextDocument document, final int offset) {
		EObject object = document.readOnly(new IUnitOfWork<EObject, XtextResource>() {
			private EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();

			public EObject exec(XtextResource state) throws Exception {
				return helper.resolveContainedElementAt(state, offset);
			}
		});
		Property property = PropertyUtil.getProperty(object);
		if (property != null) {
			ModelDefinition model = ModelUtil.getModel(property);
			return new ModelProperty(model, property);
		}
		ModelDefinition model = ModelUtil.getModel(object);
		if (model != null) {
			return new ModelProperty(model, null);
		}
		return null;
	}

	public static ModelProperty findInEditorSelection(IEditorPart editorPart) {
		if (!(editorPart instanceof ITextEditor)) {
			return null;
		}
		ITextEditor editor = (ITextEditor) editorPart;

		ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
		final int offset = selection.getOffset();

		if (editor instanceof XtextEditor) {
			XtextEditor xeditor = (XtextEditor) editor;
			IXtextDocument document = xeditor.getDocument();
			return findModel(document, offset);
		}

		IHyperlink[] links;
		{
			links = new OpenDeclaredDmdlHyperlinkDetector().detectHyperlinks(editor, offset);
			if (links == null || links.length == 0) {
				links = new OpenKeyDmdlHyperlinkDetector().detectHyperlinks(editor, offset);
			}
		}
		if (links != null) {
			for (IHyperlink link : links) {
				DeclaredDmdlHyperlink dmdl = (DeclaredDmdlHyperlink) link;
				ModelDefinition model = dmdl.getModel();
				Property property = dmdl.getProperty();
				return new ModelProperty(model, property);
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

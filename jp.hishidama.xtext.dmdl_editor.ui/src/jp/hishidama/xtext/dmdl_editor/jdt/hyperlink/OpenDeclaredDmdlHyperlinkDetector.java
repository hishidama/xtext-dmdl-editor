package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.jdt.hyperlink.JdtHyperlinkDetector;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.search.DMDLEObjectSearch;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.resource.IEObjectDescription;

// @see org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkDetector
public class OpenDeclaredDmdlHyperlinkDetector extends JdtHyperlinkDetector {

	@Override
	protected IHyperlink[] detectTypeHyperlinks(IType type, IRegion word) {
		ModelDefinition model = findModel(type);
		if (model == null) {
			return null;
		}
		return new IHyperlink[] { new DeclaredDmdlHyperlink(model, word) };
	}

	@Override
	protected IHyperlink[] detectFieldHyperlinks(IField field, IRegion word) {
		String fieldName = field.getElementName();
		return detectPropertyHyperlinks(field, fieldName, word);
	}

	@Override
	protected IHyperlink[] detectMethodHyperlinks(IMethod method, IRegion word) {
		String snakeName = cutMethodName(method.getElementName());
		return detectPropertyHyperlinks(method, snakeName, word);
	}

	private static String cutMethodName(String name) {
		if (name.startsWith("set")) {
			name = name.substring(3);
		} else if (name.startsWith("get")) {
			name = name.substring(3);
		}
		if (name.endsWith("Option")) {
			name = name.substring(0, name.length() - 6);
		} else if (name.endsWith("AsString")) {
			name = name.substring(0, name.length() - 8);
		}
		return StringUtil.toFirstLower(name);
	}

	private IHyperlink[] detectPropertyHyperlinks(IJavaElement code, String name, IRegion word) {
		IType type = (IType) code.getParent();
		ModelDefinition model = findModel(type);
		if (model == null) {
			return null;
		}
		Property prop = ModelUtil.findProperty(model, name);
		if (prop == null) {
			return null;
		}
		return new IHyperlink[] { new DeclaredDmdlHyperlink(prop, word) };
	}

	private static ModelDefinition findModel(IType type) {
		IProject project = type.getJavaProject().getProject();
		DMDLEObjectSearch search = new DMDLEObjectSearch(project.getName());

		String name = type.getElementName();
		String pattern = DMDLEObjectSearch.getPattern(name);
		Iterable<IEObjectDescription> list = search.findMatches(pattern, ModelDefinition.class.getSimpleName());
		for (IEObjectDescription i : list) {
			ModelDefinition model = (ModelDefinition) i.getEObjectOrProxy();
			if (model.eIsProxy()) {
				ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);
				model = (ModelDefinition) EcoreUtil.resolve(model, resourceSet);
			}
			String mname = model.getName();
			mname = StringUtil.toCamelCase(mname);
			if (name.equals(mname)) {
				return model;
			}
		}
		return null;
	}
}

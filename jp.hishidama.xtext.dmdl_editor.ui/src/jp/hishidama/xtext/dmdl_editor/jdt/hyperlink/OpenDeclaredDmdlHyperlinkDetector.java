package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.AfwStringUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.jdt.hyperlink.JdtHyperlinkDetector;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;

// @see org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkDetector
public class OpenDeclaredDmdlHyperlinkDetector extends JdtHyperlinkDetector {

	@Override
	protected IHyperlink[] detectTypeHyperlinks(IType type, IRegion word) {
		ModelDefinition model = findModel(type);
		if (model == null) {
			return null;
		}
		return new IHyperlink[] { new DeclaredDmdlHyperlink(model, null, word) };
	}

	@Override
	protected IHyperlink[] detectFieldHyperlinks(IField field, IRegion word) {
		String fieldName = field.getElementName();
		IHyperlink[] links = detectPropertyHyperlinks(field, fieldName, word);
		if (links != null) {
			return links;
		}

		IProject project = field.getJavaProject().getProject();
		String typeName = TypeUtil.getFieldTypeName(field);
		return detectHyperlinks(project, typeName, word);
	}

	@Override
	protected IHyperlink[] detectMethodHyperlinks(IMethod method, IRegion word) {
		String name = PropertyUtil.cutMethodName(method.getElementName());
		return detectPropertyHyperlinks(method, name, word);
	}

	private IHyperlink[] detectPropertyHyperlinks(IJavaElement code, String name, IRegion word) {
		IType type = (IType) code.getParent();
		ModelDefinition model = findModel(type);
		if (model == null) {
			return null;
		}
		Property property = ModelUtil.findProperty(model, name);
		if (property == null) {
			return null;
		}
		return new IHyperlink[] { new DeclaredDmdlHyperlink(model, property, word) };
	}

	@Override
	protected IHyperlink[] detectVariableHyperlinks(ILocalVariable variable, IRegion word) {
		IProject project = variable.getJavaProject().getProject();
		String typeName = TypeUtil.getVariableTypeName(variable);
		return detectHyperlinks(project, typeName, word);
	}

	private IHyperlink[] detectHyperlinks(IProject project, String typeName, IRegion word) {
		String name = AfwStringUtil.extractModelClassName(typeName);
		ModelDefinition model = ModelUiUtil.findModelByClass(project, name);
		if (model != null) {
			return new IHyperlink[] { new DeclaredDmdlHyperlink(model, null, word) };
		}
		return null;
	}

	private static ModelDefinition findModel(IType type) {
		IProject project = type.getJavaProject().getProject();
		String name = type.getElementName();
		ModelDefinition model = ModelUiUtil.findModelByClass(project, name);
		if (model != null) {
			return model;
		}
		try {
			if (type.isClass()) {
				if (PorterUtil.getPorterOrFormatInterfaceName(type) != null) {
					String modelClassName = PorterUtil.getModelClassName(type.getJavaProject(),
							type.getFullyQualifiedName());
					model = ModelUiUtil.findModelByClass(project, modelClassName);
					if (model != null) {
						return model;
					}
				}
			}
		} catch (JavaModelException e) {
			// do nothing
		}
		return null;
	}
}

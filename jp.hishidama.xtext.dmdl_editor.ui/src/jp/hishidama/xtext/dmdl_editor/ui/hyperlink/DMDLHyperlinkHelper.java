package jp.hishidama.xtext.dmdl_editor.ui.hyperlink;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DMDLHyperlinkHelper extends TypeAwareHyperlinkHelper {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private Provider<JdtHyperlink> jdtHyperlinkProvider;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);

		INode node = getModelNameNode(resource, offset);
		if (node == null) {
			return;
		}
		String modelName = node.getText().trim();

		IJavaProject javaProject = getJavaProject(resource);
		if (javaProject == null) {
			return;
		}
		String className = ModelUiUtil.getModelClassName(javaProject.getProject(), modelName);
		if (className == null) {
			return;
		}
		try {
			IType type = javaProject.findType(className);
			if (type != null) {
				JdtHyperlink hyperlink = jdtHyperlinkProvider.get();
				hyperlink.setJavaElement(type);
				hyperlink.setTypeLabel("Open DataModel class");
				hyperlink.setHyperlinkText("Open DataModel class");
				hyperlink.setHyperlinkRegion(new Region(node.getOffset(), node.getLength()));
				acceptor.accept(hyperlink);
			}
		} catch (JavaModelException e) {
			return;
		}
	}

	private INode getModelNameNode(XtextResource resource, int offset) {
		EObject object = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if (object instanceof ModelDefinition) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, DmdlPackage.Literals.MODEL_DEFINITION__NAME);
			if (!list.isEmpty()) {
				INode node = list.get(0);
				if (node.getOffset() <= offset && offset < node.getOffset() + node.getLength()) {
					return node;
				}
			}
		}
		return null;
	}

	private IJavaProject getJavaProject(XtextResource resource) {
		XtextResourceSet set = (XtextResourceSet) resource.getResourceSet();
		Object context = set.getClasspathURIContext();
		if (context instanceof IJavaProject) {
			return (IJavaProject) context;
		}
		return null;
	}
}

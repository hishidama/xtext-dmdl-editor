package jp.hishidama.xtext.dmdl_editor.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.util.DmdlSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class DMDLSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null) {
			return;
		}

		Switch switcher = new Switch(acceptor);
		for (Iterator<EObject> i = EcoreUtil.getAllContents(resource, true); i.hasNext();) {
			EObject current = i.next();
			switcher.doSwitch(current);
		}
	}

	private static class Switch extends DmdlSwitch<Void> {
		private final IHighlightedPositionAcceptor acceptor;

		public Switch(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Void caseModelDefinition(ModelDefinition object) {
			return addPosition(object, DmdlPackage.Literals.MODEL_DEFINITION__TYPE,
					DMDLHighlightingConfiguration.KEYWORD_ID);
		}

		@Override
		public Void casePropertyFolding(PropertyFolding object) {
			return addPosition(object, DmdlPackage.Literals.PROPERTY_FOLDING__AGGREGATOR,
					DMDLHighlightingConfiguration.KEYWORD_ID);
		}

		private Void addPosition(EObject object, EStructuralFeature feature, String id) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, feature);
			for (INode node : list) {
				acceptor.addPosition(node.getOffset(), node.getLength(), id);
			}

			return null;
		}
	}
}

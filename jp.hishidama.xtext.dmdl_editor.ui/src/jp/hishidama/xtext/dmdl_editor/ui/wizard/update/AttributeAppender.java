package jp.hishidama.xtext.dmdl_editor.ui.wizard.update;

import java.io.StringReader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parser.IParseResult;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

public abstract class AttributeAppender extends AttributeUpdater {

	private String modelAttr;
	private String propAttr;

	@Override
	public void setAttribute(String modelAttr, String propAttr) {
		if (!modelAttr.isEmpty()) {
			if (!modelAttr.endsWith("\n")) {
				modelAttr += "\n";
			}
		}
		if (!propAttr.isEmpty()) {
			if (!propAttr.contains("\n") && !propAttr.endsWith("\n")) {
				propAttr = String.format("    %s\n", propAttr);
			} else {
				if (!propAttr.endsWith(" ") && !propAttr.endsWith(")")) {
					propAttr += " ";
				}
			}
			if (propAttr.endsWith("\n")) {
				propAttr += "\t";
			}
		}
		this.modelAttr = modelAttr;
		this.propAttr = propAttr;
	}

	protected abstract class AppendExecutor extends Executor<String> {
		private DMDLParser parser = InjectorUtil.getInstance(DMDLParser.class);

		@Override
		protected String getModelAttribute() {
			return modelAttr;
		}

		@Override
		protected String getPropertyAttribute() {
			return propAttr;
		}

		protected final AttributeList createAttributeList(EObject parent) {
			AttributeList attributeList = (AttributeList) EcoreUtil.create(DmdlPackage.Literals.ATTRIBUTE_LIST);
			if (parent instanceof ModelDefinition) {
				((ModelDefinition) parent).setAttributes(attributeList);
			} else if (parent instanceof Property) {
				((Property) parent).setAttributes(attributeList);
			}
			return attributeList;
		}

		protected final EList<Attribute> parseAttribute(EObject object, String attr) {
			String modelName = null, propName = null, propDesc = null;
			ModelDefinition model = EcoreUtil2.getContainerOfType(object, ModelDefinition.class);
			if (model != null) {
				modelName = model.getName();
			}
			Property property = EcoreUtil2.getContainerOfType(object, Property.class);
			if (property != null) {
				propName = property.getName();
				propDesc = property.getDescription();
			}
			String resolved = DMDLStringUtil.replace(attr, modelName, propName, propDesc);

			DMDLGrammarAccess grammar = parser.getGrammarAccess();
			IParseResult result = parser.parse(grammar.getAttributeListRule(), new StringReader(resolved));
			AttributeList newList = (AttributeList) result.getRootASTElement();
			if (newList != null) {
				EList<Attribute> r = newList.getAttributes();
				if (r != null && !r.isEmpty()) {
					return r;
				}
			}
			return null;
		}
	}
}

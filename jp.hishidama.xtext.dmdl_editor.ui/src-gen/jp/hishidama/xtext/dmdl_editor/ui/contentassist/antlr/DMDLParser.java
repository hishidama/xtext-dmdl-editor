/*
* generated by Xtext
*/
package jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;

public class DMDLParser extends AbstractContentAssistParser {
	
	@Inject
	private DMDLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal.InternalDMDLParser createParser() {
		jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal.InternalDMDLParser result = new jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal.InternalDMDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRecordTermAccess().getAlternatives(), "rule__RecordTerm__Alternatives");
					put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getRecordModelDefinitionAccess().getGroup(), "rule__RecordModelDefinition__Group__0");
					put(grammarAccess.getRecordExpressionAccess().getGroup(), "rule__RecordExpression__Group__0");
					put(grammarAccess.getRecordExpressionAccess().getGroup_1(), "rule__RecordExpression__Group_1__0");
					put(grammarAccess.getRecordTermAccess().getGroup_0(), "rule__RecordTerm__Group_0__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
					put(grammarAccess.getSummarizeModelDefinitionAccess().getGroup(), "rule__SummarizeModelDefinition__Group__0");
					put(grammarAccess.getSummarizeExpressionAccess().getGroup(), "rule__SummarizeExpression__Group__0");
					put(grammarAccess.getSummarizeExpressionAccess().getGroup_1(), "rule__SummarizeExpression__Group_1__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_2(), "rule__Attribute__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup_2_1(), "rule__Attribute__Group_2_1__0");
					put(grammarAccess.getAttributeElementListAccess().getGroup(), "rule__AttributeElementList__Group__0");
					put(grammarAccess.getAttributeElementListAccess().getGroup_1(), "rule__AttributeElementList__Group_1__0");
					put(grammarAccess.getAttributeElementAccess().getGroup(), "rule__AttributeElement__Group__0");
					put(grammarAccess.getAttributeValueArrayAccess().getGroup(), "rule__AttributeValueArray__Group__0");
					put(grammarAccess.getAttributeValueArrayAccess().getGroup_2(), "rule__AttributeValueArray__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getModelsAccess().getListAssignment(), "rule__Models__ListAssignment");
					put(grammarAccess.getRecordModelDefinitionAccess().getDescriptionAssignment_0(), "rule__RecordModelDefinition__DescriptionAssignment_0");
					put(grammarAccess.getRecordModelDefinitionAccess().getAttributesAssignment_1(), "rule__RecordModelDefinition__AttributesAssignment_1");
					put(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_2(), "rule__RecordModelDefinition__NameAssignment_2");
					put(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_4(), "rule__RecordModelDefinition__RhsAssignment_4");
					put(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0(), "rule__RecordExpression__TermsAssignment_0");
					put(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1(), "rule__RecordExpression__TermsAssignment_1_1");
					put(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1(), "rule__RecordTerm__PropertiesAssignment_0_1");
					put(grammarAccess.getRecordTermAccess().getReferenceAssignment_1(), "rule__RecordTerm__ReferenceAssignment_1");
					put(grammarAccess.getModelReferenceAccess().getNameAssignment(), "rule__ModelReference__NameAssignment");
					put(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0(), "rule__PropertyDefinition__DescriptionAssignment_0");
					put(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1(), "rule__PropertyDefinition__AttributesAssignment_1");
					put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2(), "rule__PropertyDefinition__NameAssignment_2");
					put(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4(), "rule__PropertyDefinition__TypeAssignment_4");
					put(grammarAccess.getSummarizeModelDefinitionAccess().getDescriptionAssignment_0(), "rule__SummarizeModelDefinition__DescriptionAssignment_0");
					put(grammarAccess.getSummarizeModelDefinitionAccess().getAttributesAssignment_1(), "rule__SummarizeModelDefinition__AttributesAssignment_1");
					put(grammarAccess.getSummarizeModelDefinitionAccess().getNameAssignment_3(), "rule__SummarizeModelDefinition__NameAssignment_3");
					put(grammarAccess.getSummarizeModelDefinitionAccess().getRhsAssignment_5(), "rule__SummarizeModelDefinition__RhsAssignment_5");
					put(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0(), "rule__SummarizeExpression__TermsAssignment_0");
					put(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1(), "rule__SummarizeExpression__TermsAssignment_1_1");
					put(grammarAccess.getSummarizeTermAccess().getReferenceAssignment(), "rule__SummarizeTerm__ReferenceAssignment");
					put(grammarAccess.getAttributeListAccess().getAttributesAssignment(), "rule__AttributeList__AttributesAssignment");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getElementsAssignment_2_1_0(), "rule__Attribute__ElementsAssignment_2_1_0");
					put(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0(), "rule__AttributeElementList__ElementsAssignment_0");
					put(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1(), "rule__AttributeElementList__ElementsAssignment_1_1");
					put(grammarAccess.getAttributeElementAccess().getNameAssignment_0(), "rule__AttributeElement__NameAssignment_0");
					put(grammarAccess.getAttributeElementAccess().getValueAssignment_2(), "rule__AttributeElement__ValueAssignment_2");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_0(), "rule__AttributeValue__ValueAssignment_0");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_1(), "rule__AttributeValue__ValueAssignment_1");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_2(), "rule__AttributeValue__ValueAssignment_2");
					put(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1(), "rule__AttributeValueArray__ElementsAssignment_1");
					put(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1(), "rule__AttributeValueArray__ElementsAssignment_2_1");
					put(grammarAccess.getQualifiedNameAccess().getNameAssignment_0(), "rule__QualifiedName__NameAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getNameAssignment_1_1(), "rule__QualifiedName__NameAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getStringValueAssignment_0(), "rule__Literal__StringValueAssignment_0");
					put(grammarAccess.getLiteralAccess().getIntValueAssignment_1(), "rule__Literal__IntValueAssignment_1");
					put(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2(), "rule__Literal__DecimalValueAssignment_2");
					put(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3(), "rule__Literal__BooleanValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal.InternalDMDLParser typedParser = (jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal.InternalDMDLParser) parser;
			typedParser.entryRuleModels();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DMDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DMDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

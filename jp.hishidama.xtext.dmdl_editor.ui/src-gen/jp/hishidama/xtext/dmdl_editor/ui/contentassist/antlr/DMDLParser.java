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
					put(grammarAccess.getModelDefinitionAccess().getAlternatives_2(), "rule__ModelDefinition__Alternatives_2");
					put(grammarAccess.getRecordTermAccess().getAlternatives(), "rule__RecordTerm__Alternatives");
					put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
					put(grammarAccess.getPropertyFoldingAccess().getAlternatives_4(), "rule__PropertyFolding__Alternatives_4");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getModelDefinitionAccess().getGroup(), "rule__ModelDefinition__Group__0");
					put(grammarAccess.getModelDefinitionAccess().getGroup_2_0(), "rule__ModelDefinition__Group_2_0__0");
					put(grammarAccess.getModelDefinitionAccess().getGroup_2_1(), "rule__ModelDefinition__Group_2_1__0");
					put(grammarAccess.getModelDefinitionAccess().getGroup_2_2(), "rule__ModelDefinition__Group_2_2__0");
					put(grammarAccess.getRecordExpressionAccess().getGroup(), "rule__RecordExpression__Group__0");
					put(grammarAccess.getRecordExpressionAccess().getGroup_1(), "rule__RecordExpression__Group_1__0");
					put(grammarAccess.getRecordTermAccess().getGroup_0(), "rule__RecordTerm__Group_0__0");
					put(grammarAccess.getPropertyDefinitionAccess().getGroup(), "rule__PropertyDefinition__Group__0");
					put(grammarAccess.getJoinExpressionAccess().getGroup(), "rule__JoinExpression__Group__0");
					put(grammarAccess.getJoinExpressionAccess().getGroup_1(), "rule__JoinExpression__Group_1__0");
					put(grammarAccess.getJoinTermAccess().getGroup(), "rule__JoinTerm__Group__0");
					put(grammarAccess.getSummarizeExpressionAccess().getGroup(), "rule__SummarizeExpression__Group__0");
					put(grammarAccess.getSummarizeExpressionAccess().getGroup_1(), "rule__SummarizeExpression__Group_1__0");
					put(grammarAccess.getSummarizeTermAccess().getGroup(), "rule__SummarizeTerm__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeElementBlockAccess().getGroup(), "rule__AttributeElementBlock__Group__0");
					put(grammarAccess.getAttributeElementBlockAccess().getGroup_2(), "rule__AttributeElementBlock__Group_2__0");
					put(grammarAccess.getAttributeElementListAccess().getGroup(), "rule__AttributeElementList__Group__0");
					put(grammarAccess.getAttributeElementListAccess().getGroup_1(), "rule__AttributeElementList__Group_1__0");
					put(grammarAccess.getAttributeElementAccess().getGroup(), "rule__AttributeElement__Group__0");
					put(grammarAccess.getAttributeValueArrayAccess().getGroup(), "rule__AttributeValueArray__Group__0");
					put(grammarAccess.getAttributeValueArrayAccess().getGroup_2(), "rule__AttributeValueArray__Group_2__0");
					put(grammarAccess.getGroupingAccess().getGroup(), "rule__Grouping__Group__0");
					put(grammarAccess.getGroupingAccess().getGroup_2(), "rule__Grouping__Group_2__0");
					put(grammarAccess.getModelMappingAccess().getGroup(), "rule__ModelMapping__Group__0");
					put(grammarAccess.getPropertyMappingAccess().getGroup(), "rule__PropertyMapping__Group__0");
					put(grammarAccess.getModelFoldingAccess().getGroup(), "rule__ModelFolding__Group__0");
					put(grammarAccess.getPropertyFoldingAccess().getGroup(), "rule__PropertyFolding__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getScriptAccess().getListAssignment(), "rule__Script__ListAssignment");
					put(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0(), "rule__ModelDefinition__DescriptionAssignment_0");
					put(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1(), "rule__ModelDefinition__AttributesAssignment_1");
					put(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_0_0(), "rule__ModelDefinition__TypeAssignment_2_0_0");
					put(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_0_1(), "rule__ModelDefinition__NameAssignment_2_0_1");
					put(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_0_3(), "rule__ModelDefinition__RhsAssignment_2_0_3");
					put(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_1_0(), "rule__ModelDefinition__TypeAssignment_2_1_0");
					put(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_1_1(), "rule__ModelDefinition__NameAssignment_2_1_1");
					put(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_1_3(), "rule__ModelDefinition__RhsAssignment_2_1_3");
					put(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_2_0(), "rule__ModelDefinition__TypeAssignment_2_2_0");
					put(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_2_1(), "rule__ModelDefinition__NameAssignment_2_2_1");
					put(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_2_3(), "rule__ModelDefinition__RhsAssignment_2_2_3");
					put(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0(), "rule__RecordExpression__TermsAssignment_0");
					put(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1(), "rule__RecordExpression__TermsAssignment_1_1");
					put(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_2(), "rule__RecordTerm__PropertiesAssignment_0_2");
					put(grammarAccess.getRecordTermAccess().getReferenceAssignment_1(), "rule__RecordTerm__ReferenceAssignment_1");
					put(grammarAccess.getModelReferenceAccess().getNameAssignment(), "rule__ModelReference__NameAssignment");
					put(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0(), "rule__PropertyDefinition__DescriptionAssignment_0");
					put(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1(), "rule__PropertyDefinition__AttributesAssignment_1");
					put(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2(), "rule__PropertyDefinition__NameAssignment_2");
					put(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4(), "rule__PropertyDefinition__TypeAssignment_4");
					put(grammarAccess.getJoinExpressionAccess().getTermsAssignment_0(), "rule__JoinExpression__TermsAssignment_0");
					put(grammarAccess.getJoinExpressionAccess().getTermsAssignment_1_1(), "rule__JoinExpression__TermsAssignment_1_1");
					put(grammarAccess.getJoinTermAccess().getReferenceAssignment_0(), "rule__JoinTerm__ReferenceAssignment_0");
					put(grammarAccess.getJoinTermAccess().getMappingAssignment_1(), "rule__JoinTerm__MappingAssignment_1");
					put(grammarAccess.getJoinTermAccess().getGroupingAssignment_2(), "rule__JoinTerm__GroupingAssignment_2");
					put(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0(), "rule__SummarizeExpression__TermsAssignment_0");
					put(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1(), "rule__SummarizeExpression__TermsAssignment_1_1");
					put(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0(), "rule__SummarizeTerm__ReferenceAssignment_0");
					put(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1(), "rule__SummarizeTerm__FoldingAssignment_1");
					put(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2(), "rule__SummarizeTerm__GroupingAssignment_2");
					put(grammarAccess.getAttributeListAccess().getAttributesAssignment(), "rule__AttributeList__AttributesAssignment");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getElementBlockAssignment_2(), "rule__Attribute__ElementBlockAssignment_2");
					put(grammarAccess.getAttributeElementBlockAccess().getElementsAssignment_2_0(), "rule__AttributeElementBlock__ElementsAssignment_2_0");
					put(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0(), "rule__AttributeElementList__ElementsAssignment_0");
					put(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1(), "rule__AttributeElementList__ElementsAssignment_1_1");
					put(grammarAccess.getAttributeElementAccess().getNameAssignment_0(), "rule__AttributeElement__NameAssignment_0");
					put(grammarAccess.getAttributeElementAccess().getValueAssignment_2(), "rule__AttributeElement__ValueAssignment_2");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_0(), "rule__AttributeValue__ValueAssignment_0");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_1(), "rule__AttributeValue__ValueAssignment_1");
					put(grammarAccess.getAttributeValueAccess().getValueAssignment_2(), "rule__AttributeValue__ValueAssignment_2");
					put(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1(), "rule__AttributeValueArray__ElementsAssignment_1");
					put(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1(), "rule__AttributeValueArray__ElementsAssignment_2_1");
					put(grammarAccess.getGroupingAccess().getNameAssignment_1(), "rule__Grouping__NameAssignment_1");
					put(grammarAccess.getGroupingAccess().getNameAssignment_2_1(), "rule__Grouping__NameAssignment_2_1");
					put(grammarAccess.getModelMappingAccess().getMappingsAssignment_3(), "rule__ModelMapping__MappingsAssignment_3");
					put(grammarAccess.getPropertyMappingAccess().getDescriptionAssignment_0(), "rule__PropertyMapping__DescriptionAssignment_0");
					put(grammarAccess.getPropertyMappingAccess().getAttributesAssignment_1(), "rule__PropertyMapping__AttributesAssignment_1");
					put(grammarAccess.getPropertyMappingAccess().getFromAssignment_2(), "rule__PropertyMapping__FromAssignment_2");
					put(grammarAccess.getPropertyMappingAccess().getNameAssignment_4(), "rule__PropertyMapping__NameAssignment_4");
					put(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_3(), "rule__ModelFolding__FoldingsAssignment_3");
					put(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0(), "rule__PropertyFolding__DescriptionAssignment_0");
					put(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1(), "rule__PropertyFolding__AttributesAssignment_1");
					put(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2(), "rule__PropertyFolding__AggregatorAssignment_2");
					put(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3(), "rule__PropertyFolding__FromAssignment_3");
					put(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5(), "rule__PropertyFolding__NameAssignment_5");
					put(grammarAccess.getQualifiedNameObjectAccess().getNameAssignment(), "rule__QualifiedNameObject__NameAssignment");
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
			typedParser.entryRuleScript();
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

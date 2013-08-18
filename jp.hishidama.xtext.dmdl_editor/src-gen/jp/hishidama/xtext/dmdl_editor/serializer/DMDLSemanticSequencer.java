package jp.hishidama.xtext.dmdl_editor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinedModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Literal;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DMDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DMDLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DmdlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DmdlPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.ATTRIBUTE_ELEMENT:
				if(context == grammarAccess.getAttributeElementRule()) {
					sequence_AttributeElement(context, (AttributeElement) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.ATTRIBUTE_ELEMENT_LIST:
				if(context == grammarAccess.getAttributeElementListRule()) {
					sequence_AttributeElementList(context, (AttributeElementList) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.ATTRIBUTE_LIST:
				if(context == grammarAccess.getAttributeListRule()) {
					sequence_AttributeList(context, (AttributeList) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.ATTRIBUTE_VALUE:
				if(context == grammarAccess.getAttributeValueRule()) {
					sequence_AttributeValue(context, (AttributeValue) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.ATTRIBUTE_VALUE_ARRAY:
				if(context == grammarAccess.getAttributeValueArrayRule()) {
					sequence_AttributeValueArray(context, (AttributeValueArray) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.GROUPING:
				if(context == grammarAccess.getGroupingRule()) {
					sequence_Grouping(context, (Grouping) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.JOIN_EXPRESSION:
				if(context == grammarAccess.getJoinExpressionRule()) {
					sequence_JoinExpression(context, (JoinExpression) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.JOIN_TERM:
				if(context == grammarAccess.getJoinTermRule()) {
					sequence_JoinTerm(context, (JoinTerm) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.JOINED_MODEL_DEFINITION:
				if(context == grammarAccess.getJoinedModelDefinitionRule()) {
					sequence_JoinedModelDefinition(context, (JoinedModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODEL_DEFINITION:
				if(context == grammarAccess.getModelDefinitionRule()) {
					sequence_ModelDefinition(context, (ModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODEL_FOLDING:
				if(context == grammarAccess.getModelFoldingRule()) {
					sequence_ModelFolding(context, (ModelFolding) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODEL_MAPPING:
				if(context == grammarAccess.getModelMappingRule()) {
					sequence_ModelMapping(context, (ModelMapping) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODEL_REFERENCE:
				if(context == grammarAccess.getModelReferenceRule()) {
					sequence_ModelReference(context, (ModelReference) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.PROJECTIVE_MODEL_DEFINITION:
				if(context == grammarAccess.getProjectiveModelDefinitionRule()) {
					sequence_ProjectiveModelDefinition(context, (ProjectiveModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getPropertyDefinitionRule()) {
					sequence_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.PROPERTY_FOLDING:
				if(context == grammarAccess.getPropertyFoldingRule()) {
					sequence_PropertyFolding(context, (PropertyFolding) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.PROPERTY_MAPPING:
				if(context == grammarAccess.getPropertyMappingRule()) {
					sequence_PropertyMapping(context, (PropertyMapping) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.QUALIFIED_NAME_OBJECT:
				if(context == grammarAccess.getQualifiedNameObjectRule()) {
					sequence_QualifiedNameObject(context, (QualifiedNameObject) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.RECORD_EXPRESSION:
				if(context == grammarAccess.getRecordExpressionRule()) {
					sequence_RecordExpression(context, (RecordExpression) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.RECORD_MODEL_DEFINITION:
				if(context == grammarAccess.getRecordModelDefinitionRule()) {
					sequence_RecordModelDefinition(context, (RecordModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.RECORD_TERM:
				if(context == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordTerm) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.SUMMARIZE_EXPRESSION:
				if(context == grammarAccess.getSummarizeExpressionRule()) {
					sequence_SummarizeExpression(context, (SummarizeExpression) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.SUMMARIZE_MODEL_DEFINITION:
				if(context == grammarAccess.getSummarizeModelDefinitionRule()) {
					sequence_SummarizeModelDefinition(context, (SummarizeModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.SUMMARIZE_TERM:
				if(context == grammarAccess.getSummarizeTermRule()) {
					sequence_SummarizeTerm(context, (SummarizeTerm) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elements+=AttributeElement elements+=AttributeElement*)
	 */
	protected void sequence_AttributeElementList(EObject context, AttributeElementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name value=AttributeValue)
	 */
	protected void sequence_AttributeElement(EObject context, AttributeElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.ATTRIBUTE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.ATTRIBUTE_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.ATTRIBUTE_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.ATTRIBUTE_ELEMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     attributes+=Attribute+
	 */
	protected void sequence_AttributeList(EObject context, AttributeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=AttributeValue elements+=AttributeValue*)
	 */
	protected void sequence_AttributeValueArray(EObject context, AttributeValueArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=AttributeValueArray | value=QualifiedNameObject | value=Literal)
	 */
	protected void sequence_AttributeValue(EObject context, AttributeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements=AttributeElementList?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name*)
	 */
	protected void sequence_Grouping(EObject context, Grouping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=JoinTerm terms+=JoinTerm*)
	 */
	protected void sequence_JoinExpression(EObject context, JoinExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=ModelReference mapping=ModelMapping? grouping=Grouping?)
	 */
	protected void sequence_JoinTerm(EObject context, JoinTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name rhs=JoinExpression)
	 */
	protected void sequence_JoinedModelDefinition(EObject context, JoinedModelDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.JOINED_MODEL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.JOINED_MODEL_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.JOINED_MODEL_DEFINITION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.JOINED_MODEL_DEFINITION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJoinedModelDefinitionAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJoinedModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stringValue=STRING | intValue=INT | decimalValue=DECIMAL | booleanValue=BOOLEAN)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=Description? 
	 *         attributes=AttributeList? 
	 *         (model=RecordModelDefinition | model=ProjectiveModelDefinition | model=JoinedModelDefinition | model=SummarizeModelDefinition)
	 *     )
	 */
	protected void sequence_ModelDefinition(EObject context, ModelDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     foldings+=PropertyFolding+
	 */
	protected void sequence_ModelFolding(EObject context, ModelFolding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mappings+=PropertyMapping+
	 */
	protected void sequence_ModelMapping(EObject context, ModelMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_ModelReference(EObject context, ModelReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.MODEL_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.MODEL_REFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name rhs=RecordExpression)
	 */
	protected void sequence_ProjectiveModelDefinition(EObject context, ProjectiveModelDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.PROJECTIVE_MODEL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.PROJECTIVE_MODEL_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.PROJECTIVE_MODEL_DEFINITION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.PROJECTIVE_MODEL_DEFINITION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProjectiveModelDefinitionAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProjectiveModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (description=Description? attributes=AttributeList? name=Name type=Type)
	 */
	protected void sequence_PropertyDefinition(EObject context, PropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=Description? attributes=AttributeList? aggregator=QualifiedName from=Name name=Name)
	 */
	protected void sequence_PropertyFolding(EObject context, PropertyFolding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=Description? attributes=AttributeList? from=Name name=Name)
	 */
	protected void sequence_PropertyMapping(EObject context, PropertyMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_QualifiedNameObject(EObject context, QualifiedNameObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.QUALIFIED_NAME_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.QUALIFIED_NAME_OBJECT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=RecordTerm terms+=RecordTerm*)
	 */
	protected void sequence_RecordExpression(EObject context, RecordExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name rhs=RecordExpression)
	 */
	protected void sequence_RecordModelDefinition(EObject context, RecordModelDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.RECORD_MODEL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.RECORD_MODEL_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.RECORD_MODEL_DEFINITION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.RECORD_MODEL_DEFINITION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (properties+=PropertyDefinition+ | reference=ModelReference)
	 */
	protected void sequence_RecordTerm(EObject context, RecordTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=ModelDefinition*
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=SummarizeTerm terms+=SummarizeTerm*)
	 */
	protected void sequence_SummarizeExpression(EObject context, SummarizeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name rhs=SummarizeExpression)
	 */
	protected void sequence_SummarizeModelDefinition(EObject context, SummarizeModelDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.SUMMARIZE_MODEL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.SUMMARIZE_MODEL_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.SUMMARIZE_MODEL_DEFINITION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.SUMMARIZE_MODEL_DEFINITION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=ModelReference folding=ModelFolding grouping=Grouping?)
	 */
	protected void sequence_SummarizeTerm(EObject context, SummarizeTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

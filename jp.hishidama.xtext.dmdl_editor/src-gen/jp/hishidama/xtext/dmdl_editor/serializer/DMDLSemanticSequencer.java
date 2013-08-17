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
import jp.hishidama.xtext.dmdl_editor.dmdl.Literal;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.Models;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
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
			case DmdlPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODEL_REFERENCE:
				if(context == grammarAccess.getModelReferenceRule()) {
					sequence_ModelReference(context, (ModelReference) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODELS:
				if(context == grammarAccess.getModelsRule()) {
					sequence_Models(context, (Models) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getPropertyDefinitionRule()) {
					sequence_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
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
				if(context == grammarAccess.getModelDefinitionRule() ||
				   context == grammarAccess.getRecordModelDefinitionRule()) {
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
	 *     (value=AttributeValueArray | value=QualifiedName | value=Literal)
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
	 *     (stringValue=STRING | intValue=INT | decimalValue=DECIMAL | booleanValue=BOOLEAN)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
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
	 *     list+=ModelDefinition*
	 */
	protected void sequence_Models(EObject context, Models semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name+=Name name+=Name*)
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (description=Description? attributes=AttributeList? name=Name rhs=RecordExpression)
	 */
	protected void sequence_RecordModelDefinition(EObject context, RecordModelDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (terms+=SummarizeTerm terms+=SummarizeTerm*)
	 */
	protected void sequence_SummarizeExpression(EObject context, SummarizeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=Description? attributes=AttributeList? name=Name rhs=SummarizeExpression)
	 */
	protected void sequence_SummarizeModelDefinition(EObject context, SummarizeModelDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=ModelReference
	 */
	protected void sequence_SummarizeTerm(EObject context, SummarizeTerm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.SUMMARIZE_TERM__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.SUMMARIZE_TERM__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0(), semanticObject.getReference());
		feeder.finish();
	}
}

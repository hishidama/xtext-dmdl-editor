package jp.hishidama.xtext.dmdl_editor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Models;
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
			case DmdlPackage.MODEL_DEFINITION:
				if(context == grammarAccess.getModelDefinitionRule()) {
					sequence_ModelDefinition(context, (ModelDefinition) semanticObject); 
					return; 
				}
				else break;
			case DmdlPackage.MODELS:
				if(context == grammarAccess.getModelsRule()) {
					sequence_Models(context, (Models) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_ModelDefinition(EObject context, ModelDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmdlPackage.Literals.MODEL_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmdlPackage.Literals.MODEL_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     list+=ModelDefinition*
	 */
	protected void sequence_Models(EObject context, Models semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

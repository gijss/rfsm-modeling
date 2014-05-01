package be.kuleuven.rodinia.dsl.serializer;

import be.kuleuven.rodinia.dsl.services.RfsmGrammarAccess;
import be.kuleuven.rodinia.model.rfsm.Event;
import be.kuleuven.rodinia.model.rfsm.Function;
import be.kuleuven.rodinia.model.rfsm.RfsmGraph;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.State;
import be.kuleuven.rodinia.model.rfsm.Transition;
import com.google.inject.Inject;
import com.google.inject.Provider;
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
public class RfsmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RfsmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RfsmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RfsmPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case RfsmPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case RfsmPackage.RFSM_GRAPH:
				if(context == grammarAccess.getRfsmGraphRule()) {
					sequence_RfsmGraph(context, (RfsmGraph) semanticObject); 
					return; 
				}
				else break;
			case RfsmPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case RfsmPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     event=STRING
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RfsmPackage.Literals.EVENT__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RfsmPackage.Literals.EVENT__EVENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getEventSTRINGTerminalRuleCall_1_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     call=STRING
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RfsmPackage.Literals.FUNCTION__CALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RfsmPackage.Literals.FUNCTION__CALL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getCallSTRINGTerminalRuleCall_0(), semanticObject.getCall());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rootState=State transitions+=Transition*)
	 */
	protected void sequence_RfsmGraph(EObject context, RfsmGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID states+=State* entry=Function? doo=Function? exit=Function?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source+=[State|QualifiedName] target+=[State|QualifiedName] events+=Event* priorityNumber=INT?)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

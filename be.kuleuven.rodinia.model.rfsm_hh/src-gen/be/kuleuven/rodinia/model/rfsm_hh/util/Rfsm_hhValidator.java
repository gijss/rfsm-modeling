/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.util;

import be.kuleuven.rodinia.model.rfsm_hh.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage
 * @generated
 */
public class Rfsm_hhValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final Rfsm_hhValidator INSTANCE = new Rfsm_hhValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "be.kuleuven.rodinia.model.rfsm_hh";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rfsm_hhValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return Rfsm_hhPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH:
        return validateHyperGraph((HyperGraph)value, diagnostics, context);
      case Rfsm_hhPackage.HYPER_EDGE:
        return validateHyperEdge((HyperEdge)value, diagnostics, context);
      case Rfsm_hhPackage.HYPER_VERTEX:
        return validateHyperVertex((HyperVertex)value, diagnostics, context);
      case Rfsm_hhPackage.STATE:
        return validateState((State)value, diagnostics, context);
      case Rfsm_hhPackage.CONNECTOR:
        return validateConnector((Connector)value, diagnostics, context);
      case Rfsm_hhPackage.TRANSITION:
        return validateTransition((Transition)value, diagnostics, context);
      case Rfsm_hhPackage.EVENT:
        return validateEvent((Event)value, diagnostics, context);
      case Rfsm_hhPackage.FUNCTION:
        return validateFunction((Function)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHyperGraph(HyperGraph hyperGraph, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(hyperGraph, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHyperEdge(HyperEdge hyperEdge, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(hyperEdge, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hyperEdge, diagnostics, context);
    if (result || diagnostics != null) result &= validateHyperEdge_legalBoundaryCrossing(hyperEdge, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the legalBoundaryCrossing constraint of '<em>Hyper Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String HYPER_EDGE__LEGAL_BOUNDARY_CROSSING__EEXPRESSION = "(self.target.parent <> self.source) and isAncestor(self.target.parent, self.source)";

  /**
   * Validates the legalBoundaryCrossing constraint of '<em>Hyper Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHyperEdge_legalBoundaryCrossing(HyperEdge hyperEdge, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.HYPER_EDGE,
         hyperEdge,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "legalBoundaryCrossing",
         HYPER_EDGE__LEGAL_BOUNDARY_CROSSING__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHyperVertex(HyperVertex hyperVertex, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(hyperVertex, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hyperVertex, diagnostics, context);
    if (result || diagnostics != null) result &= validateHyperVertex_defineOnlyOneRootHyperVertex(hyperVertex, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the defineOnlyOneRootHyperVertex constraint of '<em>Hyper Vertex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String HYPER_VERTEX__DEFINE_ONLY_ONE_ROOT_HYPER_VERTEX__EEXPRESSION = "(HyperVertex.allInstances()->select(n | n.parent.oclIsUndefined ()))->size() = 1";

  /**
   * Validates the defineOnlyOneRootHyperVertex constraint of '<em>Hyper Vertex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHyperVertex_defineOnlyOneRootHyperVertex(HyperVertex hyperVertex, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.HYPER_VERTEX,
         hyperVertex,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "defineOnlyOneRootHyperVertex",
         HYPER_VERTEX__DEFINE_ONLY_ONE_ROOT_HYPER_VERTEX__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
    if (result || diagnostics != null) result &= validateHyperVertex_defineOnlyOneRootHyperVertex(state, diagnostics, context);
    if (result || diagnostics != null) result &= validateState_defineInitialConnectorWhenComposite(state, diagnostics, context);
    if (result || diagnostics != null) result &= validateState_defineMaxOneInitialConnector(state, diagnostics, context);
    if (result || diagnostics != null) result &= validateState_onlyLeafStatesHaveDoo(state, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the defineInitialConnectorWhenComposite constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String STATE__DEFINE_INITIAL_CONNECTOR_WHEN_COMPOSITE__EEXPRESSION = "self.subHyperVertices->size() > 0 and Transition.allInstances()->exists(t | t.target=self) implies self.subHyperVertexs->select(c | c.oclIsTypeOf(Connector) and c.name='initial')->size() = 1";

  /**
   * Validates the defineInitialConnectorWhenComposite constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState_defineInitialConnectorWhenComposite(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.STATE,
         state,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "defineInitialConnectorWhenComposite",
         STATE__DEFINE_INITIAL_CONNECTOR_WHEN_COMPOSITE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the defineMaxOneInitialConnector constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String STATE__DEFINE_MAX_ONE_INITIAL_CONNECTOR__EEXPRESSION = "(self.subHyperVertices->size() > 0) implies (self.subHyperVertices->select(c | c.oclIsTypeOf(Connector) and c.name='initial')->size() <= 1)";

  /**
   * Validates the defineMaxOneInitialConnector constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState_defineMaxOneInitialConnector(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.STATE,
         state,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "defineMaxOneInitialConnector",
         STATE__DEFINE_MAX_ONE_INITIAL_CONNECTOR__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the onlyLeafStatesHaveDoo constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String STATE__ONLY_LEAF_STATES_HAVE_DOO__EEXPRESSION = "(not self.doo.oclIsUndefined()) implies (self.subHyperVertices->size() = 0)";

  /**
   * Validates the onlyLeafStatesHaveDoo constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState_onlyLeafStatesHaveDoo(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.STATE,
         state,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "onlyLeafStatesHaveDoo",
         STATE__ONLY_LEAF_STATES_HAVE_DOO__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
    if (result || diagnostics != null) result &= validateHyperEdge_legalBoundaryCrossing(connector, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validateHyperEdge_legalBoundaryCrossing(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransition_maxOneTransitionFromInitialConnector(transition, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransition_noGuardFromInitialConnector(transition, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the maxOneTransitionFromInitialConnector constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSITION__MAX_ONE_TRANSITION_FROM_INITIAL_CONNECTOR__EEXPRESSION = "(self.source.oclIsTypeOf(Connector) and self.source.name='initial') implies (Transition.allInstances()->select(t | t.source = self.source)->size()) <= 1";

  /**
   * Validates the maxOneTransitionFromInitialConnector constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransition_maxOneTransitionFromInitialConnector(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.TRANSITION,
         transition,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "maxOneTransitionFromInitialConnector",
         TRANSITION__MAX_ONE_TRANSITION_FROM_INITIAL_CONNECTOR__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the noGuardFromInitialConnector constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSITION__NO_GUARD_FROM_INITIAL_CONNECTOR__EEXPRESSION = "(self.source.oclIsTypeOf(Connector) and self.source.name='initial') implies guard.oclIsUndefined()";

  /**
   * Validates the noGuardFromInitialConnector constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransition_noGuardFromInitialConnector(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (Rfsm_hhPackage.Literals.TRANSITION,
         transition,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "noGuardFromInitialConnector",
         TRANSITION__NO_GUARD_FROM_INITIAL_CONNECTOR__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(event, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(function, diagnostics, context);
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //Rfsm_hhValidator

/**
 */
package be.kuleuven.rodinia.model.rfsm.util;

import be.kuleuven.rodinia.model.rfsm.*;

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
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage
 * @generated
 */
public class RfsmValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final RfsmValidator INSTANCE = new RfsmValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "be.kuleuven.rodinia.model.rfsm";

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
  public RfsmValidator()
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
    return RfsmPackage.eINSTANCE;
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
      case RfsmPackage.NODE:
        return validateNode((Node)value, diagnostics, context);
      case RfsmPackage.STATE:
        return validateState((State)value, diagnostics, context);
      case RfsmPackage.CONNECTOR:
        return validateConnector((Connector)value, diagnostics, context);
      case RfsmPackage.TRANSITION:
        return validateTransition((Transition)value, diagnostics, context);
      case RfsmPackage.EVENT:
        return validateEvent((Event)value, diagnostics, context);
      case RfsmPackage.FUNCTION:
        return validateFunction((Function)value, diagnostics, context);
      case RfsmPackage.HISTORY:
        return validateHistory((History)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(node, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateState_definitconn(state, diagnostics, context);
    if (result || diagnostics != null) result &= validateState_onlyoneinitconn(state, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the definitconn constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String STATE__DEFINITCONN__EEXPRESSION = "self.subnodes->size() > 0 and Transition.allInstances()->select(t | t.target=self)->size() >= 1 implies (self.subnodes->select(c | c.oclIsTypeOf(Connector) and c.name='initial'))->size() = 1";

  /**
   * Validates the definitconn constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState_definitconn(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (RfsmPackage.Literals.STATE,
         state,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "definitconn",
         STATE__DEFINITCONN__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the onlyoneinitconn constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String STATE__ONLYONEINITCONN__EEXPRESSION = "self.subnodes->size() > 0 implies (self.subnodes->select(c | c.oclIsTypeOf(Connector) and c.name='initial'))->size() <= 1";

  /**
   * Validates the onlyoneinitconn constraint of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateState_onlyoneinitconn(State state, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (RfsmPackage.Literals.STATE,
         state,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "onlyoneinitconn",
         STATE__ONLYONEINITCONN__EEXPRESSION,
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
    return validate_EveryDefaultConstraint(connector, diagnostics, context);
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
    if (result || diagnostics != null) result &= validateTransition_transitionowner(transition, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the transitionowner constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSITION__TRANSITIONOWNER__EEXPRESSION = "priority_number <> 0";

  /**
   * Validates the transitionowner constraint of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransition_transitionowner(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (RfsmPackage.Literals.TRANSITION,
         transition,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "transitionowner",
         TRANSITION__TRANSITIONOWNER__EEXPRESSION,
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHistory(History history, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(history, diagnostics, context);
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

} //RfsmValidator

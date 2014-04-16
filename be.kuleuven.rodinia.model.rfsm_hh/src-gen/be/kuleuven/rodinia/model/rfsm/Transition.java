/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Transition#getPriority_number <em>Priority number</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxOneTransitionFromInitialConnector noGuardFromInitialConnector'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxOneTransitionFromInitialConnector='(self.source.oclIsTypeOf(Connector) and self.source.name=\'initial\') implies (Transition.allInstances()->select(t | t.source = self.source)->size()) <= 1' noGuardFromInitialConnector='(self.source.oclIsTypeOf(Connector) and self.source.name=\'initial\') implies guard.oclIsUndefined()'"
 * @generated
 */
public interface Transition extends GraphEdge
{
  /**
   * Returns the value of the '<em><b>Priority number</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority number</em>' attribute.
   * @see #setPriority_number(int)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getTransition_Priority_number()
   * @model default="0" unique="false"
   * @generated
   */
  int getPriority_number();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Transition#getPriority_number <em>Priority number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority number</em>' attribute.
   * @see #getPriority_number()
   * @generated
   */
  void setPriority_number(int value);

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm.Event}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.Event#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getTransition_Events()
   * @see be.kuleuven.rodinia.model.rfsm.Event#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Function)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getTransition_Guard()
   * @model containment="true"
   * @generated
   */
  Function getGuard();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Transition#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Function value);

  /**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' containment reference.
   * @see #setEffect(Function)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getTransition_Effect()
   * @model containment="true"
   * @generated
   */
  Function getEffect();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Transition#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Function value);

} // Transition

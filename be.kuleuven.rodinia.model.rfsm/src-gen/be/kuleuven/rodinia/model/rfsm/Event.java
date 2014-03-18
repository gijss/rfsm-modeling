/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Event#getEventliteral <em>Eventliteral</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Event#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Eventliteral</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eventliteral</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eventliteral</em>' attribute.
   * @see #setEventliteral(String)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEvent_Eventliteral()
   * @model unique="false"
   * @generated
   */
  String getEventliteral();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Event#getEventliteral <em>Eventliteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eventliteral</em>' attribute.
   * @see #getEventliteral()
   * @generated
   */
  void setEventliteral(String value);

  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.Transition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see #setOwner(Transition)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEvent_Owner()
   * @see be.kuleuven.rodinia.model.rfsm.Transition#getEvents
   * @model opposite="events"
   * @generated
   */
  Transition getOwner();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Event#getOwner <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(Transition value);

} // Event

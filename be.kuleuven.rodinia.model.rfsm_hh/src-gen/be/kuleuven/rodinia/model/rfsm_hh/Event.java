/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getEventliteral <em>Eventliteral</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getEvent()
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
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getEvent_Eventliteral()
   * @model unique="false"
   * @generated
   */
  String getEventliteral();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getEventliteral <em>Eventliteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eventliteral</em>' attribute.
   * @see #getEventliteral()
   * @generated
   */
  void setEventliteral(String value);

  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(Transition)
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getEvent_Owner()
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition#getEvents
   * @model opposite="events" transient="false"
   * @generated
   */
  Transition getOwner();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(Transition value);

} // Event

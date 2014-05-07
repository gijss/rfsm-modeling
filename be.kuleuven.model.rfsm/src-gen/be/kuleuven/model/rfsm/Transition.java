/**
 */
package be.kuleuven.model.rfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.Transition#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.Transition#getPriorityNumber <em>Priority Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.Transition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition_Source()
   * @model
   * @generated
   */
  EList<State> getSource();

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition_Target()
   * @model
   * @generated
   */
  EList<State> getTarget();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Priority Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority Number</em>' attribute.
   * @see #setPriorityNumber(int)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getTransition_PriorityNumber()
   * @model unique="false"
   * @generated
   */
  int getPriorityNumber();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.Transition#getPriorityNumber <em>Priority Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority Number</em>' attribute.
   * @see #getPriorityNumber()
   * @generated
   */
  void setPriorityNumber(int value);

} // Transition

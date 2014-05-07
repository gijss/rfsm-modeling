/**
 */
package be.kuleuven.model.rfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.State#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.State#getStates <em>States</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.State#getDoo <em>Doo</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.State#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.model.rfsm.RfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
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
   * @see be.kuleuven.model.rfsm.RfsmPackage#getState_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getState_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' containment reference.
   * @see #setEntry(Function)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getState_Entry()
   * @model containment="true"
   * @generated
   */
  Function getEntry();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.State#getEntry <em>Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry</em>' containment reference.
   * @see #getEntry()
   * @generated
   */
  void setEntry(Function value);

  /**
   * Returns the value of the '<em><b>Doo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doo</em>' containment reference.
   * @see #setDoo(Function)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getState_Doo()
   * @model containment="true"
   * @generated
   */
  Function getDoo();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.State#getDoo <em>Doo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doo</em>' containment reference.
   * @see #getDoo()
   * @generated
   */
  void setDoo(Function value);

  /**
   * Returns the value of the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit</em>' containment reference.
   * @see #setExit(Function)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getState_Exit()
   * @model containment="true"
   * @generated
   */
  Function getExit();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.State#getExit <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit</em>' containment reference.
   * @see #getExit()
   * @generated
   */
  void setExit(Function value);

} // State

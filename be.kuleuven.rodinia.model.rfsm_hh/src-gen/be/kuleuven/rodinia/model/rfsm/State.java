/**
 */
package be.kuleuven.rodinia.model.rfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.State#getDoo <em>Doo</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.State#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defineInitialConnectorWhenComposite defineMaxOneInitialConnector onlyLeafStatesHaveDoo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defineInitialConnectorWhenComposite='self.subHyperVertices->size() > 0 and Transition.allInstances()->exists(t | t.target=self) implies self.subHyperVertexs->select(c | c.oclIsTypeOf(Connector) and c.name=\'initial\')->size() = 1' defineMaxOneInitialConnector='(self.subHyperVertices->size() > 0) implies (self.subHyperVertices->select(c | c.oclIsTypeOf(Connector) and c.name=\'initial\')->size() <= 1)' onlyLeafStatesHaveDoo='(not self.doo.oclIsUndefined()) implies (self.subHyperVertices->size() = 0)'"
 * @generated
 */
public interface State extends HyperGraph
{
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
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getState_Entry()
   * @model containment="true"
   * @generated
   */
  Function getEntry();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.State#getEntry <em>Entry</em>}' containment reference.
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
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getState_Doo()
   * @model containment="true"
   * @generated
   */
  Function getDoo();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.State#getDoo <em>Doo</em>}' containment reference.
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
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getState_Exit()
   * @model containment="true"
   * @generated
   */
  Function getExit();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.State#getExit <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit</em>' containment reference.
   * @see #getExit()
   * @generated
   */
  void setExit(Function value);

} // State

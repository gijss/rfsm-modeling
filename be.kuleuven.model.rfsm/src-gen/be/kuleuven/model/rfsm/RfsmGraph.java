/**
 */
package be.kuleuven.model.rfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This rFSM metamodel of is based on a HyperGraph model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.RfsmGraph#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.RfsmGraph#getRootState <em>Root State</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.RfsmGraph#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.RfsmGraph#getRfmsGraphs <em>Rfms Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.model.rfsm.RfsmPackage#getRfsmGraph()
 * @model
 * @generated
 */
public interface RfsmGraph extends EObject
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
   * @see be.kuleuven.model.rfsm.RfsmPackage#getRfsmGraph_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.RfsmGraph#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Root State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root State</em>' containment reference.
   * @see #setRootState(State)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getRfsmGraph_RootState()
   * @model containment="true"
   * @generated
   */
  State getRootState();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.RfsmGraph#getRootState <em>Root State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root State</em>' containment reference.
   * @see #getRootState()
   * @generated
   */
  void setRootState(State value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getRfsmGraph_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

  /**
   * Returns the value of the '<em><b>Rfms Graphs</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.model.rfsm.RfsmGraph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rfms Graphs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rfms Graphs</em>' containment reference list.
   * @see be.kuleuven.model.rfsm.RfsmPackage#getRfsmGraph_RfmsGraphs()
   * @model containment="true"
   * @generated
   */
  EList<RfsmGraph> getRfmsGraphs();

} // RfsmGraph

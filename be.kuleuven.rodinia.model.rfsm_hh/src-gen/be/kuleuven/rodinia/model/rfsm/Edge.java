/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Vertex)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEdge_Source()
   * @model required="true"
   * @generated
   */
  Vertex getSource();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Edge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Vertex value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Vertex)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getEdge_Target()
   * @model required="true"
   * @generated
   */
  Vertex getTarget();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Edge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Vertex value);

} // Edge

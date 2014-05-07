/**
 */
package be.kuleuven.model.rfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.Function#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.model.rfsm.RfsmPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' attribute.
   * @see #setCall(String)
   * @see be.kuleuven.model.rfsm.RfsmPackage#getFunction_Call()
   * @model unique="false"
   * @generated
   */
  String getCall();

  /**
   * Sets the value of the '{@link be.kuleuven.model.rfsm.Function#getCall <em>Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' attribute.
   * @see #getCall()
   * @generated
   */
  void setCall(String value);

} // Function

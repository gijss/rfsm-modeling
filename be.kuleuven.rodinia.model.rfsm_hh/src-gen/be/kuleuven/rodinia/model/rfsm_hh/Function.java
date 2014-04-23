/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.Function#getSourcecode <em>Sourcecode</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourcecode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourcecode</em>' attribute.
   * @see #setSourcecode(String)
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getFunction_Sourcecode()
   * @model unique="false"
   * @generated
   */
  String getSourcecode();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.Function#getSourcecode <em>Sourcecode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourcecode</em>' attribute.
   * @see #getSourcecode()
   * @generated
   */
  void setSourcecode(String value);

} // Function

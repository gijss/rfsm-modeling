/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.History#getDepth <em>Depth</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.History#isHot <em>Hot</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject
{
  /**
   * Returns the value of the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depth</em>' attribute.
   * @see #setDepth(int)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHistory_Depth()
   * @model unique="false"
   * @generated
   */
  int getDepth();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.History#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth</em>' attribute.
   * @see #getDepth()
   * @generated
   */
  void setDepth(int value);

  /**
   * Returns the value of the '<em><b>Hot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hot</em>' attribute.
   * @see #setHot(boolean)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHistory_Hot()
   * @model unique="false"
   * @generated
   */
  boolean isHot();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.History#isHot <em>Hot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hot</em>' attribute.
   * @see #isHot()
   * @generated
   */
  void setHot(boolean value);

} // History

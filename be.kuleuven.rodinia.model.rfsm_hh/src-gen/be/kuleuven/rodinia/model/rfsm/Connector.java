/**
 */
package be.kuleuven.rodinia.model.rfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Connector#isPublic <em>Public</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Connector#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Vertex
{
  /**
   * Returns the value of the '<em><b>Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public</em>' attribute.
   * @see #setPublic(boolean)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getConnector_Public()
   * @model unique="false"
   * @generated
   */
  boolean isPublic();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Connector#isPublic <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Public</em>' attribute.
   * @see #isPublic()
   * @generated
   */
  void setPublic(boolean value);

  /**
   * Returns the value of the '<em><b>History</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>History</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>History</em>' containment reference.
   * @see #setHistory(History)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getConnector_History()
   * @model containment="true"
   * @generated
   */
  History getHistory();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Connector#getHistory <em>History</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>History</em>' containment reference.
   * @see #getHistory()
   * @generated
   */
  void setHistory(History value);

} // Connector

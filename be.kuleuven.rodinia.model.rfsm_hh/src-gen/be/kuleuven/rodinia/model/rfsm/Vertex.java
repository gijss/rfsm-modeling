/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Xcore metamodel of rFSM is based on the Ecore metamodel in the rFSM paper ('Coordinating Robotic Tasks and Systems with rFSM Statecharts' by M. Klotzbucher, H. Bruyninckx)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Vertex#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.Vertex#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject
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
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getVertex_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Vertex#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubVertices <em>Sub Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(HyperVertex)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getVertex_Parent()
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubVertices
   * @model opposite="subVertices" transient="false"
   * @generated
   */
  HyperVertex getParent();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.Vertex#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(HyperVertex value);

} // Vertex

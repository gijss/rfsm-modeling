/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.HyperEdge#getVertices <em>Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperEdge()
 * @model
 * @generated
 */
public interface HyperEdge extends EObject
{
  /**
   * Returns the value of the '<em><b>Vertices</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm.Vertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertices</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertices</em>' reference list.
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperEdge_Vertices()
   * @model
   * @generated
   */
  EList<Vertex> getVertices();

} // HyperEdge

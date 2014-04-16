/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.HyperGraph#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperGraph()
 * @model
 * @generated
 */
public interface HyperGraph extends HyperVertex
{
  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm.GraphEdge}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperGraph_Edges()
   * @see be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<GraphEdge> getEdges();

} // HyperGraph

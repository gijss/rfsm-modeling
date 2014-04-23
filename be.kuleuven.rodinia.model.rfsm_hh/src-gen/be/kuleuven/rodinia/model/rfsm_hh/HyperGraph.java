/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Xcore metamodel of rFSM is based on the Ecore metamodel in the rFSM paper ('Coordinating Robotic Tasks and Systems with rFSM Statecharts' by M. Klotzbucher, H. Bruyninckx)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperVertices <em>Hyper Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperEdges <em>Hyper Edges</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperGraphs <em>Hyper Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperGraph()
 * @model
 * @generated
 */
public interface HyperGraph extends EObject
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
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperGraph_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hyper Vertices</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hyper Vertices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hyper Vertices</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperGraph_HyperVertices()
   * @model containment="true"
   * @generated
   */
  EList<HyperVertex> getHyperVertices();

  /**
   * Returns the value of the '<em><b>Hyper Edges</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hyper Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hyper Edges</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperGraph_HyperEdges()
   * @model containment="true"
   * @generated
   */
  EList<HyperEdge> getHyperEdges();

  /**
   * Returns the value of the '<em><b>Hyper Graphs</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hyper Graphs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hyper Graphs</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperGraph_HyperGraphs()
   * @model containment="true"
   * @generated
   */
  EList<HyperGraph> getHyperGraphs();

} // HyperGraph

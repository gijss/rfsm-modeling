/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getVertices <em>Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperVertex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defineOnlyOneRootHyperVertex'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defineOnlyOneRootHyperVertex='(HyperVertex.allInstances()->select(n | n.parent.oclIsUndefined ()))->size() = 1'"
 * @generated
 */
public interface HyperVertex extends EObject
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
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperVertex_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperVertex_Vertices()
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<HyperVertex> getVertices();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getVertices <em>Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(HyperVertex)
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperVertex_Parent()
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getVertices
   * @model opposite="vertices" transient="false"
   * @generated
   */
  HyperVertex getParent();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(HyperVertex value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" oneUnique="false" twoUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (one = two) \n\t\t\t\t\tthen true\n\t\t\t\telse\n\t\t\t\t\tif (two.parent.oclIsUndefined ())\n\t\t\t\t\t\tthen false\n\t\t\t\t\telse \n\t\t\t\t\t\tif (two.parent = one)\n\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tisAncestor(one, two.parent)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
   * @generated
   */
  Boolean isAncestor(HyperVertex one, HyperVertex two);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" oneUnique="false" twoUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if isAncestor(one, two)\n\t\t\t\t\tthen one\n\t\t\t\telse \n\t\t\t\t\tif isAncestor(two, one)\n\t\t\t\t\t\tthen two\n\t\t\t\t\telse\n\t\t\t\t\t\tLCA(one.parent,two.parent)\n\t\t\t\t\tendif\n\t\t\t\tendif'"
   * @generated
   */
  HyperVertex LCA(HyperVertex one, HyperVertex two);

} // HyperVertex

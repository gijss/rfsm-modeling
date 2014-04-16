/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubHyperVertices <em>Sub Hyper Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperVertex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defineOnlyOneRootHyperVertex'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defineOnlyOneRootHyperVertex='(HyperVertex.allInstances()->select(n | n.parent.oclIsUndefined ()))->size() = 1'"
 * @generated
 */
public interface HyperVertex extends Vertex
{
  /**
   * Returns the value of the '<em><b>Sub Hyper Vertices</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm.HyperVertex}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Hyper Vertices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Hyper Vertices</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperVertex_SubHyperVertices()
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<HyperVertex> getSubHyperVertices();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubHyperVertices <em>Sub Hyper Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(HyperVertex)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperVertex_Parent()
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubHyperVertices
   * @model opposite="subHyperVertices" transient="false"
   * @generated
   */
  HyperVertex getParent();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getParent <em>Parent</em>}' container reference.
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
  Boolean isAncestor(Vertex one, Vertex two);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" oneUnique="false" twoUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if isAncestor(one, two) and one.oclIsTypeOf(HyperVertex)\n\t\t\t\t\tthen one.oclAsType(HyperVertex)\n\t\t\t\telse \n\t\t\t\t\tif isAncestor(two, one) and two.oclIsTypeOf(HyperVertex)\n\t\t\t\t\t\tthen two.oclAsType(HyperVertex)\n\t\t\t\t\telse\n\t\t\t\t\t\tLCA(one.parent,two.parent)\n\t\t\t\t\tendif\n\t\t\t\tendif'"
   * @generated
   */
  HyperVertex LCA(Vertex one, Vertex two);

} // HyperVertex

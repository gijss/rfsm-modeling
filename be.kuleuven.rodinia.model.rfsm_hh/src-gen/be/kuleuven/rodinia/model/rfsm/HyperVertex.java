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
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubVertices <em>Sub Vertices</em>}</li>
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
   * Returns the value of the '<em><b>Sub Vertices</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm.Vertex}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.Vertex#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Vertices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Vertices</em>' containment reference list.
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getHyperVertex_SubVertices()
   * @see be.kuleuven.rodinia.model.rfsm.Vertex#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Vertex> getSubVertices();

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

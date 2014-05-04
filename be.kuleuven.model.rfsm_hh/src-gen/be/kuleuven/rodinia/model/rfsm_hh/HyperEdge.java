/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

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
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='legalBoundaryCrossing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot legalBoundaryCrossing='(self.target.parent <> self.source) and isAncestor(self.target.parent, self.source)'"
 * @generated
 */
public interface HyperEdge extends EObject
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
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperEdge_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperEdge_Source()
   * @model
   * @generated
   */
  EList<HyperVertex> getSource();

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference list.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage#getHyperEdge_Target()
   * @model
   * @generated
   */
  EList<HyperVertex> getTarget();

} // HyperEdge

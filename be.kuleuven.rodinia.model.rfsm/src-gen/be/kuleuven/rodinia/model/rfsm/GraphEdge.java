/**
 */
package be.kuleuven.rodinia.model.rfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getGraphEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transitionOwner legalBoundaryCrossing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot transitionOwner='let lca : State = LCA(self.source, self.target) in self.owner = lca or isAncestor(self.owner, lca)' legalBoundaryCrossing='(self.target.parent <> self.source) and isAncestor(self.target.parent, self.source)'"
 * @generated
 */
public interface GraphEdge extends Edge
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.rodinia.model.rfsm.HyperGraph#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(HyperGraph)
   * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage#getGraphEdge_Owner()
   * @see be.kuleuven.rodinia.model.rfsm.HyperGraph#getEdges
   * @model opposite="edges" required="true" transient="false"
   * @generated
   */
  HyperGraph getOwner();

  /**
   * Sets the value of the '{@link be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(HyperGraph value);

} // GraphEdge

/**
 */
package be.kuleuven.rodinia.model.rfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.model.rfsm.RfsmPackage
 * @generated
 */
public interface RfsmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RfsmFactory eINSTANCE = be.kuleuven.rodinia.model.rfsm.impl.RfsmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Vertex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vertex</em>'.
   * @generated
   */
  Vertex createVertex();

  /**
   * Returns a new object of class '<em>Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge</em>'.
   * @generated
   */
  Edge createEdge();

  /**
   * Returns a new object of class '<em>Hyper Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyper Edge</em>'.
   * @generated
   */
  HyperEdge createHyperEdge();

  /**
   * Returns a new object of class '<em>Hyper Vertex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyper Vertex</em>'.
   * @generated
   */
  HyperVertex createHyperVertex();

  /**
   * Returns a new object of class '<em>Graph Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph Edge</em>'.
   * @generated
   */
  GraphEdge createGraphEdge();

  /**
   * Returns a new object of class '<em>Hyper Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyper Graph</em>'.
   * @generated
   */
  HyperGraph createHyperGraph();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>History</em>'.
   * @generated
   */
  History createHistory();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RfsmPackage getRfsmPackage();

} //RfsmFactory

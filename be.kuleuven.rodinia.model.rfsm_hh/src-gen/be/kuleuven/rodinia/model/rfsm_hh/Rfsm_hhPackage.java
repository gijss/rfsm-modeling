/**
 */
package be.kuleuven.rodinia.model.rfsm_hh;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.rodinia.model'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Pivot='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Rfsm_hhPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rfsm_hh";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.rodinia.model.rfsm_hh";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rfsm_hh";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Rfsm_hhPackage eINSTANCE = be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl <em>Hyper Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperGraph()
   * @generated
   */
  int HYPER_GRAPH = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__NAME = 0;

  /**
   * The feature id for the '<em><b>Hyper Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__HYPER_VERTICES = 1;

  /**
   * The feature id for the '<em><b>Hyper Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__HYPER_EDGES = 2;

  /**
   * The feature id for the '<em><b>Hyper Graphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__HYPER_GRAPHS = 3;

  /**
   * The number of structural features of the '<em>Hyper Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Hyper Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl <em>Hyper Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperEdge()
   * @generated
   */
  int HYPER_EDGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE__TARGET = 2;

  /**
   * The number of structural features of the '<em>Hyper Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Hyper Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperVertexImpl <em>Hyper Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperVertexImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperVertex()
   * @generated
   */
  int HYPER_VERTEX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__NAME = 0;

  /**
   * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__VERTICES = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__PARENT = 2;

  /**
   * The number of structural features of the '<em>Hyper Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>Is Ancestor</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX = 0;

  /**
   * The operation id for the '<em>LCA</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX = 1;

  /**
   * The number of operations of the '<em>Hyper Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = HYPER_VERTEX__NAME;

  /**
   * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VERTICES = HYPER_VERTEX__VERTICES;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__PARENT = HYPER_VERTEX__PARENT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY = HYPER_VERTEX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Doo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DOO = HYPER_VERTEX_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT = HYPER_VERTEX_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = HYPER_VERTEX_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Is Ancestor</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX = HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX;

  /**
   * The operation id for the '<em>LCA</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE___LCA__HYPERVERTEX_HYPERVERTEX = HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX;

  /**
   * The number of operations of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OPERATION_COUNT = HYPER_VERTEX_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.ConnectorImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = HYPER_EDGE__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__SOURCE = HYPER_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__TARGET = HYPER_EDGE__TARGET;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = HYPER_EDGE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_OPERATION_COUNT = HYPER_EDGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.TransitionImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = HYPER_EDGE__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = HYPER_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = HYPER_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Priority number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__PRIORITY_NUMBER = HYPER_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENTS = HYPER_EDGE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = HYPER_EDGE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EFFECT = HYPER_EDGE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = HYPER_EDGE_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OPERATION_COUNT = HYPER_EDGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.EventImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 6;

  /**
   * The feature id for the '<em><b>Eventliteral</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENTLITERAL = 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OWNER = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.FunctionImpl
   * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 7;

  /**
   * The feature id for the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__SOURCECODE = 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph <em>Hyper Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Graph</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph
   * @generated
   */
  EClass getHyperGraph();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getName()
   * @see #getHyperGraph()
   * @generated
   */
  EAttribute getHyperGraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperVertices <em>Hyper Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hyper Vertices</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperVertices()
   * @see #getHyperGraph()
   * @generated
   */
  EReference getHyperGraph_HyperVertices();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperEdges <em>Hyper Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hyper Edges</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperEdges()
   * @see #getHyperGraph()
   * @generated
   */
  EReference getHyperGraph_HyperEdges();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperGraphs <em>Hyper Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hyper Graphs</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph#getHyperGraphs()
   * @see #getHyperGraph()
   * @generated
   */
  EReference getHyperGraph_HyperGraphs();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge <em>Hyper Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Edge</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperEdge
   * @generated
   */
  EClass getHyperEdge();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getName()
   * @see #getHyperEdge()
   * @generated
   */
  EAttribute getHyperEdge_Name();

  /**
   * Returns the meta object for the reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getSource()
   * @see #getHyperEdge()
   * @generated
   */
  EReference getHyperEdge_Source();

  /**
   * Returns the meta object for the reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperEdge#getTarget()
   * @see #getHyperEdge()
   * @generated
   */
  EReference getHyperEdge_Target();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex <em>Hyper Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Vertex</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex
   * @generated
   */
  EClass getHyperVertex();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getName()
   * @see #getHyperVertex()
   * @generated
   */
  EAttribute getHyperVertex_Name();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getVertices <em>Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vertices</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getVertices()
   * @see #getHyperVertex()
   * @generated
   */
  EReference getHyperVertex_Vertices();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#getParent()
   * @see #getHyperVertex()
   * @generated
   */
  EReference getHyperVertex_Parent();

  /**
   * Returns the meta object for the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#isAncestor(be.kuleuven.rodinia.model.rfsm_hh.HyperVertex, be.kuleuven.rodinia.model.rfsm_hh.HyperVertex) <em>Is Ancestor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Ancestor</em>' operation.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#isAncestor(be.kuleuven.rodinia.model.rfsm_hh.HyperVertex, be.kuleuven.rodinia.model.rfsm_hh.HyperVertex)
   * @generated
   */
  EOperation getHyperVertex__IsAncestor__HyperVertex_HyperVertex();

  /**
   * Returns the meta object for the '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#LCA(be.kuleuven.rodinia.model.rfsm_hh.HyperVertex, be.kuleuven.rodinia.model.rfsm_hh.HyperVertex) <em>LCA</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>LCA</em>' operation.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex#LCA(be.kuleuven.rodinia.model.rfsm_hh.HyperVertex, be.kuleuven.rodinia.model.rfsm_hh.HyperVertex)
   * @generated
   */
  EOperation getHyperVertex__LCA__HyperVertex_HyperVertex();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm_hh.State#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.State#getEntry()
   * @see #getState()
   * @generated
   */
  EReference getState_Entry();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm_hh.State#getDoo <em>Doo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doo</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.State#getDoo()
   * @see #getState()
   * @generated
   */
  EReference getState_Doo();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm_hh.State#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exit</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.State#getExit()
   * @see #getState()
   * @generated
   */
  EReference getState_Exit();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition#getPriority_number <em>Priority number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority number</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition#getPriority_number()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Priority_number();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition#getEvents()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Events();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition#getEffect()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Effect();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getEventliteral <em>Eventliteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eventliteral</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Event#getEventliteral()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Eventliteral();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.rodinia.model.rfsm_hh.Event#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Event#getOwner()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Owner();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm_hh.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm_hh.Function#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Function#getSourcecode()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Sourcecode();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Rfsm_hhFactory getRfsm_hhFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl <em>Hyper Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperGraph()
     * @generated
     */
    EClass HYPER_GRAPH = eINSTANCE.getHyperGraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HYPER_GRAPH__NAME = eINSTANCE.getHyperGraph_Name();

    /**
     * The meta object literal for the '<em><b>Hyper Vertices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_GRAPH__HYPER_VERTICES = eINSTANCE.getHyperGraph_HyperVertices();

    /**
     * The meta object literal for the '<em><b>Hyper Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_GRAPH__HYPER_EDGES = eINSTANCE.getHyperGraph_HyperEdges();

    /**
     * The meta object literal for the '<em><b>Hyper Graphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_GRAPH__HYPER_GRAPHS = eINSTANCE.getHyperGraph_HyperGraphs();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl <em>Hyper Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperEdge()
     * @generated
     */
    EClass HYPER_EDGE = eINSTANCE.getHyperEdge();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HYPER_EDGE__NAME = eINSTANCE.getHyperEdge_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_EDGE__SOURCE = eINSTANCE.getHyperEdge_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_EDGE__TARGET = eINSTANCE.getHyperEdge_Target();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperVertexImpl <em>Hyper Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.HyperVertexImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getHyperVertex()
     * @generated
     */
    EClass HYPER_VERTEX = eINSTANCE.getHyperVertex();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HYPER_VERTEX__NAME = eINSTANCE.getHyperVertex_Name();

    /**
     * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_VERTEX__VERTICES = eINSTANCE.getHyperVertex_Vertices();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_VERTEX__PARENT = eINSTANCE.getHyperVertex_Parent();

    /**
     * The meta object literal for the '<em><b>Is Ancestor</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX = eINSTANCE.getHyperVertex__IsAncestor__HyperVertex_HyperVertex();

    /**
     * The meta object literal for the '<em><b>LCA</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX = eINSTANCE.getHyperVertex__LCA__HyperVertex_HyperVertex();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ENTRY = eINSTANCE.getState_Entry();

    /**
     * The meta object literal for the '<em><b>Doo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__DOO = eINSTANCE.getState_Doo();

    /**
     * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__EXIT = eINSTANCE.getState_Exit();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.ConnectorImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.TransitionImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Priority number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__PRIORITY_NUMBER = eINSTANCE.getTransition_Priority_number();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENTS = eINSTANCE.getTransition_Events();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.EventImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Eventliteral</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENTLITERAL = eINSTANCE.getEvent_Eventliteral();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__OWNER = eINSTANCE.getEvent_Owner();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm_hh.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.FunctionImpl
     * @see be.kuleuven.rodinia.model.rfsm_hh.impl.Rfsm_hhPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Sourcecode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__SOURCECODE = eINSTANCE.getFunction_Sourcecode();

  }

} //Rfsm_hhPackage

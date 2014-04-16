/**
 */
package be.kuleuven.rodinia.model.rfsm;

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
 * @see be.kuleuven.rodinia.model.rfsm.RfsmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.rodinia.model'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Pivot='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RfsmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rfsm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.rodinia.model.rfsm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rfsm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RfsmPackage eINSTANCE = be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.VertexImpl <em>Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.VertexImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getVertex()
   * @generated
   */
  int VERTEX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX__PARENT = 1;

  /**
   * The number of structural features of the '<em>Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.EdgeImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperEdgeImpl <em>Hyper Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.HyperEdgeImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperEdge()
   * @generated
   */
  int HYPER_EDGE = 2;

  /**
   * The feature id for the '<em><b>Vertices</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE__VERTICES = 0;

  /**
   * The number of structural features of the '<em>Hyper Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Hyper Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_EDGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl <em>Hyper Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperVertex()
   * @generated
   */
  int HYPER_VERTEX = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__NAME = VERTEX__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__PARENT = VERTEX__PARENT;

  /**
   * The feature id for the '<em><b>Sub Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX__SUB_VERTICES = VERTEX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hyper Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Is Ancestor</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX = VERTEX_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>LCA</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX___LCA__VERTEX_VERTEX = VERTEX_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Hyper Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_VERTEX_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.GraphEdgeImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getGraphEdge()
   * @generated
   */
  int GRAPH_EDGE = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_EDGE__SOURCE = EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_EDGE__TARGET = EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_EDGE__OWNER = EDGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Graph Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Graph Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperGraphImpl <em>Hyper Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.HyperGraphImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperGraph()
   * @generated
   */
  int HYPER_GRAPH = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__NAME = HYPER_VERTEX__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__PARENT = HYPER_VERTEX__PARENT;

  /**
   * The feature id for the '<em><b>Sub Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__SUB_VERTICES = HYPER_VERTEX__SUB_VERTICES;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH__EDGES = HYPER_VERTEX_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hyper Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH_FEATURE_COUNT = HYPER_VERTEX_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Is Ancestor</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH___IS_ANCESTOR__VERTEX_VERTEX = HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX;

  /**
   * The operation id for the '<em>LCA</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH___LCA__VERTEX_VERTEX = HYPER_VERTEX___LCA__VERTEX_VERTEX;

  /**
   * The number of operations of the '<em>Hyper Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_GRAPH_OPERATION_COUNT = HYPER_VERTEX_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.StateImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getState()
   * @generated
   */
  int STATE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = HYPER_GRAPH__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__PARENT = HYPER_GRAPH__PARENT;

  /**
   * The feature id for the '<em><b>Sub Vertices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SUB_VERTICES = HYPER_GRAPH__SUB_VERTICES;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EDGES = HYPER_GRAPH__EDGES;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY = HYPER_GRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Doo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DOO = HYPER_GRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT = HYPER_GRAPH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = HYPER_GRAPH_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Is Ancestor</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE___IS_ANCESTOR__VERTEX_VERTEX = HYPER_GRAPH___IS_ANCESTOR__VERTEX_VERTEX;

  /**
   * The operation id for the '<em>LCA</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE___LCA__VERTEX_VERTEX = HYPER_GRAPH___LCA__VERTEX_VERTEX;

  /**
   * The number of operations of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OPERATION_COUNT = HYPER_GRAPH_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = VERTEX__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__PARENT = VERTEX__PARENT;

  /**
   * The feature id for the '<em><b>Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__PUBLIC = VERTEX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>History</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__HISTORY = VERTEX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.TransitionImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = GRAPH_EDGE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = GRAPH_EDGE__TARGET;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNER = GRAPH_EDGE__OWNER;

  /**
   * The feature id for the '<em><b>Priority number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__PRIORITY_NUMBER = GRAPH_EDGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENTS = GRAPH_EDGE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = GRAPH_EDGE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EFFECT = GRAPH_EDGE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = GRAPH_EDGE_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OPERATION_COUNT = GRAPH_EDGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.EventImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 9;

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
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.FunctionImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 10;

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
   * The meta object id for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl <em>History</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl
   * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHistory()
   * @generated
   */
  int HISTORY = 11;

  /**
   * The feature id for the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTORY__DEPTH = 0;

  /**
   * The feature id for the '<em><b>Hot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTORY__HOT = 1;

  /**
   * The number of structural features of the '<em>History</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTORY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>History</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTORY_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Vertex <em>Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertex</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Vertex
   * @generated
   */
  EClass getVertex();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.Vertex#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Vertex#getName()
   * @see #getVertex()
   * @generated
   */
  EAttribute getVertex_Name();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.rodinia.model.rfsm.Vertex#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Vertex#getParent()
   * @see #getVertex()
   * @generated
   */
  EReference getVertex_Parent();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.rodinia.model.rfsm.Edge#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Edge#getSource()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Source();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.rodinia.model.rfsm.Edge#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Edge#getTarget()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Target();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.HyperEdge <em>Hyper Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Edge</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperEdge
   * @generated
   */
  EClass getHyperEdge();

  /**
   * Returns the meta object for the reference list '{@link be.kuleuven.rodinia.model.rfsm.HyperEdge#getVertices <em>Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vertices</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperEdge#getVertices()
   * @see #getHyperEdge()
   * @generated
   */
  EReference getHyperEdge_Vertices();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex <em>Hyper Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Vertex</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex
   * @generated
   */
  EClass getHyperVertex();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubVertices <em>Sub Vertices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Vertices</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#getSubVertices()
   * @see #getHyperVertex()
   * @generated
   */
  EReference getHyperVertex_SubVertices();

  /**
   * Returns the meta object for the '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#isAncestor(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex) <em>Is Ancestor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Ancestor</em>' operation.
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#isAncestor(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex)
   * @generated
   */
  EOperation getHyperVertex__IsAncestor__Vertex_Vertex();

  /**
   * Returns the meta object for the '{@link be.kuleuven.rodinia.model.rfsm.HyperVertex#LCA(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex) <em>LCA</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>LCA</em>' operation.
   * @see be.kuleuven.rodinia.model.rfsm.HyperVertex#LCA(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex)
   * @generated
   */
  EOperation getHyperVertex__LCA__Vertex_Vertex();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.GraphEdge <em>Graph Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph Edge</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.GraphEdge
   * @generated
   */
  EClass getGraphEdge();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.GraphEdge#getOwner()
   * @see #getGraphEdge()
   * @generated
   */
  EReference getGraphEdge_Owner();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.HyperGraph <em>Hyper Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Graph</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperGraph
   * @generated
   */
  EClass getHyperGraph();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm.HyperGraph#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.HyperGraph#getEdges()
   * @see #getHyperGraph()
   * @generated
   */
  EReference getHyperGraph_Edges();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.State#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.State#getEntry()
   * @see #getState()
   * @generated
   */
  EReference getState_Entry();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.State#getDoo <em>Doo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doo</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.State#getDoo()
   * @see #getState()
   * @generated
   */
  EReference getState_Doo();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.State#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exit</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.State#getExit()
   * @see #getState()
   * @generated
   */
  EReference getState_Exit();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.Connector#isPublic <em>Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Connector#isPublic()
   * @see #getConnector()
   * @generated
   */
  EAttribute getConnector_Public();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.Connector#getHistory <em>History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>History</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Connector#getHistory()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_History();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.Transition#getPriority_number <em>Priority number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority number</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Transition#getPriority_number()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Priority_number();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.rodinia.model.rfsm.Transition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Transition#getEvents()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Events();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.rodinia.model.rfsm.Transition#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Transition#getEffect()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Effect();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.Event#getEventliteral <em>Eventliteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eventliteral</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Event#getEventliteral()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Eventliteral();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.rodinia.model.rfsm.Event#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Event#getOwner()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Owner();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.Function#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.Function#getSourcecode()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Sourcecode();

  /**
   * Returns the meta object for class '{@link be.kuleuven.rodinia.model.rfsm.History <em>History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>History</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.History
   * @generated
   */
  EClass getHistory();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.History#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depth</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.History#getDepth()
   * @see #getHistory()
   * @generated
   */
  EAttribute getHistory_Depth();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.rodinia.model.rfsm.History#isHot <em>Hot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hot</em>'.
   * @see be.kuleuven.rodinia.model.rfsm.History#isHot()
   * @see #getHistory()
   * @generated
   */
  EAttribute getHistory_Hot();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RfsmFactory getRfsmFactory();

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
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.VertexImpl <em>Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.VertexImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getVertex()
     * @generated
     */
    EClass VERTEX = eINSTANCE.getVertex();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERTEX__NAME = eINSTANCE.getVertex_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTEX__PARENT = eINSTANCE.getVertex_Parent();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.EdgeImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getEdge()
     * @generated
     */
    EClass EDGE = eINSTANCE.getEdge();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperEdgeImpl <em>Hyper Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.HyperEdgeImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperEdge()
     * @generated
     */
    EClass HYPER_EDGE = eINSTANCE.getHyperEdge();

    /**
     * The meta object literal for the '<em><b>Vertices</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_EDGE__VERTICES = eINSTANCE.getHyperEdge_Vertices();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl <em>Hyper Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperVertex()
     * @generated
     */
    EClass HYPER_VERTEX = eINSTANCE.getHyperVertex();

    /**
     * The meta object literal for the '<em><b>Sub Vertices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_VERTEX__SUB_VERTICES = eINSTANCE.getHyperVertex_SubVertices();

    /**
     * The meta object literal for the '<em><b>Is Ancestor</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX = eINSTANCE.getHyperVertex__IsAncestor__Vertex_Vertex();

    /**
     * The meta object literal for the '<em><b>LCA</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation HYPER_VERTEX___LCA__VERTEX_VERTEX = eINSTANCE.getHyperVertex__LCA__Vertex_Vertex();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.GraphEdgeImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getGraphEdge()
     * @generated
     */
    EClass GRAPH_EDGE = eINSTANCE.getGraphEdge();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_EDGE__OWNER = eINSTANCE.getGraphEdge_Owner();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HyperGraphImpl <em>Hyper Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.HyperGraphImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHyperGraph()
     * @generated
     */
    EClass HYPER_GRAPH = eINSTANCE.getHyperGraph();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_GRAPH__EDGES = eINSTANCE.getHyperGraph_Edges();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.StateImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getState()
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
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR__PUBLIC = eINSTANCE.getConnector_Public();

    /**
     * The meta object literal for the '<em><b>History</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__HISTORY = eINSTANCE.getConnector_History();

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.TransitionImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getTransition()
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
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.EventImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getEvent()
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
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.FunctionImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getFunction()
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

    /**
     * The meta object literal for the '{@link be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl <em>History</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl
     * @see be.kuleuven.rodinia.model.rfsm.impl.RfsmPackageImpl#getHistory()
     * @generated
     */
    EClass HISTORY = eINSTANCE.getHistory();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HISTORY__DEPTH = eINSTANCE.getHistory_Depth();

    /**
     * The meta object literal for the '<em><b>Hot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HISTORY__HOT = eINSTANCE.getHistory_Hot();

  }

} //RfsmPackage

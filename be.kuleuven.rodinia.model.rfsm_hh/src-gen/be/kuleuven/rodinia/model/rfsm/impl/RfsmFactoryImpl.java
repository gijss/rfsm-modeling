/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RfsmFactoryImpl extends EFactoryImpl implements RfsmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RfsmFactory init()
  {
    try
    {
      RfsmFactory theRfsmFactory = (RfsmFactory)EPackage.Registry.INSTANCE.getEFactory(RfsmPackage.eNS_URI);
      if (theRfsmFactory != null)
      {
        return theRfsmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RfsmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RfsmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RfsmPackage.VERTEX: return createVertex();
      case RfsmPackage.EDGE: return createEdge();
      case RfsmPackage.HYPER_EDGE: return createHyperEdge();
      case RfsmPackage.HYPER_VERTEX: return createHyperVertex();
      case RfsmPackage.GRAPH_EDGE: return createGraphEdge();
      case RfsmPackage.HYPER_GRAPH: return createHyperGraph();
      case RfsmPackage.STATE: return createState();
      case RfsmPackage.CONNECTOR: return createConnector();
      case RfsmPackage.TRANSITION: return createTransition();
      case RfsmPackage.EVENT: return createEvent();
      case RfsmPackage.FUNCTION: return createFunction();
      case RfsmPackage.HISTORY: return createHistory();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex createVertex()
  {
    VertexImpl vertex = new VertexImpl();
    return vertex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edge createEdge()
  {
    EdgeImpl edge = new EdgeImpl();
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperEdge createHyperEdge()
  {
    HyperEdgeImpl hyperEdge = new HyperEdgeImpl();
    return hyperEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperVertex createHyperVertex()
  {
    HyperVertexImpl hyperVertex = new HyperVertexImpl();
    return hyperVertex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphEdge createGraphEdge()
  {
    GraphEdgeImpl graphEdge = new GraphEdgeImpl();
    return graphEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperGraph createHyperGraph()
  {
    HyperGraphImpl hyperGraph = new HyperGraphImpl();
    return hyperGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public History createHistory()
  {
    HistoryImpl history = new HistoryImpl();
    return history;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RfsmPackage getRfsmPackage()
  {
    return (RfsmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RfsmPackage getPackage()
  {
    return RfsmPackage.eINSTANCE;
  }

} //RfsmFactoryImpl

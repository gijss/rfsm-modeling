/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.impl;

import be.kuleuven.rodinia.model.rfsm_hh.*;

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
public class Rfsm_hhFactoryImpl extends EFactoryImpl implements Rfsm_hhFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Rfsm_hhFactory init()
  {
    try
    {
      Rfsm_hhFactory theRfsm_hhFactory = (Rfsm_hhFactory)EPackage.Registry.INSTANCE.getEFactory(Rfsm_hhPackage.eNS_URI);
      if (theRfsm_hhFactory != null)
      {
        return theRfsm_hhFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Rfsm_hhFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rfsm_hhFactoryImpl()
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
      case Rfsm_hhPackage.HYPER_GRAPH: return createHyperGraph();
      case Rfsm_hhPackage.HYPER_EDGE: return createHyperEdge();
      case Rfsm_hhPackage.HYPER_VERTEX: return createHyperVertex();
      case Rfsm_hhPackage.STATE: return createState();
      case Rfsm_hhPackage.CONNECTOR: return createConnector();
      case Rfsm_hhPackage.TRANSITION: return createTransition();
      case Rfsm_hhPackage.EVENT: return createEvent();
      case Rfsm_hhPackage.FUNCTION: return createFunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public Rfsm_hhPackage getRfsm_hhPackage()
  {
    return (Rfsm_hhPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Rfsm_hhPackage getPackage()
  {
    return Rfsm_hhPackage.eINSTANCE;
  }

} //Rfsm_hhFactoryImpl

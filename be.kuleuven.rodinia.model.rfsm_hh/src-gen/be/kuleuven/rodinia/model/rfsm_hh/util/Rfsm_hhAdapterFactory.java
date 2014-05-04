/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.util;

import be.kuleuven.rodinia.model.rfsm_hh.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage
 * @generated
 */
public class Rfsm_hhAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Rfsm_hhPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rfsm_hhAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Rfsm_hhPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Rfsm_hhSwitch<Adapter> modelSwitch =
    new Rfsm_hhSwitch<Adapter>()
    {
      @Override
      public Adapter caseHyperGraph(HyperGraph object)
      {
        return createHyperGraphAdapter();
      }
      @Override
      public Adapter caseHyperEdge(HyperEdge object)
      {
        return createHyperEdgeAdapter();
      }
      @Override
      public Adapter caseHyperVertex(HyperVertex object)
      {
        return createHyperVertexAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperGraph <em>Hyper Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperGraph
   * @generated
   */
  public Adapter createHyperGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperEdge <em>Hyper Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperEdge
   * @generated
   */
  public Adapter createHyperEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.HyperVertex <em>Hyper Vertex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.HyperVertex
   * @generated
   */
  public Adapter createHyperVertexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.kuleuven.rodinia.model.rfsm_hh.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.kuleuven.rodinia.model.rfsm_hh.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Rfsm_hhAdapterFactory

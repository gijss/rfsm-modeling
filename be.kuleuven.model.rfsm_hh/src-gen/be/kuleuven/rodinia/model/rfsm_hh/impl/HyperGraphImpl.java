/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.impl;

import be.kuleuven.rodinia.model.rfsm_hh.HyperEdge;
import be.kuleuven.rodinia.model.rfsm_hh.HyperGraph;
import be.kuleuven.rodinia.model.rfsm_hh.HyperVertex;
import be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl#getHyperVertices <em>Hyper Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl#getHyperEdges <em>Hyper Edges</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperGraphImpl#getHyperGraphs <em>Hyper Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperGraphImpl extends MinimalEObjectImpl.Container implements HyperGraph
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHyperVertices() <em>Hyper Vertices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHyperVertices()
   * @generated
   * @ordered
   */
  protected EList<HyperVertex> hyperVertices;

  /**
   * The cached value of the '{@link #getHyperEdges() <em>Hyper Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHyperEdges()
   * @generated
   * @ordered
   */
  protected EList<HyperEdge> hyperEdges;

  /**
   * The cached value of the '{@link #getHyperGraphs() <em>Hyper Graphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHyperGraphs()
   * @generated
   * @ordered
   */
  protected EList<HyperGraph> hyperGraphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HyperGraphImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Rfsm_hhPackage.Literals.HYPER_GRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.HYPER_GRAPH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperVertex> getHyperVertices()
  {
    if (hyperVertices == null)
    {
      hyperVertices = new EObjectContainmentEList<HyperVertex>(HyperVertex.class, this, Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES);
    }
    return hyperVertices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperEdge> getHyperEdges()
  {
    if (hyperEdges == null)
    {
      hyperEdges = new EObjectContainmentEList<HyperEdge>(HyperEdge.class, this, Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES);
    }
    return hyperEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperGraph> getHyperGraphs()
  {
    if (hyperGraphs == null)
    {
      hyperGraphs = new EObjectContainmentEList<HyperGraph>(HyperGraph.class, this, Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS);
    }
    return hyperGraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES:
        return ((InternalEList<?>)getHyperVertices()).basicRemove(otherEnd, msgs);
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES:
        return ((InternalEList<?>)getHyperEdges()).basicRemove(otherEnd, msgs);
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS:
        return ((InternalEList<?>)getHyperGraphs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH__NAME:
        return getName();
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES:
        return getHyperVertices();
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES:
        return getHyperEdges();
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS:
        return getHyperGraphs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH__NAME:
        setName((String)newValue);
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES:
        getHyperVertices().clear();
        getHyperVertices().addAll((Collection<? extends HyperVertex>)newValue);
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES:
        getHyperEdges().clear();
        getHyperEdges().addAll((Collection<? extends HyperEdge>)newValue);
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS:
        getHyperGraphs().clear();
        getHyperGraphs().addAll((Collection<? extends HyperGraph>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES:
        getHyperVertices().clear();
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES:
        getHyperEdges().clear();
        return;
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS:
        getHyperGraphs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Rfsm_hhPackage.HYPER_GRAPH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_VERTICES:
        return hyperVertices != null && !hyperVertices.isEmpty();
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_EDGES:
        return hyperEdges != null && !hyperEdges.isEmpty();
      case Rfsm_hhPackage.HYPER_GRAPH__HYPER_GRAPHS:
        return hyperGraphs != null && !hyperGraphs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HyperGraphImpl

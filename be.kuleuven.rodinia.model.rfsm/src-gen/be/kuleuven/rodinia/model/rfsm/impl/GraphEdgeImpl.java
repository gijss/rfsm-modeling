/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.GraphEdge;
import be.kuleuven.rodinia.model.rfsm.HyperGraph;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.GraphEdgeImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphEdgeImpl extends EdgeImpl implements GraphEdge
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphEdgeImpl()
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
    return RfsmPackage.Literals.GRAPH_EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperGraph getOwner()
  {
    if (eContainerFeatureID() != RfsmPackage.GRAPH_EDGE__OWNER) return null;
    return (HyperGraph)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperGraph basicGetOwner()
  {
    if (eContainerFeatureID() != RfsmPackage.GRAPH_EDGE__OWNER) return null;
    return (HyperGraph)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwner(HyperGraph newOwner, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwner, RfsmPackage.GRAPH_EDGE__OWNER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(HyperGraph newOwner)
  {
    if (newOwner != eInternalContainer() || (eContainerFeatureID() != RfsmPackage.GRAPH_EDGE__OWNER && newOwner != null))
    {
      if (EcoreUtil.isAncestor(this, newOwner))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwner != null)
        msgs = ((InternalEObject)newOwner).eInverseAdd(this, RfsmPackage.HYPER_GRAPH__EDGES, HyperGraph.class, msgs);
      msgs = basicSetOwner(newOwner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.GRAPH_EDGE__OWNER, newOwner, newOwner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RfsmPackage.GRAPH_EDGE__OWNER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwner((HyperGraph)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case RfsmPackage.GRAPH_EDGE__OWNER:
        return basicSetOwner(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case RfsmPackage.GRAPH_EDGE__OWNER:
        return eInternalContainer().eInverseRemove(this, RfsmPackage.HYPER_GRAPH__EDGES, HyperGraph.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case RfsmPackage.GRAPH_EDGE__OWNER:
        if (resolve) return getOwner();
        return basicGetOwner();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RfsmPackage.GRAPH_EDGE__OWNER:
        setOwner((HyperGraph)newValue);
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
      case RfsmPackage.GRAPH_EDGE__OWNER:
        setOwner((HyperGraph)null);
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
      case RfsmPackage.GRAPH_EDGE__OWNER:
        return basicGetOwner() != null;
    }
    return super.eIsSet(featureID);
  }

} //GraphEdgeImpl

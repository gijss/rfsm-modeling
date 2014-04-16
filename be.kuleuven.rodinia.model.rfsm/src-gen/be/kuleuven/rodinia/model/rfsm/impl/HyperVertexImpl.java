/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.HyperVertex;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.Vertex;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getSubHyperVertices <em>Sub Hyper Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperVertexImpl extends VertexImpl implements HyperVertex
{
  /**
   * The cached value of the '{@link #getSubHyperVertices() <em>Sub Hyper Vertices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubHyperVertices()
   * @generated
   * @ordered
   */
  protected EList<HyperVertex> subHyperVertices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HyperVertexImpl()
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
    return RfsmPackage.Literals.HYPER_VERTEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperVertex> getSubHyperVertices()
  {
    if (subHyperVertices == null)
    {
      subHyperVertices = new EObjectContainmentWithInverseEList<HyperVertex>(HyperVertex.class, this, RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES, RfsmPackage.HYPER_VERTEX__PARENT);
    }
    return subHyperVertices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperVertex getParent()
  {
    if (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT) return null;
    return (HyperVertex)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperVertex basicGetParent()
  {
    if (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT) return null;
    return (HyperVertex)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(HyperVertex newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, RfsmPackage.HYPER_VERTEX__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(HyperVertex newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES, HyperVertex.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.HYPER_VERTEX__PARENT, newParent, newParent));
  }

  /**
   * The cached invocation delegate for the '{@link #isAncestor(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex) <em>Is Ancestor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAncestor(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex)
   * @generated
   * @ordered
   */
  protected static final EOperation.Internal.InvocationDelegate IS_ANCESTOR_VERTEX_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)RfsmPackage.Literals.HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX).getInvocationDelegate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isAncestor(Vertex one, Vertex two)
  {
    try
    {
      return (Boolean)IS_ANCESTOR_VERTEX_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{one, two}));
    }
    catch (InvocationTargetException ite)
    {
      throw new WrappedException(ite);
    }
  }

  /**
   * The cached invocation delegate for the '{@link #LCA(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex) <em>LCA</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LCA(be.kuleuven.rodinia.model.rfsm.Vertex, be.kuleuven.rodinia.model.rfsm.Vertex)
   * @generated
   * @ordered
   */
  protected static final EOperation.Internal.InvocationDelegate LCA_VERTEX_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)RfsmPackage.Literals.HYPER_VERTEX___LCA__VERTEX_VERTEX).getInvocationDelegate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperVertex LCA(Vertex one, Vertex two)
  {
    try
    {
      return (HyperVertex)LCA_VERTEX_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{one, two}));
    }
    catch (InvocationTargetException ite)
    {
      throw new WrappedException(ite);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubHyperVertices()).basicAdd(otherEnd, msgs);
      case RfsmPackage.HYPER_VERTEX__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((HyperVertex)otherEnd, msgs);
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
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        return ((InternalEList<?>)getSubHyperVertices()).basicRemove(otherEnd, msgs);
      case RfsmPackage.HYPER_VERTEX__PARENT:
        return basicSetParent(null, msgs);
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
      case RfsmPackage.HYPER_VERTEX__PARENT:
        return eInternalContainer().eInverseRemove(this, RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES, HyperVertex.class, msgs);
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
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        return getSubHyperVertices();
      case RfsmPackage.HYPER_VERTEX__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        getSubHyperVertices().clear();
        getSubHyperVertices().addAll((Collection<? extends HyperVertex>)newValue);
        return;
      case RfsmPackage.HYPER_VERTEX__PARENT:
        setParent((HyperVertex)newValue);
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
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        getSubHyperVertices().clear();
        return;
      case RfsmPackage.HYPER_VERTEX__PARENT:
        setParent((HyperVertex)null);
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
      case RfsmPackage.HYPER_VERTEX__SUB_HYPER_VERTICES:
        return subHyperVertices != null && !subHyperVertices.isEmpty();
      case RfsmPackage.HYPER_VERTEX__PARENT:
        return basicGetParent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case RfsmPackage.HYPER_VERTEX___IS_ANCESTOR__VERTEX_VERTEX:
        return isAncestor((Vertex)arguments.get(0), (Vertex)arguments.get(1));
      case RfsmPackage.HYPER_VERTEX___LCA__VERTEX_VERTEX:
        return LCA((Vertex)arguments.get(0), (Vertex)arguments.get(1));
    }
    return super.eInvoke(operationID, arguments);
  }

} //HyperVertexImpl
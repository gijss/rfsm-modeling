/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.HyperGraph;
import be.kuleuven.rodinia.model.rfsm.HyperVertex;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getParentHyperGraph <em>Parent Hyper Graph</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getSubHyperVertices <em>Sub Hyper Vertices</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperVertexImpl extends MinimalEObjectImpl.Container implements HyperVertex
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
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.HYPER_VERTEX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperGraph getParentHyperGraph()
  {
    if (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH) return null;
    return (HyperGraph)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperGraph basicGetParentHyperGraph()
  {
    if (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH) return null;
    return (HyperGraph)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentHyperGraph(HyperGraph newParentHyperGraph, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentHyperGraph, RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentHyperGraph(HyperGraph newParentHyperGraph)
  {
    if (newParentHyperGraph != eInternalContainer() || (eContainerFeatureID() != RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH && newParentHyperGraph != null))
    {
      if (EcoreUtil.isAncestor(this, newParentHyperGraph))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentHyperGraph != null)
        msgs = ((InternalEObject)newParentHyperGraph).eInverseAdd(this, RfsmPackage.HYPER_GRAPH__HYPER_VERTICES, HyperGraph.class, msgs);
      msgs = basicSetParentHyperGraph(newParentHyperGraph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH, newParentHyperGraph, newParentHyperGraph));
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
   * The cached invocation delegate for the '{@link #isAncestor(be.kuleuven.rodinia.model.rfsm.HyperVertex, be.kuleuven.rodinia.model.rfsm.HyperVertex) <em>Is Ancestor</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAncestor(be.kuleuven.rodinia.model.rfsm.HyperVertex, be.kuleuven.rodinia.model.rfsm.HyperVertex)
   * @generated
   * @ordered
   */
  protected static final EOperation.Internal.InvocationDelegate IS_ANCESTOR_HYPER_VERTEX_HYPER_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)RfsmPackage.Literals.HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX).getInvocationDelegate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isAncestor(HyperVertex one, HyperVertex two)
  {
    try
    {
      return (Boolean)IS_ANCESTOR_HYPER_VERTEX_HYPER_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{one, two}));
    }
    catch (InvocationTargetException ite)
    {
      throw new WrappedException(ite);
    }
  }

  /**
   * The cached invocation delegate for the '{@link #LCA(be.kuleuven.rodinia.model.rfsm.HyperVertex, be.kuleuven.rodinia.model.rfsm.HyperVertex) <em>LCA</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LCA(be.kuleuven.rodinia.model.rfsm.HyperVertex, be.kuleuven.rodinia.model.rfsm.HyperVertex)
   * @generated
   * @ordered
   */
  protected static final EOperation.Internal.InvocationDelegate LCA_HYPER_VERTEX_HYPER_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)RfsmPackage.Literals.HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX).getInvocationDelegate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperVertex LCA(HyperVertex one, HyperVertex two)
  {
    try
    {
      return (HyperVertex)LCA_HYPER_VERTEX_HYPER_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{one, two}));
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
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentHyperGraph((HyperGraph)otherEnd, msgs);
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
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        return basicSetParentHyperGraph(null, msgs);
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
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        return eInternalContainer().eInverseRemove(this, RfsmPackage.HYPER_GRAPH__HYPER_VERTICES, HyperGraph.class, msgs);
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
      case RfsmPackage.HYPER_VERTEX__NAME:
        return getName();
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        if (resolve) return getParentHyperGraph();
        return basicGetParentHyperGraph();
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
      case RfsmPackage.HYPER_VERTEX__NAME:
        setName((String)newValue);
        return;
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        setParentHyperGraph((HyperGraph)newValue);
        return;
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
      case RfsmPackage.HYPER_VERTEX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        setParentHyperGraph((HyperGraph)null);
        return;
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
      case RfsmPackage.HYPER_VERTEX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RfsmPackage.HYPER_VERTEX__PARENT_HYPER_GRAPH:
        return basicGetParentHyperGraph() != null;
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
      case RfsmPackage.HYPER_VERTEX___IS_ANCESTOR__HYPERVERTEX_HYPERVERTEX:
        return isAncestor((HyperVertex)arguments.get(0), (HyperVertex)arguments.get(1));
      case RfsmPackage.HYPER_VERTEX___LCA__HYPERVERTEX_HYPERVERTEX:
        return LCA((HyperVertex)arguments.get(0), (HyperVertex)arguments.get(1));
    }
    return super.eInvoke(operationID, arguments);
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

} //HyperVertexImpl

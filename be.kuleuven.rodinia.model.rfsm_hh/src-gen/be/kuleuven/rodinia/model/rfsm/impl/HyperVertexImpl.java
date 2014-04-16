/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.HyperVertex;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.Vertex;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperVertexImpl#getSubVertices <em>Sub Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperVertexImpl extends VertexImpl implements HyperVertex
{
  /**
   * The cached value of the '{@link #getSubVertices() <em>Sub Vertices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubVertices()
   * @generated
   * @ordered
   */
  protected EList<Vertex> subVertices;

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
  public EList<Vertex> getSubVertices()
  {
    if (subVertices == null)
    {
      subVertices = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, RfsmPackage.HYPER_VERTEX__SUB_VERTICES, RfsmPackage.VERTEX__PARENT);
    }
    return subVertices;
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubVertices()).basicAdd(otherEnd, msgs);
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        return ((InternalEList<?>)getSubVertices()).basicRemove(otherEnd, msgs);
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        return getSubVertices();
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        getSubVertices().clear();
        getSubVertices().addAll((Collection<? extends Vertex>)newValue);
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        getSubVertices().clear();
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
      case RfsmPackage.HYPER_VERTEX__SUB_VERTICES:
        return subVertices != null && !subVertices.isEmpty();
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

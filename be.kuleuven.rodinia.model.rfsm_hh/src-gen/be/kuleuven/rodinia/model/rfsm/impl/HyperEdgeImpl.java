/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.HyperEdge;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HyperEdgeImpl#getVertices <em>Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperEdgeImpl extends MinimalEObjectImpl.Container implements HyperEdge
{
  /**
   * The cached value of the '{@link #getVertices() <em>Vertices</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVertices()
   * @generated
   * @ordered
   */
  protected EList<Vertex> vertices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HyperEdgeImpl()
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
    return RfsmPackage.Literals.HYPER_EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Vertex> getVertices()
  {
    if (vertices == null)
    {
      vertices = new EObjectResolvingEList<Vertex>(Vertex.class, this, RfsmPackage.HYPER_EDGE__VERTICES);
    }
    return vertices;
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
      case RfsmPackage.HYPER_EDGE__VERTICES:
        return getVertices();
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
      case RfsmPackage.HYPER_EDGE__VERTICES:
        getVertices().clear();
        getVertices().addAll((Collection<? extends Vertex>)newValue);
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
      case RfsmPackage.HYPER_EDGE__VERTICES:
        getVertices().clear();
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
      case RfsmPackage.HYPER_EDGE__VERTICES:
        return vertices != null && !vertices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HyperEdgeImpl

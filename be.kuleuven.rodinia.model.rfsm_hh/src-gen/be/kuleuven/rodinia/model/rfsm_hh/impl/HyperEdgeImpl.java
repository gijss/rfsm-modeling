/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.impl;

import be.kuleuven.rodinia.model.rfsm_hh.HyperEdge;
import be.kuleuven.rodinia.model.rfsm_hh.HyperVertex;
import be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.HyperEdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperEdgeImpl extends MinimalEObjectImpl.Container implements HyperEdge
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<HyperVertex> source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<HyperVertex> target;

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
    return Rfsm_hhPackage.Literals.HYPER_EDGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.HYPER_EDGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperVertex> getSource()
  {
    if (source == null)
    {
      source = new EObjectResolvingEList<HyperVertex>(HyperVertex.class, this, Rfsm_hhPackage.HYPER_EDGE__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HyperVertex> getTarget()
  {
    if (target == null)
    {
      target = new EObjectResolvingEList<HyperVertex>(HyperVertex.class, this, Rfsm_hhPackage.HYPER_EDGE__TARGET);
    }
    return target;
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
      case Rfsm_hhPackage.HYPER_EDGE__NAME:
        return getName();
      case Rfsm_hhPackage.HYPER_EDGE__SOURCE:
        return getSource();
      case Rfsm_hhPackage.HYPER_EDGE__TARGET:
        return getTarget();
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
      case Rfsm_hhPackage.HYPER_EDGE__NAME:
        setName((String)newValue);
        return;
      case Rfsm_hhPackage.HYPER_EDGE__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends HyperVertex>)newValue);
        return;
      case Rfsm_hhPackage.HYPER_EDGE__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends HyperVertex>)newValue);
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
      case Rfsm_hhPackage.HYPER_EDGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Rfsm_hhPackage.HYPER_EDGE__SOURCE:
        getSource().clear();
        return;
      case Rfsm_hhPackage.HYPER_EDGE__TARGET:
        getTarget().clear();
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
      case Rfsm_hhPackage.HYPER_EDGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Rfsm_hhPackage.HYPER_EDGE__SOURCE:
        return source != null && !source.isEmpty();
      case Rfsm_hhPackage.HYPER_EDGE__TARGET:
        return target != null && !target.isEmpty();
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

} //HyperEdgeImpl

/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.History;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.HistoryImpl#isHot <em>Hot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryImpl extends MinimalEObjectImpl.Container implements History
{
  /**
   * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected static final int DEPTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected int depth = DEPTH_EDEFAULT;

  /**
   * The default value of the '{@link #isHot() <em>Hot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHot()
   * @generated
   * @ordered
   */
  protected static final boolean HOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHot() <em>Hot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHot()
   * @generated
   * @ordered
   */
  protected boolean hot = HOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HistoryImpl()
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
    return RfsmPackage.Literals.HISTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDepth()
  {
    return depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepth(int newDepth)
  {
    int oldDepth = depth;
    depth = newDepth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.HISTORY__DEPTH, oldDepth, depth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHot()
  {
    return hot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHot(boolean newHot)
  {
    boolean oldHot = hot;
    hot = newHot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.HISTORY__HOT, oldHot, hot));
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
      case RfsmPackage.HISTORY__DEPTH:
        return getDepth();
      case RfsmPackage.HISTORY__HOT:
        return isHot();
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
      case RfsmPackage.HISTORY__DEPTH:
        setDepth((Integer)newValue);
        return;
      case RfsmPackage.HISTORY__HOT:
        setHot((Boolean)newValue);
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
      case RfsmPackage.HISTORY__DEPTH:
        setDepth(DEPTH_EDEFAULT);
        return;
      case RfsmPackage.HISTORY__HOT:
        setHot(HOT_EDEFAULT);
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
      case RfsmPackage.HISTORY__DEPTH:
        return depth != DEPTH_EDEFAULT;
      case RfsmPackage.HISTORY__HOT:
        return hot != HOT_EDEFAULT;
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
    result.append(" (depth: ");
    result.append(depth);
    result.append(", hot: ");
    result.append(hot);
    result.append(')');
    return result.toString();
  }

} //HistoryImpl

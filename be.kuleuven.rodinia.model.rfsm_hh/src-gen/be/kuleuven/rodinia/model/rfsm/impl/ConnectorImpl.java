/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.Connector;
import be.kuleuven.rodinia.model.rfsm.History;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.ConnectorImpl#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends VertexImpl implements Connector
{
  /**
   * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPublic()
   * @generated
   * @ordered
   */
  protected static final boolean PUBLIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPublic()
   * @generated
   * @ordered
   */
  protected boolean public_ = PUBLIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHistory()
   * @generated
   * @ordered
   */
  protected History history;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectorImpl()
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
    return RfsmPackage.Literals.CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPublic()
  {
    return public_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublic(boolean newPublic)
  {
    boolean oldPublic = public_;
    public_ = newPublic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.CONNECTOR__PUBLIC, oldPublic, public_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public History getHistory()
  {
    return history;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHistory(History newHistory, NotificationChain msgs)
  {
    History oldHistory = history;
    history = newHistory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RfsmPackage.CONNECTOR__HISTORY, oldHistory, newHistory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHistory(History newHistory)
  {
    if (newHistory != history)
    {
      NotificationChain msgs = null;
      if (history != null)
        msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RfsmPackage.CONNECTOR__HISTORY, null, msgs);
      if (newHistory != null)
        msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RfsmPackage.CONNECTOR__HISTORY, null, msgs);
      msgs = basicSetHistory(newHistory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.CONNECTOR__HISTORY, newHistory, newHistory));
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
      case RfsmPackage.CONNECTOR__HISTORY:
        return basicSetHistory(null, msgs);
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
      case RfsmPackage.CONNECTOR__PUBLIC:
        return isPublic();
      case RfsmPackage.CONNECTOR__HISTORY:
        return getHistory();
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
      case RfsmPackage.CONNECTOR__PUBLIC:
        setPublic((Boolean)newValue);
        return;
      case RfsmPackage.CONNECTOR__HISTORY:
        setHistory((History)newValue);
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
      case RfsmPackage.CONNECTOR__PUBLIC:
        setPublic(PUBLIC_EDEFAULT);
        return;
      case RfsmPackage.CONNECTOR__HISTORY:
        setHistory((History)null);
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
      case RfsmPackage.CONNECTOR__PUBLIC:
        return public_ != PUBLIC_EDEFAULT;
      case RfsmPackage.CONNECTOR__HISTORY:
        return history != null;
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
    result.append(" (public: ");
    result.append(public_);
    result.append(')');
    return result.toString();
  }

} //ConnectorImpl

/**
 */
package be.kuleuven.rodinia.model.rfsm.impl;

import be.kuleuven.rodinia.model.rfsm.Event;
import be.kuleuven.rodinia.model.rfsm.RfsmPackage;
import be.kuleuven.rodinia.model.rfsm.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.EventImpl#getEventliteral <em>Eventliteral</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm.impl.EventImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The default value of the '{@link #getEventliteral() <em>Eventliteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventliteral()
   * @generated
   * @ordered
   */
  protected static final String EVENTLITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventliteral() <em>Eventliteral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventliteral()
   * @generated
   * @ordered
   */
  protected String eventliteral = EVENTLITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return RfsmPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventliteral()
  {
    return eventliteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventliteral(String newEventliteral)
  {
    String oldEventliteral = eventliteral;
    eventliteral = newEventliteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.EVENT__EVENTLITERAL, oldEventliteral, eventliteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition getOwner()
  {
    if (eContainerFeatureID() != RfsmPackage.EVENT__OWNER) return null;
    return (Transition)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition basicGetOwner()
  {
    if (eContainerFeatureID() != RfsmPackage.EVENT__OWNER) return null;
    return (Transition)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwner(Transition newOwner, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwner, RfsmPackage.EVENT__OWNER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(Transition newOwner)
  {
    if (newOwner != eInternalContainer() || (eContainerFeatureID() != RfsmPackage.EVENT__OWNER && newOwner != null))
    {
      if (EcoreUtil.isAncestor(this, newOwner))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwner != null)
        msgs = ((InternalEObject)newOwner).eInverseAdd(this, RfsmPackage.TRANSITION__EVENTS, Transition.class, msgs);
      msgs = basicSetOwner(newOwner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.EVENT__OWNER, newOwner, newOwner));
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
      case RfsmPackage.EVENT__OWNER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwner((Transition)otherEnd, msgs);
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
      case RfsmPackage.EVENT__OWNER:
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
      case RfsmPackage.EVENT__OWNER:
        return eInternalContainer().eInverseRemove(this, RfsmPackage.TRANSITION__EVENTS, Transition.class, msgs);
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
      case RfsmPackage.EVENT__EVENTLITERAL:
        return getEventliteral();
      case RfsmPackage.EVENT__OWNER:
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
      case RfsmPackage.EVENT__EVENTLITERAL:
        setEventliteral((String)newValue);
        return;
      case RfsmPackage.EVENT__OWNER:
        setOwner((Transition)newValue);
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
      case RfsmPackage.EVENT__EVENTLITERAL:
        setEventliteral(EVENTLITERAL_EDEFAULT);
        return;
      case RfsmPackage.EVENT__OWNER:
        setOwner((Transition)null);
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
      case RfsmPackage.EVENT__EVENTLITERAL:
        return EVENTLITERAL_EDEFAULT == null ? eventliteral != null : !EVENTLITERAL_EDEFAULT.equals(eventliteral);
      case RfsmPackage.EVENT__OWNER:
        return basicGetOwner() != null;
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
    result.append(" (eventliteral: ");
    result.append(eventliteral);
    result.append(')');
    return result.toString();
  }

} //EventImpl

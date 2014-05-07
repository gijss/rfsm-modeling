/**
 */
package be.kuleuven.model.rfsm.impl;

import be.kuleuven.model.rfsm.Event;
import be.kuleuven.model.rfsm.RfsmPackage;
import be.kuleuven.model.rfsm.State;
import be.kuleuven.model.rfsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.TransitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.TransitionImpl#getPriorityNumber <em>Priority Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
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
  protected EList<State> source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<State> target;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The default value of the '{@link #getPriorityNumber() <em>Priority Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriorityNumber()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriorityNumber() <em>Priority Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriorityNumber()
   * @generated
   * @ordered
   */
  protected int priorityNumber = PRIORITY_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return RfsmPackage.Literals.TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getSource()
  {
    if (source == null)
    {
      source = new EObjectResolvingEList<State>(State.class, this, RfsmPackage.TRANSITION__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getTarget()
  {
    if (target == null)
    {
      target = new EObjectResolvingEList<State>(State.class, this, RfsmPackage.TRANSITION__TARGET);
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, RfsmPackage.TRANSITION__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriorityNumber()
  {
    return priorityNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriorityNumber(int newPriorityNumber)
  {
    int oldPriorityNumber = priorityNumber;
    priorityNumber = newPriorityNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.TRANSITION__PRIORITY_NUMBER, oldPriorityNumber, priorityNumber));
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
      case RfsmPackage.TRANSITION__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
      case RfsmPackage.TRANSITION__NAME:
        return getName();
      case RfsmPackage.TRANSITION__SOURCE:
        return getSource();
      case RfsmPackage.TRANSITION__TARGET:
        return getTarget();
      case RfsmPackage.TRANSITION__EVENTS:
        return getEvents();
      case RfsmPackage.TRANSITION__PRIORITY_NUMBER:
        return getPriorityNumber();
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
      case RfsmPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case RfsmPackage.TRANSITION__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends State>)newValue);
        return;
      case RfsmPackage.TRANSITION__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends State>)newValue);
        return;
      case RfsmPackage.TRANSITION__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case RfsmPackage.TRANSITION__PRIORITY_NUMBER:
        setPriorityNumber((Integer)newValue);
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
      case RfsmPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RfsmPackage.TRANSITION__SOURCE:
        getSource().clear();
        return;
      case RfsmPackage.TRANSITION__TARGET:
        getTarget().clear();
        return;
      case RfsmPackage.TRANSITION__EVENTS:
        getEvents().clear();
        return;
      case RfsmPackage.TRANSITION__PRIORITY_NUMBER:
        setPriorityNumber(PRIORITY_NUMBER_EDEFAULT);
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
      case RfsmPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RfsmPackage.TRANSITION__SOURCE:
        return source != null && !source.isEmpty();
      case RfsmPackage.TRANSITION__TARGET:
        return target != null && !target.isEmpty();
      case RfsmPackage.TRANSITION__EVENTS:
        return events != null && !events.isEmpty();
      case RfsmPackage.TRANSITION__PRIORITY_NUMBER:
        return priorityNumber != PRIORITY_NUMBER_EDEFAULT;
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
    result.append(", priorityNumber: ");
    result.append(priorityNumber);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl

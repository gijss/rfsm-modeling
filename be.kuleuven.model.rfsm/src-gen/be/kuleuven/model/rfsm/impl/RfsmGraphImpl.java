/**
 */
package be.kuleuven.model.rfsm.impl;

import be.kuleuven.model.rfsm.RfsmGraph;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.model.rfsm.impl.RfsmGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.RfsmGraphImpl#getRootState <em>Root State</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.RfsmGraphImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link be.kuleuven.model.rfsm.impl.RfsmGraphImpl#getRfmsGraphs <em>Rfms Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RfsmGraphImpl extends MinimalEObjectImpl.Container implements RfsmGraph
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
   * The cached value of the '{@link #getRootState() <em>Root State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootState()
   * @generated
   * @ordered
   */
  protected State rootState;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * The cached value of the '{@link #getRfmsGraphs() <em>Rfms Graphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRfmsGraphs()
   * @generated
   * @ordered
   */
  protected EList<RfsmGraph> rfmsGraphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RfsmGraphImpl()
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
    return RfsmPackage.Literals.RFSM_GRAPH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.RFSM_GRAPH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getRootState()
  {
    return rootState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootState(State newRootState, NotificationChain msgs)
  {
    State oldRootState = rootState;
    rootState = newRootState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RfsmPackage.RFSM_GRAPH__ROOT_STATE, oldRootState, newRootState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootState(State newRootState)
  {
    if (newRootState != rootState)
    {
      NotificationChain msgs = null;
      if (rootState != null)
        msgs = ((InternalEObject)rootState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RfsmPackage.RFSM_GRAPH__ROOT_STATE, null, msgs);
      if (newRootState != null)
        msgs = ((InternalEObject)newRootState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RfsmPackage.RFSM_GRAPH__ROOT_STATE, null, msgs);
      msgs = basicSetRootState(newRootState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RfsmPackage.RFSM_GRAPH__ROOT_STATE, newRootState, newRootState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, RfsmPackage.RFSM_GRAPH__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RfsmGraph> getRfmsGraphs()
  {
    if (rfmsGraphs == null)
    {
      rfmsGraphs = new EObjectContainmentEList<RfsmGraph>(RfsmGraph.class, this, RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS);
    }
    return rfmsGraphs;
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
      case RfsmPackage.RFSM_GRAPH__ROOT_STATE:
        return basicSetRootState(null, msgs);
      case RfsmPackage.RFSM_GRAPH__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
      case RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS:
        return ((InternalEList<?>)getRfmsGraphs()).basicRemove(otherEnd, msgs);
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
      case RfsmPackage.RFSM_GRAPH__NAME:
        return getName();
      case RfsmPackage.RFSM_GRAPH__ROOT_STATE:
        return getRootState();
      case RfsmPackage.RFSM_GRAPH__TRANSITIONS:
        return getTransitions();
      case RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS:
        return getRfmsGraphs();
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
      case RfsmPackage.RFSM_GRAPH__NAME:
        setName((String)newValue);
        return;
      case RfsmPackage.RFSM_GRAPH__ROOT_STATE:
        setRootState((State)newValue);
        return;
      case RfsmPackage.RFSM_GRAPH__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS:
        getRfmsGraphs().clear();
        getRfmsGraphs().addAll((Collection<? extends RfsmGraph>)newValue);
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
      case RfsmPackage.RFSM_GRAPH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RfsmPackage.RFSM_GRAPH__ROOT_STATE:
        setRootState((State)null);
        return;
      case RfsmPackage.RFSM_GRAPH__TRANSITIONS:
        getTransitions().clear();
        return;
      case RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS:
        getRfmsGraphs().clear();
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
      case RfsmPackage.RFSM_GRAPH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RfsmPackage.RFSM_GRAPH__ROOT_STATE:
        return rootState != null;
      case RfsmPackage.RFSM_GRAPH__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case RfsmPackage.RFSM_GRAPH__RFMS_GRAPHS:
        return rfmsGraphs != null && !rfmsGraphs.isEmpty();
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

} //RfsmGraphImpl

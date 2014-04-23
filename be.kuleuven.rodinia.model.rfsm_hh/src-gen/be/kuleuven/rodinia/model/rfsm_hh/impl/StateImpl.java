/**
 */
package be.kuleuven.rodinia.model.rfsm_hh.impl;

import be.kuleuven.rodinia.model.rfsm_hh.Function;
import be.kuleuven.rodinia.model.rfsm_hh.Rfsm_hhPackage;
import be.kuleuven.rodinia.model.rfsm_hh.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl#getDoo <em>Doo</em>}</li>
 *   <li>{@link be.kuleuven.rodinia.model.rfsm_hh.impl.StateImpl#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends HyperVertexImpl implements State
{
  /**
   * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected Function entry;

  /**
   * The cached value of the '{@link #getDoo() <em>Doo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoo()
   * @generated
   * @ordered
   */
  protected Function doo;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected Function exit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return Rfsm_hhPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntry(Function newEntry, NotificationChain msgs)
  {
    Function oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__ENTRY, oldEntry, newEntry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntry(Function newEntry)
  {
    if (newEntry != entry)
    {
      NotificationChain msgs = null;
      if (entry != null)
        msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__ENTRY, null, msgs);
      if (newEntry != null)
        msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__ENTRY, null, msgs);
      msgs = basicSetEntry(newEntry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__ENTRY, newEntry, newEntry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getDoo()
  {
    return doo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoo(Function newDoo, NotificationChain msgs)
  {
    Function oldDoo = doo;
    doo = newDoo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__DOO, oldDoo, newDoo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoo(Function newDoo)
  {
    if (newDoo != doo)
    {
      NotificationChain msgs = null;
      if (doo != null)
        msgs = ((InternalEObject)doo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__DOO, null, msgs);
      if (newDoo != null)
        msgs = ((InternalEObject)newDoo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__DOO, null, msgs);
      msgs = basicSetDoo(newDoo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__DOO, newDoo, newDoo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExit(Function newExit, NotificationChain msgs)
  {
    Function oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__EXIT, oldExit, newExit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExit(Function newExit)
  {
    if (newExit != exit)
    {
      NotificationChain msgs = null;
      if (exit != null)
        msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__EXIT, null, msgs);
      if (newExit != null)
        msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Rfsm_hhPackage.STATE__EXIT, null, msgs);
      msgs = basicSetExit(newExit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Rfsm_hhPackage.STATE__EXIT, newExit, newExit));
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
      case Rfsm_hhPackage.STATE__ENTRY:
        return basicSetEntry(null, msgs);
      case Rfsm_hhPackage.STATE__DOO:
        return basicSetDoo(null, msgs);
      case Rfsm_hhPackage.STATE__EXIT:
        return basicSetExit(null, msgs);
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
      case Rfsm_hhPackage.STATE__ENTRY:
        return getEntry();
      case Rfsm_hhPackage.STATE__DOO:
        return getDoo();
      case Rfsm_hhPackage.STATE__EXIT:
        return getExit();
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
      case Rfsm_hhPackage.STATE__ENTRY:
        setEntry((Function)newValue);
        return;
      case Rfsm_hhPackage.STATE__DOO:
        setDoo((Function)newValue);
        return;
      case Rfsm_hhPackage.STATE__EXIT:
        setExit((Function)newValue);
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
      case Rfsm_hhPackage.STATE__ENTRY:
        setEntry((Function)null);
        return;
      case Rfsm_hhPackage.STATE__DOO:
        setDoo((Function)null);
        return;
      case Rfsm_hhPackage.STATE__EXIT:
        setExit((Function)null);
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
      case Rfsm_hhPackage.STATE__ENTRY:
        return entry != null;
      case Rfsm_hhPackage.STATE__DOO:
        return doo != null;
      case Rfsm_hhPackage.STATE__EXIT:
        return exit != null;
    }
    return super.eIsSet(featureID);
  }

} //StateImpl

/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;

import eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl#getContext <em>Context</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationMeasurementImpl extends MeasurementImpl implements ApplicationMeasurement
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected NamedElement context;

  /**
   * The cached value of the '{@link #getWorkload() <em>Workload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkload()
   * @generated
   * @ordered
   */
  protected Workload workload;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMeasurementImpl()
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
    return PmlPackage.Literals.APPLICATION_MEASUREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (NamedElement)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmlPackage.APPLICATION_MEASUREMENT__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(NamedElement newContext)
  {
    NamedElement oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.APPLICATION_MEASUREMENT__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workload getWorkload()
  {
    return workload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkload(Workload newWorkload, NotificationChain msgs)
  {
    Workload oldWorkload = workload;
    workload = newWorkload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD, oldWorkload, newWorkload);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkload(Workload newWorkload)
  {
    if (newWorkload != workload)
    {
      NotificationChain msgs = null;
      if (workload != null)
        msgs = ((InternalEObject)workload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD, null, msgs);
      if (newWorkload != null)
        msgs = ((InternalEObject)newWorkload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD, null, msgs);
      msgs = basicSetWorkload(newWorkload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD, newWorkload, newWorkload));
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
      case PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD:
        return basicSetWorkload(null, msgs);
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
      case PmlPackage.APPLICATION_MEASUREMENT__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD:
        return getWorkload();
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
      case PmlPackage.APPLICATION_MEASUREMENT__CONTEXT:
        setContext((NamedElement)newValue);
        return;
      case PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD:
        setWorkload((Workload)newValue);
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
      case PmlPackage.APPLICATION_MEASUREMENT__CONTEXT:
        setContext((NamedElement)null);
        return;
      case PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD:
        setWorkload((Workload)null);
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
      case PmlPackage.APPLICATION_MEASUREMENT__CONTEXT:
        return context != null;
      case PmlPackage.APPLICATION_MEASUREMENT__WORKLOAD:
        return workload != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationMeasurementImpl

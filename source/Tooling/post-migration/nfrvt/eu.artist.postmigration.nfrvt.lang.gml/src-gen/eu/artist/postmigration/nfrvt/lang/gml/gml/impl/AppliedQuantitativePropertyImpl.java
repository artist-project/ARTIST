/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Quantitative Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppliedQuantitativePropertyImpl extends AppliedPropertyImpl implements AppliedQuantitativeProperty
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected QuantitativeProperty property;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Operator function;

  /**
   * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference.
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
  protected AppliedQuantitativePropertyImpl()
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
    return GmlPackage.Literals.APPLIED_QUANTITATIVE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantitativeProperty getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (QuantitativeProperty)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantitativeProperty basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(QuantitativeProperty newProperty)
  {
    QuantitativeProperty oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(Operator newFunction, NotificationChain msgs)
  {
    Operator oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(Operator newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workload getWorkload()
  {
    if (workload != null && workload.eIsProxy())
    {
      InternalEObject oldWorkload = (InternalEObject)workload;
      workload = (Workload)eResolveProxy(oldWorkload);
      if (workload != oldWorkload)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD, oldWorkload, workload));
      }
    }
    return workload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workload basicGetWorkload()
  {
    return workload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkload(Workload newWorkload)
  {
    Workload oldWorkload = workload;
    workload = newWorkload;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD, oldWorkload, workload));
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
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION:
        return basicSetFunction(null, msgs);
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
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION:
        return getFunction();
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD:
        if (resolve) return getWorkload();
        return basicGetWorkload();
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
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY:
        setProperty((QuantitativeProperty)newValue);
        return;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION:
        setFunction((Operator)newValue);
        return;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD:
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
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY:
        setProperty((QuantitativeProperty)null);
        return;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION:
        setFunction((Operator)null);
        return;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD:
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
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__PROPERTY:
        return property != null;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__FUNCTION:
        return function != null;
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD:
        return workload != null;
    }
    return super.eIsSet(featureID);
  }

} //AppliedQuantitativePropertyImpl

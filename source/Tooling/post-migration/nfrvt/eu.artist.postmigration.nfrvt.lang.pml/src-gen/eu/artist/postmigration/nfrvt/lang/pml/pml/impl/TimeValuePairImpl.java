/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeValuePairImpl extends MinimalEObjectImpl.Container implements TimeValuePair
{
  /**
   * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateTime()
   * @generated
   * @ordered
   */
  protected static final Date DATE_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateTime()
   * @generated
   * @ordered
   */
  protected Date dateTime = DATE_TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValueSpecification value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeValuePairImpl()
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
    return PmlPackage.Literals.TIME_VALUE_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDateTime()
  {
    return dateTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateTime(Date newDateTime)
  {
    Date oldDateTime = dateTime;
    dateTime = newDateTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.TIME_VALUE_PAIR__DATE_TIME, oldDateTime, dateTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ValueSpecification newValue, NotificationChain msgs)
  {
    ValueSpecification oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmlPackage.TIME_VALUE_PAIR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueSpecification newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmlPackage.TIME_VALUE_PAIR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmlPackage.TIME_VALUE_PAIR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.TIME_VALUE_PAIR__VALUE, newValue, newValue));
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
      case PmlPackage.TIME_VALUE_PAIR__VALUE:
        return basicSetValue(null, msgs);
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
      case PmlPackage.TIME_VALUE_PAIR__DATE_TIME:
        return getDateTime();
      case PmlPackage.TIME_VALUE_PAIR__VALUE:
        return getValue();
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
      case PmlPackage.TIME_VALUE_PAIR__DATE_TIME:
        setDateTime((Date)newValue);
        return;
      case PmlPackage.TIME_VALUE_PAIR__VALUE:
        setValue((ValueSpecification)newValue);
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
      case PmlPackage.TIME_VALUE_PAIR__DATE_TIME:
        setDateTime(DATE_TIME_EDEFAULT);
        return;
      case PmlPackage.TIME_VALUE_PAIR__VALUE:
        setValue((ValueSpecification)null);
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
      case PmlPackage.TIME_VALUE_PAIR__DATE_TIME:
        return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
      case PmlPackage.TIME_VALUE_PAIR__VALUE:
        return value != null;
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
    result.append(" (dateTime: ");
    result.append(dateTime);
    result.append(')');
    return result.toString();
  }

} //TimeValuePairImpl

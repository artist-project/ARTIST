/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends MinimalEObjectImpl.Container implements Observation
{
  /**
   * The default value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolName()
   * @generated
   * @ordered
   */
  protected static final String TOOL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToolName()
   * @generated
   * @ordered
   */
  protected String toolName = TOOL_NAME_EDEFAULT;

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
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final String LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected String level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementType()
   * @generated
   * @ordered
   */
  protected static final String MEASUREMENT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementType()
   * @generated
   * @ordered
   */
  protected String measurementType = MEASUREMENT_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurements()
   * @generated
   * @ordered
   */
  protected EList<Measurement> measurements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObservationImpl()
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
    return PmlPackage.Literals.OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToolName()
  {
    return toolName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToolName(String newToolName)
  {
    String oldToolName = toolName;
    toolName = newToolName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.OBSERVATION__TOOL_NAME, oldToolName, toolName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.OBSERVATION__DATE_TIME, oldDateTime, dateTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(String newLevel)
  {
    String oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.OBSERVATION__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMeasurementType()
  {
    return measurementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasurementType(String newMeasurementType)
  {
    String oldMeasurementType = measurementType;
    measurementType = newMeasurementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.OBSERVATION__MEASUREMENT_TYPE, oldMeasurementType, measurementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Measurement> getMeasurements()
  {
    if (measurements == null)
    {
      measurements = new EObjectContainmentEList<Measurement>(Measurement.class, this, PmlPackage.OBSERVATION__MEASUREMENTS);
    }
    return measurements;
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
      case PmlPackage.OBSERVATION__MEASUREMENTS:
        return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
      case PmlPackage.OBSERVATION__TOOL_NAME:
        return getToolName();
      case PmlPackage.OBSERVATION__DATE_TIME:
        return getDateTime();
      case PmlPackage.OBSERVATION__LEVEL:
        return getLevel();
      case PmlPackage.OBSERVATION__MEASUREMENT_TYPE:
        return getMeasurementType();
      case PmlPackage.OBSERVATION__MEASUREMENTS:
        return getMeasurements();
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
      case PmlPackage.OBSERVATION__TOOL_NAME:
        setToolName((String)newValue);
        return;
      case PmlPackage.OBSERVATION__DATE_TIME:
        setDateTime((Date)newValue);
        return;
      case PmlPackage.OBSERVATION__LEVEL:
        setLevel((String)newValue);
        return;
      case PmlPackage.OBSERVATION__MEASUREMENT_TYPE:
        setMeasurementType((String)newValue);
        return;
      case PmlPackage.OBSERVATION__MEASUREMENTS:
        getMeasurements().clear();
        getMeasurements().addAll((Collection<? extends Measurement>)newValue);
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
      case PmlPackage.OBSERVATION__TOOL_NAME:
        setToolName(TOOL_NAME_EDEFAULT);
        return;
      case PmlPackage.OBSERVATION__DATE_TIME:
        setDateTime(DATE_TIME_EDEFAULT);
        return;
      case PmlPackage.OBSERVATION__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case PmlPackage.OBSERVATION__MEASUREMENT_TYPE:
        setMeasurementType(MEASUREMENT_TYPE_EDEFAULT);
        return;
      case PmlPackage.OBSERVATION__MEASUREMENTS:
        getMeasurements().clear();
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
      case PmlPackage.OBSERVATION__TOOL_NAME:
        return TOOL_NAME_EDEFAULT == null ? toolName != null : !TOOL_NAME_EDEFAULT.equals(toolName);
      case PmlPackage.OBSERVATION__DATE_TIME:
        return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
      case PmlPackage.OBSERVATION__LEVEL:
        return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
      case PmlPackage.OBSERVATION__MEASUREMENT_TYPE:
        return MEASUREMENT_TYPE_EDEFAULT == null ? measurementType != null : !MEASUREMENT_TYPE_EDEFAULT.equals(measurementType);
      case PmlPackage.OBSERVATION__MEASUREMENTS:
        return measurements != null && !measurements.isEmpty();
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
    result.append(" (toolName: ");
    result.append(toolName);
    result.append(", dateTime: ");
    result.append(dateTime);
    result.append(", level: ");
    result.append(level);
    result.append(", measurementType: ");
    result.append(measurementType);
    result.append(')');
    return result.toString();
  }

} //ObservationImpl

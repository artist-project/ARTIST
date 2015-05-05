/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends MinimalEObjectImpl.Container implements Measurement
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
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected QuantitativeProperty property;

  /**
   * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfidence()
   * @generated
   * @ordered
   */
  protected static final BigDecimal CONFIDENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfidence()
   * @generated
   * @ordered
   */
  protected BigDecimal confidence = CONFIDENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected static final String INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected String info = INFO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementImpl()
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
    return PmlPackage.Literals.MEASUREMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.MEASUREMENT__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmlPackage.MEASUREMENT__PROPERTY, oldProperty, property));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.MEASUREMENT__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getConfidence()
  {
    return confidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfidence(BigDecimal newConfidence)
  {
    BigDecimal oldConfidence = confidence;
    confidence = newConfidence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.MEASUREMENT__CONFIDENCE, oldConfidence, confidence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfo()
  {
    return info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfo(String newInfo)
  {
    String oldInfo = info;
    info = newInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmlPackage.MEASUREMENT__INFO, oldInfo, info));
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
      case PmlPackage.MEASUREMENT__NAME:
        return getName();
      case PmlPackage.MEASUREMENT__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case PmlPackage.MEASUREMENT__CONFIDENCE:
        return getConfidence();
      case PmlPackage.MEASUREMENT__INFO:
        return getInfo();
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
      case PmlPackage.MEASUREMENT__NAME:
        setName((String)newValue);
        return;
      case PmlPackage.MEASUREMENT__PROPERTY:
        setProperty((QuantitativeProperty)newValue);
        return;
      case PmlPackage.MEASUREMENT__CONFIDENCE:
        setConfidence((BigDecimal)newValue);
        return;
      case PmlPackage.MEASUREMENT__INFO:
        setInfo((String)newValue);
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
      case PmlPackage.MEASUREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PmlPackage.MEASUREMENT__PROPERTY:
        setProperty((QuantitativeProperty)null);
        return;
      case PmlPackage.MEASUREMENT__CONFIDENCE:
        setConfidence(CONFIDENCE_EDEFAULT);
        return;
      case PmlPackage.MEASUREMENT__INFO:
        setInfo(INFO_EDEFAULT);
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
      case PmlPackage.MEASUREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PmlPackage.MEASUREMENT__PROPERTY:
        return property != null;
      case PmlPackage.MEASUREMENT__CONFIDENCE:
        return CONFIDENCE_EDEFAULT == null ? confidence != null : !CONFIDENCE_EDEFAULT.equals(confidence);
      case PmlPackage.MEASUREMENT__INFO:
        return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
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
    result.append(", confidence: ");
    result.append(confidence);
    result.append(", info: ");
    result.append(info);
    result.append(')');
    return result.toString();
  }

} //MeasurementImpl

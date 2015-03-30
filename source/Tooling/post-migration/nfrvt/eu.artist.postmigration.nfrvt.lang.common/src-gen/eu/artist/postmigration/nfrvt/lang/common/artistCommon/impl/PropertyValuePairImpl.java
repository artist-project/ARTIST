/**
 */
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyValuePairImpl extends MinimalEObjectImpl.Container implements PropertyValuePair
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

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
  protected PropertyValuePairImpl()
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
    return ArtistCommonPackage.Literals.PROPERTY_VALUE_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Property)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY, oldProperty, property));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE, newValue, newValue));
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
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE:
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
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE:
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
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY:
        setProperty((Property)newValue);
        return;
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE:
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
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY:
        setProperty((Property)null);
        return;
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE:
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
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__PROPERTY:
        return property != null;
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyValuePairImpl

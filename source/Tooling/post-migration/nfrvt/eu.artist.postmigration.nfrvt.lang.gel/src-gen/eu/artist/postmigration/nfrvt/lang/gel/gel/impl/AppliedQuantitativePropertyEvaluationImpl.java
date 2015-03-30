/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;

import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Quantitative Property Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppliedQuantitativePropertyEvaluationImpl extends AppliedPropertyEvaluationImpl implements AppliedQuantitativePropertyEvaluation
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected AppliedQuantitativeProperty property;

  /**
   * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
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
  protected AppliedQuantitativePropertyEvaluationImpl()
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
    return GelPackage.Literals.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQuantitativeProperty getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (AppliedQuantitativeProperty)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQuantitativeProperty basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(AppliedQuantitativeProperty newProperty)
  {
    AppliedQuantitativeProperty oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY, oldProperty, property));
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
      measurements = new EObjectResolvingEList<Measurement>(Measurement.class, this, GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__MEASUREMENTS);
    }
    return measurements;
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
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__MEASUREMENTS:
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
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY:
        setProperty((AppliedQuantitativeProperty)newValue);
        return;
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__MEASUREMENTS:
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
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY:
        setProperty((AppliedQuantitativeProperty)null);
        return;
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__MEASUREMENTS:
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
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY:
        return property != null;
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__MEASUREMENTS:
        return measurements != null && !measurements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AppliedQuantitativePropertyEvaluationImpl

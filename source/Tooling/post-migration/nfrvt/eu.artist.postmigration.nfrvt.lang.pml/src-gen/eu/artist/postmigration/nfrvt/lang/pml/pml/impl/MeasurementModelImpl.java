/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ARTISTModelImpl;

import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementModelImpl#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementModelImpl extends ARTISTModelImpl implements MeasurementModel
{
  /**
   * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservations()
   * @generated
   * @ordered
   */
  protected EList<Observation> observations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementModelImpl()
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
    return PmlPackage.Literals.MEASUREMENT_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Observation> getObservations()
  {
    if (observations == null)
    {
      observations = new EObjectContainmentEList<Observation>(Observation.class, this, PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS);
    }
    return observations;
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
      case PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS:
        return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
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
      case PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS:
        return getObservations();
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
      case PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS:
        getObservations().clear();
        getObservations().addAll((Collection<? extends Observation>)newValue);
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
      case PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS:
        getObservations().clear();
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
      case PmlPackage.MEASUREMENT_MODEL__OBSERVATIONS:
        return observations != null && !observations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MeasurementModelImpl

/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;

import eu.artist.postmigration.nfrvt.lang.pml.pml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage
 * @generated
 */
public class PmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PmlPackage.MEASUREMENT_MODEL:
      {
        MeasurementModel measurementModel = (MeasurementModel)theEObject;
        T result = caseMeasurementModel(measurementModel);
        if (result == null) result = caseARTISTModel(measurementModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.OBSERVATION:
      {
        Observation observation = (Observation)theEObject;
        T result = caseObservation(observation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.MEASUREMENT:
      {
        Measurement measurement = (Measurement)theEObject;
        T result = caseMeasurement(measurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.APPLICATION_MEASUREMENT:
      {
        ApplicationMeasurement applicationMeasurement = (ApplicationMeasurement)theEObject;
        T result = caseApplicationMeasurement(applicationMeasurement);
        if (result == null) result = caseMeasurement(applicationMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.DATA_POINT_MEASUREMENT:
      {
        DataPointMeasurement dataPointMeasurement = (DataPointMeasurement)theEObject;
        T result = caseDataPointMeasurement(dataPointMeasurement);
        if (result == null) result = caseApplicationMeasurement(dataPointMeasurement);
        if (result == null) result = caseMeasurement(dataPointMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.TIME_SERIES_MEASUREMENT:
      {
        TimeSeriesMeasurement timeSeriesMeasurement = (TimeSeriesMeasurement)theEObject;
        T result = caseTimeSeriesMeasurement(timeSeriesMeasurement);
        if (result == null) result = caseApplicationMeasurement(timeSeriesMeasurement);
        if (result == null) result = caseMeasurement(timeSeriesMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.BENCHMARK_MEASUREMENT:
      {
        BenchmarkMeasurement benchmarkMeasurement = (BenchmarkMeasurement)theEObject;
        T result = caseBenchmarkMeasurement(benchmarkMeasurement);
        if (result == null) result = caseMeasurement(benchmarkMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmlPackage.TIME_VALUE_PAIR:
      {
        TimeValuePair timeValuePair = (TimeValuePair)theEObject;
        T result = caseTimeValuePair(timeValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Measurement Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeasurementModel(MeasurementModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservation(Observation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeasurement(Measurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMeasurement(ApplicationMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Point Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Point Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPointMeasurement(DataPointMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Series Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Series Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeSeriesMeasurement(TimeSeriesMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Benchmark Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Benchmark Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBenchmarkMeasurement(BenchmarkMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeValuePair(TimeValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARTIST Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARTIST Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARTISTModel(ARTISTModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PmlSwitch

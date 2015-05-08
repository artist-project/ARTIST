/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage
 * @generated
 */
public interface PmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PmlFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Measurement Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Measurement Model</em>'.
   * @generated
   */
  MeasurementModel createMeasurementModel();

  /**
   * Returns a new object of class '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observation</em>'.
   * @generated
   */
  Observation createObservation();

  /**
   * Returns a new object of class '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Measurement</em>'.
   * @generated
   */
  Measurement createMeasurement();

  /**
   * Returns a new object of class '<em>Application Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Measurement</em>'.
   * @generated
   */
  ApplicationMeasurement createApplicationMeasurement();

  /**
   * Returns a new object of class '<em>Data Point Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Point Measurement</em>'.
   * @generated
   */
  DataPointMeasurement createDataPointMeasurement();

  /**
   * Returns a new object of class '<em>Time Series Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Series Measurement</em>'.
   * @generated
   */
  TimeSeriesMeasurement createTimeSeriesMeasurement();

  /**
   * Returns a new object of class '<em>Benchmark Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benchmark Measurement</em>'.
   * @generated
   */
  BenchmarkMeasurement createBenchmarkMeasurement();

  /**
   * Returns a new object of class '<em>Time Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Value Pair</em>'.
   * @generated
   */
  TimeValuePair createTimeValuePair();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PmlPackage getPmlPackage();

} //PmlFactory

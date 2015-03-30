/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.pml.pml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmlFactoryImpl extends EFactoryImpl implements PmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PmlFactory init()
  {
    try
    {
      PmlFactory thePmlFactory = (PmlFactory)EPackage.Registry.INSTANCE.getEFactory(PmlPackage.eNS_URI);
      if (thePmlFactory != null)
      {
        return thePmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PmlPackage.MEASUREMENT_MODEL: return createMeasurementModel();
      case PmlPackage.OBSERVATION: return createObservation();
      case PmlPackage.MEASUREMENT: return createMeasurement();
      case PmlPackage.APPLICATION_MEASUREMENT: return createApplicationMeasurement();
      case PmlPackage.DATA_POINT_MEASUREMENT: return createDataPointMeasurement();
      case PmlPackage.TIME_SERIES_MEASUREMENT: return createTimeSeriesMeasurement();
      case PmlPackage.BENCHMARK_MEASUREMENT: return createBenchmarkMeasurement();
      case PmlPackage.TIME_VALUE_PAIR: return createTimeValuePair();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasurementModel createMeasurementModel()
  {
    MeasurementModelImpl measurementModel = new MeasurementModelImpl();
    return measurementModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation createObservation()
  {
    ObservationImpl observation = new ObservationImpl();
    return observation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measurement createMeasurement()
  {
    MeasurementImpl measurement = new MeasurementImpl();
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMeasurement createApplicationMeasurement()
  {
    ApplicationMeasurementImpl applicationMeasurement = new ApplicationMeasurementImpl();
    return applicationMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPointMeasurement createDataPointMeasurement()
  {
    DataPointMeasurementImpl dataPointMeasurement = new DataPointMeasurementImpl();
    return dataPointMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSeriesMeasurement createTimeSeriesMeasurement()
  {
    TimeSeriesMeasurementImpl timeSeriesMeasurement = new TimeSeriesMeasurementImpl();
    return timeSeriesMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkMeasurement createBenchmarkMeasurement()
  {
    BenchmarkMeasurementImpl benchmarkMeasurement = new BenchmarkMeasurementImpl();
    return benchmarkMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeValuePair createTimeValuePair()
  {
    TimeValuePairImpl timeValuePair = new TimeValuePairImpl();
    return timeValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmlPackage getPmlPackage()
  {
    return (PmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PmlPackage getPackage()
  {
    return PmlPackage.eINSTANCE;
  }

} //PmlFactoryImpl

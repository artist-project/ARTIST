/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlFactory
 * @model kind="package"
 * @generated
 */
public interface PmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/pml/PML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PmlPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementModelImpl <em>Measurement Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementModelImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getMeasurementModel()
   * @generated
   */
  int MEASUREMENT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_MODEL__IMPORTS = ArtistCommonPackage.ARTIST_MODEL__IMPORTS;

  /**
   * The feature id for the '<em><b>Observations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_MODEL__OBSERVATIONS = ArtistCommonPackage.ARTIST_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Measurement Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_MODEL_FEATURE_COUNT = ArtistCommonPackage.ARTIST_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl <em>Observation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getObservation()
   * @generated
   */
  int OBSERVATION = 1;

  /**
   * The feature id for the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__TOOL_NAME = 0;

  /**
   * The feature id for the '<em><b>Date Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__DATE_TIME = 1;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__LEVEL = 2;

  /**
   * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__MEASUREMENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION__MEASUREMENTS = 4;

  /**
   * The number of structural features of the '<em>Observation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl <em>Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getMeasurement()
   * @generated
   */
  int MEASUREMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__CONFIDENCE = 2;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__INFO = 3;

  /**
   * The number of structural features of the '<em>Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl <em>Application Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getApplicationMeasurement()
   * @generated
   */
  int APPLICATION_MEASUREMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__NAME = MEASUREMENT__NAME;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__PROPERTY = MEASUREMENT__PROPERTY;

  /**
   * The feature id for the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__CONFIDENCE = MEASUREMENT__CONFIDENCE;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__INFO = MEASUREMENT__INFO;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__CONTEXT = MEASUREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Workload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT__WORKLOAD = MEASUREMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Application Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.DataPointMeasurementImpl <em>Data Point Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.DataPointMeasurementImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getDataPointMeasurement()
   * @generated
   */
  int DATA_POINT_MEASUREMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__NAME = APPLICATION_MEASUREMENT__NAME;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__PROPERTY = APPLICATION_MEASUREMENT__PROPERTY;

  /**
   * The feature id for the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__CONFIDENCE = APPLICATION_MEASUREMENT__CONFIDENCE;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__INFO = APPLICATION_MEASUREMENT__INFO;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__CONTEXT = APPLICATION_MEASUREMENT__CONTEXT;

  /**
   * The feature id for the '<em><b>Workload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__WORKLOAD = APPLICATION_MEASUREMENT__WORKLOAD;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT__VALUE = APPLICATION_MEASUREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Point Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_POINT_MEASUREMENT_FEATURE_COUNT = APPLICATION_MEASUREMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeSeriesMeasurementImpl <em>Time Series Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeSeriesMeasurementImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getTimeSeriesMeasurement()
   * @generated
   */
  int TIME_SERIES_MEASUREMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__NAME = APPLICATION_MEASUREMENT__NAME;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__PROPERTY = APPLICATION_MEASUREMENT__PROPERTY;

  /**
   * The feature id for the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__CONFIDENCE = APPLICATION_MEASUREMENT__CONFIDENCE;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__INFO = APPLICATION_MEASUREMENT__INFO;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__CONTEXT = APPLICATION_MEASUREMENT__CONTEXT;

  /**
   * The feature id for the '<em><b>Workload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__WORKLOAD = APPLICATION_MEASUREMENT__WORKLOAD;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT__VALUES = APPLICATION_MEASUREMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Time Series Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SERIES_MEASUREMENT_FEATURE_COUNT = APPLICATION_MEASUREMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl <em>Benchmark Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getBenchmarkMeasurement()
   * @generated
   */
  int BENCHMARK_MEASUREMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__NAME = MEASUREMENT__NAME;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__PROPERTY = MEASUREMENT__PROPERTY;

  /**
   * The feature id for the '<em><b>Confidence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__CONFIDENCE = MEASUREMENT__CONFIDENCE;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__INFO = MEASUREMENT__INFO;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__PROVIDER = MEASUREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__SERVICE = MEASUREMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__TEST = MEASUREMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Workload</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__WORKLOAD = MEASUREMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Benchmark Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl <em>Time Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getTimeValuePair()
   * @generated
   */
  int TIME_VALUE_PAIR = 7;

  /**
   * The feature id for the '<em><b>Date Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_VALUE_PAIR__DATE_TIME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Time Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_VALUE_PAIR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel <em>Measurement Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement Model</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel
   * @generated
   */
  EClass getMeasurementModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel#getObservations <em>Observations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Observations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel#getObservations()
   * @see #getMeasurementModel()
   * @generated
   */
  EReference getMeasurementModel_Observations();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation
   * @generated
   */
  EClass getObservation();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getToolName <em>Tool Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tool Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getToolName()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_ToolName();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getDateTime <em>Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Time</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getDateTime()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_DateTime();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getLevel()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_Level();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurementType <em>Measurement Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Measurement Type</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurementType()
   * @see #getObservation()
   * @generated
   */
  EAttribute getObservation_MeasurementType();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurements <em>Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Measurements</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Observation#getMeasurements()
   * @see #getObservation()
   * @generated
   */
  EReference getObservation_Measurements();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement
   * @generated
   */
  EClass getMeasurement();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getName()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Name();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getProperty()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_Property();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getConfidence <em>Confidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Confidence</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getConfidence()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Confidence();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getInfo <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Info</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement#getInfo()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Info();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement <em>Application Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Measurement</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement
   * @generated
   */
  EClass getApplicationMeasurement();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Context</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getContext()
   * @see #getApplicationMeasurement()
   * @generated
   */
  EReference getApplicationMeasurement_Context();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getWorkload <em>Workload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workload</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement#getWorkload()
   * @see #getApplicationMeasurement()
   * @generated
   */
  EReference getApplicationMeasurement_Workload();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement <em>Data Point Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Point Measurement</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement
   * @generated
   */
  EClass getDataPointMeasurement();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement#getValue()
   * @see #getDataPointMeasurement()
   * @generated
   */
  EReference getDataPointMeasurement_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement <em>Time Series Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Series Measurement</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement
   * @generated
   */
  EClass getTimeSeriesMeasurement();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement#getValues()
   * @see #getTimeSeriesMeasurement()
   * @generated
   */
  EReference getTimeSeriesMeasurement_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement <em>Benchmark Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Benchmark Measurement</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement
   * @generated
   */
  EClass getBenchmarkMeasurement();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getProvider()
   * @see #getBenchmarkMeasurement()
   * @generated
   */
  EReference getBenchmarkMeasurement_Provider();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getService()
   * @see #getBenchmarkMeasurement()
   * @generated
   */
  EAttribute getBenchmarkMeasurement_Service();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getTest()
   * @see #getBenchmarkMeasurement()
   * @generated
   */
  EAttribute getBenchmarkMeasurement_Test();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getWorkload <em>Workload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Workload</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getWorkload()
   * @see #getBenchmarkMeasurement()
   * @generated
   */
  EAttribute getBenchmarkMeasurement_Workload();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement#getValue()
   * @see #getBenchmarkMeasurement()
   * @generated
   */
  EReference getBenchmarkMeasurement_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair <em>Time Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Value Pair</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair
   * @generated
   */
  EClass getTimeValuePair();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getDateTime <em>Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Time</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getDateTime()
   * @see #getTimeValuePair()
   * @generated
   */
  EAttribute getTimeValuePair_DateTime();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair#getValue()
   * @see #getTimeValuePair()
   * @generated
   */
  EReference getTimeValuePair_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PmlFactory getPmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementModelImpl <em>Measurement Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementModelImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getMeasurementModel()
     * @generated
     */
    EClass MEASUREMENT_MODEL = eINSTANCE.getMeasurementModel();

    /**
     * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT_MODEL__OBSERVATIONS = eINSTANCE.getMeasurementModel_Observations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl <em>Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ObservationImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getObservation()
     * @generated
     */
    EClass OBSERVATION = eINSTANCE.getObservation();

    /**
     * The meta object literal for the '<em><b>Tool Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__TOOL_NAME = eINSTANCE.getObservation_ToolName();

    /**
     * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__DATE_TIME = eINSTANCE.getObservation_DateTime();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__LEVEL = eINSTANCE.getObservation_Level();

    /**
     * The meta object literal for the '<em><b>Measurement Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBSERVATION__MEASUREMENT_TYPE = eINSTANCE.getObservation_MeasurementType();

    /**
     * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVATION__MEASUREMENTS = eINSTANCE.getObservation_Measurements();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl <em>Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.MeasurementImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getMeasurement()
     * @generated
     */
    EClass MEASUREMENT = eINSTANCE.getMeasurement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__NAME = eINSTANCE.getMeasurement_Name();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT__PROPERTY = eINSTANCE.getMeasurement_Property();

    /**
     * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__CONFIDENCE = eINSTANCE.getMeasurement_Confidence();

    /**
     * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__INFO = eINSTANCE.getMeasurement_Info();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl <em>Application Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.ApplicationMeasurementImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getApplicationMeasurement()
     * @generated
     */
    EClass APPLICATION_MEASUREMENT = eINSTANCE.getApplicationMeasurement();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MEASUREMENT__CONTEXT = eINSTANCE.getApplicationMeasurement_Context();

    /**
     * The meta object literal for the '<em><b>Workload</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MEASUREMENT__WORKLOAD = eINSTANCE.getApplicationMeasurement_Workload();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.DataPointMeasurementImpl <em>Data Point Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.DataPointMeasurementImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getDataPointMeasurement()
     * @generated
     */
    EClass DATA_POINT_MEASUREMENT = eINSTANCE.getDataPointMeasurement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_POINT_MEASUREMENT__VALUE = eINSTANCE.getDataPointMeasurement_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeSeriesMeasurementImpl <em>Time Series Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeSeriesMeasurementImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getTimeSeriesMeasurement()
     * @generated
     */
    EClass TIME_SERIES_MEASUREMENT = eINSTANCE.getTimeSeriesMeasurement();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_SERIES_MEASUREMENT__VALUES = eINSTANCE.getTimeSeriesMeasurement_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl <em>Benchmark Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.BenchmarkMeasurementImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getBenchmarkMeasurement()
     * @generated
     */
    EClass BENCHMARK_MEASUREMENT = eINSTANCE.getBenchmarkMeasurement();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BENCHMARK_MEASUREMENT__PROVIDER = eINSTANCE.getBenchmarkMeasurement_Provider();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENCHMARK_MEASUREMENT__SERVICE = eINSTANCE.getBenchmarkMeasurement_Service();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENCHMARK_MEASUREMENT__TEST = eINSTANCE.getBenchmarkMeasurement_Test();

    /**
     * The meta object literal for the '<em><b>Workload</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENCHMARK_MEASUREMENT__WORKLOAD = eINSTANCE.getBenchmarkMeasurement_Workload();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BENCHMARK_MEASUREMENT__VALUE = eINSTANCE.getBenchmarkMeasurement_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl <em>Time Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.TimeValuePairImpl
     * @see eu.artist.postmigration.nfrvt.lang.pml.pml.impl.PmlPackageImpl#getTimeValuePair()
     * @generated
     */
    EClass TIME_VALUE_PAIR = eINSTANCE.getTimeValuePair();

    /**
     * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_VALUE_PAIR__DATE_TIME = eINSTANCE.getTimeValuePair_DateTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_VALUE_PAIR__VALUE = eINSTANCE.getTimeValuePair_Value();

  }

} //PmlPackage

/**
 */
package eu.artist.postmigration.nfrvt.lang.pml.pml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;

import eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.BenchmarkMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlFactory;
import eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmlPackageImpl extends EPackageImpl implements PmlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass measurementModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass observationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass measurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPointMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeSeriesMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass benchmarkMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeValuePairEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.artist.postmigration.nfrvt.lang.pml.pml.PmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PmlPackageImpl()
  {
    super(eNS_URI, PmlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PmlPackage init()
  {
    if (isInited) return (PmlPackage)EPackage.Registry.INSTANCE.getEPackage(PmlPackage.eNS_URI);

    // Obtain or create and register package
    PmlPackageImpl thePmlPackage = (PmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PmlPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    NslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thePmlPackage.createPackageContents();

    // Initialize created meta-data
    thePmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePmlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PmlPackage.eNS_URI, thePmlPackage);
    return thePmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasurementModel()
  {
    return measurementModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurementModel_Observations()
  {
    return (EReference)measurementModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObservation()
  {
    return observationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_ToolName()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_DateTime()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_Level()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObservation_MeasurementType()
  {
    return (EAttribute)observationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObservation_Measurements()
  {
    return (EReference)observationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasurement()
  {
    return measurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_Name()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurement_Property()
  {
    return (EReference)measurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_Confidence()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_Info()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMeasurement()
  {
    return applicationMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMeasurement_Context()
  {
    return (EReference)applicationMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationMeasurement_Workload()
  {
    return (EReference)applicationMeasurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPointMeasurement()
  {
    return dataPointMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPointMeasurement_Value()
  {
    return (EReference)dataPointMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeSeriesMeasurement()
  {
    return timeSeriesMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeSeriesMeasurement_Values()
  {
    return (EReference)timeSeriesMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBenchmarkMeasurement()
  {
    return benchmarkMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBenchmarkMeasurement_Provider()
  {
    return (EReference)benchmarkMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenchmarkMeasurement_Service()
  {
    return (EAttribute)benchmarkMeasurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenchmarkMeasurement_Test()
  {
    return (EAttribute)benchmarkMeasurementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenchmarkMeasurement_Workload()
  {
    return (EAttribute)benchmarkMeasurementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBenchmarkMeasurement_Value()
  {
    return (EReference)benchmarkMeasurementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeValuePair()
  {
    return timeValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeValuePair_DateTime()
  {
    return (EAttribute)timeValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeValuePair_Value()
  {
    return (EReference)timeValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmlFactory getPmlFactory()
  {
    return (PmlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    measurementModelEClass = createEClass(MEASUREMENT_MODEL);
    createEReference(measurementModelEClass, MEASUREMENT_MODEL__OBSERVATIONS);

    observationEClass = createEClass(OBSERVATION);
    createEAttribute(observationEClass, OBSERVATION__TOOL_NAME);
    createEAttribute(observationEClass, OBSERVATION__DATE_TIME);
    createEAttribute(observationEClass, OBSERVATION__LEVEL);
    createEAttribute(observationEClass, OBSERVATION__MEASUREMENT_TYPE);
    createEReference(observationEClass, OBSERVATION__MEASUREMENTS);

    measurementEClass = createEClass(MEASUREMENT);
    createEAttribute(measurementEClass, MEASUREMENT__NAME);
    createEReference(measurementEClass, MEASUREMENT__PROPERTY);
    createEAttribute(measurementEClass, MEASUREMENT__CONFIDENCE);
    createEAttribute(measurementEClass, MEASUREMENT__INFO);

    applicationMeasurementEClass = createEClass(APPLICATION_MEASUREMENT);
    createEReference(applicationMeasurementEClass, APPLICATION_MEASUREMENT__CONTEXT);
    createEReference(applicationMeasurementEClass, APPLICATION_MEASUREMENT__WORKLOAD);

    dataPointMeasurementEClass = createEClass(DATA_POINT_MEASUREMENT);
    createEReference(dataPointMeasurementEClass, DATA_POINT_MEASUREMENT__VALUE);

    timeSeriesMeasurementEClass = createEClass(TIME_SERIES_MEASUREMENT);
    createEReference(timeSeriesMeasurementEClass, TIME_SERIES_MEASUREMENT__VALUES);

    benchmarkMeasurementEClass = createEClass(BENCHMARK_MEASUREMENT);
    createEReference(benchmarkMeasurementEClass, BENCHMARK_MEASUREMENT__PROVIDER);
    createEAttribute(benchmarkMeasurementEClass, BENCHMARK_MEASUREMENT__SERVICE);
    createEAttribute(benchmarkMeasurementEClass, BENCHMARK_MEASUREMENT__TEST);
    createEAttribute(benchmarkMeasurementEClass, BENCHMARK_MEASUREMENT__WORKLOAD);
    createEReference(benchmarkMeasurementEClass, BENCHMARK_MEASUREMENT__VALUE);

    timeValuePairEClass = createEClass(TIME_VALUE_PAIR);
    createEAttribute(timeValuePairEClass, TIME_VALUE_PAIR__DATE_TIME);
    createEReference(timeValuePairEClass, TIME_VALUE_PAIR__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ArtistCommonPackage theArtistCommonPackage = (ArtistCommonPackage)EPackage.Registry.INSTANCE.getEPackage(ArtistCommonPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    NslPackage theNslPackage = (NslPackage)EPackage.Registry.INSTANCE.getEPackage(NslPackage.eNS_URI);
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    measurementModelEClass.getESuperTypes().add(theArtistCommonPackage.getARTISTModel());
    applicationMeasurementEClass.getESuperTypes().add(this.getMeasurement());
    dataPointMeasurementEClass.getESuperTypes().add(this.getApplicationMeasurement());
    timeSeriesMeasurementEClass.getESuperTypes().add(this.getApplicationMeasurement());
    benchmarkMeasurementEClass.getESuperTypes().add(this.getMeasurement());

    // Initialize classes and features; add operations and parameters
    initEClass(measurementModelEClass, MeasurementModel.class, "MeasurementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMeasurementModel_Observations(), this.getObservation(), null, "observations", null, 0, -1, MeasurementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObservation_ToolName(), theEcorePackage.getEString(), "toolName", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObservation_DateTime(), theEcorePackage.getEDate(), "dateTime", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObservation_Level(), theEcorePackage.getEString(), "level", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObservation_MeasurementType(), theEcorePackage.getEString(), "measurementType", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObservation_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasurement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_Property(), theNslPackage.getQuantitativeProperty(), null, "property", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_Confidence(), theEcorePackage.getEBigDecimal(), "confidence", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_Info(), theEcorePackage.getEString(), "info", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMeasurementEClass, ApplicationMeasurement.class, "ApplicationMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplicationMeasurement_Context(), theUMLPackage.getNamedElement(), null, "context", null, 0, 1, ApplicationMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationMeasurement_Workload(), theArtistCommonPackage.getWorkload(), null, "workload", null, 0, 1, ApplicationMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPointMeasurementEClass, DataPointMeasurement.class, "DataPointMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPointMeasurement_Value(), theArtistCommonPackage.getValueSpecification(), null, "value", null, 0, 1, DataPointMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeSeriesMeasurementEClass, TimeSeriesMeasurement.class, "TimeSeriesMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimeSeriesMeasurement_Values(), this.getTimeValuePair(), null, "values", null, 0, -1, TimeSeriesMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(benchmarkMeasurementEClass, BenchmarkMeasurement.class, "BenchmarkMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBenchmarkMeasurement_Provider(), theUMLPackage.getEnumerationLiteral(), null, "provider", null, 0, 1, BenchmarkMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBenchmarkMeasurement_Service(), theEcorePackage.getEString(), "service", null, 0, 1, BenchmarkMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBenchmarkMeasurement_Test(), theEcorePackage.getEString(), "test", null, 0, 1, BenchmarkMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBenchmarkMeasurement_Workload(), theEcorePackage.getEString(), "workload", null, 0, 1, BenchmarkMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBenchmarkMeasurement_Value(), theArtistCommonPackage.getValueSpecification(), null, "value", null, 0, 1, BenchmarkMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeValuePairEClass, TimeValuePair.class, "TimeValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeValuePair_DateTime(), theEcorePackage.getEDate(), "dateTime", null, 0, 1, TimeValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTimeValuePair_Value(), theArtistCommonPackage.getValueSpecification(), null, "value", null, 0, 1, TimeValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PmlPackageImpl

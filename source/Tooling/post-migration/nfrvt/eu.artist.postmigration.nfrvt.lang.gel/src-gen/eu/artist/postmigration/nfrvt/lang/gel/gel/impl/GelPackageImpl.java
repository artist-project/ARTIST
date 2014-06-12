/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class GelPackageImpl extends EPackageImpl implements GelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migrationEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedPropertyEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedQualitativePropertyEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedQuantitativePropertyEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantitativePropertyRealizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalModelEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass softGoalEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hardGoalEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeGoalEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueExpressionEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueSpecificationExpressionEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberExpressionEvaluationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum realizationLevelKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum realizationTypeKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verdictEEnum = null;

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
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GelPackageImpl()
  {
    super(eNS_URI, GelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GelPackage init()
  {
    if (isInited) return (GelPackage)EPackage.Registry.INSTANCE.getEPackage(GelPackage.eNS_URI);

    // Obtain or create and register package
    GelPackageImpl theGelPackage = (GelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EslPackage.eINSTANCE.eClass();
    GmlPackage.eINSTANCE.eClass();
    TslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGelPackage.createPackageContents();

    // Initialize created meta-data
    theGelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GelPackage.eNS_URI, theGelPackage);
    return theGelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrationEvaluation()
  {
    return migrationEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationEvaluation_Imports()
  {
    return (EReference)migrationEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationEvaluation_Name()
  {
    return (EAttribute)migrationEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationEvaluation_Date()
  {
    return (EAttribute)migrationEvaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationEvaluation_Transformations()
  {
    return (EReference)migrationEvaluationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationEvaluation_PropertyEvaluations()
  {
    return (EReference)migrationEvaluationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationEvaluation_Evaluation()
  {
    return (EReference)migrationEvaluationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransformation()
  {
    return transformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransformation_Name()
  {
    return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Pattern()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Source()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Target()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedPropertyEvaluation()
  {
    return appliedPropertyEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppliedPropertyEvaluation_Name()
  {
    return (EAttribute)appliedPropertyEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedPropertyEvaluation_Value()
  {
    return (EReference)appliedPropertyEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedPropertyEvaluation_Evaluation()
  {
    return (EReference)appliedPropertyEvaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedQualitativePropertyEvaluation()
  {
    return appliedQualitativePropertyEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQualitativePropertyEvaluation_Property()
  {
    return (EReference)appliedQualitativePropertyEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedQuantitativePropertyEvaluation()
  {
    return appliedQuantitativePropertyEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativePropertyEvaluation_Property()
  {
    return (EReference)appliedQuantitativePropertyEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativePropertyEvaluation_Realizations()
  {
    return (EReference)appliedQuantitativePropertyEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantitativePropertyRealization()
  {
    return quantitativePropertyRealizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantitativePropertyRealization_Name()
  {
    return (EAttribute)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantitativePropertyRealization_Strategy()
  {
    return (EReference)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantitativePropertyRealization_Level()
  {
    return (EAttribute)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantitativePropertyRealization_Type()
  {
    return (EAttribute)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantitativePropertyRealization_Values()
  {
    return (EReference)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantitativePropertyRealization_Precision()
  {
    return (EAttribute)quantitativePropertyRealizationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalModelEvaluation()
  {
    return goalModelEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModelEvaluation_GoalModel()
  {
    return (EReference)goalModelEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalModelEvaluation_Verdict()
  {
    return (EAttribute)goalModelEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalModelEvaluation_Reason()
  {
    return (EAttribute)goalModelEvaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModelEvaluation_Evaluations()
  {
    return (EReference)goalModelEvaluationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalEvaluation()
  {
    return goalEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalEvaluation_Name()
  {
    return (EAttribute)goalEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalEvaluation_Verdict()
  {
    return (EAttribute)goalEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalEvaluation_Reason()
  {
    return (EAttribute)goalEvaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoftGoalEvaluation()
  {
    return softGoalEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftGoalEvaluation_Goal()
  {
    return (EReference)softGoalEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftGoalEvaluation_Difference()
  {
    return (EAttribute)softGoalEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHardGoalEvaluation()
  {
    return hardGoalEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardGoalEvaluation_Goal()
  {
    return (EReference)hardGoalEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardGoalEvaluation_ConditionEvaluation()
  {
    return (EReference)hardGoalEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeGoalEvaluation()
  {
    return compositeGoalEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeGoalEvaluation_Goal()
  {
    return (EReference)compositeGoalEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeGoalEvaluation_ConditionEvaluation()
  {
    return (EReference)compositeGoalEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueExpressionEvaluation()
  {
    return valueExpressionEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueExpressionEvaluation_Reason()
  {
    return (EAttribute)valueExpressionEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueSpecificationExpressionEvaluation()
  {
    return valueSpecificationExpressionEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueSpecificationExpressionEvaluation_Result()
  {
    return (EReference)valueSpecificationExpressionEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueSpecificationExpressionEvaluation_Evaluations()
  {
    return (EReference)valueSpecificationExpressionEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpressionEvaluation()
  {
    return booleanExpressionEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpressionEvaluation_Result()
  {
    return (EReference)booleanExpressionEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpressionEvaluation_Difference()
  {
    return (EAttribute)booleanExpressionEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpressionEvaluation_Evaluations()
  {
    return (EReference)booleanExpressionEvaluationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberExpressionEvaluation()
  {
    return numberExpressionEvaluationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberExpressionEvaluation_Result()
  {
    return (EReference)numberExpressionEvaluationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberExpressionEvaluation_Evaluations()
  {
    return (EReference)numberExpressionEvaluationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRealizationLevelKind()
  {
    return realizationLevelKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRealizationTypeKind()
  {
    return realizationTypeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVerdict()
  {
    return verdictEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelFactory getGelFactory()
  {
    return (GelFactory)getEFactoryInstance();
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
    migrationEvaluationEClass = createEClass(MIGRATION_EVALUATION);
    createEReference(migrationEvaluationEClass, MIGRATION_EVALUATION__IMPORTS);
    createEAttribute(migrationEvaluationEClass, MIGRATION_EVALUATION__NAME);
    createEAttribute(migrationEvaluationEClass, MIGRATION_EVALUATION__DATE);
    createEReference(migrationEvaluationEClass, MIGRATION_EVALUATION__TRANSFORMATIONS);
    createEReference(migrationEvaluationEClass, MIGRATION_EVALUATION__PROPERTY_EVALUATIONS);
    createEReference(migrationEvaluationEClass, MIGRATION_EVALUATION__EVALUATION);

    transformationEClass = createEClass(TRANSFORMATION);
    createEAttribute(transformationEClass, TRANSFORMATION__NAME);
    createEReference(transformationEClass, TRANSFORMATION__PATTERN);
    createEReference(transformationEClass, TRANSFORMATION__SOURCE);
    createEReference(transformationEClass, TRANSFORMATION__TARGET);

    appliedPropertyEvaluationEClass = createEClass(APPLIED_PROPERTY_EVALUATION);
    createEAttribute(appliedPropertyEvaluationEClass, APPLIED_PROPERTY_EVALUATION__NAME);
    createEReference(appliedPropertyEvaluationEClass, APPLIED_PROPERTY_EVALUATION__VALUE);
    createEReference(appliedPropertyEvaluationEClass, APPLIED_PROPERTY_EVALUATION__EVALUATION);

    appliedQualitativePropertyEvaluationEClass = createEClass(APPLIED_QUALITATIVE_PROPERTY_EVALUATION);
    createEReference(appliedQualitativePropertyEvaluationEClass, APPLIED_QUALITATIVE_PROPERTY_EVALUATION__PROPERTY);

    appliedQuantitativePropertyEvaluationEClass = createEClass(APPLIED_QUANTITATIVE_PROPERTY_EVALUATION);
    createEReference(appliedQuantitativePropertyEvaluationEClass, APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY);
    createEReference(appliedQuantitativePropertyEvaluationEClass, APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__REALIZATIONS);

    quantitativePropertyRealizationEClass = createEClass(QUANTITATIVE_PROPERTY_REALIZATION);
    createEAttribute(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__NAME);
    createEReference(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY);
    createEAttribute(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__LEVEL);
    createEAttribute(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__TYPE);
    createEReference(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__VALUES);
    createEAttribute(quantitativePropertyRealizationEClass, QUANTITATIVE_PROPERTY_REALIZATION__PRECISION);

    goalModelEvaluationEClass = createEClass(GOAL_MODEL_EVALUATION);
    createEReference(goalModelEvaluationEClass, GOAL_MODEL_EVALUATION__GOAL_MODEL);
    createEAttribute(goalModelEvaluationEClass, GOAL_MODEL_EVALUATION__VERDICT);
    createEAttribute(goalModelEvaluationEClass, GOAL_MODEL_EVALUATION__REASON);
    createEReference(goalModelEvaluationEClass, GOAL_MODEL_EVALUATION__EVALUATIONS);

    goalEvaluationEClass = createEClass(GOAL_EVALUATION);
    createEAttribute(goalEvaluationEClass, GOAL_EVALUATION__NAME);
    createEAttribute(goalEvaluationEClass, GOAL_EVALUATION__VERDICT);
    createEAttribute(goalEvaluationEClass, GOAL_EVALUATION__REASON);

    softGoalEvaluationEClass = createEClass(SOFT_GOAL_EVALUATION);
    createEReference(softGoalEvaluationEClass, SOFT_GOAL_EVALUATION__GOAL);
    createEAttribute(softGoalEvaluationEClass, SOFT_GOAL_EVALUATION__DIFFERENCE);

    hardGoalEvaluationEClass = createEClass(HARD_GOAL_EVALUATION);
    createEReference(hardGoalEvaluationEClass, HARD_GOAL_EVALUATION__GOAL);
    createEReference(hardGoalEvaluationEClass, HARD_GOAL_EVALUATION__CONDITION_EVALUATION);

    compositeGoalEvaluationEClass = createEClass(COMPOSITE_GOAL_EVALUATION);
    createEReference(compositeGoalEvaluationEClass, COMPOSITE_GOAL_EVALUATION__GOAL);
    createEReference(compositeGoalEvaluationEClass, COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION);

    valueExpressionEvaluationEClass = createEClass(VALUE_EXPRESSION_EVALUATION);
    createEAttribute(valueExpressionEvaluationEClass, VALUE_EXPRESSION_EVALUATION__REASON);

    valueSpecificationExpressionEvaluationEClass = createEClass(VALUE_SPECIFICATION_EXPRESSION_EVALUATION);
    createEReference(valueSpecificationExpressionEvaluationEClass, VALUE_SPECIFICATION_EXPRESSION_EVALUATION__RESULT);
    createEReference(valueSpecificationExpressionEvaluationEClass, VALUE_SPECIFICATION_EXPRESSION_EVALUATION__EVALUATIONS);

    booleanExpressionEvaluationEClass = createEClass(BOOLEAN_EXPRESSION_EVALUATION);
    createEReference(booleanExpressionEvaluationEClass, BOOLEAN_EXPRESSION_EVALUATION__RESULT);
    createEAttribute(booleanExpressionEvaluationEClass, BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE);
    createEReference(booleanExpressionEvaluationEClass, BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS);

    numberExpressionEvaluationEClass = createEClass(NUMBER_EXPRESSION_EVALUATION);
    createEReference(numberExpressionEvaluationEClass, NUMBER_EXPRESSION_EVALUATION__RESULT);
    createEReference(numberExpressionEvaluationEClass, NUMBER_EXPRESSION_EVALUATION__EVALUATIONS);

    // Create enums
    realizationLevelKindEEnum = createEEnum(REALIZATION_LEVEL_KIND);
    realizationTypeKindEEnum = createEEnum(REALIZATION_TYPE_KIND);
    verdictEEnum = createEEnum(VERDICT);
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
    TslPackage theTslPackage = (TslPackage)EPackage.Registry.INSTANCE.getEPackage(TslPackage.eNS_URI);
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    GmlPackage theGmlPackage = (GmlPackage)EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI);
    EslPackage theEslPackage = (EslPackage)EPackage.Registry.INSTANCE.getEPackage(EslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    appliedQualitativePropertyEvaluationEClass.getESuperTypes().add(this.getAppliedPropertyEvaluation());
    appliedQuantitativePropertyEvaluationEClass.getESuperTypes().add(this.getAppliedPropertyEvaluation());
    softGoalEvaluationEClass.getESuperTypes().add(this.getGoalEvaluation());
    hardGoalEvaluationEClass.getESuperTypes().add(this.getGoalEvaluation());
    compositeGoalEvaluationEClass.getESuperTypes().add(this.getGoalEvaluation());
    valueSpecificationExpressionEvaluationEClass.getESuperTypes().add(this.getValueExpressionEvaluation());
    booleanExpressionEvaluationEClass.getESuperTypes().add(this.getValueExpressionEvaluation());
    numberExpressionEvaluationEClass.getESuperTypes().add(this.getValueExpressionEvaluation());

    // Initialize classes and features; add operations and parameters
    initEClass(migrationEvaluationEClass, MigrationEvaluation.class, "MigrationEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigrationEvaluation_Imports(), theArtistCommonPackage.getImportNamespace(), null, "imports", null, 0, -1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationEvaluation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationEvaluation_Date(), theEcorePackage.getEString(), "date", null, 0, 1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationEvaluation_Transformations(), this.getTransformation(), null, "transformations", null, 0, -1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationEvaluation_PropertyEvaluations(), this.getAppliedPropertyEvaluation(), null, "propertyEvaluations", null, 0, -1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationEvaluation_Evaluation(), this.getGoalModelEvaluation(), null, "evaluation", null, 0, 1, MigrationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransformation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformation_Pattern(), theTslPackage.getPattern(), null, "pattern", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformation_Source(), theUMLPackage.getNamedElement(), null, "source", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformation_Target(), theUMLPackage.getNamedElement(), null, "target", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedPropertyEvaluationEClass, AppliedPropertyEvaluation.class, "AppliedPropertyEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAppliedPropertyEvaluation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AppliedPropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedPropertyEvaluation_Value(), theArtistCommonPackage.getValueSpecification(), null, "value", null, 0, 1, AppliedPropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedPropertyEvaluation_Evaluation(), this.getValueExpressionEvaluation(), null, "evaluation", null, 0, 1, AppliedPropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedQualitativePropertyEvaluationEClass, AppliedQualitativePropertyEvaluation.class, "AppliedQualitativePropertyEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedQualitativePropertyEvaluation_Property(), theGmlPackage.getAppliedQualitativeProperty(), null, "property", null, 0, 1, AppliedQualitativePropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedQuantitativePropertyEvaluationEClass, AppliedQuantitativePropertyEvaluation.class, "AppliedQuantitativePropertyEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedQuantitativePropertyEvaluation_Property(), theGmlPackage.getAppliedQuantitativeProperty(), null, "property", null, 0, 1, AppliedQuantitativePropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedQuantitativePropertyEvaluation_Realizations(), this.getQuantitativePropertyRealization(), null, "realizations", null, 0, -1, AppliedQuantitativePropertyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantitativePropertyRealizationEClass, QuantitativePropertyRealization.class, "QuantitativePropertyRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantitativePropertyRealization_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantitativePropertyRealization_Strategy(), theEslPackage.getEvaluationStrategy(), null, "strategy", null, 0, 1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantitativePropertyRealization_Level(), this.getRealizationLevelKind(), "level", null, 0, 1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantitativePropertyRealization_Type(), this.getRealizationTypeKind(), "type", null, 0, 1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantitativePropertyRealization_Values(), theArtistCommonPackage.getValueSpecification(), null, "values", null, 0, -1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantitativePropertyRealization_Precision(), theEcorePackage.getEBigDecimal(), "precision", null, 0, 1, QuantitativePropertyRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalModelEvaluationEClass, GoalModelEvaluation.class, "GoalModelEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoalModelEvaluation_GoalModel(), theGmlPackage.getGoalModel(), null, "goalModel", null, 0, 1, GoalModelEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoalModelEvaluation_Verdict(), this.getVerdict(), "verdict", null, 0, 1, GoalModelEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoalModelEvaluation_Reason(), theEcorePackage.getEString(), "reason", null, 0, 1, GoalModelEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalModelEvaluation_Evaluations(), this.getGoalEvaluation(), null, "evaluations", null, 0, -1, GoalModelEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEvaluationEClass, GoalEvaluation.class, "GoalEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoalEvaluation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoalEvaluation_Verdict(), this.getVerdict(), "verdict", null, 0, 1, GoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoalEvaluation_Reason(), theEcorePackage.getEString(), "reason", null, 0, 1, GoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softGoalEvaluationEClass, SoftGoalEvaluation.class, "SoftGoalEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoftGoalEvaluation_Goal(), theGmlPackage.getSoftGoal(), null, "goal", null, 0, 1, SoftGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftGoalEvaluation_Difference(), theEcorePackage.getEBigDecimal(), "difference", null, 0, 1, SoftGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hardGoalEvaluationEClass, HardGoalEvaluation.class, "HardGoalEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHardGoalEvaluation_Goal(), theGmlPackage.getHardGoal(), null, "goal", null, 0, 1, HardGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHardGoalEvaluation_ConditionEvaluation(), this.getBooleanExpressionEvaluation(), null, "conditionEvaluation", null, 0, 1, HardGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeGoalEvaluationEClass, CompositeGoalEvaluation.class, "CompositeGoalEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeGoalEvaluation_Goal(), theGmlPackage.getCompositeGoal(), null, "goal", null, 0, 1, CompositeGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeGoalEvaluation_ConditionEvaluation(), this.getBooleanExpressionEvaluation(), null, "conditionEvaluation", null, 0, 1, CompositeGoalEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueExpressionEvaluationEClass, ValueExpressionEvaluation.class, "ValueExpressionEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueExpressionEvaluation_Reason(), theEcorePackage.getEString(), "reason", null, 0, 1, ValueExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueSpecificationExpressionEvaluationEClass, ValueSpecificationExpressionEvaluation.class, "ValueSpecificationExpressionEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueSpecificationExpressionEvaluation_Result(), theArtistCommonPackage.getValueSpecification(), null, "result", null, 0, 1, ValueSpecificationExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueSpecificationExpressionEvaluation_Evaluations(), this.getValueExpressionEvaluation(), null, "evaluations", null, 0, -1, ValueSpecificationExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEvaluationEClass, BooleanExpressionEvaluation.class, "BooleanExpressionEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanExpressionEvaluation_Result(), theArtistCommonPackage.getBooleanLiteral(), null, "result", null, 0, 1, BooleanExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanExpressionEvaluation_Difference(), theEcorePackage.getEBigDecimal(), "difference", null, 0, 1, BooleanExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanExpressionEvaluation_Evaluations(), this.getValueExpressionEvaluation(), null, "evaluations", null, 0, -1, BooleanExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberExpressionEvaluationEClass, NumberExpressionEvaluation.class, "NumberExpressionEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberExpressionEvaluation_Result(), theArtistCommonPackage.getNumberLiteral(), null, "result", null, 0, 1, NumberExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberExpressionEvaluation_Evaluations(), this.getNumberExpressionEvaluation(), null, "evaluations", null, 0, -1, NumberExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(realizationLevelKindEEnum, RealizationLevelKind.class, "RealizationLevelKind");
    addEEnumLiteral(realizationLevelKindEEnum, RealizationLevelKind.MODEL);
    addEEnumLiteral(realizationLevelKindEEnum, RealizationLevelKind.CODE);

    initEEnum(realizationTypeKindEEnum, RealizationTypeKind.class, "RealizationTypeKind");
    addEEnumLiteral(realizationTypeKindEEnum, RealizationTypeKind.CALCULATED);
    addEEnumLiteral(realizationTypeKindEEnum, RealizationTypeKind.MEASURED);
    addEEnumLiteral(realizationTypeKindEEnum, RealizationTypeKind.ESTIMATED);

    initEEnum(verdictEEnum, Verdict.class, "Verdict");
    addEEnumLiteral(verdictEEnum, Verdict.PASS);
    addEEnumLiteral(verdictEEnum, Verdict.FAIL);
    addEEnumLiteral(verdictEEnum, Verdict.INCONCLUSIVE);

    // Create resource
    createResource(eNS_URI);
  }

} //GelPackageImpl

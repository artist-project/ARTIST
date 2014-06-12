/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory
 * @model kind="package"
 * @generated
 */
public interface GelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/gel/GEL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GelPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl <em>Migration Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getMigrationEvaluation()
   * @generated
   */
  int MIGRATION_EVALUATION = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__DATE = 2;

  /**
   * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__TRANSFORMATIONS = 3;

  /**
   * The feature id for the '<em><b>Property Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__PROPERTY_EVALUATIONS = 4;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION__EVALUATION = 5;

  /**
   * The number of structural features of the '<em>Migration Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_EVALUATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__PATTERN = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__TARGET = 3;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl <em>Applied Property Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedPropertyEvaluation()
   * @generated
   */
  int APPLIED_PROPERTY_EVALUATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY_EVALUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY_EVALUATION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY_EVALUATION__EVALUATION = 2;

  /**
   * The number of structural features of the '<em>Applied Property Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQualitativePropertyEvaluationImpl <em>Applied Qualitative Property Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQualitativePropertyEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedQualitativePropertyEvaluation()
   * @generated
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION__NAME = APPLIED_PROPERTY_EVALUATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION__VALUE = APPLIED_PROPERTY_EVALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION__EVALUATION = APPLIED_PROPERTY_EVALUATION__EVALUATION;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION__PROPERTY = APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Applied Qualitative Property Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_EVALUATION_FEATURE_COUNT = APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl <em>Applied Quantitative Property Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedQuantitativePropertyEvaluation()
   * @generated
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__NAME = APPLIED_PROPERTY_EVALUATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__VALUE = APPLIED_PROPERTY_EVALUATION__VALUE;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__EVALUATION = APPLIED_PROPERTY_EVALUATION__EVALUATION;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY = APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Realizations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__REALIZATIONS = APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Applied Quantitative Property Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EVALUATION_FEATURE_COUNT = APPLIED_PROPERTY_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl <em>Quantitative Property Realization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getQuantitativePropertyRealization()
   * @generated
   */
  int QUANTITATIVE_PROPERTY_REALIZATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY = 1;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__LEVEL = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__TYPE = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__VALUES = 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION__PRECISION = 5;

  /**
   * The number of structural features of the '<em>Quantitative Property Realization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_REALIZATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl <em>Goal Model Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getGoalModelEvaluation()
   * @generated
   */
  int GOAL_MODEL_EVALUATION = 6;

  /**
   * The feature id for the '<em><b>Goal Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_EVALUATION__GOAL_MODEL = 0;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_EVALUATION__VERDICT = 1;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_EVALUATION__REASON = 2;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_EVALUATION__EVALUATIONS = 3;

  /**
   * The number of structural features of the '<em>Goal Model Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_EVALUATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl <em>Goal Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getGoalEvaluation()
   * @generated
   */
  int GOAL_EVALUATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_EVALUATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_EVALUATION__VERDICT = 1;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_EVALUATION__REASON = 2;

  /**
   * The number of structural features of the '<em>Goal Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_EVALUATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl <em>Soft Goal Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getSoftGoalEvaluation()
   * @generated
   */
  int SOFT_GOAL_EVALUATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION__NAME = GOAL_EVALUATION__NAME;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION__VERDICT = GOAL_EVALUATION__VERDICT;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION__REASON = GOAL_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION__GOAL = GOAL_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Difference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION__DIFFERENCE = GOAL_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Soft Goal Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_EVALUATION_FEATURE_COUNT = GOAL_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.HardGoalEvaluationImpl <em>Hard Goal Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.HardGoalEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getHardGoalEvaluation()
   * @generated
   */
  int HARD_GOAL_EVALUATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION__NAME = GOAL_EVALUATION__NAME;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION__VERDICT = GOAL_EVALUATION__VERDICT;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION__REASON = GOAL_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION__GOAL = GOAL_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION__CONDITION_EVALUATION = GOAL_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hard Goal Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_EVALUATION_FEATURE_COUNT = GOAL_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl <em>Composite Goal Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getCompositeGoalEvaluation()
   * @generated
   */
  int COMPOSITE_GOAL_EVALUATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION__NAME = GOAL_EVALUATION__NAME;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION__VERDICT = GOAL_EVALUATION__VERDICT;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION__REASON = GOAL_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION__GOAL = GOAL_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION = GOAL_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composite Goal Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_EVALUATION_FEATURE_COUNT = GOAL_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueExpressionEvaluationImpl <em>Value Expression Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueExpressionEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getValueExpressionEvaluation()
   * @generated
   */
  int VALUE_EXPRESSION_EVALUATION = 11;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION_EVALUATION__REASON = 0;

  /**
   * The number of structural features of the '<em>Value Expression Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueSpecificationExpressionEvaluationImpl <em>Value Specification Expression Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueSpecificationExpressionEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getValueSpecificationExpressionEvaluation()
   * @generated
   */
  int VALUE_SPECIFICATION_EXPRESSION_EVALUATION = 12;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_EXPRESSION_EVALUATION__REASON = VALUE_EXPRESSION_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_EXPRESSION_EVALUATION__RESULT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_EXPRESSION_EVALUATION__EVALUATIONS = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value Specification Expression Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_EXPRESSION_EVALUATION_FEATURE_COUNT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl <em>Boolean Expression Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getBooleanExpressionEvaluation()
   * @generated
   */
  int BOOLEAN_EXPRESSION_EVALUATION = 13;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_EVALUATION__REASON = VALUE_EXPRESSION_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_EVALUATION__RESULT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Difference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Boolean Expression Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_EVALUATION_FEATURE_COUNT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl <em>Number Expression Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getNumberExpressionEvaluation()
   * @generated
   */
  int NUMBER_EXPRESSION_EVALUATION = 14;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_EVALUATION__REASON = VALUE_EXPRESSION_EVALUATION__REASON;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_EVALUATION__RESULT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_EVALUATION__EVALUATIONS = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Expression Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_EVALUATION_FEATURE_COUNT = VALUE_EXPRESSION_EVALUATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind <em>Realization Level Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getRealizationLevelKind()
   * @generated
   */
  int REALIZATION_LEVEL_KIND = 15;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind <em>Realization Type Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getRealizationTypeKind()
   * @generated
   */
  int REALIZATION_TYPE_KIND = 16;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict <em>Verdict</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getVerdict()
   * @generated
   */
  int VERDICT = 17;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation <em>Migration Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation
   * @generated
   */
  EClass getMigrationEvaluation();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getImports()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EReference getMigrationEvaluation_Imports();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getName()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EAttribute getMigrationEvaluation_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getDate()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EAttribute getMigrationEvaluation_Date();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getTransformations <em>Transformations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getTransformations()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EReference getMigrationEvaluation_Transformations();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getPropertyEvaluations <em>Property Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Evaluations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getPropertyEvaluations()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EReference getMigrationEvaluation_PropertyEvaluations();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation#getEvaluation()
   * @see #getMigrationEvaluation()
   * @generated
   */
  EReference getMigrationEvaluation_Evaluation();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getName()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Name();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getPattern()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Pattern();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getSource()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Source();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getTarget()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Target();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation <em>Applied Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Property Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation
   * @generated
   */
  EClass getAppliedPropertyEvaluation();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getName()
   * @see #getAppliedPropertyEvaluation()
   * @generated
   */
  EAttribute getAppliedPropertyEvaluation_Name();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getValue()
   * @see #getAppliedPropertyEvaluation()
   * @generated
   */
  EReference getAppliedPropertyEvaluation_Value();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation#getEvaluation()
   * @see #getAppliedPropertyEvaluation()
   * @generated
   */
  EReference getAppliedPropertyEvaluation_Evaluation();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation <em>Applied Qualitative Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Qualitative Property Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation
   * @generated
   */
  EClass getAppliedQualitativePropertyEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation#getProperty()
   * @see #getAppliedQualitativePropertyEvaluation()
   * @generated
   */
  EReference getAppliedQualitativePropertyEvaluation_Property();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation <em>Applied Quantitative Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Quantitative Property Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation
   * @generated
   */
  EClass getAppliedQuantitativePropertyEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getProperty()
   * @see #getAppliedQuantitativePropertyEvaluation()
   * @generated
   */
  EReference getAppliedQuantitativePropertyEvaluation_Property();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getRealizations <em>Realizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Realizations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation#getRealizations()
   * @see #getAppliedQuantitativePropertyEvaluation()
   * @generated
   */
  EReference getAppliedQuantitativePropertyEvaluation_Realizations();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization <em>Quantitative Property Realization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantitative Property Realization</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization
   * @generated
   */
  EClass getQuantitativePropertyRealization();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getName()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EAttribute getQuantitativePropertyRealization_Name();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Strategy</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getStrategy()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EReference getQuantitativePropertyRealization_Strategy();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getLevel()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EAttribute getQuantitativePropertyRealization_Level();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getType()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EAttribute getQuantitativePropertyRealization_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getValues()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EReference getQuantitativePropertyRealization_Values();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getPrecision()
   * @see #getQuantitativePropertyRealization()
   * @generated
   */
  EAttribute getQuantitativePropertyRealization_Precision();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation <em>Goal Model Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Model Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation
   * @generated
   */
  EClass getGoalModelEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getGoalModel <em>Goal Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal Model</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getGoalModel()
   * @see #getGoalModelEvaluation()
   * @generated
   */
  EReference getGoalModelEvaluation_GoalModel();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getVerdict <em>Verdict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verdict</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getVerdict()
   * @see #getGoalModelEvaluation()
   * @generated
   */
  EAttribute getGoalModelEvaluation_Verdict();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getReason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reason</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getReason()
   * @see #getGoalModelEvaluation()
   * @generated
   */
  EAttribute getGoalModelEvaluation_Reason();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getEvaluations()
   * @see #getGoalModelEvaluation()
   * @generated
   */
  EReference getGoalModelEvaluation_Evaluations();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation <em>Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation
   * @generated
   */
  EClass getGoalEvaluation();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getName()
   * @see #getGoalEvaluation()
   * @generated
   */
  EAttribute getGoalEvaluation_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getVerdict <em>Verdict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verdict</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getVerdict()
   * @see #getGoalEvaluation()
   * @generated
   */
  EAttribute getGoalEvaluation_Verdict();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getReason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reason</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation#getReason()
   * @see #getGoalEvaluation()
   * @generated
   */
  EAttribute getGoalEvaluation_Reason();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation <em>Soft Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soft Goal Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation
   * @generated
   */
  EClass getSoftGoalEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getGoal()
   * @see #getSoftGoalEvaluation()
   * @generated
   */
  EReference getSoftGoalEvaluation_Goal();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getDifference <em>Difference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Difference</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getDifference()
   * @see #getSoftGoalEvaluation()
   * @generated
   */
  EAttribute getSoftGoalEvaluation_Difference();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation <em>Hard Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hard Goal Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation
   * @generated
   */
  EClass getHardGoalEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation#getGoal()
   * @see #getHardGoalEvaluation()
   * @generated
   */
  EReference getHardGoalEvaluation_Goal();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation#getConditionEvaluation <em>Condition Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation#getConditionEvaluation()
   * @see #getHardGoalEvaluation()
   * @generated
   */
  EReference getHardGoalEvaluation_ConditionEvaluation();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation <em>Composite Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Goal Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation
   * @generated
   */
  EClass getCompositeGoalEvaluation();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getGoal()
   * @see #getCompositeGoalEvaluation()
   * @generated
   */
  EReference getCompositeGoalEvaluation_Goal();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getConditionEvaluation <em>Condition Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation#getConditionEvaluation()
   * @see #getCompositeGoalEvaluation()
   * @generated
   */
  EReference getCompositeGoalEvaluation_ConditionEvaluation();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation <em>Value Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expression Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation
   * @generated
   */
  EClass getValueExpressionEvaluation();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation#getReason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reason</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation#getReason()
   * @see #getValueExpressionEvaluation()
   * @generated
   */
  EAttribute getValueExpressionEvaluation_Reason();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation <em>Value Specification Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Specification Expression Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation
   * @generated
   */
  EClass getValueSpecificationExpressionEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation#getResult()
   * @see #getValueSpecificationExpressionEvaluation()
   * @generated
   */
  EReference getValueSpecificationExpressionEvaluation_Result();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation#getEvaluations()
   * @see #getValueSpecificationExpressionEvaluation()
   * @generated
   */
  EReference getValueSpecificationExpressionEvaluation_Evaluations();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation <em>Boolean Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation
   * @generated
   */
  EClass getBooleanExpressionEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getResult()
   * @see #getBooleanExpressionEvaluation()
   * @generated
   */
  EReference getBooleanExpressionEvaluation_Result();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getDifference <em>Difference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Difference</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getDifference()
   * @see #getBooleanExpressionEvaluation()
   * @generated
   */
  EAttribute getBooleanExpressionEvaluation_Difference();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation#getEvaluations()
   * @see #getBooleanExpressionEvaluation()
   * @generated
   */
  EReference getBooleanExpressionEvaluation_Evaluations();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation <em>Number Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Expression Evaluation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation
   * @generated
   */
  EClass getNumberExpressionEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getResult()
   * @see #getNumberExpressionEvaluation()
   * @generated
   */
  EReference getNumberExpressionEvaluation_Result();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluations</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getEvaluations()
   * @see #getNumberExpressionEvaluation()
   * @generated
   */
  EReference getNumberExpressionEvaluation_Evaluations();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind <em>Realization Level Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Realization Level Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind
   * @generated
   */
  EEnum getRealizationLevelKind();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind <em>Realization Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Realization Type Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind
   * @generated
   */
  EEnum getRealizationTypeKind();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict <em>Verdict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verdict</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @generated
   */
  EEnum getVerdict();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GelFactory getGelFactory();

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
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl <em>Migration Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.MigrationEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getMigrationEvaluation()
     * @generated
     */
    EClass MIGRATION_EVALUATION = eINSTANCE.getMigrationEvaluation();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_EVALUATION__IMPORTS = eINSTANCE.getMigrationEvaluation_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_EVALUATION__NAME = eINSTANCE.getMigrationEvaluation_Name();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_EVALUATION__DATE = eINSTANCE.getMigrationEvaluation_Date();

    /**
     * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_EVALUATION__TRANSFORMATIONS = eINSTANCE.getMigrationEvaluation_Transformations();

    /**
     * The meta object literal for the '<em><b>Property Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_EVALUATION__PROPERTY_EVALUATIONS = eINSTANCE.getMigrationEvaluation_PropertyEvaluations();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_EVALUATION__EVALUATION = eINSTANCE.getMigrationEvaluation_Evaluation();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.TransformationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__PATTERN = eINSTANCE.getTransformation_Pattern();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__SOURCE = eINSTANCE.getTransformation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__TARGET = eINSTANCE.getTransformation_Target();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl <em>Applied Property Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedPropertyEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedPropertyEvaluation()
     * @generated
     */
    EClass APPLIED_PROPERTY_EVALUATION = eINSTANCE.getAppliedPropertyEvaluation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLIED_PROPERTY_EVALUATION__NAME = eINSTANCE.getAppliedPropertyEvaluation_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_PROPERTY_EVALUATION__VALUE = eINSTANCE.getAppliedPropertyEvaluation_Value();

    /**
     * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_PROPERTY_EVALUATION__EVALUATION = eINSTANCE.getAppliedPropertyEvaluation_Evaluation();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQualitativePropertyEvaluationImpl <em>Applied Qualitative Property Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQualitativePropertyEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedQualitativePropertyEvaluation()
     * @generated
     */
    EClass APPLIED_QUALITATIVE_PROPERTY_EVALUATION = eINSTANCE.getAppliedQualitativePropertyEvaluation();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUALITATIVE_PROPERTY_EVALUATION__PROPERTY = eINSTANCE.getAppliedQualitativePropertyEvaluation_Property();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl <em>Applied Quantitative Property Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.AppliedQuantitativePropertyEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getAppliedQuantitativePropertyEvaluation()
     * @generated
     */
    EClass APPLIED_QUANTITATIVE_PROPERTY_EVALUATION = eINSTANCE.getAppliedQuantitativePropertyEvaluation();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__PROPERTY = eINSTANCE.getAppliedQuantitativePropertyEvaluation_Property();

    /**
     * The meta object literal for the '<em><b>Realizations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY_EVALUATION__REALIZATIONS = eINSTANCE.getAppliedQuantitativePropertyEvaluation_Realizations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl <em>Quantitative Property Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.QuantitativePropertyRealizationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getQuantitativePropertyRealization()
     * @generated
     */
    EClass QUANTITATIVE_PROPERTY_REALIZATION = eINSTANCE.getQuantitativePropertyRealization();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITATIVE_PROPERTY_REALIZATION__NAME = eINSTANCE.getQuantitativePropertyRealization_Name();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITATIVE_PROPERTY_REALIZATION__STRATEGY = eINSTANCE.getQuantitativePropertyRealization_Strategy();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITATIVE_PROPERTY_REALIZATION__LEVEL = eINSTANCE.getQuantitativePropertyRealization_Level();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITATIVE_PROPERTY_REALIZATION__TYPE = eINSTANCE.getQuantitativePropertyRealization_Type();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITATIVE_PROPERTY_REALIZATION__VALUES = eINSTANCE.getQuantitativePropertyRealization_Values();

    /**
     * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITATIVE_PROPERTY_REALIZATION__PRECISION = eINSTANCE.getQuantitativePropertyRealization_Precision();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl <em>Goal Model Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalModelEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getGoalModelEvaluation()
     * @generated
     */
    EClass GOAL_MODEL_EVALUATION = eINSTANCE.getGoalModelEvaluation();

    /**
     * The meta object literal for the '<em><b>Goal Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL_EVALUATION__GOAL_MODEL = eINSTANCE.getGoalModelEvaluation_GoalModel();

    /**
     * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_MODEL_EVALUATION__VERDICT = eINSTANCE.getGoalModelEvaluation_Verdict();

    /**
     * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_MODEL_EVALUATION__REASON = eINSTANCE.getGoalModelEvaluation_Reason();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL_EVALUATION__EVALUATIONS = eINSTANCE.getGoalModelEvaluation_Evaluations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl <em>Goal Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GoalEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getGoalEvaluation()
     * @generated
     */
    EClass GOAL_EVALUATION = eINSTANCE.getGoalEvaluation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_EVALUATION__NAME = eINSTANCE.getGoalEvaluation_Name();

    /**
     * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_EVALUATION__VERDICT = eINSTANCE.getGoalEvaluation_Verdict();

    /**
     * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_EVALUATION__REASON = eINSTANCE.getGoalEvaluation_Reason();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl <em>Soft Goal Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.SoftGoalEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getSoftGoalEvaluation()
     * @generated
     */
    EClass SOFT_GOAL_EVALUATION = eINSTANCE.getSoftGoalEvaluation();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFT_GOAL_EVALUATION__GOAL = eINSTANCE.getSoftGoalEvaluation_Goal();

    /**
     * The meta object literal for the '<em><b>Difference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOFT_GOAL_EVALUATION__DIFFERENCE = eINSTANCE.getSoftGoalEvaluation_Difference();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.HardGoalEvaluationImpl <em>Hard Goal Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.HardGoalEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getHardGoalEvaluation()
     * @generated
     */
    EClass HARD_GOAL_EVALUATION = eINSTANCE.getHardGoalEvaluation();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARD_GOAL_EVALUATION__GOAL = eINSTANCE.getHardGoalEvaluation_Goal();

    /**
     * The meta object literal for the '<em><b>Condition Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARD_GOAL_EVALUATION__CONDITION_EVALUATION = eINSTANCE.getHardGoalEvaluation_ConditionEvaluation();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl <em>Composite Goal Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.CompositeGoalEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getCompositeGoalEvaluation()
     * @generated
     */
    EClass COMPOSITE_GOAL_EVALUATION = eINSTANCE.getCompositeGoalEvaluation();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_GOAL_EVALUATION__GOAL = eINSTANCE.getCompositeGoalEvaluation_Goal();

    /**
     * The meta object literal for the '<em><b>Condition Evaluation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_GOAL_EVALUATION__CONDITION_EVALUATION = eINSTANCE.getCompositeGoalEvaluation_ConditionEvaluation();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueExpressionEvaluationImpl <em>Value Expression Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueExpressionEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getValueExpressionEvaluation()
     * @generated
     */
    EClass VALUE_EXPRESSION_EVALUATION = eINSTANCE.getValueExpressionEvaluation();

    /**
     * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_EXPRESSION_EVALUATION__REASON = eINSTANCE.getValueExpressionEvaluation_Reason();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueSpecificationExpressionEvaluationImpl <em>Value Specification Expression Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.ValueSpecificationExpressionEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getValueSpecificationExpressionEvaluation()
     * @generated
     */
    EClass VALUE_SPECIFICATION_EXPRESSION_EVALUATION = eINSTANCE.getValueSpecificationExpressionEvaluation();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_SPECIFICATION_EXPRESSION_EVALUATION__RESULT = eINSTANCE.getValueSpecificationExpressionEvaluation_Result();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_SPECIFICATION_EXPRESSION_EVALUATION__EVALUATIONS = eINSTANCE.getValueSpecificationExpressionEvaluation_Evaluations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl <em>Boolean Expression Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.BooleanExpressionEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getBooleanExpressionEvaluation()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION_EVALUATION = eINSTANCE.getBooleanExpressionEvaluation();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION_EVALUATION__RESULT = eINSTANCE.getBooleanExpressionEvaluation_Result();

    /**
     * The meta object literal for the '<em><b>Difference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION_EVALUATION__DIFFERENCE = eINSTANCE.getBooleanExpressionEvaluation_Difference();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION_EVALUATION__EVALUATIONS = eINSTANCE.getBooleanExpressionEvaluation_Evaluations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl <em>Number Expression Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.NumberExpressionEvaluationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getNumberExpressionEvaluation()
     * @generated
     */
    EClass NUMBER_EXPRESSION_EVALUATION = eINSTANCE.getNumberExpressionEvaluation();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_EXPRESSION_EVALUATION__RESULT = eINSTANCE.getNumberExpressionEvaluation_Result();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_EXPRESSION_EVALUATION__EVALUATIONS = eINSTANCE.getNumberExpressionEvaluation_Evaluations();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind <em>Realization Level Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getRealizationLevelKind()
     * @generated
     */
    EEnum REALIZATION_LEVEL_KIND = eINSTANCE.getRealizationLevelKind();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind <em>Realization Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getRealizationTypeKind()
     * @generated
     */
    EEnum REALIZATION_TYPE_KIND = eINSTANCE.getRealizationTypeKind();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict <em>Verdict</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
     * @see eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelPackageImpl#getVerdict()
     * @generated
     */
    EEnum VERDICT = eINSTANCE.getVerdict();

  }

} //GelPackage

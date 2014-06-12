/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

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
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlFactory
 * @model kind="package"
 * @generated
 */
public interface GmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/gml/GML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GmlPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl <em>Goal Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalModel()
   * @generated
   */
  int GOAL_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL__NAME = 1;

  /**
   * The feature id for the '<em><b>Workloads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL__WORKLOADS = 2;

  /**
   * The feature id for the '<em><b>Applied Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL__APPLIED_PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL__GOALS = 4;

  /**
   * The number of structural features of the '<em>Goal Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.WorkloadImpl <em>Workload</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.WorkloadImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getWorkload()
   * @generated
   */
  int WORKLOAD = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKLOAD__NAME = 0;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKLOAD__ACTIVITY = 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKLOAD__PATTERN = 2;

  /**
   * The number of structural features of the '<em>Workload</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKLOAD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedPropertyImpl <em>Applied Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedPropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedProperty()
   * @generated
   */
  int APPLIED_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY__CONTEXT = 1;

  /**
   * The number of structural features of the '<em>Applied Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQualitativePropertyImpl <em>Applied Qualitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQualitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQualitativeProperty()
   * @generated
   */
  int APPLIED_QUALITATIVE_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY__NAME = APPLIED_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY__CONTEXT = APPLIED_PROPERTY__CONTEXT;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY__PROPERTY = APPLIED_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Applied Qualitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUALITATIVE_PROPERTY_FEATURE_COUNT = APPLIED_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl <em>Applied Quantitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQuantitativeProperty()
   * @generated
   */
  int APPLIED_QUANTITATIVE_PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY__NAME = APPLIED_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY__CONTEXT = APPLIED_PROPERTY__CONTEXT;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY__PROPERTY = APPLIED_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY__FUNCTION = APPLIED_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Workload</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD = APPLIED_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Applied Quantitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_FEATURE_COUNT = APPLIED_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__KIND = 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = 2;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getSoftGoal()
   * @generated
   */
  int SOFT_GOAL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__KIND = GOAL__KIND;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__PRIORITY = GOAL__PRIORITY;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__PROPERTY = GOAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__CONTEXT = GOAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__THRESHOLD = GOAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL__IMPACTS = GOAL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Soft Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpactImpl <em>Soft Goal Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpactImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getSoftGoalImpact()
   * @generated
   */
  int SOFT_GOAL_IMPACT = 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_IMPACT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Impact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_IMPACT__IMPACT = 1;

  /**
   * The number of structural features of the '<em>Soft Goal Impact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOFT_GOAL_IMPACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.HardGoalImpl <em>Hard Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.HardGoalImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getHardGoal()
   * @generated
   */
  int HARD_GOAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL__KIND = GOAL__KIND;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL__PRIORITY = GOAL__PRIORITY;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL__CONDITION = GOAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Success Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL__SUCCESS_RATE = GOAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hard Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARD_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.CompositeGoalImpl <em>Composite Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.CompositeGoalImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getCompositeGoal()
   * @generated
   */
  int COMPOSITE_GOAL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL__KIND = GOAL__KIND;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL__PRIORITY = GOAL__PRIORITY;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL__CONDITION = GOAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalExpressionImpl <em>Goal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalExpression()
   * @generated
   */
  int GOAL_EXPRESSION = 10;

  /**
   * The number of structural features of the '<em>Goal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImplicationImpl <em>Goal Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImplicationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalImplication()
   * @generated
   */
  int GOAL_IMPLICATION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_IMPLICATION__LEFT = GOAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_IMPLICATION__OPERATOR = GOAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_IMPLICATION__RIGHT = GOAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Goal Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_IMPLICATION_FEATURE_COUNT = GOAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalDisjunctionImpl <em>Goal Disjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalDisjunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalDisjunction()
   * @generated
   */
  int GOAL_DISJUNCTION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_DISJUNCTION__LEFT = GOAL_IMPLICATION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_DISJUNCTION__OPERATOR = GOAL_IMPLICATION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_DISJUNCTION__RIGHT = GOAL_IMPLICATION__RIGHT;

  /**
   * The number of structural features of the '<em>Goal Disjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_DISJUNCTION_FEATURE_COUNT = GOAL_IMPLICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalConjunctionImpl <em>Goal Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalConjunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalConjunction()
   * @generated
   */
  int GOAL_CONJUNCTION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_CONJUNCTION__LEFT = GOAL_DISJUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_CONJUNCTION__OPERATOR = GOAL_DISJUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_CONJUNCTION__RIGHT = GOAL_DISJUNCTION__RIGHT;

  /**
   * The number of structural features of the '<em>Goal Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_CONJUNCTION_FEATURE_COUNT = GOAL_DISJUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalComparisonImpl <em>Goal Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalComparisonImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalComparison()
   * @generated
   */
  int GOAL_COMPARISON = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_COMPARISON__LEFT = GOAL_CONJUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_COMPARISON__OPERATOR = GOAL_CONJUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_COMPARISON__RIGHT = GOAL_CONJUNCTION__RIGHT;

  /**
   * The number of structural features of the '<em>Goal Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_COMPARISON_FEATURE_COUNT = GOAL_CONJUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanUnitImpl <em>Goal Boolean Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanUnitImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalBooleanUnit()
   * @generated
   */
  int GOAL_BOOLEAN_UNIT = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_UNIT__LEFT = GOAL_COMPARISON__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_UNIT__OPERATOR = GOAL_COMPARISON__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_UNIT__RIGHT = GOAL_COMPARISON__RIGHT;

  /**
   * The number of structural features of the '<em>Goal Boolean Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_UNIT_FEATURE_COUNT = GOAL_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalNegationImpl <em>Goal Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalNegationImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalNegation()
   * @generated
   */
  int GOAL_NEGATION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_NEGATION__LEFT = GOAL_BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_NEGATION__OPERATOR = GOAL_BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_NEGATION__RIGHT = GOAL_BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_NEGATION__VALUE = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goal Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_NEGATION_FEATURE_COUNT = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanLiteralImpl <em>Goal Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalBooleanLiteral()
   * @generated
   */
  int GOAL_BOOLEAN_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_LITERAL__LEFT = GOAL_BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_LITERAL__OPERATOR = GOAL_BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_LITERAL__RIGHT = GOAL_BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_LITERAL__VALUE = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goal Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_BOOLEAN_LITERAL_FEATURE_COUNT = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalReferenceImpl <em>Goal Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalReferenceImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalReference()
   * @generated
   */
  int GOAL_REFERENCE = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_REFERENCE__LEFT = GOAL_BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_REFERENCE__OPERATOR = GOAL_BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_REFERENCE__RIGHT = GOAL_BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_REFERENCE__VALUE = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goal Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_REFERENCE_FEATURE_COUNT = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.ParenthesizedGoalExpressionImpl <em>Parenthesized Goal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.ParenthesizedGoalExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getParenthesizedGoalExpression()
   * @generated
   */
  int PARENTHESIZED_GOAL_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_GOAL_EXPRESSION__LEFT = GOAL_BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_GOAL_EXPRESSION__OPERATOR = GOAL_BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_GOAL_EXPRESSION__RIGHT = GOAL_BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_GOAL_EXPRESSION__VALUE = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesized Goal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_GOAL_EXPRESSION_FEATURE_COUNT = GOAL_BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyExpressionImpl <em>Applied Quantitative Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQuantitativePropertyExpression()
   * @generated
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__LEFT = ArtistCommonPackage.NUMBER_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__OPERATOR = ArtistCommonPackage.NUMBER_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__RIGHT = ArtistCommonPackage.NUMBER_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__VALUE = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Applied Quantitative Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION_FEATURE_COUNT = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind <em>Goal Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalKind()
   * @generated
   */
  int GOAL_KIND = 21;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel <em>Goal Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Model</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel
   * @generated
   */
  EClass getGoalModel();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getImports()
   * @see #getGoalModel()
   * @generated
   */
  EReference getGoalModel_Imports();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getName()
   * @see #getGoalModel()
   * @generated
   */
  EAttribute getGoalModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getWorkloads <em>Workloads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Workloads</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getWorkloads()
   * @see #getGoalModel()
   * @generated
   */
  EReference getGoalModel_Workloads();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getAppliedProperties <em>Applied Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applied Properties</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getAppliedProperties()
   * @see #getGoalModel()
   * @generated
   */
  EReference getGoalModel_AppliedProperties();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel#getGoals()
   * @see #getGoalModel()
   * @generated
   */
  EReference getGoalModel_Goals();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Workload <em>Workload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workload</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Workload
   * @generated
   */
  EClass getWorkload();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getName()
   * @see #getWorkload()
   * @generated
   */
  EAttribute getWorkload_Name();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getActivity()
   * @see #getWorkload()
   * @generated
   */
  EReference getWorkload_Activity();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Workload#getPattern()
   * @see #getWorkload()
   * @generated
   */
  EAttribute getWorkload_Pattern();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty <em>Applied Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty
   * @generated
   */
  EClass getAppliedProperty();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty#getName()
   * @see #getAppliedProperty()
   * @generated
   */
  EAttribute getAppliedProperty_Name();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Context</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty#getContext()
   * @see #getAppliedProperty()
   * @generated
   */
  EReference getAppliedProperty_Context();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty <em>Applied Qualitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Qualitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty
   * @generated
   */
  EClass getAppliedQualitativeProperty();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty#getProperty()
   * @see #getAppliedQualitativeProperty()
   * @generated
   */
  EReference getAppliedQualitativeProperty_Property();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty <em>Applied Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Quantitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty
   * @generated
   */
  EClass getAppliedQuantitativeProperty();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getProperty()
   * @see #getAppliedQuantitativeProperty()
   * @generated
   */
  EReference getAppliedQuantitativeProperty_Property();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getFunction()
   * @see #getAppliedQuantitativeProperty()
   * @generated
   */
  EReference getAppliedQuantitativeProperty_Function();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getWorkload <em>Workload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Workload</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getWorkload()
   * @see #getAppliedQuantitativeProperty()
   * @generated
   */
  EReference getAppliedQuantitativeProperty_Workload();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getKind()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Kind();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Goal#getPriority()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Priority();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal <em>Soft Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soft Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal
   * @generated
   */
  EClass getSoftGoal();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getProperty()
   * @see #getSoftGoal()
   * @generated
   */
  EReference getSoftGoal_Property();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Context</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getContext()
   * @see #getSoftGoal()
   * @generated
   */
  EReference getSoftGoal_Context();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getThreshold()
   * @see #getSoftGoal()
   * @generated
   */
  EAttribute getSoftGoal_Threshold();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getImpacts <em>Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Impacts</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal#getImpacts()
   * @see #getSoftGoal()
   * @generated
   */
  EReference getSoftGoal_Impacts();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact <em>Soft Goal Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soft Goal Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact
   * @generated
   */
  EClass getSoftGoalImpact();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact#getTarget()
   * @see #getSoftGoalImpact()
   * @generated
   */
  EReference getSoftGoalImpact_Target();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact#getImpact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact#getImpact()
   * @see #getSoftGoalImpact()
   * @generated
   */
  EAttribute getSoftGoalImpact_Impact();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal <em>Hard Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hard Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal
   * @generated
   */
  EClass getHardGoal();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal#getCondition()
   * @see #getHardGoal()
   * @generated
   */
  EReference getHardGoal_Condition();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal#getSuccessRate <em>Success Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Success Rate</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal#getSuccessRate()
   * @see #getHardGoal()
   * @generated
   */
  EAttribute getHardGoal_SuccessRate();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal <em>Composite Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Goal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal
   * @generated
   */
  EClass getCompositeGoal();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal#getCondition()
   * @see #getCompositeGoal()
   * @generated
   */
  EReference getCompositeGoal_Condition();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression <em>Goal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression
   * @generated
   */
  EClass getGoalExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication <em>Goal Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Implication</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication
   * @generated
   */
  EClass getGoalImplication();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getLeft()
   * @see #getGoalImplication()
   * @generated
   */
  EReference getGoalImplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getOperator()
   * @see #getGoalImplication()
   * @generated
   */
  EReference getGoalImplication_Operator();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication#getRight()
   * @see #getGoalImplication()
   * @generated
   */
  EReference getGoalImplication_Right();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction <em>Goal Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Disjunction</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction
   * @generated
   */
  EClass getGoalDisjunction();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction <em>Goal Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Conjunction</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction
   * @generated
   */
  EClass getGoalConjunction();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison <em>Goal Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Comparison</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison
   * @generated
   */
  EClass getGoalComparison();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit <em>Goal Boolean Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Boolean Unit</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit
   * @generated
   */
  EClass getGoalBooleanUnit();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation <em>Goal Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Negation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation
   * @generated
   */
  EClass getGoalNegation();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation#getValue()
   * @see #getGoalNegation()
   * @generated
   */
  EReference getGoalNegation_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral <em>Goal Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Boolean Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral
   * @generated
   */
  EClass getGoalBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral#getValue()
   * @see #getGoalBooleanLiteral()
   * @generated
   */
  EAttribute getGoalBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference <em>Goal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal Reference</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference
   * @generated
   */
  EClass getGoalReference();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference#getValue()
   * @see #getGoalReference()
   * @generated
   */
  EReference getGoalReference_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression <em>Parenthesized Goal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Goal Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression
   * @generated
   */
  EClass getParenthesizedGoalExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression#getValue()
   * @see #getParenthesizedGoalExpression()
   * @generated
   */
  EReference getParenthesizedGoalExpression_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression <em>Applied Quantitative Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applied Quantitative Property Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression
   * @generated
   */
  EClass getAppliedQuantitativePropertyExpression();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression#getValue()
   * @see #getAppliedQuantitativePropertyExpression()
   * @generated
   */
  EReference getAppliedQuantitativePropertyExpression_Value();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind <em>Goal Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Goal Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind
   * @generated
   */
  EEnum getGoalKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GmlFactory getGmlFactory();

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
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl <em>Goal Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalModelImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalModel()
     * @generated
     */
    EClass GOAL_MODEL = eINSTANCE.getGoalModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL__IMPORTS = eINSTANCE.getGoalModel_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_MODEL__NAME = eINSTANCE.getGoalModel_Name();

    /**
     * The meta object literal for the '<em><b>Workloads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL__WORKLOADS = eINSTANCE.getGoalModel_Workloads();

    /**
     * The meta object literal for the '<em><b>Applied Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL__APPLIED_PROPERTIES = eINSTANCE.getGoalModel_AppliedProperties();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_MODEL__GOALS = eINSTANCE.getGoalModel_Goals();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.WorkloadImpl <em>Workload</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.WorkloadImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getWorkload()
     * @generated
     */
    EClass WORKLOAD = eINSTANCE.getWorkload();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKLOAD__ACTIVITY = eINSTANCE.getWorkload_Activity();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKLOAD__PATTERN = eINSTANCE.getWorkload_Pattern();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedPropertyImpl <em>Applied Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedPropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedProperty()
     * @generated
     */
    EClass APPLIED_PROPERTY = eINSTANCE.getAppliedProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLIED_PROPERTY__NAME = eINSTANCE.getAppliedProperty_Name();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_PROPERTY__CONTEXT = eINSTANCE.getAppliedProperty_Context();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQualitativePropertyImpl <em>Applied Qualitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQualitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQualitativeProperty()
     * @generated
     */
    EClass APPLIED_QUALITATIVE_PROPERTY = eINSTANCE.getAppliedQualitativeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUALITATIVE_PROPERTY__PROPERTY = eINSTANCE.getAppliedQualitativeProperty_Property();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl <em>Applied Quantitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQuantitativeProperty()
     * @generated
     */
    EClass APPLIED_QUANTITATIVE_PROPERTY = eINSTANCE.getAppliedQuantitativeProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY__PROPERTY = eINSTANCE.getAppliedQuantitativeProperty_Property();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY__FUNCTION = eINSTANCE.getAppliedQuantitativeProperty_Function();

    /**
     * The meta object literal for the '<em><b>Workload</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD = eINSTANCE.getAppliedQuantitativeProperty_Workload();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__KIND = eINSTANCE.getGoal_Kind();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getSoftGoal()
     * @generated
     */
    EClass SOFT_GOAL = eINSTANCE.getSoftGoal();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFT_GOAL__PROPERTY = eINSTANCE.getSoftGoal_Property();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFT_GOAL__CONTEXT = eINSTANCE.getSoftGoal_Context();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOFT_GOAL__THRESHOLD = eINSTANCE.getSoftGoal_Threshold();

    /**
     * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFT_GOAL__IMPACTS = eINSTANCE.getSoftGoal_Impacts();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpactImpl <em>Soft Goal Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.SoftGoalImpactImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getSoftGoalImpact()
     * @generated
     */
    EClass SOFT_GOAL_IMPACT = eINSTANCE.getSoftGoalImpact();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOFT_GOAL_IMPACT__TARGET = eINSTANCE.getSoftGoalImpact_Target();

    /**
     * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOFT_GOAL_IMPACT__IMPACT = eINSTANCE.getSoftGoalImpact_Impact();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.HardGoalImpl <em>Hard Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.HardGoalImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getHardGoal()
     * @generated
     */
    EClass HARD_GOAL = eINSTANCE.getHardGoal();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARD_GOAL__CONDITION = eINSTANCE.getHardGoal_Condition();

    /**
     * The meta object literal for the '<em><b>Success Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARD_GOAL__SUCCESS_RATE = eINSTANCE.getHardGoal_SuccessRate();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.CompositeGoalImpl <em>Composite Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.CompositeGoalImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getCompositeGoal()
     * @generated
     */
    EClass COMPOSITE_GOAL = eINSTANCE.getCompositeGoal();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_GOAL__CONDITION = eINSTANCE.getCompositeGoal_Condition();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalExpressionImpl <em>Goal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalExpression()
     * @generated
     */
    EClass GOAL_EXPRESSION = eINSTANCE.getGoalExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImplicationImpl <em>Goal Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalImplicationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalImplication()
     * @generated
     */
    EClass GOAL_IMPLICATION = eINSTANCE.getGoalImplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_IMPLICATION__LEFT = eINSTANCE.getGoalImplication_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_IMPLICATION__OPERATOR = eINSTANCE.getGoalImplication_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_IMPLICATION__RIGHT = eINSTANCE.getGoalImplication_Right();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalDisjunctionImpl <em>Goal Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalDisjunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalDisjunction()
     * @generated
     */
    EClass GOAL_DISJUNCTION = eINSTANCE.getGoalDisjunction();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalConjunctionImpl <em>Goal Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalConjunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalConjunction()
     * @generated
     */
    EClass GOAL_CONJUNCTION = eINSTANCE.getGoalConjunction();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalComparisonImpl <em>Goal Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalComparisonImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalComparison()
     * @generated
     */
    EClass GOAL_COMPARISON = eINSTANCE.getGoalComparison();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanUnitImpl <em>Goal Boolean Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanUnitImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalBooleanUnit()
     * @generated
     */
    EClass GOAL_BOOLEAN_UNIT = eINSTANCE.getGoalBooleanUnit();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalNegationImpl <em>Goal Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalNegationImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalNegation()
     * @generated
     */
    EClass GOAL_NEGATION = eINSTANCE.getGoalNegation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_NEGATION__VALUE = eINSTANCE.getGoalNegation_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanLiteralImpl <em>Goal Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalBooleanLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalBooleanLiteral()
     * @generated
     */
    EClass GOAL_BOOLEAN_LITERAL = eINSTANCE.getGoalBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL_BOOLEAN_LITERAL__VALUE = eINSTANCE.getGoalBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalReferenceImpl <em>Goal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GoalReferenceImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalReference()
     * @generated
     */
    EClass GOAL_REFERENCE = eINSTANCE.getGoalReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL_REFERENCE__VALUE = eINSTANCE.getGoalReference_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.ParenthesizedGoalExpressionImpl <em>Parenthesized Goal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.ParenthesizedGoalExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getParenthesizedGoalExpression()
     * @generated
     */
    EClass PARENTHESIZED_GOAL_EXPRESSION = eINSTANCE.getParenthesizedGoalExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_GOAL_EXPRESSION__VALUE = eINSTANCE.getParenthesizedGoalExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyExpressionImpl <em>Applied Quantitative Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.AppliedQuantitativePropertyExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getAppliedQuantitativePropertyExpression()
     * @generated
     */
    EClass APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION = eINSTANCE.getAppliedQuantitativePropertyExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__VALUE = eINSTANCE.getAppliedQuantitativePropertyExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind <em>Goal Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind
     * @see eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlPackageImpl#getGoalKind()
     * @generated
     */
    EEnum GOAL_KIND = eINSTANCE.getGoalKind();

  }

} //GmlPackage

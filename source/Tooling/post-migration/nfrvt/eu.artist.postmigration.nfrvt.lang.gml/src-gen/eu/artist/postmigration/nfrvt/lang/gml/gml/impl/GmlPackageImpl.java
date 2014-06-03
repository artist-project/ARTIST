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
package eu.artist.postmigration.nfrvt.lang.gml.gml.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlFactory;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;

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
public class GmlPackageImpl extends EPackageImpl implements GmlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workloadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedQualitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedQuantitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass softGoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass softGoalImpactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hardGoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeGoalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalDisjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalConjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalBooleanUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedGoalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedQuantitativePropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum goalKindEEnum = null;

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
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GmlPackageImpl()
  {
    super(eNS_URI, GmlFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GmlPackage init()
  {
    if (isInited) return (GmlPackage)EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI);

    // Obtain or create and register package
    GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GmlPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    NslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGmlPackage.createPackageContents();

    // Initialize created meta-data
    theGmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGmlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GmlPackage.eNS_URI, theGmlPackage);
    return theGmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalModel()
  {
    return goalModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModel_Imports()
  {
    return (EReference)goalModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalModel_Name()
  {
    return (EAttribute)goalModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModel_Workloads()
  {
    return (EReference)goalModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModel_AppliedProperties()
  {
    return (EReference)goalModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalModel_Goals()
  {
    return (EReference)goalModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkload()
  {
    return workloadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkload_Name()
  {
    return (EAttribute)workloadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkload_Activity()
  {
    return (EReference)workloadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkload_Pattern()
  {
    return (EAttribute)workloadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedProperty()
  {
    return appliedPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppliedProperty_Name()
  {
    return (EAttribute)appliedPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedProperty_Context()
  {
    return (EReference)appliedPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedQualitativeProperty()
  {
    return appliedQualitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQualitativeProperty_Property()
  {
    return (EReference)appliedQualitativePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedQuantitativeProperty()
  {
    return appliedQuantitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativeProperty_Property()
  {
    return (EReference)appliedQuantitativePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativeProperty_Function()
  {
    return (EReference)appliedQuantitativePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativeProperty_Workload()
  {
    return (EReference)appliedQuantitativePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal()
  {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Name()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Kind()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Priority()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoftGoal()
  {
    return softGoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftGoal_Property()
  {
    return (EReference)softGoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftGoal_Context()
  {
    return (EReference)softGoalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftGoal_Threshold()
  {
    return (EAttribute)softGoalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftGoal_Impacts()
  {
    return (EReference)softGoalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoftGoalImpact()
  {
    return softGoalImpactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoftGoalImpact_Target()
  {
    return (EReference)softGoalImpactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSoftGoalImpact_Impact()
  {
    return (EAttribute)softGoalImpactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHardGoal()
  {
    return hardGoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardGoal_Condition()
  {
    return (EReference)hardGoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardGoal_SuccessRate()
  {
    return (EAttribute)hardGoalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeGoal()
  {
    return compositeGoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeGoal_Condition()
  {
    return (EReference)compositeGoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalExpression()
  {
    return goalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalImplication()
  {
    return goalImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalImplication_Left()
  {
    return (EReference)goalImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalImplication_Operator()
  {
    return (EReference)goalImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalImplication_Right()
  {
    return (EReference)goalImplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalDisjunction()
  {
    return goalDisjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalConjunction()
  {
    return goalConjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalComparison()
  {
    return goalComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalBooleanUnit()
  {
    return goalBooleanUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalNegation()
  {
    return goalNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalNegation_Value()
  {
    return (EReference)goalNegationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalBooleanLiteral()
  {
    return goalBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoalBooleanLiteral_Value()
  {
    return (EAttribute)goalBooleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoalReference()
  {
    return goalReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoalReference_Value()
  {
    return (EReference)goalReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesizedGoalExpression()
  {
    return parenthesizedGoalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesizedGoalExpression_Value()
  {
    return (EReference)parenthesizedGoalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedQuantitativePropertyExpression()
  {
    return appliedQuantitativePropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedQuantitativePropertyExpression_Value()
  {
    return (EReference)appliedQuantitativePropertyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGoalKind()
  {
    return goalKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlFactory getGmlFactory()
  {
    return (GmlFactory)getEFactoryInstance();
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
    goalModelEClass = createEClass(GOAL_MODEL);
    createEReference(goalModelEClass, GOAL_MODEL__IMPORTS);
    createEAttribute(goalModelEClass, GOAL_MODEL__NAME);
    createEReference(goalModelEClass, GOAL_MODEL__WORKLOADS);
    createEReference(goalModelEClass, GOAL_MODEL__APPLIED_PROPERTIES);
    createEReference(goalModelEClass, GOAL_MODEL__GOALS);

    workloadEClass = createEClass(WORKLOAD);
    createEAttribute(workloadEClass, WORKLOAD__NAME);
    createEReference(workloadEClass, WORKLOAD__ACTIVITY);
    createEAttribute(workloadEClass, WORKLOAD__PATTERN);

    appliedPropertyEClass = createEClass(APPLIED_PROPERTY);
    createEAttribute(appliedPropertyEClass, APPLIED_PROPERTY__NAME);
    createEReference(appliedPropertyEClass, APPLIED_PROPERTY__CONTEXT);

    appliedQualitativePropertyEClass = createEClass(APPLIED_QUALITATIVE_PROPERTY);
    createEReference(appliedQualitativePropertyEClass, APPLIED_QUALITATIVE_PROPERTY__PROPERTY);

    appliedQuantitativePropertyEClass = createEClass(APPLIED_QUANTITATIVE_PROPERTY);
    createEReference(appliedQuantitativePropertyEClass, APPLIED_QUANTITATIVE_PROPERTY__PROPERTY);
    createEReference(appliedQuantitativePropertyEClass, APPLIED_QUANTITATIVE_PROPERTY__FUNCTION);
    createEReference(appliedQuantitativePropertyEClass, APPLIED_QUANTITATIVE_PROPERTY__WORKLOAD);

    goalEClass = createEClass(GOAL);
    createEAttribute(goalEClass, GOAL__NAME);
    createEAttribute(goalEClass, GOAL__KIND);
    createEAttribute(goalEClass, GOAL__PRIORITY);

    softGoalEClass = createEClass(SOFT_GOAL);
    createEReference(softGoalEClass, SOFT_GOAL__PROPERTY);
    createEReference(softGoalEClass, SOFT_GOAL__CONTEXT);
    createEAttribute(softGoalEClass, SOFT_GOAL__THRESHOLD);
    createEReference(softGoalEClass, SOFT_GOAL__IMPACTS);

    softGoalImpactEClass = createEClass(SOFT_GOAL_IMPACT);
    createEReference(softGoalImpactEClass, SOFT_GOAL_IMPACT__TARGET);
    createEAttribute(softGoalImpactEClass, SOFT_GOAL_IMPACT__IMPACT);

    hardGoalEClass = createEClass(HARD_GOAL);
    createEReference(hardGoalEClass, HARD_GOAL__CONDITION);
    createEAttribute(hardGoalEClass, HARD_GOAL__SUCCESS_RATE);

    compositeGoalEClass = createEClass(COMPOSITE_GOAL);
    createEReference(compositeGoalEClass, COMPOSITE_GOAL__CONDITION);

    goalExpressionEClass = createEClass(GOAL_EXPRESSION);

    goalImplicationEClass = createEClass(GOAL_IMPLICATION);
    createEReference(goalImplicationEClass, GOAL_IMPLICATION__LEFT);
    createEReference(goalImplicationEClass, GOAL_IMPLICATION__OPERATOR);
    createEReference(goalImplicationEClass, GOAL_IMPLICATION__RIGHT);

    goalDisjunctionEClass = createEClass(GOAL_DISJUNCTION);

    goalConjunctionEClass = createEClass(GOAL_CONJUNCTION);

    goalComparisonEClass = createEClass(GOAL_COMPARISON);

    goalBooleanUnitEClass = createEClass(GOAL_BOOLEAN_UNIT);

    goalNegationEClass = createEClass(GOAL_NEGATION);
    createEReference(goalNegationEClass, GOAL_NEGATION__VALUE);

    goalBooleanLiteralEClass = createEClass(GOAL_BOOLEAN_LITERAL);
    createEAttribute(goalBooleanLiteralEClass, GOAL_BOOLEAN_LITERAL__VALUE);

    goalReferenceEClass = createEClass(GOAL_REFERENCE);
    createEReference(goalReferenceEClass, GOAL_REFERENCE__VALUE);

    parenthesizedGoalExpressionEClass = createEClass(PARENTHESIZED_GOAL_EXPRESSION);
    createEReference(parenthesizedGoalExpressionEClass, PARENTHESIZED_GOAL_EXPRESSION__VALUE);

    appliedQuantitativePropertyExpressionEClass = createEClass(APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION);
    createEReference(appliedQuantitativePropertyExpressionEClass, APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION__VALUE);

    // Create enums
    goalKindEEnum = createEEnum(GOAL_KIND);
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
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    NslPackage theNslPackage = (NslPackage)EPackage.Registry.INSTANCE.getEPackage(NslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    appliedQualitativePropertyEClass.getESuperTypes().add(this.getAppliedProperty());
    appliedQuantitativePropertyEClass.getESuperTypes().add(this.getAppliedProperty());
    softGoalEClass.getESuperTypes().add(this.getGoal());
    hardGoalEClass.getESuperTypes().add(this.getGoal());
    compositeGoalEClass.getESuperTypes().add(this.getGoal());
    goalImplicationEClass.getESuperTypes().add(this.getGoalExpression());
    goalDisjunctionEClass.getESuperTypes().add(this.getGoalImplication());
    goalConjunctionEClass.getESuperTypes().add(this.getGoalDisjunction());
    goalComparisonEClass.getESuperTypes().add(this.getGoalConjunction());
    goalBooleanUnitEClass.getESuperTypes().add(this.getGoalComparison());
    goalNegationEClass.getESuperTypes().add(this.getGoalBooleanUnit());
    goalBooleanLiteralEClass.getESuperTypes().add(this.getGoalBooleanUnit());
    goalReferenceEClass.getESuperTypes().add(this.getGoalBooleanUnit());
    parenthesizedGoalExpressionEClass.getESuperTypes().add(this.getGoalBooleanUnit());
    appliedQuantitativePropertyExpressionEClass.getESuperTypes().add(theArtistCommonPackage.getNumberExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(goalModelEClass, GoalModel.class, "GoalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoalModel_Imports(), theArtistCommonPackage.getImportNamespace(), null, "imports", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoalModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalModel_Workloads(), this.getWorkload(), null, "workloads", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalModel_AppliedProperties(), this.getAppliedProperty(), null, "appliedProperties", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalModel_Goals(), this.getGoal(), null, "goals", null, 0, -1, GoalModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkload_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkload_Activity(), theUMLPackage.getActivity(), null, "activity", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkload_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedPropertyEClass, AppliedProperty.class, "AppliedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAppliedProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AppliedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedProperty_Context(), theUMLPackage.getNamedElement(), null, "context", null, 0, -1, AppliedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedQualitativePropertyEClass, AppliedQualitativeProperty.class, "AppliedQualitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedQualitativeProperty_Property(), theNslPackage.getQualitativeProperty(), null, "property", null, 0, 1, AppliedQualitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedQuantitativePropertyEClass, AppliedQuantitativeProperty.class, "AppliedQuantitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedQuantitativeProperty_Property(), theNslPackage.getQuantitativeProperty(), null, "property", null, 0, 1, AppliedQuantitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedQuantitativeProperty_Function(), theArtistCommonPackage.getOperator(), null, "function", null, 0, 1, AppliedQuantitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedQuantitativeProperty_Workload(), this.getWorkload(), null, "workload", null, 0, 1, AppliedQuantitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoal_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Kind(), this.getGoalKind(), "kind", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Priority(), theEcorePackage.getEInt(), "priority", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softGoalEClass, SoftGoal.class, "SoftGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoftGoal_Property(), this.getAppliedQualitativeProperty(), null, "property", null, 0, 1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSoftGoal_Context(), theUMLPackage.getNamedElement(), null, "context", null, 0, -1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftGoal_Threshold(), theEcorePackage.getEBigDecimal(), "threshold", null, 0, 1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSoftGoal_Impacts(), this.getSoftGoalImpact(), null, "impacts", null, 0, -1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(softGoalImpactEClass, SoftGoalImpact.class, "SoftGoalImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoftGoalImpact_Target(), this.getSoftGoal(), null, "target", null, 0, 1, SoftGoalImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSoftGoalImpact_Impact(), theEcorePackage.getEBigDecimal(), "impact", null, 0, 1, SoftGoalImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hardGoalEClass, HardGoal.class, "HardGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHardGoal_Condition(), theArtistCommonPackage.getExpression(), null, "condition", null, 0, 1, HardGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHardGoal_SuccessRate(), theEcorePackage.getEBigDecimal(), "successRate", null, 0, 1, HardGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeGoalEClass, CompositeGoal.class, "CompositeGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeGoal_Condition(), this.getGoalExpression(), null, "condition", null, 0, 1, CompositeGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalExpressionEClass, GoalExpression.class, "GoalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalImplicationEClass, GoalImplication.class, "GoalImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoalImplication_Left(), this.getGoalDisjunction(), null, "left", null, 0, 1, GoalImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalImplication_Operator(), theArtistCommonPackage.getOperator(), null, "operator", null, 0, 1, GoalImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoalImplication_Right(), this.getGoalDisjunction(), null, "right", null, 0, 1, GoalImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalDisjunctionEClass, GoalDisjunction.class, "GoalDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalConjunctionEClass, GoalConjunction.class, "GoalConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalComparisonEClass, GoalComparison.class, "GoalComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalBooleanUnitEClass, GoalBooleanUnit.class, "GoalBooleanUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(goalNegationEClass, GoalNegation.class, "GoalNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoalNegation_Value(), this.getGoalBooleanUnit(), null, "value", null, 0, 1, GoalNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalBooleanLiteralEClass, GoalBooleanLiteral.class, "GoalBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoalBooleanLiteral_Value(), theEcorePackage.getEBooleanObject(), "value", null, 0, 1, GoalBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalReferenceEClass, GoalReference.class, "GoalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoalReference_Value(), this.getGoal(), null, "value", null, 0, 1, GoalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesizedGoalExpressionEClass, ParenthesizedGoalExpression.class, "ParenthesizedGoalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesizedGoalExpression_Value(), this.getGoalExpression(), null, "value", null, 0, 1, ParenthesizedGoalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliedQuantitativePropertyExpressionEClass, AppliedQuantitativePropertyExpression.class, "AppliedQuantitativePropertyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedQuantitativePropertyExpression_Value(), this.getAppliedQuantitativeProperty(), null, "value", null, 0, 1, AppliedQuantitativePropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(goalKindEEnum, GoalKind.class, "GoalKind");
    addEEnumLiteral(goalKindEEnum, GoalKind.REQUIRED);
    addEEnumLiteral(goalKindEEnum, GoalKind.OFFERED);
    addEEnumLiteral(goalKindEEnum, GoalKind.CONTRACT);

    // Create resource
    createResource(eNS_URI);
  }

} //GmlPackageImpl

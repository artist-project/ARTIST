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

import eu.artist.postmigration.nfrvt.lang.gml.gml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class GmlFactoryImpl extends EFactoryImpl implements GmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GmlFactory init()
  {
    try
    {
      GmlFactory theGmlFactory = (GmlFactory)EPackage.Registry.INSTANCE.getEFactory(GmlPackage.eNS_URI);
      if (theGmlFactory != null)
      {
        return theGmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlFactoryImpl()
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
      case GmlPackage.GOAL_MODEL: return createGoalModel();
      case GmlPackage.WORKLOAD: return createWorkload();
      case GmlPackage.APPLIED_QUALITATIVE_PROPERTY: return createAppliedQualitativeProperty();
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY: return createAppliedQuantitativeProperty();
      case GmlPackage.GOAL: return createGoal();
      case GmlPackage.SOFT_GOAL: return createSoftGoal();
      case GmlPackage.SOFT_GOAL_IMPACT: return createSoftGoalImpact();
      case GmlPackage.HARD_GOAL: return createHardGoal();
      case GmlPackage.COMPOSITE_GOAL: return createCompositeGoal();
      case GmlPackage.GOAL_EXPRESSION: return createGoalExpression();
      case GmlPackage.GOAL_IMPLICATION: return createGoalImplication();
      case GmlPackage.GOAL_DISJUNCTION: return createGoalDisjunction();
      case GmlPackage.GOAL_CONJUNCTION: return createGoalConjunction();
      case GmlPackage.GOAL_COMPARISON: return createGoalComparison();
      case GmlPackage.GOAL_BOOLEAN_UNIT: return createGoalBooleanUnit();
      case GmlPackage.GOAL_NEGATION: return createGoalNegation();
      case GmlPackage.GOAL_BOOLEAN_LITERAL: return createGoalBooleanLiteral();
      case GmlPackage.GOAL_REFERENCE: return createGoalReference();
      case GmlPackage.PARENTHESIZED_GOAL_EXPRESSION: return createParenthesizedGoalExpression();
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION: return createAppliedQuantitativePropertyExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GmlPackage.GOAL_KIND:
        return createGoalKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GmlPackage.GOAL_KIND:
        return convertGoalKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalModel createGoalModel()
  {
    GoalModelImpl goalModel = new GoalModelImpl();
    return goalModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workload createWorkload()
  {
    WorkloadImpl workload = new WorkloadImpl();
    return workload;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQualitativeProperty createAppliedQualitativeProperty()
  {
    AppliedQualitativePropertyImpl appliedQualitativeProperty = new AppliedQualitativePropertyImpl();
    return appliedQualitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQuantitativeProperty createAppliedQuantitativeProperty()
  {
    AppliedQuantitativePropertyImpl appliedQuantitativeProperty = new AppliedQuantitativePropertyImpl();
    return appliedQuantitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftGoal createSoftGoal()
  {
    SoftGoalImpl softGoal = new SoftGoalImpl();
    return softGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftGoalImpact createSoftGoalImpact()
  {
    SoftGoalImpactImpl softGoalImpact = new SoftGoalImpactImpl();
    return softGoalImpact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardGoal createHardGoal()
  {
    HardGoalImpl hardGoal = new HardGoalImpl();
    return hardGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeGoal createCompositeGoal()
  {
    CompositeGoalImpl compositeGoal = new CompositeGoalImpl();
    return compositeGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalExpression createGoalExpression()
  {
    GoalExpressionImpl goalExpression = new GoalExpressionImpl();
    return goalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalImplication createGoalImplication()
  {
    GoalImplicationImpl goalImplication = new GoalImplicationImpl();
    return goalImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalDisjunction createGoalDisjunction()
  {
    GoalDisjunctionImpl goalDisjunction = new GoalDisjunctionImpl();
    return goalDisjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalConjunction createGoalConjunction()
  {
    GoalConjunctionImpl goalConjunction = new GoalConjunctionImpl();
    return goalConjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalComparison createGoalComparison()
  {
    GoalComparisonImpl goalComparison = new GoalComparisonImpl();
    return goalComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalBooleanUnit createGoalBooleanUnit()
  {
    GoalBooleanUnitImpl goalBooleanUnit = new GoalBooleanUnitImpl();
    return goalBooleanUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalNegation createGoalNegation()
  {
    GoalNegationImpl goalNegation = new GoalNegationImpl();
    return goalNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalBooleanLiteral createGoalBooleanLiteral()
  {
    GoalBooleanLiteralImpl goalBooleanLiteral = new GoalBooleanLiteralImpl();
    return goalBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalReference createGoalReference()
  {
    GoalReferenceImpl goalReference = new GoalReferenceImpl();
    return goalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedGoalExpression createParenthesizedGoalExpression()
  {
    ParenthesizedGoalExpressionImpl parenthesizedGoalExpression = new ParenthesizedGoalExpressionImpl();
    return parenthesizedGoalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQuantitativePropertyExpression createAppliedQuantitativePropertyExpression()
  {
    AppliedQuantitativePropertyExpressionImpl appliedQuantitativePropertyExpression = new AppliedQuantitativePropertyExpressionImpl();
    return appliedQuantitativePropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalKind createGoalKindFromString(EDataType eDataType, String initialValue)
  {
    GoalKind result = GoalKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGoalKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlPackage getGmlPackage()
  {
    return (GmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GmlPackage getPackage()
  {
    return GmlPackage.eINSTANCE;
  }

} //GmlFactoryImpl

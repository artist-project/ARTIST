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
package eu.artist.postmigration.nfrvt.lang.gml.gml.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;

import eu.artist.postmigration.nfrvt.lang.gml.gml.*;

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
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage
 * @generated
 */
public class GmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GmlPackage.eINSTANCE;
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
      case GmlPackage.GOAL_MODEL:
      {
        GoalModel goalModel = (GoalModel)theEObject;
        T result = caseGoalModel(goalModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.WORKLOAD:
      {
        Workload workload = (Workload)theEObject;
        T result = caseWorkload(workload);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.APPLIED_PROPERTY:
      {
        AppliedProperty appliedProperty = (AppliedProperty)theEObject;
        T result = caseAppliedProperty(appliedProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.APPLIED_QUALITATIVE_PROPERTY:
      {
        AppliedQualitativeProperty appliedQualitativeProperty = (AppliedQualitativeProperty)theEObject;
        T result = caseAppliedQualitativeProperty(appliedQualitativeProperty);
        if (result == null) result = caseAppliedProperty(appliedQualitativeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY:
      {
        AppliedQuantitativeProperty appliedQuantitativeProperty = (AppliedQuantitativeProperty)theEObject;
        T result = caseAppliedQuantitativeProperty(appliedQuantitativeProperty);
        if (result == null) result = caseAppliedProperty(appliedQuantitativeProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.SOFT_GOAL:
      {
        SoftGoal softGoal = (SoftGoal)theEObject;
        T result = caseSoftGoal(softGoal);
        if (result == null) result = caseGoal(softGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.SOFT_GOAL_IMPACT:
      {
        SoftGoalImpact softGoalImpact = (SoftGoalImpact)theEObject;
        T result = caseSoftGoalImpact(softGoalImpact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.HARD_GOAL:
      {
        HardGoal hardGoal = (HardGoal)theEObject;
        T result = caseHardGoal(hardGoal);
        if (result == null) result = caseGoal(hardGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.COMPOSITE_GOAL:
      {
        CompositeGoal compositeGoal = (CompositeGoal)theEObject;
        T result = caseCompositeGoal(compositeGoal);
        if (result == null) result = caseGoal(compositeGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_EXPRESSION:
      {
        GoalExpression goalExpression = (GoalExpression)theEObject;
        T result = caseGoalExpression(goalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_IMPLICATION:
      {
        GoalImplication goalImplication = (GoalImplication)theEObject;
        T result = caseGoalImplication(goalImplication);
        if (result == null) result = caseGoalExpression(goalImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_DISJUNCTION:
      {
        GoalDisjunction goalDisjunction = (GoalDisjunction)theEObject;
        T result = caseGoalDisjunction(goalDisjunction);
        if (result == null) result = caseGoalImplication(goalDisjunction);
        if (result == null) result = caseGoalExpression(goalDisjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_CONJUNCTION:
      {
        GoalConjunction goalConjunction = (GoalConjunction)theEObject;
        T result = caseGoalConjunction(goalConjunction);
        if (result == null) result = caseGoalDisjunction(goalConjunction);
        if (result == null) result = caseGoalImplication(goalConjunction);
        if (result == null) result = caseGoalExpression(goalConjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_COMPARISON:
      {
        GoalComparison goalComparison = (GoalComparison)theEObject;
        T result = caseGoalComparison(goalComparison);
        if (result == null) result = caseGoalConjunction(goalComparison);
        if (result == null) result = caseGoalDisjunction(goalComparison);
        if (result == null) result = caseGoalImplication(goalComparison);
        if (result == null) result = caseGoalExpression(goalComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_BOOLEAN_UNIT:
      {
        GoalBooleanUnit goalBooleanUnit = (GoalBooleanUnit)theEObject;
        T result = caseGoalBooleanUnit(goalBooleanUnit);
        if (result == null) result = caseGoalComparison(goalBooleanUnit);
        if (result == null) result = caseGoalConjunction(goalBooleanUnit);
        if (result == null) result = caseGoalDisjunction(goalBooleanUnit);
        if (result == null) result = caseGoalImplication(goalBooleanUnit);
        if (result == null) result = caseGoalExpression(goalBooleanUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_NEGATION:
      {
        GoalNegation goalNegation = (GoalNegation)theEObject;
        T result = caseGoalNegation(goalNegation);
        if (result == null) result = caseGoalBooleanUnit(goalNegation);
        if (result == null) result = caseGoalComparison(goalNegation);
        if (result == null) result = caseGoalConjunction(goalNegation);
        if (result == null) result = caseGoalDisjunction(goalNegation);
        if (result == null) result = caseGoalImplication(goalNegation);
        if (result == null) result = caseGoalExpression(goalNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_BOOLEAN_LITERAL:
      {
        GoalBooleanLiteral goalBooleanLiteral = (GoalBooleanLiteral)theEObject;
        T result = caseGoalBooleanLiteral(goalBooleanLiteral);
        if (result == null) result = caseGoalBooleanUnit(goalBooleanLiteral);
        if (result == null) result = caseGoalComparison(goalBooleanLiteral);
        if (result == null) result = caseGoalConjunction(goalBooleanLiteral);
        if (result == null) result = caseGoalDisjunction(goalBooleanLiteral);
        if (result == null) result = caseGoalImplication(goalBooleanLiteral);
        if (result == null) result = caseGoalExpression(goalBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.GOAL_REFERENCE:
      {
        GoalReference goalReference = (GoalReference)theEObject;
        T result = caseGoalReference(goalReference);
        if (result == null) result = caseGoalBooleanUnit(goalReference);
        if (result == null) result = caseGoalComparison(goalReference);
        if (result == null) result = caseGoalConjunction(goalReference);
        if (result == null) result = caseGoalDisjunction(goalReference);
        if (result == null) result = caseGoalImplication(goalReference);
        if (result == null) result = caseGoalExpression(goalReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.PARENTHESIZED_GOAL_EXPRESSION:
      {
        ParenthesizedGoalExpression parenthesizedGoalExpression = (ParenthesizedGoalExpression)theEObject;
        T result = caseParenthesizedGoalExpression(parenthesizedGoalExpression);
        if (result == null) result = caseGoalBooleanUnit(parenthesizedGoalExpression);
        if (result == null) result = caseGoalComparison(parenthesizedGoalExpression);
        if (result == null) result = caseGoalConjunction(parenthesizedGoalExpression);
        if (result == null) result = caseGoalDisjunction(parenthesizedGoalExpression);
        if (result == null) result = caseGoalImplication(parenthesizedGoalExpression);
        if (result == null) result = caseGoalExpression(parenthesizedGoalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GmlPackage.APPLIED_QUANTITATIVE_PROPERTY_EXPRESSION:
      {
        AppliedQuantitativePropertyExpression appliedQuantitativePropertyExpression = (AppliedQuantitativePropertyExpression)theEObject;
        T result = caseAppliedQuantitativePropertyExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseNumberExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseMultiplicativeExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseAdditiveExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseArithmeticExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseComparableExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseRelationalExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = caseBooleanUnit(appliedQuantitativePropertyExpression);
        if (result == null) result = caseComparison(appliedQuantitativePropertyExpression);
        if (result == null) result = caseConjunction(appliedQuantitativePropertyExpression);
        if (result == null) result = caseDisjunction(appliedQuantitativePropertyExpression);
        if (result == null) result = caseImplication(appliedQuantitativePropertyExpression);
        if (result == null) result = caseExpression(appliedQuantitativePropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalModel(GoalModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkload(Workload object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedProperty(AppliedProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Qualitative Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Qualitative Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedQualitativeProperty(AppliedQualitativeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Quantitative Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Quantitative Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedQuantitativeProperty(AppliedQuantitativeProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soft Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soft Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftGoal(SoftGoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soft Goal Impact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soft Goal Impact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftGoalImpact(SoftGoalImpact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hard Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hard Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardGoal(HardGoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeGoal(CompositeGoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalExpression(GoalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalImplication(GoalImplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalDisjunction(GoalDisjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalConjunction(GoalConjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalComparison(GoalComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Boolean Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Boolean Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalBooleanUnit(GoalBooleanUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalNegation(GoalNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalBooleanLiteral(GoalBooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalReference(GoalReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Goal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Goal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedGoalExpression(ParenthesizedGoalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Quantitative Property Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Quantitative Property Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedQuantitativePropertyExpression(AppliedQuantitativePropertyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplication(Implication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunction(Disjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanUnit(BooleanUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExpression(RelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparableExpression(ComparableExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticExpression(ArithmeticExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberExpression(NumberExpression object)
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

} //GmlSwitch

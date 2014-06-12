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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage
 * @generated
 */
public interface GmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GmlFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.gml.gml.impl.GmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Goal Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Model</em>'.
   * @generated
   */
  GoalModel createGoalModel();

  /**
   * Returns a new object of class '<em>Workload</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workload</em>'.
   * @generated
   */
  Workload createWorkload();

  /**
   * Returns a new object of class '<em>Applied Qualitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applied Qualitative Property</em>'.
   * @generated
   */
  AppliedQualitativeProperty createAppliedQualitativeProperty();

  /**
   * Returns a new object of class '<em>Applied Quantitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applied Quantitative Property</em>'.
   * @generated
   */
  AppliedQuantitativeProperty createAppliedQuantitativeProperty();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Soft Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soft Goal</em>'.
   * @generated
   */
  SoftGoal createSoftGoal();

  /**
   * Returns a new object of class '<em>Soft Goal Impact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soft Goal Impact</em>'.
   * @generated
   */
  SoftGoalImpact createSoftGoalImpact();

  /**
   * Returns a new object of class '<em>Hard Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hard Goal</em>'.
   * @generated
   */
  HardGoal createHardGoal();

  /**
   * Returns a new object of class '<em>Composite Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Goal</em>'.
   * @generated
   */
  CompositeGoal createCompositeGoal();

  /**
   * Returns a new object of class '<em>Goal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Expression</em>'.
   * @generated
   */
  GoalExpression createGoalExpression();

  /**
   * Returns a new object of class '<em>Goal Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Implication</em>'.
   * @generated
   */
  GoalImplication createGoalImplication();

  /**
   * Returns a new object of class '<em>Goal Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Disjunction</em>'.
   * @generated
   */
  GoalDisjunction createGoalDisjunction();

  /**
   * Returns a new object of class '<em>Goal Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Conjunction</em>'.
   * @generated
   */
  GoalConjunction createGoalConjunction();

  /**
   * Returns a new object of class '<em>Goal Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Comparison</em>'.
   * @generated
   */
  GoalComparison createGoalComparison();

  /**
   * Returns a new object of class '<em>Goal Boolean Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Boolean Unit</em>'.
   * @generated
   */
  GoalBooleanUnit createGoalBooleanUnit();

  /**
   * Returns a new object of class '<em>Goal Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Negation</em>'.
   * @generated
   */
  GoalNegation createGoalNegation();

  /**
   * Returns a new object of class '<em>Goal Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Boolean Literal</em>'.
   * @generated
   */
  GoalBooleanLiteral createGoalBooleanLiteral();

  /**
   * Returns a new object of class '<em>Goal Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Reference</em>'.
   * @generated
   */
  GoalReference createGoalReference();

  /**
   * Returns a new object of class '<em>Parenthesized Goal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Goal Expression</em>'.
   * @generated
   */
  ParenthesizedGoalExpression createParenthesizedGoalExpression();

  /**
   * Returns a new object of class '<em>Applied Quantitative Property Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applied Quantitative Property Expression</em>'.
   * @generated
   */
  AppliedQuantitativePropertyExpression createAppliedQuantitativePropertyExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GmlPackage getGmlPackage();

} //GmlFactory

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
package eu.artist.postmigration.nfrvt.lang.gel.gel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage
 * @generated
 */
public interface GelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GelFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.gel.gel.impl.GelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Migration Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migration Evaluation</em>'.
   * @generated
   */
  MigrationEvaluation createMigrationEvaluation();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Applied Qualitative Property Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applied Qualitative Property Evaluation</em>'.
   * @generated
   */
  AppliedQualitativePropertyEvaluation createAppliedQualitativePropertyEvaluation();

  /**
   * Returns a new object of class '<em>Applied Quantitative Property Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applied Quantitative Property Evaluation</em>'.
   * @generated
   */
  AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation();

  /**
   * Returns a new object of class '<em>Quantitative Property Realization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantitative Property Realization</em>'.
   * @generated
   */
  QuantitativePropertyRealization createQuantitativePropertyRealization();

  /**
   * Returns a new object of class '<em>Goal Model Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Model Evaluation</em>'.
   * @generated
   */
  GoalModelEvaluation createGoalModelEvaluation();

  /**
   * Returns a new object of class '<em>Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal Evaluation</em>'.
   * @generated
   */
  GoalEvaluation createGoalEvaluation();

  /**
   * Returns a new object of class '<em>Soft Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soft Goal Evaluation</em>'.
   * @generated
   */
  SoftGoalEvaluation createSoftGoalEvaluation();

  /**
   * Returns a new object of class '<em>Hard Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hard Goal Evaluation</em>'.
   * @generated
   */
  HardGoalEvaluation createHardGoalEvaluation();

  /**
   * Returns a new object of class '<em>Composite Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Goal Evaluation</em>'.
   * @generated
   */
  CompositeGoalEvaluation createCompositeGoalEvaluation();

  /**
   * Returns a new object of class '<em>Value Specification Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Specification Expression Evaluation</em>'.
   * @generated
   */
  ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation();

  /**
   * Returns a new object of class '<em>Boolean Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression Evaluation</em>'.
   * @generated
   */
  BooleanExpressionEvaluation createBooleanExpressionEvaluation();

  /**
   * Returns a new object of class '<em>Number Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Expression Evaluation</em>'.
   * @generated
   */
  NumberExpressionEvaluation createNumberExpressionEvaluation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GelPackage getGelPackage();

} //GelFactory

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

import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Goal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getGoal <em>Goal</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getDifference <em>Difference</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getSoftGoalEvaluation()
 * @model
 * @generated
 */
public interface SoftGoalEvaluation extends GoalEvaluation
{
  /**
   * Returns the value of the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' reference.
   * @see #setGoal(SoftGoal)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getSoftGoalEvaluation_Goal()
   * @model
   * @generated
   */
  SoftGoal getGoal();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getGoal <em>Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(SoftGoal value);

  /**
   * Returns the value of the '<em><b>Difference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Difference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Difference</em>' attribute.
   * @see #setDifference(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getSoftGoalEvaluation_Difference()
   * @model
   * @generated
   */
  BigDecimal getDifference();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation#getDifference <em>Difference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Difference</em>' attribute.
   * @see #getDifference()
   * @generated
   */
  void setDifference(BigDecimal value);

} // SoftGoalEvaluation

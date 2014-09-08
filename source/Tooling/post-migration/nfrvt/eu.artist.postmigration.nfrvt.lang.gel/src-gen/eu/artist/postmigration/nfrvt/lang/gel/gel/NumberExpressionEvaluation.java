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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getResult <em>Result</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getNumberExpressionEvaluation()
 * @model
 * @generated
 */
public interface NumberExpressionEvaluation extends ValueExpressionEvaluation
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(NumberLiteral)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getNumberExpressionEvaluation_Result()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getResult();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getNumberExpressionEvaluation_Evaluations()
   * @model containment="true"
   * @generated
   */
  EList<NumberExpressionEvaluation> getEvaluations();

} // NumberExpressionEvaluation

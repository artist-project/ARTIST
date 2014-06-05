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

import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Model Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getGoalModel <em>Goal Model</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getReason <em>Reason</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalModelEvaluation()
 * @model
 * @generated
 */
public interface GoalModelEvaluation extends EObject
{
  /**
   * Returns the value of the '<em><b>Goal Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Model</em>' reference.
   * @see #setGoalModel(GoalModel)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalModelEvaluation_GoalModel()
   * @model
   * @generated
   */
  GoalModel getGoalModel();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getGoalModel <em>Goal Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal Model</em>' reference.
   * @see #getGoalModel()
   * @generated
   */
  void setGoalModel(GoalModel value);

  /**
   * Returns the value of the '<em><b>Verdict</b></em>' attribute.
   * The literals are from the enumeration {@link eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verdict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verdict</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @see #setVerdict(Verdict)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalModelEvaluation_Verdict()
   * @model
   * @generated
   */
  Verdict getVerdict();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getVerdict <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verdict</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict
   * @see #getVerdict()
   * @generated
   */
  void setVerdict(Verdict value);

  /**
   * Returns the value of the '<em><b>Reason</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reason</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reason</em>' attribute.
   * @see #setReason(String)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalModelEvaluation_Reason()
   * @model
   * @generated
   */
  String getReason();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation#getReason <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reason</em>' attribute.
   * @see #getReason()
   * @generated
   */
  void setReason(String value);

  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getGoalModelEvaluation_Evaluations()
   * @model containment="true"
   * @generated
   */
  EList<GoalEvaluation> getEvaluations();

} // GoalModelEvaluation

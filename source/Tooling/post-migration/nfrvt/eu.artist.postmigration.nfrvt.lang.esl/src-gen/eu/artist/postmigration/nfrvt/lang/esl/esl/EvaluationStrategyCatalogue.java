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
package eu.artist.postmigration.nfrvt.lang.esl.esl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Strategy Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategyCatalogue()
 * @model
 * @generated
 */
public interface EvaluationStrategyCatalogue extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategyCatalogue_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportNamespace> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategyCatalogue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategies</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategyCatalogue_Strategies()
   * @model containment="true"
   * @generated
   */
  EList<EvaluationStrategy> getStrategies();

} // EvaluationStrategyCatalogue

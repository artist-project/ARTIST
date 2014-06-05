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

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy()
 * @model
 * @generated
 */
public interface EvaluationStrategy extends EObject
{
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
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Class</em>' reference.
   * @see #setJavaClass(JvmDeclaredType)
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy_JavaClass()
   * @model
   * @generated
   */
  JvmDeclaredType getJavaClass();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getJavaClass <em>Java Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Class</em>' reference.
   * @see #getJavaClass()
   * @generated
   */
  void setJavaClass(JvmDeclaredType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind
   * @see #setLevel(EvaluationStrategyLevelKind)
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy_Level()
   * @model
   * @generated
   */
  EvaluationStrategyLevelKind getLevel();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind
   * @see #getLevel()
   * @generated
   */
  void setLevel(EvaluationStrategyLevelKind value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' reference list.
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#getEvaluationStrategy_Properties()
   * @model
   * @generated
   */
  EList<QuantitativeProperty> getProperties();

} // EvaluationStrategy

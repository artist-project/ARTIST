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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Property Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getLevel <em>Level</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getType <em>Type</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getValues <em>Values</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization()
 * @model
 * @generated
 */
public interface QuantitativePropertyRealization extends EObject
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
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' reference.
   * @see #setStrategy(EvaluationStrategy)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Strategy()
   * @model
   * @generated
   */
  EvaluationStrategy getStrategy();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getStrategy <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(EvaluationStrategy value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind
   * @see #setLevel(RealizationLevelKind)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Level()
   * @model
   * @generated
   */
  RealizationLevelKind getLevel();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind
   * @see #getLevel()
   * @generated
   */
  void setLevel(RealizationLevelKind value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind
   * @see #setType(RealizationTypeKind)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Type()
   * @model
   * @generated
   */
  RealizationTypeKind getType();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind
   * @see #getType()
   * @generated
   */
  void setType(RealizationTypeKind value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Values()
   * @model containment="true"
   * @generated
   */
  EList<ValueSpecification> getValues();

  /**
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precision</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see #setPrecision(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getQuantitativePropertyRealization_Precision()
   * @model
   * @generated
   */
  BigDecimal getPrecision();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see #getPrecision()
   * @generated
   */
  void setPrecision(BigDecimal value);

} // QuantitativePropertyRealization

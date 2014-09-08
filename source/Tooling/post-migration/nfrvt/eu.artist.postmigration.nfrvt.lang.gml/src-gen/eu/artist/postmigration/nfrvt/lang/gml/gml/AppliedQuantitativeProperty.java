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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Quantitative Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getFunction <em>Function</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativeProperty()
 * @model
 * @generated
 */
public interface AppliedQuantitativeProperty extends AppliedProperty
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(QuantitativeProperty)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativeProperty_Property()
   * @model
   * @generated
   */
  QuantitativeProperty getProperty();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(QuantitativeProperty value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(Operator)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativeProperty_Function()
   * @model containment="true"
   * @generated
   */
  Operator getFunction();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Operator value);

  /**
   * Returns the value of the '<em><b>Workload</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workload</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workload</em>' reference.
   * @see #setWorkload(Workload)
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage#getAppliedQuantitativeProperty_Workload()
   * @model
   * @generated
   */
  Workload getWorkload();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty#getWorkload <em>Workload</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workload</em>' reference.
   * @see #getWorkload()
   * @generated
   */
  void setWorkload(Workload value);

} // AppliedQuantitativeProperty

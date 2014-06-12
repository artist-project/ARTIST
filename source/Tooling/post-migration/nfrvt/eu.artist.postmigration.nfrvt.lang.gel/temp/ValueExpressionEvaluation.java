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

import org.eclipse.emf.ecore.EObject;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Expression Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getValueExpressionEvaluation()
 * @model
 * @generated
 */
public interface ValueExpressionEvaluation extends EObject
{
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
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getValueExpressionEvaluation_Reason()
   * @model
   * @generated
   */
  String getReason();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation#getReason <em>Reason</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reason</em>' attribute.
   * @see #getReason()
   * @generated
   */
  void setReason(String value);
  
  ValueSpecification getResult();

} // ValueExpressionEvaluation

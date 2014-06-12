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
package eu.artist.postmigration.nfrvt.lang.nsl.nsl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Quantitative Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getDerivedQuantitativeProperty()
 * @model
 * @generated
 */
public interface DerivedQuantitativeProperty extends QuantitativeProperty
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ArithmeticExpression)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getDerivedQuantitativeProperty_Expression()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getExpression();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ArithmeticExpression value);

} // DerivedQuantitativeProperty

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

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getImpact <em>Impact</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyImpact()
 * @model
 * @generated
 */
public interface PropertyImpact extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Property)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyImpact_Target()
   * @model
   * @generated
   */
  Property getTarget();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Property value);

  /**
   * Returns the value of the '<em><b>Impact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact</em>' attribute.
   * @see #setImpact(BigDecimal)
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#getPropertyImpact_Impact()
   * @model
   * @generated
   */
  BigDecimal getImpact();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getImpact <em>Impact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact</em>' attribute.
   * @see #getImpact()
   * @generated
   */
  void setImpact(BigDecimal value);

} // PropertyImpact

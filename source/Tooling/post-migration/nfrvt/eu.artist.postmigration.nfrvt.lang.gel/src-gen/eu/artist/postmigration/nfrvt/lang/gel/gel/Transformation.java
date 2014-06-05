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

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getPattern <em>Pattern</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getSource <em>Source</em>}</li>
 *   <li>{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject
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
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getTransformation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getTransformation_Pattern()
   * @model
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getTransformation_Source()
   * @model
   * @generated
   */
  EList<NamedElement> getSource();

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference list.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage#getTransformation_Target()
   * @model
   * @generated
   */
  EList<NamedElement> getTarget();

} // Transformation

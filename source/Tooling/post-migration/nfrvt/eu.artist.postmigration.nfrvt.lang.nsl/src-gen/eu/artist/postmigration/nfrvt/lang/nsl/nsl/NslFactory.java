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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage
 * @generated
 */
public interface NslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NslFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Property Catalogue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Catalogue</em>'.
   * @generated
   */
  PropertyCatalogue createPropertyCatalogue();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Qualitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualitative Property</em>'.
   * @generated
   */
  QualitativeProperty createQualitativeProperty();

  /**
   * Returns a new object of class '<em>Quantitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantitative Property</em>'.
   * @generated
   */
  QuantitativeProperty createQuantitativeProperty();

  /**
   * Returns a new object of class '<em>Base Quantitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Quantitative Property</em>'.
   * @generated
   */
  BaseQuantitativeProperty createBaseQuantitativeProperty();

  /**
   * Returns a new object of class '<em>Derived Quantitative Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Derived Quantitative Property</em>'.
   * @generated
   */
  DerivedQuantitativeProperty createDerivedQuantitativeProperty();

  /**
   * Returns a new object of class '<em>Property Impact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Impact</em>'.
   * @generated
   */
  PropertyImpact createPropertyImpact();

  /**
   * Returns a new object of class '<em>Parenthesized Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Arithmetic Expression</em>'.
   * @generated
   */
  ParenthesizedArithmeticExpression createParenthesizedArithmeticExpression();

  /**
   * Returns a new object of class '<em>Quantitative Property Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantitative Property Expression</em>'.
   * @generated
   */
  QuantitativePropertyExpression createQuantitativePropertyExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NslPackage getNslPackage();

} //NslFactory

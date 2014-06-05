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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslFactory
 * @model kind="package"
 * @generated
 */
public interface NslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/nsl/NSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "nsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NslPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyCatalogueImpl <em>Property Catalogue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyCatalogueImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getPropertyCatalogue()
   * @generated
   */
  int PROPERTY_CATALOGUE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CATALOGUE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CATALOGUE__NAME = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CATALOGUE__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Property Catalogue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CATALOGUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DIRECTION = 2;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IMPACTS = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QualitativePropertyImpl <em>Qualitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QualitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQualitativeProperty()
   * @generated
   */
  int QUALITATIVE_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY__DIRECTION = PROPERTY__DIRECTION;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY__IMPACTS = PROPERTY__IMPACTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY__PROPERTIES = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyImpl <em>Quantitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQuantitativeProperty()
   * @generated
   */
  int QUANTITATIVE_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY__DESCRIPTION = PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY__DIRECTION = PROPERTY__DIRECTION;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY__IMPACTS = PROPERTY__IMPACTS;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY__TYPE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quantitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.BaseQuantitativePropertyImpl <em>Base Quantitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.BaseQuantitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getBaseQuantitativeProperty()
   * @generated
   */
  int BASE_QUANTITATIVE_PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY__NAME = QUANTITATIVE_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY__DESCRIPTION = QUANTITATIVE_PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY__DIRECTION = QUANTITATIVE_PROPERTY__DIRECTION;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY__IMPACTS = QUANTITATIVE_PROPERTY__IMPACTS;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY__TYPE = QUANTITATIVE_PROPERTY__TYPE;

  /**
   * The number of structural features of the '<em>Base Quantitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_QUANTITATIVE_PROPERTY_FEATURE_COUNT = QUANTITATIVE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.DerivedQuantitativePropertyImpl <em>Derived Quantitative Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.DerivedQuantitativePropertyImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getDerivedQuantitativeProperty()
   * @generated
   */
  int DERIVED_QUANTITATIVE_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__NAME = QUANTITATIVE_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__DESCRIPTION = QUANTITATIVE_PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__DIRECTION = QUANTITATIVE_PROPERTY__DIRECTION;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__IMPACTS = QUANTITATIVE_PROPERTY__IMPACTS;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__TYPE = QUANTITATIVE_PROPERTY__TYPE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY__EXPRESSION = QUANTITATIVE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Derived Quantitative Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_QUANTITATIVE_PROPERTY_FEATURE_COUNT = QUANTITATIVE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpactImpl <em>Property Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpactImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getPropertyImpact()
   * @generated
   */
  int PROPERTY_IMPACT = 6;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_IMPACT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Impact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_IMPACT__IMPACT = 1;

  /**
   * The number of structural features of the '<em>Property Impact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_IMPACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.ParenthesizedArithmeticExpressionImpl <em>Parenthesized Arithmetic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.ParenthesizedArithmeticExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getParenthesizedArithmeticExpression()
   * @generated
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION__LEFT = ArtistCommonPackage.NUMBER_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION__OPERATOR = ArtistCommonPackage.NUMBER_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION__RIGHT = ArtistCommonPackage.NUMBER_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION__VALUE = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesized Arithmetic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_ARITHMETIC_EXPRESSION_FEATURE_COUNT = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyExpressionImpl <em>Quantitative Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQuantitativePropertyExpression()
   * @generated
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION__LEFT = ArtistCommonPackage.NUMBER_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION__OPERATOR = ArtistCommonPackage.NUMBER_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION__RIGHT = ArtistCommonPackage.NUMBER_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION__VALUE = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quantitative Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITATIVE_PROPERTY_EXPRESSION_FEATURE_COUNT = ArtistCommonPackage.NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind <em>Direction Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getDirectionKind()
   * @generated
   */
  int DIRECTION_KIND = 9;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue <em>Property Catalogue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Catalogue</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue
   * @generated
   */
  EClass getPropertyCatalogue();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getImports()
   * @see #getPropertyCatalogue()
   * @generated
   */
  EReference getPropertyCatalogue_Imports();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getName()
   * @see #getPropertyCatalogue()
   * @generated
   */
  EAttribute getPropertyCatalogue_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue#getProperties()
   * @see #getPropertyCatalogue()
   * @generated
   */
  EReference getPropertyCatalogue_Properties();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Description();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getDirection()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Direction();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getImpacts <em>Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Impacts</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property#getImpacts()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Impacts();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty <em>Qualitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty
   * @generated
   */
  EClass getQualitativeProperty();

  /**
   * Returns the meta object for the reference list '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Properties</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty#getProperties()
   * @see #getQualitativeProperty()
   * @generated
   */
  EReference getQualitativeProperty_Properties();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty <em>Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty
   * @generated
   */
  EClass getQuantitativeProperty();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty#getType()
   * @see #getQuantitativeProperty()
   * @generated
   */
  EReference getQuantitativeProperty_Type();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty <em>Base Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Quantitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty
   * @generated
   */
  EClass getBaseQuantitativeProperty();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty <em>Derived Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Derived Quantitative Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty
   * @generated
   */
  EClass getDerivedQuantitativeProperty();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty#getExpression()
   * @see #getDerivedQuantitativeProperty()
   * @generated
   */
  EReference getDerivedQuantitativeProperty_Expression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact <em>Property Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact
   * @generated
   */
  EClass getPropertyImpact();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getTarget()
   * @see #getPropertyImpact()
   * @generated
   */
  EReference getPropertyImpact_Target();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getImpact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impact</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact#getImpact()
   * @see #getPropertyImpact()
   * @generated
   */
  EAttribute getPropertyImpact_Impact();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression <em>Parenthesized Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Arithmetic Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression
   * @generated
   */
  EClass getParenthesizedArithmeticExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression#getValue()
   * @see #getParenthesizedArithmeticExpression()
   * @generated
   */
  EReference getParenthesizedArithmeticExpression_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression <em>Quantitative Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantitative Property Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression
   * @generated
   */
  EClass getQuantitativePropertyExpression();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression#getValue()
   * @see #getQuantitativePropertyExpression()
   * @generated
   */
  EReference getQuantitativePropertyExpression_Value();

  /**
   * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind <em>Direction Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction Kind</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind
   * @generated
   */
  EEnum getDirectionKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NslFactory getNslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyCatalogueImpl <em>Property Catalogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyCatalogueImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getPropertyCatalogue()
     * @generated
     */
    EClass PROPERTY_CATALOGUE = eINSTANCE.getPropertyCatalogue();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CATALOGUE__IMPORTS = eINSTANCE.getPropertyCatalogue_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CATALOGUE__NAME = eINSTANCE.getPropertyCatalogue_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CATALOGUE__PROPERTIES = eINSTANCE.getPropertyCatalogue_Properties();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DIRECTION = eINSTANCE.getProperty_Direction();

    /**
     * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__IMPACTS = eINSTANCE.getProperty_Impacts();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QualitativePropertyImpl <em>Qualitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QualitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQualitativeProperty()
     * @generated
     */
    EClass QUALITATIVE_PROPERTY = eINSTANCE.getQualitativeProperty();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_PROPERTY__PROPERTIES = eINSTANCE.getQualitativeProperty_Properties();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyImpl <em>Quantitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQuantitativeProperty()
     * @generated
     */
    EClass QUANTITATIVE_PROPERTY = eINSTANCE.getQuantitativeProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITATIVE_PROPERTY__TYPE = eINSTANCE.getQuantitativeProperty_Type();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.BaseQuantitativePropertyImpl <em>Base Quantitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.BaseQuantitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getBaseQuantitativeProperty()
     * @generated
     */
    EClass BASE_QUANTITATIVE_PROPERTY = eINSTANCE.getBaseQuantitativeProperty();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.DerivedQuantitativePropertyImpl <em>Derived Quantitative Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.DerivedQuantitativePropertyImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getDerivedQuantitativeProperty()
     * @generated
     */
    EClass DERIVED_QUANTITATIVE_PROPERTY = eINSTANCE.getDerivedQuantitativeProperty();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DERIVED_QUANTITATIVE_PROPERTY__EXPRESSION = eINSTANCE.getDerivedQuantitativeProperty_Expression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpactImpl <em>Property Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.PropertyImpactImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getPropertyImpact()
     * @generated
     */
    EClass PROPERTY_IMPACT = eINSTANCE.getPropertyImpact();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_IMPACT__TARGET = eINSTANCE.getPropertyImpact_Target();

    /**
     * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_IMPACT__IMPACT = eINSTANCE.getPropertyImpact_Impact();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.ParenthesizedArithmeticExpressionImpl <em>Parenthesized Arithmetic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.ParenthesizedArithmeticExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getParenthesizedArithmeticExpression()
     * @generated
     */
    EClass PARENTHESIZED_ARITHMETIC_EXPRESSION = eINSTANCE.getParenthesizedArithmeticExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_ARITHMETIC_EXPRESSION__VALUE = eINSTANCE.getParenthesizedArithmeticExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyExpressionImpl <em>Quantitative Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.QuantitativePropertyExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getQuantitativePropertyExpression()
     * @generated
     */
    EClass QUANTITATIVE_PROPERTY_EXPRESSION = eINSTANCE.getQuantitativePropertyExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITATIVE_PROPERTY_EXPRESSION__VALUE = eINSTANCE.getQuantitativePropertyExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind <em>Direction Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind
     * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl.NslPackageImpl#getDirectionKind()
     * @generated
     */
    EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

  }

} //NslPackage

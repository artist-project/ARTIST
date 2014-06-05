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
package eu.artist.postmigration.nfrvt.lang.common.artistCommon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory
 * @model kind="package"
 * @generated
 */
public interface ArtistCommonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "artistCommon";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/lang/common/ARTISTCommon";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "artistCommon";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArtistCommonPackage eINSTANCE = eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationImpl <em>Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImplication()
   * @generated
   */
  int IMPLICATION = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DisjunctionImpl <em>Disjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DisjunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getDisjunction()
   * @generated
   */
  int DISJUNCTION = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__LEFT = IMPLICATION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__OPERATOR = IMPLICATION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__RIGHT = IMPLICATION__RIGHT;

  /**
   * The number of structural features of the '<em>Disjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FEATURE_COUNT = IMPLICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ConjunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LEFT = DISJUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__OPERATOR = DISJUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RIGHT = DISJUNCTION__RIGHT;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = DISJUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparisonImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = CONJUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OPERATOR = CONJUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = CONJUNCTION__RIGHT;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = CONJUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanUnitImpl <em>Boolean Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanUnitImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getBooleanUnit()
   * @generated
   */
  int BOOLEAN_UNIT = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNIT__LEFT = COMPARISON__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNIT__OPERATOR = COMPARISON__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNIT__RIGHT = COMPARISON__RIGHT;

  /**
   * The number of structural features of the '<em>Boolean Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNIT_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NegationImpl <em>Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NegationImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNegation()
   * @generated
   */
  int NEGATION = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__LEFT = BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__OPERATOR = BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__RIGHT = BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__VALUE = BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_FEATURE_COUNT = BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.RelationalExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__LEFT = BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__OPERATOR = BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RIGHT = BOOLEAN_UNIT__RIGHT;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparableExpressionImpl <em>Comparable Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparableExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getComparableExpression()
   * @generated
   */
  int COMPARABLE_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARABLE_EXPRESSION__LEFT = RELATIONAL_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARABLE_EXPRESSION__OPERATOR = RELATIONAL_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARABLE_EXPRESSION__RIGHT = RELATIONAL_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Comparable Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARABLE_EXPRESSION_FEATURE_COUNT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArithmeticExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getArithmeticExpression()
   * @generated
   */
  int ARITHMETIC_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_EXPRESSION__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_EXPRESSION__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_EXPRESSION__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Arithmetic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditiveExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__LEFT = ARITHMETIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OPERATOR = ARITHMETIC_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__RIGHT = ARITHMETIC_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicativeExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__LEFT = ADDITIVE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OPERATOR = ADDITIVE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__RIGHT = ADDITIVE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ADDITIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberExpression()
   * @generated
   */
  int NUMBER_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__LEFT = MULTIPLICATIVE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__OPERATOR = MULTIPLICATIVE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION__RIGHT = MULTIPLICATIVE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Number Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberFunctionImpl <em>Number Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberFunction()
   * @generated
   */
  int NUMBER_FUNCTION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION__LEFT = NUMBER_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION__OPERATOR = NUMBER_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION__RIGHT = NUMBER_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Number Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaximumFunctionImpl <em>Maximum Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaximumFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMaximumFunction()
   * @generated
   */
  int MAXIMUM_FUNCTION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FUNCTION__VALUES = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Maximum Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinimumFunctionImpl <em>Minimum Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinimumFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMinimumFunction()
   * @generated
   */
  int MINIMUM_FUNCTION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FUNCTION__VALUES = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Minimum Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AverageFunctionImpl <em>Average Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AverageFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAverageFunction()
   * @generated
   */
  int AVERAGE_FUNCTION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_FUNCTION__VALUES = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Average Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumFunctionImpl <em>Sum Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSumFunction()
   * @generated
   */
  int SUM_FUNCTION = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FUNCTION__VALUES = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sum Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl <em>Exponential Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExponentialFunction()
   * @generated
   */
  int EXPONENTIAL_FUNCTION = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION__BASE = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION__EXPONENT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exponential Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteFunctionImpl <em>Absolute Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAbsoluteFunction()
   * @generated
   */
  int ABSOLUTE_FUNCTION = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_FUNCTION__VALUE = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Absolute Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmFunctionImpl <em>Natural Logarithm Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNaturalLogarithmFunction()
   * @generated
   */
  int NATURAL_LOGARITHM_FUNCTION = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_FUNCTION__VALUE = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Natural Logarithm Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmFunctionImpl <em>Common Logarithm Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmFunctionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCommonLogarithmFunction()
   * @generated
   */
  int COMMON_LOGARITHM_FUNCTION = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_FUNCTION__LEFT = NUMBER_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_FUNCTION__OPERATOR = NUMBER_FUNCTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_FUNCTION__RIGHT = NUMBER_FUNCTION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_FUNCTION__VALUE = NUMBER_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Common Logarithm Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_FUNCTION_FEATURE_COUNT = NUMBER_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ParenthesizedExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getParenthesizedExpression()
   * @generated
   */
  int PARENTHESIZED_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ValueSpecificationImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getValueSpecification()
   * @generated
   */
  int VALUE_SPECIFICATION = 23;

  /**
   * The number of structural features of the '<em>Value Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ObjectSpecificationExpressionImpl <em>Object Specification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ObjectSpecificationExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getObjectSpecificationExpression()
   * @generated
   */
  int OBJECT_SPECIFICATION_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION__TYPE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Specification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SPECIFICATION_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CollectionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 25;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__VALUES = 0;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.TupleImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getTuple()
   * @generated
   */
  int TUPLE = 26;

  /**
   * The feature id for the '<em><b>Tuples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__TUPLES = 0;

  /**
   * The number of structural features of the '<em>Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl <em>Property Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getPropertyValuePair()
   * @generated
   */
  int PROPERTY_VALUE_PAIR = 27;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_PAIR__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.InstanceSpecificationExpressionImpl <em>Instance Specification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.InstanceSpecificationExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getInstanceSpecificationExpression()
   * @generated
   */
  int INSTANCE_SPECIFICATION_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPECIFICATION_EXPRESSION__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPECIFICATION_EXPRESSION__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPECIFICATION_EXPRESSION__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPECIFICATION_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Specification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPECIFICATION_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LiteralValueExpressionImpl <em>Literal Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LiteralValueExpressionImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLiteralValueExpression()
   * @generated
   */
  int LITERAL_VALUE_EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Literal Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VALUE_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LEFT = BOOLEAN_UNIT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__OPERATOR = BOOLEAN_UNIT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__RIGHT = BOOLEAN_UNIT__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = BOOLEAN_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = BOOLEAN_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__LEFT = NUMBER_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__OPERATOR = NUMBER_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__RIGHT = NUMBER_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NullLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.StringLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.UnlimitedLiteralImpl <em>Unlimited Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.UnlimitedLiteralImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getUnlimitedLiteral()
   * @generated
   */
  int UNLIMITED_LITERAL = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__LEFT = COMPARABLE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__OPERATOR = COMPARABLE_EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__RIGHT = COMPARABLE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unlimited Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 35;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIorNamespaceImpl <em>Import UR Ior Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIorNamespaceImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportURIorNamespace()
   * @generated
   */
  int IMPORT_UR_IOR_NAMESPACE = 36;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_UR_IOR_NAMESPACE__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_UR_IOR_NAMESPACE__IMPORTED_NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Import UR Ior Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_UR_IOR_NAMESPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIImpl <em>Import URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportURI()
   * @generated
   */
  int IMPORT_URI = 37;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_URI__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportNamespaceImpl <em>Import Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportNamespaceImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportNamespace()
   * @generated
   */
  int IMPORT_NAMESPACE = 38;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAMESPACE__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_NAMESPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OrOperatorImpl <em>Or Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OrOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getOrOperator()
   * @generated
   */
  int OR_OPERATOR = 39;

  /**
   * The number of structural features of the '<em>Or Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.XOrOperatorImpl <em>XOr Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.XOrOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getXOrOperator()
   * @generated
   */
  int XOR_OPERATOR = 40;

  /**
   * The number of structural features of the '<em>XOr Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AndOperatorImpl <em>And Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AndOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAndOperator()
   * @generated
   */
  int AND_OPERATOR = 41;

  /**
   * The number of structural features of the '<em>And Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationOperatorImpl <em>Implication Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImplicationOperator()
   * @generated
   */
  int IMPLICATION_OPERATOR = 42;

  /**
   * The number of structural features of the '<em>Implication Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.EqualsOperatorImpl <em>Equals Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.EqualsOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getEqualsOperator()
   * @generated
   */
  int EQUALS_OPERATOR = 43;

  /**
   * The number of structural features of the '<em>Equals Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotEqualsOperatorImpl <em>Not Equals Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotEqualsOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNotEqualsOperator()
   * @generated
   */
  int NOT_EQUALS_OPERATOR = 44;

  /**
   * The number of structural features of the '<em>Not Equals Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotOperatorImpl <em>Not Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNotOperator()
   * @generated
   */
  int NOT_OPERATOR = 45;

  /**
   * The number of structural features of the '<em>Not Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterThanOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getGreaterThanOperator()
   * @generated
   */
  int GREATER_THAN_OPERATOR = 46;

  /**
   * The number of structural features of the '<em>Greater Than Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterOrEqualThanOperatorImpl <em>Greater Or Equal Than Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterOrEqualThanOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getGreaterOrEqualThanOperator()
   * @generated
   */
  int GREATER_OR_EQUAL_THAN_OPERATOR = 47;

  /**
   * The number of structural features of the '<em>Greater Or Equal Than Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessThanOperatorImpl <em>Less Than Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessThanOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLessThanOperator()
   * @generated
   */
  int LESS_THAN_OPERATOR = 48;

  /**
   * The number of structural features of the '<em>Less Than Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessOrEqualThanOperatorImpl <em>Less Or Equal Than Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessOrEqualThanOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLessOrEqualThanOperator()
   * @generated
   */
  int LESS_OR_EQUAL_THAN_OPERATOR = 49;

  /**
   * The number of structural features of the '<em>Less Or Equal Than Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUAL_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditionOperatorImpl <em>Addition Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditionOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAdditionOperator()
   * @generated
   */
  int ADDITION_OPERATOR = 50;

  /**
   * The number of structural features of the '<em>Addition Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SubstractionOperatorImpl <em>Substraction Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SubstractionOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSubstractionOperator()
   * @generated
   */
  int SUBSTRACTION_OPERATOR = 51;

  /**
   * The number of structural features of the '<em>Substraction Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTRACTION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicationOperatorImpl <em>Multiplication Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicationOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMultiplicationOperator()
   * @generated
   */
  int MULTIPLICATION_OPERATOR = 52;

  /**
   * The number of structural features of the '<em>Multiplication Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DivisionOperatorImpl <em>Division Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DivisionOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getDivisionOperator()
   * @generated
   */
  int DIVISION_OPERATOR = 53;

  /**
   * The number of structural features of the '<em>Division Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ModulusOperatorImpl <em>Modulus Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ModulusOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getModulusOperator()
   * @generated
   */
  int MODULUS_OPERATOR = 54;

  /**
   * The number of structural features of the '<em>Modulus Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULUS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaxOperatorImpl <em>Max Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaxOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMaxOperator()
   * @generated
   */
  int MAX_OPERATOR = 55;

  /**
   * The number of structural features of the '<em>Max Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinOperatorImpl <em>Min Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMinOperator()
   * @generated
   */
  int MIN_OPERATOR = 56;

  /**
   * The number of structural features of the '<em>Min Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AvgOperatorImpl <em>Avg Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AvgOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAvgOperator()
   * @generated
   */
  int AVG_OPERATOR = 57;

  /**
   * The number of structural features of the '<em>Avg Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumOperatorImpl <em>Sum Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSumOperator()
   * @generated
   */
  int SUM_OPERATOR = 58;

  /**
   * The number of structural features of the '<em>Sum Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialOperatorImpl <em>Exponential Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExponentialOperator()
   * @generated
   */
  int EXPONENTIAL_OPERATOR = 59;

  /**
   * The number of structural features of the '<em>Exponential Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENTIAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteOperatorImpl <em>Absolute Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAbsoluteOperator()
   * @generated
   */
  int ABSOLUTE_OPERATOR = 60;

  /**
   * The number of structural features of the '<em>Absolute Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmOperatorImpl <em>Natural Logarithm Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNaturalLogarithmOperator()
   * @generated
   */
  int NATURAL_LOGARITHM_OPERATOR = 61;

  /**
   * The number of structural features of the '<em>Natural Logarithm Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LOGARITHM_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmOperatorImpl <em>Common Logarithm Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmOperatorImpl
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCommonLogarithmOperator()
   * @generated
   */
  int COMMON_LOGARITHM_OPERATOR = 62;

  /**
   * The number of structural features of the '<em>Common Logarithm Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_LOGARITHM_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication <em>Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implication</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication
   * @generated
   */
  EClass getImplication();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getLeft()
   * @see #getImplication()
   * @generated
   */
  EReference getImplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getOperator()
   * @see #getImplication()
   * @generated
   */
  EReference getImplication_Operator();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication#getRight()
   * @see #getImplication()
   * @generated
   */
  EReference getImplication_Right();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjunction</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction
   * @generated
   */
  EClass getDisjunction();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction
   * @generated
   */
  EClass getConjunction();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit <em>Boolean Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Unit</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit
   * @generated
   */
  EClass getBooleanUnit();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation
   * @generated
   */
  EClass getNegation();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation#getValue()
   * @see #getNegation()
   * @generated
   */
  EReference getNegation_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression <em>Comparable Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparable Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression
   * @generated
   */
  EClass getComparableExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression <em>Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression
   * @generated
   */
  EClass getArithmeticExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression
   * @generated
   */
  EClass getNumberExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction <em>Number Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction
   * @generated
   */
  EClass getNumberFunction();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction <em>Maximum Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maximum Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction
   * @generated
   */
  EClass getMaximumFunction();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction#getValues()
   * @see #getMaximumFunction()
   * @generated
   */
  EReference getMaximumFunction_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction <em>Minimum Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minimum Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction
   * @generated
   */
  EClass getMinimumFunction();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction#getValues()
   * @see #getMinimumFunction()
   * @generated
   */
  EReference getMinimumFunction_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction <em>Average Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Average Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction
   * @generated
   */
  EClass getAverageFunction();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction#getValues()
   * @see #getAverageFunction()
   * @generated
   */
  EReference getAverageFunction_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction <em>Sum Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction
   * @generated
   */
  EClass getSumFunction();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction#getValues()
   * @see #getSumFunction()
   * @generated
   */
  EReference getSumFunction_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction <em>Exponential Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exponential Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction
   * @generated
   */
  EClass getExponentialFunction();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getBase()
   * @see #getExponentialFunction()
   * @generated
   */
  EReference getExponentialFunction_Base();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getExponent <em>Exponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exponent</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction#getExponent()
   * @see #getExponentialFunction()
   * @generated
   */
  EReference getExponentialFunction_Exponent();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction <em>Absolute Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absolute Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction
   * @generated
   */
  EClass getAbsoluteFunction();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction#getValue()
   * @see #getAbsoluteFunction()
   * @generated
   */
  EReference getAbsoluteFunction_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction <em>Natural Logarithm Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Logarithm Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction
   * @generated
   */
  EClass getNaturalLogarithmFunction();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction#getValue()
   * @see #getNaturalLogarithmFunction()
   * @generated
   */
  EReference getNaturalLogarithmFunction_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction <em>Common Logarithm Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Logarithm Function</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction
   * @generated
   */
  EClass getCommonLogarithmFunction();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction#getValue()
   * @see #getCommonLogarithmFunction()
   * @generated
   */
  EReference getCommonLogarithmFunction_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression
   * @generated
   */
  EClass getParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression#getValue()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification <em>Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Specification</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification
   * @generated
   */
  EClass getValueSpecification();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression <em>Object Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Specification Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression
   * @generated
   */
  EClass getObjectSpecificationExpression();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression#getType()
   * @see #getObjectSpecificationExpression()
   * @generated
   */
  EReference getObjectSpecificationExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression#getValue()
   * @see #getObjectSpecificationExpression()
   * @generated
   */
  EReference getObjectSpecificationExpression_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection#getValues()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Values();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference list '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple#getTuples <em>Tuples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tuples</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple#getTuples()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_Tuples();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair <em>Property Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value Pair</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair
   * @generated
   */
  EClass getPropertyValuePair();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair#getProperty()
   * @see #getPropertyValuePair()
   * @generated
   */
  EReference getPropertyValuePair_Property();

  /**
   * Returns the meta object for the containment reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair#getValue()
   * @see #getPropertyValuePair()
   * @generated
   */
  EReference getPropertyValuePair_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression <em>Instance Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Specification Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression
   * @generated
   */
  EClass getInstanceSpecificationExpression();

  /**
   * Returns the meta object for the reference '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression#getValue()
   * @see #getInstanceSpecificationExpression()
   * @generated
   */
  EReference getInstanceSpecificationExpression_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression <em>Literal Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Value Expression</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression
   * @generated
   */
  EClass getLiteralValueExpression();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral#getValue()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral <em>Unlimited Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unlimited Literal</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral
   * @generated
   */
  EClass getUnlimitedLiteral();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral#getValue()
   * @see #getUnlimitedLiteral()
   * @generated
   */
  EAttribute getUnlimitedLiteral_Value();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace <em>Import UR Ior Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import UR Ior Namespace</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace
   * @generated
   */
  EClass getImportURIorNamespace();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace#getImportURI()
   * @see #getImportURIorNamespace()
   * @generated
   */
  EAttribute getImportURIorNamespace_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace#getImportedNamespace()
   * @see #getImportURIorNamespace()
   * @generated
   */
  EAttribute getImportURIorNamespace_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import URI</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI
   * @generated
   */
  EClass getImportURI();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI#getImportURI()
   * @see #getImportURI()
   * @generated
   */
  EAttribute getImportURI_ImportURI();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace <em>Import Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Namespace</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace
   * @generated
   */
  EClass getImportNamespace();

  /**
   * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace#getImportedNamespace()
   * @see #getImportNamespace()
   * @generated
   */
  EAttribute getImportNamespace_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator <em>Or Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator
   * @generated
   */
  EClass getOrOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator <em>XOr Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XOr Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator
   * @generated
   */
  EClass getXOrOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator <em>And Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator
   * @generated
   */
  EClass getAndOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator <em>Implication Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implication Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator
   * @generated
   */
  EClass getImplicationOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator <em>Equals Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator
   * @generated
   */
  EClass getEqualsOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator <em>Not Equals Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equals Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator
   * @generated
   */
  EClass getNotEqualsOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator <em>Not Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator
   * @generated
   */
  EClass getNotOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator <em>Greater Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Than Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator
   * @generated
   */
  EClass getGreaterThanOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator <em>Greater Or Equal Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Or Equal Than Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator
   * @generated
   */
  EClass getGreaterOrEqualThanOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator <em>Less Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Than Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator
   * @generated
   */
  EClass getLessThanOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator <em>Less Or Equal Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Or Equal Than Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator
   * @generated
   */
  EClass getLessOrEqualThanOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator <em>Addition Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator
   * @generated
   */
  EClass getAdditionOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator <em>Substraction Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substraction Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator
   * @generated
   */
  EClass getSubstractionOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator
   * @generated
   */
  EClass getMultiplicationOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator <em>Division Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator
   * @generated
   */
  EClass getDivisionOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator <em>Modulus Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modulus Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator
   * @generated
   */
  EClass getModulusOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator <em>Max Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator
   * @generated
   */
  EClass getMaxOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator <em>Min Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator
   * @generated
   */
  EClass getMinOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator <em>Avg Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avg Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator
   * @generated
   */
  EClass getAvgOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator <em>Sum Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator
   * @generated
   */
  EClass getSumOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator <em>Exponential Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exponential Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator
   * @generated
   */
  EClass getExponentialOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator <em>Absolute Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absolute Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator
   * @generated
   */
  EClass getAbsoluteOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator <em>Natural Logarithm Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Logarithm Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator
   * @generated
   */
  EClass getNaturalLogarithmOperator();

  /**
   * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator <em>Common Logarithm Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Logarithm Operator</em>'.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator
   * @generated
   */
  EClass getCommonLogarithmOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArtistCommonFactory getArtistCommonFactory();

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
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationImpl <em>Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImplication()
     * @generated
     */
    EClass IMPLICATION = eINSTANCE.getImplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLICATION__LEFT = eINSTANCE.getImplication_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLICATION__OPERATOR = eINSTANCE.getImplication_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLICATION__RIGHT = eINSTANCE.getImplication_Right();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DisjunctionImpl <em>Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DisjunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getDisjunction()
     * @generated
     */
    EClass DISJUNCTION = eINSTANCE.getDisjunction();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ConjunctionImpl <em>Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ConjunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getConjunction()
     * @generated
     */
    EClass CONJUNCTION = eINSTANCE.getConjunction();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparisonImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanUnitImpl <em>Boolean Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanUnitImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getBooleanUnit()
     * @generated
     */
    EClass BOOLEAN_UNIT = eINSTANCE.getBooleanUnit();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NegationImpl <em>Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NegationImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNegation()
     * @generated
     */
    EClass NEGATION = eINSTANCE.getNegation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATION__VALUE = eINSTANCE.getNegation_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.RelationalExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getRelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparableExpressionImpl <em>Comparable Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ComparableExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getComparableExpression()
     * @generated
     */
    EClass COMPARABLE_EXPRESSION = eINSTANCE.getComparableExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArithmeticExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getArithmeticExpression()
     * @generated
     */
    EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditiveExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicativeExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberExpression()
     * @generated
     */
    EClass NUMBER_EXPRESSION = eINSTANCE.getNumberExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberFunctionImpl <em>Number Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberFunction()
     * @generated
     */
    EClass NUMBER_FUNCTION = eINSTANCE.getNumberFunction();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaximumFunctionImpl <em>Maximum Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaximumFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMaximumFunction()
     * @generated
     */
    EClass MAXIMUM_FUNCTION = eINSTANCE.getMaximumFunction();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAXIMUM_FUNCTION__VALUES = eINSTANCE.getMaximumFunction_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinimumFunctionImpl <em>Minimum Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinimumFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMinimumFunction()
     * @generated
     */
    EClass MINIMUM_FUNCTION = eINSTANCE.getMinimumFunction();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINIMUM_FUNCTION__VALUES = eINSTANCE.getMinimumFunction_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AverageFunctionImpl <em>Average Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AverageFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAverageFunction()
     * @generated
     */
    EClass AVERAGE_FUNCTION = eINSTANCE.getAverageFunction();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVERAGE_FUNCTION__VALUES = eINSTANCE.getAverageFunction_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumFunctionImpl <em>Sum Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSumFunction()
     * @generated
     */
    EClass SUM_FUNCTION = eINSTANCE.getSumFunction();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_FUNCTION__VALUES = eINSTANCE.getSumFunction_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl <em>Exponential Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExponentialFunction()
     * @generated
     */
    EClass EXPONENTIAL_FUNCTION = eINSTANCE.getExponentialFunction();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPONENTIAL_FUNCTION__BASE = eINSTANCE.getExponentialFunction_Base();

    /**
     * The meta object literal for the '<em><b>Exponent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPONENTIAL_FUNCTION__EXPONENT = eINSTANCE.getExponentialFunction_Exponent();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteFunctionImpl <em>Absolute Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAbsoluteFunction()
     * @generated
     */
    EClass ABSOLUTE_FUNCTION = eINSTANCE.getAbsoluteFunction();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSOLUTE_FUNCTION__VALUE = eINSTANCE.getAbsoluteFunction_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmFunctionImpl <em>Natural Logarithm Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNaturalLogarithmFunction()
     * @generated
     */
    EClass NATURAL_LOGARITHM_FUNCTION = eINSTANCE.getNaturalLogarithmFunction();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_LOGARITHM_FUNCTION__VALUE = eINSTANCE.getNaturalLogarithmFunction_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmFunctionImpl <em>Common Logarithm Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmFunctionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCommonLogarithmFunction()
     * @generated
     */
    EClass COMMON_LOGARITHM_FUNCTION = eINSTANCE.getCommonLogarithmFunction();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMON_LOGARITHM_FUNCTION__VALUE = eINSTANCE.getCommonLogarithmFunction_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ParenthesizedExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getParenthesizedExpression()
     * @generated
     */
    EClass PARENTHESIZED_EXPRESSION = eINSTANCE.getParenthesizedExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPRESSION__VALUE = eINSTANCE.getParenthesizedExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ValueSpecificationImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getValueSpecification()
     * @generated
     */
    EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ObjectSpecificationExpressionImpl <em>Object Specification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ObjectSpecificationExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getObjectSpecificationExpression()
     * @generated
     */
    EClass OBJECT_SPECIFICATION_EXPRESSION = eINSTANCE.getObjectSpecificationExpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_SPECIFICATION_EXPRESSION__TYPE = eINSTANCE.getObjectSpecificationExpression_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_SPECIFICATION_EXPRESSION__VALUE = eINSTANCE.getObjectSpecificationExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CollectionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__VALUES = eINSTANCE.getCollection_Values();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.TupleImpl <em>Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.TupleImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getTuple()
     * @generated
     */
    EClass TUPLE = eINSTANCE.getTuple();

    /**
     * The meta object literal for the '<em><b>Tuples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE__TUPLES = eINSTANCE.getTuple_Tuples();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl <em>Property Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.PropertyValuePairImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getPropertyValuePair()
     * @generated
     */
    EClass PROPERTY_VALUE_PAIR = eINSTANCE.getPropertyValuePair();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUE_PAIR__PROPERTY = eINSTANCE.getPropertyValuePair_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_VALUE_PAIR__VALUE = eINSTANCE.getPropertyValuePair_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.InstanceSpecificationExpressionImpl <em>Instance Specification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.InstanceSpecificationExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getInstanceSpecificationExpression()
     * @generated
     */
    EClass INSTANCE_SPECIFICATION_EXPRESSION = eINSTANCE.getInstanceSpecificationExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_SPECIFICATION_EXPRESSION__VALUE = eINSTANCE.getInstanceSpecificationExpression_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LiteralValueExpressionImpl <em>Literal Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LiteralValueExpressionImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLiteralValueExpression()
     * @generated
     */
    EClass LITERAL_VALUE_EXPRESSION = eINSTANCE.getLiteralValueExpression();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.BooleanLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NumberLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NullLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.StringLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.UnlimitedLiteralImpl <em>Unlimited Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.UnlimitedLiteralImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getUnlimitedLiteral()
     * @generated
     */
    EClass UNLIMITED_LITERAL = eINSTANCE.getUnlimitedLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNLIMITED_LITERAL__VALUE = eINSTANCE.getUnlimitedLiteral_Value();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIorNamespaceImpl <em>Import UR Ior Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIorNamespaceImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportURIorNamespace()
     * @generated
     */
    EClass IMPORT_UR_IOR_NAMESPACE = eINSTANCE.getImportURIorNamespace();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_UR_IOR_NAMESPACE__IMPORT_URI = eINSTANCE.getImportURIorNamespace_ImportURI();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_UR_IOR_NAMESPACE__IMPORTED_NAMESPACE = eINSTANCE.getImportURIorNamespace_ImportedNamespace();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIImpl <em>Import URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportURIImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportURI()
     * @generated
     */
    EClass IMPORT_URI = eINSTANCE.getImportURI();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_URI__IMPORT_URI = eINSTANCE.getImportURI_ImportURI();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportNamespaceImpl <em>Import Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImportNamespaceImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImportNamespace()
     * @generated
     */
    EClass IMPORT_NAMESPACE = eINSTANCE.getImportNamespace();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_NAMESPACE__IMPORTED_NAMESPACE = eINSTANCE.getImportNamespace_ImportedNamespace();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OrOperatorImpl <em>Or Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.OrOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getOrOperator()
     * @generated
     */
    EClass OR_OPERATOR = eINSTANCE.getOrOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.XOrOperatorImpl <em>XOr Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.XOrOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getXOrOperator()
     * @generated
     */
    EClass XOR_OPERATOR = eINSTANCE.getXOrOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AndOperatorImpl <em>And Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AndOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAndOperator()
     * @generated
     */
    EClass AND_OPERATOR = eINSTANCE.getAndOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationOperatorImpl <em>Implication Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ImplicationOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getImplicationOperator()
     * @generated
     */
    EClass IMPLICATION_OPERATOR = eINSTANCE.getImplicationOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.EqualsOperatorImpl <em>Equals Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.EqualsOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getEqualsOperator()
     * @generated
     */
    EClass EQUALS_OPERATOR = eINSTANCE.getEqualsOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotEqualsOperatorImpl <em>Not Equals Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotEqualsOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNotEqualsOperator()
     * @generated
     */
    EClass NOT_EQUALS_OPERATOR = eINSTANCE.getNotEqualsOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotOperatorImpl <em>Not Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NotOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNotOperator()
     * @generated
     */
    EClass NOT_OPERATOR = eINSTANCE.getNotOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterThanOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getGreaterThanOperator()
     * @generated
     */
    EClass GREATER_THAN_OPERATOR = eINSTANCE.getGreaterThanOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterOrEqualThanOperatorImpl <em>Greater Or Equal Than Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.GreaterOrEqualThanOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getGreaterOrEqualThanOperator()
     * @generated
     */
    EClass GREATER_OR_EQUAL_THAN_OPERATOR = eINSTANCE.getGreaterOrEqualThanOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessThanOperatorImpl <em>Less Than Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessThanOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLessThanOperator()
     * @generated
     */
    EClass LESS_THAN_OPERATOR = eINSTANCE.getLessThanOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessOrEqualThanOperatorImpl <em>Less Or Equal Than Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.LessOrEqualThanOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getLessOrEqualThanOperator()
     * @generated
     */
    EClass LESS_OR_EQUAL_THAN_OPERATOR = eINSTANCE.getLessOrEqualThanOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditionOperatorImpl <em>Addition Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AdditionOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAdditionOperator()
     * @generated
     */
    EClass ADDITION_OPERATOR = eINSTANCE.getAdditionOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SubstractionOperatorImpl <em>Substraction Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SubstractionOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSubstractionOperator()
     * @generated
     */
    EClass SUBSTRACTION_OPERATOR = eINSTANCE.getSubstractionOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicationOperatorImpl <em>Multiplication Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MultiplicationOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMultiplicationOperator()
     * @generated
     */
    EClass MULTIPLICATION_OPERATOR = eINSTANCE.getMultiplicationOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DivisionOperatorImpl <em>Division Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.DivisionOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getDivisionOperator()
     * @generated
     */
    EClass DIVISION_OPERATOR = eINSTANCE.getDivisionOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ModulusOperatorImpl <em>Modulus Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ModulusOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getModulusOperator()
     * @generated
     */
    EClass MODULUS_OPERATOR = eINSTANCE.getModulusOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaxOperatorImpl <em>Max Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MaxOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMaxOperator()
     * @generated
     */
    EClass MAX_OPERATOR = eINSTANCE.getMaxOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinOperatorImpl <em>Min Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.MinOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getMinOperator()
     * @generated
     */
    EClass MIN_OPERATOR = eINSTANCE.getMinOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AvgOperatorImpl <em>Avg Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AvgOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAvgOperator()
     * @generated
     */
    EClass AVG_OPERATOR = eINSTANCE.getAvgOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumOperatorImpl <em>Sum Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.SumOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getSumOperator()
     * @generated
     */
    EClass SUM_OPERATOR = eINSTANCE.getSumOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialOperatorImpl <em>Exponential Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ExponentialOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getExponentialOperator()
     * @generated
     */
    EClass EXPONENTIAL_OPERATOR = eINSTANCE.getExponentialOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteOperatorImpl <em>Absolute Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.AbsoluteOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getAbsoluteOperator()
     * @generated
     */
    EClass ABSOLUTE_OPERATOR = eINSTANCE.getAbsoluteOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmOperatorImpl <em>Natural Logarithm Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.NaturalLogarithmOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getNaturalLogarithmOperator()
     * @generated
     */
    EClass NATURAL_LOGARITHM_OPERATOR = eINSTANCE.getNaturalLogarithmOperator();

    /**
     * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmOperatorImpl <em>Common Logarithm Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.CommonLogarithmOperatorImpl
     * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl.ArtistCommonPackageImpl#getCommonLogarithmOperator()
     * @generated
     */
    EClass COMMON_LOGARITHM_OPERATOR = eINSTANCE.getCommonLogarithmOperator();

  }

} //ArtistCommonPackage

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
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtistCommonPackageImpl extends EPackageImpl implements ArtistCommonPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparableExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maximumFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minimumFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass averageFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exponentialFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absoluteFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naturalLogarithmFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonLogarithmFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectSpecificationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceSpecificationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalValueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unlimitedLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importURIorNamespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importURIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importNamespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xOrOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implicationOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEqualsOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterThanOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterOrEqualThanOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessThanOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessOrEqualThanOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substractionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulusOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avgOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exponentialOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absoluteOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naturalLogarithmOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonLogarithmOperatorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArtistCommonPackageImpl()
  {
    super(eNS_URI, ArtistCommonFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ArtistCommonPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArtistCommonPackage init()
  {
    if (isInited) return (ArtistCommonPackage)EPackage.Registry.INSTANCE.getEPackage(ArtistCommonPackage.eNS_URI);

    // Obtain or create and register package
    ArtistCommonPackageImpl theArtistCommonPackage = (ArtistCommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtistCommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtistCommonPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    UMLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theArtistCommonPackage.createPackageContents();

    // Initialize created meta-data
    theArtistCommonPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArtistCommonPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArtistCommonPackage.eNS_URI, theArtistCommonPackage);
    return theArtistCommonPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplication()
  {
    return implicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplication_Left()
  {
    return (EReference)implicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplication_Operator()
  {
    return (EReference)implicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplication_Right()
  {
    return (EReference)implicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjunction()
  {
    return disjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConjunction()
  {
    return conjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparison()
  {
    return comparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanUnit()
  {
    return booleanUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegation()
  {
    return negationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegation_Value()
  {
    return (EReference)negationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparableExpression()
  {
    return comparableExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmeticExpression()
  {
    return arithmeticExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberExpression()
  {
    return numberExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberFunction()
  {
    return numberFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaximumFunction()
  {
    return maximumFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaximumFunction_Values()
  {
    return (EReference)maximumFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinimumFunction()
  {
    return minimumFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinimumFunction_Values()
  {
    return (EReference)minimumFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAverageFunction()
  {
    return averageFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAverageFunction_Values()
  {
    return (EReference)averageFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumFunction()
  {
    return sumFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumFunction_Values()
  {
    return (EReference)sumFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExponentialFunction()
  {
    return exponentialFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExponentialFunction_Base()
  {
    return (EReference)exponentialFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExponentialFunction_Exponent()
  {
    return (EReference)exponentialFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteFunction()
  {
    return absoluteFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbsoluteFunction_Value()
  {
    return (EReference)absoluteFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaturalLogarithmFunction()
  {
    return naturalLogarithmFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaturalLogarithmFunction_Value()
  {
    return (EReference)naturalLogarithmFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonLogarithmFunction()
  {
    return commonLogarithmFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommonLogarithmFunction_Value()
  {
    return (EReference)commonLogarithmFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesizedExpression()
  {
    return parenthesizedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesizedExpression_Value()
  {
    return (EReference)parenthesizedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueSpecification()
  {
    return valueSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectSpecificationExpression()
  {
    return objectSpecificationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSpecificationExpression_Type()
  {
    return (EReference)objectSpecificationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSpecificationExpression_Value()
  {
    return (EReference)objectSpecificationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollection()
  {
    return collectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_Values()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTuple()
  {
    return tupleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTuple_Tuples()
  {
    return (EReference)tupleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValuePair()
  {
    return propertyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyValuePair_Property()
  {
    return (EReference)propertyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyValuePair_Value()
  {
    return (EReference)propertyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceSpecificationExpression()
  {
    return instanceSpecificationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceSpecificationExpression_Value()
  {
    return (EReference)instanceSpecificationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralValueExpression()
  {
    return literalValueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Value()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullLiteral_Value()
  {
    return (EAttribute)nullLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnlimitedLiteral()
  {
    return unlimitedLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnlimitedLiteral_Value()
  {
    return (EAttribute)unlimitedLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportURIorNamespace()
  {
    return importURIorNamespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportURIorNamespace_ImportURI()
  {
    return (EAttribute)importURIorNamespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportURIorNamespace_ImportedNamespace()
  {
    return (EAttribute)importURIorNamespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportURI()
  {
    return importURIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportURI_ImportURI()
  {
    return (EAttribute)importURIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportNamespace()
  {
    return importNamespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportNamespace_ImportedNamespace()
  {
    return (EAttribute)importNamespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrOperator()
  {
    return orOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXOrOperator()
  {
    return xOrOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndOperator()
  {
    return andOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplicationOperator()
  {
    return implicationOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualsOperator()
  {
    return equalsOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotEqualsOperator()
  {
    return notEqualsOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotOperator()
  {
    return notOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterThanOperator()
  {
    return greaterThanOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterOrEqualThanOperator()
  {
    return greaterOrEqualThanOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLessThanOperator()
  {
    return lessThanOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLessOrEqualThanOperator()
  {
    return lessOrEqualThanOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditionOperator()
  {
    return additionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstractionOperator()
  {
    return substractionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicationOperator()
  {
    return multiplicationOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivisionOperator()
  {
    return divisionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModulusOperator()
  {
    return modulusOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxOperator()
  {
    return maxOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinOperator()
  {
    return minOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAvgOperator()
  {
    return avgOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumOperator()
  {
    return sumOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExponentialOperator()
  {
    return exponentialOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteOperator()
  {
    return absoluteOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaturalLogarithmOperator()
  {
    return naturalLogarithmOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonLogarithmOperator()
  {
    return commonLogarithmOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonFactory getArtistCommonFactory()
  {
    return (ArtistCommonFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    expressionEClass = createEClass(EXPRESSION);

    implicationEClass = createEClass(IMPLICATION);
    createEReference(implicationEClass, IMPLICATION__LEFT);
    createEReference(implicationEClass, IMPLICATION__OPERATOR);
    createEReference(implicationEClass, IMPLICATION__RIGHT);

    disjunctionEClass = createEClass(DISJUNCTION);

    conjunctionEClass = createEClass(CONJUNCTION);

    comparisonEClass = createEClass(COMPARISON);

    booleanUnitEClass = createEClass(BOOLEAN_UNIT);

    negationEClass = createEClass(NEGATION);
    createEReference(negationEClass, NEGATION__VALUE);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);

    comparableExpressionEClass = createEClass(COMPARABLE_EXPRESSION);

    arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);

    numberExpressionEClass = createEClass(NUMBER_EXPRESSION);

    numberFunctionEClass = createEClass(NUMBER_FUNCTION);

    maximumFunctionEClass = createEClass(MAXIMUM_FUNCTION);
    createEReference(maximumFunctionEClass, MAXIMUM_FUNCTION__VALUES);

    minimumFunctionEClass = createEClass(MINIMUM_FUNCTION);
    createEReference(minimumFunctionEClass, MINIMUM_FUNCTION__VALUES);

    averageFunctionEClass = createEClass(AVERAGE_FUNCTION);
    createEReference(averageFunctionEClass, AVERAGE_FUNCTION__VALUES);

    sumFunctionEClass = createEClass(SUM_FUNCTION);
    createEReference(sumFunctionEClass, SUM_FUNCTION__VALUES);

    exponentialFunctionEClass = createEClass(EXPONENTIAL_FUNCTION);
    createEReference(exponentialFunctionEClass, EXPONENTIAL_FUNCTION__BASE);
    createEReference(exponentialFunctionEClass, EXPONENTIAL_FUNCTION__EXPONENT);

    absoluteFunctionEClass = createEClass(ABSOLUTE_FUNCTION);
    createEReference(absoluteFunctionEClass, ABSOLUTE_FUNCTION__VALUE);

    naturalLogarithmFunctionEClass = createEClass(NATURAL_LOGARITHM_FUNCTION);
    createEReference(naturalLogarithmFunctionEClass, NATURAL_LOGARITHM_FUNCTION__VALUE);

    commonLogarithmFunctionEClass = createEClass(COMMON_LOGARITHM_FUNCTION);
    createEReference(commonLogarithmFunctionEClass, COMMON_LOGARITHM_FUNCTION__VALUE);

    parenthesizedExpressionEClass = createEClass(PARENTHESIZED_EXPRESSION);
    createEReference(parenthesizedExpressionEClass, PARENTHESIZED_EXPRESSION__VALUE);

    valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

    objectSpecificationExpressionEClass = createEClass(OBJECT_SPECIFICATION_EXPRESSION);
    createEReference(objectSpecificationExpressionEClass, OBJECT_SPECIFICATION_EXPRESSION__TYPE);
    createEReference(objectSpecificationExpressionEClass, OBJECT_SPECIFICATION_EXPRESSION__VALUE);

    collectionEClass = createEClass(COLLECTION);
    createEReference(collectionEClass, COLLECTION__VALUES);

    tupleEClass = createEClass(TUPLE);
    createEReference(tupleEClass, TUPLE__TUPLES);

    propertyValuePairEClass = createEClass(PROPERTY_VALUE_PAIR);
    createEReference(propertyValuePairEClass, PROPERTY_VALUE_PAIR__PROPERTY);
    createEReference(propertyValuePairEClass, PROPERTY_VALUE_PAIR__VALUE);

    instanceSpecificationExpressionEClass = createEClass(INSTANCE_SPECIFICATION_EXPRESSION);
    createEReference(instanceSpecificationExpressionEClass, INSTANCE_SPECIFICATION_EXPRESSION__VALUE);

    literalValueExpressionEClass = createEClass(LITERAL_VALUE_EXPRESSION);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    nullLiteralEClass = createEClass(NULL_LITERAL);
    createEAttribute(nullLiteralEClass, NULL_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    unlimitedLiteralEClass = createEClass(UNLIMITED_LITERAL);
    createEAttribute(unlimitedLiteralEClass, UNLIMITED_LITERAL__VALUE);

    operatorEClass = createEClass(OPERATOR);

    importURIorNamespaceEClass = createEClass(IMPORT_UR_IOR_NAMESPACE);
    createEAttribute(importURIorNamespaceEClass, IMPORT_UR_IOR_NAMESPACE__IMPORT_URI);
    createEAttribute(importURIorNamespaceEClass, IMPORT_UR_IOR_NAMESPACE__IMPORTED_NAMESPACE);

    importURIEClass = createEClass(IMPORT_URI);
    createEAttribute(importURIEClass, IMPORT_URI__IMPORT_URI);

    importNamespaceEClass = createEClass(IMPORT_NAMESPACE);
    createEAttribute(importNamespaceEClass, IMPORT_NAMESPACE__IMPORTED_NAMESPACE);

    orOperatorEClass = createEClass(OR_OPERATOR);

    xOrOperatorEClass = createEClass(XOR_OPERATOR);

    andOperatorEClass = createEClass(AND_OPERATOR);

    implicationOperatorEClass = createEClass(IMPLICATION_OPERATOR);

    equalsOperatorEClass = createEClass(EQUALS_OPERATOR);

    notEqualsOperatorEClass = createEClass(NOT_EQUALS_OPERATOR);

    notOperatorEClass = createEClass(NOT_OPERATOR);

    greaterThanOperatorEClass = createEClass(GREATER_THAN_OPERATOR);

    greaterOrEqualThanOperatorEClass = createEClass(GREATER_OR_EQUAL_THAN_OPERATOR);

    lessThanOperatorEClass = createEClass(LESS_THAN_OPERATOR);

    lessOrEqualThanOperatorEClass = createEClass(LESS_OR_EQUAL_THAN_OPERATOR);

    additionOperatorEClass = createEClass(ADDITION_OPERATOR);

    substractionOperatorEClass = createEClass(SUBSTRACTION_OPERATOR);

    multiplicationOperatorEClass = createEClass(MULTIPLICATION_OPERATOR);

    divisionOperatorEClass = createEClass(DIVISION_OPERATOR);

    modulusOperatorEClass = createEClass(MODULUS_OPERATOR);

    maxOperatorEClass = createEClass(MAX_OPERATOR);

    minOperatorEClass = createEClass(MIN_OPERATOR);

    avgOperatorEClass = createEClass(AVG_OPERATOR);

    sumOperatorEClass = createEClass(SUM_OPERATOR);

    exponentialOperatorEClass = createEClass(EXPONENTIAL_OPERATOR);

    absoluteOperatorEClass = createEClass(ABSOLUTE_OPERATOR);

    naturalLogarithmOperatorEClass = createEClass(NATURAL_LOGARITHM_OPERATOR);

    commonLogarithmOperatorEClass = createEClass(COMMON_LOGARITHM_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    implicationEClass.getESuperTypes().add(this.getExpression());
    disjunctionEClass.getESuperTypes().add(this.getImplication());
    conjunctionEClass.getESuperTypes().add(this.getDisjunction());
    comparisonEClass.getESuperTypes().add(this.getConjunction());
    booleanUnitEClass.getESuperTypes().add(this.getComparison());
    negationEClass.getESuperTypes().add(this.getBooleanUnit());
    relationalExpressionEClass.getESuperTypes().add(this.getBooleanUnit());
    comparableExpressionEClass.getESuperTypes().add(this.getRelationalExpression());
    arithmeticExpressionEClass.getESuperTypes().add(this.getComparableExpression());
    additiveExpressionEClass.getESuperTypes().add(this.getArithmeticExpression());
    multiplicativeExpressionEClass.getESuperTypes().add(this.getAdditiveExpression());
    numberExpressionEClass.getESuperTypes().add(this.getMultiplicativeExpression());
    numberFunctionEClass.getESuperTypes().add(this.getNumberExpression());
    maximumFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    minimumFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    averageFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    sumFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    exponentialFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    absoluteFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    naturalLogarithmFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    commonLogarithmFunctionEClass.getESuperTypes().add(this.getNumberFunction());
    parenthesizedExpressionEClass.getESuperTypes().add(this.getComparableExpression());
    objectSpecificationExpressionEClass.getESuperTypes().add(this.getComparableExpression());
    objectSpecificationExpressionEClass.getESuperTypes().add(this.getValueSpecification());
    instanceSpecificationExpressionEClass.getESuperTypes().add(this.getComparableExpression());
    instanceSpecificationExpressionEClass.getESuperTypes().add(this.getValueSpecification());
    literalValueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
    booleanLiteralEClass.getESuperTypes().add(this.getBooleanUnit());
    booleanLiteralEClass.getESuperTypes().add(this.getLiteralValueExpression());
    numberLiteralEClass.getESuperTypes().add(this.getNumberExpression());
    numberLiteralEClass.getESuperTypes().add(this.getLiteralValueExpression());
    nullLiteralEClass.getESuperTypes().add(this.getComparableExpression());
    nullLiteralEClass.getESuperTypes().add(this.getLiteralValueExpression());
    stringLiteralEClass.getESuperTypes().add(this.getComparableExpression());
    stringLiteralEClass.getESuperTypes().add(this.getLiteralValueExpression());
    unlimitedLiteralEClass.getESuperTypes().add(this.getComparableExpression());
    unlimitedLiteralEClass.getESuperTypes().add(this.getLiteralValueExpression());
    orOperatorEClass.getESuperTypes().add(this.getOperator());
    xOrOperatorEClass.getESuperTypes().add(this.getOperator());
    andOperatorEClass.getESuperTypes().add(this.getOperator());
    implicationOperatorEClass.getESuperTypes().add(this.getOperator());
    equalsOperatorEClass.getESuperTypes().add(this.getOperator());
    notEqualsOperatorEClass.getESuperTypes().add(this.getOperator());
    notOperatorEClass.getESuperTypes().add(this.getOperator());
    greaterThanOperatorEClass.getESuperTypes().add(this.getOperator());
    greaterOrEqualThanOperatorEClass.getESuperTypes().add(this.getOperator());
    lessThanOperatorEClass.getESuperTypes().add(this.getOperator());
    lessOrEqualThanOperatorEClass.getESuperTypes().add(this.getOperator());
    additionOperatorEClass.getESuperTypes().add(this.getOperator());
    substractionOperatorEClass.getESuperTypes().add(this.getOperator());
    multiplicationOperatorEClass.getESuperTypes().add(this.getOperator());
    divisionOperatorEClass.getESuperTypes().add(this.getOperator());
    modulusOperatorEClass.getESuperTypes().add(this.getOperator());
    maxOperatorEClass.getESuperTypes().add(this.getOperator());
    minOperatorEClass.getESuperTypes().add(this.getOperator());
    avgOperatorEClass.getESuperTypes().add(this.getOperator());
    sumOperatorEClass.getESuperTypes().add(this.getOperator());
    exponentialOperatorEClass.getESuperTypes().add(this.getOperator());
    absoluteOperatorEClass.getESuperTypes().add(this.getOperator());
    naturalLogarithmOperatorEClass.getESuperTypes().add(this.getOperator());
    commonLogarithmOperatorEClass.getESuperTypes().add(this.getOperator());

    // Initialize classes and features; add operations and parameters
    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplication_Left(), this.getDisjunction(), null, "left", null, 0, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplication_Operator(), this.getOperator(), null, "operator", null, 0, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplication_Right(), this.getDisjunction(), null, "right", null, 0, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanUnitEClass, BooleanUnit.class, "BooleanUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegation_Value(), this.getBooleanUnit(), null, "value", null, 0, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparableExpressionEClass, ComparableExpression.class, "ComparableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberExpressionEClass, NumberExpression.class, "NumberExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberFunctionEClass, NumberFunction.class, "NumberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maximumFunctionEClass, MaximumFunction.class, "MaximumFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaximumFunction_Values(), this.getNumberExpression(), null, "values", null, 0, -1, MaximumFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minimumFunctionEClass, MinimumFunction.class, "MinimumFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinimumFunction_Values(), this.getNumberExpression(), null, "values", null, 0, -1, MinimumFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(averageFunctionEClass, AverageFunction.class, "AverageFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAverageFunction_Values(), this.getNumberExpression(), null, "values", null, 0, -1, AverageFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumFunctionEClass, SumFunction.class, "SumFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumFunction_Values(), this.getNumberExpression(), null, "values", null, 0, -1, SumFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exponentialFunctionEClass, ExponentialFunction.class, "ExponentialFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExponentialFunction_Base(), this.getNumberExpression(), null, "base", null, 0, 1, ExponentialFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExponentialFunction_Exponent(), this.getNumberExpression(), null, "exponent", null, 0, 1, ExponentialFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absoluteFunctionEClass, AbsoluteFunction.class, "AbsoluteFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbsoluteFunction_Value(), this.getNumberExpression(), null, "value", null, 0, 1, AbsoluteFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naturalLogarithmFunctionEClass, NaturalLogarithmFunction.class, "NaturalLogarithmFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNaturalLogarithmFunction_Value(), this.getNumberExpression(), null, "value", null, 0, 1, NaturalLogarithmFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commonLogarithmFunctionEClass, CommonLogarithmFunction.class, "CommonLogarithmFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommonLogarithmFunction_Value(), this.getNumberExpression(), null, "value", null, 0, 1, CommonLogarithmFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesizedExpressionEClass, ParenthesizedExpression.class, "ParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesizedExpression_Value(), this.getExpression(), null, "value", null, 0, 1, ParenthesizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectSpecificationExpressionEClass, ObjectSpecificationExpression.class, "ObjectSpecificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectSpecificationExpression_Type(), theUMLPackage.getDataType(), null, "type", null, 0, 1, ObjectSpecificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectSpecificationExpression_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, ObjectSpecificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollection_Values(), this.getValueSpecification(), null, "values", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTuple_Tuples(), this.getPropertyValuePair(), null, "tuples", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValuePairEClass, PropertyValuePair.class, "PropertyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyValuePair_Property(), theUMLPackage.getProperty(), null, "property", null, 0, 1, PropertyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyValuePair_Value(), this.getValueSpecification(), null, "value", null, 0, 1, PropertyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceSpecificationExpressionEClass, InstanceSpecificationExpression.class, "InstanceSpecificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceSpecificationExpression_Value(), theUMLPackage.getInstanceSpecification(), null, "value", null, 0, 1, InstanceSpecificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueExpressionEClass, LiteralValueExpression.class, "LiteralValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Value(), theEcorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), theEcorePackage.getEBigDecimal(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, NullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unlimitedLiteralEClass, UnlimitedLiteral.class, "UnlimitedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnlimitedLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, UnlimitedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importURIorNamespaceEClass, ImportURIorNamespace.class, "ImportURIorNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportURIorNamespace_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, ImportURIorNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportURIorNamespace_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, ImportURIorNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importURIEClass, ImportURI.class, "ImportURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportURI_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, ImportURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importNamespaceEClass, ImportNamespace.class, "ImportNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportNamespace_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, ImportNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orOperatorEClass, OrOperator.class, "OrOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xOrOperatorEClass, XOrOperator.class, "XOrOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andOperatorEClass, AndOperator.class, "AndOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(implicationOperatorEClass, ImplicationOperator.class, "ImplicationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equalsOperatorEClass, EqualsOperator.class, "EqualsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEqualsOperatorEClass, NotEqualsOperator.class, "NotEqualsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notOperatorEClass, NotOperator.class, "NotOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(greaterThanOperatorEClass, GreaterThanOperator.class, "GreaterThanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(greaterOrEqualThanOperatorEClass, GreaterOrEqualThanOperator.class, "GreaterOrEqualThanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lessThanOperatorEClass, LessThanOperator.class, "LessThanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lessOrEqualThanOperatorEClass, LessOrEqualThanOperator.class, "LessOrEqualThanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additionOperatorEClass, AdditionOperator.class, "AdditionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(substractionOperatorEClass, SubstractionOperator.class, "SubstractionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicationOperatorEClass, MultiplicationOperator.class, "MultiplicationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divisionOperatorEClass, DivisionOperator.class, "DivisionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modulusOperatorEClass, ModulusOperator.class, "ModulusOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxOperatorEClass, MaxOperator.class, "MaxOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minOperatorEClass, MinOperator.class, "MinOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(avgOperatorEClass, AvgOperator.class, "AvgOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumOperatorEClass, SumOperator.class, "SumOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exponentialOperatorEClass, ExponentialOperator.class, "ExponentialOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(absoluteOperatorEClass, AbsoluteOperator.class, "AbsoluteOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(naturalLogarithmOperatorEClass, NaturalLogarithmOperator.class, "NaturalLogarithmOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commonLogarithmOperatorEClass, CommonLogarithmOperator.class, "CommonLogarithmOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ArtistCommonPackageImpl

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
package eu.artist.postmigration.nfrvt.lang.common.artistCommon.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage
 * @generated
 */
public class ArtistCommonSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArtistCommonPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArtistCommonPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArtistCommonPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.IMPLICATION:
      {
        Implication implication = (Implication)theEObject;
        T result = caseImplication(implication);
        if (result == null) result = caseExpression(implication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.DISJUNCTION:
      {
        Disjunction disjunction = (Disjunction)theEObject;
        T result = caseDisjunction(disjunction);
        if (result == null) result = caseImplication(disjunction);
        if (result == null) result = caseExpression(disjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = caseDisjunction(conjunction);
        if (result == null) result = caseImplication(conjunction);
        if (result == null) result = caseExpression(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseConjunction(comparison);
        if (result == null) result = caseDisjunction(comparison);
        if (result == null) result = caseImplication(comparison);
        if (result == null) result = caseExpression(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.BOOLEAN_UNIT:
      {
        BooleanUnit booleanUnit = (BooleanUnit)theEObject;
        T result = caseBooleanUnit(booleanUnit);
        if (result == null) result = caseComparison(booleanUnit);
        if (result == null) result = caseConjunction(booleanUnit);
        if (result == null) result = caseDisjunction(booleanUnit);
        if (result == null) result = caseImplication(booleanUnit);
        if (result == null) result = caseExpression(booleanUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NEGATION:
      {
        Negation negation = (Negation)theEObject;
        T result = caseNegation(negation);
        if (result == null) result = caseBooleanUnit(negation);
        if (result == null) result = caseComparison(negation);
        if (result == null) result = caseConjunction(negation);
        if (result == null) result = caseDisjunction(negation);
        if (result == null) result = caseImplication(negation);
        if (result == null) result = caseExpression(negation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.RELATIONAL_EXPRESSION:
      {
        RelationalExpression relationalExpression = (RelationalExpression)theEObject;
        T result = caseRelationalExpression(relationalExpression);
        if (result == null) result = caseBooleanUnit(relationalExpression);
        if (result == null) result = caseComparison(relationalExpression);
        if (result == null) result = caseConjunction(relationalExpression);
        if (result == null) result = caseDisjunction(relationalExpression);
        if (result == null) result = caseImplication(relationalExpression);
        if (result == null) result = caseExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.COMPARABLE_EXPRESSION:
      {
        ComparableExpression comparableExpression = (ComparableExpression)theEObject;
        T result = caseComparableExpression(comparableExpression);
        if (result == null) result = caseRelationalExpression(comparableExpression);
        if (result == null) result = caseBooleanUnit(comparableExpression);
        if (result == null) result = caseComparison(comparableExpression);
        if (result == null) result = caseConjunction(comparableExpression);
        if (result == null) result = caseDisjunction(comparableExpression);
        if (result == null) result = caseImplication(comparableExpression);
        if (result == null) result = caseExpression(comparableExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.ARITHMETIC_EXPRESSION:
      {
        ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
        T result = caseArithmeticExpression(arithmeticExpression);
        if (result == null) result = caseComparableExpression(arithmeticExpression);
        if (result == null) result = caseRelationalExpression(arithmeticExpression);
        if (result == null) result = caseBooleanUnit(arithmeticExpression);
        if (result == null) result = caseComparison(arithmeticExpression);
        if (result == null) result = caseConjunction(arithmeticExpression);
        if (result == null) result = caseDisjunction(arithmeticExpression);
        if (result == null) result = caseImplication(arithmeticExpression);
        if (result == null) result = caseExpression(arithmeticExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.ADDITIVE_EXPRESSION:
      {
        AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
        T result = caseAdditiveExpression(additiveExpression);
        if (result == null) result = caseArithmeticExpression(additiveExpression);
        if (result == null) result = caseComparableExpression(additiveExpression);
        if (result == null) result = caseRelationalExpression(additiveExpression);
        if (result == null) result = caseBooleanUnit(additiveExpression);
        if (result == null) result = caseComparison(additiveExpression);
        if (result == null) result = caseConjunction(additiveExpression);
        if (result == null) result = caseDisjunction(additiveExpression);
        if (result == null) result = caseImplication(additiveExpression);
        if (result == null) result = caseExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MULTIPLICATIVE_EXPRESSION:
      {
        MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
        T result = caseMultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = caseAdditiveExpression(multiplicativeExpression);
        if (result == null) result = caseArithmeticExpression(multiplicativeExpression);
        if (result == null) result = caseComparableExpression(multiplicativeExpression);
        if (result == null) result = caseRelationalExpression(multiplicativeExpression);
        if (result == null) result = caseBooleanUnit(multiplicativeExpression);
        if (result == null) result = caseComparison(multiplicativeExpression);
        if (result == null) result = caseConjunction(multiplicativeExpression);
        if (result == null) result = caseDisjunction(multiplicativeExpression);
        if (result == null) result = caseImplication(multiplicativeExpression);
        if (result == null) result = caseExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NUMBER_EXPRESSION:
      {
        NumberExpression numberExpression = (NumberExpression)theEObject;
        T result = caseNumberExpression(numberExpression);
        if (result == null) result = caseMultiplicativeExpression(numberExpression);
        if (result == null) result = caseAdditiveExpression(numberExpression);
        if (result == null) result = caseArithmeticExpression(numberExpression);
        if (result == null) result = caseComparableExpression(numberExpression);
        if (result == null) result = caseRelationalExpression(numberExpression);
        if (result == null) result = caseBooleanUnit(numberExpression);
        if (result == null) result = caseComparison(numberExpression);
        if (result == null) result = caseConjunction(numberExpression);
        if (result == null) result = caseDisjunction(numberExpression);
        if (result == null) result = caseImplication(numberExpression);
        if (result == null) result = caseExpression(numberExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NUMBER_FUNCTION:
      {
        NumberFunction numberFunction = (NumberFunction)theEObject;
        T result = caseNumberFunction(numberFunction);
        if (result == null) result = caseNumberExpression(numberFunction);
        if (result == null) result = caseMultiplicativeExpression(numberFunction);
        if (result == null) result = caseAdditiveExpression(numberFunction);
        if (result == null) result = caseArithmeticExpression(numberFunction);
        if (result == null) result = caseComparableExpression(numberFunction);
        if (result == null) result = caseRelationalExpression(numberFunction);
        if (result == null) result = caseBooleanUnit(numberFunction);
        if (result == null) result = caseComparison(numberFunction);
        if (result == null) result = caseConjunction(numberFunction);
        if (result == null) result = caseDisjunction(numberFunction);
        if (result == null) result = caseImplication(numberFunction);
        if (result == null) result = caseExpression(numberFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MAXIMUM_FUNCTION:
      {
        MaximumFunction maximumFunction = (MaximumFunction)theEObject;
        T result = caseMaximumFunction(maximumFunction);
        if (result == null) result = caseNumberFunction(maximumFunction);
        if (result == null) result = caseNumberExpression(maximumFunction);
        if (result == null) result = caseMultiplicativeExpression(maximumFunction);
        if (result == null) result = caseAdditiveExpression(maximumFunction);
        if (result == null) result = caseArithmeticExpression(maximumFunction);
        if (result == null) result = caseComparableExpression(maximumFunction);
        if (result == null) result = caseRelationalExpression(maximumFunction);
        if (result == null) result = caseBooleanUnit(maximumFunction);
        if (result == null) result = caseComparison(maximumFunction);
        if (result == null) result = caseConjunction(maximumFunction);
        if (result == null) result = caseDisjunction(maximumFunction);
        if (result == null) result = caseImplication(maximumFunction);
        if (result == null) result = caseExpression(maximumFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MINIMUM_FUNCTION:
      {
        MinimumFunction minimumFunction = (MinimumFunction)theEObject;
        T result = caseMinimumFunction(minimumFunction);
        if (result == null) result = caseNumberFunction(minimumFunction);
        if (result == null) result = caseNumberExpression(minimumFunction);
        if (result == null) result = caseMultiplicativeExpression(minimumFunction);
        if (result == null) result = caseAdditiveExpression(minimumFunction);
        if (result == null) result = caseArithmeticExpression(minimumFunction);
        if (result == null) result = caseComparableExpression(minimumFunction);
        if (result == null) result = caseRelationalExpression(minimumFunction);
        if (result == null) result = caseBooleanUnit(minimumFunction);
        if (result == null) result = caseComparison(minimumFunction);
        if (result == null) result = caseConjunction(minimumFunction);
        if (result == null) result = caseDisjunction(minimumFunction);
        if (result == null) result = caseImplication(minimumFunction);
        if (result == null) result = caseExpression(minimumFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.AVERAGE_FUNCTION:
      {
        AverageFunction averageFunction = (AverageFunction)theEObject;
        T result = caseAverageFunction(averageFunction);
        if (result == null) result = caseNumberFunction(averageFunction);
        if (result == null) result = caseNumberExpression(averageFunction);
        if (result == null) result = caseMultiplicativeExpression(averageFunction);
        if (result == null) result = caseAdditiveExpression(averageFunction);
        if (result == null) result = caseArithmeticExpression(averageFunction);
        if (result == null) result = caseComparableExpression(averageFunction);
        if (result == null) result = caseRelationalExpression(averageFunction);
        if (result == null) result = caseBooleanUnit(averageFunction);
        if (result == null) result = caseComparison(averageFunction);
        if (result == null) result = caseConjunction(averageFunction);
        if (result == null) result = caseDisjunction(averageFunction);
        if (result == null) result = caseImplication(averageFunction);
        if (result == null) result = caseExpression(averageFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.SUM_FUNCTION:
      {
        SumFunction sumFunction = (SumFunction)theEObject;
        T result = caseSumFunction(sumFunction);
        if (result == null) result = caseNumberFunction(sumFunction);
        if (result == null) result = caseNumberExpression(sumFunction);
        if (result == null) result = caseMultiplicativeExpression(sumFunction);
        if (result == null) result = caseAdditiveExpression(sumFunction);
        if (result == null) result = caseArithmeticExpression(sumFunction);
        if (result == null) result = caseComparableExpression(sumFunction);
        if (result == null) result = caseRelationalExpression(sumFunction);
        if (result == null) result = caseBooleanUnit(sumFunction);
        if (result == null) result = caseComparison(sumFunction);
        if (result == null) result = caseConjunction(sumFunction);
        if (result == null) result = caseDisjunction(sumFunction);
        if (result == null) result = caseImplication(sumFunction);
        if (result == null) result = caseExpression(sumFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.EXPONENTIAL_FUNCTION:
      {
        ExponentialFunction exponentialFunction = (ExponentialFunction)theEObject;
        T result = caseExponentialFunction(exponentialFunction);
        if (result == null) result = caseNumberFunction(exponentialFunction);
        if (result == null) result = caseNumberExpression(exponentialFunction);
        if (result == null) result = caseMultiplicativeExpression(exponentialFunction);
        if (result == null) result = caseAdditiveExpression(exponentialFunction);
        if (result == null) result = caseArithmeticExpression(exponentialFunction);
        if (result == null) result = caseComparableExpression(exponentialFunction);
        if (result == null) result = caseRelationalExpression(exponentialFunction);
        if (result == null) result = caseBooleanUnit(exponentialFunction);
        if (result == null) result = caseComparison(exponentialFunction);
        if (result == null) result = caseConjunction(exponentialFunction);
        if (result == null) result = caseDisjunction(exponentialFunction);
        if (result == null) result = caseImplication(exponentialFunction);
        if (result == null) result = caseExpression(exponentialFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.ABSOLUTE_FUNCTION:
      {
        AbsoluteFunction absoluteFunction = (AbsoluteFunction)theEObject;
        T result = caseAbsoluteFunction(absoluteFunction);
        if (result == null) result = caseNumberFunction(absoluteFunction);
        if (result == null) result = caseNumberExpression(absoluteFunction);
        if (result == null) result = caseMultiplicativeExpression(absoluteFunction);
        if (result == null) result = caseAdditiveExpression(absoluteFunction);
        if (result == null) result = caseArithmeticExpression(absoluteFunction);
        if (result == null) result = caseComparableExpression(absoluteFunction);
        if (result == null) result = caseRelationalExpression(absoluteFunction);
        if (result == null) result = caseBooleanUnit(absoluteFunction);
        if (result == null) result = caseComparison(absoluteFunction);
        if (result == null) result = caseConjunction(absoluteFunction);
        if (result == null) result = caseDisjunction(absoluteFunction);
        if (result == null) result = caseImplication(absoluteFunction);
        if (result == null) result = caseExpression(absoluteFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NATURAL_LOGARITHM_FUNCTION:
      {
        NaturalLogarithmFunction naturalLogarithmFunction = (NaturalLogarithmFunction)theEObject;
        T result = caseNaturalLogarithmFunction(naturalLogarithmFunction);
        if (result == null) result = caseNumberFunction(naturalLogarithmFunction);
        if (result == null) result = caseNumberExpression(naturalLogarithmFunction);
        if (result == null) result = caseMultiplicativeExpression(naturalLogarithmFunction);
        if (result == null) result = caseAdditiveExpression(naturalLogarithmFunction);
        if (result == null) result = caseArithmeticExpression(naturalLogarithmFunction);
        if (result == null) result = caseComparableExpression(naturalLogarithmFunction);
        if (result == null) result = caseRelationalExpression(naturalLogarithmFunction);
        if (result == null) result = caseBooleanUnit(naturalLogarithmFunction);
        if (result == null) result = caseComparison(naturalLogarithmFunction);
        if (result == null) result = caseConjunction(naturalLogarithmFunction);
        if (result == null) result = caseDisjunction(naturalLogarithmFunction);
        if (result == null) result = caseImplication(naturalLogarithmFunction);
        if (result == null) result = caseExpression(naturalLogarithmFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.COMMON_LOGARITHM_FUNCTION:
      {
        CommonLogarithmFunction commonLogarithmFunction = (CommonLogarithmFunction)theEObject;
        T result = caseCommonLogarithmFunction(commonLogarithmFunction);
        if (result == null) result = caseNumberFunction(commonLogarithmFunction);
        if (result == null) result = caseNumberExpression(commonLogarithmFunction);
        if (result == null) result = caseMultiplicativeExpression(commonLogarithmFunction);
        if (result == null) result = caseAdditiveExpression(commonLogarithmFunction);
        if (result == null) result = caseArithmeticExpression(commonLogarithmFunction);
        if (result == null) result = caseComparableExpression(commonLogarithmFunction);
        if (result == null) result = caseRelationalExpression(commonLogarithmFunction);
        if (result == null) result = caseBooleanUnit(commonLogarithmFunction);
        if (result == null) result = caseComparison(commonLogarithmFunction);
        if (result == null) result = caseConjunction(commonLogarithmFunction);
        if (result == null) result = caseDisjunction(commonLogarithmFunction);
        if (result == null) result = caseImplication(commonLogarithmFunction);
        if (result == null) result = caseExpression(commonLogarithmFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.PARENTHESIZED_EXPRESSION:
      {
        ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression)theEObject;
        T result = caseParenthesizedExpression(parenthesizedExpression);
        if (result == null) result = caseComparableExpression(parenthesizedExpression);
        if (result == null) result = caseRelationalExpression(parenthesizedExpression);
        if (result == null) result = caseBooleanUnit(parenthesizedExpression);
        if (result == null) result = caseComparison(parenthesizedExpression);
        if (result == null) result = caseConjunction(parenthesizedExpression);
        if (result == null) result = caseDisjunction(parenthesizedExpression);
        if (result == null) result = caseImplication(parenthesizedExpression);
        if (result == null) result = caseExpression(parenthesizedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.VALUE_SPECIFICATION:
      {
        ValueSpecification valueSpecification = (ValueSpecification)theEObject;
        T result = caseValueSpecification(valueSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.OBJECT_SPECIFICATION_EXPRESSION:
      {
        ObjectSpecificationExpression objectSpecificationExpression = (ObjectSpecificationExpression)theEObject;
        T result = caseObjectSpecificationExpression(objectSpecificationExpression);
        if (result == null) result = caseComparableExpression(objectSpecificationExpression);
        if (result == null) result = caseValueSpecification(objectSpecificationExpression);
        if (result == null) result = caseRelationalExpression(objectSpecificationExpression);
        if (result == null) result = caseBooleanUnit(objectSpecificationExpression);
        if (result == null) result = caseComparison(objectSpecificationExpression);
        if (result == null) result = caseConjunction(objectSpecificationExpression);
        if (result == null) result = caseDisjunction(objectSpecificationExpression);
        if (result == null) result = caseImplication(objectSpecificationExpression);
        if (result == null) result = caseExpression(objectSpecificationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.TUPLE:
      {
        Tuple tuple = (Tuple)theEObject;
        T result = caseTuple(tuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.PROPERTY_VALUE_PAIR:
      {
        PropertyValuePair propertyValuePair = (PropertyValuePair)theEObject;
        T result = casePropertyValuePair(propertyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.INSTANCE_SPECIFICATION_EXPRESSION:
      {
        InstanceSpecificationExpression instanceSpecificationExpression = (InstanceSpecificationExpression)theEObject;
        T result = caseInstanceSpecificationExpression(instanceSpecificationExpression);
        if (result == null) result = caseComparableExpression(instanceSpecificationExpression);
        if (result == null) result = caseValueSpecification(instanceSpecificationExpression);
        if (result == null) result = caseRelationalExpression(instanceSpecificationExpression);
        if (result == null) result = caseBooleanUnit(instanceSpecificationExpression);
        if (result == null) result = caseComparison(instanceSpecificationExpression);
        if (result == null) result = caseConjunction(instanceSpecificationExpression);
        if (result == null) result = caseDisjunction(instanceSpecificationExpression);
        if (result == null) result = caseImplication(instanceSpecificationExpression);
        if (result == null) result = caseExpression(instanceSpecificationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.LITERAL_VALUE_EXPRESSION:
      {
        LiteralValueExpression literalValueExpression = (LiteralValueExpression)theEObject;
        T result = caseLiteralValueExpression(literalValueExpression);
        if (result == null) result = caseValueSpecification(literalValueExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseBooleanUnit(booleanLiteral);
        if (result == null) result = caseLiteralValueExpression(booleanLiteral);
        if (result == null) result = caseComparison(booleanLiteral);
        if (result == null) result = caseValueSpecification(booleanLiteral);
        if (result == null) result = caseConjunction(booleanLiteral);
        if (result == null) result = caseDisjunction(booleanLiteral);
        if (result == null) result = caseImplication(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseNumberExpression(numberLiteral);
        if (result == null) result = caseLiteralValueExpression(numberLiteral);
        if (result == null) result = caseMultiplicativeExpression(numberLiteral);
        if (result == null) result = caseValueSpecification(numberLiteral);
        if (result == null) result = caseAdditiveExpression(numberLiteral);
        if (result == null) result = caseArithmeticExpression(numberLiteral);
        if (result == null) result = caseComparableExpression(numberLiteral);
        if (result == null) result = caseRelationalExpression(numberLiteral);
        if (result == null) result = caseBooleanUnit(numberLiteral);
        if (result == null) result = caseComparison(numberLiteral);
        if (result == null) result = caseConjunction(numberLiteral);
        if (result == null) result = caseDisjunction(numberLiteral);
        if (result == null) result = caseImplication(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseComparableExpression(nullLiteral);
        if (result == null) result = caseLiteralValueExpression(nullLiteral);
        if (result == null) result = caseRelationalExpression(nullLiteral);
        if (result == null) result = caseValueSpecification(nullLiteral);
        if (result == null) result = caseBooleanUnit(nullLiteral);
        if (result == null) result = caseComparison(nullLiteral);
        if (result == null) result = caseConjunction(nullLiteral);
        if (result == null) result = caseDisjunction(nullLiteral);
        if (result == null) result = caseImplication(nullLiteral);
        if (result == null) result = caseExpression(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseComparableExpression(stringLiteral);
        if (result == null) result = caseLiteralValueExpression(stringLiteral);
        if (result == null) result = caseRelationalExpression(stringLiteral);
        if (result == null) result = caseValueSpecification(stringLiteral);
        if (result == null) result = caseBooleanUnit(stringLiteral);
        if (result == null) result = caseComparison(stringLiteral);
        if (result == null) result = caseConjunction(stringLiteral);
        if (result == null) result = caseDisjunction(stringLiteral);
        if (result == null) result = caseImplication(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.UNLIMITED_LITERAL:
      {
        UnlimitedLiteral unlimitedLiteral = (UnlimitedLiteral)theEObject;
        T result = caseUnlimitedLiteral(unlimitedLiteral);
        if (result == null) result = caseComparableExpression(unlimitedLiteral);
        if (result == null) result = caseLiteralValueExpression(unlimitedLiteral);
        if (result == null) result = caseRelationalExpression(unlimitedLiteral);
        if (result == null) result = caseValueSpecification(unlimitedLiteral);
        if (result == null) result = caseBooleanUnit(unlimitedLiteral);
        if (result == null) result = caseComparison(unlimitedLiteral);
        if (result == null) result = caseConjunction(unlimitedLiteral);
        if (result == null) result = caseDisjunction(unlimitedLiteral);
        if (result == null) result = caseImplication(unlimitedLiteral);
        if (result == null) result = caseExpression(unlimitedLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.IMPORT_UR_IOR_NAMESPACE:
      {
        ImportURIorNamespace importURIorNamespace = (ImportURIorNamespace)theEObject;
        T result = caseImportURIorNamespace(importURIorNamespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.IMPORT_URI:
      {
        ImportURI importURI = (ImportURI)theEObject;
        T result = caseImportURI(importURI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.IMPORT_NAMESPACE:
      {
        ImportNamespace importNamespace = (ImportNamespace)theEObject;
        T result = caseImportNamespace(importNamespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.OR_OPERATOR:
      {
        OrOperator orOperator = (OrOperator)theEObject;
        T result = caseOrOperator(orOperator);
        if (result == null) result = caseOperator(orOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.XOR_OPERATOR:
      {
        XOrOperator xOrOperator = (XOrOperator)theEObject;
        T result = caseXOrOperator(xOrOperator);
        if (result == null) result = caseOperator(xOrOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.AND_OPERATOR:
      {
        AndOperator andOperator = (AndOperator)theEObject;
        T result = caseAndOperator(andOperator);
        if (result == null) result = caseOperator(andOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.IMPLICATION_OPERATOR:
      {
        ImplicationOperator implicationOperator = (ImplicationOperator)theEObject;
        T result = caseImplicationOperator(implicationOperator);
        if (result == null) result = caseOperator(implicationOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.EQUALS_OPERATOR:
      {
        EqualsOperator equalsOperator = (EqualsOperator)theEObject;
        T result = caseEqualsOperator(equalsOperator);
        if (result == null) result = caseOperator(equalsOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NOT_EQUALS_OPERATOR:
      {
        NotEqualsOperator notEqualsOperator = (NotEqualsOperator)theEObject;
        T result = caseNotEqualsOperator(notEqualsOperator);
        if (result == null) result = caseOperator(notEqualsOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NOT_OPERATOR:
      {
        NotOperator notOperator = (NotOperator)theEObject;
        T result = caseNotOperator(notOperator);
        if (result == null) result = caseOperator(notOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.GREATER_THAN_OPERATOR:
      {
        GreaterThanOperator greaterThanOperator = (GreaterThanOperator)theEObject;
        T result = caseGreaterThanOperator(greaterThanOperator);
        if (result == null) result = caseOperator(greaterThanOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.GREATER_OR_EQUAL_THAN_OPERATOR:
      {
        GreaterOrEqualThanOperator greaterOrEqualThanOperator = (GreaterOrEqualThanOperator)theEObject;
        T result = caseGreaterOrEqualThanOperator(greaterOrEqualThanOperator);
        if (result == null) result = caseOperator(greaterOrEqualThanOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.LESS_THAN_OPERATOR:
      {
        LessThanOperator lessThanOperator = (LessThanOperator)theEObject;
        T result = caseLessThanOperator(lessThanOperator);
        if (result == null) result = caseOperator(lessThanOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.LESS_OR_EQUAL_THAN_OPERATOR:
      {
        LessOrEqualThanOperator lessOrEqualThanOperator = (LessOrEqualThanOperator)theEObject;
        T result = caseLessOrEqualThanOperator(lessOrEqualThanOperator);
        if (result == null) result = caseOperator(lessOrEqualThanOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.ADDITION_OPERATOR:
      {
        AdditionOperator additionOperator = (AdditionOperator)theEObject;
        T result = caseAdditionOperator(additionOperator);
        if (result == null) result = caseOperator(additionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.SUBSTRACTION_OPERATOR:
      {
        SubstractionOperator substractionOperator = (SubstractionOperator)theEObject;
        T result = caseSubstractionOperator(substractionOperator);
        if (result == null) result = caseOperator(substractionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MULTIPLICATION_OPERATOR:
      {
        MultiplicationOperator multiplicationOperator = (MultiplicationOperator)theEObject;
        T result = caseMultiplicationOperator(multiplicationOperator);
        if (result == null) result = caseOperator(multiplicationOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.DIVISION_OPERATOR:
      {
        DivisionOperator divisionOperator = (DivisionOperator)theEObject;
        T result = caseDivisionOperator(divisionOperator);
        if (result == null) result = caseOperator(divisionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MODULUS_OPERATOR:
      {
        ModulusOperator modulusOperator = (ModulusOperator)theEObject;
        T result = caseModulusOperator(modulusOperator);
        if (result == null) result = caseOperator(modulusOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MAX_OPERATOR:
      {
        MaxOperator maxOperator = (MaxOperator)theEObject;
        T result = caseMaxOperator(maxOperator);
        if (result == null) result = caseOperator(maxOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.MIN_OPERATOR:
      {
        MinOperator minOperator = (MinOperator)theEObject;
        T result = caseMinOperator(minOperator);
        if (result == null) result = caseOperator(minOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.AVG_OPERATOR:
      {
        AvgOperator avgOperator = (AvgOperator)theEObject;
        T result = caseAvgOperator(avgOperator);
        if (result == null) result = caseOperator(avgOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.SUM_OPERATOR:
      {
        SumOperator sumOperator = (SumOperator)theEObject;
        T result = caseSumOperator(sumOperator);
        if (result == null) result = caseOperator(sumOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.EXPONENTIAL_OPERATOR:
      {
        ExponentialOperator exponentialOperator = (ExponentialOperator)theEObject;
        T result = caseExponentialOperator(exponentialOperator);
        if (result == null) result = caseOperator(exponentialOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.ABSOLUTE_OPERATOR:
      {
        AbsoluteOperator absoluteOperator = (AbsoluteOperator)theEObject;
        T result = caseAbsoluteOperator(absoluteOperator);
        if (result == null) result = caseOperator(absoluteOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.NATURAL_LOGARITHM_OPERATOR:
      {
        NaturalLogarithmOperator naturalLogarithmOperator = (NaturalLogarithmOperator)theEObject;
        T result = caseNaturalLogarithmOperator(naturalLogarithmOperator);
        if (result == null) result = caseOperator(naturalLogarithmOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArtistCommonPackage.COMMON_LOGARITHM_OPERATOR:
      {
        CommonLogarithmOperator commonLogarithmOperator = (CommonLogarithmOperator)theEObject;
        T result = caseCommonLogarithmOperator(commonLogarithmOperator);
        if (result == null) result = caseOperator(commonLogarithmOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplication(Implication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunction(Disjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanUnit(BooleanUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegation(Negation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExpression(RelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparableExpression(ComparableExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticExpression(ArithmeticExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberExpression(NumberExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberFunction(NumberFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maximum Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maximum Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaximumFunction(MaximumFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minimum Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minimum Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinimumFunction(MinimumFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Average Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Average Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAverageFunction(AverageFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumFunction(SumFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exponential Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exponential Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExponentialFunction(ExponentialFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absolute Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absolute Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsoluteFunction(AbsoluteFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Natural Logarithm Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Natural Logarithm Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaturalLogarithmFunction(NaturalLogarithmFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Logarithm Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Logarithm Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonLogarithmFunction(CommonLogarithmFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedExpression(ParenthesizedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueSpecification(ValueSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Specification Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectSpecificationExpression(ObjectSpecificationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple(Tuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValuePair(PropertyValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Specification Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Specification Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceSpecificationExpression(InstanceSpecificationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Value Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Value Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralValueExpression(LiteralValueExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unlimited Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unlimited Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnlimitedLiteral(UnlimitedLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import UR Ior Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import UR Ior Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportURIorNamespace(ImportURIorNamespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportURI(ImportURI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportNamespace(ImportNamespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrOperator(OrOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XOr Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XOr Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXOrOperator(XOrOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndOperator(AndOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implication Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implication Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplicationOperator(ImplicationOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualsOperator(EqualsOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Equals Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Equals Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEqualsOperator(NotEqualsOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotOperator(NotOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterThanOperator(GreaterThanOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal Than Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Or Equal Than Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterOrEqualThanOperator(GreaterOrEqualThanOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less Than Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less Than Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLessThanOperator(LessThanOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less Or Equal Than Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less Or Equal Than Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLessOrEqualThanOperator(LessOrEqualThanOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionOperator(AdditionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substraction Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substraction Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstractionOperator(SubstractionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationOperator(MultiplicationOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivisionOperator(DivisionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modulus Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modulus Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModulusOperator(ModulusOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxOperator(MaxOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinOperator(MinOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Avg Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Avg Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvgOperator(AvgOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumOperator(SumOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exponential Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exponential Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExponentialOperator(ExponentialOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absolute Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absolute Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsoluteOperator(AbsoluteOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Natural Logarithm Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Natural Logarithm Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaturalLogarithmOperator(NaturalLogarithmOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Logarithm Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Logarithm Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonLogarithmOperator(CommonLogarithmOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArtistCommonSwitch

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage
 * @generated
 */
public class ArtistCommonAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArtistCommonPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtistCommonAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArtistCommonPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtistCommonSwitch<Adapter> modelSwitch =
    new ArtistCommonSwitch<Adapter>()
    {
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseImplication(Implication object)
      {
        return createImplicationAdapter();
      }
      @Override
      public Adapter caseDisjunction(Disjunction object)
      {
        return createDisjunctionAdapter();
      }
      @Override
      public Adapter caseConjunction(Conjunction object)
      {
        return createConjunctionAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseBooleanUnit(BooleanUnit object)
      {
        return createBooleanUnitAdapter();
      }
      @Override
      public Adapter caseNegation(Negation object)
      {
        return createNegationAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseComparableExpression(ComparableExpression object)
      {
        return createComparableExpressionAdapter();
      }
      @Override
      public Adapter caseArithmeticExpression(ArithmeticExpression object)
      {
        return createArithmeticExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseNumberExpression(NumberExpression object)
      {
        return createNumberExpressionAdapter();
      }
      @Override
      public Adapter caseNumberFunction(NumberFunction object)
      {
        return createNumberFunctionAdapter();
      }
      @Override
      public Adapter caseMaximumFunction(MaximumFunction object)
      {
        return createMaximumFunctionAdapter();
      }
      @Override
      public Adapter caseMinimumFunction(MinimumFunction object)
      {
        return createMinimumFunctionAdapter();
      }
      @Override
      public Adapter caseAverageFunction(AverageFunction object)
      {
        return createAverageFunctionAdapter();
      }
      @Override
      public Adapter caseSumFunction(SumFunction object)
      {
        return createSumFunctionAdapter();
      }
      @Override
      public Adapter caseExponentialFunction(ExponentialFunction object)
      {
        return createExponentialFunctionAdapter();
      }
      @Override
      public Adapter caseAbsoluteFunction(AbsoluteFunction object)
      {
        return createAbsoluteFunctionAdapter();
      }
      @Override
      public Adapter caseNaturalLogarithmFunction(NaturalLogarithmFunction object)
      {
        return createNaturalLogarithmFunctionAdapter();
      }
      @Override
      public Adapter caseCommonLogarithmFunction(CommonLogarithmFunction object)
      {
        return createCommonLogarithmFunctionAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpression(ParenthesizedExpression object)
      {
        return createParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseValueSpecification(ValueSpecification object)
      {
        return createValueSpecificationAdapter();
      }
      @Override
      public Adapter caseObjectSpecificationExpression(ObjectSpecificationExpression object)
      {
        return createObjectSpecificationExpressionAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseTuple(Tuple object)
      {
        return createTupleAdapter();
      }
      @Override
      public Adapter casePropertyValuePair(PropertyValuePair object)
      {
        return createPropertyValuePairAdapter();
      }
      @Override
      public Adapter caseInstanceSpecificationExpression(InstanceSpecificationExpression object)
      {
        return createInstanceSpecificationExpressionAdapter();
      }
      @Override
      public Adapter caseLiteralValueExpression(LiteralValueExpression object)
      {
        return createLiteralValueExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseUnlimitedLiteral(UnlimitedLiteral object)
      {
        return createUnlimitedLiteralAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseImportURIorNamespace(ImportURIorNamespace object)
      {
        return createImportURIorNamespaceAdapter();
      }
      @Override
      public Adapter caseImportURI(ImportURI object)
      {
        return createImportURIAdapter();
      }
      @Override
      public Adapter caseImportNamespace(ImportNamespace object)
      {
        return createImportNamespaceAdapter();
      }
      @Override
      public Adapter caseOrOperator(OrOperator object)
      {
        return createOrOperatorAdapter();
      }
      @Override
      public Adapter caseXOrOperator(XOrOperator object)
      {
        return createXOrOperatorAdapter();
      }
      @Override
      public Adapter caseAndOperator(AndOperator object)
      {
        return createAndOperatorAdapter();
      }
      @Override
      public Adapter caseImplicationOperator(ImplicationOperator object)
      {
        return createImplicationOperatorAdapter();
      }
      @Override
      public Adapter caseEqualsOperator(EqualsOperator object)
      {
        return createEqualsOperatorAdapter();
      }
      @Override
      public Adapter caseNotEqualsOperator(NotEqualsOperator object)
      {
        return createNotEqualsOperatorAdapter();
      }
      @Override
      public Adapter caseNotOperator(NotOperator object)
      {
        return createNotOperatorAdapter();
      }
      @Override
      public Adapter caseGreaterThanOperator(GreaterThanOperator object)
      {
        return createGreaterThanOperatorAdapter();
      }
      @Override
      public Adapter caseGreaterOrEqualThanOperator(GreaterOrEqualThanOperator object)
      {
        return createGreaterOrEqualThanOperatorAdapter();
      }
      @Override
      public Adapter caseLessThanOperator(LessThanOperator object)
      {
        return createLessThanOperatorAdapter();
      }
      @Override
      public Adapter caseLessOrEqualThanOperator(LessOrEqualThanOperator object)
      {
        return createLessOrEqualThanOperatorAdapter();
      }
      @Override
      public Adapter caseAdditionOperator(AdditionOperator object)
      {
        return createAdditionOperatorAdapter();
      }
      @Override
      public Adapter caseSubstractionOperator(SubstractionOperator object)
      {
        return createSubstractionOperatorAdapter();
      }
      @Override
      public Adapter caseMultiplicationOperator(MultiplicationOperator object)
      {
        return createMultiplicationOperatorAdapter();
      }
      @Override
      public Adapter caseDivisionOperator(DivisionOperator object)
      {
        return createDivisionOperatorAdapter();
      }
      @Override
      public Adapter caseModulusOperator(ModulusOperator object)
      {
        return createModulusOperatorAdapter();
      }
      @Override
      public Adapter caseMaxOperator(MaxOperator object)
      {
        return createMaxOperatorAdapter();
      }
      @Override
      public Adapter caseMinOperator(MinOperator object)
      {
        return createMinOperatorAdapter();
      }
      @Override
      public Adapter caseAvgOperator(AvgOperator object)
      {
        return createAvgOperatorAdapter();
      }
      @Override
      public Adapter caseSumOperator(SumOperator object)
      {
        return createSumOperatorAdapter();
      }
      @Override
      public Adapter caseExponentialOperator(ExponentialOperator object)
      {
        return createExponentialOperatorAdapter();
      }
      @Override
      public Adapter caseAbsoluteOperator(AbsoluteOperator object)
      {
        return createAbsoluteOperatorAdapter();
      }
      @Override
      public Adapter caseNaturalLogarithmOperator(NaturalLogarithmOperator object)
      {
        return createNaturalLogarithmOperatorAdapter();
      }
      @Override
      public Adapter caseCommonLogarithmOperator(CommonLogarithmOperator object)
      {
        return createCommonLogarithmOperatorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication <em>Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication
   * @generated
   */
  public Adapter createImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction
   * @generated
   */
  public Adapter createDisjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction
   * @generated
   */
  public Adapter createConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit <em>Boolean Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit
   * @generated
   */
  public Adapter createBooleanUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Negation
   * @generated
   */
  public Adapter createNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression <em>Comparable Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression
   * @generated
   */
  public Adapter createComparableExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression <em>Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression
   * @generated
   */
  public Adapter createArithmeticExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression
   * @generated
   */
  public Adapter createNumberExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction <em>Number Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberFunction
   * @generated
   */
  public Adapter createNumberFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction <em>Maximum Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaximumFunction
   * @generated
   */
  public Adapter createMaximumFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction <em>Minimum Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinimumFunction
   * @generated
   */
  public Adapter createMinimumFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction <em>Average Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AverageFunction
   * @generated
   */
  public Adapter createAverageFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction <em>Sum Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumFunction
   * @generated
   */
  public Adapter createSumFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction <em>Exponential Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialFunction
   * @generated
   */
  public Adapter createExponentialFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction <em>Absolute Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteFunction
   * @generated
   */
  public Adapter createAbsoluteFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction <em>Natural Logarithm Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmFunction
   * @generated
   */
  public Adapter createNaturalLogarithmFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction <em>Common Logarithm Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmFunction
   * @generated
   */
  public Adapter createCommonLogarithmFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ParenthesizedExpression
   * @generated
   */
  public Adapter createParenthesizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification <em>Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification
   * @generated
   */
  public Adapter createValueSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression <em>Object Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ObjectSpecificationExpression
   * @generated
   */
  public Adapter createObjectSpecificationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Tuple
   * @generated
   */
  public Adapter createTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair <em>Property Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.PropertyValuePair
   * @generated
   */
  public Adapter createPropertyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression <em>Instance Specification Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.InstanceSpecificationExpression
   * @generated
   */
  public Adapter createInstanceSpecificationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression <em>Literal Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LiteralValueExpression
   * @generated
   */
  public Adapter createLiteralValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral <em>Unlimited Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.UnlimitedLiteral
   * @generated
   */
  public Adapter createUnlimitedLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace <em>Import UR Ior Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURIorNamespace
   * @generated
   */
  public Adapter createImportURIorNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportURI
   * @generated
   */
  public Adapter createImportURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace <em>Import Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImportNamespace
   * @generated
   */
  public Adapter createImportNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator <em>Or Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.OrOperator
   * @generated
   */
  public Adapter createOrOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator <em>XOr Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.XOrOperator
   * @generated
   */
  public Adapter createXOrOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator <em>And Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AndOperator
   * @generated
   */
  public Adapter createAndOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator <em>Implication Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ImplicationOperator
   * @generated
   */
  public Adapter createImplicationOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator <em>Equals Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.EqualsOperator
   * @generated
   */
  public Adapter createEqualsOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator <em>Not Equals Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotEqualsOperator
   * @generated
   */
  public Adapter createNotEqualsOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator <em>Not Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NotOperator
   * @generated
   */
  public Adapter createNotOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator <em>Greater Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterThanOperator
   * @generated
   */
  public Adapter createGreaterThanOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator <em>Greater Or Equal Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.GreaterOrEqualThanOperator
   * @generated
   */
  public Adapter createGreaterOrEqualThanOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator <em>Less Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessThanOperator
   * @generated
   */
  public Adapter createLessThanOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator <em>Less Or Equal Than Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.LessOrEqualThanOperator
   * @generated
   */
  public Adapter createLessOrEqualThanOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator <em>Addition Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditionOperator
   * @generated
   */
  public Adapter createAdditionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator <em>Substraction Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SubstractionOperator
   * @generated
   */
  public Adapter createSubstractionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicationOperator
   * @generated
   */
  public Adapter createMultiplicationOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator <em>Division Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.DivisionOperator
   * @generated
   */
  public Adapter createDivisionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator <em>Modulus Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ModulusOperator
   * @generated
   */
  public Adapter createModulusOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator <em>Max Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator
   * @generated
   */
  public Adapter createMaxOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator <em>Min Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator
   * @generated
   */
  public Adapter createMinOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator <em>Avg Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator
   * @generated
   */
  public Adapter createAvgOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator <em>Sum Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator
   * @generated
   */
  public Adapter createSumOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator <em>Exponential Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ExponentialOperator
   * @generated
   */
  public Adapter createExponentialOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator <em>Absolute Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.AbsoluteOperator
   * @generated
   */
  public Adapter createAbsoluteOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator <em>Natural Logarithm Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.NaturalLogarithmOperator
   * @generated
   */
  public Adapter createNaturalLogarithmOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator <em>Common Logarithm Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.CommonLogarithmOperator
   * @generated
   */
  public Adapter createCommonLogarithmOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArtistCommonAdapterFactory

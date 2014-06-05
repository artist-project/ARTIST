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
package eu.artist.postmigration.nfrvt.lang.nsl.nsl.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AdditiveExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ComparableExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Comparison;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Conjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Disjunction;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Implication;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MultiplicativeExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.RelationalExpression;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage
 * @generated
 */
public class NslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NslPackage.eINSTANCE;
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
  protected NslSwitch<Adapter> modelSwitch =
    new NslSwitch<Adapter>()
    {
      @Override
      public Adapter casePropertyCatalogue(PropertyCatalogue object)
      {
        return createPropertyCatalogueAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseQualitativeProperty(QualitativeProperty object)
      {
        return createQualitativePropertyAdapter();
      }
      @Override
      public Adapter caseQuantitativeProperty(QuantitativeProperty object)
      {
        return createQuantitativePropertyAdapter();
      }
      @Override
      public Adapter caseBaseQuantitativeProperty(BaseQuantitativeProperty object)
      {
        return createBaseQuantitativePropertyAdapter();
      }
      @Override
      public Adapter caseDerivedQuantitativeProperty(DerivedQuantitativeProperty object)
      {
        return createDerivedQuantitativePropertyAdapter();
      }
      @Override
      public Adapter casePropertyImpact(PropertyImpact object)
      {
        return createPropertyImpactAdapter();
      }
      @Override
      public Adapter caseParenthesizedArithmeticExpression(ParenthesizedArithmeticExpression object)
      {
        return createParenthesizedArithmeticExpressionAdapter();
      }
      @Override
      public Adapter caseQuantitativePropertyExpression(QuantitativePropertyExpression object)
      {
        return createQuantitativePropertyExpressionAdapter();
      }
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
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue <em>Property Catalogue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue
   * @generated
   */
  public Adapter createPropertyCatalogueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty <em>Qualitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty
   * @generated
   */
  public Adapter createQualitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty <em>Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty
   * @generated
   */
  public Adapter createQuantitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty <em>Base Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty
   * @generated
   */
  public Adapter createBaseQuantitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty <em>Derived Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty
   * @generated
   */
  public Adapter createDerivedQuantitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact <em>Property Impact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact
   * @generated
   */
  public Adapter createPropertyImpactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression <em>Parenthesized Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression
   * @generated
   */
  public Adapter createParenthesizedArithmeticExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression <em>Quantitative Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression
   * @generated
   */
  public Adapter createQuantitativePropertyExpressionAdapter()
  {
    return null;
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

} //NslAdapterFactory

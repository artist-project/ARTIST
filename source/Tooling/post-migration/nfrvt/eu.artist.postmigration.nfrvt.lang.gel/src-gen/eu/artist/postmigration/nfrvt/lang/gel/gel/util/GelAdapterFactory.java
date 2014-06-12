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
package eu.artist.postmigration.nfrvt.lang.gel.gel.util;

import eu.artist.postmigration.nfrvt.lang.gel.gel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage
 * @generated
 */
public class GelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GelPackage.eINSTANCE;
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
  protected GelSwitch<Adapter> modelSwitch =
    new GelSwitch<Adapter>()
    {
      @Override
      public Adapter caseMigrationEvaluation(MigrationEvaluation object)
      {
        return createMigrationEvaluationAdapter();
      }
      @Override
      public Adapter caseTransformation(Transformation object)
      {
        return createTransformationAdapter();
      }
      @Override
      public Adapter caseAppliedPropertyEvaluation(AppliedPropertyEvaluation object)
      {
        return createAppliedPropertyEvaluationAdapter();
      }
      @Override
      public Adapter caseAppliedQualitativePropertyEvaluation(AppliedQualitativePropertyEvaluation object)
      {
        return createAppliedQualitativePropertyEvaluationAdapter();
      }
      @Override
      public Adapter caseAppliedQuantitativePropertyEvaluation(AppliedQuantitativePropertyEvaluation object)
      {
        return createAppliedQuantitativePropertyEvaluationAdapter();
      }
      @Override
      public Adapter caseQuantitativePropertyRealization(QuantitativePropertyRealization object)
      {
        return createQuantitativePropertyRealizationAdapter();
      }
      @Override
      public Adapter caseGoalModelEvaluation(GoalModelEvaluation object)
      {
        return createGoalModelEvaluationAdapter();
      }
      @Override
      public Adapter caseGoalEvaluation(GoalEvaluation object)
      {
        return createGoalEvaluationAdapter();
      }
      @Override
      public Adapter caseSoftGoalEvaluation(SoftGoalEvaluation object)
      {
        return createSoftGoalEvaluationAdapter();
      }
      @Override
      public Adapter caseHardGoalEvaluation(HardGoalEvaluation object)
      {
        return createHardGoalEvaluationAdapter();
      }
      @Override
      public Adapter caseCompositeGoalEvaluation(CompositeGoalEvaluation object)
      {
        return createCompositeGoalEvaluationAdapter();
      }
      @Override
      public Adapter caseValueExpressionEvaluation(ValueExpressionEvaluation object)
      {
        return createValueExpressionEvaluationAdapter();
      }
      @Override
      public Adapter caseValueSpecificationExpressionEvaluation(ValueSpecificationExpressionEvaluation object)
      {
        return createValueSpecificationExpressionEvaluationAdapter();
      }
      @Override
      public Adapter caseBooleanExpressionEvaluation(BooleanExpressionEvaluation object)
      {
        return createBooleanExpressionEvaluationAdapter();
      }
      @Override
      public Adapter caseNumberExpressionEvaluation(NumberExpressionEvaluation object)
      {
        return createNumberExpressionEvaluationAdapter();
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
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation <em>Migration Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation
   * @generated
   */
  public Adapter createMigrationEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation
   * @generated
   */
  public Adapter createTransformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation <em>Applied Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation
   * @generated
   */
  public Adapter createAppliedPropertyEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation <em>Applied Qualitative Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation
   * @generated
   */
  public Adapter createAppliedQualitativePropertyEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation <em>Applied Quantitative Property Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation
   * @generated
   */
  public Adapter createAppliedQuantitativePropertyEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization <em>Quantitative Property Realization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization
   * @generated
   */
  public Adapter createQuantitativePropertyRealizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation <em>Goal Model Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation
   * @generated
   */
  public Adapter createGoalModelEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation <em>Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation
   * @generated
   */
  public Adapter createGoalEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation <em>Soft Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation
   * @generated
   */
  public Adapter createSoftGoalEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation <em>Hard Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation
   * @generated
   */
  public Adapter createHardGoalEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation <em>Composite Goal Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation
   * @generated
   */
  public Adapter createCompositeGoalEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation <em>Value Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation
   * @generated
   */
  public Adapter createValueExpressionEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation <em>Value Specification Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation
   * @generated
   */
  public Adapter createValueSpecificationExpressionEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation <em>Boolean Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation
   * @generated
   */
  public Adapter createBooleanExpressionEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation <em>Number Expression Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation
   * @generated
   */
  public Adapter createNumberExpressionEvaluationAdapter()
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

} //GelAdapterFactory

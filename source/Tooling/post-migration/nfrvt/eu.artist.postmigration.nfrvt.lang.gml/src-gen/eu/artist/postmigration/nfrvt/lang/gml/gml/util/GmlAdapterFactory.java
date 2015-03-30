/**
 */
package eu.artist.postmigration.nfrvt.lang.gml.gml.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;
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

import eu.artist.postmigration.nfrvt.lang.gml.gml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage
 * @generated
 */
public class GmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GmlPackage.eINSTANCE;
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
  protected GmlSwitch<Adapter> modelSwitch =
    new GmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseGoalModel(GoalModel object)
      {
        return createGoalModelAdapter();
      }
      @Override
      public Adapter caseAppliedProperty(AppliedProperty object)
      {
        return createAppliedPropertyAdapter();
      }
      @Override
      public Adapter caseAppliedQualitativeProperty(AppliedQualitativeProperty object)
      {
        return createAppliedQualitativePropertyAdapter();
      }
      @Override
      public Adapter caseAppliedQuantitativeProperty(AppliedQuantitativeProperty object)
      {
        return createAppliedQuantitativePropertyAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseSoftGoal(SoftGoal object)
      {
        return createSoftGoalAdapter();
      }
      @Override
      public Adapter caseSoftGoalImpact(SoftGoalImpact object)
      {
        return createSoftGoalImpactAdapter();
      }
      @Override
      public Adapter caseHardGoal(HardGoal object)
      {
        return createHardGoalAdapter();
      }
      @Override
      public Adapter caseCompositeGoal(CompositeGoal object)
      {
        return createCompositeGoalAdapter();
      }
      @Override
      public Adapter caseGoalExpression(GoalExpression object)
      {
        return createGoalExpressionAdapter();
      }
      @Override
      public Adapter caseGoalImplication(GoalImplication object)
      {
        return createGoalImplicationAdapter();
      }
      @Override
      public Adapter caseGoalDisjunction(GoalDisjunction object)
      {
        return createGoalDisjunctionAdapter();
      }
      @Override
      public Adapter caseGoalConjunction(GoalConjunction object)
      {
        return createGoalConjunctionAdapter();
      }
      @Override
      public Adapter caseGoalComparison(GoalComparison object)
      {
        return createGoalComparisonAdapter();
      }
      @Override
      public Adapter caseGoalBooleanUnit(GoalBooleanUnit object)
      {
        return createGoalBooleanUnitAdapter();
      }
      @Override
      public Adapter caseGoalNegation(GoalNegation object)
      {
        return createGoalNegationAdapter();
      }
      @Override
      public Adapter caseGoalBooleanLiteral(GoalBooleanLiteral object)
      {
        return createGoalBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseGoalReference(GoalReference object)
      {
        return createGoalReferenceAdapter();
      }
      @Override
      public Adapter caseParenthesizedGoalExpression(ParenthesizedGoalExpression object)
      {
        return createParenthesizedGoalExpressionAdapter();
      }
      @Override
      public Adapter caseAppliedQuantitativePropertyExpression(AppliedQuantitativePropertyExpression object)
      {
        return createAppliedQuantitativePropertyExpressionAdapter();
      }
      @Override
      public Adapter caseARTISTModel(ARTISTModel object)
      {
        return createARTISTModelAdapter();
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
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel <em>Goal Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel
   * @generated
   */
  public Adapter createGoalModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty <em>Applied Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty
   * @generated
   */
  public Adapter createAppliedPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty <em>Applied Qualitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty
   * @generated
   */
  public Adapter createAppliedQualitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty <em>Applied Quantitative Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty
   * @generated
   */
  public Adapter createAppliedQuantitativePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal <em>Soft Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal
   * @generated
   */
  public Adapter createSoftGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact <em>Soft Goal Impact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoalImpact
   * @generated
   */
  public Adapter createSoftGoalImpactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal <em>Hard Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal
   * @generated
   */
  public Adapter createHardGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal <em>Composite Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal
   * @generated
   */
  public Adapter createCompositeGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression <em>Goal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression
   * @generated
   */
  public Adapter createGoalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication <em>Goal Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalImplication
   * @generated
   */
  public Adapter createGoalImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction <em>Goal Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalDisjunction
   * @generated
   */
  public Adapter createGoalDisjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction <em>Goal Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalConjunction
   * @generated
   */
  public Adapter createGoalConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison <em>Goal Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalComparison
   * @generated
   */
  public Adapter createGoalComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit <em>Goal Boolean Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanUnit
   * @generated
   */
  public Adapter createGoalBooleanUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation <em>Goal Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalNegation
   * @generated
   */
  public Adapter createGoalNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral <em>Goal Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalBooleanLiteral
   * @generated
   */
  public Adapter createGoalBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference <em>Goal Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference
   * @generated
   */
  public Adapter createGoalReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression <em>Parenthesized Goal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.ParenthesizedGoalExpression
   * @generated
   */
  public Adapter createParenthesizedGoalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression <em>Applied Quantitative Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression
   * @generated
   */
  public Adapter createAppliedQuantitativePropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel <em>ARTIST Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel
   * @generated
   */
  public Adapter createARTISTModelAdapter()
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

} //GmlAdapterFactory

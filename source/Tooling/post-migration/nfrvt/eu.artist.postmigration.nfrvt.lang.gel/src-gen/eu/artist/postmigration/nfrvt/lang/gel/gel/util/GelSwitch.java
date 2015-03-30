/**
 */
package eu.artist.postmigration.nfrvt.lang.gel.gel.util;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ARTISTModel;

import eu.artist.postmigration.nfrvt.lang.gel.gel.*;

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
 * @see eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage
 * @generated
 */
public class GelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GelPackage.eINSTANCE;
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
      case GelPackage.MIGRATION_EVALUATION:
      {
        MigrationEvaluation migrationEvaluation = (MigrationEvaluation)theEObject;
        T result = caseMigrationEvaluation(migrationEvaluation);
        if (result == null) result = caseARTISTModel(migrationEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.TRANSFORMATION:
      {
        Transformation transformation = (Transformation)theEObject;
        T result = caseTransformation(transformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.APPLIED_PROPERTY_EVALUATION:
      {
        AppliedPropertyEvaluation appliedPropertyEvaluation = (AppliedPropertyEvaluation)theEObject;
        T result = caseAppliedPropertyEvaluation(appliedPropertyEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.APPLIED_QUALITATIVE_PROPERTY_EVALUATION:
      {
        AppliedQualitativePropertyEvaluation appliedQualitativePropertyEvaluation = (AppliedQualitativePropertyEvaluation)theEObject;
        T result = caseAppliedQualitativePropertyEvaluation(appliedQualitativePropertyEvaluation);
        if (result == null) result = caseAppliedPropertyEvaluation(appliedQualitativePropertyEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION:
      {
        AppliedQuantitativePropertyEvaluation appliedQuantitativePropertyEvaluation = (AppliedQuantitativePropertyEvaluation)theEObject;
        T result = caseAppliedQuantitativePropertyEvaluation(appliedQuantitativePropertyEvaluation);
        if (result == null) result = caseAppliedPropertyEvaluation(appliedQuantitativePropertyEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.GOAL_MODEL_EVALUATION:
      {
        GoalModelEvaluation goalModelEvaluation = (GoalModelEvaluation)theEObject;
        T result = caseGoalModelEvaluation(goalModelEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.GOAL_EVALUATION:
      {
        GoalEvaluation goalEvaluation = (GoalEvaluation)theEObject;
        T result = caseGoalEvaluation(goalEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.SOFT_GOAL_EVALUATION:
      {
        SoftGoalEvaluation softGoalEvaluation = (SoftGoalEvaluation)theEObject;
        T result = caseSoftGoalEvaluation(softGoalEvaluation);
        if (result == null) result = caseGoalEvaluation(softGoalEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.HARD_GOAL_EVALUATION:
      {
        HardGoalEvaluation hardGoalEvaluation = (HardGoalEvaluation)theEObject;
        T result = caseHardGoalEvaluation(hardGoalEvaluation);
        if (result == null) result = caseGoalEvaluation(hardGoalEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.COMPOSITE_GOAL_EVALUATION:
      {
        CompositeGoalEvaluation compositeGoalEvaluation = (CompositeGoalEvaluation)theEObject;
        T result = caseCompositeGoalEvaluation(compositeGoalEvaluation);
        if (result == null) result = caseGoalEvaluation(compositeGoalEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.VALUE_EXPRESSION_EVALUATION:
      {
        ValueExpressionEvaluation valueExpressionEvaluation = (ValueExpressionEvaluation)theEObject;
        T result = caseValueExpressionEvaluation(valueExpressionEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.VALUE_SPECIFICATION_EXPRESSION_EVALUATION:
      {
        ValueSpecificationExpressionEvaluation valueSpecificationExpressionEvaluation = (ValueSpecificationExpressionEvaluation)theEObject;
        T result = caseValueSpecificationExpressionEvaluation(valueSpecificationExpressionEvaluation);
        if (result == null) result = caseValueExpressionEvaluation(valueSpecificationExpressionEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION:
      {
        BooleanExpressionEvaluation booleanExpressionEvaluation = (BooleanExpressionEvaluation)theEObject;
        T result = caseBooleanExpressionEvaluation(booleanExpressionEvaluation);
        if (result == null) result = caseValueExpressionEvaluation(booleanExpressionEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GelPackage.NUMBER_EXPRESSION_EVALUATION:
      {
        NumberExpressionEvaluation numberExpressionEvaluation = (NumberExpressionEvaluation)theEObject;
        T result = caseNumberExpressionEvaluation(numberExpressionEvaluation);
        if (result == null) result = caseValueExpressionEvaluation(numberExpressionEvaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migration Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migration Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrationEvaluation(MigrationEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransformation(Transformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Property Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Property Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedPropertyEvaluation(AppliedPropertyEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Qualitative Property Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Qualitative Property Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedQualitativePropertyEvaluation(AppliedQualitativePropertyEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applied Quantitative Property Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applied Quantitative Property Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliedQuantitativePropertyEvaluation(AppliedQuantitativePropertyEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Model Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Model Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalModelEvaluation(GoalModelEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoalEvaluation(GoalEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soft Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soft Goal Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftGoalEvaluation(SoftGoalEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hard Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hard Goal Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardGoalEvaluation(HardGoalEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Goal Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Goal Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeGoalEvaluation(CompositeGoalEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expression Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpressionEvaluation(ValueExpressionEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Specification Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Specification Expression Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueSpecificationExpressionEvaluation(ValueSpecificationExpressionEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpressionEvaluation(BooleanExpressionEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Expression Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Expression Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberExpressionEvaluation(NumberExpressionEvaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARTIST Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARTIST Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARTISTModel(ARTISTModel object)
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

} //GelSwitch

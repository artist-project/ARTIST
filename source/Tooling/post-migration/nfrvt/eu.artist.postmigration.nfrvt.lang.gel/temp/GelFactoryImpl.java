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
package eu.artist.postmigration.nfrvt.lang.gel.gel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationLevelKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.RealizationTypeKind;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GelFactoryImpl extends EFactoryImpl implements GelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GelFactory init()
  {
    try
    {
      GelFactory theGelFactory = (GelFactory)EPackage.Registry.INSTANCE.getEFactory(GelPackage.eNS_URI);
      if (theGelFactory != null)
      {
        return theGelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GelPackage.MIGRATION_EVALUATION: return createMigrationEvaluation();
      case GelPackage.TRANSFORMATION: return createTransformation();
      case GelPackage.APPLIED_QUALITATIVE_PROPERTY_EVALUATION: return createAppliedQualitativePropertyEvaluation();
      case GelPackage.APPLIED_QUANTITATIVE_PROPERTY_EVALUATION: return createAppliedQuantitativePropertyEvaluation();
      case GelPackage.QUANTITATIVE_PROPERTY_REALIZATION: return createQuantitativePropertyRealization();
      case GelPackage.GOAL_MODEL_EVALUATION: return createGoalModelEvaluation();
      case GelPackage.GOAL_EVALUATION: return createGoalEvaluation();
      case GelPackage.SOFT_GOAL_EVALUATION: return createSoftGoalEvaluation();
      case GelPackage.HARD_GOAL_EVALUATION: return createHardGoalEvaluation();
      case GelPackage.COMPOSITE_GOAL_EVALUATION: return createCompositeGoalEvaluation();
      case GelPackage.VALUE_SPECIFICATION_EXPRESSION_EVALUATION: return createValueSpecificationExpressionEvaluation();
      case GelPackage.BOOLEAN_EXPRESSION_EVALUATION: return createBooleanExpressionEvaluation();
      case GelPackage.NUMBER_EXPRESSION_EVALUATION: return createNumberExpressionEvaluation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GelPackage.REALIZATION_LEVEL_KIND:
        return createRealizationLevelKindFromString(eDataType, initialValue);
      case GelPackage.REALIZATION_TYPE_KIND:
        return createRealizationTypeKindFromString(eDataType, initialValue);
      case GelPackage.VERDICT:
        return createVerdictFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GelPackage.REALIZATION_LEVEL_KIND:
        return convertRealizationLevelKindToString(eDataType, instanceValue);
      case GelPackage.REALIZATION_TYPE_KIND:
        return convertRealizationTypeKindToString(eDataType, instanceValue);
      case GelPackage.VERDICT:
        return convertVerdictToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationEvaluation createMigrationEvaluation()
  {
    MigrationEvaluationImpl migrationEvaluation = new MigrationEvaluationImpl();
    return migrationEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQualitativePropertyEvaluation createAppliedQualitativePropertyEvaluation()
  {
    AppliedQualitativePropertyEvaluationImpl appliedQualitativePropertyEvaluation = new AppliedQualitativePropertyEvaluationImpl();
    return appliedQualitativePropertyEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedQuantitativePropertyEvaluation createAppliedQuantitativePropertyEvaluation()
  {
    AppliedQuantitativePropertyEvaluationImpl appliedQuantitativePropertyEvaluation = new AppliedQuantitativePropertyEvaluationImpl();
    return appliedQuantitativePropertyEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantitativePropertyRealization createQuantitativePropertyRealization()
  {
    QuantitativePropertyRealizationImpl quantitativePropertyRealization = new QuantitativePropertyRealizationImpl();
    return quantitativePropertyRealization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalModelEvaluation createGoalModelEvaluation()
  {
    GoalModelEvaluationImpl goalModelEvaluation = new GoalModelEvaluationImpl();
    return goalModelEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalEvaluation createGoalEvaluation()
  {
    GoalEvaluationImpl goalEvaluation = new GoalEvaluationImpl();
    return goalEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SoftGoalEvaluation createSoftGoalEvaluation()
  {
    SoftGoalEvaluationImpl softGoalEvaluation = new SoftGoalEvaluationImpl();
    return softGoalEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardGoalEvaluation createHardGoalEvaluation()
  {
    HardGoalEvaluationImpl hardGoalEvaluation = new HardGoalEvaluationImpl();
    return hardGoalEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeGoalEvaluation createCompositeGoalEvaluation()
  {
    CompositeGoalEvaluationImpl compositeGoalEvaluation = new CompositeGoalEvaluationImpl();
    return compositeGoalEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation()
  {
    ValueSpecificationExpressionEvaluationImpl valueSpecificationExpressionEvaluation = new ValueSpecificationExpressionEvaluationImpl();
    return valueSpecificationExpressionEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpressionEvaluation createBooleanExpressionEvaluation()
  {
    BooleanExpressionEvaluationImpl booleanExpressionEvaluation = new BooleanExpressionEvaluationImpl();
    return booleanExpressionEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpressionEvaluation createNumberExpressionEvaluation()
  {
    NumberExpressionEvaluationImpl numberExpressionEvaluation = new NumberExpressionEvaluationImpl();
    return numberExpressionEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealizationLevelKind createRealizationLevelKindFromString(EDataType eDataType, String initialValue)
  {
    RealizationLevelKind result = RealizationLevelKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRealizationLevelKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealizationTypeKind createRealizationTypeKindFromString(EDataType eDataType, String initialValue)
  {
    RealizationTypeKind result = RealizationTypeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRealizationTypeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verdict createVerdictFromString(EDataType eDataType, String initialValue)
  {
    Verdict result = Verdict.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVerdictToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GelPackage getGelPackage()
  {
    return (GelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GelPackage getPackage()
  {
    return GelPackage.eINSTANCE;
  }

} //GelFactoryImpl

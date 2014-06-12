/**
 */
package eu.artist.postmigration.nfrvt.lang.esl.esl.impl;

import eu.artist.postmigration.nfrvt.lang.esl.esl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EslFactoryImpl extends EFactoryImpl implements EslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EslFactory init()
  {
    try
    {
      EslFactory theEslFactory = (EslFactory)EPackage.Registry.INSTANCE.getEFactory(EslPackage.eNS_URI);
      if (theEslFactory != null)
      {
        return theEslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EslFactoryImpl()
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
      case EslPackage.EVALUATION_STRATEGY_CATALOGUE: return createEvaluationStrategyCatalogue();
      case EslPackage.EVALUATION_STRATEGY: return createEvaluationStrategy();
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
      case EslPackage.EVALUATION_STRATEGY_LEVEL_KIND:
        return createEvaluationStrategyLevelKindFromString(eDataType, initialValue);
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
      case EslPackage.EVALUATION_STRATEGY_LEVEL_KIND:
        return convertEvaluationStrategyLevelKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategyCatalogue createEvaluationStrategyCatalogue()
  {
    EvaluationStrategyCatalogueImpl evaluationStrategyCatalogue = new EvaluationStrategyCatalogueImpl();
    return evaluationStrategyCatalogue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy createEvaluationStrategy()
  {
    EvaluationStrategyImpl evaluationStrategy = new EvaluationStrategyImpl();
    return evaluationStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategyLevelKind createEvaluationStrategyLevelKindFromString(EDataType eDataType, String initialValue)
  {
    EvaluationStrategyLevelKind result = EvaluationStrategyLevelKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEvaluationStrategyLevelKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EslPackage getEslPackage()
  {
    return (EslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EslPackage getPackage()
  {
    return EslPackage.eINSTANCE;
  }

} //EslFactoryImpl

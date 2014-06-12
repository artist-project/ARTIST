/**
 */
package eu.artist.postmigration.nfrvt.lang.esl.esl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage
 * @generated
 */
public interface EslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EslFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.esl.esl.impl.EslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Evaluation Strategy Catalogue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Strategy Catalogue</em>'.
   * @generated
   */
  EvaluationStrategyCatalogue createEvaluationStrategyCatalogue();

  /**
   * Returns a new object of class '<em>Evaluation Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Strategy</em>'.
   * @generated
   */
  EvaluationStrategy createEvaluationStrategy();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EslPackage getEslPackage();

} //EslFactory

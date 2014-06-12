/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage
 * @generated
 */
public interface TslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TslFactory eINSTANCE = eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl.TslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Pattern Catalogue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Catalogue</em>'.
   * @generated
   */
  PatternCatalogue createPatternCatalogue();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Pattern Impact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Impact</em>'.
   * @generated
   */
  PatternImpact createPatternImpact();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TslPackage getTslPackage();

} //TslFactory

/**
 */
package eu.artist.migration.mut.slicing.sim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.mut.slicing.sim.SimPackage
 * @generated
 */
public interface SimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimFactory eINSTANCE = eu.artist.migration.mut.slicing.sim.impl.SimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Slicing Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slicing Intent</em>'.
	 * @generated
	 */
	SlicingIntent createSlicingIntent();

	/**
	 * Returns a new object of class '<em>Slicing Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slicing Criterion</em>'.
	 * @generated
	 */
	SlicingCriterion createSlicingCriterion();

	/**
	 * Returns a new object of class '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value</em>'.
	 * @generated
	 */
	FeatureValue createFeatureValue();

	/**
	 * Returns a new object of class '<em>Slicing Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slicing Configuration</em>'.
	 * @generated
	 */
	SlicingConfiguration createSlicingConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimPackage getSimPackage();

} //SimFactory

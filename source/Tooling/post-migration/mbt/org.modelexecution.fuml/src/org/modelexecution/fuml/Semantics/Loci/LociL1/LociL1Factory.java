/**
 */
package org.modelexecution.fuml.Semantics.Loci.LociL1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package
 * @generated
 */
public interface LociL1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LociL1Factory eINSTANCE = org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LociL1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Locus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Locus</em>'.
	 * @generated
	 */
	Locus createLocus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LociL1Package getLociL1Package();

} //LociL1Factory

/**
 */
package org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage
 * @generated
 */
public interface BasicBehaviorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorsFactory eINSTANCE = org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Value</em>'.
	 * @generated
	 */
	ParameterValue createParameterValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicBehaviorsPackage getBasicBehaviorsPackage();

} //BasicBehaviorsFactory

/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage
 * @generated
 */
public interface BasicBehaviorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicBehaviorsFactory eINSTANCE = org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Behavior</em>'.
	 * @generated
	 */
	OpaqueBehavior createOpaqueBehavior();

	/**
	 * Returns a new object of class '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Behavior</em>'.
	 * @generated
	 */
	FunctionBehavior createFunctionBehavior();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicBehaviorsPackage getBasicBehaviorsPackage();

} //BasicBehaviorsFactory

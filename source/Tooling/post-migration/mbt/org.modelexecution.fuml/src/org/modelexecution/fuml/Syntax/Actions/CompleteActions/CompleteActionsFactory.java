/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage
 * @generated
 */
public interface CompleteActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompleteActionsFactory eINSTANCE = org.modelexecution.fuml.Syntax.Actions.CompleteActions.impl.CompleteActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * @generated
	 */
	StartClassifierBehaviorAction createStartClassifierBehaviorAction();

	/**
	 * Returns a new object of class '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Object Behavior Action</em>'.
	 * @generated
	 */
	StartObjectBehaviorAction createStartObjectBehaviorAction();

	/**
	 * Returns a new object of class '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Action</em>'.
	 * @generated
	 */
	ReduceAction createReduceAction();

	/**
	 * Returns a new object of class '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Extent Action</em>'.
	 * @generated
	 */
	ReadExtentAction createReadExtentAction();

	/**
	 * Returns a new object of class '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Is Classified Object Action</em>'.
	 * @generated
	 */
	ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction();

	/**
	 * Returns a new object of class '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reclassify Object Action</em>'.
	 * @generated
	 */
	ReclassifyObjectAction createReclassifyObjectAction();

	/**
	 * Returns a new object of class '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Event Action</em>'.
	 * @generated
	 */
	AcceptEventAction createAcceptEventAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompleteActionsPackage getCompleteActionsPackage();

} //CompleteActionsFactory

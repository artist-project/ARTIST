/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.Communications;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.CommunicationsPackage
 * @generated
 */
public interface CommunicationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationsFactory eINSTANCE = org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.impl.CommunicationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Event</em>'.
	 * @generated
	 */
	SignalEvent createSignalEvent();

	/**
	 * Returns a new object of class '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reception</em>'.
	 * @generated
	 */
	Reception createReception();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationsPackage getCommunicationsPackage();

} //CommunicationsFactory

/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.model.Module;

/**
 * <!-- begin-user-doc -->
 * Interface for the state space factory.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage
 * @generated
 */
public interface StateSpaceFactory extends EFactory {
	
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateSpaceFactory eINSTANCE = org.eclipse.emf.henshin.statespace.impl.StateSpaceFactoryImpl.init();
	
	/**
	 * Returns a new object of class '<em>State Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Space</em>'.
	 * @generated
	 */
	StateSpace createStateSpace();

	/**
	 * Returns a new object of class '<em>State Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Space</em>'.
	 * @generated NOT
	 */
	StateSpace createStateSpace(Module module);

	/**
	 * Returns a new state space manager.
	 * @param numThreads Number of threads to be used for exploration.
	 * @param stateSpace The state space to be managed.
	 * @return A new state space manager instance.
	 * @generated NOT
	 */
	StateSpaceManager createStateSpaceManager(StateSpace stateSpace, int numThreads);

	/**
	 * Returns a new state space manager. Uses multi-threading if more than one processor is available.
	 * @param stateSpace The state space to be managed.
	 * @return A new state space manager instance.
	 * @generated NOT
	 */
	StateSpaceManager createStateSpaceManager(StateSpace stateSpace);

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated NOT
	 */
	Model createModel(final Resource resource);

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Equality Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Helper</em>'.
	 * @generated
	 */
	EqualityHelper createEqualityHelper();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateSpacePackage getStateSpacePackage();

} //StateSpaceFactory

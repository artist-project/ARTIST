/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.henshin.wrap.WrapPackage
 * @generated
 */
public interface WrapFactory extends EFactory {
	
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrapFactory eINSTANCE = org.eclipse.emf.henshin.wrap.impl.WrapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WObject</em>'.
	 * @generated
	 */
	WObject createWObject();

	/**
	 * Returns a new object of class '<em>WLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WLink</em>'.
	 * @generated
	 */
	WLink createWLink();

	/**
	 * Returns a new object of class '<em>WValue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WValue</em>'.
	 * @generated
	 */
	WValue createWValue();

	/**
	 * Create a WModel for a given set of EObjects.
	 * @param eObjects A collection of EObjects.
	 * @param activateSync <code>true</code> if the synchronization should be activated.
	 * @return A map associating EObjects with their wrapper WObjects.
	 * @generated NOT
	 */
	Map<EObject,WObject> createWModel(Collection<EObject> eObjects, boolean activateSync);

	/**
	 * Create a WModel for a given set of EObjects and all their transitively contained EObjects.
	 * @param eObjects A collection of EObjects.
	 * @param activateSync <code>true</code> if the synchronization should be activated.
	 * @return A map associating EObjects with their wrapper WObjects.
	 * @generated NOT
	 */
	Map<EObject,WObject> createWModelTree(Collection<EObject> eObjects, boolean activateSync);

	/**
	 * Create a WModel for a given set of EObjects and all their transitively reachable EObjects.
	 * @param eObjects A collection of EObjects.
	 * @param activateSync <code>true</code> if the synchronization should be activated.
	 * @return A map associating EObjects with their wrapper WObjects.
	 * @generated NOT
	 */
	Map<EObject,WObject> createWModelGraph(Collection<EObject> eObjects, boolean activateSync);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WrapPackage getWrapPackage();

} //WrapFactory

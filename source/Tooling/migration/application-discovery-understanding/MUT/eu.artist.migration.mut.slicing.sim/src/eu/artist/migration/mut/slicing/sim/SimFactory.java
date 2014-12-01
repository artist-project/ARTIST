/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
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

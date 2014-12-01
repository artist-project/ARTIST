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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getFeatureValue()
 * @model
 * @generated
 */
public interface FeatureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' container reference.
	 * @see #setCriterion(SlicingCriterion)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getFeatureValue_Criterion()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingCriterion#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	SlicingCriterion getCriterion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion <em>Criterion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' container reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(SlicingCriterion value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getFeatureValue_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getFeatureValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FeatureValue

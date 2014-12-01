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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicing Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getFeatures <em>Features</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getValues <em>Values</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion()
 * @model
 * @generated
 */
public interface SlicingCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Intent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' container reference.
	 * @see #setIntent(SlicingIntent)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion_Intent()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getCriteria
	 * @model opposite="criteria" required="true" transient="false"
	 * @generated
	 */
	SlicingIntent getIntent();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' container reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(SlicingIntent value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.FeatureValue}.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion_Values()
	 * @see eu.artist.migration.mut.slicing.sim.FeatureValue#getCriterion
	 * @model opposite="criterion" containment="true"
	 * @generated
	 */
	EList<FeatureValue> getValues();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion_Element()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getElement();

} // SlicingCriterion

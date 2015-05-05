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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicing Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getInject <em>Inject</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingCriterion#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface SlicingCriterion extends NamedElement {
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
	 * Returns the value of the '<em><b>Inject</b></em>' attribute list.
	 * The list contents are of type {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject</em>' attribute list.
	 * @see eu.artist.migration.mut.slicing.sim.ModelType
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingCriterion_Inject()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelType> getInject();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
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
	EList<EObject> getElement();

} // SlicingCriterion

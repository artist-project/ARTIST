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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicing Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainmentHierarchy <em>Containment Hierarchy</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainedElement <em>Contained Element</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getGeneralizationHierarchy <em>Generalization Hierarchy</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration()
 * @model
 * @generated
 */
public interface SlicingConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Intent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' container reference.
	 * @see #setIntent(SlicingIntent)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration_Intent()
	 * @see eu.artist.migration.mut.slicing.sim.SlicingIntent#getConfiguration
	 * @model opposite="configuration" required="true" transient="false"
	 * @generated
	 */
	SlicingIntent getIntent();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getIntent <em>Intent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' container reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(SlicingIntent value);

	/**
	 * Returns the value of the '<em><b>Containment Hierarchy</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ContainmentHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Hierarchy</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ContainmentHierarchy
	 * @see #setContainmentHierarchy(ContainmentHierarchy)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration_ContainmentHierarchy()
	 * @model
	 * @generated
	 */
	ContainmentHierarchy getContainmentHierarchy();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainmentHierarchy <em>Containment Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Hierarchy</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ContainmentHierarchy
	 * @see #getContainmentHierarchy()
	 * @generated
	 */
	void setContainmentHierarchy(ContainmentHierarchy value);

	/**
	 * Returns the value of the '<em><b>Contained Element</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ContainedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Element</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ContainedElement
	 * @see #setContainedElement(ContainedElement)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration_ContainedElement()
	 * @model
	 * @generated
	 */
	ContainedElement getContainedElement();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getContainedElement <em>Contained Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Element</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ContainedElement
	 * @see #getContainedElement()
	 * @generated
	 */
	void setContainedElement(ContainedElement value);

	/**
	 * Returns the value of the '<em><b>Generalization Hierarchy</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Hierarchy</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy
	 * @see #setGeneralizationHierarchy(GeneralizationHierarchy)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration_GeneralizationHierarchy()
	 * @model
	 * @generated
	 */
	GeneralizationHierarchy getGeneralizationHierarchy();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getGeneralizationHierarchy <em>Generalization Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Hierarchy</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy
	 * @see #getGeneralizationHierarchy()
	 * @generated
	 */
	void setGeneralizationHierarchy(GeneralizationHierarchy value);

	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.mut.slicing.sim.ReferencedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ReferencedElement
	 * @see #setReferencedElement(ReferencedElement)
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getSlicingConfiguration_ReferencedElement()
	 * @model
	 * @generated
	 */
	ReferencedElement getReferencedElement();

	/**
	 * Sets the value of the '{@link eu.artist.migration.mut.slicing.sim.SlicingConfiguration#getReferencedElement <em>Referenced Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' attribute.
	 * @see eu.artist.migration.mut.slicing.sim.ReferencedElement
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(ReferencedElement value);

} // SlicingConfiguration

/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement#getChildTargetElement <em>Child Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTargetElement()
 * @model
 * @generated
 */
public interface TargetElement extends Element {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTargetElement_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Child Target Element</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Target Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Target Element</em>' containment reference list.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTargetElement_ChildTargetElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetElement> getChildTargetElement();

} // TargetElement

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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getElements <em>Elements</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTrace_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#getTrace_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

} // Trace

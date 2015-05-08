/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.GraphElement#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraphElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GraphElement extends EObject {
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns the graph this graph element is contained in.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Action)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraphElement_Action()
	 * @model dataType="org.eclipse.emf.henshin.model.Action" transient="true" volatile="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.GraphElement#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // GraphElement

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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.MultiUnit#getSubUnits <em>Sub Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getMultiUnit()
 * @model abstract="true"
 * @generated
 */
public interface MultiUnit extends Unit {
	
	/**
	 * Returns the value of the '<em><b>Sub Units</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Units</em>' reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getMultiUnit_SubUnits()
	 * @model
	 * @generated
	 */
	EList<Unit> getSubUnits();

} // MultiUnit

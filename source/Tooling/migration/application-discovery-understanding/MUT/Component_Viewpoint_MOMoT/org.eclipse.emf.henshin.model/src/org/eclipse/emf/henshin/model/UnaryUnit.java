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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.UnaryUnit#getSubUnit <em>Sub Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnaryUnit()
 * @model abstract="true"
 * @generated
 */
public interface UnaryUnit extends Unit {
	
	/**
	 * Returns the value of the '<em><b>Sub Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Unit</em>' reference.
	 * @see #setSubUnit(Unit)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getUnaryUnit_SubUnit()
	 * @model required="true"
	 * @generated
	 */
	Unit getSubUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.UnaryUnit#getSubUnit <em>Sub Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Unit</em>' reference.
	 * @see #getSubUnit()
	 * @generated
	 */
	void setSubUnit(Unit value);

} // UnaryUnit

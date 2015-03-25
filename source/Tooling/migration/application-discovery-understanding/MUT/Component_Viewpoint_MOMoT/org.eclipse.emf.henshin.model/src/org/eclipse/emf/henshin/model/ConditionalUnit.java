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
 * A representation of the model object '<em><b>Conditional Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.ConditionalUnit#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.ConditionalUnit#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.ConditionalUnit#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getConditionalUnit()
 * @model
 * @generated
 */
public interface ConditionalUnit extends Unit {
	
	/**
	 * Returns the value of the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' reference.
	 * @see #setIf(Unit)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getConditionalUnit_If()
	 * @model required="true"
	 * @generated
	 */
	Unit getIf();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.ConditionalUnit#getIf <em>If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Unit value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(Unit)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getConditionalUnit_Then()
	 * @model required="true"
	 * @generated
	 */
	Unit getThen();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.ConditionalUnit#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Unit value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(Unit)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getConditionalUnit_Else()
	 * @model
	 * @generated
	 */
	Unit getElse();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.ConditionalUnit#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Unit value);

} // ConditionalUnit

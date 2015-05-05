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
 * A representation of the model object '<em><b>Binary Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.BinaryFormula#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.BinaryFormula#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getBinaryFormula()
 * @model abstract="true"
 * @generated
 */
public interface BinaryFormula extends ModelElement, Formula {
	
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Formula)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getBinaryFormula_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Formula getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.BinaryFormula#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Formula value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Formula)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getBinaryFormula_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Formula getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.BinaryFormula#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Formula value);

} // BinaryFormula

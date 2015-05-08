/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WObject#getEObject <em>EObject</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WObject#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WObject#getWMembers <em>WMembers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWObject()
 * @model
 * @generated
 */
public interface WObject extends WSynchronizer {
	
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWObject_EObject()
	 * @model transient="true"
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.wrap.WObject#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWObject_EClass()
	 * @model volatile="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.wrap.WObject#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>WMembers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.wrap.WMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WMembers</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWObject_WMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMember> getWMembers();

} // WObject

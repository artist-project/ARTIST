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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WLink#getWTarget <em>WTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWLink()
 * @model
 * @generated
 */
public interface WLink extends WMember {
	
	/**
	 * Returns the value of the '<em><b>WTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WTarget</em>' reference.
	 * @see #setWTarget(WObject)
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWLink_WTarget()
	 * @model
	 * @generated
	 */
	WObject getWTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.wrap.WLink#getWTarget <em>WTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WTarget</em>' reference.
	 * @see #getWTarget()
	 * @generated
	 */
	void setWTarget(WObject value);

} // WLink

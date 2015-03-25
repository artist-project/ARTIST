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
 * A representation of the model object '<em><b>WValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WValue#getEValue <em>EValue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWValue()
 * @model
 * @generated
 */
public interface WValue extends WMember {
	
	/**
	 * Returns the value of the '<em><b>EValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EValue</em>' attribute.
	 * @see #setEValue(Object)
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWValue_EValue()
	 * @model
	 * @generated
	 */
	Object getEValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.wrap.WValue#getEValue <em>EValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EValue</em>' attribute.
	 * @see #getEValue()
	 * @generated
	 */
	void setEValue(Object value);

} // WValue

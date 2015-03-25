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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSynchronizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.WSynchronizer#isSynchronize <em>Synchronize</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWSynchronizer()
 * @model abstract="true"
 * @generated
 */
public interface WSynchronizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Synchronize</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize</em>' attribute.
	 * @see #setSynchronize(boolean)
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#getWSynchronizer_Synchronize()
	 * @model default="true"
	 * @generated
	 */
	boolean isSynchronize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.wrap.WSynchronizer#isSynchronize <em>Synchronize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize</em>' attribute.
	 * @see #isSynchronize()
	 * @generated
	 */
	void setSynchronize(boolean value);

} // WSynchronizer

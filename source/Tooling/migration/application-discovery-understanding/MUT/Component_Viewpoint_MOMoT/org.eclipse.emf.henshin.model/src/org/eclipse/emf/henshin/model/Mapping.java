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
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.Mapping#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Mapping#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends ModelElement {
	
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Node)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getMapping_Origin()
	 * @model required="true"
	 * @generated
	 */
	Node getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Mapping#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Node value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Node)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getMapping_Image()
	 * @model required="true"
	 * @generated
	 */
	Node getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Mapping#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Node value);

} // Mapping

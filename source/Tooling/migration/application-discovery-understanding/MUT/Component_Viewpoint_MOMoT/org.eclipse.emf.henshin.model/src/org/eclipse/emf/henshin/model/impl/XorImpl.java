/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Xor;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Xor</b></em>'. 
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XorImpl extends BinaryFormulaImpl implements Xor {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HenshinPackage.Literals.XOR;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTrue() {
		return (left!=null && right!=null) && 
			((left.isTrue() && right.isFalse()) || (left.isFalse() && right.isTrue()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFalse() {
		return (left!=null && right!=null) && 
				((left.isTrue() && right.isTrue()) || (left.isFalse() && right.isFalse()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "(" + left + " ^ " + right + ")";
	}

} // XorImpl

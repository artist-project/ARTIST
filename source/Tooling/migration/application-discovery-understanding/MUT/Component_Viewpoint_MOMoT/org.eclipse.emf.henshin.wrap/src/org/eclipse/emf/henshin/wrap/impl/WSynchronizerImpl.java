/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.henshin.wrap.WSynchronizer;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WSynchronizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WSynchronizerImpl#isSynchronize <em>Synchronize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WSynchronizerImpl extends EObjectImpl implements WSynchronizer {
	
	/**
	 * The default value of the '{@link #isSynchronize() <em>Synchronize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSynchronize() <em>Synchronize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronize()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronize = SYNCHRONIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSynchronizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WSynchronizerImpl(boolean synchronize) {
		setSynchronize(synchronize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrapPackage.Literals.WSYNCHRONIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronize() {
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronize(boolean newSynchronize) {
		boolean oldSynchronize = synchronize;
		synchronize = newSynchronize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapPackage.WSYNCHRONIZER__SYNCHRONIZE, oldSynchronize, synchronize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapPackage.WSYNCHRONIZER__SYNCHRONIZE:
				return isSynchronize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WrapPackage.WSYNCHRONIZER__SYNCHRONIZE:
				setSynchronize((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WrapPackage.WSYNCHRONIZER__SYNCHRONIZE:
				setSynchronize(SYNCHRONIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WrapPackage.WSYNCHRONIZER__SYNCHRONIZE:
				return synchronize != SYNCHRONIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (synchronize: ");
		result.append(synchronize);
		result.append(')');
		return result.toString();
	}

} //WSynchronizerImpl

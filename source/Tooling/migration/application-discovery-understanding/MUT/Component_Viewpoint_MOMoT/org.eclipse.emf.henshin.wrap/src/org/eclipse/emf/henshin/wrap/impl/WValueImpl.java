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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.wrap.WValue;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WValue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WValueImpl#getEValue <em>EValue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WValueImpl extends WMemberImpl implements WValue {
	
	/**
	 * The default value of the '{@link #getEValue() <em>EValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object EVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEValue() <em>EValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEValue()
	 * @generated
	 * @ordered
	 */
	protected Object eValue = EVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WValueImpl(boolean synchronize) {
		super();
		setSynchronize(synchronize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrapPackage.Literals.WVALUE;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification message) {
		super.eNotify(message);
		if (message.getFeature()==WrapPackage.eINSTANCE.getWValue_EValue()) {
			Object oldValue = message.getOldValue();
			Object newValue = message.getNewValue();
			EStructuralFeature feature = getEStructuralFeature();
			int index = removeEValueFromWObject(feature, oldValue);
			addEValueToWObject(feature, newValue, index);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEValue() {
		return eValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEValue(Object newEValue) {
		Object oldEValue = eValue;
		eValue = newEValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapPackage.WVALUE__EVALUE, oldEValue, eValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapPackage.WVALUE__EVALUE:
				return getEValue();
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
			case WrapPackage.WVALUE__EVALUE:
				setEValue(newValue);
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
			case WrapPackage.WVALUE__EVALUE:
				setEValue(EVALUE_EDEFAULT);
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
			case WrapPackage.WVALUE__EVALUE:
				return EVALUE_EDEFAULT == null ? eValue != null : !EVALUE_EDEFAULT.equals(eValue);
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
		result.append(" (eValue: ");
		result.append(eValue);
		result.append(')');
		return result.toString();
	}

} //WValueImpl

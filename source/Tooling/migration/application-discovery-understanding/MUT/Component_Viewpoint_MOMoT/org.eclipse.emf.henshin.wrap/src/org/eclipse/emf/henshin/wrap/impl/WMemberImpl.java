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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.wrap.WMember;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WMemberImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WMemberImpl extends WSynchronizerImpl implements WMember {
	
	/**
	 * The cached value of the '{@link #getEStructuralFeature() <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature eStructuralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WMemberImpl(boolean synchronize) {
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
		return WrapPackage.Literals.WMEMBER;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification message) {
		super.eNotify(message);
		if (message.getFeature()==WrapPackage.eINSTANCE.getWMember_EStructuralFeature()) {
			int index = removeEValueFromWObject((EStructuralFeature) message.getOldValue(), getEValue());
			addEValueToWObject((EStructuralFeature) message.getNewValue(), getEValue(), index);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
	 */
	@Override
	public final boolean eNotificationRequired() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Object getEValue();

	/**
	 * Returns the WObject that this member belongs to.
	 * @return The container WObject or <code>null</code>.
	 */
	public WObject getWObject() {
		EObject container = eContainer();
		return (container instanceof WObject) ? (WObject) container : null;
	}

	int removeEValueFromWObject(EStructuralFeature eFeature, Object eValue) {
		if (synchronize) {
			WObjectImpl wObject = (WObjectImpl) getWObject();
			if (wObject!=null) {
				return wObject.removeEValue(eFeature, eValue);
			}
		}
		return -1;
	}

	void addEValueToWObject(EStructuralFeature eFeature, Object eValue, int index) {
		if (synchronize) {
			WObjectImpl wObject = (WObjectImpl) getWObject();
			if (wObject!=null) {
				wObject.addEValue(eFeature, eValue, index);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		if (eStructuralFeature != null && eStructuralFeature.eIsProxy()) {
			InternalEObject oldEStructuralFeature = (InternalEObject)eStructuralFeature;
			eStructuralFeature = (EStructuralFeature)eResolveProxy(oldEStructuralFeature);
			if (eStructuralFeature != oldEStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE, oldEStructuralFeature, eStructuralFeature));
			}
		}
		return eStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetEStructuralFeature() {
		return eStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		EStructuralFeature oldEStructuralFeature = eStructuralFeature;
		eStructuralFeature = newEStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE, oldEStructuralFeature, eStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE:
				if (resolve) return getEStructuralFeature();
				return basicGetEStructuralFeature();
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
			case WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE:
				setEStructuralFeature((EStructuralFeature)newValue);
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
			case WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE:
				setEStructuralFeature((EStructuralFeature)null);
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
			case WrapPackage.WMEMBER__ESTRUCTURAL_FEATURE:
				return eStructuralFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //WMemberImpl

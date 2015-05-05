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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.wrap.WLink;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WLink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WLinkImpl#getWTarget <em>WTarget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WLinkImpl extends WMemberImpl implements WLink {
	
	/**
	 * The cached value of the '{@link #getWTarget() <em>WTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWTarget()
	 * @generated
	 * @ordered
	 */
	protected WObject wTarget;
	
	/**
	 * Adapter for getting notifications.
	 */
	private final Adapter adapter = new AdapterImpl() {
		public void notifyChanged(Notification notification) {
			WLinkImpl.this.notifyChanged(notification);
		}
	};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WLinkImpl() {
		super();
		// Make sure we get all notifications:
		eAdapters().add(adapter);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WLinkImpl(boolean synchronize) {
		this();
		setSynchronize(synchronize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrapPackage.Literals.WLINK;
	}

	/*
	 * Notify a change.
	 */
	private void notifyChanged(Notification message) {
		
		// WTarget feature changed?
		if (message.getFeature()==WrapPackage.eINSTANCE.getWLink_WTarget()) {
			
			// Get the old and the new WTarget and WObjects: 
			WObject oldWTarget = (WObject) message.getOldValue();
			WObject newWTarget = (WObject) message.getNewValue();
			EObject oldETarget = oldWTarget!=null ? oldWTarget.getEObject() : null;
			EObject newETarget = newWTarget!=null ? newWTarget.getEObject() : null;
			
			// Remove and re-add the targets:
			int index = removeEValueFromWObject(getEStructuralFeature(), oldETarget);
			addEValueToWObject(getEStructuralFeature(), newETarget, index);

			// Hook the adapter to the new target:
			if (oldWTarget!=null) {
				oldWTarget.eAdapters().remove(adapter);
			}
			if (newWTarget!=null) {
				newWTarget.eAdapters().add(adapter);
			}
			
		}
		
		// WObject of the WTarget changed?
		else if (message.getFeature()==WrapPackage.eINSTANCE.getWObject_EObject()) {
			
			// Get the old and the new target:
			EObject oldETarget = (EObject) message.getOldValue();
			EObject newETarget = (EObject) message.getNewValue();
			
			// Remove and re-add the targets:
			int index = removeEValueFromWObject(getEStructuralFeature(), oldETarget);
			addEValueToWObject(getEStructuralFeature(), newETarget, index);
			
		}

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.wrap.impl.WMemberImpl#getEValue()
	 */
	@Override
	public Object getEValue() {
		return (wTarget!=null) ? wTarget.getEObject() : null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WObject getWTarget() {
		if (wTarget != null && wTarget.eIsProxy()) {
			InternalEObject oldWTarget = (InternalEObject)wTarget;
			wTarget = (WObject)eResolveProxy(oldWTarget);
			if (wTarget != oldWTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrapPackage.WLINK__WTARGET, oldWTarget, wTarget));
			}
		}
		return wTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WObject basicGetWTarget() {
		return wTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWTarget(WObject newWTarget) {
		WObject oldWTarget = wTarget;
		wTarget = newWTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapPackage.WLINK__WTARGET, oldWTarget, wTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapPackage.WLINK__WTARGET:
				if (resolve) return getWTarget();
				return basicGetWTarget();
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
			case WrapPackage.WLINK__WTARGET:
				setWTarget((WObject)newValue);
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
			case WrapPackage.WLINK__WTARGET:
				setWTarget((WObject)null);
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
			case WrapPackage.WLINK__WTARGET:
				return wTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //WLinkImpl

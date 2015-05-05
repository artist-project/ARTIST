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

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.wrap.WMember;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WObjectImpl#getEObject <em>EObject</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WObjectImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.wrap.impl.WObjectImpl#getWMembers <em>WMembers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WObjectImpl extends WSynchronizerImpl implements WObject {
	
	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject eObject;

	/**
	 * The cached value of the '{@link #getWMembers() <em>WMembers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<WMember> wMembers;
	
	private Adapter eClassAdapter = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			setEClass(getEClass());
		}
	};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WObjectImpl(boolean synchronize) {
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
		return WrapPackage.Literals.WOBJECT;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification message) {
		super.eNotify(message);
		
		// Get the changed feature and the event type: 
		int featureID = message.getFeatureID(WObject.class);
		int eventType = message.getEventType();
		
		// Member added or removed?
		if (featureID==WrapPackage.WOBJECT__WMEMBERS) {
			WMember member;
			switch (eventType) {
			case Notification.ADD:
				member = (WMember) message.getNewValue();
				addEValue(member.getEStructuralFeature(), member.getEValue(), -1);
				break;
			case Notification.REMOVE:
				member = (WMember) message.getOldValue();
				removeEValue(member.getEStructuralFeature(), member.getEValue());
				break;
			}
		}
		
		// EObject changed?
		else if (featureID==WrapPackage.WOBJECT__EOBJECT) {
			switch (eventType) {
			case Notification.SET:
				EObject oldEObject = (EObject) message.getOldValue();
				EObject newEObject = (EObject) message.getNewValue();
				if (oldEObject!=newEObject) {
					eObject = oldEObject;
					for (WMember member : getWMembers()) {
						removeEValue(member.getEStructuralFeature(), member.getEValue());
					}
					eObject = newEObject;
					for (WMember member : getWMembers()) {
						addEValue(member.getEStructuralFeature(), member.getEValue(), -1);
					}
					if (oldEObject!=null) {
						oldEObject.eClass().eAdapters().remove(eClassAdapter);
					}
					if (newEObject!=null) {
						newEObject.eClass().eAdapters().add(eClassAdapter);
					}
				}
				break;
			}
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
	
	@SuppressWarnings("unchecked")
	int removeEValue(EStructuralFeature eFeature, Object eValue) {
		int index = -1;
		if (synchronize && eObject!=null && eFeature!=null && eValue!=null && eObject.eClass().getEAllStructuralFeatures().contains(eFeature)) {			
			if (eFeature.isMany()) {
				EList<?> eValues = ((EList<Object>) eObject.eGet(eFeature));
				index = eValues.indexOf(eValue);
				if (index>=0) eValues.remove(index);
			} else {
				index = 0;
				eObject.eSet(eFeature, null);
			}
		}
		return index;
	}

	@SuppressWarnings("unchecked")
	void addEValue(EStructuralFeature eFeature, Object eValue, int index) {
		if (synchronize && eObject!=null && eFeature!=null && eValue!=null && eObject.eClass().getEAllStructuralFeatures().contains(eFeature)) {
			if (eFeature.isMany()) {
				EList<Object> eValues = ((EList<Object>) eObject.eGet(eFeature));
				if (index<0 || index>eValues.size()) index = eValues.size();
				if (!eValues.contains(eValue)) {
					eValues.add(index, eValue);
				}
			} else {
				eObject.eSet(eFeature, eValue);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEObject() {
		if (eObject != null && eObject.eIsProxy()) {
			InternalEObject oldEObject = (InternalEObject)eObject;
			eObject = eResolveProxy(oldEObject);
			if (eObject != oldEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrapPackage.WOBJECT__EOBJECT, oldEObject, eObject));
			}
		}
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEObject() {
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEObject(EObject newEObject) {
		EObject oldEObject = eObject;
		eObject = newEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapPackage.WOBJECT__EOBJECT, oldEObject, eObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		EClass eClass = basicGetEClass();
		return eClass != null && eClass.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)eClass) : eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass basicGetEClass() {
		return (eObject!=null) ? eObject.eClass() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEClass(EClass eClass) {
		if (eClass!=null && !eClass.isAbstract() && !eClass.isInterface()) {
			setEObject(eClass.getEPackage().getEFactoryInstance().create(eClass));	
		} else {
			setEObject(null);
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WMember> getWMembers() {
		if (wMembers == null) {
			wMembers = new EObjectContainmentEList<WMember>(WMember.class, this, WrapPackage.WOBJECT__WMEMBERS);
		}
		return wMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WrapPackage.WOBJECT__WMEMBERS:
				return ((InternalEList<?>)getWMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapPackage.WOBJECT__EOBJECT:
				if (resolve) return getEObject();
				return basicGetEObject();
			case WrapPackage.WOBJECT__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case WrapPackage.WOBJECT__WMEMBERS:
				return getWMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WrapPackage.WOBJECT__EOBJECT:
				setEObject((EObject)newValue);
				return;
			case WrapPackage.WOBJECT__ECLASS:
				setEClass((EClass)newValue);
				return;
			case WrapPackage.WOBJECT__WMEMBERS:
				getWMembers().clear();
				getWMembers().addAll((Collection<? extends WMember>)newValue);
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
			case WrapPackage.WOBJECT__EOBJECT:
				setEObject((EObject)null);
				return;
			case WrapPackage.WOBJECT__ECLASS:
				setEClass((EClass)null);
				return;
			case WrapPackage.WOBJECT__WMEMBERS:
				getWMembers().clear();
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
			case WrapPackage.WOBJECT__EOBJECT:
				return eObject != null;
			case WrapPackage.WOBJECT__ECLASS:
				return basicGetEClass() != null;
			case WrapPackage.WOBJECT__WMEMBERS:
				return wMembers != null && !wMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WObjectImpl

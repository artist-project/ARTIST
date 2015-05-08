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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.model.ConditionalUnit;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Unit;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Conditional Unit</b></em>'. 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ConditionalUnitImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ConditionalUnitImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.ConditionalUnitImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalUnitImpl extends UnitImpl implements ConditionalUnit {
	
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected Unit if_;
	
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Unit then;
	
	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Unit else_;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalUnitImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HenshinPackage.Literals.CONDITIONAL_UNIT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getIf() {
		if (if_ != null && if_.eIsProxy()) {
			InternalEObject oldIf = (InternalEObject)if_;
			if_ = (Unit)eResolveProxy(oldIf);
			if (if_ != oldIf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HenshinPackage.CONDITIONAL_UNIT__IF, oldIf, if_));
			}
		}
		return if_;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetIf() {
		return if_;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(Unit newIf) {
		Unit oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.CONDITIONAL_UNIT__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getThen() {
		if (then != null && then.eIsProxy()) {
			InternalEObject oldThen = (InternalEObject)then;
			then = (Unit)eResolveProxy(oldThen);
			if (then != oldThen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HenshinPackage.CONDITIONAL_UNIT__THEN, oldThen, then));
			}
		}
		return then;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetThen() {
		return then;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(Unit newThen) {
		Unit oldThen = then;
		then = newThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.CONDITIONAL_UNIT__THEN, oldThen, then));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getElse() {
		if (else_ != null && else_.eIsProxy()) {
			InternalEObject oldElse = (InternalEObject)else_;
			else_ = (Unit)eResolveProxy(oldElse);
			if (else_ != oldElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HenshinPackage.CONDITIONAL_UNIT__ELSE, oldElse, else_));
			}
		}
		return else_;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetElse() {
		return else_;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Unit newElse) {
		Unit oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.CONDITIONAL_UNIT__ELSE, oldElse, else_));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Unit> getSubUnits() {
		EList<Unit> units = new BasicEList<Unit>();
		if (if_ != null) {
			units.add(if_);
		}
		if (then != null) {
			units.add(then);
		}
		if (else_ != null) {
			units.add(else_);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HenshinPackage.CONDITIONAL_UNIT__IF:
				if (resolve) return getIf();
				return basicGetIf();
			case HenshinPackage.CONDITIONAL_UNIT__THEN:
				if (resolve) return getThen();
				return basicGetThen();
			case HenshinPackage.CONDITIONAL_UNIT__ELSE:
				if (resolve) return getElse();
				return basicGetElse();
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
			case HenshinPackage.CONDITIONAL_UNIT__IF:
				setIf((Unit)newValue);
				return;
			case HenshinPackage.CONDITIONAL_UNIT__THEN:
				setThen((Unit)newValue);
				return;
			case HenshinPackage.CONDITIONAL_UNIT__ELSE:
				setElse((Unit)newValue);
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
			case HenshinPackage.CONDITIONAL_UNIT__IF:
				setIf((Unit)null);
				return;
			case HenshinPackage.CONDITIONAL_UNIT__THEN:
				setThen((Unit)null);
				return;
			case HenshinPackage.CONDITIONAL_UNIT__ELSE:
				setElse((Unit)null);
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
			case HenshinPackage.CONDITIONAL_UNIT__IF:
				return if_ != null;
			case HenshinPackage.CONDITIONAL_UNIT__THEN:
				return then != null;
			case HenshinPackage.CONDITIONAL_UNIT__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}
	
} // ConditionalUnitImpl

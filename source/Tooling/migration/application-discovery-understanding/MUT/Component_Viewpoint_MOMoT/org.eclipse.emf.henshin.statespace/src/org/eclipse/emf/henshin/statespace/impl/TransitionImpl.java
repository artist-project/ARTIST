/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.util.ObjectKeyHelper;

/**
 * Default implementation of the {@link Transition} interface.
 * @generated
 */
public class TransitionImpl extends StorageImpl implements Transition {
	
	/**
	 * Labels are not cached by the transition!
	 * Should be cached externally, if needed.
	 * @generated NOT
	 */
	public String getLabel() {
		
		// We need a rule and a rule name:
		if (rule==null || rule.getName()==null) {
			return "?";
		}
		String label = rule.getName();
		
		// Any parameters?
		if (getParameterCount()>0) {
			label = label + "(";
			int[] keys = getParameterKeys();
			for (int i=0; i<keys.length; i++) {
				label = label + 
						ObjectKeyHelper.getObjectTypePrefix(keys[i]) + 
						ObjectKeyHelper.getObjectID(keys[i]);
				if (i<keys.length-1) {
					label = label + ",";
				}
			}
			label = label + ")";
		}
		
		// Done.
		return label;
	}
	
	/**
	 * @generated NOT
	 */
	public int getMatch() {
		return getData(0);
	}

	/**
	 * @generated NOT
	 */
	public void setMatch(int match) {
		setData(0, match);
	}

	/**
	 * @generated NOT
	 */
	public int getParameterCount() {
		return getData(1);
	}

	/**
	 * @generated NOT
	 */
	public void setParameterCount(int paramCount) {
		setData(1, paramCount);
	}

	/**
	 * @generated NOT
	 */
	public int[] getParameterKeys() {
		return getData(2, 2+getParameterCount());
	}

	/**
	 * @generated NOT
	 */
	public void setParameterKeys(int[] paramIDs) {
		setData(2, paramIDs);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		String s = (getSource()!=null) ? String.valueOf(getSource().getIndex()) : "_";
		String t = (target!=null) ? String.valueOf(target.getIndex()) : "_";
		return s + " --" + getLabel() + "--> " + t;
	}


	/* ---------------------------------------------------------------- *
	 * GENERATED CODE.                                                  *
	 * Do not edit below this line. If you need to edit, move it above  *
	 * this line and change the '@generated'-tag to '@generated NOT'.   *
	 * ---------------------------------------------------------------- */
	
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

	/**
	 * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getParameterCount() <em>Parameter Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getParameterKeys() <em>Parameter Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterKeys()
	 * @generated
	 * @ordered
	 */
	protected static final int[] PARAMETER_KEYS_EDEFAULT = null;

	/**
	 * @generated
	 */
	public TransitionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateSpacePackage.Literals.TRANSITION;
	}

	/**
	 * @generated
	 */
	public State getSource() {
		if (eContainerFeatureID() != StateSpacePackage.TRANSITION__SOURCE) return null;
		return (State)eContainer();
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, StateSpacePackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != StateSpacePackage.TRANSITION__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, StateSpacePackage.STATE__OUTGOING, State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpacePackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpacePackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, StateSpacePackage.STATE__INCOMING, State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, StateSpacePackage.STATE__INCOMING, State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * @generated
	 */
	public Rule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (Rule)eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpacePackage.TRANSITION__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.TRANSITION__RULE, oldRule, rule));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((State)otherEnd, msgs);
			case StateSpacePackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, StateSpacePackage.STATE__INCOMING, State.class, msgs);
				return basicSetTarget((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case StateSpacePackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StateSpacePackage.TRANSITION__SOURCE:
				return eInternalContainer().eInverseRemove(this, StateSpacePackage.STATE__OUTGOING, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				return getSource();
			case StateSpacePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StateSpacePackage.TRANSITION__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case StateSpacePackage.TRANSITION__MATCH:
				return getMatch();
			case StateSpacePackage.TRANSITION__PARAMETER_COUNT:
				return getParameterCount();
			case StateSpacePackage.TRANSITION__PARAMETER_KEYS:
				return getParameterKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StateSpacePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StateSpacePackage.TRANSITION__RULE:
				setRule((Rule)newValue);
				return;
			case StateSpacePackage.TRANSITION__MATCH:
				setMatch((Integer)newValue);
				return;
			case StateSpacePackage.TRANSITION__PARAMETER_COUNT:
				setParameterCount((Integer)newValue);
				return;
			case StateSpacePackage.TRANSITION__PARAMETER_KEYS:
				setParameterKeys((int[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StateSpacePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StateSpacePackage.TRANSITION__RULE:
				setRule((Rule)null);
				return;
			case StateSpacePackage.TRANSITION__MATCH:
				setMatch(MATCH_EDEFAULT);
				return;
			case StateSpacePackage.TRANSITION__PARAMETER_COUNT:
				setParameterCount(PARAMETER_COUNT_EDEFAULT);
				return;
			case StateSpacePackage.TRANSITION__PARAMETER_KEYS:
				setParameterKeys(PARAMETER_KEYS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateSpacePackage.TRANSITION__SOURCE:
				return getSource() != null;
			case StateSpacePackage.TRANSITION__TARGET:
				return target != null;
			case StateSpacePackage.TRANSITION__RULE:
				return rule != null;
			case StateSpacePackage.TRANSITION__MATCH:
				return getMatch() != MATCH_EDEFAULT;
			case StateSpacePackage.TRANSITION__PARAMETER_COUNT:
				return getParameterCount() != PARAMETER_COUNT_EDEFAULT;
			case StateSpacePackage.TRANSITION__PARAMETER_KEYS:
				return PARAMETER_KEYS_EDEFAULT == null ? getParameterKeys() != null : !PARAMETER_KEYS_EDEFAULT.equals(getParameterKeys());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl

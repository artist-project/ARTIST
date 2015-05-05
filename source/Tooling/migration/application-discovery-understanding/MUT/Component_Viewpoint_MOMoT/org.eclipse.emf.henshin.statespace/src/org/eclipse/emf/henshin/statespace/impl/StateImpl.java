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

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Default implementation of the {@link State} interface.
 * @generated
 */
public class StateImpl extends StorageImpl implements State {
	
	/**
	 * Constructor.
	 * @param index The index of this state.
	 * @generated NOT
	 */
	public StateImpl(int index) {
		this.index = index;
	}

	/**
	 * Check whether this state is an initial one.
	 * @generated NOT
	 */
	public boolean isInitial() {
		return model!=null && 
			model.getResource()!=null && 
			model.getResource().getURI()!=null;
	}
	
	/**
	 * Check whether this state is terminal.
	 * @generated NOT
	 */
	public boolean isTerminal() {
		return !isOpen() && !isPruned() && getOutgoing().isEmpty();
	}
	
	/**
	 * @generated NOT
	 */
	public Transition getOutgoing(State target, Rule rule, int match, int[] paramIDs) {
		for (Transition transition : getOutgoing()) {
			if (target==transition.getTarget() && 
				(rule==null || rule==transition.getRule()) &&
				(paramIDs==null || Arrays.equals(paramIDs, transition.getParameterKeys())) &&
				(match<0 || transition.getMatch()==match)) {
				return transition;
			}
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	public int getHashCode() {
		return getData(0);
	}

	/**
	 * @generated NOT
	 */
	public void setHashCode(int hashCode) {
		setData(0, hashCode);
	}
	
	/**
	 * @generated NOT
	 */
	public int getDerivedFrom() {
		return getData(1);
	}

	/**
	 * @generated NOT
	 */
	public void setDerivedFrom(int derivedFrom) {
		setData(1, derivedFrom);
	}

	/**
	 * @generated NOT
	 */
	public boolean isOpen() {
		return ((getData(2) & 1)==1);
	}

	/**
	 * @generated NOT
	 */
	public void setOpen(boolean open) {
		int data = getData(2);
		if (open) {
			data = data | 1;
		} else {
			data = data & ~1;
		}
		setData(2, data);
		StateSpace stateSpace = getStateSpace();
		if (stateSpace!=null) {
			if (open) {
				getStateSpace().getOpenStates().add(this);
			} else {
				getStateSpace().getOpenStates().remove(this);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public boolean isGoal() {
		return ((getData(2) & 2)==2);
	}

	/**
	 * @generated NOT
	 */
	public void setGoal(boolean goal) {
		int data = getData(2);
		if (goal) {
			data = data | 2;
		} else {
			data = data & ~2;
		}
		setData(2, data);
	}

	/**
	 * @generated NOT
	 */
	public boolean isPruned() {
		return ((getData(2) & 4)==4);
	}

	/**
	 * @generated NOT
	 */
	public void setPruned(boolean pruned) {
		int data = getData(2);
		if (pruned) {
			data = data | 4;
		} else {
			data = data & ~4;
		}
		setData(2, data);
	}

	/**
	 * @generated NOT
	 */
	public int getObjectCount() {
		return getData(3);
	}

	/**
	 * @generated NOT
	 */
	public void setObjectCount(int objectCount) {
		setData(3, objectCount);
	}

	/**
	 * @generated NOT
	 */
	public int[] getLocation() {
		return getData(4, 7);
	}

	/**
	 * @generated NOT
	 */
	public void setLocation(int... location) {
		setData(4, 7, location);
	}

	/**
	 * @generated NOT
	 */
	public int[] getObjectKeys() {
		return getData(7, 7+getObjectCount());
	}

	/**
	 * @generated NOT
	 */
	public void setObjectKeys(int[] objectKeys) {
		setData(7, objectKeys);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "State " + index;
	}
	
	/* ---------------------------------------------------------------- *
	 * GENERATED CODE.                                                  *
	 * Do not edit below this line. If you need to edit, move it above  *
	 * this line and change the '@generated'-tag to '@generated NOT'.   *
	 * ---------------------------------------------------------------- */
	
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference list.
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The default value of the '{@link #getHashCode() <em>Hash Code</em>}' attribute.
	 * @see #getHashCode()
	 * @generated
	 * @ordered
	 */
	protected static final int HASH_CODE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDerivedFrom() <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int DERIVED_FROM_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GOAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPruned() <em>Pruned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPruned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRUNED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int[] LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjectCount() <em>Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECT_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getObjectKeys() <em>Object Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectKeys()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OBJECT_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * @generated
	 */
	public StateImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateSpacePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.STATE__INDEX, oldIndex, index));
	}

	/**
	 * Get the list of incoming transitions of this state.
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StateSpacePackage.STATE__INCOMING, StateSpacePackage.TRANSITION__TARGET);
		}
		return incoming;
	}
	
	/**
	 * Get the list of outgoing transitions of this state.
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StateSpacePackage.STATE__OUTGOING, StateSpacePackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * @generated
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpacePackage.STATE__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpacePackage.STATE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpacePackage.STATE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.STATE__MODEL, newModel, newModel));
	}

	/**
	 * @generated
	 */
	public StateSpace getStateSpace() {
		if (eContainerFeatureID() != StateSpacePackage.STATE__STATE_SPACE) return null;
		return (StateSpace)eContainer();
	}
	
	/**
	 * @generated
	 */
	public NotificationChain basicSetStateSpace(StateSpace newStateSpace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateSpace, StateSpacePackage.STATE__STATE_SPACE, msgs);
		return msgs;
	}
	
	/**
	 * @generated
	 */
	public void setStateSpace(StateSpace newStateSpace) {
		if (newStateSpace != eInternalContainer() || (eContainerFeatureID() != StateSpacePackage.STATE__STATE_SPACE && newStateSpace != null)) {
			if (EcoreUtil.isAncestor(this, newStateSpace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateSpace != null)
				msgs = ((InternalEObject)newStateSpace).eInverseAdd(this, StateSpacePackage.STATE_SPACE__STATES, StateSpace.class, msgs);
			msgs = basicSetStateSpace(newStateSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateSpacePackage.STATE__STATE_SPACE, newStateSpace, newStateSpace));
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateSpacePackage.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case StateSpacePackage.STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case StateSpacePackage.STATE__STATE_SPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateSpace((StateSpace)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateSpacePackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case StateSpacePackage.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case StateSpacePackage.STATE__STATE_SPACE:
				return basicSetStateSpace(null, msgs);
			case StateSpacePackage.STATE__MODEL:
				return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StateSpacePackage.STATE__STATE_SPACE:
				return eInternalContainer().eInverseRemove(this, StateSpacePackage.STATE_SPACE__STATES, StateSpace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateSpacePackage.STATE__INDEX:
				return getIndex();
			case StateSpacePackage.STATE__INCOMING:
				return getIncoming();
			case StateSpacePackage.STATE__OUTGOING:
				return getOutgoing();
			case StateSpacePackage.STATE__STATE_SPACE:
				return getStateSpace();
			case StateSpacePackage.STATE__HASH_CODE:
				return getHashCode();
			case StateSpacePackage.STATE__DERIVED_FROM:
				return getDerivedFrom();
			case StateSpacePackage.STATE__OPEN:
				return isOpen();
			case StateSpacePackage.STATE__GOAL:
				return isGoal();
			case StateSpacePackage.STATE__PRUNED:
				return isPruned();
			case StateSpacePackage.STATE__LOCATION:
				return getLocation();
			case StateSpacePackage.STATE__OBJECT_COUNT:
				return getObjectCount();
			case StateSpacePackage.STATE__OBJECT_KEYS:
				return getObjectKeys();
			case StateSpacePackage.STATE__MODEL:
				return getModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateSpacePackage.STATE__INDEX:
				setIndex((Integer)newValue);
				return;
			case StateSpacePackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateSpacePackage.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateSpacePackage.STATE__STATE_SPACE:
				setStateSpace((StateSpace)newValue);
				return;
			case StateSpacePackage.STATE__HASH_CODE:
				setHashCode((Integer)newValue);
				return;
			case StateSpacePackage.STATE__DERIVED_FROM:
				setDerivedFrom((Integer)newValue);
				return;
			case StateSpacePackage.STATE__OPEN:
				setOpen((Boolean)newValue);
				return;
			case StateSpacePackage.STATE__GOAL:
				setGoal((Boolean)newValue);
				return;
			case StateSpacePackage.STATE__PRUNED:
				setPruned((Boolean)newValue);
				return;
			case StateSpacePackage.STATE__LOCATION:
				setLocation((int[])newValue);
				return;
			case StateSpacePackage.STATE__OBJECT_COUNT:
				setObjectCount((Integer)newValue);
				return;
			case StateSpacePackage.STATE__OBJECT_KEYS:
				setObjectKeys((int[])newValue);
				return;
			case StateSpacePackage.STATE__MODEL:
				setModel((Model)newValue);
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
			case StateSpacePackage.STATE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case StateSpacePackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case StateSpacePackage.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case StateSpacePackage.STATE__STATE_SPACE:
				setStateSpace((StateSpace)null);
				return;
			case StateSpacePackage.STATE__HASH_CODE:
				setHashCode(HASH_CODE_EDEFAULT);
				return;
			case StateSpacePackage.STATE__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case StateSpacePackage.STATE__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case StateSpacePackage.STATE__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case StateSpacePackage.STATE__PRUNED:
				setPruned(PRUNED_EDEFAULT);
				return;
			case StateSpacePackage.STATE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case StateSpacePackage.STATE__OBJECT_COUNT:
				setObjectCount(OBJECT_COUNT_EDEFAULT);
				return;
			case StateSpacePackage.STATE__OBJECT_KEYS:
				setObjectKeys(OBJECT_KEYS_EDEFAULT);
				return;
			case StateSpacePackage.STATE__MODEL:
				setModel((Model)null);
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
			case StateSpacePackage.STATE__INDEX:
				return index != INDEX_EDEFAULT;
			case StateSpacePackage.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case StateSpacePackage.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case StateSpacePackage.STATE__STATE_SPACE:
				return getStateSpace() != null;
			case StateSpacePackage.STATE__HASH_CODE:
				return getHashCode() != HASH_CODE_EDEFAULT;
			case StateSpacePackage.STATE__DERIVED_FROM:
				return getDerivedFrom() != DERIVED_FROM_EDEFAULT;
			case StateSpacePackage.STATE__OPEN:
				return isOpen() != OPEN_EDEFAULT;
			case StateSpacePackage.STATE__GOAL:
				return isGoal() != GOAL_EDEFAULT;
			case StateSpacePackage.STATE__PRUNED:
				return isPruned() != PRUNED_EDEFAULT;
			case StateSpacePackage.STATE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case StateSpacePackage.STATE__OBJECT_COUNT:
				return getObjectCount() != OBJECT_COUNT_EDEFAULT;
			case StateSpacePackage.STATE__OBJECT_KEYS:
				return OBJECT_KEYS_EDEFAULT == null ? getObjectKeys() != null : !OBJECT_KEYS_EDEFAULT.equals(getObjectKeys());
			case StateSpacePackage.STATE__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

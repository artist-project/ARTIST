/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.migration.mut.slicing.sim.impl;

import eu.artist.migration.mut.slicing.sim.ModelType;
import eu.artist.migration.mut.slicing.sim.SimPackage;
import eu.artist.migration.mut.slicing.sim.SlicingCriterion;
import eu.artist.migration.mut.slicing.sim.SlicingIntent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slicing Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getInject <em>Inject</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicingCriterionImpl extends EObjectImpl implements SlicingCriterion {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelType> inject;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicingCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimPackage.Literals.SLICING_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CRITERION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingIntent getIntent() {
		if (eContainerFeatureID() != SimPackage.SLICING_CRITERION__INTENT) return null;
		return (SlicingIntent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(SlicingIntent newIntent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntent, SimPackage.SLICING_CRITERION__INTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(SlicingIntent newIntent) {
		if (newIntent != eInternalContainer() || (eContainerFeatureID() != SimPackage.SLICING_CRITERION__INTENT && newIntent != null)) {
			if (EcoreUtil.isAncestor(this, newIntent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, SimPackage.SLICING_INTENT__CRITERIA, SlicingIntent.class, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CRITERION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelType> getInject() {
		if (inject == null) {
			inject = new EDataTypeUniqueEList<ModelType>(ModelType.class, this, SimPackage.SLICING_CRITERION__INJECT);
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<EObject>(EObject.class, this, SimPackage.SLICING_CRITERION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_CRITERION__INTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntent((SlicingIntent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_CRITERION__INTENT:
				return basicSetIntent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimPackage.SLICING_CRITERION__INTENT:
				return eInternalContainer().eInverseRemove(this, SimPackage.SLICING_INTENT__CRITERIA, SlicingIntent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimPackage.SLICING_CRITERION__NAME:
				return getName();
			case SimPackage.SLICING_CRITERION__INTENT:
				return getIntent();
			case SimPackage.SLICING_CRITERION__INJECT:
				return getInject();
			case SimPackage.SLICING_CRITERION__ELEMENT:
				return getElement();
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
			case SimPackage.SLICING_CRITERION__NAME:
				setName((String)newValue);
				return;
			case SimPackage.SLICING_CRITERION__INTENT:
				setIntent((SlicingIntent)newValue);
				return;
			case SimPackage.SLICING_CRITERION__INJECT:
				getInject().clear();
				getInject().addAll((Collection<? extends ModelType>)newValue);
				return;
			case SimPackage.SLICING_CRITERION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends EObject>)newValue);
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
			case SimPackage.SLICING_CRITERION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimPackage.SLICING_CRITERION__INTENT:
				setIntent((SlicingIntent)null);
				return;
			case SimPackage.SLICING_CRITERION__INJECT:
				getInject().clear();
				return;
			case SimPackage.SLICING_CRITERION__ELEMENT:
				getElement().clear();
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
			case SimPackage.SLICING_CRITERION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimPackage.SLICING_CRITERION__INTENT:
				return getIntent() != null;
			case SimPackage.SLICING_CRITERION__INJECT:
				return inject != null && !inject.isEmpty();
			case SimPackage.SLICING_CRITERION__ELEMENT:
				return element != null && !element.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", inject: ");
		result.append(inject);
		result.append(')');
		return result.toString();
	}

} //SlicingCriterionImpl

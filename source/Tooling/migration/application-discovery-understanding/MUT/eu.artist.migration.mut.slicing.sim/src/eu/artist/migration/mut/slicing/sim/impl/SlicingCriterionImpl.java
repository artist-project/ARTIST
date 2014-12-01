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

import eu.artist.migration.mut.slicing.sim.FeatureValue;
import eu.artist.migration.mut.slicing.sim.SimPackage;
import eu.artist.migration.mut.slicing.sim.SlicingCriterion;
import eu.artist.migration.mut.slicing.sim.SlicingIntent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slicing Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingCriterionImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicingCriterionImpl extends MinimalEObjectImpl.Container implements SlicingCriterion {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValue> values;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

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
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Feature>(Feature.class, this, SimPackage.SLICING_CRITERION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<FeatureValue>(FeatureValue.class, this, SimPackage.SLICING_CRITERION__VALUES, SimPackage.FEATURE_VALUE__CRITERION);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<Element>(Element.class, this, SimPackage.SLICING_CRITERION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_CRITERION__INTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntent((SlicingIntent)otherEnd, msgs);
			case SimPackage.SLICING_CRITERION__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
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
			case SimPackage.SLICING_CRITERION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case SimPackage.SLICING_CRITERION__INTENT:
				return getIntent();
			case SimPackage.SLICING_CRITERION__FEATURES:
				return getFeatures();
			case SimPackage.SLICING_CRITERION__VALUES:
				return getValues();
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
			case SimPackage.SLICING_CRITERION__INTENT:
				setIntent((SlicingIntent)newValue);
				return;
			case SimPackage.SLICING_CRITERION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SimPackage.SLICING_CRITERION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends FeatureValue>)newValue);
				return;
			case SimPackage.SLICING_CRITERION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
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
			case SimPackage.SLICING_CRITERION__INTENT:
				setIntent((SlicingIntent)null);
				return;
			case SimPackage.SLICING_CRITERION__FEATURES:
				getFeatures().clear();
				return;
			case SimPackage.SLICING_CRITERION__VALUES:
				getValues().clear();
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
			case SimPackage.SLICING_CRITERION__INTENT:
				return getIntent() != null;
			case SimPackage.SLICING_CRITERION__FEATURES:
				return features != null && !features.isEmpty();
			case SimPackage.SLICING_CRITERION__VALUES:
				return values != null && !values.isEmpty();
			case SimPackage.SLICING_CRITERION__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlicingCriterionImpl

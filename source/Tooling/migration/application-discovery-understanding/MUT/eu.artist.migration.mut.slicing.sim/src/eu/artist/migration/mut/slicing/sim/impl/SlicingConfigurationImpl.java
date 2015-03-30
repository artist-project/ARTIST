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

import eu.artist.migration.mut.slicing.sim.ContainedElement;
import eu.artist.migration.mut.slicing.sim.ContainmentHierarchy;
import eu.artist.migration.mut.slicing.sim.GeneralizationHierarchy;
import eu.artist.migration.mut.slicing.sim.ReferencedElement;
import eu.artist.migration.mut.slicing.sim.SimPackage;
import eu.artist.migration.mut.slicing.sim.SlicingConfiguration;
import eu.artist.migration.mut.slicing.sim.SlicingIntent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slicing Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getContainmentHierarchy <em>Containment Hierarchy</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getContainedElement <em>Contained Element</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getGeneralizationHierarchy <em>Generalization Hierarchy</em>}</li>
 *   <li>{@link eu.artist.migration.mut.slicing.sim.impl.SlicingConfigurationImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicingConfigurationImpl extends EObjectImpl implements SlicingConfiguration {
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
	 * The default value of the '{@link #getContainmentHierarchy() <em>Containment Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final ContainmentHierarchy CONTAINMENT_HIERARCHY_EDEFAULT = ContainmentHierarchy.CUSTOM;

	/**
	 * The cached value of the '{@link #getContainmentHierarchy() <em>Containment Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentHierarchy()
	 * @generated
	 * @ordered
	 */
	protected ContainmentHierarchy containmentHierarchy = CONTAINMENT_HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainedElement() <em>Contained Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElement()
	 * @generated
	 * @ordered
	 */
	protected static final ContainedElement CONTAINED_ELEMENT_EDEFAULT = ContainedElement.CUSTOM;

	/**
	 * The cached value of the '{@link #getContainedElement() <em>Contained Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElement()
	 * @generated
	 * @ordered
	 */
	protected ContainedElement containedElement = CONTAINED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneralizationHierarchy() <em>Generalization Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final GeneralizationHierarchy GENERALIZATION_HIERARCHY_EDEFAULT = GeneralizationHierarchy.CUSTOM;

	/**
	 * The cached value of the '{@link #getGeneralizationHierarchy() <em>Generalization Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationHierarchy()
	 * @generated
	 * @ordered
	 */
	protected GeneralizationHierarchy generalizationHierarchy = GENERALIZATION_HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected static final ReferencedElement REFERENCED_ELEMENT_EDEFAULT = ReferencedElement.CUSTOM;

	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected ReferencedElement referencedElement = REFERENCED_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicingConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimPackage.Literals.SLICING_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingIntent getIntent() {
		if (eContainerFeatureID() != SimPackage.SLICING_CONFIGURATION__INTENT) return null;
		return (SlicingIntent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(SlicingIntent newIntent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntent, SimPackage.SLICING_CONFIGURATION__INTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(SlicingIntent newIntent) {
		if (newIntent != eInternalContainer() || (eContainerFeatureID() != SimPackage.SLICING_CONFIGURATION__INTENT && newIntent != null)) {
			if (EcoreUtil.isAncestor(this, newIntent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, SimPackage.SLICING_INTENT__CONFIGURATION, SlicingIntent.class, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentHierarchy getContainmentHierarchy() {
		return containmentHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentHierarchy(ContainmentHierarchy newContainmentHierarchy) {
		ContainmentHierarchy oldContainmentHierarchy = containmentHierarchy;
		containmentHierarchy = newContainmentHierarchy == null ? CONTAINMENT_HIERARCHY_EDEFAULT : newContainmentHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY, oldContainmentHierarchy, containmentHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedElement getContainedElement() {
		return containedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedElement(ContainedElement newContainedElement) {
		ContainedElement oldContainedElement = containedElement;
		containedElement = newContainedElement == null ? CONTAINED_ELEMENT_EDEFAULT : newContainedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__CONTAINED_ELEMENT, oldContainedElement, containedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationHierarchy getGeneralizationHierarchy() {
		return generalizationHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationHierarchy(GeneralizationHierarchy newGeneralizationHierarchy) {
		GeneralizationHierarchy oldGeneralizationHierarchy = generalizationHierarchy;
		generalizationHierarchy = newGeneralizationHierarchy == null ? GENERALIZATION_HIERARCHY_EDEFAULT : newGeneralizationHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY, oldGeneralizationHierarchy, generalizationHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedElement getReferencedElement() {
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(ReferencedElement newReferencedElement) {
		ReferencedElement oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement == null ? REFERENCED_ELEMENT_EDEFAULT : newReferencedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SLICING_CONFIGURATION__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SLICING_CONFIGURATION__INTENT:
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
			case SimPackage.SLICING_CONFIGURATION__INTENT:
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
			case SimPackage.SLICING_CONFIGURATION__INTENT:
				return eInternalContainer().eInverseRemove(this, SimPackage.SLICING_INTENT__CONFIGURATION, SlicingIntent.class, msgs);
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
			case SimPackage.SLICING_CONFIGURATION__NAME:
				return getName();
			case SimPackage.SLICING_CONFIGURATION__INTENT:
				return getIntent();
			case SimPackage.SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY:
				return getContainmentHierarchy();
			case SimPackage.SLICING_CONFIGURATION__CONTAINED_ELEMENT:
				return getContainedElement();
			case SimPackage.SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY:
				return getGeneralizationHierarchy();
			case SimPackage.SLICING_CONFIGURATION__REFERENCED_ELEMENT:
				return getReferencedElement();
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
			case SimPackage.SLICING_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case SimPackage.SLICING_CONFIGURATION__INTENT:
				setIntent((SlicingIntent)newValue);
				return;
			case SimPackage.SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY:
				setContainmentHierarchy((ContainmentHierarchy)newValue);
				return;
			case SimPackage.SLICING_CONFIGURATION__CONTAINED_ELEMENT:
				setContainedElement((ContainedElement)newValue);
				return;
			case SimPackage.SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY:
				setGeneralizationHierarchy((GeneralizationHierarchy)newValue);
				return;
			case SimPackage.SLICING_CONFIGURATION__REFERENCED_ELEMENT:
				setReferencedElement((ReferencedElement)newValue);
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
			case SimPackage.SLICING_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimPackage.SLICING_CONFIGURATION__INTENT:
				setIntent((SlicingIntent)null);
				return;
			case SimPackage.SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY:
				setContainmentHierarchy(CONTAINMENT_HIERARCHY_EDEFAULT);
				return;
			case SimPackage.SLICING_CONFIGURATION__CONTAINED_ELEMENT:
				setContainedElement(CONTAINED_ELEMENT_EDEFAULT);
				return;
			case SimPackage.SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY:
				setGeneralizationHierarchy(GENERALIZATION_HIERARCHY_EDEFAULT);
				return;
			case SimPackage.SLICING_CONFIGURATION__REFERENCED_ELEMENT:
				setReferencedElement(REFERENCED_ELEMENT_EDEFAULT);
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
			case SimPackage.SLICING_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimPackage.SLICING_CONFIGURATION__INTENT:
				return getIntent() != null;
			case SimPackage.SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY:
				return containmentHierarchy != CONTAINMENT_HIERARCHY_EDEFAULT;
			case SimPackage.SLICING_CONFIGURATION__CONTAINED_ELEMENT:
				return containedElement != CONTAINED_ELEMENT_EDEFAULT;
			case SimPackage.SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY:
				return generalizationHierarchy != GENERALIZATION_HIERARCHY_EDEFAULT;
			case SimPackage.SLICING_CONFIGURATION__REFERENCED_ELEMENT:
				return referencedElement != REFERENCED_ELEMENT_EDEFAULT;
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
		result.append(", containmentHierarchy: ");
		result.append(containmentHierarchy);
		result.append(", containedElement: ");
		result.append(containedElement);
		result.append(", generalizationHierarchy: ");
		result.append(generalizationHierarchy);
		result.append(", referencedElement: ");
		result.append(referencedElement);
		result.append(')');
		return result.toString();
	}

} //SlicingConfigurationImpl

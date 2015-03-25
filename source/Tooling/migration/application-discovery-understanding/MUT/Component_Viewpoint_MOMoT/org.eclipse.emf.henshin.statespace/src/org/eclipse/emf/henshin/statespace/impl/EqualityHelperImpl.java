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

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.emf.henshin.statespace.equality.EcoreEqualityHelper;
import org.eclipse.emf.henshin.statespace.equality.GraphEqualityChecker;
import org.eclipse.emf.henshin.statespace.hashcodes.StateSpaceHashCodeUtil;
import org.eclipse.emf.henshin.statespace.util.StateSpaceTypesHelper;

/**
 * Default implementation of {@link EqualityHelper}.
 * @generated
 */
public class EqualityHelperImpl extends MinimalEObjectImpl.Container implements EqualityHelper {
	
	/**
	 * @generated NOT
	 */
	public int hashCode(Model model) {
		return StateSpaceHashCodeUtil.computeHashCode(model, this);
	}

	/**
	 * @generated NOT
	 */
	public void setStateSpace(StateSpace stateSpace) {
		// Check link order?
		String linkOrder = stateSpace.getProperties().get(StateSpace.PROPERTY_CHECK_LINK_ORDER);
		checkLinkOrder = "true".equalsIgnoreCase(linkOrder) || "yes".equalsIgnoreCase(linkOrder);
		// Gather all known types and attributes:
		Map<String,EClass> allTypes = StateSpaceTypesHelper.getTypesNameMap(stateSpace);
		Map<String,EAttribute> allAttrs = StateSpaceTypesHelper.getAttributesNameMap(stateSpace);
		// Update cached identity types:
		getIdentityTypes().clear();
		String typeNames = stateSpace.getProperties().get(StateSpace.PROPERTY_IDENTITY_TYPES);
		if (typeNames!=null) {
			for (String name : typeNames.split(",")) {
				EClass type = allTypes.get(name.trim());
				if (type!=null) {
					identityTypes.add(type);
				}
			}
		}
		// Update ignored attributes:
		getIgnoredAttributes().clear();
		String attrNames = stateSpace.getProperties().get(StateSpace.PROPERTY_IGNORED_ATTRIBUTES);
		if (attrNames!=null) {
			for (String name : attrNames.split(",")) {
				EAttribute attr = allAttrs.get(name.trim());
				if (attr!=null) {
					ignoredAttributes.add(attr);
				}
			}
		}		
	}

	/**
	 * @generated NOT
	 */
	public boolean equals(Model model1, Model model2) {
		if (model1==null || model2==null) {
			throw new NullPointerException();
		}
		if (checkLinkOrder) {
			return new EcoreEqualityHelper(this).equals(model1, model2);
		} else {
			return new GraphEqualityChecker(this).equals(model1, model2);
		}
	}

	/*
	 * ----------------------------------------------------------------------- *
	 * GENERATED CODE. Do not edit below this line. If you need to edit, move
	 * it above this line and change the '@generated'-tag to '@generated NOT'.
	 * ----------------------------------------------------------------------- *
	 */

	/**
	 * The default value of the '{@link #isCheckLinkOrder() <em>Check Link Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLinkOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_LINK_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckLinkOrder() <em>Check Link Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckLinkOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean checkLinkOrder = CHECK_LINK_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIgnoredAttributes() <em>Ignored Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> ignoredAttributes;

	/**
	 * The cached value of the '{@link #getIdentityTypes() <em>Identity Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> identityTypes;

	/**
	 * Default constructor.
	 * @generated
	 */
	public EqualityHelperImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateSpacePackage.Literals.EQUALITY_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckLinkOrder() {
		return checkLinkOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getIgnoredAttributes() {
		if (ignoredAttributes == null) {
			ignoredAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, StateSpacePackage.EQUALITY_HELPER__IGNORED_ATTRIBUTES);
		}
		return ignoredAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getIdentityTypes() {
		if (identityTypes == null) {
			identityTypes = new EObjectResolvingEList<EClass>(EClass.class, this, StateSpacePackage.EQUALITY_HELPER__IDENTITY_TYPES);
		}
		return identityTypes;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateSpacePackage.EQUALITY_HELPER__CHECK_LINK_ORDER:
				return isCheckLinkOrder();
			case StateSpacePackage.EQUALITY_HELPER__IGNORED_ATTRIBUTES:
				return getIgnoredAttributes();
			case StateSpacePackage.EQUALITY_HELPER__IDENTITY_TYPES:
				return getIdentityTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateSpacePackage.EQUALITY_HELPER__CHECK_LINK_ORDER:
				return checkLinkOrder != CHECK_LINK_ORDER_EDEFAULT;
			case StateSpacePackage.EQUALITY_HELPER__IGNORED_ATTRIBUTES:
				return ignoredAttributes != null && !ignoredAttributes.isEmpty();
			case StateSpacePackage.EQUALITY_HELPER__IDENTITY_TYPES:
				return identityTypes != null && !identityTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checkLinkOrder: ");
		result.append(checkLinkOrder);
		result.append(')');
		return result.toString();
	}

}

/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl;

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetParameterImpl#getChildTargetParameter <em>Child Target Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetParameterImpl extends ParameterImpl implements TargetParameter {
	/**
	 * The cached value of the '{@link #getChildTargetParameter() <em>Child Target Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildTargetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetParameter> childTargetParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmigrationtracePackage.Literals.TARGET_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetParameter> getChildTargetParameter() {
		if (childTargetParameter == null) {
			childTargetParameter = new EObjectContainmentEList<TargetParameter>(TargetParameter.class, this, WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER);
		}
		return childTargetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER:
				return ((InternalEList<?>)getChildTargetParameter()).basicRemove(otherEnd, msgs);
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
			case WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER:
				return getChildTargetParameter();
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
			case WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER:
				getChildTargetParameter().clear();
				getChildTargetParameter().addAll((Collection<? extends TargetParameter>)newValue);
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
			case WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER:
				getChildTargetParameter().clear();
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
			case WsmigrationtracePackage.TARGET_PARAMETER__CHILD_TARGET_PARAMETER:
				return childTargetParameter != null && !childTargetParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetParameterImpl

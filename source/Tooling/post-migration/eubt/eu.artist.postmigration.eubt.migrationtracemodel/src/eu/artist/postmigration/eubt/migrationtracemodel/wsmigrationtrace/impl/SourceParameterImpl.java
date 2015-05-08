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

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl#getTargetParameter <em>Target Parameter</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceParameterImpl#getChildSourceParameter <em>Child Source Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceParameterImpl extends ParameterImpl implements SourceParameter {
	/**
	 * The cached value of the '{@link #getTargetParameter() <em>Target Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetParameter> targetParameter;

	/**
	 * The cached value of the '{@link #getChildSourceParameter() <em>Child Source Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceParameter> childSourceParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmigrationtracePackage.Literals.SOURCE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetParameter> getTargetParameter() {
		if (targetParameter == null) {
			targetParameter = new EObjectResolvingEList<TargetParameter>(TargetParameter.class, this, WsmigrationtracePackage.SOURCE_PARAMETER__TARGET_PARAMETER);
		}
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceParameter> getChildSourceParameter() {
		if (childSourceParameter == null) {
			childSourceParameter = new EObjectContainmentEList<SourceParameter>(SourceParameter.class, this, WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER);
		}
		return childSourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER:
				return ((InternalEList<?>)getChildSourceParameter()).basicRemove(otherEnd, msgs);
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
			case WsmigrationtracePackage.SOURCE_PARAMETER__TARGET_PARAMETER:
				return getTargetParameter();
			case WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER:
				return getChildSourceParameter();
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
			case WsmigrationtracePackage.SOURCE_PARAMETER__TARGET_PARAMETER:
				getTargetParameter().clear();
				getTargetParameter().addAll((Collection<? extends TargetParameter>)newValue);
				return;
			case WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER:
				getChildSourceParameter().clear();
				getChildSourceParameter().addAll((Collection<? extends SourceParameter>)newValue);
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
			case WsmigrationtracePackage.SOURCE_PARAMETER__TARGET_PARAMETER:
				getTargetParameter().clear();
				return;
			case WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER:
				getChildSourceParameter().clear();
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
			case WsmigrationtracePackage.SOURCE_PARAMETER__TARGET_PARAMETER:
				return targetParameter != null && !targetParameter.isEmpty();
			case WsmigrationtracePackage.SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER:
				return childSourceParameter != null && !childSourceParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceParameterImpl

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

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
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
 * An implementation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.TargetElementImpl#getChildTargetElement <em>Child Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementImpl extends ElementImpl implements TargetElement {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetParameter> parameters;

	/**
	 * The cached value of the '{@link #getChildTargetElement() <em>Child Target Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> childTargetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmigrationtracePackage.Literals.TARGET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TargetParameter>(TargetParameter.class, this, WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getChildTargetElement() {
		if (childTargetElement == null) {
			childTargetElement = new EObjectContainmentEList<TargetElement>(TargetElement.class, this, WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT);
		}
		return childTargetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT:
				return ((InternalEList<?>)getChildTargetElement()).basicRemove(otherEnd, msgs);
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
			case WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS:
				return getParameters();
			case WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT:
				return getChildTargetElement();
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
			case WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TargetParameter>)newValue);
				return;
			case WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT:
				getChildTargetElement().clear();
				getChildTargetElement().addAll((Collection<? extends TargetElement>)newValue);
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
			case WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS:
				getParameters().clear();
				return;
			case WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT:
				getChildTargetElement().clear();
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
			case WsmigrationtracePackage.TARGET_ELEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WsmigrationtracePackage.TARGET_ELEMENT__CHILD_TARGET_ELEMENT:
				return childTargetElement != null && !childTargetElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetElementImpl

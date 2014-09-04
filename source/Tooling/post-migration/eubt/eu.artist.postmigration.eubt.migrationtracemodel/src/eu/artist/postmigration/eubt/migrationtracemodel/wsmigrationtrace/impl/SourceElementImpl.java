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

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
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
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.impl.SourceElementImpl#getChildSourceElement <em>Child Source Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends ElementImpl implements SourceElement {
	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> targetElement;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceParameter> parameters;

	/**
	 * The cached value of the '{@link #getChildSourceElement() <em>Child Source Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> childSourceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmigrationtracePackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getTargetElement() {
		if (targetElement == null) {
			targetElement = new EObjectResolvingEList<TargetElement>(TargetElement.class, this, WsmigrationtracePackage.SOURCE_ELEMENT__TARGET_ELEMENT);
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<SourceParameter>(SourceParameter.class, this, WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getChildSourceElement() {
		if (childSourceElement == null) {
			childSourceElement = new EObjectContainmentEList<SourceElement>(SourceElement.class, this, WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT);
		}
		return childSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT:
				return ((InternalEList<?>)getChildSourceElement()).basicRemove(otherEnd, msgs);
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
			case WsmigrationtracePackage.SOURCE_ELEMENT__TARGET_ELEMENT:
				return getTargetElement();
			case WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS:
				return getParameters();
			case WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT:
				return getChildSourceElement();
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
			case WsmigrationtracePackage.SOURCE_ELEMENT__TARGET_ELEMENT:
				getTargetElement().clear();
				getTargetElement().addAll((Collection<? extends TargetElement>)newValue);
				return;
			case WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SourceParameter>)newValue);
				return;
			case WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT:
				getChildSourceElement().clear();
				getChildSourceElement().addAll((Collection<? extends SourceElement>)newValue);
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
			case WsmigrationtracePackage.SOURCE_ELEMENT__TARGET_ELEMENT:
				getTargetElement().clear();
				return;
			case WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS:
				getParameters().clear();
				return;
			case WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT:
				getChildSourceElement().clear();
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
			case WsmigrationtracePackage.SOURCE_ELEMENT__TARGET_ELEMENT:
				return targetElement != null && !targetElement.isEmpty();
			case WsmigrationtracePackage.SOURCE_ELEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WsmigrationtracePackage.SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT:
				return childSourceElement != null && !childSourceElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceElementImpl

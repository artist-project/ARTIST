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

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WsmigrationtraceFactoryImpl extends EFactoryImpl implements WsmigrationtraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WsmigrationtraceFactory init() {
		try {
			WsmigrationtraceFactory theWsmigrationtraceFactory = (WsmigrationtraceFactory)EPackage.Registry.INSTANCE.getEFactory(WsmigrationtracePackage.eNS_URI);
			if (theWsmigrationtraceFactory != null) {
				return theWsmigrationtraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WsmigrationtraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmigrationtraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WsmigrationtracePackage.TRACE: return createTrace();
			case WsmigrationtracePackage.SOURCE_ELEMENT: return createSourceElement();
			case WsmigrationtracePackage.TARGET_ELEMENT: return createTargetElement();
			case WsmigrationtracePackage.SOURCE_PARAMETER: return createSourceParameter();
			case WsmigrationtracePackage.TARGET_PARAMETER: return createTargetParameter();
			case WsmigrationtracePackage.NAMESPACE: return createNamespace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement createSourceElement() {
		SourceElementImpl sourceElement = new SourceElementImpl();
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement createTargetElement() {
		TargetElementImpl targetElement = new TargetElementImpl();
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceParameter createSourceParameter() {
		SourceParameterImpl sourceParameter = new SourceParameterImpl();
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetParameter createTargetParameter() {
		TargetParameterImpl targetParameter = new TargetParameterImpl();
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmigrationtracePackage getWsmigrationtracePackage() {
		return (WsmigrationtracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WsmigrationtracePackage getPackage() {
		return WsmigrationtracePackage.eINSTANCE;
	}

} //WsmigrationtraceFactoryImpl

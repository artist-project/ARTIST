/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.henshin.wrap.WLink;
import org.eclipse.emf.henshin.wrap.WMember;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WSynchronizer;
import org.eclipse.emf.henshin.wrap.WValue;
import org.eclipse.emf.henshin.wrap.WrapFactory;
import org.eclipse.emf.henshin.wrap.WrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrapPackageImpl extends EPackageImpl implements WrapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wSynchronizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.henshin.wrap.WrapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WrapPackageImpl() {
		super(eNS_URI, WrapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WrapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WrapPackage init() {
		if (isInited) return (WrapPackage)EPackage.Registry.INSTANCE.getEPackage(WrapPackage.eNS_URI);

		// Obtain or create and register package
		WrapPackageImpl theWrapPackage = (WrapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WrapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WrapPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWrapPackage.createPackageContents();

		// Initialize created meta-data
		theWrapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWrapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WrapPackage.eNS_URI, theWrapPackage);
		return theWrapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSynchronizer() {
		return wSynchronizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSynchronizer_Synchronize() {
		return (EAttribute)wSynchronizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWObject() {
		return wObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWObject_EObject() {
		return (EReference)wObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWObject_EClass() {
		return (EReference)wObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWObject_WMembers() {
		return (EReference)wObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMember() {
		return wMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMember_EStructuralFeature() {
		return (EReference)wMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWLink() {
		return wLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWLink_WTarget() {
		return (EReference)wLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWValue() {
		return wValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWValue_EValue() {
		return (EAttribute)wValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapFactory getWrapFactory() {
		return (WrapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wSynchronizerEClass = createEClass(WSYNCHRONIZER);
		createEAttribute(wSynchronizerEClass, WSYNCHRONIZER__SYNCHRONIZE);

		wObjectEClass = createEClass(WOBJECT);
		createEReference(wObjectEClass, WOBJECT__EOBJECT);
		createEReference(wObjectEClass, WOBJECT__ECLASS);
		createEReference(wObjectEClass, WOBJECT__WMEMBERS);

		wMemberEClass = createEClass(WMEMBER);
		createEReference(wMemberEClass, WMEMBER__ESTRUCTURAL_FEATURE);

		wLinkEClass = createEClass(WLINK);
		createEReference(wLinkEClass, WLINK__WTARGET);

		wValueEClass = createEClass(WVALUE);
		createEAttribute(wValueEClass, WVALUE__EVALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wObjectEClass.getESuperTypes().add(this.getWSynchronizer());
		wMemberEClass.getESuperTypes().add(this.getWSynchronizer());
		wLinkEClass.getESuperTypes().add(this.getWMember());
		wValueEClass.getESuperTypes().add(this.getWMember());

		// Initialize classes and features; add operations and parameters
		initEClass(wSynchronizerEClass, WSynchronizer.class, "WSynchronizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSynchronizer_Synchronize(), ecorePackage.getEBoolean(), "synchronize", "true", 0, 1, WSynchronizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wObjectEClass, WObject.class, "WObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWObject_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, WObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWObject_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, WObject.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWObject_WMembers(), this.getWMember(), null, "wMembers", null, 0, -1, WObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wMemberEClass, WMember.class, "WMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMember_EStructuralFeature(), ecorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, WMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wMemberEClass, ecorePackage.getEJavaObject(), "getEValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wLinkEClass, WLink.class, "WLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWLink_WTarget(), this.getWObject(), null, "wTarget", null, 0, 1, WLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wValueEClass, WValue.class, "WValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWValue_EValue(), ecorePackage.getEJavaObject(), "eValue", null, 0, 1, WValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WrapPackageImpl

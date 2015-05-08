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

import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Element;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Namespace;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Parameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.Trace;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtraceFactory;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WsmigrationtracePackageImpl extends EPackageImpl implements WsmigrationtracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

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
	 * @see eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.WsmigrationtracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WsmigrationtracePackageImpl() {
		super(eNS_URI, WsmigrationtraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WsmigrationtracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WsmigrationtracePackage init() {
		if (isInited) return (WsmigrationtracePackage)EPackage.Registry.INSTANCE.getEPackage(WsmigrationtracePackage.eNS_URI);

		// Obtain or create and register package
		WsmigrationtracePackageImpl theWsmigrationtracePackage = (WsmigrationtracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WsmigrationtracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WsmigrationtracePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWsmigrationtracePackage.createPackageContents();

		// Initialize created meta-data
		theWsmigrationtracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWsmigrationtracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WsmigrationtracePackage.eNS_URI, theWsmigrationtracePackage);
		return theWsmigrationtracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Elements() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Namespaces() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ElementName() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ElementNamespace() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		return sourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_TargetElement() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_Parameters() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElement_ChildSourceElement() {
		return (EReference)sourceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElement() {
		return targetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_Parameters() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_ChildTargetElement() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterNamespace() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceParameter() {
		return sourceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceParameter_TargetParameter() {
		return (EReference)sourceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceParameter_ChildSourceParameter() {
		return (EReference)sourceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetParameter() {
		return targetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetParameter_ChildTargetParameter() {
		return (EReference)targetParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_NamespaceURI() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_NamespacePrefix() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmigrationtraceFactory getWsmigrationtraceFactory() {
		return (WsmigrationtraceFactory)getEFactoryInstance();
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
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__ELEMENTS);
		createEReference(traceEClass, TRACE__NAMESPACES);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ELEMENT_NAME);
		createEReference(elementEClass, ELEMENT__ELEMENT_NAMESPACE);

		sourceElementEClass = createEClass(SOURCE_ELEMENT);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__TARGET_ELEMENT);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__PARAMETERS);
		createEReference(sourceElementEClass, SOURCE_ELEMENT__CHILD_SOURCE_ELEMENT);

		targetElementEClass = createEClass(TARGET_ELEMENT);
		createEReference(targetElementEClass, TARGET_ELEMENT__PARAMETERS);
		createEReference(targetElementEClass, TARGET_ELEMENT__CHILD_TARGET_ELEMENT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_TYPE);
		createEReference(parameterEClass, PARAMETER__PARAMETER_NAMESPACE);

		sourceParameterEClass = createEClass(SOURCE_PARAMETER);
		createEReference(sourceParameterEClass, SOURCE_PARAMETER__TARGET_PARAMETER);
		createEReference(sourceParameterEClass, SOURCE_PARAMETER__CHILD_SOURCE_PARAMETER);

		targetParameterEClass = createEClass(TARGET_PARAMETER);
		createEReference(targetParameterEClass, TARGET_PARAMETER__CHILD_TARGET_PARAMETER);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__NAMESPACE_URI);
		createEAttribute(namespaceEClass, NAMESPACE__NAMESPACE_PREFIX);
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
		sourceElementEClass.getESuperTypes().add(this.getElement());
		targetElementEClass.getESuperTypes().add(this.getElement());
		sourceParameterEClass.getESuperTypes().add(this.getParameter());
		targetParameterEClass.getESuperTypes().add(this.getParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Elements(), this.getElement(), null, "elements", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ElementNamespace(), this.getNamespace(), null, "elementNamespace", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceElementEClass, SourceElement.class, "SourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceElement_TargetElement(), this.getTargetElement(), null, "targetElement", null, 0, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceElement_Parameters(), this.getSourceParameter(), null, "parameters", null, 0, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceElement_ChildSourceElement(), this.getSourceElement(), null, "childSourceElement", null, 0, -1, SourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetElementEClass, TargetElement.class, "TargetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetElement_Parameters(), this.getTargetParameter(), null, "parameters", null, 0, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetElement_ChildTargetElement(), this.getTargetElement(), null, "childTargetElement", null, 0, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ParameterNamespace(), this.getNamespace(), null, "parameterNamespace", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceParameterEClass, SourceParameter.class, "SourceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceParameter_TargetParameter(), this.getTargetParameter(), null, "targetParameter", null, 0, -1, SourceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceParameter_ChildSourceParameter(), this.getSourceParameter(), null, "childSourceParameter", null, 0, -1, SourceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetParameterEClass, TargetParameter.class, "TargetParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetParameter_ChildTargetParameter(), this.getTargetParameter(), null, "childTargetParameter", null, 0, -1, TargetParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_NamespaceURI(), ecorePackage.getEString(), "namespaceURI", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_NamespacePrefix(), ecorePackage.getEString(), "namespacePrefix", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WsmigrationtracePackageImpl

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
import eu.artist.migration.mut.slicing.sim.ModelType;
import eu.artist.migration.mut.slicing.sim.NamedElement;
import eu.artist.migration.mut.slicing.sim.ReferencedElement;
import eu.artist.migration.mut.slicing.sim.SimFactory;
import eu.artist.migration.mut.slicing.sim.SimPackage;
import eu.artist.migration.mut.slicing.sim.SlicingConfiguration;
import eu.artist.migration.mut.slicing.sim.SlicingCriterion;
import eu.artist.migration.mut.slicing.sim.SlicingIntent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimPackageImpl extends EPackageImpl implements SimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slicingIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slicingCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slicingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containmentHierarchyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containedElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referencedElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generalizationHierarchyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeEEnum = null;

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
	 * @see eu.artist.migration.mut.slicing.sim.SimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimPackageImpl() {
		super(eNS_URI, SimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimPackage init() {
		if (isInited) return (SimPackage)EPackage.Registry.INSTANCE.getEPackage(SimPackage.eNS_URI);

		// Obtain or create and register package
		SimPackageImpl theSimPackage = (SimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimPackage.createPackageContents();

		// Initialize created meta-data
		theSimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimPackage.eNS_URI, theSimPackage);
		return theSimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlicingIntent() {
		return slicingIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingIntent_Description() {
		return (EAttribute)slicingIntentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingIntent_Inject() {
		return (EAttribute)slicingIntentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingIntent_Extract() {
		return (EAttribute)slicingIntentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlicingIntent_Criteria() {
		return (EReference)slicingIntentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlicingIntent_Configuration() {
		return (EReference)slicingIntentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlicingCriterion() {
		return slicingCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlicingCriterion_Intent() {
		return (EReference)slicingCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingCriterion_Inject() {
		return (EAttribute)slicingCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlicingCriterion_Element() {
		return (EReference)slicingCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlicingConfiguration() {
		return slicingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlicingConfiguration_Intent() {
		return (EReference)slicingConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingConfiguration_ContainmentHierarchy() {
		return (EAttribute)slicingConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingConfiguration_ContainedElement() {
		return (EAttribute)slicingConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingConfiguration_GeneralizationHierarchy() {
		return (EAttribute)slicingConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingConfiguration_ReferencedElement() {
		return (EAttribute)slicingConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainmentHierarchy() {
		return containmentHierarchyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainedElement() {
		return containedElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferencedElement() {
		return referencedElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneralizationHierarchy() {
		return generalizationHierarchyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelType() {
		return modelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFactory getSimFactory() {
		return (SimFactory)getEFactoryInstance();
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
		slicingIntentEClass = createEClass(SLICING_INTENT);
		createEAttribute(slicingIntentEClass, SLICING_INTENT__DESCRIPTION);
		createEAttribute(slicingIntentEClass, SLICING_INTENT__INJECT);
		createEAttribute(slicingIntentEClass, SLICING_INTENT__EXTRACT);
		createEReference(slicingIntentEClass, SLICING_INTENT__CRITERIA);
		createEReference(slicingIntentEClass, SLICING_INTENT__CONFIGURATION);

		slicingCriterionEClass = createEClass(SLICING_CRITERION);
		createEReference(slicingCriterionEClass, SLICING_CRITERION__INTENT);
		createEAttribute(slicingCriterionEClass, SLICING_CRITERION__INJECT);
		createEReference(slicingCriterionEClass, SLICING_CRITERION__ELEMENT);

		slicingConfigurationEClass = createEClass(SLICING_CONFIGURATION);
		createEReference(slicingConfigurationEClass, SLICING_CONFIGURATION__INTENT);
		createEAttribute(slicingConfigurationEClass, SLICING_CONFIGURATION__CONTAINMENT_HIERARCHY);
		createEAttribute(slicingConfigurationEClass, SLICING_CONFIGURATION__CONTAINED_ELEMENT);
		createEAttribute(slicingConfigurationEClass, SLICING_CONFIGURATION__GENERALIZATION_HIERARCHY);
		createEAttribute(slicingConfigurationEClass, SLICING_CONFIGURATION__REFERENCED_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		containmentHierarchyEEnum = createEEnum(CONTAINMENT_HIERARCHY);
		containedElementEEnum = createEEnum(CONTAINED_ELEMENT);
		referencedElementEEnum = createEEnum(REFERENCED_ELEMENT);
		generalizationHierarchyEEnum = createEEnum(GENERALIZATION_HIERARCHY);
		modelTypeEEnum = createEEnum(MODEL_TYPE);
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
		slicingIntentEClass.getESuperTypes().add(this.getNamedElement());
		slicingCriterionEClass.getESuperTypes().add(this.getNamedElement());
		slicingConfigurationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(slicingIntentEClass, SlicingIntent.class, "SlicingIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlicingIntent_Description(), ecorePackage.getEString(), "description", null, 0, 1, SlicingIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingIntent_Inject(), this.getModelType(), "inject", null, 1, 1, SlicingIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingIntent_Extract(), this.getModelType(), "extract", null, 1, 1, SlicingIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlicingIntent_Criteria(), this.getSlicingCriterion(), this.getSlicingCriterion_Intent(), "criteria", null, 1, -1, SlicingIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlicingIntent_Configuration(), this.getSlicingConfiguration(), this.getSlicingConfiguration_Intent(), "configuration", null, 0, 1, SlicingIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slicingCriterionEClass, SlicingCriterion.class, "SlicingCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlicingCriterion_Intent(), this.getSlicingIntent(), this.getSlicingIntent_Criteria(), "intent", null, 1, 1, SlicingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingCriterion_Inject(), this.getModelType(), "inject", null, 1, -1, SlicingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlicingCriterion_Element(), ecorePackage.getEObject(), null, "element", null, 1, -1, SlicingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slicingConfigurationEClass, SlicingConfiguration.class, "SlicingConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlicingConfiguration_Intent(), this.getSlicingIntent(), this.getSlicingIntent_Configuration(), "intent", null, 1, 1, SlicingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingConfiguration_ContainmentHierarchy(), this.getContainmentHierarchy(), "containmentHierarchy", null, 0, 1, SlicingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingConfiguration_ContainedElement(), this.getContainedElement(), "containedElement", null, 0, 1, SlicingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingConfiguration_GeneralizationHierarchy(), this.getGeneralizationHierarchy(), "generalizationHierarchy", null, 0, 1, SlicingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlicingConfiguration_ReferencedElement(), this.getReferencedElement(), "referencedElement", null, 0, 1, SlicingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(containmentHierarchyEEnum, ContainmentHierarchy.class, "ContainmentHierarchy");
		addEEnumLiteral(containmentHierarchyEEnum, ContainmentHierarchy.CUSTOM);
		addEEnumLiteral(containmentHierarchyEEnum, ContainmentHierarchy.NEAREST);
		addEEnumLiteral(containmentHierarchyEEnum, ContainmentHierarchy.COMPLETE);

		initEEnum(containedElementEEnum, ContainedElement.class, "ContainedElement");
		addEEnumLiteral(containedElementEEnum, ContainedElement.CUSTOM);
		addEEnumLiteral(containedElementEEnum, ContainedElement.ALL);
		addEEnumLiteral(containedElementEEnum, ContainedElement.ALL_FEATURES);
		addEEnumLiteral(containedElementEEnum, ContainedElement.ALL_BEHAVIORAL_FEATURES);
		addEEnumLiteral(containedElementEEnum, ContainedElement.ALL_STRUCTURAL_FEATURES);

		initEEnum(referencedElementEEnum, ReferencedElement.class, "ReferencedElement");
		addEEnumLiteral(referencedElementEEnum, ReferencedElement.CUSTOM);
		addEEnumLiteral(referencedElementEEnum, ReferencedElement.PACKAGE_SCOPED);
		addEEnumLiteral(referencedElementEEnum, ReferencedElement.MODEL_SCOPED);
		addEEnumLiteral(referencedElementEEnum, ReferencedElement.ALL);

		initEEnum(generalizationHierarchyEEnum, GeneralizationHierarchy.class, "GeneralizationHierarchy");
		addEEnumLiteral(generalizationHierarchyEEnum, GeneralizationHierarchy.CUSTOM);
		addEEnumLiteral(generalizationHierarchyEEnum, GeneralizationHierarchy.PACKAGE_SCOPED);
		addEEnumLiteral(generalizationHierarchyEEnum, GeneralizationHierarchy.MODEL_SCOPED);
		addEEnumLiteral(generalizationHierarchyEEnum, GeneralizationHierarchy.ALL);
		addEEnumLiteral(generalizationHierarchyEEnum, GeneralizationHierarchy.PUSH_DOWN);

		initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
		addEEnumLiteral(modelTypeEEnum, ModelType.ANNOTATION);
		addEEnumLiteral(modelTypeEEnum, ModelType.OBJECT_STRUCTURE);
		addEEnumLiteral(modelTypeEEnum, ModelType.CLASS_STRUCTURE);
		addEEnumLiteral(modelTypeEEnum, ModelType.INTRA_CLASS_BEHAVIOR);
		addEEnumLiteral(modelTypeEEnum, ModelType.INTER_CLASS_BEHAVIOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (slicingIntentEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (slicingCriterionEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (slicingConfigurationEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

} //SimPackageImpl

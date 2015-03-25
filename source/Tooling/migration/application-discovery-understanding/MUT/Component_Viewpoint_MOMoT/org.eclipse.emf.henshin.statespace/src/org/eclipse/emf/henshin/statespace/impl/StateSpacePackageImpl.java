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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.emf.henshin.statespace.Storage;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * <!-- begin-user-doc -->
 * Default implementation of {@link StateSpacePackage}.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSpacePackageImpl extends EPackageImpl implements StateSpacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectIntegerMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matchEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eGraphEDataType = null;

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
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateSpacePackageImpl() {
		super(eNS_URI, StateSpaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StateSpacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateSpacePackage init() {
		if (isInited) return (StateSpacePackage)EPackage.Registry.INSTANCE.getEPackage(StateSpacePackage.eNS_URI);

		// Obtain or create and register package
		StateSpacePackageImpl theStateSpacePackage = (StateSpacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateSpacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateSpacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HenshinPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStateSpacePackage.createPackageContents();

		// Initialize created meta-data
		theStateSpacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateSpacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateSpacePackage.eNS_URI, theStateSpacePackage);
		return theStateSpacePackage;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSpace() {
		return stateSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_States() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_InitialStates() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_OpenStates() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_StateCount() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_TransitionCount() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_EqualityHelper() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_LayoutZoomLevel() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_LayoutStateRepulsion() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_LayoutTransitionAttraction() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_LayoutHideLabels() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_LayoutHideIndizes() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_MaxStateDistance() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_Properties() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(13);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateSpace_AllParameterKeys() {
		return (EAttribute)stateSpaceEClass.getEStructuralFeatures().get(14);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSpace_Rules() {
		return (EReference)stateSpaceEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Index() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Incoming() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Outgoing() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Model() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Resource() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_EGraph() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ObjectHashCodes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ObjectKeysMap() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ObjectKeys() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ObjectCount() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateSpace() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Location() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Open() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Goal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Pruned() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_HashCode() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_DerivedFrom() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ObjectCount() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ObjectKeys() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Rule() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Match() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_ParameterCount() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_ParameterKeys() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityHelper() {
		return equalityHelperEClass;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualityHelper_CheckLinkOrder() {
		return (EAttribute)equalityHelperEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityHelper_IgnoredAttributes() {
		return (EReference)equalityHelperEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityHelper_IdentityTypes() {
		return (EReference)equalityHelperEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Data() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectIntegerMapEntry() {
		return eObjectIntegerMapEntryEClass;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectIntegerMapEntry_Key() {
		return (EReference)eObjectIntegerMapEntryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEObjectIntegerMapEntry_Value() {
		return (EAttribute)eObjectIntegerMapEntryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerArray() {
		return integerArrayEDataType;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatch() {
		return matchEDataType;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEGraph() {
		return eGraphEDataType;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpaceFactory getStateSpaceFactory() {
		return (StateSpaceFactory)getEFactoryInstance();
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
		stateSpaceEClass = createEClass(STATE_SPACE);
		createEReference(stateSpaceEClass, STATE_SPACE__RULES);
		createEReference(stateSpaceEClass, STATE_SPACE__STATES);
		createEReference(stateSpaceEClass, STATE_SPACE__INITIAL_STATES);
		createEReference(stateSpaceEClass, STATE_SPACE__OPEN_STATES);
		createEAttribute(stateSpaceEClass, STATE_SPACE__STATE_COUNT);
		createEAttribute(stateSpaceEClass, STATE_SPACE__TRANSITION_COUNT);
		createEReference(stateSpaceEClass, STATE_SPACE__EQUALITY_HELPER);
		createEAttribute(stateSpaceEClass, STATE_SPACE__LAYOUT_ZOOM_LEVEL);
		createEAttribute(stateSpaceEClass, STATE_SPACE__LAYOUT_STATE_REPULSION);
		createEAttribute(stateSpaceEClass, STATE_SPACE__LAYOUT_TRANSITION_ATTRACTION);
		createEAttribute(stateSpaceEClass, STATE_SPACE__LAYOUT_HIDE_LABELS);
		createEAttribute(stateSpaceEClass, STATE_SPACE__LAYOUT_HIDE_INDIZES);
		createEAttribute(stateSpaceEClass, STATE_SPACE__MAX_STATE_DISTANCE);
		createEReference(stateSpaceEClass, STATE_SPACE__PROPERTIES);
		createEAttribute(stateSpaceEClass, STATE_SPACE__ALL_PARAMETER_KEYS);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__INDEX);
		createEReference(stateEClass, STATE__INCOMING);
		createEReference(stateEClass, STATE__OUTGOING);
		createEReference(stateEClass, STATE__STATE_SPACE);
		createEAttribute(stateEClass, STATE__HASH_CODE);
		createEAttribute(stateEClass, STATE__DERIVED_FROM);
		createEAttribute(stateEClass, STATE__OPEN);
		createEAttribute(stateEClass, STATE__GOAL);
		createEAttribute(stateEClass, STATE__PRUNED);
		createEAttribute(stateEClass, STATE__LOCATION);
		createEAttribute(stateEClass, STATE__OBJECT_COUNT);
		createEAttribute(stateEClass, STATE__OBJECT_KEYS);
		createEReference(stateEClass, STATE__MODEL);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__RESOURCE);
		createEAttribute(modelEClass, MODEL__EGRAPH);
		createEReference(modelEClass, MODEL__OBJECT_HASH_CODES);
		createEReference(modelEClass, MODEL__OBJECT_KEYS_MAP);
		createEAttribute(modelEClass, MODEL__OBJECT_KEYS);
		createEAttribute(modelEClass, MODEL__OBJECT_COUNT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__RULE);
		createEAttribute(transitionEClass, TRANSITION__MATCH);
		createEAttribute(transitionEClass, TRANSITION__PARAMETER_COUNT);
		createEAttribute(transitionEClass, TRANSITION__PARAMETER_KEYS);

		equalityHelperEClass = createEClass(EQUALITY_HELPER);
		createEAttribute(equalityHelperEClass, EQUALITY_HELPER__CHECK_LINK_ORDER);
		createEReference(equalityHelperEClass, EQUALITY_HELPER__IGNORED_ATTRIBUTES);
		createEReference(equalityHelperEClass, EQUALITY_HELPER__IDENTITY_TYPES);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__DATA);

		eObjectIntegerMapEntryEClass = createEClass(EOBJECT_INTEGER_MAP_ENTRY);
		createEReference(eObjectIntegerMapEntryEClass, EOBJECT_INTEGER_MAP_ENTRY__KEY);
		createEAttribute(eObjectIntegerMapEntryEClass, EOBJECT_INTEGER_MAP_ENTRY__VALUE);

		// Create data types
		integerArrayEDataType = createEDataType(INTEGER_ARRAY);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
		matchEDataType = createEDataType(MATCH);
		eGraphEDataType = createEDataType(EGRAPH);
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

		// Obtain other dependent packages
		HenshinPackage theHenshinPackage = (HenshinPackage)EPackage.Registry.INSTANCE.getEPackage(HenshinPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateSpaceEClass.getESuperTypes().add(this.getStorage());
		stateEClass.getESuperTypes().add(this.getStorage());
		transitionEClass.getESuperTypes().add(this.getStorage());

		// Initialize classes and features; add operations and parameters
		initEClass(stateSpaceEClass, StateSpace.class, "StateSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateSpace_Rules(), theHenshinPackage.getRule(), null, "rules", null, 0, -1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpace_States(), this.getState(), this.getState_StateSpace(), "states", null, 0, -1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpace_InitialStates(), this.getState(), null, "initialStates", null, 0, -1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpace_OpenStates(), this.getState(), null, "openStates", null, 0, -1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_StateCount(), ecorePackage.getEInt(), "stateCount", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_TransitionCount(), ecorePackage.getEInt(), "transitionCount", null, 0, 1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpace_EqualityHelper(), this.getEqualityHelper(), null, "equalityHelper", null, 0, 1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_LayoutZoomLevel(), ecorePackage.getEInt(), "layoutZoomLevel", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_LayoutStateRepulsion(), ecorePackage.getEInt(), "layoutStateRepulsion", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_LayoutTransitionAttraction(), ecorePackage.getEInt(), "layoutTransitionAttraction", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_LayoutHideLabels(), ecorePackage.getEBoolean(), "layoutHideLabels", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_LayoutHideIndizes(), ecorePackage.getEBoolean(), "layoutHideIndizes", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_MaxStateDistance(), ecorePackage.getEInt(), "maxStateDistance", "-1", 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSpace_Properties(), ecorePackage.getEStringToStringMapEntry(), null, "properties", null, 0, -1, StateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateSpace_AllParameterKeys(), this.getIntegerArray(), "allParameterKeys", null, 0, 1, StateSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(stateSpaceEClass, ecorePackage.getEBoolean(), "removeState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateSpaceEClass, null, "updateEqualityHelper", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateSpaceEClass, ecorePackage.getEInt(), "incTransitionCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Index(), ecorePackage.getEInt(), "index", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_StateSpace(), this.getStateSpace(), this.getStateSpace_States(), "stateSpace", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_HashCode(), ecorePackage.getEInt(), "hashCode", "0", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_DerivedFrom(), ecorePackage.getEInt(), "derivedFrom", null, 0, 1, State.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Open(), ecorePackage.getEBoolean(), "open", "false", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Goal(), ecorePackage.getEBoolean(), "goal", "false", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Pruned(), ecorePackage.getEBoolean(), "pruned", "false", 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Location(), this.getIntegerArray(), "location", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_ObjectCount(), ecorePackage.getEInt(), "objectCount", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_ObjectKeys(), this.getIntegerArray(), "objectKeys", null, 0, 1, State.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Model(), this.getModel(), null, "model", null, 0, 1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stateEClass, ecorePackage.getEBoolean(), "isInitial", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateEClass, ecorePackage.getEBoolean(), "isTerminal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateEClass, this.getTransition(), "getOutgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHenshinPackage.getRule(), "rule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIntegerArray(), "paramIDs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Resource(), ecorePackage.getEResource(), "resource", null, 0, 1, Model.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_EGraph(), this.getEGraph(), "eGraph", null, 0, 1, Model.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ObjectHashCodes(), this.getEObjectIntegerMapEntry(), null, "objectHashCodes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ObjectKeysMap(), this.getEObjectIntegerMapEntry(), null, "objectKeysMap", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ObjectKeys(), this.getIntegerArray(), "objectKeys", null, 0, 1, Model.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ObjectCount(), ecorePackage.getEInt(), "objectCount", null, 0, 1, Model.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(modelEClass, this.getModel(), "getCopy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelEClass, ecorePackage.getEBoolean(), "updateObjectKeys", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "identityTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(modelEClass, null, "collectMissingRootObjects", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), this.getState_Outgoing(), "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), this.getState_Incoming(), "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Rule(), theHenshinPackage.getRule(), null, "rule", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Match(), ecorePackage.getEInt(), "match", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ParameterCount(), ecorePackage.getEInt(), "parameterCount", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ParameterKeys(), this.getIntegerArray(), "parameterKeys", null, 0, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transitionEClass, ecorePackage.getEString(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(equalityHelperEClass, EqualityHelper.class, "EqualityHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqualityHelper_CheckLinkOrder(), ecorePackage.getEBoolean(), "checkLinkOrder", null, 0, 1, EqualityHelper.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqualityHelper_IgnoredAttributes(), ecorePackage.getEAttribute(), null, "ignoredAttributes", null, 1, -1, EqualityHelper.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqualityHelper_IdentityTypes(), ecorePackage.getEClass(), null, "identityTypes", null, 1, -1, EqualityHelper.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(equalityHelperEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(equalityHelperEClass, ecorePackage.getEInt(), "hashCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(equalityHelperEClass, null, "setStateSpace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStateSpace(), "stateSpace", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_Data(), this.getIntegerArray(), "data", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(storageEClass, ecorePackage.getEInt(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageEClass, null, "setData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageEClass, this.getIntegerArray(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "beginIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "endIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageEClass, null, "setData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "beginIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIntegerArray(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storageEClass, null, "setData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "beginIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "endIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIntegerArray(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eObjectIntegerMapEntryEClass, Map.Entry.class, "EObjectIntegerMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectIntegerMapEntry_Key(), ecorePackage.getEObject(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEObjectIntegerMapEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(integerArrayEDataType, int[].class, "IntegerArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matchEDataType, Match.class, "Match", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eGraphEDataType, EGraph.class, "EGraph", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StateSpacePackageImpl

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

import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.statespace.*;
import org.eclipse.emf.henshin.model.Module;

/**
 * <!-- begin-user-doc -->
 * Default implementation of {@link StateSpaceFactory}.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSpaceFactoryImpl extends EFactoryImpl implements StateSpaceFactory {
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateSpaceFactory init() {
		try {
			StateSpaceFactory theStateSpaceFactory = (StateSpaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/2010/Henshin/StateSpace"); 
			if (theStateSpaceFactory != null) {
				return theStateSpaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateSpaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpaceFactoryImpl() {
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
			case StateSpacePackage.STATE_SPACE: return createStateSpace();
			case StateSpacePackage.STATE: return createState();
			case StateSpacePackage.MODEL: return createModel();
			case StateSpacePackage.TRANSITION: return createTransition();
			case StateSpacePackage.EQUALITY_HELPER: return createEqualityHelper();
			case StateSpacePackage.STORAGE: return createStorage();
			case StateSpacePackage.EOBJECT_INTEGER_MAP_ENTRY: return (EObject)createEObjectIntegerMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StateSpacePackage.INTEGER_ARRAY:
				return createIntegerArrayFromString(eDataType, initialValue);
			case StateSpacePackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
			case StateSpacePackage.MATCH:
				return createMatchFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StateSpacePackage.INTEGER_ARRAY:
				return convertIntegerArrayToString(eDataType, instanceValue);
			case StateSpacePackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
			case StateSpacePackage.MATCH:
				return convertMatchToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpace createStateSpace() {
		StateSpaceImpl stateSpace = new StateSpaceImpl();
		return stateSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StateSpace createStateSpace(Module module) {
		StateSpace stateSpace = new StateSpaceImpl(module);
		return stateSpace;
	}

	/**
	 * Returns a new state space manager.
	 * @param numThreads Number of threads to be used for exploration.
	 * @param stateSpace The state space to be managed.
	 * @return A new state space manager instance.
	 * @generated NOT
	 */
	@SuppressWarnings("all")
	public StateSpaceManager createStateSpaceManager(StateSpace stateSpace, int numThreads) {
		if (numThreads>1 && !StateSpaceManager.DEBUG_ENFORCE_DETERMINISM) {
			return new ParallelStateSpaceManager(stateSpace, numThreads);
		} else {
			return new BasicStateSpaceManager(stateSpace);
		}
	}

	/**
	 * Returns a new state space manager.  Uses multi-threading if more than one processor is available.
	 * @param stateSpace The state space to be managed.
	 * @return A new state space manager instance.
	 * @generated NOT
	 */
	public StateSpaceManager createStateSpaceManager(StateSpace stateSpace) {
		return createStateSpaceManager(stateSpace, Runtime.getRuntime().availableProcessors());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * Create a model for a given resource.
	 */
	public Model createModel(final Resource resource) {
		return new ModelImpl(resource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityHelper createEqualityHelper() {
		EqualityHelperImpl equalityHelper = new EqualityHelperImpl();
		return equalityHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EObject, Integer> createEObjectIntegerMapEntry() {
		EObjectIntegerMapEntryImpl eObjectIntegerMapEntry = new EObjectIntegerMapEntryImpl();
		return eObjectIntegerMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int[] createIntegerArrayFromString(EDataType eDataType, String initialValue) {		
		StringTokenizer tokenizer = new StringTokenizer(initialValue, ",");
		ArrayList<Integer> values = new ArrayList<Integer>();
		while (tokenizer.hasMoreTokens()) {
			values.add(Integer.valueOf(tokenizer.nextToken().trim()));
		}
		int[] array = new int[values.size()];
		for (int i=0; i<array.length; i++) array[i] = values.get(i);
		return array;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertIntegerArrayToString(EDataType eDataType, Object location) {
		return convertIntegerArrayToString(eDataType, (int[]) location);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatchFromString(EDataType eDataType, String initialValue) {
		return (Match)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertIntegerArrayToString(EDataType eDataType, int[] location) {
		String result = "";
		for (int i=0; i<location.length; i++) {
			result = result + location[i];
			if (i<location.length-1) result = result + ",";
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpacePackage getStateSpacePackage() {
		return (StateSpacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateSpacePackage getPackage() {
		return StateSpacePackage.eINSTANCE;
	}

} //StateSpaceFactoryImpl

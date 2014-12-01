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

import eu.artist.migration.mut.slicing.sim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SimFactoryImpl extends EFactoryImpl implements SimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimFactory init() {
		try {
			SimFactory theSimFactory = (SimFactory)EPackage.Registry.INSTANCE.getEFactory(SimPackage.eNS_URI);
			if (theSimFactory != null) {
				return theSimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFactoryImpl() {
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
			case SimPackage.SLICING_INTENT: return createSlicingIntent();
			case SimPackage.SLICING_CRITERION: return createSlicingCriterion();
			case SimPackage.FEATURE_VALUE: return createFeatureValue();
			case SimPackage.SLICING_CONFIGURATION: return createSlicingConfiguration();
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
			case SimPackage.CONTAINMENT_HIERARCHY:
				return createContainmentHierarchyFromString(eDataType, initialValue);
			case SimPackage.CONTAINED_ELEMENT:
				return createContainedElementFromString(eDataType, initialValue);
			case SimPackage.REFERENCED_ELEMENT:
				return createReferencedElementFromString(eDataType, initialValue);
			case SimPackage.GENERALIZATION_HIERARCHY:
				return createGeneralizationHierarchyFromString(eDataType, initialValue);
			case SimPackage.MODEL_TYPE:
				return createModelTypeFromString(eDataType, initialValue);
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
			case SimPackage.CONTAINMENT_HIERARCHY:
				return convertContainmentHierarchyToString(eDataType, instanceValue);
			case SimPackage.CONTAINED_ELEMENT:
				return convertContainedElementToString(eDataType, instanceValue);
			case SimPackage.REFERENCED_ELEMENT:
				return convertReferencedElementToString(eDataType, instanceValue);
			case SimPackage.GENERALIZATION_HIERARCHY:
				return convertGeneralizationHierarchyToString(eDataType, instanceValue);
			case SimPackage.MODEL_TYPE:
				return convertModelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingIntent createSlicingIntent() {
		SlicingIntentImpl slicingIntent = new SlicingIntentImpl();
		return slicingIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingCriterion createSlicingCriterion() {
		SlicingCriterionImpl slicingCriterion = new SlicingCriterionImpl();
		return slicingCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue createFeatureValue() {
		FeatureValueImpl featureValue = new FeatureValueImpl();
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingConfiguration createSlicingConfiguration() {
		SlicingConfigurationImpl slicingConfiguration = new SlicingConfigurationImpl();
		return slicingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentHierarchy createContainmentHierarchyFromString(EDataType eDataType, String initialValue) {
		ContainmentHierarchy result = ContainmentHierarchy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainmentHierarchyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedElement createContainedElementFromString(EDataType eDataType, String initialValue) {
		ContainedElement result = ContainedElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainedElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedElement createReferencedElementFromString(EDataType eDataType, String initialValue) {
		ReferencedElement result = ReferencedElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferencedElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationHierarchy createGeneralizationHierarchyFromString(EDataType eDataType, String initialValue) {
		GeneralizationHierarchy result = GeneralizationHierarchy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneralizationHierarchyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
		ModelType result = ModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimPackage getSimPackage() {
		return (SimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimPackage getPackage() {
		return SimPackage.eINSTANCE;
	}

} //SimFactoryImpl

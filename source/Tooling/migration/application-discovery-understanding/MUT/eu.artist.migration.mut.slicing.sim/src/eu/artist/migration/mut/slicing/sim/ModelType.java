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
package eu.artist.migration.mut.slicing.sim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.mut.slicing.sim.SimPackage#getModelType()
 * @model
 * @generated
 */
public enum ModelType implements Enumerator {
	/**
	 * The '<em><b>Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION(0, "Annotation", "Annotation"),

	/**
	 * The '<em><b>Object Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_STRUCTURE(1, "ObjectStructure", "ObjectStructure"),

	/**
	 * The '<em><b>Class Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_STRUCTURE(2, "ClassStructure", "ClassStructure"),

	/**
	 * The '<em><b>Intra Class Behavior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRA_CLASS_BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	INTRA_CLASS_BEHAVIOR(3, "IntraClassBehavior", "IntraClassBehavior"),

	/**
	 * The '<em><b>Inter Class Behavior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_CLASS_BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	INTER_CLASS_BEHAVIOR(4, "InterClassBehavior", "InterClassBehavior");

	/**
	 * The '<em><b>Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Annotation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION
	 * @model name="Annotation"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_VALUE = 0;

	/**
	 * The '<em><b>Object Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Structure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_STRUCTURE
	 * @model name="ObjectStructure"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_STRUCTURE_VALUE = 1;

	/**
	 * The '<em><b>Class Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class Structure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_STRUCTURE
	 * @model name="ClassStructure"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_STRUCTURE_VALUE = 2;

	/**
	 * The '<em><b>Intra Class Behavior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intra Class Behavior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTRA_CLASS_BEHAVIOR
	 * @model name="IntraClassBehavior"
	 * @generated
	 * @ordered
	 */
	public static final int INTRA_CLASS_BEHAVIOR_VALUE = 3;

	/**
	 * The '<em><b>Inter Class Behavior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inter Class Behavior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTER_CLASS_BEHAVIOR
	 * @model name="InterClassBehavior"
	 * @generated
	 * @ordered
	 */
	public static final int INTER_CLASS_BEHAVIOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelType[] VALUES_ARRAY =
		new ModelType[] {
			ANNOTATION,
			OBJECT_STRUCTURE,
			CLASS_STRUCTURE,
			INTRA_CLASS_BEHAVIOR,
			INTER_CLASS_BEHAVIOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(int value) {
		switch (value) {
			case ANNOTATION_VALUE: return ANNOTATION;
			case OBJECT_STRUCTURE_VALUE: return OBJECT_STRUCTURE;
			case CLASS_STRUCTURE_VALUE: return CLASS_STRUCTURE;
			case INTRA_CLASS_BEHAVIOR_VALUE: return INTRA_CLASS_BEHAVIOR;
			case INTER_CLASS_BEHAVIOR_VALUE: return INTER_CLASS_BEHAVIOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModelType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModelType

/**
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 * 
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 */
package eu.artist.premigration.tft.nfrvt.resources.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provisioning Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesPackage#getProvisioningType()
 * @model
 * @generated
 */
public enum ProvisioningType implements Enumerator {
	/**
	 * The '<em><b>Paa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	PAA_S(0, "PaaS", "PaaS"),

	/**
	 * The '<em><b>Iaa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	IAA_S(1, "IaaS", "IaaS"),

	/**
	 * The '<em><b>Saa S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAA_S_VALUE
	 * @generated
	 * @ordered
	 */
	SAA_S(2, "SaaS", "SaaS"),

	/**
	 * The '<em><b>Hybrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(3, "Hybrid", "Hybrid");

	/**
	 * The '<em><b>Paa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAA_S
	 * @model name="PaaS"
	 * @generated
	 * @ordered
	 */
	public static final int PAA_S_VALUE = 0;

	/**
	 * The '<em><b>Iaa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iaa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IAA_S
	 * @model name="IaaS"
	 * @generated
	 * @ordered
	 */
	public static final int IAA_S_VALUE = 1;

	/**
	 * The '<em><b>Saa S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Saa S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAA_S
	 * @model name="SaaS"
	 * @generated
	 * @ordered
	 */
	public static final int SAA_S_VALUE = 2;

	/**
	 * The '<em><b>Hybrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hybrid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model name="Hybrid"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 3;

	/**
	 * An array of all the '<em><b>Provisioning Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvisioningType[] VALUES_ARRAY =
		new ProvisioningType[] {
			PAA_S,
			IAA_S,
			SAA_S,
			HYBRID,
		};

	/**
	 * A public read-only list of all the '<em><b>Provisioning Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvisioningType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provisioning Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvisioningType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisioningType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provisioning Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvisioningType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisioningType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provisioning Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvisioningType get(int value) {
		switch (value) {
			case PAA_S_VALUE: return PAA_S;
			case IAA_S_VALUE: return IAA_S;
			case SAA_S_VALUE: return SAA_S;
			case HYBRID_VALUE: return HYBRID;
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
	private ProvisioningType(int value, String name, String literal) {
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
	
} //ProvisioningType

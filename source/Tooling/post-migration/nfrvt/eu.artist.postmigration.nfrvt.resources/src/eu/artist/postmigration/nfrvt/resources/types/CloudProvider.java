/*******************************************************************************
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
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.nfrvt.resources.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cloud Provider</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesPackage#getCloudProvider()
 * @umlPackage
 * @generated
 */
public enum CloudProvider implements Enumerator {
	/**
	 * The '<em><b>Google App Engine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_APP_ENGINE(0, "GoogleAppEngine", "GoogleAppEngine"),

	/**
	 * The '<em><b>Microsoft Azure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_AZURE_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSOFT_AZURE(1, "MicrosoftAzure", "MicrosoftAzure"),

	/**
	 * The '<em><b>Amazon EC2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMAZON_EC2_VALUE
	 * @generated
	 * @ordered
	 */
	AMAZON_EC2(2, "AmazonEC2", "AmazonEC2");

	/**
	 * The '<em><b>Google App Engine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Google App Engine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE
	 * @umlPackage name="GoogleAppEngine"
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_APP_ENGINE_VALUE = 0;

	/**
	 * The '<em><b>Microsoft Azure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Microsoft Azure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROSOFT_AZURE
	 * @umlPackage name="MicrosoftAzure"
	 * @generated
	 * @ordered
	 */
	public static final int MICROSOFT_AZURE_VALUE = 1;

	/**
	 * The '<em><b>Amazon EC2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amazon EC2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMAZON_EC2
	 * @umlPackage name="AmazonEC2"
	 * @generated
	 * @ordered
	 */
	public static final int AMAZON_EC2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cloud Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloudProvider[] VALUES_ARRAY =
		new CloudProvider[] {
			GOOGLE_APP_ENGINE,
			MICROSOFT_AZURE,
			AMAZON_EC2,
		};

	/**
	 * A public read-only list of all the '<em><b>Cloud Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloudProvider> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cloud Provider</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudProvider get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudProvider result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Provider</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudProvider getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudProvider result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Provider</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudProvider get(int value) {
		switch (value) {
			case GOOGLE_APP_ENGINE_VALUE: return GOOGLE_APP_ENGINE;
			case MICROSOFT_AZURE_VALUE: return MICROSOFT_AZURE;
			case AMAZON_EC2_VALUE: return AMAZON_EC2;
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
	private CloudProvider(int value, String name, String literal) {
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
	
} //CloudProvider

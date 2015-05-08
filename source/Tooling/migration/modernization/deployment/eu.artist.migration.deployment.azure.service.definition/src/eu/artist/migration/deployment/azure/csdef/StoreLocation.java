/**
 */
package eu.artist.migration.deployment.azure.csdef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Store Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getStoreLocation()
 * @model extendedMetaData="name='StoreLocation'"
 * @generated
 */
public enum StoreLocation implements Enumerator {
	/**
	 * The '<em><b>Current User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_USER_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_USER(0, "CurrentUser", "CurrentUser"),

	/**
	 * The '<em><b>Local Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_MACHINE(1, "LocalMachine", "LocalMachine");

	/**
	 * The '<em><b>Current User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             To install to the users certificate stores
	 *           
	 * <!-- end-model-doc -->
	 * @see #CURRENT_USER
	 * @model name="CurrentUser"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_USER_VALUE = 0;

	/**
	 * The '<em><b>Local Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             To install to the machines certificate stores
	 *           
	 * <!-- end-model-doc -->
	 * @see #LOCAL_MACHINE
	 * @model name="LocalMachine"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_MACHINE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Store Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StoreLocation[] VALUES_ARRAY =
		new StoreLocation[] {
			CURRENT_USER,
			LOCAL_MACHINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Store Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StoreLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Store Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StoreLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Store Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StoreLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Store Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreLocation get(int value) {
		switch (value) {
			case CURRENT_USER_VALUE: return CURRENT_USER;
			case LOCAL_MACHINE_VALUE: return LOCAL_MACHINE;
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
	private StoreLocation(int value, String name, String literal) {
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
	
} //StoreLocation

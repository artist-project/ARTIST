/**
 */
package eu.artist.migration.deployment.azure.csdef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Permission Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getPermissionLevel()
 * @model extendedMetaData="name='PermissionLevel'"
 * @generated
 */
public enum PermissionLevel implements Enumerator {
	/**
	 * The '<em><b>Limited Or Elevated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITED_OR_ELEVATED_VALUE
	 * @generated
	 * @ordered
	 */
	LIMITED_OR_ELEVATED(0, "limitedOrElevated", "limitedOrElevated"),

	/**
	 * The '<em><b>Elevated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATED_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATED(1, "elevated", "elevated");

	/**
	 * The '<em><b>Limited Or Elevated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Specifies that both elevated and limited startup tasks and runtime processes can access this resource.
	 *           
	 * <!-- end-model-doc -->
	 * @see #LIMITED_OR_ELEVATED
	 * @model name="limitedOrElevated"
	 * @generated
	 * @ordered
	 */
	public static final int LIMITED_OR_ELEVATED_VALUE = 0;

	/**
	 * The '<em><b>Elevated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Specifies that only elevated startup tasks and runtime processes can access this resource.
	 *           
	 * <!-- end-model-doc -->
	 * @see #ELEVATED
	 * @model name="elevated"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Permission Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PermissionLevel[] VALUES_ARRAY =
		new PermissionLevel[] {
			LIMITED_OR_ELEVATED,
			ELEVATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Permission Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PermissionLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Permission Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PermissionLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PermissionLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PermissionLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Permission Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PermissionLevel get(int value) {
		switch (value) {
			case LIMITED_OR_ELEVATED_VALUE: return LIMITED_OR_ELEVATED;
			case ELEVATED_VALUE: return ELEVATED;
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
	private PermissionLevel(int value, String name, String literal) {
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
	
} //PermissionLevel

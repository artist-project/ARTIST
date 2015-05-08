/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Thumbprint Algorithm Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getThumbprintAlgorithmTypes()
 * @model extendedMetaData="name='ThumbprintAlgorithmTypes'"
 * @generated
 */
public enum ThumbprintAlgorithmTypes implements Enumerator {
	/**
	 * The '<em><b>Sha1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA1_VALUE
	 * @generated
	 * @ordered
	 */
	SHA1(0, "sha1", "sha1");

	/**
	 * The '<em><b>Sha1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Algorithm currently used in certmgr.msc to display thumbprint.
	 *           
	 * <!-- end-model-doc -->
	 * @see #SHA1
	 * @model name="sha1"
	 * @generated
	 * @ordered
	 */
	public static final int SHA1_VALUE = 0;

	/**
	 * An array of all the '<em><b>Thumbprint Algorithm Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThumbprintAlgorithmTypes[] VALUES_ARRAY =
		new ThumbprintAlgorithmTypes[] {
			SHA1,
		};

	/**
	 * A public read-only list of all the '<em><b>Thumbprint Algorithm Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThumbprintAlgorithmTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Thumbprint Algorithm Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThumbprintAlgorithmTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThumbprintAlgorithmTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thumbprint Algorithm Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThumbprintAlgorithmTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThumbprintAlgorithmTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thumbprint Algorithm Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThumbprintAlgorithmTypes get(int value) {
		switch (value) {
			case SHA1_VALUE: return SHA1;
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
	private ThumbprintAlgorithmTypes(int value, String name, String literal) {
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
	
} //ThumbprintAlgorithmTypes

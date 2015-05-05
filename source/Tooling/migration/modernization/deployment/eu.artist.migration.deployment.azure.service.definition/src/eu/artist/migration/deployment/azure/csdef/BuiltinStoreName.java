/**
 */
package eu.artist.migration.deployment.azure.csdef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Builtin Store Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getBuiltinStoreName()
 * @model extendedMetaData="name='BuiltinStoreName'"
 * @generated
 */
public enum BuiltinStoreName implements Enumerator {
	/**
	 * The '<em><b>My</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_VALUE
	 * @generated
	 * @ordered
	 */
	MY(0, "My", "My"),

	/**
	 * The '<em><b>Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(1, "Root", "Root"),

	/**
	 * The '<em><b>CA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CA_VALUE
	 * @generated
	 * @ordered
	 */
	CA(2, "CA", "CA"),

	/**
	 * The '<em><b>Trust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUST_VALUE
	 * @generated
	 * @ordered
	 */
	TRUST(3, "Trust", "Trust"),

	/**
	 * The '<em><b>Disallowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	DISALLOWED(4, "Disallowed", "Disallowed"),

	/**
	 * The '<em><b>Trusted People</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_PEOPLE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_PEOPLE(5, "TrustedPeople", "TrustedPeople"),

	/**
	 * The '<em><b>Trusted Publisher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSTED_PUBLISHER_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSTED_PUBLISHER(6, "TrustedPublisher", "TrustedPublisher"),

	/**
	 * The '<em><b>Auth Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_ROOT(7, "AuthRoot", "AuthRoot"),

	/**
	 * The '<em><b>Address Book</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_BOOK_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS_BOOK(8, "AddressBook", "AddressBook");

	/**
	 * The '<em><b>My</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Personal certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #MY
	 * @model name="My"
	 * @generated
	 * @ordered
	 */
	public static final int MY_VALUE = 0;

	/**
	 * The '<em><b>Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Trusted Root Certificate Authorities certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #ROOT
	 * @model name="Root"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 1;

	/**
	 * The '<em><b>CA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Intermediate Certificate Authorities certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #CA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CA_VALUE = 2;

	/**
	 * The '<em><b>Trust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Enterprise Trust List certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #TRUST
	 * @model name="Trust"
	 * @generated
	 * @ordered
	 */
	public static final int TRUST_VALUE = 3;

	/**
	 * The '<em><b>Disallowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Untrusted Certificates
	 *           
	 * <!-- end-model-doc -->
	 * @see #DISALLOWED
	 * @model name="Disallowed"
	 * @generated
	 * @ordered
	 */
	public static final int DISALLOWED_VALUE = 4;

	/**
	 * The '<em><b>Trusted People</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Trusted People certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #TRUSTED_PEOPLE
	 * @model name="TrustedPeople"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_PEOPLE_VALUE = 5;

	/**
	 * The '<em><b>Trusted Publisher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Trusted Publishers certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #TRUSTED_PUBLISHER
	 * @model name="TrustedPublisher"
	 * @generated
	 * @ordered
	 */
	public static final int TRUSTED_PUBLISHER_VALUE = 6;

	/**
	 * The '<em><b>Auth Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Third-party certificate authorities certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #AUTH_ROOT
	 * @model name="AuthRoot"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_ROOT_VALUE = 7;

	/**
	 * The '<em><b>Address Book</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Other people certificate store
	 *           
	 * <!-- end-model-doc -->
	 * @see #ADDRESS_BOOK
	 * @model name="AddressBook"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_BOOK_VALUE = 8;

	/**
	 * An array of all the '<em><b>Builtin Store Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BuiltinStoreName[] VALUES_ARRAY =
		new BuiltinStoreName[] {
			MY,
			ROOT,
			CA,
			TRUST,
			DISALLOWED,
			TRUSTED_PEOPLE,
			TRUSTED_PUBLISHER,
			AUTH_ROOT,
			ADDRESS_BOOK,
		};

	/**
	 * A public read-only list of all the '<em><b>Builtin Store Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BuiltinStoreName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Builtin Store Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltinStoreName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuiltinStoreName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Builtin Store Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltinStoreName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuiltinStoreName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Builtin Store Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltinStoreName get(int value) {
		switch (value) {
			case MY_VALUE: return MY;
			case ROOT_VALUE: return ROOT;
			case CA_VALUE: return CA;
			case TRUST_VALUE: return TRUST;
			case DISALLOWED_VALUE: return DISALLOWED;
			case TRUSTED_PEOPLE_VALUE: return TRUSTED_PEOPLE;
			case TRUSTED_PUBLISHER_VALUE: return TRUSTED_PUBLISHER;
			case AUTH_ROOT_VALUE: return AUTH_ROOT;
			case ADDRESS_BOOK_VALUE: return ADDRESS_BOOK;
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
	private BuiltinStoreName(int value, String name, String literal) {
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
	
} //BuiltinStoreName

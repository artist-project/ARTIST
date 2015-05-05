/**
 */
package deployment_provider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Virtual Instance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage#getVirtualInstanceType()
 * @model
 * @generated
 */
public enum VirtualInstanceType implements Enumerator {
	/**
	 * The '<em><b>Computed Optimized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTED_OPTIMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTED_OPTIMIZED(0, "ComputedOptimized", "ComputedOptimized"),

	/**
	 * The '<em><b>Memory Optimized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_OPTIMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_OPTIMIZED(1, "MemoryOptimized", "MemoryOptimized"),

	/**
	 * The '<em><b>General Purpose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_PURPOSE(2, "GeneralPurpose", "GeneralPurpose"),

	/**
	 * The '<em><b>Storage Optimized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_OPTIMIZED_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_OPTIMIZED(3, "StorageOptimized", "StorageOptimized");

	/**
	 * The '<em><b>Computed Optimized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computed Optimized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTED_OPTIMIZED
	 * @model name="ComputedOptimized"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTED_OPTIMIZED_VALUE = 0;

	/**
	 * The '<em><b>Memory Optimized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory Optimized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_OPTIMIZED
	 * @model name="MemoryOptimized"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_OPTIMIZED_VALUE = 1;

	/**
	 * The '<em><b>General Purpose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General Purpose</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_PURPOSE
	 * @model name="GeneralPurpose"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_PURPOSE_VALUE = 2;

	/**
	 * The '<em><b>Storage Optimized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage Optimized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE_OPTIMIZED
	 * @model name="StorageOptimized"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_OPTIMIZED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Virtual Instance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VirtualInstanceType[] VALUES_ARRAY =
		new VirtualInstanceType[] {
			COMPUTED_OPTIMIZED,
			MEMORY_OPTIMIZED,
			GENERAL_PURPOSE,
			STORAGE_OPTIMIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Virtual Instance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VirtualInstanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Virtual Instance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VirtualInstanceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VirtualInstanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Virtual Instance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VirtualInstanceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VirtualInstanceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Virtual Instance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VirtualInstanceType get(int value) {
		switch (value) {
			case COMPUTED_OPTIMIZED_VALUE: return COMPUTED_OPTIMIZED;
			case MEMORY_OPTIMIZED_VALUE: return MEMORY_OPTIMIZED;
			case GENERAL_PURPOSE_VALUE: return GENERAL_PURPOSE;
			case STORAGE_OPTIMIZED_VALUE: return STORAGE_OPTIMIZED;
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
	private VirtualInstanceType(int value, String name, String literal) {
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
	
} //VirtualInstanceType

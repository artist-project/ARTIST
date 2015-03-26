/**
 */
package deployment_provider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Topology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage#getApplicationTopology()
 * @model
 * @generated
 */
public enum ApplicationTopology implements Enumerator {
	/**
	 * The '<em><b>Single Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_INSTANCE(0, "SingleInstance", "SingleInstance"),

	/**
	 * The '<em><b>Load Balanced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCED_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_BALANCED(1, "LoadBalanced", "LoadBalanced"),

	/**
	 * The '<em><b>Multiple Instances</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_INSTANCES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_INSTANCES(2, "MultipleInstances", "MultipleInstances");

	/**
	 * The '<em><b>Single Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Instance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_INSTANCE
	 * @model name="SingleInstance"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_INSTANCE_VALUE = 0;

	/**
	 * The '<em><b>Load Balanced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Balanced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCED
	 * @model name="LoadBalanced"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BALANCED_VALUE = 1;

	/**
	 * The '<em><b>Multiple Instances</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Instances</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_INSTANCES
	 * @model name="MultipleInstances"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_INSTANCES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Application Topology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationTopology[] VALUES_ARRAY =
		new ApplicationTopology[] {
			SINGLE_INSTANCE,
			LOAD_BALANCED,
			MULTIPLE_INSTANCES,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Topology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationTopology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Topology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationTopology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationTopology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Topology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationTopology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationTopology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Topology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationTopology get(int value) {
		switch (value) {
			case SINGLE_INSTANCE_VALUE: return SINGLE_INSTANCE;
			case LOAD_BALANCED_VALUE: return LOAD_BALANCED;
			case MULTIPLE_INSTANCES_VALUE: return MULTIPLE_INSTANCES;
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
	private ApplicationTopology(int value, String name, String literal) {
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
	
} //ApplicationTopology

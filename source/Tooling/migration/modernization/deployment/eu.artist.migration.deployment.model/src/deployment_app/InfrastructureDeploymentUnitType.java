/**
 */
package deployment_app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Infrastructure Deployment Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_app.Deployment_appPackage#getInfrastructureDeploymentUnitType()
 * @model
 * @generated
 */
public enum InfrastructureDeploymentUnitType implements Enumerator {
	/**
	 * The '<em><b>OVF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVF_VALUE
	 * @generated
	 * @ordered
	 */
	OVF(4, "OVF", "OVF"),

	/**
	 * The '<em><b>VHD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VHD_VALUE
	 * @generated
	 * @ordered
	 */
	VHD(8, "VHD", "VHD");

	/**
	 * The '<em><b>OVF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVF_VALUE = 4;

	/**
	 * The '<em><b>VHD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VHD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VHD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VHD_VALUE = 8;

	/**
	 * An array of all the '<em><b>Infrastructure Deployment Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InfrastructureDeploymentUnitType[] VALUES_ARRAY =
		new InfrastructureDeploymentUnitType[] {
			OVF,
			VHD,
		};

	/**
	 * A public read-only list of all the '<em><b>Infrastructure Deployment Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InfrastructureDeploymentUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Infrastructure Deployment Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureDeploymentUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfrastructureDeploymentUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infrastructure Deployment Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureDeploymentUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfrastructureDeploymentUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Infrastructure Deployment Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureDeploymentUnitType get(int value) {
		switch (value) {
			case OVF_VALUE: return OVF;
			case VHD_VALUE: return VHD;
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
	private InfrastructureDeploymentUnitType(int value, String name, String literal) {
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
	
} //InfrastructureDeploymentUnitType

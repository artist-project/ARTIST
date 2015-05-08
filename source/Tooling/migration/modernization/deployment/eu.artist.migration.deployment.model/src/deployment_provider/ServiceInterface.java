/**
 */
package deployment_provider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Interface</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage#getServiceInterface()
 * @model
 * @generated
 */
public enum ServiceInterface implements Enumerator {
	/**
	 * The '<em><b>CLI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLI_VALUE
	 * @generated
	 * @ordered
	 */
	CLI(0, "CLI", "CLI"),

	/**
	 * The '<em><b>IDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDE_VALUE
	 * @generated
	 * @ordered
	 */
	IDE(1, "IDE", "IDE"),

	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(2, "Web", "Web"),

	/**
	 * The '<em><b>API</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_VALUE
	 * @generated
	 * @ordered
	 */
	API(3, "API", "API"),

	/**
	 * The '<em><b>FTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTP_VALUE
	 * @generated
	 * @ordered
	 */
	FTP(4, "FTP", "FTP");

	/**
	 * The '<em><b>CLI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLI_VALUE = 0;

	/**
	 * The '<em><b>IDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDE_VALUE = 1;

	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model name="Web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 2;

	/**
	 * The '<em><b>API</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>API</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #API
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int API_VALUE = 3;

	/**
	 * The '<em><b>FTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Service Interface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceInterface[] VALUES_ARRAY =
		new ServiceInterface[] {
			CLI,
			IDE,
			WEB,
			API,
			FTP,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Interface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceInterface> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Interface</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceInterface get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceInterface result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Interface</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceInterface getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceInterface result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Interface</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceInterface get(int value) {
		switch (value) {
			case CLI_VALUE: return CLI;
			case IDE_VALUE: return IDE;
			case WEB_VALUE: return WEB;
			case API_VALUE: return API;
			case FTP_VALUE: return FTP;
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
	private ServiceInterface(int value, String name, String literal) {
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
	
} //ServiceInterface

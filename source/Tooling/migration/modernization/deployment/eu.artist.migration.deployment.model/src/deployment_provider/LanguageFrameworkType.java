/**
 */
package deployment_provider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language Framework Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage#getLanguageFrameworkType()
 * @model
 * @generated
 */
public enum LanguageFrameworkType implements Enumerator {
	/**
	 * The '<em><b>Java SE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SE(0, "JavaSE", "JavaSE"),

	/**
	 * The '<em><b>Java EE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_EE_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_EE(1, "JavaEE", "JavaEE"),

	/**
	 * The '<em><b>CSharp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSHARP_VALUE
	 * @generated
	 * @ordered
	 */
	CSHARP(2, "CSharp", "CSharp"),

	/**
	 * The '<em><b>Java Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_SCRIPT(3, "JavaScript", "JavaScript"),

	/**
	 * The '<em><b>ASPNET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPNET_VALUE
	 * @generated
	 * @ordered
	 */
	ASPNET(4, "ASPNET", "ASPNET");

	/**
	 * The '<em><b>Java SE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java SE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SE
	 * @model name="JavaSE"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SE_VALUE = 0;

	/**
	 * The '<em><b>Java EE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java EE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_EE
	 * @model name="JavaEE"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_EE_VALUE = 1;

	/**
	 * The '<em><b>CSharp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSharp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSHARP
	 * @model name="CSharp"
	 * @generated
	 * @ordered
	 */
	public static final int CSHARP_VALUE = 2;

	/**
	 * The '<em><b>Java Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_SCRIPT
	 * @model name="JavaScript"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_SCRIPT_VALUE = 3;

	/**
	 * The '<em><b>ASPNET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASPNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASPNET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASPNET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Language Framework Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageFrameworkType[] VALUES_ARRAY =
		new LanguageFrameworkType[] {
			JAVA_SE,
			JAVA_EE,
			CSHARP,
			JAVA_SCRIPT,
			ASPNET,
		};

	/**
	 * A public read-only list of all the '<em><b>Language Framework Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageFrameworkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language Framework Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageFrameworkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageFrameworkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Framework Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageFrameworkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageFrameworkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Framework Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageFrameworkType get(int value) {
		switch (value) {
			case JAVA_SE_VALUE: return JAVA_SE;
			case JAVA_EE_VALUE: return JAVA_EE;
			case CSHARP_VALUE: return CSHARP;
			case JAVA_SCRIPT_VALUE: return JAVA_SCRIPT;
			case ASPNET_VALUE: return ASPNET;
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
	private LanguageFrameworkType(int value, String name, String literal) {
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
	
} //LanguageFrameworkType

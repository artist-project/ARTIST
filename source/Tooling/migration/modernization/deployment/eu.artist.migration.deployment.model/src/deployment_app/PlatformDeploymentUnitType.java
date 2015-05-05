/**
 */
package deployment_app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Platform Deployment Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_app.Deployment_appPackage#getPlatformDeploymentUnitType()
 * @model
 * @generated
 */
public enum PlatformDeploymentUnitType implements Enumerator {
	/**
	 * The '<em><b>WAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAR_VALUE
	 * @generated
	 * @ordered
	 */
	WAR(0, "WAR", "WAR"),

	/**
	 * The '<em><b>EAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAR_VALUE
	 * @generated
	 * @ordered
	 */
	EAR(1, "EAR", "EAR"),

	/**
	 * The '<em><b>ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	ZIP(3, "ZIP", "ZIP"),

	/**
	 * The '<em><b>Git</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIT_VALUE
	 * @generated
	 * @ordered
	 */
	GIT(2, "Git", "Git"),

	/**
	 * The '<em><b>SVN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVN_VALUE
	 * @generated
	 * @ordered
	 */
	SVN(5, "SVN", "SVN"),

	/**
	 * The '<em><b>Dot NET Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_NET_ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	DOT_NET_ASSEMBLY(6, "dotNET_Assembly", "dotNET_Assembly"),

	/**
	 * The '<em><b>Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	FOLDER(7, "Folder", "Folder");

	/**
	 * The '<em><b>WAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAR_VALUE = 0;

	/**
	 * The '<em><b>EAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAR_VALUE = 1;

	/**
	 * The '<em><b>ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_VALUE = 3;

	/**
	 * The '<em><b>Git</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Git</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIT
	 * @model name="Git"
	 * @generated
	 * @ordered
	 */
	public static final int GIT_VALUE = 2;

	/**
	 * The '<em><b>SVN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SVN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVN_VALUE = 5;

	/**
	 * The '<em><b>Dot NET Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot NET Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_NET_ASSEMBLY
	 * @model name="dotNET_Assembly"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_NET_ASSEMBLY_VALUE = 6;

	/**
	 * The '<em><b>Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Folder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOLDER
	 * @model name="Folder"
	 * @generated
	 * @ordered
	 */
	public static final int FOLDER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Platform Deployment Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlatformDeploymentUnitType[] VALUES_ARRAY =
		new PlatformDeploymentUnitType[] {
			WAR,
			EAR,
			ZIP,
			GIT,
			SVN,
			DOT_NET_ASSEMBLY,
			FOLDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Platform Deployment Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlatformDeploymentUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Platform Deployment Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformDeploymentUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformDeploymentUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Platform Deployment Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformDeploymentUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlatformDeploymentUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Platform Deployment Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformDeploymentUnitType get(int value) {
		switch (value) {
			case WAR_VALUE: return WAR;
			case EAR_VALUE: return EAR;
			case ZIP_VALUE: return ZIP;
			case GIT_VALUE: return GIT;
			case SVN_VALUE: return SVN;
			case DOT_NET_ASSEMBLY_VALUE: return DOT_NET_ASSEMBLY;
			case FOLDER_VALUE: return FOLDER;
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
	private PlatformDeploymentUnitType(int value, String name, String literal) {
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
	
} //PlatformDeploymentUnitType

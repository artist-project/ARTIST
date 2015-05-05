/**
 */
package deployment_provider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Framework Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage#getApplicationFrameworkType()
 * @model
 * @generated
 */
public enum ApplicationFrameworkType implements Enumerator {
	/**
	 * The '<em><b>Spring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRING_VALUE
	 * @generated
	 * @ordered
	 */
	SPRING(0, "Spring", "Spring"),

	/**
	 * The '<em><b>Rails</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAILS_VALUE
	 * @generated
	 * @ordered
	 */
	RAILS(1, "Rails", "Rails"),

	/**
	 * The '<em><b>Sinatra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINATRA_VALUE
	 * @generated
	 * @ordered
	 */
	SINATRA(2, "Sinatra", "Sinatra"),

	/**
	 * The '<em><b>Play</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	PLAY(3, "Play", "Play"),

	/**
	 * The '<em><b>Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFT(4, "Lift", "Lift"),

	/**
	 * The '<em><b>Django</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DJANGO_VALUE
	 * @generated
	 * @ordered
	 */
	DJANGO(5, "Django", "Django"),

	/**
	 * The '<em><b>Struts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUTS_VALUE
	 * @generated
	 * @ordered
	 */
	STRUTS(6, "Struts", "Struts"),

	/**
	 * The '<em><b>Word Press</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_PRESS_VALUE
	 * @generated
	 * @ordered
	 */
	WORD_PRESS(7, "WordPress", "WordPress"),

	/**
	 * The '<em><b>Umbraco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMBRACO_VALUE
	 * @generated
	 * @ordered
	 */
	UMBRACO(8, "Umbraco", "Umbraco"),

	/**
	 * The '<em><b>Dot Net Nuke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_NET_NUKE_VALUE
	 * @generated
	 * @ordered
	 */
	DOT_NET_NUKE(9, "DotNetNuke", "DotNetNuke"),

	/**
	 * The '<em><b>Drupal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUPAL_VALUE
	 * @generated
	 * @ordered
	 */
	DRUPAL(10, "Drupal", "Drupal"),

	/**
	 * The '<em><b>Cake PHP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAKE_PHP_VALUE
	 * @generated
	 * @ordered
	 */
	CAKE_PHP(12, "CakePHP", "CakePHP"),

	/**
	 * The '<em><b>Express</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESS_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESS(13, "Express", "Express");

	/**
	 * The '<em><b>Spring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRING
	 * @model name="Spring"
	 * @generated
	 * @ordered
	 */
	public static final int SPRING_VALUE = 0;

	/**
	 * The '<em><b>Rails</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rails</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAILS
	 * @model name="Rails"
	 * @generated
	 * @ordered
	 */
	public static final int RAILS_VALUE = 1;

	/**
	 * The '<em><b>Sinatra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sinatra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINATRA
	 * @model name="Sinatra"
	 * @generated
	 * @ordered
	 */
	public static final int SINATRA_VALUE = 2;

	/**
	 * The '<em><b>Play</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Play</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY
	 * @model name="Play"
	 * @generated
	 * @ordered
	 */
	public static final int PLAY_VALUE = 3;

	/**
	 * The '<em><b>Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lift</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFT
	 * @model name="Lift"
	 * @generated
	 * @ordered
	 */
	public static final int LIFT_VALUE = 4;

	/**
	 * The '<em><b>Django</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Django</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DJANGO
	 * @model name="Django"
	 * @generated
	 * @ordered
	 */
	public static final int DJANGO_VALUE = 5;

	/**
	 * The '<em><b>Struts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Struts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUTS
	 * @model name="Struts"
	 * @generated
	 * @ordered
	 */
	public static final int STRUTS_VALUE = 6;

	/**
	 * The '<em><b>Word Press</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Word Press</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORD_PRESS
	 * @model name="WordPress"
	 * @generated
	 * @ordered
	 */
	public static final int WORD_PRESS_VALUE = 7;

	/**
	 * The '<em><b>Umbraco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Umbraco</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UMBRACO
	 * @model name="Umbraco"
	 * @generated
	 * @ordered
	 */
	public static final int UMBRACO_VALUE = 8;

	/**
	 * The '<em><b>Dot Net Nuke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot Net Nuke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_NET_NUKE
	 * @model name="DotNetNuke"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_NET_NUKE_VALUE = 9;

	/**
	 * The '<em><b>Drupal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drupal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUPAL
	 * @model name="Drupal"
	 * @generated
	 * @ordered
	 */
	public static final int DRUPAL_VALUE = 10;

	/**
	 * The '<em><b>Cake PHP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cake PHP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAKE_PHP
	 * @model name="CakePHP"
	 * @generated
	 * @ordered
	 */
	public static final int CAKE_PHP_VALUE = 12;

	/**
	 * The '<em><b>Express</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Express</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPRESS
	 * @model name="Express"
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESS_VALUE = 13;

	/**
	 * An array of all the '<em><b>Application Framework Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationFrameworkType[] VALUES_ARRAY =
		new ApplicationFrameworkType[] {
			SPRING,
			RAILS,
			SINATRA,
			PLAY,
			LIFT,
			DJANGO,
			STRUTS,
			WORD_PRESS,
			UMBRACO,
			DOT_NET_NUKE,
			DRUPAL,
			CAKE_PHP,
			EXPRESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Framework Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationFrameworkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Framework Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFrameworkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationFrameworkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Framework Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFrameworkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationFrameworkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Framework Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFrameworkType get(int value) {
		switch (value) {
			case SPRING_VALUE: return SPRING;
			case RAILS_VALUE: return RAILS;
			case SINATRA_VALUE: return SINATRA;
			case PLAY_VALUE: return PLAY;
			case LIFT_VALUE: return LIFT;
			case DJANGO_VALUE: return DJANGO;
			case STRUTS_VALUE: return STRUTS;
			case WORD_PRESS_VALUE: return WORD_PRESS;
			case UMBRACO_VALUE: return UMBRACO;
			case DOT_NET_NUKE_VALUE: return DOT_NET_NUKE;
			case DRUPAL_VALUE: return DRUPAL;
			case CAKE_PHP_VALUE: return CAKE_PHP;
			case EXPRESS_VALUE: return EXPRESS;
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
	private ApplicationFrameworkType(int value, String name, String literal) {
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
	
} //ApplicationFrameworkType

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Topology Change Discovery</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTopologyChangeDiscovery()
 * @model extendedMetaData="name='TopologyChangeDiscovery'"
 * @generated
 */
public enum TopologyChangeDiscovery implements Enumerator {
	/**
	 * The '<em><b>Upgrade Domain Walk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_DOMAIN_WALK_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE_DOMAIN_WALK(0, "UpgradeDomainWalk", "UpgradeDomainWalk"),

	/**
	 * The '<em><b>Blast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAST_VALUE
	 * @generated
	 * @ordered
	 */
	BLAST(1, "Blast", "Blast");

	/**
	 * The '<em><b>Upgrade Domain Walk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             In the ordinary mode (“UpgradeDomainWalk”) the containers are made aware of the topology change after their upgrade domain has been walked.
	 *             This is also the default value of the attribute
	 *           
	 * <!-- end-model-doc -->
	 * @see #UPGRADE_DOMAIN_WALK
	 * @model name="UpgradeDomainWalk"
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_DOMAIN_WALK_VALUE = 0;

	/**
	 * The '<em><b>Blast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             In “Blast” mode all containers are immediately notified of the change at the start of an update. This is a tenant-wide setting affecting all containers.
	 *           
	 * <!-- end-model-doc -->
	 * @see #BLAST
	 * @model name="Blast"
	 * @generated
	 * @ordered
	 */
	public static final int BLAST_VALUE = 1;

	/**
	 * An array of all the '<em><b>Topology Change Discovery</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TopologyChangeDiscovery[] VALUES_ARRAY =
		new TopologyChangeDiscovery[] {
			UPGRADE_DOMAIN_WALK,
			BLAST,
		};

	/**
	 * A public read-only list of all the '<em><b>Topology Change Discovery</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TopologyChangeDiscovery> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Topology Change Discovery</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyChangeDiscovery get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopologyChangeDiscovery result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topology Change Discovery</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyChangeDiscovery getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopologyChangeDiscovery result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topology Change Discovery</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyChangeDiscovery get(int value) {
		switch (value) {
			case UPGRADE_DOMAIN_WALK_VALUE: return UPGRADE_DOMAIN_WALK;
			case BLAST_VALUE: return BLAST;
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
	private TopologyChangeDiscovery(int value, String name, String literal) {
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
	
} //TopologyChangeDiscovery

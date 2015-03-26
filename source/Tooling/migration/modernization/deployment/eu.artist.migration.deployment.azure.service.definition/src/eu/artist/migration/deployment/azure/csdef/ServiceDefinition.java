/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The description of a Utility Computing Service.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getLoadBalancerProbes <em>Load Balancer Probes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWebRole <em>Web Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWorkerRole <em>Worker Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getNetworkTrafficRules <em>Network Traffic Rules</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount <em>Upgrade Domain Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition()
 * @model extendedMetaData="name='ServiceDefinition' kind='elementOnly'"
 * @generated
 */
public interface ServiceDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Load Balancer Probes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancer Probes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer Probes</em>' containment reference.
	 * @see #setLoadBalancerProbes(LoadBalancerProbes)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_LoadBalancerProbes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LoadBalancerProbes' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBalancerProbes getLoadBalancerProbes();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getLoadBalancerProbes <em>Load Balancer Probes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Probes</em>' containment reference.
	 * @see #getLoadBalancerProbes()
	 * @generated
	 */
	void setLoadBalancerProbes(LoadBalancerProbes value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Web Role</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.WebRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Role</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_WebRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WebRole' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<WebRole> getWebRole();

	/**
	 * Returns the value of the '<em><b>Worker Role</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.WorkerRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Role</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_WorkerRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkerRole' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<WorkerRole> getWorkerRole();

	/**
	 * Returns the value of the '<em><b>Network Traffic Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Traffic Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Traffic Rules</em>' containment reference.
	 * @see #setNetworkTrafficRules(NetworkTrafficRules)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_NetworkTrafficRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkTrafficRules' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkTrafficRules getNetworkTrafficRules();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getNetworkTrafficRules <em>Network Traffic Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Traffic Rules</em>' containment reference.
	 * @see #getNetworkTrafficRules()
	 * @generated
	 */
	void setNetworkTrafficRules(NetworkTrafficRules value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the service.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"unspecified"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.SchemaVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The version of the ServiceDefinition schema used.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(SchemaVersion)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_SchemaVersion()
	 * @model default="unspecified" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='schemaVersion'"
	 * @generated
	 */
	SchemaVersion getSchemaVersion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(SchemaVersion value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(SchemaVersion)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion <em>Schema Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Version</em>' attribute is set.
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(SchemaVersion)
	 * @generated
	 */
	boolean isSetSchemaVersion();

	/**
	 * Returns the value of the '<em><b>Topology Change Discovery</b></em>' attribute.
	 * The default value is <code>"UpgradeDomainWalk"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           This feature sets the policy for when containers are notified about changes in network topology resulting from an upgrade.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Change Discovery</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @see #isSetTopologyChangeDiscovery()
	 * @see #unsetTopologyChangeDiscovery()
	 * @see #setTopologyChangeDiscovery(TopologyChangeDiscovery)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_TopologyChangeDiscovery()
	 * @model default="UpgradeDomainWalk" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='topologyChangeDiscovery'"
	 * @generated
	 */
	TopologyChangeDiscovery getTopologyChangeDiscovery();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Change Discovery</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @see #isSetTopologyChangeDiscovery()
	 * @see #unsetTopologyChangeDiscovery()
	 * @see #getTopologyChangeDiscovery()
	 * @generated
	 */
	void setTopologyChangeDiscovery(TopologyChangeDiscovery value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopologyChangeDiscovery()
	 * @see #getTopologyChangeDiscovery()
	 * @see #setTopologyChangeDiscovery(TopologyChangeDiscovery)
	 * @generated
	 */
	void unsetTopologyChangeDiscovery();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Topology Change Discovery</em>' attribute is set.
	 * @see #unsetTopologyChangeDiscovery()
	 * @see #getTopologyChangeDiscovery()
	 * @see #setTopologyChangeDiscovery(TopologyChangeDiscovery)
	 * @generated
	 */
	boolean isSetTopologyChangeDiscovery();

	/**
	 * Returns the value of the '<em><b>Upgrade Domain Count</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The number of upgrade domains for each role in this service.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upgrade Domain Count</em>' attribute.
	 * @see #isSetUpgradeDomainCount()
	 * @see #unsetUpgradeDomainCount()
	 * @see #setUpgradeDomainCount(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getServiceDefinition_UpgradeDomainCount()
	 * @model default="5" unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='upgradeDomainCount'"
	 * @generated
	 */
	int getUpgradeDomainCount();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount <em>Upgrade Domain Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upgrade Domain Count</em>' attribute.
	 * @see #isSetUpgradeDomainCount()
	 * @see #unsetUpgradeDomainCount()
	 * @see #getUpgradeDomainCount()
	 * @generated
	 */
	void setUpgradeDomainCount(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount <em>Upgrade Domain Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpgradeDomainCount()
	 * @see #getUpgradeDomainCount()
	 * @see #setUpgradeDomainCount(int)
	 * @generated
	 */
	void unsetUpgradeDomainCount();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount <em>Upgrade Domain Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upgrade Domain Count</em>' attribute is set.
	 * @see #unsetUpgradeDomainCount()
	 * @see #getUpgradeDomainCount()
	 * @see #setUpgradeDomainCount(int)
	 * @generated
	 */
	boolean isSetUpgradeDomainCount();

} // ServiceDefinition

/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getRole <em>Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getNetworkConfiguration <em>Network Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getGuestAgentSettings <em>Guest Agent Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsFamily <em>Os Family</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration()
 * @model extendedMetaData="name='ServiceConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ServiceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.RoleSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The configuration and instance settings for a role.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleSettings> getRole();

	/**
	 * Returns the value of the '<em><b>Network Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Advanced network configuration for a service.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Configuration</em>' containment reference.
	 * @see #setNetworkConfiguration(NetworkConfigurationElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_NetworkConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkConfigurationElement getNetworkConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getNetworkConfiguration <em>Network Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Configuration</em>' containment reference.
	 * @see #getNetworkConfiguration()
	 * @generated
	 */
	void setNetworkConfiguration(NetworkConfigurationElement value);

	/**
	 * Returns the value of the '<em><b>Guest Agent Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Advanced settings for guest agent.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guest Agent Settings</em>' containment reference.
	 * @see #setGuestAgentSettings(GuestAgentSettingsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_GuestAgentSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GuestAgentSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	GuestAgentSettingsElement getGuestAgentSettings();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getGuestAgentSettings <em>Guest Agent Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Agent Settings</em>' containment reference.
	 * @see #getGuestAgentSettings()
	 * @generated
	 */
	void setGuestAgentSettings(GuestAgentSettingsElement value);

	/**
	 * Returns the value of the '<em><b>Os Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The family of the guest operating system on which this service should run. If omitted, the service runs on the default guest operating system.
	 *           See Configuring Operating System Versions (http://go.microsoft.com/fwlink/?LinkId=179590) for more information.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Os Family</em>' attribute.
	 * @see #setOsFamily(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_OsFamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osFamily'"
	 * @generated
	 */
	String getOsFamily();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsFamily <em>Os Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Family</em>' attribute.
	 * @see #getOsFamily()
	 * @generated
	 */
	void setOsFamily(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The version of the guest operating system on which this service should run. If omitted, the service runs on the default guest operating system.
	 *           See Configuring Operating System Versions (http://go.microsoft.com/fwlink/?LinkId=179590) for more information.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_OsVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osVersion'"
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"unspecified"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.cscfg.SchemaVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The version of the ServiceConfiguration schema used.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(SchemaVersion)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_SchemaVersion()
	 * @model default="unspecified" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='schemaVersion'"
	 * @generated
	 */
	SchemaVersion getSchemaVersion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(SchemaVersion value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(SchemaVersion)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion <em>Schema Version</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the service must match the name of the service in the service definition.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getServiceConfiguration_ServiceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='serviceName'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // ServiceConfiguration

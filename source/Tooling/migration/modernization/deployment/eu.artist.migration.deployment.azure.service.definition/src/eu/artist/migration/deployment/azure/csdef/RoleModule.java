/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Undocumented feature. This syntax is subject to future breaking changes.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getStartup <em>Startup</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getSites <em>Sites</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule()
 * @model extendedMetaData="name='RoleModule' kind='elementOnly'"
 * @generated
 */
public interface RoleModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup</em>' containment reference.
	 * @see #setStartup(Startup)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Startup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Startup' namespace='##targetNamespace'"
	 * @generated
	 */
	Startup getStartup();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getStartup <em>Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup</em>' containment reference.
	 * @see #getStartup()
	 * @generated
	 */
	void setStartup(Startup value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' containment reference.
	 * @see #setRuntime(RuntimeForRoleModule)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Runtime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Runtime' namespace='##targetNamespace'"
	 * @generated
	 */
	RuntimeForRoleModule getRuntime();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getRuntime <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' containment reference.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(RuntimeForRoleModule value);

	/**
	 * Returns the value of the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Settings</em>' containment reference.
	 * @see #setConfigurationSettings(ConfigurationSettings)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_ConfigurationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfigurationSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationSettings getConfigurationSettings();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getConfigurationSettings <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Settings</em>' containment reference.
	 * @see #getConfigurationSettings()
	 * @generated
	 */
	void setConfigurationSettings(ConfigurationSettings value);

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference.
	 * @see #setEndpoints(Endpoints)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Endpoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Endpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoints getEndpoints();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getEndpoints <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoints</em>' containment reference.
	 * @see #getEndpoints()
	 * @generated
	 */
	void setEndpoints(Endpoints value);

	/**
	 * Returns the value of the '<em><b>Local Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Resources</em>' containment reference.
	 * @see #setLocalResources(LocalResources)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_LocalResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalResources' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalResources getLocalResources();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getLocalResources <em>Local Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Resources</em>' containment reference.
	 * @see #getLocalResources()
	 * @generated
	 */
	void setLocalResources(LocalResources value);

	/**
	 * Returns the value of the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificates</em>' containment reference.
	 * @see #setCertificates(Certificates)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Certificates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Certificates' namespace='##targetNamespace'"
	 * @generated
	 */
	Certificates getCertificates();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getCertificates <em>Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificates</em>' containment reference.
	 * @see #getCertificates()
	 * @generated
	 */
	void setCertificates(Certificates value);

	/**
	 * Returns the value of the '<em><b>Sites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sites</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sites</em>' containment reference.
	 * @see #setSites(Sites)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Sites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sites' namespace='##targetNamespace'"
	 * @generated
	 */
	Sites getSites();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getSites <em>Sites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sites</em>' containment reference.
	 * @see #getSites()
	 * @generated
	 */
	void setSites(Sites value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleModule_Namespace()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // RoleModule

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The configuration of the web role which accepts external requests.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getStartup <em>Startup</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalStorage <em>Local Storage</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInputEndpoints <em>Input Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInternalEndpoint <em>Internal Endpoint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getSites <em>Sites</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getContents <em>Contents</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize <em>Vmsize</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole()
 * @model extendedMetaData="name='WebRole' kind='elementOnly'"
 * @generated
 */
public interface WebRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference.
	 * @see #setImports(Imports)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Imports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Imports' namespace='##targetNamespace'"
	 * @generated
	 */
	Imports getImports();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getImports <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' containment reference.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(Imports value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Startup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Startup' namespace='##targetNamespace'"
	 * @generated
	 */
	Startup getStartup();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getStartup <em>Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup</em>' containment reference.
	 * @see #getStartup()
	 * @generated
	 */
	void setStartup(Startup value);

	/**
	 * Returns the value of the '<em><b>Local Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Storage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Storage</em>' containment reference.
	 * @see #setLocalStorage(LocalStore)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_LocalStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalStore getLocalStorage();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalStorage <em>Local Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Storage</em>' containment reference.
	 * @see #getLocalStorage()
	 * @generated
	 */
	void setLocalStorage(LocalStore value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_LocalResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalResources' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalResources getLocalResources();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalResources <em>Local Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Resources</em>' containment reference.
	 * @see #getLocalResources()
	 * @generated
	 */
	void setLocalResources(LocalResources value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_ConfigurationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfigurationSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationSettings getConfigurationSettings();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getConfigurationSettings <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Settings</em>' containment reference.
	 * @see #getConfigurationSettings()
	 * @generated
	 */
	void setConfigurationSettings(ConfigurationSettings value);

	/**
	 * Returns the value of the '<em><b>Input Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Endpoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Endpoints</em>' containment reference.
	 * @see #setInputEndpoints(InputEndpointsType)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_InputEndpoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InputEndpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	InputEndpointsType getInputEndpoints();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInputEndpoints <em>Input Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Endpoints</em>' containment reference.
	 * @see #getInputEndpoints()
	 * @generated
	 */
	void setInputEndpoints(InputEndpointsType value);

	/**
	 * Returns the value of the '<em><b>Internal Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Endpoint</em>' containment reference.
	 * @see #setInternalEndpoint(InternalEndpointType)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_InternalEndpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalEndpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalEndpointType getInternalEndpoint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInternalEndpoint <em>Internal Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Endpoint</em>' containment reference.
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	void setInternalEndpoint(InternalEndpointType value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Endpoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Endpoints' namespace='##targetNamespace'"
	 * @generated
	 */
	Endpoints getEndpoints();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getEndpoints <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoints</em>' containment reference.
	 * @see #getEndpoints()
	 * @generated
	 */
	void setEndpoints(Endpoints value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Certificates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Certificates' namespace='##targetNamespace'"
	 * @generated
	 */
	Certificates getCertificates();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getCertificates <em>Certificates</em>}' containment reference.
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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Sites()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sites' namespace='##targetNamespace'"
	 * @generated
	 */
	Sites getSites();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getSites <em>Sites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sites</em>' containment reference.
	 * @see #getSites()
	 * @generated
	 */
	void setSites(Sites value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' containment reference.
	 * @see #setRuntime(WebRuntime)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Runtime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Runtime' namespace='##targetNamespace'"
	 * @generated
	 */
	WebRuntime getRuntime();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getRuntime <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' containment reference.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(WebRuntime value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(ContentsElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Contents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Contents' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentsElement getContents();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(ContentsElement value);

	/**
	 * Returns the value of the '<em><b>Enable Native Code Execution</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Allow the execution of native x64 code in this role. Also enables full trust managed code.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Native Code Execution</em>' attribute.
	 * @see #isSetEnableNativeCodeExecution()
	 * @see #unsetEnableNativeCodeExecution()
	 * @see #setEnableNativeCodeExecution(boolean)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_EnableNativeCodeExecution()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='enableNativeCodeExecution'"
	 * @generated
	 */
	boolean isEnableNativeCodeExecution();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Native Code Execution</em>' attribute.
	 * @see #isSetEnableNativeCodeExecution()
	 * @see #unsetEnableNativeCodeExecution()
	 * @see #isEnableNativeCodeExecution()
	 * @generated
	 */
	void setEnableNativeCodeExecution(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableNativeCodeExecution()
	 * @see #isEnableNativeCodeExecution()
	 * @see #setEnableNativeCodeExecution(boolean)
	 * @generated
	 */
	void unsetEnableNativeCodeExecution();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Native Code Execution</em>' attribute is set.
	 * @see #unsetEnableNativeCodeExecution()
	 * @see #isEnableNativeCodeExecution()
	 * @see #setEnableNativeCodeExecution(boolean)
	 * @generated
	 */
	boolean isSetEnableNativeCodeExecution();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the role. Each role should have a unique name.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vmsize</b></em>' attribute.
	 * The default value is <code>"Small"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The size of the VM needed to host this role.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vmsize</em>' attribute.
	 * @see #isSetVmsize()
	 * @see #unsetVmsize()
	 * @see #setVmsize(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRole_Vmsize()
	 * @model default="Small" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vmsize'"
	 * @generated
	 */
	String getVmsize();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize <em>Vmsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmsize</em>' attribute.
	 * @see #isSetVmsize()
	 * @see #unsetVmsize()
	 * @see #getVmsize()
	 * @generated
	 */
	void setVmsize(String value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize <em>Vmsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVmsize()
	 * @see #getVmsize()
	 * @see #setVmsize(String)
	 * @generated
	 */
	void unsetVmsize();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize <em>Vmsize</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vmsize</em>' attribute is set.
	 * @see #unsetVmsize()
	 * @see #getVmsize()
	 * @see #setVmsize(String)
	 * @generated
	 */
	boolean isSetVmsize();

} // WebRole

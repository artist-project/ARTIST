/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getOsImage <em>Os Image</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getInstances <em>Instances</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getVmName <em>Vm Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings()
 * @model extendedMetaData="name='RoleSettings' kind='elementOnly'"
 * @generated
 */
public interface RoleSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Os Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             TODO
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Os Image</em>' containment reference.
	 * @see #setOsImage(OsImageSetting)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_OsImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OsImage' namespace='##targetNamespace'"
	 * @generated
	 */
	OsImageSetting getOsImage();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getOsImage <em>Os Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Image</em>' containment reference.
	 * @see #getOsImage()
	 * @generated
	 */
	void setOsImage(OsImageSetting value);

	/**
	 * Returns the value of the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Values for the configuration settings names declared in the
	 *             service definition to string values.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Settings</em>' containment reference.
	 * @see #setConfigurationSettings(ConfigurationSettingsType)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_ConfigurationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfigurationSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationSettingsType getConfigurationSettings();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getConfigurationSettings <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Settings</em>' containment reference.
	 * @see #getConfigurationSettings()
	 * @generated
	 */
	void setConfigurationSettings(ConfigurationSettingsType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(TargetSetting)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_Instances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Instances' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetSetting getInstances();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(TargetSetting value);

	/**
	 * Returns the value of the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Thumbprint mapping values for the certificates declared by name in the service definition.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificates</em>' containment reference.
	 * @see #setCertificates(CertificatesType)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_Certificates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Certificates' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificatesType getCertificates();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getCertificates <em>Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificates</em>' containment reference.
	 * @see #getCertificates()
	 * @generated
	 */
	void setCertificates(CertificatesType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the role. The name should match the name of the role in the service definition.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The VM name (prefix) of the role.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Name</em>' attribute.
	 * @see #setVmName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getRoleSettings_VmName()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.VmNameString"
	 *        extendedMetaData="kind='attribute' name='vmName'"
	 * @generated
	 */
	String getVmName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getVmName <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Name</em>' attribute.
	 * @see #getVmName()
	 * @generated
	 */
	void setVmName(String value);

} // RoleSettings

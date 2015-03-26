/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Configuration settings are deployment-specific mappings of names to string values that can be
 *         accessed from the role's code. The names of the settings are declared here and the mappings to
 *         values is done in the service configuration file.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSettings#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getConfigurationSettings()
 * @model extendedMetaData="name='ConfigurationSettings' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.ConfigurationSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getConfigurationSettings_Setting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Setting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConfigurationSetting> getSetting();

} // ConfigurationSettings

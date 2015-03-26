/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getConfigurationSettingsType()
 * @model extendedMetaData="name='ConfigurationSettings_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationSettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getConfigurationSettingsType_Setting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Setting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConfigurationSetting> getSetting();

} // ConfigurationSettingsType

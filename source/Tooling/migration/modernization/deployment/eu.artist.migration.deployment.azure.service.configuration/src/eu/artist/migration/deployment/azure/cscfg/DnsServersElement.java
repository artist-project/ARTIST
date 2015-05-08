/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dns Servers Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.DnsServersElement#getDnsServer <em>Dns Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getDnsServersElement()
 * @model extendedMetaData="name='DnsServersElement' kind='elementOnly'"
 * @generated
 */
public interface DnsServersElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Dns Server</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.DnsServerElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Dns server settings.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dns Server</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getDnsServersElement_DnsServer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DnsServer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DnsServerElement> getDnsServer();

} // DnsServersElement

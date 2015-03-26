/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dns Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.DnsElement#getDnsServers <em>Dns Servers</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getDnsElement()
 * @model extendedMetaData="name='DnsElement' kind='elementOnly'"
 * @generated
 */
public interface DnsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Dns Servers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns Servers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns Servers</em>' containment reference.
	 * @see #setDnsServers(DnsServersElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getDnsElement_DnsServers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DnsServers' namespace='##targetNamespace'"
	 * @generated
	 */
	DnsServersElement getDnsServers();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.DnsElement#getDnsServers <em>Dns Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Servers</em>' containment reference.
	 * @see #getDnsServers()
	 * @generated
	 */
	void setDnsServers(DnsServersElement value);

} // DnsElement

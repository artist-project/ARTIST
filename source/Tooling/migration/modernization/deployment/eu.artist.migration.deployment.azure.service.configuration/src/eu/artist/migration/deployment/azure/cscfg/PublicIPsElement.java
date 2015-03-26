/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public IPs Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.PublicIPsElement#getPublicIP <em>Public IP</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getPublicIPsElement()
 * @model extendedMetaData="name='PublicIPsElement' kind='elementOnly'"
 * @generated
 */
public interface PublicIPsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Public IP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public IP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public IP</em>' containment reference.
	 * @see #setPublicIP(PublicIPElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getPublicIPsElement_PublicIP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublicIP' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicIPElement getPublicIP();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPsElement#getPublicIP <em>Public IP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public IP</em>' containment reference.
	 * @see #getPublicIP()
	 * @generated
	 */
	void setPublicIP(PublicIPElement value);

} // PublicIPsElement

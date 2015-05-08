/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserved IPs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPsType#getReservedIP <em>Reserved IP</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getReservedIPsType()
 * @model extendedMetaData="name='ReservedIPs_._type' kind='elementOnly'"
 * @generated
 */
public interface ReservedIPsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reserved IP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved IP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved IP</em>' containment reference.
	 * @see #setReservedIP(ReservedIPElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getReservedIPsType_ReservedIP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReservedIP' namespace='##targetNamespace'"
	 * @generated
	 */
	ReservedIPElement getReservedIP();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPsType#getReservedIP <em>Reserved IP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved IP</em>' containment reference.
	 * @see #getReservedIP()
	 * @generated
	 */
	void setReservedIP(ReservedIPElement value);

} // ReservedIPsType

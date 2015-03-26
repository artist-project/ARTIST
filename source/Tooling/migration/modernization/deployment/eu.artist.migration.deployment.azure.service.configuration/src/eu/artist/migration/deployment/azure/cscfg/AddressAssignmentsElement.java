/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Assignments Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getInstanceAddress <em>Instance Address</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getReservedIPs <em>Reserved IPs</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getAddressAssignmentsElement()
 * @model extendedMetaData="name='AddressAssignmentsElement' kind='elementOnly'"
 * @generated
 */
public interface AddressAssignmentsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Address</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Address</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getAddressAssignmentsElement_InstanceAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceAddressElement> getInstanceAddress();

	/**
	 * Returns the value of the '<em><b>Reserved IPs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved IPs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved IPs</em>' containment reference.
	 * @see #setReservedIPs(ReservedIPsType)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getAddressAssignmentsElement_ReservedIPs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReservedIPs' namespace='##targetNamespace'"
	 * @generated
	 */
	ReservedIPsType getReservedIPs();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getReservedIPs <em>Reserved IPs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved IPs</em>' containment reference.
	 * @see #getReservedIPs()
	 * @generated
	 */
	void setReservedIPs(ReservedIPsType value);

} // AddressAssignmentsElement

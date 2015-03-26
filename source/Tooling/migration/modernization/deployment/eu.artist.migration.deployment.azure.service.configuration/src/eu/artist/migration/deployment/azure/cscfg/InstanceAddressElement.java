/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Address Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getPublicIPs <em>Public IPs</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getInstanceAddressElement()
 * @model extendedMetaData="name='InstanceAddressElement' kind='elementOnly'"
 * @generated
 */
public interface InstanceAddressElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference.
	 * @see #setSubnets(SubnetsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getInstanceAddressElement_Subnets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subnets' namespace='##targetNamespace'"
	 * @generated
	 */
	SubnetsElement getSubnets();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getSubnets <em>Subnets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnets</em>' containment reference.
	 * @see #getSubnets()
	 * @generated
	 */
	void setSubnets(SubnetsElement value);

	/**
	 * Returns the value of the '<em><b>Public IPs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public IPs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public IPs</em>' containment reference.
	 * @see #setPublicIPs(PublicIPsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getInstanceAddressElement_PublicIPs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PublicIPs' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicIPsElement getPublicIPs();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getPublicIPs <em>Public IPs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public IPs</em>' containment reference.
	 * @see #getPublicIPs()
	 * @generated
	 */
	void setPublicIPs(PublicIPsElement value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getInstanceAddressElement_RoleName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='roleName'"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // InstanceAddressElement

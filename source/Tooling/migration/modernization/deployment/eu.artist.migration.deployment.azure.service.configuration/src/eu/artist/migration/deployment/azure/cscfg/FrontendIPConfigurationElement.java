/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frontend IP Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The outward facing IP address configuration for a load balancer.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getStaticVirtualNetworkIPAddress <em>Static Virtual Network IP Address</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getFrontendIPConfigurationElement()
 * @model extendedMetaData="name='FrontendIPConfigurationElement' kind='empty'"
 * @generated
 */
public interface FrontendIPConfigurationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Static Virtual Network IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Virtual Network IP Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Virtual Network IP Address</em>' attribute.
	 * @see #setStaticVirtualNetworkIPAddress(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.IpAddressString"
	 *        extendedMetaData="kind='attribute' name='staticVirtualNetworkIPAddress'"
	 * @generated
	 */
	String getStaticVirtualNetworkIPAddress();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getStaticVirtualNetworkIPAddress <em>Static Virtual Network IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Virtual Network IP Address</em>' attribute.
	 * @see #getStaticVirtualNetworkIPAddress()
	 * @generated
	 */
	void setStaticVirtualNetworkIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' attribute.
	 * @see #setSubnet(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getFrontendIPConfigurationElement_Subnet()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.NamedElementNameString"
	 *        extendedMetaData="kind='attribute' name='subnet'"
	 * @generated
	 */
	String getSubnet();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getSubnet <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' attribute.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(IPConfigurationAddressType)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getFrontendIPConfigurationElement_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	IPConfigurationAddressType getType();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(IPConfigurationAddressType value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(IPConfigurationAddressType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(IPConfigurationAddressType)
	 * @generated
	 */
	boolean isSetType();

} // FrontendIPConfigurationElement

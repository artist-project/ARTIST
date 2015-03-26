/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getDns <em>Dns</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getVirtualNetworkSite <em>Virtual Network Site</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAddressAssignments <em>Address Assignments</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAccessControls <em>Access Controls</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getEndpointAcls <em>Endpoint Acls</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getLoadBalancers <em>Load Balancers</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getNetworkSecurityGroupRefs <em>Network Security Group Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement()
 * @model extendedMetaData="name='NetworkConfigurationElement' kind='elementOnly'"
 * @generated
 */
public interface NetworkConfigurationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Dns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns</em>' containment reference.
	 * @see #setDns(DnsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_Dns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dns' namespace='##targetNamespace'"
	 * @generated
	 */
	DnsElement getDns();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getDns <em>Dns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns</em>' containment reference.
	 * @see #getDns()
	 * @generated
	 */
	void setDns(DnsElement value);

	/**
	 * Returns the value of the '<em><b>Virtual Network Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Network Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Network Site</em>' containment reference.
	 * @see #setVirtualNetworkSite(VirtualNetworkSiteElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_VirtualNetworkSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VirtualNetworkSite' namespace='##targetNamespace'"
	 * @generated
	 */
	VirtualNetworkSiteElement getVirtualNetworkSite();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getVirtualNetworkSite <em>Virtual Network Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Network Site</em>' containment reference.
	 * @see #getVirtualNetworkSite()
	 * @generated
	 */
	void setVirtualNetworkSite(VirtualNetworkSiteElement value);

	/**
	 * Returns the value of the '<em><b>Address Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Assignments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Assignments</em>' containment reference.
	 * @see #setAddressAssignments(AddressAssignmentsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_AddressAssignments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressAssignments' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressAssignmentsElement getAddressAssignments();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAddressAssignments <em>Address Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Assignments</em>' containment reference.
	 * @see #getAddressAssignments()
	 * @generated
	 */
	void setAddressAssignments(AddressAssignmentsElement value);

	/**
	 * Returns the value of the '<em><b>Access Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Controls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Controls</em>' containment reference.
	 * @see #setAccessControls(AccessControlsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_AccessControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessControls' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControlsElement getAccessControls();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAccessControls <em>Access Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Controls</em>' containment reference.
	 * @see #getAccessControls()
	 * @generated
	 */
	void setAccessControls(AccessControlsElement value);

	/**
	 * Returns the value of the '<em><b>Endpoint Acls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Acls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Acls</em>' containment reference.
	 * @see #setEndpointAcls(EndpointAclsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_EndpointAcls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndpointAcls' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointAclsElement getEndpointAcls();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getEndpointAcls <em>Endpoint Acls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Acls</em>' containment reference.
	 * @see #getEndpointAcls()
	 * @generated
	 */
	void setEndpointAcls(EndpointAclsElement value);

	/**
	 * Returns the value of the '<em><b>Load Balancers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancers</em>' containment reference.
	 * @see #setLoadBalancers(LoadBalancersElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_LoadBalancers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LoadBalancers' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadBalancersElement getLoadBalancers();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getLoadBalancers <em>Load Balancers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancers</em>' containment reference.
	 * @see #getLoadBalancers()
	 * @generated
	 */
	void setLoadBalancers(LoadBalancersElement value);

	/**
	 * Returns the value of the '<em><b>Network Security Group Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Security Group Refs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Security Group Refs</em>' containment reference.
	 * @see #setNetworkSecurityGroupRefs(NetworkSecurityGroupRefsElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkConfigurationElement_NetworkSecurityGroupRefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkSecurityGroupRefs' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkSecurityGroupRefsElement getNetworkSecurityGroupRefs();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getNetworkSecurityGroupRefs <em>Network Security Group Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Security Group Refs</em>' containment reference.
	 * @see #getNetworkSecurityGroupRefs()
	 * @generated
	 */
	void setNetworkSecurityGroupRefs(NetworkSecurityGroupRefsElement value);

} // NetworkConfigurationElement

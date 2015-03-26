/**
 */
package eu.artist.migration.deployment.azure.cscfg.util;

import eu.artist.migration.deployment.azure.cscfg.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage
 * @generated
 */
public class AzureCSCfgSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AzureCSCfgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgSwitch() {
		if (modelPackage == null) {
			modelPackage = AzureCSCfgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AzureCSCfgPackage.ACCESS_CONTROL_ELEMENT: {
				AccessControlElement accessControlElement = (AccessControlElement)theEObject;
				T result = caseAccessControlElement(accessControlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT: {
				AccessControlsElement accessControlsElement = (AccessControlsElement)theEObject;
				T result = caseAccessControlsElement(accessControlsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT: {
				AddressAssignmentsElement addressAssignmentsElement = (AddressAssignmentsElement)theEObject;
				T result = caseAddressAssignmentsElement(addressAssignmentsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.CERTIFICATE: {
				Certificate certificate = (Certificate)theEObject;
				T result = caseCertificate(certificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.CERTIFICATES_TYPE: {
				CertificatesType certificatesType = (CertificatesType)theEObject;
				T result = caseCertificatesType(certificatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.CONFIGURATION_SETTING: {
				ConfigurationSetting configurationSetting = (ConfigurationSetting)theEObject;
				T result = caseConfigurationSetting(configurationSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.CONFIGURATION_SETTINGS_TYPE: {
				ConfigurationSettingsType configurationSettingsType = (ConfigurationSettingsType)theEObject;
				T result = caseConfigurationSettingsType(configurationSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.DNS_ELEMENT: {
				DnsElement dnsElement = (DnsElement)theEObject;
				T result = caseDnsElement(dnsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.DNS_SERVER_ELEMENT: {
				DnsServerElement dnsServerElement = (DnsServerElement)theEObject;
				T result = caseDnsServerElement(dnsServerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT: {
				DnsServersElement dnsServersElement = (DnsServersElement)theEObject;
				T result = caseDnsServersElement(dnsServersElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT: {
				EndpointAclsElement endpointAclsElement = (EndpointAclsElement)theEObject;
				T result = caseEndpointAclsElement(endpointAclsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.ENDPOINT_ACL_TYPE: {
				EndpointAclType endpointAclType = (EndpointAclType)theEObject;
				T result = caseEndpointAclType(endpointAclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT: {
				FrontendIPConfigurationElement frontendIPConfigurationElement = (FrontendIPConfigurationElement)theEObject;
				T result = caseFrontendIPConfigurationElement(frontendIPConfigurationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT: {
				GuestAgentSettingsElement guestAgentSettingsElement = (GuestAgentSettingsElement)theEObject;
				T result = caseGuestAgentSettingsElement(guestAgentSettingsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT: {
				InstanceAddressElement instanceAddressElement = (InstanceAddressElement)theEObject;
				T result = caseInstanceAddressElement(instanceAddressElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT: {
				LoadBalancerElement loadBalancerElement = (LoadBalancerElement)theEObject;
				T result = caseLoadBalancerElement(loadBalancerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT: {
				LoadBalancersElement loadBalancersElement = (LoadBalancersElement)theEObject;
				T result = caseLoadBalancersElement(loadBalancersElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT: {
				NetworkConfigurationElement networkConfigurationElement = (NetworkConfigurationElement)theEObject;
				T result = caseNetworkConfigurationElement(networkConfigurationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_ELEMENT: {
				NetworkSecurityGroupElement networkSecurityGroupElement = (NetworkSecurityGroupElement)theEObject;
				T result = caseNetworkSecurityGroupElement(networkSecurityGroupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT: {
				NetworkSecurityGroupRefElement networkSecurityGroupRefElement = (NetworkSecurityGroupRefElement)theEObject;
				T result = caseNetworkSecurityGroupRefElement(networkSecurityGroupRefElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT: {
				NetworkSecurityGroupRefsElement networkSecurityGroupRefsElement = (NetworkSecurityGroupRefsElement)theEObject;
				T result = caseNetworkSecurityGroupRefsElement(networkSecurityGroupRefsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.OS_IMAGE_SETTING: {
				OsImageSetting osImageSetting = (OsImageSetting)theEObject;
				T result = caseOsImageSetting(osImageSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT: {
				PublicIPElement publicIPElement = (PublicIPElement)theEObject;
				T result = casePublicIPElement(publicIPElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT: {
				PublicIPsElement publicIPsElement = (PublicIPsElement)theEObject;
				T result = casePublicIPsElement(publicIPsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.RESERVED_IP_ELEMENT: {
				ReservedIPElement reservedIPElement = (ReservedIPElement)theEObject;
				T result = caseReservedIPElement(reservedIPElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.RESERVED_IPS_TYPE: {
				ReservedIPsType reservedIPsType = (ReservedIPsType)theEObject;
				T result = caseReservedIPsType(reservedIPsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.ROLE_SETTINGS: {
				RoleSettings roleSettings = (RoleSettings)theEObject;
				T result = caseRoleSettings(roleSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.RULE_ELEMENT: {
				RuleElement ruleElement = (RuleElement)theEObject;
				T result = caseRuleElement(ruleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.SERVICE_CONFIGURATION: {
				ServiceConfiguration serviceConfiguration = (ServiceConfiguration)theEObject;
				T result = caseServiceConfiguration(serviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.SUBNET_ELEMENT: {
				SubnetElement subnetElement = (SubnetElement)theEObject;
				T result = caseSubnetElement(subnetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.SUBNETS_ELEMENT: {
				SubnetsElement subnetsElement = (SubnetsElement)theEObject;
				T result = caseSubnetsElement(subnetsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.TARGET_SETTING: {
				TargetSetting targetSetting = (TargetSetting)theEObject;
				T result = caseTargetSetting(targetSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSCfgPackage.VIRTUAL_NETWORK_SITE_ELEMENT: {
				VirtualNetworkSiteElement virtualNetworkSiteElement = (VirtualNetworkSiteElement)theEObject;
				T result = caseVirtualNetworkSiteElement(virtualNetworkSiteElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlElement(AccessControlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Controls Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Controls Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlsElement(AccessControlsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Assignments Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Assignments Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressAssignmentsElement(AddressAssignmentsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificate(Certificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificatesType(CertificatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSetting(ConfigurationSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSettingsType(ConfigurationSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsElement(DnsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Server Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Server Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsServerElement(DnsServerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Servers Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Servers Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsServersElement(DnsServersElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Acls Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Acls Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointAclsElement(EndpointAclsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Acl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Acl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointAclType(EndpointAclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frontend IP Configuration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frontend IP Configuration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontendIPConfigurationElement(FrontendIPConfigurationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Agent Settings Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Agent Settings Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestAgentSettingsElement(GuestAgentSettingsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Address Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Address Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceAddressElement(InstanceAddressElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancerElement(LoadBalancerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancers Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancers Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancersElement(LoadBalancersElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Configuration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Configuration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkConfigurationElement(NetworkConfigurationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Security Group Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Security Group Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkSecurityGroupElement(NetworkSecurityGroupElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Security Group Ref Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Security Group Ref Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkSecurityGroupRefElement(NetworkSecurityGroupRefElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Security Group Refs Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Security Group Refs Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkSecurityGroupRefsElement(NetworkSecurityGroupRefsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Image Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Image Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsImageSetting(OsImageSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public IP Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public IP Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicIPElement(PublicIPElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public IPs Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public IPs Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicIPsElement(PublicIPsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserved IP Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserved IP Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservedIPElement(ReservedIPElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserved IPs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserved IPs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservedIPsType(ReservedIPsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSettings(RoleSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleElement(RuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConfiguration(ServiceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetElement(SubnetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnets Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnets Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnetsElement(SubnetsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetSetting(TargetSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Network Site Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Network Site Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNetworkSiteElement(VirtualNetworkSiteElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AzureCSCfgSwitch

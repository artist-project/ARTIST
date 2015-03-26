/**
 */
package eu.artist.migration.deployment.azure.cscfg.util;

import eu.artist.migration.deployment.azure.cscfg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage
 * @generated
 */
public class AzureCSCfgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AzureCSCfgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AzureCSCfgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AzureCSCfgSwitch<Adapter> modelSwitch =
		new AzureCSCfgSwitch<Adapter>() {
			@Override
			public Adapter caseAccessControlElement(AccessControlElement object) {
				return createAccessControlElementAdapter();
			}
			@Override
			public Adapter caseAccessControlsElement(AccessControlsElement object) {
				return createAccessControlsElementAdapter();
			}
			@Override
			public Adapter caseAddressAssignmentsElement(AddressAssignmentsElement object) {
				return createAddressAssignmentsElementAdapter();
			}
			@Override
			public Adapter caseCertificate(Certificate object) {
				return createCertificateAdapter();
			}
			@Override
			public Adapter caseCertificatesType(CertificatesType object) {
				return createCertificatesTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationSetting(ConfigurationSetting object) {
				return createConfigurationSettingAdapter();
			}
			@Override
			public Adapter caseConfigurationSettingsType(ConfigurationSettingsType object) {
				return createConfigurationSettingsTypeAdapter();
			}
			@Override
			public Adapter caseDnsElement(DnsElement object) {
				return createDnsElementAdapter();
			}
			@Override
			public Adapter caseDnsServerElement(DnsServerElement object) {
				return createDnsServerElementAdapter();
			}
			@Override
			public Adapter caseDnsServersElement(DnsServersElement object) {
				return createDnsServersElementAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndpointAclsElement(EndpointAclsElement object) {
				return createEndpointAclsElementAdapter();
			}
			@Override
			public Adapter caseEndpointAclType(EndpointAclType object) {
				return createEndpointAclTypeAdapter();
			}
			@Override
			public Adapter caseFrontendIPConfigurationElement(FrontendIPConfigurationElement object) {
				return createFrontendIPConfigurationElementAdapter();
			}
			@Override
			public Adapter caseGuestAgentSettingsElement(GuestAgentSettingsElement object) {
				return createGuestAgentSettingsElementAdapter();
			}
			@Override
			public Adapter caseInstanceAddressElement(InstanceAddressElement object) {
				return createInstanceAddressElementAdapter();
			}
			@Override
			public Adapter caseLoadBalancerElement(LoadBalancerElement object) {
				return createLoadBalancerElementAdapter();
			}
			@Override
			public Adapter caseLoadBalancersElement(LoadBalancersElement object) {
				return createLoadBalancersElementAdapter();
			}
			@Override
			public Adapter caseNetworkConfigurationElement(NetworkConfigurationElement object) {
				return createNetworkConfigurationElementAdapter();
			}
			@Override
			public Adapter caseNetworkSecurityGroupElement(NetworkSecurityGroupElement object) {
				return createNetworkSecurityGroupElementAdapter();
			}
			@Override
			public Adapter caseNetworkSecurityGroupRefElement(NetworkSecurityGroupRefElement object) {
				return createNetworkSecurityGroupRefElementAdapter();
			}
			@Override
			public Adapter caseNetworkSecurityGroupRefsElement(NetworkSecurityGroupRefsElement object) {
				return createNetworkSecurityGroupRefsElementAdapter();
			}
			@Override
			public Adapter caseOsImageSetting(OsImageSetting object) {
				return createOsImageSettingAdapter();
			}
			@Override
			public Adapter casePublicIPElement(PublicIPElement object) {
				return createPublicIPElementAdapter();
			}
			@Override
			public Adapter casePublicIPsElement(PublicIPsElement object) {
				return createPublicIPsElementAdapter();
			}
			@Override
			public Adapter caseReservedIPElement(ReservedIPElement object) {
				return createReservedIPElementAdapter();
			}
			@Override
			public Adapter caseReservedIPsType(ReservedIPsType object) {
				return createReservedIPsTypeAdapter();
			}
			@Override
			public Adapter caseRoleSettings(RoleSettings object) {
				return createRoleSettingsAdapter();
			}
			@Override
			public Adapter caseRuleElement(RuleElement object) {
				return createRuleElementAdapter();
			}
			@Override
			public Adapter caseServiceConfiguration(ServiceConfiguration object) {
				return createServiceConfigurationAdapter();
			}
			@Override
			public Adapter caseSubnetElement(SubnetElement object) {
				return createSubnetElementAdapter();
			}
			@Override
			public Adapter caseSubnetsElement(SubnetsElement object) {
				return createSubnetsElementAdapter();
			}
			@Override
			public Adapter caseTargetSetting(TargetSetting object) {
				return createTargetSettingAdapter();
			}
			@Override
			public Adapter caseVirtualNetworkSiteElement(VirtualNetworkSiteElement object) {
				return createVirtualNetworkSiteElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlElement <em>Access Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlElement
	 * @generated
	 */
	public Adapter createAccessControlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlsElement <em>Access Controls Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlsElement
	 * @generated
	 */
	public Adapter createAccessControlsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement <em>Address Assignments Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement
	 * @generated
	 */
	public Adapter createAddressAssignmentsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.Certificate
	 * @generated
	 */
	public Adapter createCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.CertificatesType <em>Certificates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.CertificatesType
	 * @generated
	 */
	public Adapter createCertificatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting <em>Configuration Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting
	 * @generated
	 */
	public Adapter createConfigurationSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType <em>Configuration Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType
	 * @generated
	 */
	public Adapter createConfigurationSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.DnsElement <em>Dns Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsElement
	 * @generated
	 */
	public Adapter createDnsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.DnsServerElement <em>Dns Server Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServerElement
	 * @generated
	 */
	public Adapter createDnsServerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.DnsServersElement <em>Dns Servers Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServersElement
	 * @generated
	 */
	public Adapter createDnsServersElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement <em>Endpoint Acls Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement
	 * @generated
	 */
	public Adapter createEndpointAclsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType <em>Endpoint Acl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclType
	 * @generated
	 */
	public Adapter createEndpointAclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement <em>Frontend IP Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement
	 * @generated
	 */
	public Adapter createFrontendIPConfigurationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement <em>Guest Agent Settings Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement
	 * @generated
	 */
	public Adapter createGuestAgentSettingsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement <em>Instance Address Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement
	 * @generated
	 */
	public Adapter createInstanceAddressElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement <em>Load Balancer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement
	 * @generated
	 */
	public Adapter createLoadBalancerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement <em>Load Balancers Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement
	 * @generated
	 */
	public Adapter createLoadBalancersElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement <em>Network Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement
	 * @generated
	 */
	public Adapter createNetworkConfigurationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement <em>Network Security Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement
	 * @generated
	 */
	public Adapter createNetworkSecurityGroupElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement <em>Network Security Group Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement
	 * @generated
	 */
	public Adapter createNetworkSecurityGroupRefElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement <em>Network Security Group Refs Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement
	 * @generated
	 */
	public Adapter createNetworkSecurityGroupRefsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.OsImageSetting <em>Os Image Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.OsImageSetting
	 * @generated
	 */
	public Adapter createOsImageSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement <em>Public IP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPElement
	 * @generated
	 */
	public Adapter createPublicIPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPsElement <em>Public IPs Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPsElement
	 * @generated
	 */
	public Adapter createPublicIPsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPElement <em>Reserved IP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPElement
	 * @generated
	 */
	public Adapter createReservedIPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPsType <em>Reserved IPs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPsType
	 * @generated
	 */
	public Adapter createReservedIPsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings <em>Role Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings
	 * @generated
	 */
	public Adapter createRoleSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement
	 * @generated
	 */
	public Adapter createRuleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration
	 * @generated
	 */
	public Adapter createServiceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.SubnetElement <em>Subnet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetElement
	 * @generated
	 */
	public Adapter createSubnetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.SubnetsElement <em>Subnets Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetsElement
	 * @generated
	 */
	public Adapter createSubnetsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.TargetSetting <em>Target Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.TargetSetting
	 * @generated
	 */
	public Adapter createTargetSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement <em>Virtual Network Site Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement
	 * @generated
	 */
	public Adapter createVirtualNetworkSiteElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AzureCSCfgAdapterFactory

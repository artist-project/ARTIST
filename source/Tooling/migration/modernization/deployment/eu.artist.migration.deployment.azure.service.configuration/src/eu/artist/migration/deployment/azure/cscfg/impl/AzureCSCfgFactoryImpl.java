/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSCfgFactoryImpl extends EFactoryImpl implements AzureCSCfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AzureCSCfgFactory init() {
		try {
			AzureCSCfgFactory theAzureCSCfgFactory = (AzureCSCfgFactory)EPackage.Registry.INSTANCE.getEFactory(AzureCSCfgPackage.eNS_URI);
			if (theAzureCSCfgFactory != null) {
				return theAzureCSCfgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AzureCSCfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AzureCSCfgPackage.ACCESS_CONTROL_ELEMENT: return createAccessControlElement();
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT: return createAccessControlsElement();
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT: return createAddressAssignmentsElement();
			case AzureCSCfgPackage.CERTIFICATE: return createCertificate();
			case AzureCSCfgPackage.CERTIFICATES_TYPE: return createCertificatesType();
			case AzureCSCfgPackage.CONFIGURATION_SETTING: return createConfigurationSetting();
			case AzureCSCfgPackage.CONFIGURATION_SETTINGS_TYPE: return createConfigurationSettingsType();
			case AzureCSCfgPackage.DNS_ELEMENT: return createDnsElement();
			case AzureCSCfgPackage.DNS_SERVER_ELEMENT: return createDnsServerElement();
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT: return createDnsServersElement();
			case AzureCSCfgPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT: return createEndpointAclsElement();
			case AzureCSCfgPackage.ENDPOINT_ACL_TYPE: return createEndpointAclType();
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT: return createFrontendIPConfigurationElement();
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT: return createGuestAgentSettingsElement();
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT: return createInstanceAddressElement();
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT: return createLoadBalancerElement();
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT: return createLoadBalancersElement();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT: return createNetworkConfigurationElement();
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_ELEMENT: return createNetworkSecurityGroupElement();
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT: return createNetworkSecurityGroupRefElement();
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT: return createNetworkSecurityGroupRefsElement();
			case AzureCSCfgPackage.OS_IMAGE_SETTING: return createOsImageSetting();
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT: return createPublicIPElement();
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT: return createPublicIPsElement();
			case AzureCSCfgPackage.RESERVED_IP_ELEMENT: return createReservedIPElement();
			case AzureCSCfgPackage.RESERVED_IPS_TYPE: return createReservedIPsType();
			case AzureCSCfgPackage.ROLE_SETTINGS: return createRoleSettings();
			case AzureCSCfgPackage.RULE_ELEMENT: return createRuleElement();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION: return createServiceConfiguration();
			case AzureCSCfgPackage.SUBNET_ELEMENT: return createSubnetElement();
			case AzureCSCfgPackage.SUBNETS_ELEMENT: return createSubnetsElement();
			case AzureCSCfgPackage.TARGET_SETTING: return createTargetSetting();
			case AzureCSCfgPackage.VIRTUAL_NETWORK_SITE_ELEMENT: return createVirtualNetworkSiteElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE:
				return createIPConfigurationAddressTypeFromString(eDataType, initialValue);
			case AzureCSCfgPackage.RULE_ACTION:
				return createRuleActionFromString(eDataType, initialValue);
			case AzureCSCfgPackage.SCHEMA_VERSION:
				return createSchemaVersionFromString(eDataType, initialValue);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES:
				return createThumbprintAlgorithmTypesFromString(eDataType, initialValue);
			case AzureCSCfgPackage.BOUNDED_LENGTH_STRING:
				return createBoundedLengthStringFromString(eDataType, initialValue);
			case AzureCSCfgPackage.IP_ADDRESS_STRING:
				return createIpAddressStringFromString(eDataType, initialValue);
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE_OBJECT:
				return createIPConfigurationAddressTypeObjectFromString(eDataType, initialValue);
			case AzureCSCfgPackage.NAMED_ELEMENT_NAME_STRING:
				return createNamedElementNameStringFromString(eDataType, initialValue);
			case AzureCSCfgPackage.POSITIVE_INT:
				return createPositiveIntFromString(eDataType, initialValue);
			case AzureCSCfgPackage.POSITIVE_INT_OBJECT:
				return createPositiveIntObjectFromString(eDataType, initialValue);
			case AzureCSCfgPackage.RULE_ACTION_OBJECT:
				return createRuleActionObjectFromString(eDataType, initialValue);
			case AzureCSCfgPackage.SCHEMA_VERSION_OBJECT:
				return createSchemaVersionObjectFromString(eDataType, initialValue);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES_OBJECT:
				return createThumbprintAlgorithmTypesObjectFromString(eDataType, initialValue);
			case AzureCSCfgPackage.THUMBPRINT_TYPE:
				return createThumbprintTypeFromString(eDataType, initialValue);
			case AzureCSCfgPackage.VM_NAME_STRING:
				return createVmNameStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE:
				return convertIPConfigurationAddressTypeToString(eDataType, instanceValue);
			case AzureCSCfgPackage.RULE_ACTION:
				return convertRuleActionToString(eDataType, instanceValue);
			case AzureCSCfgPackage.SCHEMA_VERSION:
				return convertSchemaVersionToString(eDataType, instanceValue);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES:
				return convertThumbprintAlgorithmTypesToString(eDataType, instanceValue);
			case AzureCSCfgPackage.BOUNDED_LENGTH_STRING:
				return convertBoundedLengthStringToString(eDataType, instanceValue);
			case AzureCSCfgPackage.IP_ADDRESS_STRING:
				return convertIpAddressStringToString(eDataType, instanceValue);
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE_OBJECT:
				return convertIPConfigurationAddressTypeObjectToString(eDataType, instanceValue);
			case AzureCSCfgPackage.NAMED_ELEMENT_NAME_STRING:
				return convertNamedElementNameStringToString(eDataType, instanceValue);
			case AzureCSCfgPackage.POSITIVE_INT:
				return convertPositiveIntToString(eDataType, instanceValue);
			case AzureCSCfgPackage.POSITIVE_INT_OBJECT:
				return convertPositiveIntObjectToString(eDataType, instanceValue);
			case AzureCSCfgPackage.RULE_ACTION_OBJECT:
				return convertRuleActionObjectToString(eDataType, instanceValue);
			case AzureCSCfgPackage.SCHEMA_VERSION_OBJECT:
				return convertSchemaVersionObjectToString(eDataType, instanceValue);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES_OBJECT:
				return convertThumbprintAlgorithmTypesObjectToString(eDataType, instanceValue);
			case AzureCSCfgPackage.THUMBPRINT_TYPE:
				return convertThumbprintTypeToString(eDataType, instanceValue);
			case AzureCSCfgPackage.VM_NAME_STRING:
				return convertVmNameStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlElement createAccessControlElement() {
		AccessControlElementImpl accessControlElement = new AccessControlElementImpl();
		return accessControlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlsElement createAccessControlsElement() {
		AccessControlsElementImpl accessControlsElement = new AccessControlsElementImpl();
		return accessControlsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressAssignmentsElement createAddressAssignmentsElement() {
		AddressAssignmentsElementImpl addressAssignmentsElement = new AddressAssignmentsElementImpl();
		return addressAssignmentsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate createCertificate() {
		CertificateImpl certificate = new CertificateImpl();
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificatesType createCertificatesType() {
		CertificatesTypeImpl certificatesType = new CertificatesTypeImpl();
		return certificatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSetting createConfigurationSetting() {
		ConfigurationSettingImpl configurationSetting = new ConfigurationSettingImpl();
		return configurationSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSettingsType createConfigurationSettingsType() {
		ConfigurationSettingsTypeImpl configurationSettingsType = new ConfigurationSettingsTypeImpl();
		return configurationSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsElement createDnsElement() {
		DnsElementImpl dnsElement = new DnsElementImpl();
		return dnsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsServerElement createDnsServerElement() {
		DnsServerElementImpl dnsServerElement = new DnsServerElementImpl();
		return dnsServerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsServersElement createDnsServersElement() {
		DnsServersElementImpl dnsServersElement = new DnsServersElementImpl();
		return dnsServersElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointAclsElement createEndpointAclsElement() {
		EndpointAclsElementImpl endpointAclsElement = new EndpointAclsElementImpl();
		return endpointAclsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointAclType createEndpointAclType() {
		EndpointAclTypeImpl endpointAclType = new EndpointAclTypeImpl();
		return endpointAclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontendIPConfigurationElement createFrontendIPConfigurationElement() {
		FrontendIPConfigurationElementImpl frontendIPConfigurationElement = new FrontendIPConfigurationElementImpl();
		return frontendIPConfigurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAgentSettingsElement createGuestAgentSettingsElement() {
		GuestAgentSettingsElementImpl guestAgentSettingsElement = new GuestAgentSettingsElementImpl();
		return guestAgentSettingsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAddressElement createInstanceAddressElement() {
		InstanceAddressElementImpl instanceAddressElement = new InstanceAddressElementImpl();
		return instanceAddressElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerElement createLoadBalancerElement() {
		LoadBalancerElementImpl loadBalancerElement = new LoadBalancerElementImpl();
		return loadBalancerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancersElement createLoadBalancersElement() {
		LoadBalancersElementImpl loadBalancersElement = new LoadBalancersElementImpl();
		return loadBalancersElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConfigurationElement createNetworkConfigurationElement() {
		NetworkConfigurationElementImpl networkConfigurationElement = new NetworkConfigurationElementImpl();
		return networkConfigurationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSecurityGroupElement createNetworkSecurityGroupElement() {
		NetworkSecurityGroupElementImpl networkSecurityGroupElement = new NetworkSecurityGroupElementImpl();
		return networkSecurityGroupElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSecurityGroupRefElement createNetworkSecurityGroupRefElement() {
		NetworkSecurityGroupRefElementImpl networkSecurityGroupRefElement = new NetworkSecurityGroupRefElementImpl();
		return networkSecurityGroupRefElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSecurityGroupRefsElement createNetworkSecurityGroupRefsElement() {
		NetworkSecurityGroupRefsElementImpl networkSecurityGroupRefsElement = new NetworkSecurityGroupRefsElementImpl();
		return networkSecurityGroupRefsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsImageSetting createOsImageSetting() {
		OsImageSettingImpl osImageSetting = new OsImageSettingImpl();
		return osImageSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicIPElement createPublicIPElement() {
		PublicIPElementImpl publicIPElement = new PublicIPElementImpl();
		return publicIPElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicIPsElement createPublicIPsElement() {
		PublicIPsElementImpl publicIPsElement = new PublicIPsElementImpl();
		return publicIPsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedIPElement createReservedIPElement() {
		ReservedIPElementImpl reservedIPElement = new ReservedIPElementImpl();
		return reservedIPElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedIPsType createReservedIPsType() {
		ReservedIPsTypeImpl reservedIPsType = new ReservedIPsTypeImpl();
		return reservedIPsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSettings createRoleSettings() {
		RoleSettingsImpl roleSettings = new RoleSettingsImpl();
		return roleSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement createRuleElement() {
		RuleElementImpl ruleElement = new RuleElementImpl();
		return ruleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfiguration createServiceConfiguration() {
		ServiceConfigurationImpl serviceConfiguration = new ServiceConfigurationImpl();
		return serviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnetElement createSubnetElement() {
		SubnetElementImpl subnetElement = new SubnetElementImpl();
		return subnetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnetsElement createSubnetsElement() {
		SubnetsElementImpl subnetsElement = new SubnetsElementImpl();
		return subnetsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSetting createTargetSetting() {
		TargetSettingImpl targetSetting = new TargetSettingImpl();
		return targetSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkSiteElement createVirtualNetworkSiteElement() {
		VirtualNetworkSiteElementImpl virtualNetworkSiteElement = new VirtualNetworkSiteElementImpl();
		return virtualNetworkSiteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPConfigurationAddressType createIPConfigurationAddressTypeFromString(EDataType eDataType, String initialValue) {
		IPConfigurationAddressType result = IPConfigurationAddressType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPConfigurationAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleAction createRuleActionFromString(EDataType eDataType, String initialValue) {
		RuleAction result = RuleAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersionFromString(EDataType eDataType, String initialValue) {
		SchemaVersion result = SchemaVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThumbprintAlgorithmTypes createThumbprintAlgorithmTypesFromString(EDataType eDataType, String initialValue) {
		ThumbprintAlgorithmTypes result = ThumbprintAlgorithmTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThumbprintAlgorithmTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBoundedLengthStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoundedLengthStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpAddressStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpAddressStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPConfigurationAddressType createIPConfigurationAddressTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIPConfigurationAddressTypeFromString(AzureCSCfgPackage.Literals.IP_CONFIGURATION_ADDRESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPConfigurationAddressTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIPConfigurationAddressTypeToString(AzureCSCfgPackage.Literals.IP_CONFIGURATION_ADDRESS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamedElementNameStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamedElementNameStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntObjectFromString(EDataType eDataType, String initialValue) {
		return createPositiveIntFromString(AzureCSCfgPackage.Literals.POSITIVE_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositiveIntToString(AzureCSCfgPackage.Literals.POSITIVE_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleAction createRuleActionObjectFromString(EDataType eDataType, String initialValue) {
		return createRuleActionFromString(AzureCSCfgPackage.Literals.RULE_ACTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleActionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRuleActionToString(AzureCSCfgPackage.Literals.RULE_ACTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersionObjectFromString(EDataType eDataType, String initialValue) {
		return createSchemaVersionFromString(AzureCSCfgPackage.Literals.SCHEMA_VERSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaVersionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchemaVersionToString(AzureCSCfgPackage.Literals.SCHEMA_VERSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThumbprintAlgorithmTypes createThumbprintAlgorithmTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createThumbprintAlgorithmTypesFromString(AzureCSCfgPackage.Literals.THUMBPRINT_ALGORITHM_TYPES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThumbprintAlgorithmTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThumbprintAlgorithmTypesToString(AzureCSCfgPackage.Literals.THUMBPRINT_ALGORITHM_TYPES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createThumbprintTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThumbprintTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVmNameStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmNameStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgPackage getAzureCSCfgPackage() {
		return (AzureCSCfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AzureCSCfgPackage getPackage() {
		return AzureCSCfgPackage.eINSTANCE;
	}

} //AzureCSCfgFactoryImpl

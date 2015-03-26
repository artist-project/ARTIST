/**
 */
package eu.artist.migration.deployment.azure.cscfg.util;

import eu.artist.migration.deployment.azure.cscfg.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage
 * @generated
 */
public class AzureCSCfgValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AzureCSCfgValidator INSTANCE = new AzureCSCfgValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.artist.migration.deployment.azure.cscfg";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AzureCSCfgPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AzureCSCfgPackage.ACCESS_CONTROL_ELEMENT:
				return validateAccessControlElement((AccessControlElement)value, diagnostics, context);
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT:
				return validateAccessControlsElement((AccessControlsElement)value, diagnostics, context);
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT:
				return validateAddressAssignmentsElement((AddressAssignmentsElement)value, diagnostics, context);
			case AzureCSCfgPackage.CERTIFICATE:
				return validateCertificate((Certificate)value, diagnostics, context);
			case AzureCSCfgPackage.CERTIFICATES_TYPE:
				return validateCertificatesType((CertificatesType)value, diagnostics, context);
			case AzureCSCfgPackage.CONFIGURATION_SETTING:
				return validateConfigurationSetting((ConfigurationSetting)value, diagnostics, context);
			case AzureCSCfgPackage.CONFIGURATION_SETTINGS_TYPE:
				return validateConfigurationSettingsType((ConfigurationSettingsType)value, diagnostics, context);
			case AzureCSCfgPackage.DNS_ELEMENT:
				return validateDnsElement((DnsElement)value, diagnostics, context);
			case AzureCSCfgPackage.DNS_SERVER_ELEMENT:
				return validateDnsServerElement((DnsServerElement)value, diagnostics, context);
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT:
				return validateDnsServersElement((DnsServersElement)value, diagnostics, context);
			case AzureCSCfgPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AzureCSCfgPackage.ENDPOINT_ACLS_ELEMENT:
				return validateEndpointAclsElement((EndpointAclsElement)value, diagnostics, context);
			case AzureCSCfgPackage.ENDPOINT_ACL_TYPE:
				return validateEndpointAclType((EndpointAclType)value, diagnostics, context);
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT:
				return validateFrontendIPConfigurationElement((FrontendIPConfigurationElement)value, diagnostics, context);
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT:
				return validateGuestAgentSettingsElement((GuestAgentSettingsElement)value, diagnostics, context);
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT:
				return validateInstanceAddressElement((InstanceAddressElement)value, diagnostics, context);
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT:
				return validateLoadBalancerElement((LoadBalancerElement)value, diagnostics, context);
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT:
				return validateLoadBalancersElement((LoadBalancersElement)value, diagnostics, context);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT:
				return validateNetworkConfigurationElement((NetworkConfigurationElement)value, diagnostics, context);
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_ELEMENT:
				return validateNetworkSecurityGroupElement((NetworkSecurityGroupElement)value, diagnostics, context);
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT:
				return validateNetworkSecurityGroupRefElement((NetworkSecurityGroupRefElement)value, diagnostics, context);
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT:
				return validateNetworkSecurityGroupRefsElement((NetworkSecurityGroupRefsElement)value, diagnostics, context);
			case AzureCSCfgPackage.OS_IMAGE_SETTING:
				return validateOsImageSetting((OsImageSetting)value, diagnostics, context);
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT:
				return validatePublicIPElement((PublicIPElement)value, diagnostics, context);
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT:
				return validatePublicIPsElement((PublicIPsElement)value, diagnostics, context);
			case AzureCSCfgPackage.RESERVED_IP_ELEMENT:
				return validateReservedIPElement((ReservedIPElement)value, diagnostics, context);
			case AzureCSCfgPackage.RESERVED_IPS_TYPE:
				return validateReservedIPsType((ReservedIPsType)value, diagnostics, context);
			case AzureCSCfgPackage.ROLE_SETTINGS:
				return validateRoleSettings((RoleSettings)value, diagnostics, context);
			case AzureCSCfgPackage.RULE_ELEMENT:
				return validateRuleElement((RuleElement)value, diagnostics, context);
			case AzureCSCfgPackage.SERVICE_CONFIGURATION:
				return validateServiceConfiguration((ServiceConfiguration)value, diagnostics, context);
			case AzureCSCfgPackage.SUBNET_ELEMENT:
				return validateSubnetElement((SubnetElement)value, diagnostics, context);
			case AzureCSCfgPackage.SUBNETS_ELEMENT:
				return validateSubnetsElement((SubnetsElement)value, diagnostics, context);
			case AzureCSCfgPackage.TARGET_SETTING:
				return validateTargetSetting((TargetSetting)value, diagnostics, context);
			case AzureCSCfgPackage.VIRTUAL_NETWORK_SITE_ELEMENT:
				return validateVirtualNetworkSiteElement((VirtualNetworkSiteElement)value, diagnostics, context);
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE:
				return validateIPConfigurationAddressType((IPConfigurationAddressType)value, diagnostics, context);
			case AzureCSCfgPackage.RULE_ACTION:
				return validateRuleAction((RuleAction)value, diagnostics, context);
			case AzureCSCfgPackage.SCHEMA_VERSION:
				return validateSchemaVersion((SchemaVersion)value, diagnostics, context);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES:
				return validateThumbprintAlgorithmTypes((ThumbprintAlgorithmTypes)value, diagnostics, context);
			case AzureCSCfgPackage.BOUNDED_LENGTH_STRING:
				return validateBoundedLengthString((String)value, diagnostics, context);
			case AzureCSCfgPackage.IP_ADDRESS_STRING:
				return validateIpAddressString((String)value, diagnostics, context);
			case AzureCSCfgPackage.IP_CONFIGURATION_ADDRESS_TYPE_OBJECT:
				return validateIPConfigurationAddressTypeObject((IPConfigurationAddressType)value, diagnostics, context);
			case AzureCSCfgPackage.NAMED_ELEMENT_NAME_STRING:
				return validateNamedElementNameString((String)value, diagnostics, context);
			case AzureCSCfgPackage.POSITIVE_INT:
				return validatePositiveInt((Integer)value, diagnostics, context);
			case AzureCSCfgPackage.POSITIVE_INT_OBJECT:
				return validatePositiveIntObject((Integer)value, diagnostics, context);
			case AzureCSCfgPackage.RULE_ACTION_OBJECT:
				return validateRuleActionObject((RuleAction)value, diagnostics, context);
			case AzureCSCfgPackage.SCHEMA_VERSION_OBJECT:
				return validateSchemaVersionObject((SchemaVersion)value, diagnostics, context);
			case AzureCSCfgPackage.THUMBPRINT_ALGORITHM_TYPES_OBJECT:
				return validateThumbprintAlgorithmTypesObject((ThumbprintAlgorithmTypes)value, diagnostics, context);
			case AzureCSCfgPackage.THUMBPRINT_TYPE:
				return validateThumbprintType((String)value, diagnostics, context);
			case AzureCSCfgPackage.VM_NAME_STRING:
				return validateVmNameString((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlElement(AccessControlElement accessControlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessControlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlsElement(AccessControlsElement accessControlsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessControlsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressAssignmentsElement(AddressAssignmentsElement addressAssignmentsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressAssignmentsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificatesType(CertificatesType certificatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationSetting(ConfigurationSetting configurationSetting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationSetting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationSettingsType(ConfigurationSettingsType configurationSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDnsElement(DnsElement dnsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dnsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDnsServerElement(DnsServerElement dnsServerElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dnsServerElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDnsServersElement(DnsServersElement dnsServersElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dnsServersElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointAclsElement(EndpointAclsElement endpointAclsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointAclsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointAclType(EndpointAclType endpointAclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointAclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrontendIPConfigurationElement(FrontendIPConfigurationElement frontendIPConfigurationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frontendIPConfigurationElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuestAgentSettingsElement(GuestAgentSettingsElement guestAgentSettingsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guestAgentSettingsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAddressElement(InstanceAddressElement instanceAddressElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceAddressElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerElement(LoadBalancerElement loadBalancerElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBalancerElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancersElement(LoadBalancersElement loadBalancersElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBalancersElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkConfigurationElement(NetworkConfigurationElement networkConfigurationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkConfigurationElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkSecurityGroupElement(NetworkSecurityGroupElement networkSecurityGroupElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkSecurityGroupElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkSecurityGroupRefElement(NetworkSecurityGroupRefElement networkSecurityGroupRefElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkSecurityGroupRefElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkSecurityGroupRefsElement(NetworkSecurityGroupRefsElement networkSecurityGroupRefsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkSecurityGroupRefsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsImageSetting(OsImageSetting osImageSetting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osImageSetting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicIPElement(PublicIPElement publicIPElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicIPElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicIPsElement(PublicIPsElement publicIPsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicIPsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservedIPElement(ReservedIPElement reservedIPElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservedIPElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservedIPsType(ReservedIPsType reservedIPsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservedIPsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleSettings(RoleSettings roleSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleElement(RuleElement ruleElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfiguration(ServiceConfiguration serviceConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubnetElement(SubnetElement subnetElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subnetElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubnetsElement(SubnetsElement subnetsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subnetsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetSetting(TargetSetting targetSetting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetSetting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualNetworkSiteElement(VirtualNetworkSiteElement virtualNetworkSiteElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualNetworkSiteElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPConfigurationAddressType(IPConfigurationAddressType ipConfigurationAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleAction(RuleAction ruleAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaVersion(SchemaVersion schemaVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbprintAlgorithmTypes(ThumbprintAlgorithmTypes thumbprintAlgorithmTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedLengthString(String boundedLengthString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBoundedLengthString_MaxLength(boundedLengthString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Bounded Length String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedLengthString_MaxLength(String boundedLengthString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = boundedLengthString.length();
		boolean result = length <= 256;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AzureCSCfgPackage.Literals.BOUNDED_LENGTH_STRING, boundedLengthString, length, 256, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressString(String ipAddressString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpAddressString_Pattern(ipAddressString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpAddressString_Pattern
	 */
	public static final  PatternMatcher [][] IP_ADDRESS_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ip Address String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressString_Pattern(String ipAddressString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AzureCSCfgPackage.Literals.IP_ADDRESS_STRING, ipAddressString, IP_ADDRESS_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPConfigurationAddressTypeObject(IPConfigurationAddressType ipConfigurationAddressTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementNameString(String namedElementNameString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNamedElementNameString_Pattern(namedElementNameString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNamedElementNameString_Pattern
	 */
	public static final  PatternMatcher [][] NAMED_ELEMENT_NAME_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^[a-zA-Z_][^\\\\\\/\\:\\*\\?\\\"\\<\\>\\|\\`\\\'\\^]*(?<![\\.\\s])$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Named Element Name String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElementNameString_Pattern(String namedElementNameString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AzureCSCfgPackage.Literals.NAMED_ELEMENT_NAME_STRING, namedElementNameString, NAMED_ELEMENT_NAME_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveInt_Min
	 */
	public static final int POSITIVE_INT__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt_Min(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveInt >= POSITIVE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AzureCSCfgPackage.Literals.POSITIVE_INT, positiveInt, POSITIVE_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntObject(Integer positiveIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveIntObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleActionObject(RuleAction ruleActionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaVersionObject(SchemaVersion schemaVersionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbprintAlgorithmTypesObject(ThumbprintAlgorithmTypes thumbprintAlgorithmTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbprintType(String thumbprintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateThumbprintType_Pattern(thumbprintType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThumbprintType_MinLength(thumbprintType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateThumbprintType_Pattern
	 */
	public static final  PatternMatcher [][] THUMBPRINT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9A-Fa-f\\s]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Thumbprint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbprintType_Pattern(String thumbprintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AzureCSCfgPackage.Literals.THUMBPRINT_TYPE, thumbprintType, THUMBPRINT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Thumbprint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThumbprintType_MinLength(String thumbprintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = thumbprintType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AzureCSCfgPackage.Literals.THUMBPRINT_TYPE, thumbprintType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmNameString(String vmNameString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVmNameString_Pattern(vmNameString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVmNameString_Pattern
	 */
	public static final  PatternMatcher [][] VM_NAME_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^(?![\\-])[a-zA-Z0-9\\-]{1,10}(?<![\\-])$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Vm Name String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmNameString_Pattern(String vmNameString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AzureCSCfgPackage.Literals.VM_NAME_STRING, vmNameString, VM_NAME_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AzureCSCfgValidator

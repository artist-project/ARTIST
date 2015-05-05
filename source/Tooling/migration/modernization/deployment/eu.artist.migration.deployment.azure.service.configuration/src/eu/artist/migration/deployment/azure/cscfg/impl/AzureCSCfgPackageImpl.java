/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AccessControlElement;
import eu.artist.migration.deployment.azure.cscfg.AccessControlsElement;
import eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement;
import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgFactory;
import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.Certificate;
import eu.artist.migration.deployment.azure.cscfg.CertificatesType;
import eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting;
import eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType;
import eu.artist.migration.deployment.azure.cscfg.DnsElement;
import eu.artist.migration.deployment.azure.cscfg.DnsServerElement;
import eu.artist.migration.deployment.azure.cscfg.DnsServersElement;
import eu.artist.migration.deployment.azure.cscfg.DocumentRoot;
import eu.artist.migration.deployment.azure.cscfg.EndpointAclType;
import eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement;
import eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement;
import eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType;
import eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement;
import eu.artist.migration.deployment.azure.cscfg.OsImageSetting;
import eu.artist.migration.deployment.azure.cscfg.PublicIPElement;
import eu.artist.migration.deployment.azure.cscfg.PublicIPsElement;
import eu.artist.migration.deployment.azure.cscfg.ReservedIPElement;
import eu.artist.migration.deployment.azure.cscfg.ReservedIPsType;
import eu.artist.migration.deployment.azure.cscfg.RoleSettings;
import eu.artist.migration.deployment.azure.cscfg.RuleAction;
import eu.artist.migration.deployment.azure.cscfg.RuleElement;
import eu.artist.migration.deployment.azure.cscfg.SchemaVersion;
import eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration;
import eu.artist.migration.deployment.azure.cscfg.SubnetElement;
import eu.artist.migration.deployment.azure.cscfg.SubnetsElement;
import eu.artist.migration.deployment.azure.cscfg.TargetSetting;
import eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes;
import eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement;

import eu.artist.migration.deployment.azure.cscfg.util.AzureCSCfgValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSCfgPackageImpl extends EPackageImpl implements AzureCSCfgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressAssignmentsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsServerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsServersElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointAclsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointAclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontendIPConfigurationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestAgentSettingsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceAddressElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancersElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConfigurationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkSecurityGroupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkSecurityGroupRefElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkSecurityGroupRefsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osImageSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicIPElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicIPsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservedIPElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservedIPsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNetworkSiteElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ipConfigurationAddressTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thumbprintAlgorithmTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boundedLengthStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipConfigurationAddressTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namedElementNameStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ruleActionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schemaVersionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType thumbprintAlgorithmTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType thumbprintTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vmNameStringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AzureCSCfgPackageImpl() {
		super(eNS_URI, AzureCSCfgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AzureCSCfgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AzureCSCfgPackage init() {
		if (isInited) return (AzureCSCfgPackage)EPackage.Registry.INSTANCE.getEPackage(AzureCSCfgPackage.eNS_URI);

		// Obtain or create and register package
		AzureCSCfgPackageImpl theAzureCSCfgPackage = (AzureCSCfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AzureCSCfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AzureCSCfgPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAzureCSCfgPackage.createPackageContents();

		// Initialize created meta-data
		theAzureCSCfgPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAzureCSCfgPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AzureCSCfgValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAzureCSCfgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AzureCSCfgPackage.eNS_URI, theAzureCSCfgPackage);
		return theAzureCSCfgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlElement() {
		return accessControlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControlElement_Rule() {
		return (EReference)accessControlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControlElement_Name() {
		return (EAttribute)accessControlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlsElement() {
		return accessControlsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControlsElement_AccessControl() {
		return (EReference)accessControlsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressAssignmentsElement() {
		return addressAssignmentsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressAssignmentsElement_InstanceAddress() {
		return (EReference)addressAssignmentsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressAssignmentsElement_ReservedIPs() {
		return (EReference)addressAssignmentsElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificate() {
		return certificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificate_Name() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificate_Thumbprint() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificate_ThumbprintAlgorithm() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificatesType() {
		return certificatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCertificatesType_Certificate() {
		return (EReference)certificatesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationSetting() {
		return configurationSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationSetting_Name() {
		return (EAttribute)configurationSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationSetting_Value() {
		return (EAttribute)configurationSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationSettingsType() {
		return configurationSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSettingsType_Setting() {
		return (EReference)configurationSettingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDnsElement() {
		return dnsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDnsElement_DnsServers() {
		return (EReference)dnsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDnsServerElement() {
		return dnsServerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDnsServerElement_IPAddress() {
		return (EAttribute)dnsServerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDnsServerElement_Name() {
		return (EAttribute)dnsServerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDnsServersElement() {
		return dnsServersElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDnsServersElement_DnsServer() {
		return (EReference)dnsServersElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceConfiguration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointAclsElement() {
		return endpointAclsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpointAclsElement_EndpointAcl() {
		return (EReference)endpointAclsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointAclType() {
		return endpointAclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointAclType_AccessControl() {
		return (EAttribute)endpointAclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointAclType_EndPoint() {
		return (EAttribute)endpointAclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointAclType_Role() {
		return (EAttribute)endpointAclTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontendIPConfigurationElement() {
		return frontendIPConfigurationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress() {
		return (EAttribute)frontendIPConfigurationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontendIPConfigurationElement_Subnet() {
		return (EAttribute)frontendIPConfigurationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontendIPConfigurationElement_Type() {
		return (EAttribute)frontendIPConfigurationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestAgentSettingsElement() {
		return guestAgentSettingsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAgentSettingsElement_AllowRoleProcessLocalDumps() {
		return (EAttribute)guestAgentSettingsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart() {
		return (EAttribute)guestAgentSettingsElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceAddressElement() {
		return instanceAddressElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceAddressElement_Subnets() {
		return (EReference)instanceAddressElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceAddressElement_PublicIPs() {
		return (EReference)instanceAddressElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceAddressElement_RoleName() {
		return (EAttribute)instanceAddressElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBalancerElement() {
		return loadBalancerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancerElement_FrontendIPConfiguration() {
		return (EReference)loadBalancerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerElement_Name() {
		return (EAttribute)loadBalancerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBalancersElement() {
		return loadBalancersElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancersElement_LoadBalancer() {
		return (EReference)loadBalancersElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkConfigurationElement() {
		return networkConfigurationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_Dns() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_VirtualNetworkSite() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_AddressAssignments() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_AccessControls() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_EndpointAcls() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_LoadBalancers() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConfigurationElement_NetworkSecurityGroupRefs() {
		return (EReference)networkConfigurationElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkSecurityGroupElement() {
		return networkSecurityGroupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkSecurityGroupElement_Name() {
		return (EAttribute)networkSecurityGroupElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkSecurityGroupRefElement() {
		return networkSecurityGroupRefElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkSecurityGroupRefElement_NetworkSecurityGroup() {
		return (EReference)networkSecurityGroupRefElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkSecurityGroupRefElement_RoleName() {
		return (EAttribute)networkSecurityGroupRefElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkSecurityGroupRefsElement() {
		return networkSecurityGroupRefsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef() {
		return (EReference)networkSecurityGroupRefsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsImageSetting() {
		return osImageSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsImageSetting_Href() {
		return (EAttribute)osImageSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicIPElement() {
		return publicIPElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicIPElement_IdleTimeoutInMinutes() {
		return (EAttribute)publicIPElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicIPElement_Name() {
		return (EAttribute)publicIPElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicIPsElement() {
		return publicIPsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicIPsElement_PublicIP() {
		return (EReference)publicIPsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservedIPElement() {
		return reservedIPElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservedIPElement_Name() {
		return (EAttribute)reservedIPElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservedIPsType() {
		return reservedIPsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservedIPsType_ReservedIP() {
		return (EReference)reservedIPsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSettings() {
		return roleSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSettings_OsImage() {
		return (EReference)roleSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSettings_ConfigurationSettings() {
		return (EReference)roleSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSettings_Instances() {
		return (EReference)roleSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSettings_Certificates() {
		return (EReference)roleSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSettings_Name() {
		return (EAttribute)roleSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSettings_VmName() {
		return (EAttribute)roleSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleElement() {
		return ruleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElement_Action() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElement_Description() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElement_Order() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleElement_RemoteSubnet() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConfiguration() {
		return serviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfiguration_Role() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfiguration_NetworkConfiguration() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfiguration_GuestAgentSettings() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_OsFamily() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_OsVersion() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_SchemaVersion() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_ServiceName() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnetElement() {
		return subnetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnetElement_Name() {
		return (EAttribute)subnetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnetsElement() {
		return subnetsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnetsElement_Subnet() {
		return (EReference)subnetsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetSetting() {
		return targetSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetSetting_Count() {
		return (EAttribute)targetSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNetworkSiteElement() {
		return virtualNetworkSiteElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualNetworkSiteElement_Name() {
		return (EAttribute)virtualNetworkSiteElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIPConfigurationAddressType() {
		return ipConfigurationAddressTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleAction() {
		return ruleActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaVersion() {
		return schemaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThumbprintAlgorithmTypes() {
		return thumbprintAlgorithmTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoundedLengthString() {
		return boundedLengthStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddressString() {
		return ipAddressStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPConfigurationAddressTypeObject() {
		return ipConfigurationAddressTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamedElementNameString() {
		return namedElementNameStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInt() {
		return positiveIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntObject() {
		return positiveIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRuleActionObject() {
		return ruleActionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSchemaVersionObject() {
		return schemaVersionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThumbprintAlgorithmTypesObject() {
		return thumbprintAlgorithmTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThumbprintType() {
		return thumbprintTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVmNameString() {
		return vmNameStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSCfgFactory getAzureCSCfgFactory() {
		return (AzureCSCfgFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accessControlElementEClass = createEClass(ACCESS_CONTROL_ELEMENT);
		createEReference(accessControlElementEClass, ACCESS_CONTROL_ELEMENT__RULE);
		createEAttribute(accessControlElementEClass, ACCESS_CONTROL_ELEMENT__NAME);

		accessControlsElementEClass = createEClass(ACCESS_CONTROLS_ELEMENT);
		createEReference(accessControlsElementEClass, ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL);

		addressAssignmentsElementEClass = createEClass(ADDRESS_ASSIGNMENTS_ELEMENT);
		createEReference(addressAssignmentsElementEClass, ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS);
		createEReference(addressAssignmentsElementEClass, ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS);

		certificateEClass = createEClass(CERTIFICATE);
		createEAttribute(certificateEClass, CERTIFICATE__NAME);
		createEAttribute(certificateEClass, CERTIFICATE__THUMBPRINT);
		createEAttribute(certificateEClass, CERTIFICATE__THUMBPRINT_ALGORITHM);

		certificatesTypeEClass = createEClass(CERTIFICATES_TYPE);
		createEReference(certificatesTypeEClass, CERTIFICATES_TYPE__CERTIFICATE);

		configurationSettingEClass = createEClass(CONFIGURATION_SETTING);
		createEAttribute(configurationSettingEClass, CONFIGURATION_SETTING__NAME);
		createEAttribute(configurationSettingEClass, CONFIGURATION_SETTING__VALUE);

		configurationSettingsTypeEClass = createEClass(CONFIGURATION_SETTINGS_TYPE);
		createEReference(configurationSettingsTypeEClass, CONFIGURATION_SETTINGS_TYPE__SETTING);

		dnsElementEClass = createEClass(DNS_ELEMENT);
		createEReference(dnsElementEClass, DNS_ELEMENT__DNS_SERVERS);

		dnsServerElementEClass = createEClass(DNS_SERVER_ELEMENT);
		createEAttribute(dnsServerElementEClass, DNS_SERVER_ELEMENT__IP_ADDRESS);
		createEAttribute(dnsServerElementEClass, DNS_SERVER_ELEMENT__NAME);

		dnsServersElementEClass = createEClass(DNS_SERVERS_ELEMENT);
		createEReference(dnsServersElementEClass, DNS_SERVERS_ELEMENT__DNS_SERVER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_CONFIGURATION);

		endpointAclsElementEClass = createEClass(ENDPOINT_ACLS_ELEMENT);
		createEReference(endpointAclsElementEClass, ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL);

		endpointAclTypeEClass = createEClass(ENDPOINT_ACL_TYPE);
		createEAttribute(endpointAclTypeEClass, ENDPOINT_ACL_TYPE__ACCESS_CONTROL);
		createEAttribute(endpointAclTypeEClass, ENDPOINT_ACL_TYPE__END_POINT);
		createEAttribute(endpointAclTypeEClass, ENDPOINT_ACL_TYPE__ROLE);

		frontendIPConfigurationElementEClass = createEClass(FRONTEND_IP_CONFIGURATION_ELEMENT);
		createEAttribute(frontendIPConfigurationElementEClass, FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS);
		createEAttribute(frontendIPConfigurationElementEClass, FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET);
		createEAttribute(frontendIPConfigurationElementEClass, FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE);

		guestAgentSettingsElementEClass = createEClass(GUEST_AGENT_SETTINGS_ELEMENT);
		createEAttribute(guestAgentSettingsElementEClass, GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS);
		createEAttribute(guestAgentSettingsElementEClass, GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART);

		instanceAddressElementEClass = createEClass(INSTANCE_ADDRESS_ELEMENT);
		createEReference(instanceAddressElementEClass, INSTANCE_ADDRESS_ELEMENT__SUBNETS);
		createEReference(instanceAddressElementEClass, INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS);
		createEAttribute(instanceAddressElementEClass, INSTANCE_ADDRESS_ELEMENT__ROLE_NAME);

		loadBalancerElementEClass = createEClass(LOAD_BALANCER_ELEMENT);
		createEReference(loadBalancerElementEClass, LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION);
		createEAttribute(loadBalancerElementEClass, LOAD_BALANCER_ELEMENT__NAME);

		loadBalancersElementEClass = createEClass(LOAD_BALANCERS_ELEMENT);
		createEReference(loadBalancersElementEClass, LOAD_BALANCERS_ELEMENT__LOAD_BALANCER);

		networkConfigurationElementEClass = createEClass(NETWORK_CONFIGURATION_ELEMENT);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__DNS);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS);
		createEReference(networkConfigurationElementEClass, NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS);

		networkSecurityGroupElementEClass = createEClass(NETWORK_SECURITY_GROUP_ELEMENT);
		createEAttribute(networkSecurityGroupElementEClass, NETWORK_SECURITY_GROUP_ELEMENT__NAME);

		networkSecurityGroupRefElementEClass = createEClass(NETWORK_SECURITY_GROUP_REF_ELEMENT);
		createEReference(networkSecurityGroupRefElementEClass, NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP);
		createEAttribute(networkSecurityGroupRefElementEClass, NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME);

		networkSecurityGroupRefsElementEClass = createEClass(NETWORK_SECURITY_GROUP_REFS_ELEMENT);
		createEReference(networkSecurityGroupRefsElementEClass, NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF);

		osImageSettingEClass = createEClass(OS_IMAGE_SETTING);
		createEAttribute(osImageSettingEClass, OS_IMAGE_SETTING__HREF);

		publicIPElementEClass = createEClass(PUBLIC_IP_ELEMENT);
		createEAttribute(publicIPElementEClass, PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES);
		createEAttribute(publicIPElementEClass, PUBLIC_IP_ELEMENT__NAME);

		publicIPsElementEClass = createEClass(PUBLIC_IPS_ELEMENT);
		createEReference(publicIPsElementEClass, PUBLIC_IPS_ELEMENT__PUBLIC_IP);

		reservedIPElementEClass = createEClass(RESERVED_IP_ELEMENT);
		createEAttribute(reservedIPElementEClass, RESERVED_IP_ELEMENT__NAME);

		reservedIPsTypeEClass = createEClass(RESERVED_IPS_TYPE);
		createEReference(reservedIPsTypeEClass, RESERVED_IPS_TYPE__RESERVED_IP);

		roleSettingsEClass = createEClass(ROLE_SETTINGS);
		createEReference(roleSettingsEClass, ROLE_SETTINGS__OS_IMAGE);
		createEReference(roleSettingsEClass, ROLE_SETTINGS__CONFIGURATION_SETTINGS);
		createEReference(roleSettingsEClass, ROLE_SETTINGS__INSTANCES);
		createEReference(roleSettingsEClass, ROLE_SETTINGS__CERTIFICATES);
		createEAttribute(roleSettingsEClass, ROLE_SETTINGS__NAME);
		createEAttribute(roleSettingsEClass, ROLE_SETTINGS__VM_NAME);

		ruleElementEClass = createEClass(RULE_ELEMENT);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__ACTION);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__DESCRIPTION);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__ORDER);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__REMOTE_SUBNET);

		serviceConfigurationEClass = createEClass(SERVICE_CONFIGURATION);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__ROLE);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__NETWORK_CONFIGURATION);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__OS_FAMILY);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__OS_VERSION);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__SCHEMA_VERSION);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__SERVICE_NAME);

		subnetElementEClass = createEClass(SUBNET_ELEMENT);
		createEAttribute(subnetElementEClass, SUBNET_ELEMENT__NAME);

		subnetsElementEClass = createEClass(SUBNETS_ELEMENT);
		createEReference(subnetsElementEClass, SUBNETS_ELEMENT__SUBNET);

		targetSettingEClass = createEClass(TARGET_SETTING);
		createEAttribute(targetSettingEClass, TARGET_SETTING__COUNT);

		virtualNetworkSiteElementEClass = createEClass(VIRTUAL_NETWORK_SITE_ELEMENT);
		createEAttribute(virtualNetworkSiteElementEClass, VIRTUAL_NETWORK_SITE_ELEMENT__NAME);

		// Create enums
		ipConfigurationAddressTypeEEnum = createEEnum(IP_CONFIGURATION_ADDRESS_TYPE);
		ruleActionEEnum = createEEnum(RULE_ACTION);
		schemaVersionEEnum = createEEnum(SCHEMA_VERSION);
		thumbprintAlgorithmTypesEEnum = createEEnum(THUMBPRINT_ALGORITHM_TYPES);

		// Create data types
		boundedLengthStringEDataType = createEDataType(BOUNDED_LENGTH_STRING);
		ipAddressStringEDataType = createEDataType(IP_ADDRESS_STRING);
		ipConfigurationAddressTypeObjectEDataType = createEDataType(IP_CONFIGURATION_ADDRESS_TYPE_OBJECT);
		namedElementNameStringEDataType = createEDataType(NAMED_ELEMENT_NAME_STRING);
		positiveIntEDataType = createEDataType(POSITIVE_INT);
		positiveIntObjectEDataType = createEDataType(POSITIVE_INT_OBJECT);
		ruleActionObjectEDataType = createEDataType(RULE_ACTION_OBJECT);
		schemaVersionObjectEDataType = createEDataType(SCHEMA_VERSION_OBJECT);
		thumbprintAlgorithmTypesObjectEDataType = createEDataType(THUMBPRINT_ALGORITHM_TYPES_OBJECT);
		thumbprintTypeEDataType = createEDataType(THUMBPRINT_TYPE);
		vmNameStringEDataType = createEDataType(VM_NAME_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(accessControlElementEClass, AccessControlElement.class, "AccessControlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControlElement_Rule(), this.getRuleElement(), null, "rule", null, 1, 50, AccessControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlElement_Name(), this.getNamedElementNameString(), "name", null, 1, 1, AccessControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlsElementEClass, AccessControlsElement.class, "AccessControlsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControlsElement_AccessControl(), this.getAccessControlElement(), null, "accessControl", null, 0, -1, AccessControlsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressAssignmentsElementEClass, AddressAssignmentsElement.class, "AddressAssignmentsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressAssignmentsElement_InstanceAddress(), this.getInstanceAddressElement(), null, "instanceAddress", null, 0, -1, AddressAssignmentsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressAssignmentsElement_ReservedIPs(), this.getReservedIPsType(), null, "reservedIPs", null, 0, 1, AddressAssignmentsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateEClass, Certificate.class, "Certificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificate_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_Thumbprint(), this.getThumbprintType(), "thumbprint", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_ThumbprintAlgorithm(), this.getThumbprintAlgorithmTypes(), "thumbprintAlgorithm", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificatesTypeEClass, CertificatesType.class, "CertificatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCertificatesType_Certificate(), this.getCertificate(), null, "certificate", null, 0, -1, CertificatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSettingEClass, ConfigurationSetting.class, "ConfigurationSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationSetting_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ConfigurationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationSetting_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, ConfigurationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSettingsTypeEClass, ConfigurationSettingsType.class, "ConfigurationSettingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationSettingsType_Setting(), this.getConfigurationSetting(), null, "setting", null, 0, -1, ConfigurationSettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsElementEClass, DnsElement.class, "DnsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDnsElement_DnsServers(), this.getDnsServersElement(), null, "dnsServers", null, 0, 1, DnsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsServerElementEClass, DnsServerElement.class, "DnsServerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDnsServerElement_IPAddress(), this.getIpAddressString(), "iPAddress", null, 1, 1, DnsServerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDnsServerElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DnsServerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dnsServersElementEClass, DnsServersElement.class, "DnsServersElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDnsServersElement_DnsServer(), this.getDnsServerElement(), null, "dnsServer", null, 1, -1, DnsServersElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceConfiguration(), this.getServiceConfiguration(), null, "serviceConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endpointAclsElementEClass, EndpointAclsElement.class, "EndpointAclsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpointAclsElement_EndpointAcl(), this.getEndpointAclType(), null, "endpointAcl", null, 0, -1, EndpointAclsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointAclTypeEClass, EndpointAclType.class, "EndpointAclType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointAclType_AccessControl(), this.getNamedElementNameString(), "accessControl", null, 1, 1, EndpointAclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointAclType_EndPoint(), this.getNamedElementNameString(), "endPoint", null, 1, 1, EndpointAclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointAclType_Role(), this.getNamedElementNameString(), "role", null, 1, 1, EndpointAclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frontendIPConfigurationElementEClass, FrontendIPConfigurationElement.class, "FrontendIPConfigurationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress(), this.getIpAddressString(), "staticVirtualNetworkIPAddress", null, 0, 1, FrontendIPConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontendIPConfigurationElement_Subnet(), this.getNamedElementNameString(), "subnet", null, 0, 1, FrontendIPConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrontendIPConfigurationElement_Type(), this.getIPConfigurationAddressType(), "type", null, 1, 1, FrontendIPConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestAgentSettingsElementEClass, GuestAgentSettingsElement.class, "GuestAgentSettingsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuestAgentSettingsElement_AllowRoleProcessLocalDumps(), theXMLTypePackage.getBoolean(), "allowRoleProcessLocalDumps", "false", 0, 1, GuestAgentSettingsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart(), theXMLTypePackage.getBoolean(), "cleanupFirewallOnRoleRestart", "true", 0, 1, GuestAgentSettingsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceAddressElementEClass, InstanceAddressElement.class, "InstanceAddressElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceAddressElement_Subnets(), this.getSubnetsElement(), null, "subnets", null, 0, 1, InstanceAddressElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceAddressElement_PublicIPs(), this.getPublicIPsElement(), null, "publicIPs", null, 0, 1, InstanceAddressElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceAddressElement_RoleName(), theXMLTypePackage.getString(), "roleName", null, 1, 1, InstanceAddressElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBalancerElementEClass, LoadBalancerElement.class, "LoadBalancerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadBalancerElement_FrontendIPConfiguration(), this.getFrontendIPConfigurationElement(), null, "frontendIPConfiguration", null, 1, 1, LoadBalancerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerElement_Name(), this.getNamedElementNameString(), "name", null, 1, 1, LoadBalancerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBalancersElementEClass, LoadBalancersElement.class, "LoadBalancersElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadBalancersElement_LoadBalancer(), this.getLoadBalancerElement(), null, "loadBalancer", null, 1, -1, LoadBalancersElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkConfigurationElementEClass, NetworkConfigurationElement.class, "NetworkConfigurationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkConfigurationElement_Dns(), this.getDnsElement(), null, "dns", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_VirtualNetworkSite(), this.getVirtualNetworkSiteElement(), null, "virtualNetworkSite", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_AddressAssignments(), this.getAddressAssignmentsElement(), null, "addressAssignments", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_AccessControls(), this.getAccessControlsElement(), null, "accessControls", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_EndpointAcls(), this.getEndpointAclsElement(), null, "endpointAcls", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_LoadBalancers(), this.getLoadBalancersElement(), null, "loadBalancers", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConfigurationElement_NetworkSecurityGroupRefs(), this.getNetworkSecurityGroupRefsElement(), null, "networkSecurityGroupRefs", null, 0, 1, NetworkConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkSecurityGroupElementEClass, NetworkSecurityGroupElement.class, "NetworkSecurityGroupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkSecurityGroupElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NetworkSecurityGroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkSecurityGroupRefElementEClass, NetworkSecurityGroupRefElement.class, "NetworkSecurityGroupRefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkSecurityGroupRefElement_NetworkSecurityGroup(), this.getNetworkSecurityGroupElement(), null, "networkSecurityGroup", null, 1, 1, NetworkSecurityGroupRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkSecurityGroupRefElement_RoleName(), theXMLTypePackage.getString(), "roleName", null, 1, 1, NetworkSecurityGroupRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkSecurityGroupRefsElementEClass, NetworkSecurityGroupRefsElement.class, "NetworkSecurityGroupRefsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef(), this.getNetworkSecurityGroupRefElement(), null, "networkSecurityGroupRef", null, 0, -1, NetworkSecurityGroupRefsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osImageSettingEClass, OsImageSetting.class, "OsImageSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsImageSetting_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, OsImageSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicIPElementEClass, PublicIPElement.class, "PublicIPElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicIPElement_IdleTimeoutInMinutes(), this.getPositiveInt(), "idleTimeoutInMinutes", null, 0, 1, PublicIPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicIPElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PublicIPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicIPsElementEClass, PublicIPsElement.class, "PublicIPsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicIPsElement_PublicIP(), this.getPublicIPElement(), null, "publicIP", null, 0, 1, PublicIPsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservedIPElementEClass, ReservedIPElement.class, "ReservedIPElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservedIPElement_Name(), this.getNamedElementNameString(), "name", null, 1, 1, ReservedIPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservedIPsTypeEClass, ReservedIPsType.class, "ReservedIPsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservedIPsType_ReservedIP(), this.getReservedIPElement(), null, "reservedIP", null, 1, 1, ReservedIPsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleSettingsEClass, RoleSettings.class, "RoleSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleSettings_OsImage(), this.getOsImageSetting(), null, "osImage", null, 0, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSettings_ConfigurationSettings(), this.getConfigurationSettingsType(), null, "configurationSettings", null, 0, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSettings_Instances(), this.getTargetSetting(), null, "instances", null, 1, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSettings_Certificates(), this.getCertificatesType(), null, "certificates", null, 0, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleSettings_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleSettings_VmName(), this.getVmNameString(), "vmName", null, 0, 1, RoleSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleElementEClass, RuleElement.class, "RuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleElement_Action(), this.getRuleAction(), "action", null, 1, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleElement_Description(), this.getBoundedLengthString(), "description", null, 0, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleElement_Order(), theXMLTypePackage.getUnsignedShort(), "order", null, 1, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleElement_RemoteSubnet(), theXMLTypePackage.getString(), "remoteSubnet", null, 1, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigurationEClass, ServiceConfiguration.class, "ServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConfiguration_Role(), this.getRoleSettings(), null, "role", null, 0, -1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfiguration_NetworkConfiguration(), this.getNetworkConfigurationElement(), null, "networkConfiguration", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfiguration_GuestAgentSettings(), this.getGuestAgentSettingsElement(), null, "guestAgentSettings", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_OsFamily(), theXMLTypePackage.getString(), "osFamily", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_OsVersion(), theXMLTypePackage.getString(), "osVersion", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_SchemaVersion(), this.getSchemaVersion(), "schemaVersion", "unspecified", 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_ServiceName(), theXMLTypePackage.getString(), "serviceName", null, 1, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetElementEClass, SubnetElement.class, "SubnetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnetElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubnetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetsElementEClass, SubnetsElement.class, "SubnetsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubnetsElement_Subnet(), this.getSubnetElement(), null, "subnet", null, 0, -1, SubnetsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetSettingEClass, TargetSetting.class, "TargetSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetSetting_Count(), theXMLTypePackage.getInt(), "count", null, 1, 1, TargetSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualNetworkSiteElementEClass, VirtualNetworkSiteElement.class, "VirtualNetworkSiteElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualNetworkSiteElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, VirtualNetworkSiteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ipConfigurationAddressTypeEEnum, IPConfigurationAddressType.class, "IPConfigurationAddressType");
		addEEnumLiteral(ipConfigurationAddressTypeEEnum, IPConfigurationAddressType.PRIVATE);

		initEEnum(ruleActionEEnum, RuleAction.class, "RuleAction");
		addEEnumLiteral(ruleActionEEnum, RuleAction.PERMIT);
		addEEnumLiteral(ruleActionEEnum, RuleAction.DENY);

		initEEnum(schemaVersionEEnum, SchemaVersion.class, "SchemaVersion");
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion._20140624);
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion.UNSPECIFIED);

		initEEnum(thumbprintAlgorithmTypesEEnum, ThumbprintAlgorithmTypes.class, "ThumbprintAlgorithmTypes");
		addEEnumLiteral(thumbprintAlgorithmTypesEEnum, ThumbprintAlgorithmTypes.SHA1);

		// Initialize data types
		initEDataType(boundedLengthStringEDataType, String.class, "BoundedLengthString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressStringEDataType, String.class, "IpAddressString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipConfigurationAddressTypeObjectEDataType, IPConfigurationAddressType.class, "IPConfigurationAddressTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(namedElementNameStringEDataType, String.class, "NamedElementNameString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntEDataType, int.class, "PositiveInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntObjectEDataType, Integer.class, "PositiveIntObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ruleActionObjectEDataType, RuleAction.class, "RuleActionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schemaVersionObjectEDataType, SchemaVersion.class, "SchemaVersionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(thumbprintAlgorithmTypesObjectEDataType, ThumbprintAlgorithmTypes.class, "ThumbprintAlgorithmTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(thumbprintTypeEDataType, String.class, "ThumbprintType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vmNameStringEDataType, String.class, "VmNameString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (accessControlElementEClass, 
		   source, 
		   new String[] {
			 "name", "AccessControlElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAccessControlElement_Rule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Rule",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAccessControlElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (accessControlsElementEClass, 
		   source, 
		   new String[] {
			 "name", "AccessControlsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAccessControlsElement_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccessControl",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (addressAssignmentsElementEClass, 
		   source, 
		   new String[] {
			 "name", "AddressAssignmentsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAddressAssignmentsElement_InstanceAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InstanceAddress",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAddressAssignmentsElement_ReservedIPs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReservedIPs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (boundedLengthStringEDataType, 
		   source, 
		   new String[] {
			 "name", "BoundedLengthString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "256"
		   });	
		addAnnotation
		  (certificateEClass, 
		   source, 
		   new String[] {
			 "name", "Certificate",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCertificate_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getCertificate_Thumbprint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thumbprint"
		   });	
		addAnnotation
		  (getCertificate_ThumbprintAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thumbprintAlgorithm"
		   });	
		addAnnotation
		  (certificatesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Certificates_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCertificatesType_Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificate",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (configurationSettingEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationSetting",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConfigurationSetting_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getConfigurationSetting_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (configurationSettingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationSettings_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConfigurationSettingsType_Setting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Setting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dnsElementEClass, 
		   source, 
		   new String[] {
			 "name", "DnsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDnsElement_DnsServers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DnsServers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dnsServerElementEClass, 
		   source, 
		   new String[] {
			 "name", "DnsServerElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDnsServerElement_IPAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IPAddress"
		   });	
		addAnnotation
		  (getDnsServerElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (dnsServersElementEClass, 
		   source, 
		   new String[] {
			 "name", "DnsServersElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDnsServersElement_DnsServer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DnsServer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_ServiceConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceConfiguration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (endpointAclsElementEClass, 
		   source, 
		   new String[] {
			 "name", "EndpointAclsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEndpointAclsElement_EndpointAcl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndpointAcl",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (endpointAclTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EndpointAcl_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEndpointAclType_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accessControl"
		   });	
		addAnnotation
		  (getEndpointAclType_EndPoint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endPoint"
		   });	
		addAnnotation
		  (getEndpointAclType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role"
		   });	
		addAnnotation
		  (frontendIPConfigurationElementEClass, 
		   source, 
		   new String[] {
			 "name", "FrontendIPConfigurationElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "staticVirtualNetworkIPAddress"
		   });	
		addAnnotation
		  (getFrontendIPConfigurationElement_Subnet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subnet"
		   });	
		addAnnotation
		  (getFrontendIPConfigurationElement_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (guestAgentSettingsElementEClass, 
		   source, 
		   new String[] {
			 "name", "GuestAgentSettingsElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getGuestAgentSettingsElement_AllowRoleProcessLocalDumps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "allowRoleProcessLocalDumps"
		   });	
		addAnnotation
		  (getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cleanupFirewallOnRoleRestart"
		   });	
		addAnnotation
		  (instanceAddressElementEClass, 
		   source, 
		   new String[] {
			 "name", "InstanceAddressElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInstanceAddressElement_Subnets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subnets",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstanceAddressElement_PublicIPs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PublicIPs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstanceAddressElement_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleName"
		   });	
		addAnnotation
		  (ipAddressStringEDataType, 
		   source, 
		   new String[] {
			 "name", "IpAddressString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])"
		   });	
		addAnnotation
		  (ipConfigurationAddressTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "IPConfigurationAddressType"
		   });	
		addAnnotation
		  (ipConfigurationAddressTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "IPConfigurationAddressType:Object",
			 "baseType", "IPConfigurationAddressType"
		   });	
		addAnnotation
		  (loadBalancerElementEClass, 
		   source, 
		   new String[] {
			 "name", "LoadBalancerElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLoadBalancerElement_FrontendIPConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FrontendIPConfiguration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLoadBalancerElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (loadBalancersElementEClass, 
		   source, 
		   new String[] {
			 "name", "LoadBalancersElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLoadBalancersElement_LoadBalancer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoadBalancer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (namedElementNameStringEDataType, 
		   source, 
		   new String[] {
			 "name", "NamedElementNameString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "^[a-zA-Z_][^\\\\\\/\\:\\*\\?\\\"\\<\\>\\|\\`\\\'\\^]*(?<![\\.\\s])$"
		   });	
		addAnnotation
		  (networkConfigurationElementEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkConfigurationElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_Dns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Dns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_VirtualNetworkSite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VirtualNetworkSite",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_AddressAssignments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressAssignments",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_AccessControls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccessControls",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_EndpointAcls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndpointAcls",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_LoadBalancers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoadBalancers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkConfigurationElement_NetworkSecurityGroupRefs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkSecurityGroupRefs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (networkSecurityGroupElementEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkSecurityGroupElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getNetworkSecurityGroupElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (networkSecurityGroupRefElementEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkSecurityGroupRefElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkSecurityGroupRefElement_NetworkSecurityGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkSecurityGroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNetworkSecurityGroupRefElement_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleName"
		   });	
		addAnnotation
		  (networkSecurityGroupRefsElementEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkSecurityGroupRefsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkSecurityGroupRef",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (osImageSettingEClass, 
		   source, 
		   new String[] {
			 "name", "OsImageSetting",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOsImageSetting_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });	
		addAnnotation
		  (positiveIntEDataType, 
		   source, 
		   new String[] {
			 "name", "PositiveInt",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1"
		   });	
		addAnnotation
		  (positiveIntObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PositiveInt:Object",
			 "baseType", "PositiveInt"
		   });	
		addAnnotation
		  (publicIPElementEClass, 
		   source, 
		   new String[] {
			 "name", "PublicIPElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPublicIPElement_IdleTimeoutInMinutes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idleTimeoutInMinutes"
		   });	
		addAnnotation
		  (getPublicIPElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (publicIPsElementEClass, 
		   source, 
		   new String[] {
			 "name", "PublicIPsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPublicIPsElement_PublicIP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PublicIP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (reservedIPElementEClass, 
		   source, 
		   new String[] {
			 "name", "ReservedIPElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getReservedIPElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (reservedIPsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReservedIPs_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReservedIPsType_ReservedIP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReservedIP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (roleSettingsEClass, 
		   source, 
		   new String[] {
			 "name", "RoleSettings",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRoleSettings_OsImage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OsImage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleSettings_ConfigurationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConfigurationSettings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleSettings_Instances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleSettings_Certificates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificates",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleSettings_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getRoleSettings_VmName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vmName"
		   });	
		addAnnotation
		  (ruleActionEEnum, 
		   source, 
		   new String[] {
			 "name", "RuleAction"
		   });	
		addAnnotation
		  (ruleActionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RuleAction:Object",
			 "baseType", "RuleAction"
		   });	
		addAnnotation
		  (ruleElementEClass, 
		   source, 
		   new String[] {
			 "name", "RuleElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRuleElement_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action"
		   });	
		addAnnotation
		  (getRuleElement_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });	
		addAnnotation
		  (getRuleElement_Order(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "order"
		   });	
		addAnnotation
		  (getRuleElement_RemoteSubnet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSubnet"
		   });	
		addAnnotation
		  (schemaVersionEEnum, 
		   source, 
		   new String[] {
			 "name", "SchemaVersion"
		   });	
		addAnnotation
		  (schemaVersionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SchemaVersion:Object",
			 "baseType", "SchemaVersion"
		   });	
		addAnnotation
		  (serviceConfigurationEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceConfiguration",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getServiceConfiguration_Role(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Role",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceConfiguration_NetworkConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkConfiguration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceConfiguration_GuestAgentSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GuestAgentSettings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceConfiguration_OsFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osFamily"
		   });	
		addAnnotation
		  (getServiceConfiguration_OsVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osVersion"
		   });	
		addAnnotation
		  (getServiceConfiguration_SchemaVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schemaVersion"
		   });	
		addAnnotation
		  (getServiceConfiguration_ServiceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceName"
		   });	
		addAnnotation
		  (subnetElementEClass, 
		   source, 
		   new String[] {
			 "name", "SubnetElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSubnetElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (subnetsElementEClass, 
		   source, 
		   new String[] {
			 "name", "SubnetsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubnetsElement_Subnet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subnet",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (targetSettingEClass, 
		   source, 
		   new String[] {
			 "name", "TargetSetting",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTargetSetting_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });	
		addAnnotation
		  (thumbprintAlgorithmTypesEEnum, 
		   source, 
		   new String[] {
			 "name", "ThumbprintAlgorithmTypes"
		   });	
		addAnnotation
		  (thumbprintAlgorithmTypesObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ThumbprintAlgorithmTypes:Object",
			 "baseType", "ThumbprintAlgorithmTypes"
		   });	
		addAnnotation
		  (thumbprintTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ThumbprintType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "pattern", "[0-9A-Fa-f\\s]*"
		   });	
		addAnnotation
		  (virtualNetworkSiteElementEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualNetworkSiteElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getVirtualNetworkSiteElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (vmNameStringEDataType, 
		   source, 
		   new String[] {
			 "name", "VmNameString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "^(?![\\-])[a-zA-Z0-9\\-]{1,10}(?<![\\-])$"
		   });
	}

} //AzureCSCfgPackageImpl

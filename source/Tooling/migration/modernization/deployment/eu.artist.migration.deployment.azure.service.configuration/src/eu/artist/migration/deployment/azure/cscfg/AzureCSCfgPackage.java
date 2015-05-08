/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgFactory
 * @model kind="package"
 * @generated
 */
public interface AzureCSCfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cscfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/ServiceHosting/2008/10/ServiceConfiguration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cscfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AzureCSCfgPackage eINSTANCE = eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AccessControlElementImpl <em>Access Control Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AccessControlElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAccessControlElement()
	 * @generated
	 */
	int ACCESS_CONTROL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_ELEMENT__RULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Access Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Access Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AccessControlsElementImpl <em>Access Controls Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AccessControlsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAccessControlsElement()
	 * @generated
	 */
	int ACCESS_CONTROLS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL = 0;

	/**
	 * The number of structural features of the '<em>Access Controls Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Access Controls Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl <em>Address Assignments Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAddressAssignmentsElement()
	 * @generated
	 */
	int ADDRESS_ASSIGNMENTS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Instance Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Reserved IPs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS = 1;

	/**
	 * The number of structural features of the '<em>Address Assignments Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_ASSIGNMENTS_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Address Assignments Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_ASSIGNMENTS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Thumbprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__THUMBPRINT = 1;

	/**
	 * The feature id for the '<em><b>Thumbprint Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__THUMBPRINT_ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificatesTypeImpl <em>Certificates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.CertificatesTypeImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getCertificatesType()
	 * @generated
	 */
	int CERTIFICATES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_TYPE__CERTIFICATE = 0;

	/**
	 * The number of structural features of the '<em>Certificates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Certificates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingImpl <em>Configuration Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getConfigurationSetting()
	 * @generated
	 */
	int CONFIGURATION_SETTING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Configuration Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingsTypeImpl <em>Configuration Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingsTypeImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getConfigurationSettingsType()
	 * @generated
	 */
	int CONFIGURATION_SETTINGS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS_TYPE__SETTING = 0;

	/**
	 * The number of structural features of the '<em>Configuration Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsElementImpl <em>Dns Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsElement()
	 * @generated
	 */
	int DNS_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Dns Servers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_ELEMENT__DNS_SERVERS = 0;

	/**
	 * The number of structural features of the '<em>Dns Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dns Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsServerElementImpl <em>Dns Server Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsServerElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsServerElement()
	 * @generated
	 */
	int DNS_SERVER_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVER_ELEMENT__IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVER_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Dns Server Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dns Server Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsServersElementImpl <em>Dns Servers Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsServersElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsServersElement()
	 * @generated
	 */
	int DNS_SERVERS_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Dns Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVERS_ELEMENT__DNS_SERVER = 0;

	/**
	 * The number of structural features of the '<em>Dns Servers Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVERS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dns Servers Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNS_SERVERS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.DocumentRootImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Service Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclsElementImpl <em>Endpoint Acls Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getEndpointAclsElement()
	 * @generated
	 */
	int ENDPOINT_ACLS_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Endpoint Acl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL = 0;

	/**
	 * The number of structural features of the '<em>Endpoint Acls Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACLS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Endpoint Acls Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACLS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclTypeImpl <em>Endpoint Acl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclTypeImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getEndpointAclType()
	 * @generated
	 */
	int ENDPOINT_ACL_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACL_TYPE__ACCESS_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACL_TYPE__END_POINT = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACL_TYPE__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Endpoint Acl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Endpoint Acl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_ACL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl <em>Frontend IP Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getFrontendIPConfigurationElement()
	 * @generated
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Static Virtual Network IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Frontend IP Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Frontend IP Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_IP_CONFIGURATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl <em>Guest Agent Settings Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getGuestAgentSettingsElement()
	 * @generated
	 */
	int GUEST_AGENT_SETTINGS_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Allow Role Process Local Dumps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS = 0;

	/**
	 * The feature id for the '<em><b>Cleanup Firewall On Role Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART = 1;

	/**
	 * The number of structural features of the '<em>Guest Agent Settings Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_AGENT_SETTINGS_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Guest Agent Settings Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_AGENT_SETTINGS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl <em>Instance Address Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getInstanceAddressElement()
	 * @generated
	 */
	int INSTANCE_ADDRESS_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADDRESS_ELEMENT__SUBNETS = 0;

	/**
	 * The feature id for the '<em><b>Public IPs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS = 1;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADDRESS_ELEMENT__ROLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Instance Address Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADDRESS_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instance Address Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ADDRESS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl <em>Load Balancer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getLoadBalancerElement()
	 * @generated
	 */
	int LOAD_BALANCER_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Frontend IP Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Load Balancer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Load Balancer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancersElementImpl <em>Load Balancers Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancersElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getLoadBalancersElement()
	 * @generated
	 */
	int LOAD_BALANCERS_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Load Balancer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCERS_ELEMENT__LOAD_BALANCER = 0;

	/**
	 * The number of structural features of the '<em>Load Balancers Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCERS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Balancers Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCERS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl <em>Network Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkConfigurationElement()
	 * @generated
	 */
	int NETWORK_CONFIGURATION_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Dns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__DNS = 0;

	/**
	 * The feature id for the '<em><b>Virtual Network Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE = 1;

	/**
	 * The feature id for the '<em><b>Address Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS = 2;

	/**
	 * The feature id for the '<em><b>Access Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS = 3;

	/**
	 * The feature id for the '<em><b>Endpoint Acls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS = 4;

	/**
	 * The feature id for the '<em><b>Load Balancers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS = 5;

	/**
	 * The feature id for the '<em><b>Network Security Group Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS = 6;

	/**
	 * The number of structural features of the '<em>Network Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Network Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONFIGURATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupElementImpl <em>Network Security Group Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupElement()
	 * @generated
	 */
	int NETWORK_SECURITY_GROUP_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Network Security Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Security Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl <em>Network Security Group Ref Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupRefElement()
	 * @generated
	 */
	int NETWORK_SECURITY_GROUP_REF_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Network Security Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Network Security Group Ref Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REF_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Security Group Ref Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefsElementImpl <em>Network Security Group Refs Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupRefsElement()
	 * @generated
	 */
	int NETWORK_SECURITY_GROUP_REFS_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Network Security Group Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF = 0;

	/**
	 * The number of structural features of the '<em>Network Security Group Refs Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REFS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Security Group Refs Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SECURITY_GROUP_REFS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.OsImageSettingImpl <em>Os Image Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.OsImageSettingImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getOsImageSetting()
	 * @generated
	 */
	int OS_IMAGE_SETTING = 22;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IMAGE_SETTING__HREF = 0;

	/**
	 * The number of structural features of the '<em>Os Image Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IMAGE_SETTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Os Image Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_IMAGE_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl <em>Public IP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPublicIPElement()
	 * @generated
	 */
	int PUBLIC_IP_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IP_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Public IP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IP_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Public IP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPsElementImpl <em>Public IPs Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.PublicIPsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPublicIPsElement()
	 * @generated
	 */
	int PUBLIC_IPS_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Public IP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IPS_ELEMENT__PUBLIC_IP = 0;

	/**
	 * The number of structural features of the '<em>Public IPs Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IPS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Public IPs Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_IPS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPElementImpl <em>Reserved IP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getReservedIPElement()
	 * @generated
	 */
	int RESERVED_IP_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IP_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reserved IP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IP_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reserved IP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPsTypeImpl <em>Reserved IPs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPsTypeImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getReservedIPsType()
	 * @generated
	 */
	int RESERVED_IPS_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Reserved IP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IPS_TYPE__RESERVED_IP = 0;

	/**
	 * The number of structural features of the '<em>Reserved IPs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reserved IPs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_IPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl <em>Role Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRoleSettings()
	 * @generated
	 */
	int ROLE_SETTINGS = 27;

	/**
	 * The feature id for the '<em><b>Os Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__OS_IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__CONFIGURATION_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__CERTIFICATES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__NAME = 4;

	/**
	 * The feature id for the '<em><b>Vm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS__VM_NAME = 5;

	/**
	 * The number of structural features of the '<em>Role Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Role Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.RuleElementImpl <em>Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.RuleElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleElement()
	 * @generated
	 */
	int RULE_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Remote Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__REMOTE_SUBNET = 3;

	/**
	 * The number of structural features of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getServiceConfiguration()
	 * @generated
	 */
	int SERVICE_CONFIGURATION = 29;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Network Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__NETWORK_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Guest Agent Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Os Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__OS_FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__OS_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__SCHEMA_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__SERVICE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.SubnetElementImpl <em>Subnet Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.SubnetElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSubnetElement()
	 * @generated
	 */
	int SUBNET_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Subnet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subnet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.SubnetsElementImpl <em>Subnets Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.SubnetsElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSubnetsElement()
	 * @generated
	 */
	int SUBNETS_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETS_ELEMENT__SUBNET = 0;

	/**
	 * The number of structural features of the '<em>Subnets Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subnets Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.TargetSettingImpl <em>Target Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.TargetSettingImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getTargetSetting()
	 * @generated
	 */
	int TARGET_SETTING = 32;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SETTING__COUNT = 0;

	/**
	 * The number of structural features of the '<em>Target Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SETTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.VirtualNetworkSiteElementImpl <em>Virtual Network Site Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.VirtualNetworkSiteElementImpl
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getVirtualNetworkSiteElement()
	 * @generated
	 */
	int VIRTUAL_NETWORK_SITE_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_SITE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Virtual Network Site Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_SITE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Virtual Network Site Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_SITE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType <em>IP Configuration Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIPConfigurationAddressType()
	 * @generated
	 */
	int IP_CONFIGURATION_ADDRESS_TYPE = 34;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.RuleAction <em>Rule Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleAction()
	 * @generated
	 */
	int RULE_ACTION = 35;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.SchemaVersion <em>Schema Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 36;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes <em>Thumbprint Algorithm Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintAlgorithmTypes()
	 * @generated
	 */
	int THUMBPRINT_ALGORITHM_TYPES = 37;

	/**
	 * The meta object id for the '<em>Bounded Length String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getBoundedLengthString()
	 * @generated
	 */
	int BOUNDED_LENGTH_STRING = 38;

	/**
	 * The meta object id for the '<em>Ip Address String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIpAddressString()
	 * @generated
	 */
	int IP_ADDRESS_STRING = 39;

	/**
	 * The meta object id for the '<em>IP Configuration Address Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIPConfigurationAddressTypeObject()
	 * @generated
	 */
	int IP_CONFIGURATION_ADDRESS_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Named Element Name String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNamedElementNameString()
	 * @generated
	 */
	int NAMED_ELEMENT_NAME_STRING = 41;

	/**
	 * The meta object id for the '<em>Positive Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 42;

	/**
	 * The meta object id for the '<em>Positive Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPositiveIntObject()
	 * @generated
	 */
	int POSITIVE_INT_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Rule Action Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleActionObject()
	 * @generated
	 */
	int RULE_ACTION_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Schema Version Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSchemaVersionObject()
	 * @generated
	 */
	int SCHEMA_VERSION_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Thumbprint Algorithm Types Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintAlgorithmTypesObject()
	 * @generated
	 */
	int THUMBPRINT_ALGORITHM_TYPES_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Thumbprint Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintType()
	 * @generated
	 */
	int THUMBPRINT_TYPE = 47;

	/**
	 * The meta object id for the '<em>Vm Name String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getVmNameString()
	 * @generated
	 */
	int VM_NAME_STRING = 48;


	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlElement <em>Access Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlElement
	 * @generated
	 */
	EClass getAccessControlElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlElement#getRule()
	 * @see #getAccessControlElement()
	 * @generated
	 */
	EReference getAccessControlElement_Rule();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlElement#getName()
	 * @see #getAccessControlElement()
	 * @generated
	 */
	EAttribute getAccessControlElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlsElement <em>Access Controls Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Controls Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlsElement
	 * @generated
	 */
	EClass getAccessControlsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.AccessControlsElement#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Control</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AccessControlsElement#getAccessControl()
	 * @see #getAccessControlsElement()
	 * @generated
	 */
	EReference getAccessControlsElement_AccessControl();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement <em>Address Assignments Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Assignments Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement
	 * @generated
	 */
	EClass getAddressAssignmentsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getInstanceAddress <em>Instance Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Address</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getInstanceAddress()
	 * @see #getAddressAssignmentsElement()
	 * @generated
	 */
	EReference getAddressAssignmentsElement_InstanceAddress();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getReservedIPs <em>Reserved IPs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserved IPs</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement#getReservedIPs()
	 * @see #getAddressAssignmentsElement()
	 * @generated
	 */
	EReference getAddressAssignmentsElement_ReservedIPs();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.Certificate#getName()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprint <em>Thumbprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbprint</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprint()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Thumbprint();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbprint Algorithm</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_ThumbprintAlgorithm();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.CertificatesType <em>Certificates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificates Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.CertificatesType
	 * @generated
	 */
	EClass getCertificatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.CertificatesType#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificate</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.CertificatesType#getCertificate()
	 * @see #getCertificatesType()
	 * @generated
	 */
	EReference getCertificatesType_Certificate();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting <em>Configuration Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting
	 * @generated
	 */
	EClass getConfigurationSetting();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting#getName()
	 * @see #getConfigurationSetting()
	 * @generated
	 */
	EAttribute getConfigurationSetting_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSetting#getValue()
	 * @see #getConfigurationSetting()
	 * @generated
	 */
	EAttribute getConfigurationSetting_Value();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType <em>Configuration Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Settings Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType
	 * @generated
	 */
	EClass getConfigurationSettingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType#getSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType#getSetting()
	 * @see #getConfigurationSettingsType()
	 * @generated
	 */
	EReference getConfigurationSettingsType_Setting();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.DnsElement <em>Dns Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsElement
	 * @generated
	 */
	EClass getDnsElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.DnsElement#getDnsServers <em>Dns Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dns Servers</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsElement#getDnsServers()
	 * @see #getDnsElement()
	 * @generated
	 */
	EReference getDnsElement_DnsServers();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.DnsServerElement <em>Dns Server Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Server Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServerElement
	 * @generated
	 */
	EClass getDnsServerElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.DnsServerElement#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServerElement#getIPAddress()
	 * @see #getDnsServerElement()
	 * @generated
	 */
	EAttribute getDnsServerElement_IPAddress();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.DnsServerElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServerElement#getName()
	 * @see #getDnsServerElement()
	 * @generated
	 */
	EAttribute getDnsServerElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.DnsServersElement <em>Dns Servers Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dns Servers Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServersElement
	 * @generated
	 */
	EClass getDnsServersElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.DnsServersElement#getDnsServer <em>Dns Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dns Server</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DnsServersElement#getDnsServer()
	 * @see #getDnsServersElement()
	 * @generated
	 */
	EReference getDnsServersElement_DnsServer();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.DocumentRoot#getServiceConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceConfiguration();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement <em>Endpoint Acls Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Acls Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement
	 * @generated
	 */
	EClass getEndpointAclsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement#getEndpointAcl <em>Endpoint Acl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint Acl</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement#getEndpointAcl()
	 * @see #getEndpointAclsElement()
	 * @generated
	 */
	EReference getEndpointAclsElement_EndpointAcl();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType <em>Endpoint Acl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Acl Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclType
	 * @generated
	 */
	EClass getEndpointAclType();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Control</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getAccessControl()
	 * @see #getEndpointAclType()
	 * @generated
	 */
	EAttribute getEndpointAclType_AccessControl();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getEndPoint()
	 * @see #getEndpointAclType()
	 * @generated
	 */
	EAttribute getEndpointAclType_EndPoint();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getRole()
	 * @see #getEndpointAclType()
	 * @generated
	 */
	EAttribute getEndpointAclType_Role();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement <em>Frontend IP Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frontend IP Configuration Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement
	 * @generated
	 */
	EClass getFrontendIPConfigurationElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getStaticVirtualNetworkIPAddress <em>Static Virtual Network IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Virtual Network IP Address</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getStaticVirtualNetworkIPAddress()
	 * @see #getFrontendIPConfigurationElement()
	 * @generated
	 */
	EAttribute getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getSubnet()
	 * @see #getFrontendIPConfigurationElement()
	 * @generated
	 */
	EAttribute getFrontendIPConfigurationElement_Subnet();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement#getType()
	 * @see #getFrontendIPConfigurationElement()
	 * @generated
	 */
	EAttribute getFrontendIPConfigurationElement_Type();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement <em>Guest Agent Settings Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Agent Settings Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement
	 * @generated
	 */
	EClass getGuestAgentSettingsElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Role Process Local Dumps</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps()
	 * @see #getGuestAgentSettingsElement()
	 * @generated
	 */
	EAttribute getGuestAgentSettingsElement_AllowRoleProcessLocalDumps();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleanup Firewall On Role Restart</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart()
	 * @see #getGuestAgentSettingsElement()
	 * @generated
	 */
	EAttribute getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement <em>Instance Address Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Address Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement
	 * @generated
	 */
	EClass getInstanceAddressElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subnets</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getSubnets()
	 * @see #getInstanceAddressElement()
	 * @generated
	 */
	EReference getInstanceAddressElement_Subnets();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getPublicIPs <em>Public IPs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Public IPs</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getPublicIPs()
	 * @see #getInstanceAddressElement()
	 * @generated
	 */
	EReference getInstanceAddressElement_PublicIPs();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement#getRoleName()
	 * @see #getInstanceAddressElement()
	 * @generated
	 */
	EAttribute getInstanceAddressElement_RoleName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement <em>Load Balancer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement
	 * @generated
	 */
	EClass getLoadBalancerElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getFrontendIPConfiguration <em>Frontend IP Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frontend IP Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getFrontendIPConfiguration()
	 * @see #getLoadBalancerElement()
	 * @generated
	 */
	EReference getLoadBalancerElement_FrontendIPConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getName()
	 * @see #getLoadBalancerElement()
	 * @generated
	 */
	EAttribute getLoadBalancerElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement <em>Load Balancers Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancers Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement
	 * @generated
	 */
	EClass getLoadBalancersElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement#getLoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Balancer</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement#getLoadBalancer()
	 * @see #getLoadBalancersElement()
	 * @generated
	 */
	EReference getLoadBalancersElement_LoadBalancer();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement <em>Network Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Configuration Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement
	 * @generated
	 */
	EClass getNetworkConfigurationElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getDns <em>Dns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dns</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getDns()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_Dns();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getVirtualNetworkSite <em>Virtual Network Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Network Site</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getVirtualNetworkSite()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_VirtualNetworkSite();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAddressAssignments <em>Address Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Assignments</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAddressAssignments()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_AddressAssignments();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAccessControls <em>Access Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Controls</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getAccessControls()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_AccessControls();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getEndpointAcls <em>Endpoint Acls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint Acls</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getEndpointAcls()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_EndpointAcls();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getLoadBalancers <em>Load Balancers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Balancers</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getLoadBalancers()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_LoadBalancers();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getNetworkSecurityGroupRefs <em>Network Security Group Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Security Group Refs</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement#getNetworkSecurityGroupRefs()
	 * @see #getNetworkConfigurationElement()
	 * @generated
	 */
	EReference getNetworkConfigurationElement_NetworkSecurityGroupRefs();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement <em>Network Security Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Security Group Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement
	 * @generated
	 */
	EClass getNetworkSecurityGroupElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement#getName()
	 * @see #getNetworkSecurityGroupElement()
	 * @generated
	 */
	EAttribute getNetworkSecurityGroupElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement <em>Network Security Group Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Security Group Ref Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement
	 * @generated
	 */
	EClass getNetworkSecurityGroupRefElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getNetworkSecurityGroup <em>Network Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Security Group</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getNetworkSecurityGroup()
	 * @see #getNetworkSecurityGroupRefElement()
	 * @generated
	 */
	EReference getNetworkSecurityGroupRefElement_NetworkSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getRoleName()
	 * @see #getNetworkSecurityGroupRefElement()
	 * @generated
	 */
	EAttribute getNetworkSecurityGroupRefElement_RoleName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement <em>Network Security Group Refs Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Security Group Refs Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement
	 * @generated
	 */
	EClass getNetworkSecurityGroupRefsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement#getNetworkSecurityGroupRef <em>Network Security Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Security Group Ref</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement#getNetworkSecurityGroupRef()
	 * @see #getNetworkSecurityGroupRefsElement()
	 * @generated
	 */
	EReference getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.OsImageSetting <em>Os Image Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Image Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.OsImageSetting
	 * @generated
	 */
	EClass getOsImageSetting();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.OsImageSetting#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.OsImageSetting#getHref()
	 * @see #getOsImageSetting()
	 * @generated
	 */
	EAttribute getOsImageSetting_Href();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement <em>Public IP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public IP Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPElement
	 * @generated
	 */
	EClass getPublicIPElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Timeout In Minutes</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes()
	 * @see #getPublicIPElement()
	 * @generated
	 */
	EAttribute getPublicIPElement_IdleTimeoutInMinutes();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getName()
	 * @see #getPublicIPElement()
	 * @generated
	 */
	EAttribute getPublicIPElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPsElement <em>Public IPs Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public IPs Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPsElement
	 * @generated
	 */
	EClass getPublicIPsElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPsElement#getPublicIP <em>Public IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Public IP</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.PublicIPsElement#getPublicIP()
	 * @see #getPublicIPsElement()
	 * @generated
	 */
	EReference getPublicIPsElement_PublicIP();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPElement <em>Reserved IP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved IP Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPElement
	 * @generated
	 */
	EClass getReservedIPElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPElement#getName()
	 * @see #getReservedIPElement()
	 * @generated
	 */
	EAttribute getReservedIPElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPsType <em>Reserved IPs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved IPs Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPsType
	 * @generated
	 */
	EClass getReservedIPsType();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.ReservedIPsType#getReservedIP <em>Reserved IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserved IP</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ReservedIPsType#getReservedIP()
	 * @see #getReservedIPsType()
	 * @generated
	 */
	EReference getReservedIPsType_ReservedIP();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings <em>Role Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings
	 * @generated
	 */
	EClass getRoleSettings();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getOsImage <em>Os Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Image</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getOsImage()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EReference getRoleSettings_OsImage();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getConfigurationSettings()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EReference getRoleSettings_ConfigurationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instances</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getInstances()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EReference getRoleSettings_Instances();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificates</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getCertificates()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EReference getRoleSettings_Certificates();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getName()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EAttribute getRoleSettings_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RoleSettings#getVmName <em>Vm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RoleSettings#getVmName()
	 * @see #getRoleSettings()
	 * @generated
	 */
	EAttribute getRoleSettings_VmName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement
	 * @generated
	 */
	EClass getRuleElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement#getAction()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_Action();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement#getDescription()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement#getOrder()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_Order();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.RuleElement#getRemoteSubnet <em>Remote Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Subnet</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleElement#getRemoteSubnet()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_RemoteSubnet();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration
	 * @generated
	 */
	EClass getServiceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getRole()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_Role();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getNetworkConfiguration <em>Network Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getNetworkConfiguration()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_NetworkConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getGuestAgentSettings <em>Guest Agent Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guest Agent Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getGuestAgentSettings()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_GuestAgentSettings();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsFamily <em>Os Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Family</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsFamily()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_OsFamily();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getOsVersion()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getSchemaVersion()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration#getServiceName()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_ServiceName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.SubnetElement <em>Subnet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetElement
	 * @generated
	 */
	EClass getSubnetElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.SubnetElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetElement#getName()
	 * @see #getSubnetElement()
	 * @generated
	 */
	EAttribute getSubnetElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.SubnetsElement <em>Subnets Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnets Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetsElement
	 * @generated
	 */
	EClass getSubnetsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.cscfg.SubnetsElement#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnet</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SubnetsElement#getSubnet()
	 * @see #getSubnetsElement()
	 * @generated
	 */
	EReference getSubnetsElement_Subnet();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.TargetSetting <em>Target Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.TargetSetting
	 * @generated
	 */
	EClass getTargetSetting();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.TargetSetting#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.TargetSetting#getCount()
	 * @see #getTargetSetting()
	 * @generated
	 */
	EAttribute getTargetSetting_Count();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement <em>Virtual Network Site Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network Site Element</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement
	 * @generated
	 */
	EClass getVirtualNetworkSiteElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement#getName()
	 * @see #getVirtualNetworkSiteElement()
	 * @generated
	 */
	EAttribute getVirtualNetworkSiteElement_Name();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType <em>IP Configuration Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IP Configuration Address Type</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @generated
	 */
	EEnum getIPConfigurationAddressType();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.cscfg.RuleAction <em>Rule Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Action</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @generated
	 */
	EEnum getRuleAction();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.cscfg.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Version</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @generated
	 */
	EEnum getSchemaVersion();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes <em>Thumbprint Algorithm Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thumbprint Algorithm Types</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @generated
	 */
	EEnum getThumbprintAlgorithmTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Bounded Length String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bounded Length String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BoundedLengthString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='256'"
	 * @generated
	 */
	EDataType getBoundedLengthString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IpAddressString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])'"
	 * @generated
	 */
	EDataType getIpAddressString();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType <em>IP Configuration Address Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Configuration Address Type Object</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
	 * @model instanceClass="eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType"
	 *        extendedMetaData="name='IPConfigurationAddressType:Object' baseType='IPConfigurationAddressType'"
	 * @generated
	 */
	EDataType getIPConfigurationAddressTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Named Element Name String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Named Element Name String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NamedElementNameString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='^[a-zA-Z_][^\\\\\\/\\:\\*\\?\\\"\\<\\>\\|\\`\\\'\\^]*(?<![\\.\\s])$'"
	 * @generated
	 */
	EDataType getNamedElementNameString();

	/**
	 * Returns the meta object for data type '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='PositiveInt' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1'"
	 * @generated
	 */
	EDataType getPositiveInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Int Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PositiveInt:Object' baseType='PositiveInt'"
	 * @generated
	 */
	EDataType getPositiveIntObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.cscfg.RuleAction <em>Rule Action Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rule Action Object</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
	 * @model instanceClass="eu.artist.migration.deployment.azure.cscfg.RuleAction"
	 *        extendedMetaData="name='RuleAction:Object' baseType='RuleAction'"
	 * @generated
	 */
	EDataType getRuleActionObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.cscfg.SchemaVersion <em>Schema Version Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schema Version Object</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
	 * @model instanceClass="eu.artist.migration.deployment.azure.cscfg.SchemaVersion"
	 *        extendedMetaData="name='SchemaVersion:Object' baseType='SchemaVersion'"
	 * @generated
	 */
	EDataType getSchemaVersionObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes <em>Thumbprint Algorithm Types Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Thumbprint Algorithm Types Object</em>'.
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @model instanceClass="eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes"
	 *        extendedMetaData="name='ThumbprintAlgorithmTypes:Object' baseType='ThumbprintAlgorithmTypes'"
	 * @generated
	 */
	EDataType getThumbprintAlgorithmTypesObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Thumbprint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Thumbprint Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ThumbprintType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' pattern='[0-9A-Fa-f\\s]*'"
	 * @generated
	 */
	EDataType getThumbprintType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Vm Name String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vm Name String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VmNameString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='^(?![\\-])[a-zA-Z0-9\\-]{1,10}(?<![\\-])$'"
	 * @generated
	 */
	EDataType getVmNameString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AzureCSCfgFactory getAzureCSCfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AccessControlElementImpl <em>Access Control Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AccessControlElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAccessControlElement()
		 * @generated
		 */
		EClass ACCESS_CONTROL_ELEMENT = eINSTANCE.getAccessControlElement();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_ELEMENT__RULE = eINSTANCE.getAccessControlElement_Rule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL_ELEMENT__NAME = eINSTANCE.getAccessControlElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AccessControlsElementImpl <em>Access Controls Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AccessControlsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAccessControlsElement()
		 * @generated
		 */
		EClass ACCESS_CONTROLS_ELEMENT = eINSTANCE.getAccessControlsElement();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL = eINSTANCE.getAccessControlsElement_AccessControl();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl <em>Address Assignments Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getAddressAssignmentsElement()
		 * @generated
		 */
		EClass ADDRESS_ASSIGNMENTS_ELEMENT = eINSTANCE.getAddressAssignmentsElement();

		/**
		 * The meta object literal for the '<em><b>Instance Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS = eINSTANCE.getAddressAssignmentsElement_InstanceAddress();

		/**
		 * The meta object literal for the '<em><b>Reserved IPs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS = eINSTANCE.getAddressAssignmentsElement_ReservedIPs();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__NAME = eINSTANCE.getCertificate_Name();

		/**
		 * The meta object literal for the '<em><b>Thumbprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__THUMBPRINT = eINSTANCE.getCertificate_Thumbprint();

		/**
		 * The meta object literal for the '<em><b>Thumbprint Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__THUMBPRINT_ALGORITHM = eINSTANCE.getCertificate_ThumbprintAlgorithm();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificatesTypeImpl <em>Certificates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.CertificatesTypeImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getCertificatesType()
		 * @generated
		 */
		EClass CERTIFICATES_TYPE = eINSTANCE.getCertificatesType();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICATES_TYPE__CERTIFICATE = eINSTANCE.getCertificatesType_Certificate();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingImpl <em>Configuration Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getConfigurationSetting()
		 * @generated
		 */
		EClass CONFIGURATION_SETTING = eINSTANCE.getConfigurationSetting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SETTING__NAME = eINSTANCE.getConfigurationSetting_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SETTING__VALUE = eINSTANCE.getConfigurationSetting_Value();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingsTypeImpl <em>Configuration Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.ConfigurationSettingsTypeImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getConfigurationSettingsType()
		 * @generated
		 */
		EClass CONFIGURATION_SETTINGS_TYPE = eINSTANCE.getConfigurationSettingsType();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SETTINGS_TYPE__SETTING = eINSTANCE.getConfigurationSettingsType_Setting();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsElementImpl <em>Dns Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsElement()
		 * @generated
		 */
		EClass DNS_ELEMENT = eINSTANCE.getDnsElement();

		/**
		 * The meta object literal for the '<em><b>Dns Servers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNS_ELEMENT__DNS_SERVERS = eINSTANCE.getDnsElement_DnsServers();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsServerElementImpl <em>Dns Server Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsServerElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsServerElement()
		 * @generated
		 */
		EClass DNS_SERVER_ELEMENT = eINSTANCE.getDnsServerElement();

		/**
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_SERVER_ELEMENT__IP_ADDRESS = eINSTANCE.getDnsServerElement_IPAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNS_SERVER_ELEMENT__NAME = eINSTANCE.getDnsServerElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsServersElementImpl <em>Dns Servers Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.DnsServersElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDnsServersElement()
		 * @generated
		 */
		EClass DNS_SERVERS_ELEMENT = eINSTANCE.getDnsServersElement();

		/**
		 * The meta object literal for the '<em><b>Dns Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNS_SERVERS_ELEMENT__DNS_SERVER = eINSTANCE.getDnsServersElement_DnsServer();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.DocumentRootImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Service Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_CONFIGURATION = eINSTANCE.getDocumentRoot_ServiceConfiguration();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclsElementImpl <em>Endpoint Acls Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getEndpointAclsElement()
		 * @generated
		 */
		EClass ENDPOINT_ACLS_ELEMENT = eINSTANCE.getEndpointAclsElement();

		/**
		 * The meta object literal for the '<em><b>Endpoint Acl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_ACLS_ELEMENT__ENDPOINT_ACL = eINSTANCE.getEndpointAclsElement_EndpointAcl();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclTypeImpl <em>Endpoint Acl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.EndpointAclTypeImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getEndpointAclType()
		 * @generated
		 */
		EClass ENDPOINT_ACL_TYPE = eINSTANCE.getEndpointAclType();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_ACL_TYPE__ACCESS_CONTROL = eINSTANCE.getEndpointAclType_AccessControl();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_ACL_TYPE__END_POINT = eINSTANCE.getEndpointAclType_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_ACL_TYPE__ROLE = eINSTANCE.getEndpointAclType_Role();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl <em>Frontend IP Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getFrontendIPConfigurationElement()
		 * @generated
		 */
		EClass FRONTEND_IP_CONFIGURATION_ELEMENT = eINSTANCE.getFrontendIPConfigurationElement();

		/**
		 * The meta object literal for the '<em><b>Static Virtual Network IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS = eINSTANCE.getFrontendIPConfigurationElement_StaticVirtualNetworkIPAddress();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET = eINSTANCE.getFrontendIPConfigurationElement_Subnet();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE = eINSTANCE.getFrontendIPConfigurationElement_Type();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl <em>Guest Agent Settings Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getGuestAgentSettingsElement()
		 * @generated
		 */
		EClass GUEST_AGENT_SETTINGS_ELEMENT = eINSTANCE.getGuestAgentSettingsElement();

		/**
		 * The meta object literal for the '<em><b>Allow Role Process Local Dumps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS = eINSTANCE.getGuestAgentSettingsElement_AllowRoleProcessLocalDumps();

		/**
		 * The meta object literal for the '<em><b>Cleanup Firewall On Role Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART = eINSTANCE.getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl <em>Instance Address Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getInstanceAddressElement()
		 * @generated
		 */
		EClass INSTANCE_ADDRESS_ELEMENT = eINSTANCE.getInstanceAddressElement();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ADDRESS_ELEMENT__SUBNETS = eINSTANCE.getInstanceAddressElement_Subnets();

		/**
		 * The meta object literal for the '<em><b>Public IPs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS = eINSTANCE.getInstanceAddressElement_PublicIPs();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_ADDRESS_ELEMENT__ROLE_NAME = eINSTANCE.getInstanceAddressElement_RoleName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl <em>Load Balancer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getLoadBalancerElement()
		 * @generated
		 */
		EClass LOAD_BALANCER_ELEMENT = eINSTANCE.getLoadBalancerElement();

		/**
		 * The meta object literal for the '<em><b>Frontend IP Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION = eINSTANCE.getLoadBalancerElement_FrontendIPConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_ELEMENT__NAME = eINSTANCE.getLoadBalancerElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancersElementImpl <em>Load Balancers Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancersElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getLoadBalancersElement()
		 * @generated
		 */
		EClass LOAD_BALANCERS_ELEMENT = eINSTANCE.getLoadBalancersElement();

		/**
		 * The meta object literal for the '<em><b>Load Balancer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCERS_ELEMENT__LOAD_BALANCER = eINSTANCE.getLoadBalancersElement_LoadBalancer();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl <em>Network Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkConfigurationElement()
		 * @generated
		 */
		EClass NETWORK_CONFIGURATION_ELEMENT = eINSTANCE.getNetworkConfigurationElement();

		/**
		 * The meta object literal for the '<em><b>Dns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__DNS = eINSTANCE.getNetworkConfigurationElement_Dns();

		/**
		 * The meta object literal for the '<em><b>Virtual Network Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE = eINSTANCE.getNetworkConfigurationElement_VirtualNetworkSite();

		/**
		 * The meta object literal for the '<em><b>Address Assignments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS = eINSTANCE.getNetworkConfigurationElement_AddressAssignments();

		/**
		 * The meta object literal for the '<em><b>Access Controls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS = eINSTANCE.getNetworkConfigurationElement_AccessControls();

		/**
		 * The meta object literal for the '<em><b>Endpoint Acls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS = eINSTANCE.getNetworkConfigurationElement_EndpointAcls();

		/**
		 * The meta object literal for the '<em><b>Load Balancers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS = eINSTANCE.getNetworkConfigurationElement_LoadBalancers();

		/**
		 * The meta object literal for the '<em><b>Network Security Group Refs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS = eINSTANCE.getNetworkConfigurationElement_NetworkSecurityGroupRefs();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupElementImpl <em>Network Security Group Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupElement()
		 * @generated
		 */
		EClass NETWORK_SECURITY_GROUP_ELEMENT = eINSTANCE.getNetworkSecurityGroupElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_SECURITY_GROUP_ELEMENT__NAME = eINSTANCE.getNetworkSecurityGroupElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl <em>Network Security Group Ref Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupRefElement()
		 * @generated
		 */
		EClass NETWORK_SECURITY_GROUP_REF_ELEMENT = eINSTANCE.getNetworkSecurityGroupRefElement();

		/**
		 * The meta object literal for the '<em><b>Network Security Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP = eINSTANCE.getNetworkSecurityGroupRefElement_NetworkSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME = eINSTANCE.getNetworkSecurityGroupRefElement_RoleName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefsElementImpl <em>Network Security Group Refs Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNetworkSecurityGroupRefsElement()
		 * @generated
		 */
		EClass NETWORK_SECURITY_GROUP_REFS_ELEMENT = eINSTANCE.getNetworkSecurityGroupRefsElement();

		/**
		 * The meta object literal for the '<em><b>Network Security Group Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF = eINSTANCE.getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.OsImageSettingImpl <em>Os Image Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.OsImageSettingImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getOsImageSetting()
		 * @generated
		 */
		EClass OS_IMAGE_SETTING = eINSTANCE.getOsImageSetting();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_IMAGE_SETTING__HREF = eINSTANCE.getOsImageSetting_Href();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl <em>Public IP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPublicIPElement()
		 * @generated
		 */
		EClass PUBLIC_IP_ELEMENT = eINSTANCE.getPublicIPElement();

		/**
		 * The meta object literal for the '<em><b>Idle Timeout In Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES = eINSTANCE.getPublicIPElement_IdleTimeoutInMinutes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_IP_ELEMENT__NAME = eINSTANCE.getPublicIPElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPsElementImpl <em>Public IPs Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.PublicIPsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPublicIPsElement()
		 * @generated
		 */
		EClass PUBLIC_IPS_ELEMENT = eINSTANCE.getPublicIPsElement();

		/**
		 * The meta object literal for the '<em><b>Public IP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_IPS_ELEMENT__PUBLIC_IP = eINSTANCE.getPublicIPsElement_PublicIP();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPElementImpl <em>Reserved IP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getReservedIPElement()
		 * @generated
		 */
		EClass RESERVED_IP_ELEMENT = eINSTANCE.getReservedIPElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVED_IP_ELEMENT__NAME = eINSTANCE.getReservedIPElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPsTypeImpl <em>Reserved IPs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPsTypeImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getReservedIPsType()
		 * @generated
		 */
		EClass RESERVED_IPS_TYPE = eINSTANCE.getReservedIPsType();

		/**
		 * The meta object literal for the '<em><b>Reserved IP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVED_IPS_TYPE__RESERVED_IP = eINSTANCE.getReservedIPsType_ReservedIP();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl <em>Role Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRoleSettings()
		 * @generated
		 */
		EClass ROLE_SETTINGS = eINSTANCE.getRoleSettings();

		/**
		 * The meta object literal for the '<em><b>Os Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SETTINGS__OS_IMAGE = eINSTANCE.getRoleSettings_OsImage();

		/**
		 * The meta object literal for the '<em><b>Configuration Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SETTINGS__CONFIGURATION_SETTINGS = eINSTANCE.getRoleSettings_ConfigurationSettings();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SETTINGS__INSTANCES = eINSTANCE.getRoleSettings_Instances();

		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_SETTINGS__CERTIFICATES = eINSTANCE.getRoleSettings_Certificates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_SETTINGS__NAME = eINSTANCE.getRoleSettings_Name();

		/**
		 * The meta object literal for the '<em><b>Vm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_SETTINGS__VM_NAME = eINSTANCE.getRoleSettings_VmName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.RuleElementImpl <em>Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.RuleElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleElement()
		 * @generated
		 */
		EClass RULE_ELEMENT = eINSTANCE.getRuleElement();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__ACTION = eINSTANCE.getRuleElement_Action();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__DESCRIPTION = eINSTANCE.getRuleElement_Description();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__ORDER = eINSTANCE.getRuleElement_Order();

		/**
		 * The meta object literal for the '<em><b>Remote Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__REMOTE_SUBNET = eINSTANCE.getRuleElement_RemoteSubnet();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getServiceConfiguration()
		 * @generated
		 */
		EClass SERVICE_CONFIGURATION = eINSTANCE.getServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__ROLE = eINSTANCE.getServiceConfiguration_Role();

		/**
		 * The meta object literal for the '<em><b>Network Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__NETWORK_CONFIGURATION = eINSTANCE.getServiceConfiguration_NetworkConfiguration();

		/**
		 * The meta object literal for the '<em><b>Guest Agent Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS = eINSTANCE.getServiceConfiguration_GuestAgentSettings();

		/**
		 * The meta object literal for the '<em><b>Os Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__OS_FAMILY = eINSTANCE.getServiceConfiguration_OsFamily();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__OS_VERSION = eINSTANCE.getServiceConfiguration_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__SCHEMA_VERSION = eINSTANCE.getServiceConfiguration_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__SERVICE_NAME = eINSTANCE.getServiceConfiguration_ServiceName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.SubnetElementImpl <em>Subnet Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.SubnetElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSubnetElement()
		 * @generated
		 */
		EClass SUBNET_ELEMENT = eINSTANCE.getSubnetElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ELEMENT__NAME = eINSTANCE.getSubnetElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.SubnetsElementImpl <em>Subnets Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.SubnetsElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSubnetsElement()
		 * @generated
		 */
		EClass SUBNETS_ELEMENT = eINSTANCE.getSubnetsElement();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNETS_ELEMENT__SUBNET = eINSTANCE.getSubnetsElement_Subnet();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.TargetSettingImpl <em>Target Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.TargetSettingImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getTargetSetting()
		 * @generated
		 */
		EClass TARGET_SETTING = eINSTANCE.getTargetSetting();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_SETTING__COUNT = eINSTANCE.getTargetSetting_Count();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.impl.VirtualNetworkSiteElementImpl <em>Virtual Network Site Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.VirtualNetworkSiteElementImpl
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getVirtualNetworkSiteElement()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK_SITE_ELEMENT = eINSTANCE.getVirtualNetworkSiteElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_NETWORK_SITE_ELEMENT__NAME = eINSTANCE.getVirtualNetworkSiteElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType <em>IP Configuration Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIPConfigurationAddressType()
		 * @generated
		 */
		EEnum IP_CONFIGURATION_ADDRESS_TYPE = eINSTANCE.getIPConfigurationAddressType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.RuleAction <em>Rule Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleAction()
		 * @generated
		 */
		EEnum RULE_ACTION = eINSTANCE.getRuleAction();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.SchemaVersion <em>Schema Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EEnum SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes <em>Thumbprint Algorithm Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintAlgorithmTypes()
		 * @generated
		 */
		EEnum THUMBPRINT_ALGORITHM_TYPES = eINSTANCE.getThumbprintAlgorithmTypes();

		/**
		 * The meta object literal for the '<em>Bounded Length String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getBoundedLengthString()
		 * @generated
		 */
		EDataType BOUNDED_LENGTH_STRING = eINSTANCE.getBoundedLengthString();

		/**
		 * The meta object literal for the '<em>Ip Address String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIpAddressString()
		 * @generated
		 */
		EDataType IP_ADDRESS_STRING = eINSTANCE.getIpAddressString();

		/**
		 * The meta object literal for the '<em>IP Configuration Address Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getIPConfigurationAddressTypeObject()
		 * @generated
		 */
		EDataType IP_CONFIGURATION_ADDRESS_TYPE_OBJECT = eINSTANCE.getIPConfigurationAddressTypeObject();

		/**
		 * The meta object literal for the '<em>Named Element Name String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getNamedElementNameString()
		 * @generated
		 */
		EDataType NAMED_ELEMENT_NAME_STRING = eINSTANCE.getNamedElementNameString();

		/**
		 * The meta object literal for the '<em>Positive Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPositiveInt()
		 * @generated
		 */
		EDataType POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '<em>Positive Int Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getPositiveIntObject()
		 * @generated
		 */
		EDataType POSITIVE_INT_OBJECT = eINSTANCE.getPositiveIntObject();

		/**
		 * The meta object literal for the '<em>Rule Action Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.RuleAction
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getRuleActionObject()
		 * @generated
		 */
		EDataType RULE_ACTION_OBJECT = eINSTANCE.getRuleActionObject();

		/**
		 * The meta object literal for the '<em>Schema Version Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.SchemaVersion
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getSchemaVersionObject()
		 * @generated
		 */
		EDataType SCHEMA_VERSION_OBJECT = eINSTANCE.getSchemaVersionObject();

		/**
		 * The meta object literal for the '<em>Thumbprint Algorithm Types Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintAlgorithmTypesObject()
		 * @generated
		 */
		EDataType THUMBPRINT_ALGORITHM_TYPES_OBJECT = eINSTANCE.getThumbprintAlgorithmTypesObject();

		/**
		 * The meta object literal for the '<em>Thumbprint Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getThumbprintType()
		 * @generated
		 */
		EDataType THUMBPRINT_TYPE = eINSTANCE.getThumbprintType();

		/**
		 * The meta object literal for the '<em>Vm Name String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.cscfg.impl.AzureCSCfgPackageImpl#getVmNameString()
		 * @generated
		 */
		EDataType VM_NAME_STRING = eINSTANCE.getVmNameString();

	}

} //AzureCSCfgPackage

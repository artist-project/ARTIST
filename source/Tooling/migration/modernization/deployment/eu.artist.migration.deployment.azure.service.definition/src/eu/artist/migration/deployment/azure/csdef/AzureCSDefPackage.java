/**
 */
package eu.artist.migration.deployment.azure.csdef;

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
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefFactory
 * @model kind="package"
 * @generated
 */
public interface AzureCSDefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csdef";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/ServiceHosting/2008/10/ServiceDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csdef";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AzureCSDefPackage eINSTANCE = eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.AllocatePublicPortFromElementImpl <em>Allocate Public Port From Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AllocatePublicPortFromElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAllocatePublicPortFromElement()
	 * @generated
	 */
	int ALLOCATE_PUBLIC_PORT_FROM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Fixed Port Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE = 0;

	/**
	 * The number of structural features of the '<em>Allocate Public Port From Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_PUBLIC_PORT_FROM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allocate Public Port From Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATE_PUBLIC_PORT_FROM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.AllowAllTrafficImpl <em>Allow All Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AllowAllTrafficImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAllowAllTraffic()
	 * @generated
	 */
	int ALLOW_ALL_TRAFFIC = 1;

	/**
	 * The number of structural features of the '<em>Allow All Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_ALL_TRAFFIC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Allow All Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_ALL_TRAFFIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.BindingImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 2;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ENDPOINT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Host Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__HOST_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.BindingsImpl <em>Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.BindingsImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBindings()
	 * @generated
	 */
	int BINDINGS = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS__BINDING = 0;

	/**
	 * The number of structural features of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permission Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__PERMISSION_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__STORE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__STORE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.CertificatesImpl <em>Certificates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.CertificatesImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getCertificates()
	 * @generated
	 */
	int CERTIFICATES = 5;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES__CERTIFICATE = 0;

	/**
	 * The number of structural features of the '<em>Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingImpl <em>Configuration Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getConfigurationSetting()
	 * @generated
	 */
	int CONFIGURATION_SETTING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Configuration Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingsImpl <em>Configuration Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingsImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getConfigurationSettings()
	 * @generated
	 */
	int CONFIGURATION_SETTINGS = 7;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS__SETTING = 0;

	/**
	 * The number of structural features of the '<em>Configuration Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl <em>Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getContentElement()
	 * @generated
	 */
	int CONTENT_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Source Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__SOURCE_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ContentsElementImpl <em>Contents Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ContentsElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getContentsElement()
	 * @generated
	 */
	int CONTENTS_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_ELEMENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Contents Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contents Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.DestinationsImpl <em>Destinations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.DestinationsImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDestinations()
	 * @generated
	 */
	int DESTINATIONS = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Role Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATIONS__ROLE_ENDPOINT = 1;

	/**
	 * The number of structural features of the '<em>Destinations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Destinations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.DocumentRootImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

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
	 * The feature id for the '<em><b>Role Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Service Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_DEFINITION = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl <em>Endpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEndpoints()
	 * @generated
	 */
	int ENDPOINTS = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Input Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS__INPUT_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Internal Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS__INTERNAL_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Instance Input Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS__INSTANCE_INPUT_ENDPOINT = 3;

	/**
	 * The number of structural features of the '<em>Endpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Endpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EntryPointElementImpl <em>Entry Point Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.EntryPointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEntryPointElement()
	 * @generated
	 */
	int ENTRY_POINT_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Net Fx Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT = 0;

	/**
	 * The number of structural features of the '<em>Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.EnvironmentImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 14;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.FromRoleImpl <em>From Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.FromRoleImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getFromRole()
	 * @generated
	 */
	int FROM_ROLE = 15;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE__ROLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>From Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ImportImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 16;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ImportsImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__IMPORT = 1;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl <em>Input Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpoint()
	 * @generated
	 */
	int INPUT_ENDPOINT = 18;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__CERTIFICATE = 0;

	/**
	 * The feature id for the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES = 1;

	/**
	 * The feature id for the '<em><b>Ignore Role Instance Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__LOAD_BALANCER = 3;

	/**
	 * The feature id for the '<em><b>Load Balancer Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>Load Balancer Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__LOAD_BALANCER_PROBE = 5;

	/**
	 * The feature id for the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__LOCAL_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__NAME = 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__PORT = 8;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT__PROTOCOL = 9;

	/**
	 * The number of structural features of the '<em>Input Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Input Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointsTypeImpl <em>Input Endpoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointsTypeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpointsType()
	 * @generated
	 */
	int INPUT_ENDPOINTS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Input Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINTS_TYPE__INPUT_ENDPOINT = 1;

	/**
	 * The number of structural features of the '<em>Input Endpoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Endpoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointTypeImpl <em>Input Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointTypeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpointType()
	 * @generated
	 */
	int INPUT_ENDPOINT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__CERTIFICATE = INPUT_ENDPOINT__CERTIFICATE;

	/**
	 * The feature id for the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__IDLE_TIMEOUT_IN_MINUTES = INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Ignore Role Instance Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__IGNORE_ROLE_INSTANCE_STATUS = INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS;

	/**
	 * The feature id for the '<em><b>Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__LOAD_BALANCER = INPUT_ENDPOINT__LOAD_BALANCER;

	/**
	 * The feature id for the '<em><b>Load Balancer Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__LOAD_BALANCER_DISTRIBUTION = INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Load Balancer Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__LOAD_BALANCER_PROBE = INPUT_ENDPOINT__LOAD_BALANCER_PROBE;

	/**
	 * The feature id for the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__LOCAL_PORT = INPUT_ENDPOINT__LOCAL_PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__NAME = INPUT_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__PORT = INPUT_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE__PROTOCOL = INPUT_ENDPOINT__PROTOCOL;

	/**
	 * The number of structural features of the '<em>Input Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE_FEATURE_COUNT = INPUT_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ENDPOINT_TYPE_OPERATION_COUNT = INPUT_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl <em>Instance Input Endpoint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInstanceInputEndpointElement()
	 * @generated
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Allocate Public Port From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM = 0;

	/**
	 * The feature id for the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES = 1;

	/**
	 * The feature id for the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL = 4;

	/**
	 * The number of structural features of the '<em>Instance Input Endpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Instance Input Endpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INPUT_ENDPOINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl <em>Internal Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalEndpoint()
	 * @generated
	 */
	int INTERNAL_ENDPOINT = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Fixed Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__FIXED_PORT = 1;

	/**
	 * The feature id for the '<em><b>Fixed Port Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__FIXED_PORT_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__PORT = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT__PROTOCOL = 5;

	/**
	 * The number of structural features of the '<em>Internal Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Internal Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointTypeImpl <em>Internal Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointTypeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalEndpointType()
	 * @generated
	 */
	int INTERNAL_ENDPOINT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__GROUP = INTERNAL_ENDPOINT__GROUP;

	/**
	 * The feature id for the '<em><b>Fixed Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__FIXED_PORT = INTERNAL_ENDPOINT__FIXED_PORT;

	/**
	 * The feature id for the '<em><b>Fixed Port Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__FIXED_PORT_RANGE = INTERNAL_ENDPOINT__FIXED_PORT_RANGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__NAME = INTERNAL_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__PORT = INTERNAL_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE__PROTOCOL = INTERNAL_ENDPOINT__PROTOCOL;

	/**
	 * The number of structural features of the '<em>Internal Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE_FEATURE_COUNT = INTERNAL_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ENDPOINT_TYPE_OPERATION_COUNT = INTERNAL_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl <em>Load Balancer Probe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLoadBalancerProbe()
	 * @generated
	 */
	int LOAD_BALANCER_PROBE = 24;

	/**
	 * The feature id for the '<em><b>Interval In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__PORT = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Timeout In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS = 5;

	/**
	 * The number of structural features of the '<em>Load Balancer Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Load Balancer Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbesImpl <em>Load Balancer Probes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbesImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLoadBalancerProbes()
	 * @generated
	 */
	int LOAD_BALANCER_PROBES = 25;

	/**
	 * The feature id for the '<em><b>Load Balancer Probe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE = 0;

	/**
	 * The number of structural features of the '<em>Load Balancer Probes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Balancer Probes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_PROBES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LocalResourcesImpl <em>Local Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.LocalResourcesImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLocalResources()
	 * @generated
	 */
	int LOCAL_RESOURCES = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Local Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCES__LOCAL_STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Local Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Local Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl <em>Local Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLocalStore()
	 * @generated
	 */
	int LOCAL_STORE = 27;

	/**
	 * The feature id for the '<em><b>Clean On Role Recycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Size In MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE__SIZE_IN_MB = 2;

	/**
	 * The number of structural features of the '<em>Local Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Local Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl <em>Net Fx Assembly Entry Point Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNetFxAssemblyEntryPointElement()
	 * @generated
	 */
	int NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Assembly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Framework Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Net Fx Assembly Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Net Fx Assembly Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.NetworkTrafficRulesImpl <em>Network Traffic Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.NetworkTrafficRulesImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNetworkTrafficRules()
	 * @generated
	 */
	int NETWORK_TRAFFIC_RULES = 29;

	/**
	 * The feature id for the '<em><b>Only Allow Traffic To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO = 0;

	/**
	 * The number of structural features of the '<em>Network Traffic Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TRAFFIC_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Network Traffic Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TRAFFIC_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl <em>Only Allow Traffic To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getOnlyAllowTrafficTo()
	 * @generated
	 */
	int ONLY_ALLOW_TRAFFIC_TO = 30;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS = 0;

	/**
	 * The feature id for the '<em><b>Allow All Traffic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC = 1;

	/**
	 * The feature id for the '<em><b>When Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Only Allow Traffic To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_ALLOW_TRAFFIC_TO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Only Allow Traffic To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_ALLOW_TRAFFIC_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.PortImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 31;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.PortRangeImpl <em>Port Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.PortRangeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortRange()
	 * @generated
	 */
	int PORT_RANGE = 32;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__MIN = 1;

	/**
	 * The number of structural features of the '<em>Port Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl <em>Program Entry Point Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProgramEntryPointElement()
	 * @generated
	 */
	int PROGRAM_ENTRY_POINT_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE = 0;

	/**
	 * The feature id for the '<em><b>Set Ready On Process Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START = 1;

	/**
	 * The number of structural features of the '<em>Program Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_POINT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_POINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RdmaEndpointElementImpl <em>Rdma Endpoint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RdmaEndpointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRdmaEndpointElement()
	 * @generated
	 */
	int RDMA_ENDPOINT_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDMA_ENDPOINT_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rdma Endpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDMA_ENDPOINT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rdma Endpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDMA_ENDPOINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleEndpointImpl <em>Role Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleEndpointImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleEndpoint()
	 * @generated
	 */
	int ROLE_ENDPOINT = 35;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENDPOINT__ENDPOINT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENDPOINT__ROLE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Role Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENDPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleInstanceValueElementImpl <em>Role Instance Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleInstanceValueElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleInstanceValueElement()
	 * @generated
	 */
	int ROLE_INSTANCE_VALUE_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_VALUE_ELEMENT__XPATH = 0;

	/**
	 * The number of structural features of the '<em>Role Instance Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_VALUE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role Instance Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_INSTANCE_VALUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl <em>Role Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleModule()
	 * @generated
	 */
	int ROLE_MODULE = 37;

	/**
	 * The feature id for the '<em><b>Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__STARTUP = 0;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__RUNTIME = 1;

	/**
	 * The feature id for the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__CONFIGURATION_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__ENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Local Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__LOCAL_RESOURCES = 4;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__CERTIFICATES = 5;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__SITES = 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE__NAMESPACE = 7;

	/**
	 * The number of structural features of the '<em>Role Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Role Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 38;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__EXECUTION_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeForRoleModuleImpl <em>Runtime For Role Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.RuntimeForRoleModuleImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRuntimeForRoleModule()
	 * @generated
	 */
	int RUNTIME_FOR_ROLE_MODULE = 39;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FOR_ROLE_MODULE__ENVIRONMENT = RUNTIME__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FOR_ROLE_MODULE__EXECUTION_CONTEXT = RUNTIME__EXECUTION_CONTEXT;

	/**
	 * The number of structural features of the '<em>Runtime For Role Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FOR_ROLE_MODULE_FEATURE_COUNT = RUNTIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runtime For Role Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FOR_ROLE_MODULE_OPERATION_COUNT = RUNTIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getServiceDefinition()
	 * @generated
	 */
	int SERVICE_DEFINITION = 40;

	/**
	 * The feature id for the '<em><b>Load Balancer Probes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__LOAD_BALANCER_PROBES = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Web Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__WEB_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Worker Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__WORKER_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Network Traffic Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__SCHEMA_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Topology Change Discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY = 7;

	/**
	 * The feature id for the '<em><b>Upgrade Domain Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT = 8;

	/**
	 * The number of structural features of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl <em>Virtual Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualDirectory()
	 * @generated
	 */
	int VIRTUAL_DIRECTORY = 48;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Virtual Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Virtual Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Physical Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY = 4;

	/**
	 * The number of structural features of the '<em>Virtual Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Virtual Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_DIRECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.SiteImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 41;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__GROUP = VIRTUAL_DIRECTORY__GROUP;

	/**
	 * The feature id for the '<em><b>Virtual Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__VIRTUAL_DIRECTORY = VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Virtual Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__VIRTUAL_APPLICATION = VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = VIRTUAL_DIRECTORY__NAME;

	/**
	 * The feature id for the '<em><b>Physical Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PHYSICAL_DIRECTORY = VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BINDINGS = VIRTUAL_DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = VIRTUAL_DIRECTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = VIRTUAL_DIRECTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SitesImpl <em>Sites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.SitesImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSites()
	 * @generated
	 */
	int SITES = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITES__SITE = 1;

	/**
	 * The number of structural features of the '<em>Sites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SourceDirectoryElementImpl <em>Source Directory Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.SourceDirectoryElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSourceDirectoryElement()
	 * @generated
	 */
	int SOURCE_DIRECTORY_ELEMENT = 43;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DIRECTORY_ELEMENT__PATH = 0;

	/**
	 * The number of structural features of the '<em>Source Directory Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DIRECTORY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Directory Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DIRECTORY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.StartupImpl <em>Startup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.StartupImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStartup()
	 * @generated
	 */
	int STARTUP = 44;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP__TASK = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP__PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Startup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Startup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.TaskImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 45;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMMAND_LINE = 1;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXECUTION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.VariableImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 46;

	/**
	 * The feature id for the '<em><b>Role Instance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ROLE_INSTANCE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualApplicationImpl <em>Virtual Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.VirtualApplicationImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualApplication()
	 * @generated
	 */
	int VIRTUAL_APPLICATION = 47;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION__GROUP = VIRTUAL_DIRECTORY__GROUP;

	/**
	 * The feature id for the '<em><b>Virtual Directory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION__VIRTUAL_DIRECTORY = VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Virtual Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION__VIRTUAL_APPLICATION = VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION__NAME = VIRTUAL_DIRECTORY__NAME;

	/**
	 * The feature id for the '<em><b>Physical Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION__PHYSICAL_DIRECTORY = VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY;

	/**
	 * The number of structural features of the '<em>Virtual Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION_FEATURE_COUNT = VIRTUAL_DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_APPLICATION_OPERATION_COUNT = VIRTUAL_DIRECTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl <em>Web Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWebRole()
	 * @generated
	 */
	int WEB_ROLE = 49;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__STARTUP = 1;

	/**
	 * The feature id for the '<em><b>Local Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__LOCAL_STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Local Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__LOCAL_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__CONFIGURATION_SETTINGS = 4;

	/**
	 * The feature id for the '<em><b>Input Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__INPUT_ENDPOINTS = 5;

	/**
	 * The feature id for the '<em><b>Internal Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__INTERNAL_ENDPOINT = 6;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__ENDPOINTS = 7;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__CERTIFICATES = 8;

	/**
	 * The feature id for the '<em><b>Sites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__SITES = 9;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__RUNTIME = 10;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__CONTENTS = 11;

	/**
	 * The feature id for the '<em><b>Enable Native Code Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__NAME = 13;

	/**
	 * The feature id for the '<em><b>Vmsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE__VMSIZE = 14;

	/**
	 * The number of structural features of the '<em>Web Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Web Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WebRuntimeImpl <em>Web Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WebRuntimeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWebRuntime()
	 * @generated
	 */
	int WEB_RUNTIME = 50;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RUNTIME__ENVIRONMENT = RUNTIME__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RUNTIME__EXECUTION_CONTEXT = RUNTIME__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RUNTIME__ENTRY_POINT = RUNTIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RUNTIME_FEATURE_COUNT = RUNTIME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RUNTIME_OPERATION_COUNT = RUNTIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl <em>When Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWhenSource()
	 * @generated
	 */
	int WHEN_SOURCE = 51;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_SOURCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>From Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_SOURCE__FROM_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_SOURCE__MATCHES = 2;

	/**
	 * The number of structural features of the '<em>When Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl <em>Worker Entry Point Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerEntryPointElement()
	 * @generated
	 */
	int WORKER_ENTRY_POINT_ELEMENT = 52;

	/**
	 * The feature id for the '<em><b>Program Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Net Fx Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT = 1;

	/**
	 * The number of structural features of the '<em>Worker Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ENTRY_POINT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Worker Entry Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ENTRY_POINT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerRoleImpl <em>Worker Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerRoleImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerRole()
	 * @generated
	 */
	int WORKER_ROLE = 53;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__STARTUP = 1;

	/**
	 * The feature id for the '<em><b>Local Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__LOCAL_STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Local Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__LOCAL_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Configuration Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__CONFIGURATION_SETTINGS = 4;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__ENDPOINTS = 5;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__CERTIFICATES = 6;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__RUNTIME = 7;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__CONTENTS = 8;

	/**
	 * The feature id for the '<em><b>Enable Native Code Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__ENABLE_NATIVE_CODE_EXECUTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Vmsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE__VMSIZE = 11;

	/**
	 * The number of structural features of the '<em>Worker Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Worker Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerRuntimeImpl <em>Worker Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerRuntimeImpl
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerRuntime()
	 * @generated
	 */
	int WORKER_RUNTIME = 54;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_RUNTIME__ENVIRONMENT = RUNTIME__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_RUNTIME__EXECUTION_CONTEXT = RUNTIME__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_RUNTIME__ENTRY_POINT = RUNTIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Worker Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_RUNTIME_FEATURE_COUNT = RUNTIME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Worker Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_RUNTIME_OPERATION_COUNT = RUNTIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.AnyPort <em>Any Port</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAnyPort()
	 * @generated
	 */
	int ANY_PORT = 55;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.BuiltinStoreName <em>Builtin Store Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBuiltinStoreName()
	 * @generated
	 */
	int BUILTIN_STORE_NAME = 56;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.DistributionType <em>Distribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDistributionType()
	 * @generated
	 */
	int DISTRIBUTION_TYPE = 57;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.ExecutionContext <em>Execution Context</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getExecutionContext()
	 * @generated
	 */
	int EXECUTION_CONTEXT = 58;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.InternalProtocol <em>Internal Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalProtocol()
	 * @generated
	 */
	int INTERNAL_PROTOCOL = 59;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.MatchMode <em>Match Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getMatchMode()
	 * @generated
	 */
	int MATCH_MODE = 60;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.PermissionLevel <em>Permission Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPermissionLevel()
	 * @generated
	 */
	int PERMISSION_LEVEL = 61;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.ProbeProtocol <em>Probe Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProbeProtocol()
	 * @generated
	 */
	int PROBE_PROTOCOL = 62;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 63;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.SchemaVersion <em>Schema Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 64;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.StoreLocation <em>Store Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreLocation()
	 * @generated
	 */
	int STORE_LOCATION = 65;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.TaskType <em>Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 66;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery <em>Topology Change Discovery</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTopologyChangeDiscovery()
	 * @generated
	 */
	int TOPOLOGY_CHANGE_DISCOVERY = 67;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdef.TransportProtocol <em>Transport Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTransportProtocol()
	 * @generated
	 */
	int TRANSPORT_PROTOCOL = 68;

	/**
	 * The meta object id for the '<em>Any Port Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAnyPortObject()
	 * @generated
	 */
	int ANY_PORT_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Builtin Store Name Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBuiltinStoreNameObject()
	 * @generated
	 */
	int BUILTIN_STORE_NAME_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Distribution Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDistributionTypeObject()
	 * @generated
	 */
	int DISTRIBUTION_TYPE_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Execution Context Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getExecutionContextObject()
	 * @generated
	 */
	int EXECUTION_CONTEXT_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Internal Protocol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalProtocolObject()
	 * @generated
	 */
	int INTERNAL_PROTOCOL_OBJECT = 73;

	/**
	 * The meta object id for the '<em>LB Probe Interval</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeInterval()
	 * @generated
	 */
	int LB_PROBE_INTERVAL = 74;

	/**
	 * The meta object id for the '<em>LB Probe Interval Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeIntervalObject()
	 * @generated
	 */
	int LB_PROBE_INTERVAL_OBJECT = 75;

	/**
	 * The meta object id for the '<em>LB Probe Timeout</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeTimeout()
	 * @generated
	 */
	int LB_PROBE_TIMEOUT = 76;

	/**
	 * The meta object id for the '<em>LB Probe Timeout Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeTimeoutObject()
	 * @generated
	 */
	int LB_PROBE_TIMEOUT_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Match Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getMatchModeObject()
	 * @generated
	 */
	int MATCH_MODE_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Named Element Name String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNamedElementNameString()
	 * @generated
	 */
	int NAMED_ELEMENT_NAME_STRING = 79;

	/**
	 * The meta object id for the '<em>Non Empty String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNonEmptyString()
	 * @generated
	 */
	int NON_EMPTY_STRING = 80;

	/**
	 * The meta object id for the '<em>Permission Level Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPermissionLevelObject()
	 * @generated
	 */
	int PERMISSION_LEVEL_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Port Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortInteger()
	 * @generated
	 */
	int PORT_INTEGER = 82;

	/**
	 * The meta object id for the '<em>Port Integer Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortIntegerObject()
	 * @generated
	 */
	int PORT_INTEGER_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Port Specifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortSpecifier()
	 * @generated
	 */
	int PORT_SPECIFIER = 84;

	/**
	 * The meta object id for the '<em>Positive Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 85;

	/**
	 * The meta object id for the '<em>Positive Int Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPositiveIntObject()
	 * @generated
	 */
	int POSITIVE_INT_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Probe Protocol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProbeProtocolObject()
	 * @generated
	 */
	int PROBE_PROTOCOL_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Protocol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProtocolObject()
	 * @generated
	 */
	int PROTOCOL_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Schema Version Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSchemaVersionObject()
	 * @generated
	 */
	int SCHEMA_VERSION_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Store Location Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreLocationObject()
	 * @generated
	 */
	int STORE_LOCATION_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Store Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreName()
	 * @generated
	 */
	int STORE_NAME = 91;

	/**
	 * The meta object id for the '<em>Task Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTaskTypeObject()
	 * @generated
	 */
	int TASK_TYPE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Topology Change Discovery Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTopologyChangeDiscoveryObject()
	 * @generated
	 */
	int TOPOLOGY_CHANGE_DISCOVERY_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Transport Protocol Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTransportProtocolObject()
	 * @generated
	 */
	int TRANSPORT_PROTOCOL_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Virtual Directory Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualDirectoryName()
	 * @generated
	 */
	int VIRTUAL_DIRECTORY_NAME = 95;


	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement <em>Allocate Public Port From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocate Public Port From Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement
	 * @generated
	 */
	EClass getAllocatePublicPortFromElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement#getFixedPortRange <em>Fixed Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Port Range</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement#getFixedPortRange()
	 * @see #getAllocatePublicPortFromElement()
	 * @generated
	 */
	EReference getAllocatePublicPortFromElement_FixedPortRange();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.AllowAllTraffic <em>Allow All Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allow All Traffic</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.AllowAllTraffic
	 * @generated
	 */
	EClass getAllowAllTraffic();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Binding#getEndpointName <em>Endpoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Binding#getEndpointName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_EndpointName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Binding#getHostHeader <em>Host Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Header</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Binding#getHostHeader()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_HostHeader();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Bindings
	 * @generated
	 */
	EClass getBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Bindings#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Bindings#getBinding()
	 * @see #getBindings()
	 * @generated
	 */
	EReference getBindings_Binding();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate#getName()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel <em>Permission Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Level</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_PermissionLevel();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation <em>Store Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Location</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_StoreLocation();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate#getStoreName()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_StoreName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Certificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificates</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificates
	 * @generated
	 */
	EClass getCertificates();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Certificates#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificate</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificates#getCertificate()
	 * @see #getCertificates()
	 * @generated
	 */
	EReference getCertificates_Certificate();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSetting <em>Configuration Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSetting
	 * @generated
	 */
	EClass getConfigurationSetting();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSetting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSetting#getName()
	 * @see #getConfigurationSetting()
	 * @generated
	 */
	EAttribute getConfigurationSetting_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSettings
	 * @generated
	 */
	EClass getConfigurationSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSettings#getSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSettings#getSetting()
	 * @see #getConfigurationSettings()
	 * @generated
	 */
	EReference getConfigurationSettings_Setting();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentElement
	 * @generated
	 */
	EClass getContentElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getSourceDirectory <em>Source Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Directory</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentElement#getSourceDirectory()
	 * @see #getContentElement()
	 * @generated
	 */
	EReference getContentElement_SourceDirectory();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentElement#getDestination()
	 * @see #getContentElement()
	 * @generated
	 */
	EAttribute getContentElement_Destination();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ContentsElement <em>Contents Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contents Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentsElement
	 * @generated
	 */
	EClass getContentsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.ContentsElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentsElement#getContent()
	 * @see #getContentsElement()
	 * @generated
	 */
	EReference getContentsElement_Content();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Destinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destinations</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Destinations
	 * @generated
	 */
	EClass getDestinations();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.Destinations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Destinations#getGroup()
	 * @see #getDestinations()
	 * @generated
	 */
	EAttribute getDestinations_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Destinations#getRoleEndpoint <em>Role Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Destinations#getRoleEndpoint()
	 * @see #getDestinations()
	 * @generated
	 */
	EReference getDestinations_RoleEndpoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getRoleModule <em>Role Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Module</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot#getRoleModule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoleModule();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Definition</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot#getServiceDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceDefinition();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Endpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoints</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints
	 * @generated
	 */
	EClass getEndpoints();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.Endpoints#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints#getGroup()
	 * @see #getEndpoints()
	 * @generated
	 */
	EAttribute getEndpoints_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Endpoints#getInputEndpoint <em>Input Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints#getInputEndpoint()
	 * @see #getEndpoints()
	 * @generated
	 */
	EReference getEndpoints_InputEndpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Endpoints#getInternalEndpoint <em>Internal Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints#getInternalEndpoint()
	 * @see #getEndpoints()
	 * @generated
	 */
	EReference getEndpoints_InternalEndpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Endpoints#getInstanceInputEndpoint <em>Instance Input Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Input Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints#getInstanceInputEndpoint()
	 * @see #getEndpoints()
	 * @generated
	 */
	EReference getEndpoints_InstanceInputEndpoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.EntryPointElement <em>Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.EntryPointElement
	 * @generated
	 */
	EClass getEntryPointElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.EntryPointElement#getNetFxEntryPoint <em>Net Fx Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net Fx Entry Point</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.EntryPointElement#getNetFxEntryPoint()
	 * @see #getEntryPointElement()
	 * @generated
	 */
	EReference getEntryPointElement_NetFxEntryPoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Environment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Environment#getVariable()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Variable();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.FromRole <em>From Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.FromRole
	 * @generated
	 */
	EClass getFromRole();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.FromRole#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.FromRole#getRoleName()
	 * @see #getFromRole()
	 * @generated
	 */
	EAttribute getFromRole_RoleName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Import#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Import#getModuleName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ModuleName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.Imports#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Imports#getGroup()
	 * @see #getImports()
	 * @generated
	 */
	EAttribute getImports_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Imports#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Imports#getImport()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_Import();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint <em>Input Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint
	 * @generated
	 */
	EClass getInputEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getCertificate()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_Certificate();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Timeout In Minutes</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_IdleTimeoutInMinutes();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Role Instance Status</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_IgnoreRoleInstanceStatus();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balancer</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancer()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_LoadBalancer();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balancer Distribution</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_LoadBalancerDistribution();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerProbe <em>Load Balancer Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balancer Probe</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerProbe()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_LoadBalancerProbe();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLocalPort <em>Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLocalPort()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_LocalPort();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getName()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_Port();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol()
	 * @see #getInputEndpoint()
	 * @generated
	 */
	EAttribute getInputEndpoint_Protocol();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointsType <em>Input Endpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Endpoints Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointsType
	 * @generated
	 */
	EClass getInputEndpointsType();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointsType#getGroup()
	 * @see #getInputEndpointsType()
	 * @generated
	 */
	EAttribute getInputEndpointsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointsType#getInputEndpoint <em>Input Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointsType#getInputEndpoint()
	 * @see #getInputEndpointsType()
	 * @generated
	 */
	EReference getInputEndpointsType_InputEndpoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointType <em>Input Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Endpoint Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointType
	 * @generated
	 */
	EClass getInputEndpointType();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement <em>Instance Input Endpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Input Endpoint Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement
	 * @generated
	 */
	EClass getInstanceInputEndpointElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getAllocatePublicPortFrom <em>Allocate Public Port From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocate Public Port From</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getAllocatePublicPortFrom()
	 * @see #getInstanceInputEndpointElement()
	 * @generated
	 */
	EReference getInstanceInputEndpointElement_AllocatePublicPortFrom();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Timeout In Minutes</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes()
	 * @see #getInstanceInputEndpointElement()
	 * @generated
	 */
	EAttribute getInstanceInputEndpointElement_IdleTimeoutInMinutes();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort <em>Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort()
	 * @see #getInstanceInputEndpointElement()
	 * @generated
	 */
	EAttribute getInstanceInputEndpointElement_LocalPort();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getName()
	 * @see #getInstanceInputEndpointElement()
	 * @generated
	 */
	EAttribute getInstanceInputEndpointElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol()
	 * @see #getInstanceInputEndpointElement()
	 * @generated
	 */
	EAttribute getInstanceInputEndpointElement_Protocol();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint <em>Internal Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint
	 * @generated
	 */
	EClass getInternalEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getGroup()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EAttribute getInternalEndpoint_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPort <em>Fixed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPort()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EReference getInternalEndpoint_FixedPort();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPortRange <em>Fixed Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Port Range</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPortRange()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EReference getInternalEndpoint_FixedPortRange();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getName()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EAttribute getInternalEndpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getPort()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EAttribute getInternalEndpoint_Port();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol()
	 * @see #getInternalEndpoint()
	 * @generated
	 */
	EAttribute getInternalEndpoint_Protocol();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpointType <em>Internal Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Endpoint Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpointType
	 * @generated
	 */
	EClass getInternalEndpointType();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe <em>Load Balancer Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer Probe</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe
	 * @generated
	 */
	EClass getLoadBalancerProbe();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds <em>Interval In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval In Seconds</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_IntervalInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getName()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPath()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_Path();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_Port();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds <em>Timeout In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout In Seconds</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds()
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	EAttribute getLoadBalancerProbe_TimeoutInSeconds();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes <em>Load Balancer Probes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer Probes</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes
	 * @generated
	 */
	EClass getLoadBalancerProbes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes#getLoadBalancerProbe <em>Load Balancer Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Balancer Probe</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes#getLoadBalancerProbe()
	 * @see #getLoadBalancerProbes()
	 * @generated
	 */
	EReference getLoadBalancerProbes_LoadBalancerProbe();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.LocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Resources</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalResources
	 * @generated
	 */
	EClass getLocalResources();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.LocalResources#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalResources#getGroup()
	 * @see #getLocalResources()
	 * @generated
	 */
	EAttribute getLocalResources_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.LocalResources#getLocalStorage <em>Local Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Storage</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalResources#getLocalStorage()
	 * @see #getLocalResources()
	 * @generated
	 */
	EReference getLocalResources_LocalStorage();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.LocalStore <em>Local Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Store</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalStore
	 * @generated
	 */
	EClass getLocalStore();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean On Role Recycle</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle()
	 * @see #getLocalStore()
	 * @generated
	 */
	EAttribute getLocalStore_CleanOnRoleRecycle();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalStore#getName()
	 * @see #getLocalStore()
	 * @generated
	 */
	EAttribute getLocalStore_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB <em>Size In MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In MB</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB()
	 * @see #getLocalStore()
	 * @generated
	 */
	EAttribute getLocalStore_SizeInMB();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement <em>Net Fx Assembly Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Fx Assembly Entry Point Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement
	 * @generated
	 */
	EClass getNetFxAssemblyEntryPointElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getAssemblyName <em>Assembly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getAssemblyName()
	 * @see #getNetFxAssemblyEntryPointElement()
	 * @generated
	 */
	EAttribute getNetFxAssemblyEntryPointElement_AssemblyName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getTargetFrameworkVersion <em>Target Framework Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Framework Version</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement#getTargetFrameworkVersion()
	 * @see #getNetFxAssemblyEntryPointElement()
	 * @generated
	 */
	EAttribute getNetFxAssemblyEntryPointElement_TargetFrameworkVersion();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules <em>Network Traffic Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Traffic Rules</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules
	 * @generated
	 */
	EClass getNetworkTrafficRules();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules#getOnlyAllowTrafficTo <em>Only Allow Traffic To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Only Allow Traffic To</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules#getOnlyAllowTrafficTo()
	 * @see #getNetworkTrafficRules()
	 * @generated
	 */
	EReference getNetworkTrafficRules_OnlyAllowTrafficTo();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo <em>Only Allow Traffic To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Allow Traffic To</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo
	 * @generated
	 */
	EClass getOnlyAllowTrafficTo();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destinations</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getDestinations()
	 * @see #getOnlyAllowTrafficTo()
	 * @generated
	 */
	EReference getOnlyAllowTrafficTo_Destinations();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getAllowAllTraffic <em>Allow All Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allow All Traffic</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getAllowAllTraffic()
	 * @see #getOnlyAllowTrafficTo()
	 * @generated
	 */
	EReference getOnlyAllowTrafficTo_AllowAllTraffic();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getWhenSource <em>When Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Source</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getWhenSource()
	 * @see #getOnlyAllowTrafficTo()
	 * @generated
	 */
	EReference getOnlyAllowTrafficTo_WhenSource();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Port#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Port#getPort()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Port();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.PortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Range</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.PortRange
	 * @generated
	 */
	EClass getPortRange();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.PortRange#getMax()
	 * @see #getPortRange()
	 * @generated
	 */
	EAttribute getPortRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.PortRange#getMin()
	 * @see #getPortRange()
	 * @generated
	 */
	EAttribute getPortRange_Min();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement <em>Program Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Entry Point Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement
	 * @generated
	 */
	EClass getProgramEntryPointElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#getCommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Line</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#getCommandLine()
	 * @see #getProgramEntryPointElement()
	 * @generated
	 */
	EAttribute getProgramEntryPointElement_CommandLine();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart <em>Set Ready On Process Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Ready On Process Start</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement#isSetReadyOnProcessStart()
	 * @see #getProgramEntryPointElement()
	 * @generated
	 */
	EAttribute getProgramEntryPointElement_SetReadyOnProcessStart();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement <em>Rdma Endpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdma Endpoint Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement
	 * @generated
	 */
	EClass getRdmaEndpointElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement#getName()
	 * @see #getRdmaEndpointElement()
	 * @generated
	 */
	EAttribute getRdmaEndpointElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint <em>Role Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleEndpoint
	 * @generated
	 */
	EClass getRoleEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getEndpointName <em>Endpoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getEndpointName()
	 * @see #getRoleEndpoint()
	 * @generated
	 */
	EAttribute getRoleEndpoint_EndpointName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getRoleName()
	 * @see #getRoleEndpoint()
	 * @generated
	 */
	EAttribute getRoleEndpoint_RoleName();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement <em>Role Instance Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Instance Value Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement
	 * @generated
	 */
	EClass getRoleInstanceValueElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement#getXpath()
	 * @see #getRoleInstanceValueElement()
	 * @generated
	 */
	EAttribute getRoleInstanceValueElement_Xpath();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.RoleModule <em>Role Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Module</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule
	 * @generated
	 */
	EClass getRoleModule();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getStartup <em>Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startup</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getStartup()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_Startup();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getRuntime()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_Runtime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getConfigurationSettings()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_ConfigurationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoints</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getEndpoints()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_Endpoints();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getLocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Resources</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getLocalResources()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_LocalResources();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificates</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getCertificates()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_Certificates();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sites</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getSites()
	 * @see #getRoleModule()
	 * @generated
	 */
	EReference getRoleModule_Sites();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.RoleModule#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule#getNamespace()
	 * @see #getRoleModule()
	 * @generated
	 */
	EAttribute getRoleModule_Namespace();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Runtime#getEnvironment()
	 * @see #getRuntime()
	 * @generated
	 */
	EReference getRuntime_Environment();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Context</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext()
	 * @see #getRuntime()
	 * @generated
	 */
	EAttribute getRuntime_ExecutionContext();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule <em>Runtime For Role Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime For Role Module</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule
	 * @generated
	 */
	EClass getRuntimeForRoleModule();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Definition</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition
	 * @generated
	 */
	EClass getServiceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getLoadBalancerProbes <em>Load Balancer Probes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Balancer Probes</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getLoadBalancerProbes()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_LoadBalancerProbes();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getGroup()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWebRole <em>Web Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWebRole()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_WebRole();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWorkerRole <em>Worker Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worker Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getWorkerRole()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_WorkerRole();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getNetworkTrafficRules <em>Network Traffic Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Traffic Rules</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getNetworkTrafficRules()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_NetworkTrafficRules();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getName()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getSchemaVersion()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology Change Discovery</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getTopologyChangeDiscovery()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_TopologyChangeDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount <em>Upgrade Domain Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upgrade Domain Count</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition#getUpgradeDomainCount()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EAttribute getServiceDefinition_UpgradeDomainCount();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.Site#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Site#getBindings()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Bindings();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Sites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sites</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Sites
	 * @generated
	 */
	EClass getSites();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.Sites#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Sites#getGroup()
	 * @see #getSites()
	 * @generated
	 */
	EAttribute getSites_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Sites#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Sites#getSite()
	 * @see #getSites()
	 * @generated
	 */
	EReference getSites_Site();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement <em>Source Directory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Directory Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement
	 * @generated
	 */
	EClass getSourceDirectoryElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement#getPath()
	 * @see #getSourceDirectoryElement()
	 * @generated
	 */
	EAttribute getSourceDirectoryElement_Path();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Startup <em>Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startup</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Startup
	 * @generated
	 */
	EClass getStartup();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.Startup#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Startup#getTask()
	 * @see #getStartup()
	 * @generated
	 */
	EReference getStartup_Task();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Startup#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Startup#getPriority()
	 * @see #getStartup()
	 * @generated
	 */
	EAttribute getStartup_Priority();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.Task#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Task#getEnvironment()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Environment();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Task#getCommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Line</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Task#getCommandLine()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CommandLine();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Context</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ExecutionContext();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Task#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Task#getTaskType()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskType();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.Variable#getRoleInstanceValue <em>Role Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Instance Value</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Variable#getRoleInstanceValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_RoleInstanceValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.VirtualApplication <em>Virtual Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Application</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualApplication
	 * @generated
	 */
	EClass getVirtualApplication();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory <em>Virtual Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Directory</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory
	 * @generated
	 */
	EClass getVirtualDirectory();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getGroup()
	 * @see #getVirtualDirectory()
	 * @generated
	 */
	EAttribute getVirtualDirectory_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualDirectory <em>Virtual Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Directory</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualDirectory()
	 * @see #getVirtualDirectory()
	 * @generated
	 */
	EReference getVirtualDirectory_VirtualDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualApplication <em>Virtual Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Application</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualApplication()
	 * @see #getVirtualDirectory()
	 * @generated
	 */
	EReference getVirtualDirectory_VirtualApplication();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getName()
	 * @see #getVirtualDirectory()
	 * @generated
	 */
	EAttribute getVirtualDirectory_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getPhysicalDirectory <em>Physical Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Directory</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getPhysicalDirectory()
	 * @see #getVirtualDirectory()
	 * @generated
	 */
	EAttribute getVirtualDirectory_PhysicalDirectory();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WebRole <em>Web Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole
	 * @generated
	 */
	EClass getWebRole();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getImports()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getStartup <em>Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startup</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getStartup()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Startup();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalStorage <em>Local Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Storage</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getLocalStorage()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_LocalStorage();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getLocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Resources</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getLocalResources()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_LocalResources();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getConfigurationSettings()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_ConfigurationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInputEndpoints <em>Input Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Endpoints</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getInputEndpoints()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_InputEndpoints();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getInternalEndpoint <em>Internal Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Endpoint</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getInternalEndpoint()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_InternalEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoints</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getEndpoints()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Endpoints();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificates</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getCertificates()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Certificates();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getSites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sites</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getSites()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Sites();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getRuntime()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Runtime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getContents()
	 * @see #getWebRole()
	 * @generated
	 */
	EReference getWebRole_Contents();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Native Code Execution</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#isEnableNativeCodeExecution()
	 * @see #getWebRole()
	 * @generated
	 */
	EAttribute getWebRole_EnableNativeCodeExecution();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getName()
	 * @see #getWebRole()
	 * @generated
	 */
	EAttribute getWebRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize <em>Vmsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmsize</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole#getVmsize()
	 * @see #getWebRole()
	 * @generated
	 */
	EAttribute getWebRole_Vmsize();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WebRuntime <em>Web Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRuntime
	 * @generated
	 */
	EClass getWebRuntime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WebRuntime#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRuntime#getEntryPoint()
	 * @see #getWebRuntime()
	 * @generated
	 */
	EReference getWebRuntime_EntryPoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WhenSource <em>When Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Source</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WhenSource
	 * @generated
	 */
	EClass getWhenSource();

	/**
	 * Returns the meta object for the attribute list '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WhenSource#getGroup()
	 * @see #getWhenSource()
	 * @generated
	 */
	EAttribute getWhenSource_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getFromRole <em>From Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WhenSource#getFromRole()
	 * @see #getWhenSource()
	 * @generated
	 */
	EReference getWhenSource_FromRole();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches()
	 * @see #getWhenSource()
	 * @generated
	 */
	EAttribute getWhenSource_Matches();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement <em>Worker Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Entry Point Element</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement
	 * @generated
	 */
	EClass getWorkerEntryPointElement();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getProgramEntryPoint <em>Program Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Entry Point</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getProgramEntryPoint()
	 * @see #getWorkerEntryPointElement()
	 * @generated
	 */
	EReference getWorkerEntryPointElement_ProgramEntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getNetFxEntryPoint <em>Net Fx Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Net Fx Entry Point</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement#getNetFxEntryPoint()
	 * @see #getWorkerEntryPointElement()
	 * @generated
	 */
	EReference getWorkerEntryPointElement_NetFxEntryPoint();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole <em>Worker Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Role</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole
	 * @generated
	 */
	EClass getWorkerRole();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imports</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getImports()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getStartup <em>Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startup</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getStartup()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Startup();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getLocalStorage <em>Local Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Storage</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getLocalStorage()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_LocalStorage();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getLocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Resources</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getLocalResources()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_LocalResources();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Settings</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getConfigurationSettings()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_ConfigurationSettings();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoints</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getEndpoints()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Endpoints();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificates</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getCertificates()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Certificates();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getRuntime()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Runtime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getContents()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EReference getWorkerRole_Contents();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Native Code Execution</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#isEnableNativeCodeExecution()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EAttribute getWorkerRole_EnableNativeCodeExecution();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getName()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EAttribute getWorkerRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole#getVmsize <em>Vmsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmsize</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole#getVmsize()
	 * @see #getWorkerRole()
	 * @generated
	 */
	EAttribute getWorkerRole_Vmsize();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdef.WorkerRuntime <em>Worker Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker Runtime</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRuntime
	 * @generated
	 */
	EClass getWorkerRuntime();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdef.WorkerRuntime#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRuntime#getEntryPoint()
	 * @see #getWorkerRuntime()
	 * @generated
	 */
	EReference getWorkerRuntime_EntryPoint();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.AnyPort <em>Any Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Any Port</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
	 * @generated
	 */
	EEnum getAnyPort();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.BuiltinStoreName <em>Builtin Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Builtin Store Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
	 * @generated
	 */
	EEnum getBuiltinStoreName();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distribution Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @generated
	 */
	EEnum getDistributionType();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.ExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Context</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @generated
	 */
	EEnum getExecutionContext();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.InternalProtocol <em>Internal Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Internal Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @generated
	 */
	EEnum getInternalProtocol();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.MatchMode <em>Match Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Mode</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @generated
	 */
	EEnum getMatchMode();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.PermissionLevel <em>Permission Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Level</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @generated
	 */
	EEnum getPermissionLevel();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.ProbeProtocol <em>Probe Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probe Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @generated
	 */
	EEnum getProbeProtocol();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Version</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @generated
	 */
	EEnum getSchemaVersion();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.StoreLocation <em>Store Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Store Location</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @generated
	 */
	EEnum getStoreLocation();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @generated
	 */
	EEnum getTaskType();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery <em>Topology Change Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Topology Change Discovery</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @generated
	 */
	EEnum getTopologyChangeDiscovery();

	/**
	 * Returns the meta object for enum '{@link eu.artist.migration.deployment.azure.csdef.TransportProtocol <em>Transport Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Protocol</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @generated
	 */
	EEnum getTransportProtocol();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.AnyPort <em>Any Port Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any Port Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.AnyPort"
	 *        extendedMetaData="name='AnyPort:Object' baseType='AnyPort'"
	 * @generated
	 */
	EDataType getAnyPortObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.BuiltinStoreName <em>Builtin Store Name Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Builtin Store Name Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.BuiltinStoreName"
	 *        extendedMetaData="name='BuiltinStoreName:Object' baseType='BuiltinStoreName'"
	 * @generated
	 */
	EDataType getBuiltinStoreNameObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.DistributionType <em>Distribution Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Distribution Type Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.DistributionType"
	 *        extendedMetaData="name='DistributionType:Object' baseType='DistributionType'"
	 * @generated
	 */
	EDataType getDistributionTypeObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.ExecutionContext <em>Execution Context Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execution Context Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.ExecutionContext"
	 *        extendedMetaData="name='ExecutionContext:Object' baseType='ExecutionContext'"
	 * @generated
	 */
	EDataType getExecutionContextObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.InternalProtocol <em>Internal Protocol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Internal Protocol Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.InternalProtocol"
	 *        extendedMetaData="name='InternalProtocol:Object' baseType='InternalProtocol'"
	 * @generated
	 */
	EDataType getInternalProtocolObject();

	/**
	 * Returns the meta object for data type '<em>LB Probe Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LB Probe Interval</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='LBProbeInterval' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='5'"
	 * @generated
	 */
	EDataType getLBProbeInterval();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>LB Probe Interval Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LB Probe Interval Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='LBProbeInterval:Object' baseType='LBProbeInterval'"
	 * @generated
	 */
	EDataType getLBProbeIntervalObject();

	/**
	 * Returns the meta object for data type '<em>LB Probe Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LB Probe Timeout</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='LBProbeTimeout' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='11'"
	 * @generated
	 */
	EDataType getLBProbeTimeout();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>LB Probe Timeout Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LB Probe Timeout Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='LBProbeTimeout:Object' baseType='LBProbeTimeout'"
	 * @generated
	 */
	EDataType getLBProbeTimeoutObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.MatchMode <em>Match Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Match Mode Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.MatchMode"
	 *        extendedMetaData="name='MatchMode:Object' baseType='MatchMode'"
	 * @generated
	 */
	EDataType getMatchModeObject();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NonEmptyString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='256'"
	 * @generated
	 */
	EDataType getNonEmptyString();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.PermissionLevel <em>Permission Level Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Permission Level Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.PermissionLevel"
	 *        extendedMetaData="name='PermissionLevel:Object' baseType='PermissionLevel'"
	 * @generated
	 */
	EDataType getPermissionLevelObject();

	/**
	 * Returns the meta object for data type '<em>Port Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Integer</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='PortInteger' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPortInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Port Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Integer Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PortInteger:Object' baseType='PortInteger'"
	 * @generated
	 */
	EDataType getPortIntegerObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Port Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Specifier</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='PortSpecifier' memberTypes='PortInteger AnyPort'"
	 * @generated
	 */
	EDataType getPortSpecifier();

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
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.ProbeProtocol <em>Probe Protocol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Probe Protocol Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.ProbeProtocol"
	 *        extendedMetaData="name='ProbeProtocol:Object' baseType='ProbeProtocol'"
	 * @generated
	 */
	EDataType getProbeProtocolObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.Protocol <em>Protocol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.Protocol"
	 *        extendedMetaData="name='Protocol:Object' baseType='Protocol'"
	 * @generated
	 */
	EDataType getProtocolObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.SchemaVersion <em>Schema Version Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Schema Version Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.SchemaVersion"
	 *        extendedMetaData="name='SchemaVersion:Object' baseType='SchemaVersion'"
	 * @generated
	 */
	EDataType getSchemaVersionObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.StoreLocation <em>Store Location Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Store Location Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.StoreLocation"
	 *        extendedMetaData="name='StoreLocation:Object' baseType='StoreLocation'"
	 * @generated
	 */
	EDataType getStoreLocationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Store Name</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='StoreName' memberTypes='BuiltinStoreName NonEmptyString'"
	 * @generated
	 */
	EDataType getStoreName();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.TaskType <em>Task Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Type Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.TaskType"
	 *        extendedMetaData="name='TaskType:Object' baseType='TaskType'"
	 * @generated
	 */
	EDataType getTaskTypeObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery <em>Topology Change Discovery Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Topology Change Discovery Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery"
	 *        extendedMetaData="name='TopologyChangeDiscovery:Object' baseType='TopologyChangeDiscovery'"
	 * @generated
	 */
	EDataType getTopologyChangeDiscoveryObject();

	/**
	 * Returns the meta object for data type '{@link eu.artist.migration.deployment.azure.csdef.TransportProtocol <em>Transport Protocol Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transport Protocol Object</em>'.
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @model instanceClass="eu.artist.migration.deployment.azure.csdef.TransportProtocol"
	 *        extendedMetaData="name='TransportProtocol:Object' baseType='TransportProtocol'"
	 * @generated
	 */
	EDataType getTransportProtocolObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Virtual Directory Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Virtual Directory Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VirtualDirectoryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='^[a-zA-Z_][^\\\\/\\?;:@&=\\+\\$,\\|\"<>\\`\\\'\\^]*(?<![\\.\\s])$'"
	 * @generated
	 */
	EDataType getVirtualDirectoryName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AzureCSDefFactory getAzureCSDefFactory();

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
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.AllocatePublicPortFromElementImpl <em>Allocate Public Port From Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AllocatePublicPortFromElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAllocatePublicPortFromElement()
		 * @generated
		 */
		EClass ALLOCATE_PUBLIC_PORT_FROM_ELEMENT = eINSTANCE.getAllocatePublicPortFromElement();

		/**
		 * The meta object literal for the '<em><b>Fixed Port Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE = eINSTANCE.getAllocatePublicPortFromElement_FixedPortRange();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.AllowAllTrafficImpl <em>Allow All Traffic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AllowAllTrafficImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAllowAllTraffic()
		 * @generated
		 */
		EClass ALLOW_ALL_TRAFFIC = eINSTANCE.getAllowAllTraffic();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.BindingImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Endpoint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__ENDPOINT_NAME = eINSTANCE.getBinding_EndpointName();

		/**
		 * The meta object literal for the '<em><b>Host Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__HOST_HEADER = eINSTANCE.getBinding_HostHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.BindingsImpl <em>Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.BindingsImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBindings()
		 * @generated
		 */
		EClass BINDINGS = eINSTANCE.getBindings();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDINGS__BINDING = eINSTANCE.getBindings_Binding();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getCertificate()
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
		 * The meta object literal for the '<em><b>Permission Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__PERMISSION_LEVEL = eINSTANCE.getCertificate_PermissionLevel();

		/**
		 * The meta object literal for the '<em><b>Store Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__STORE_LOCATION = eINSTANCE.getCertificate_StoreLocation();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__STORE_NAME = eINSTANCE.getCertificate_StoreName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.CertificatesImpl <em>Certificates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.CertificatesImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getCertificates()
		 * @generated
		 */
		EClass CERTIFICATES = eINSTANCE.getCertificates();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICATES__CERTIFICATE = eINSTANCE.getCertificates_Certificate();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingImpl <em>Configuration Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getConfigurationSetting()
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
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingsImpl <em>Configuration Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ConfigurationSettingsImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getConfigurationSettings()
		 * @generated
		 */
		EClass CONFIGURATION_SETTINGS = eINSTANCE.getConfigurationSettings();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SETTINGS__SETTING = eINSTANCE.getConfigurationSettings_Setting();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl <em>Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ContentElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getContentElement()
		 * @generated
		 */
		EClass CONTENT_ELEMENT = eINSTANCE.getContentElement();

		/**
		 * The meta object literal for the '<em><b>Source Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_ELEMENT__SOURCE_DIRECTORY = eINSTANCE.getContentElement_SourceDirectory();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ELEMENT__DESTINATION = eINSTANCE.getContentElement_Destination();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ContentsElementImpl <em>Contents Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ContentsElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getContentsElement()
		 * @generated
		 */
		EClass CONTENTS_ELEMENT = eINSTANCE.getContentsElement();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTS_ELEMENT__CONTENT = eINSTANCE.getContentsElement_Content();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.DestinationsImpl <em>Destinations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.DestinationsImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDestinations()
		 * @generated
		 */
		EClass DESTINATIONS = eINSTANCE.getDestinations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATIONS__GROUP = eINSTANCE.getDestinations_Group();

		/**
		 * The meta object literal for the '<em><b>Role Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATIONS__ROLE_ENDPOINT = eINSTANCE.getDestinations_RoleEndpoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.DocumentRootImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Role Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROLE_MODULE = eINSTANCE.getDocumentRoot_RoleModule();

		/**
		 * The meta object literal for the '<em><b>Service Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_DEFINITION = eINSTANCE.getDocumentRoot_ServiceDefinition();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl <em>Endpoints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.EndpointsImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEndpoints()
		 * @generated
		 */
		EClass ENDPOINTS = eINSTANCE.getEndpoints();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINTS__GROUP = eINSTANCE.getEndpoints_Group();

		/**
		 * The meta object literal for the '<em><b>Input Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINTS__INPUT_ENDPOINT = eINSTANCE.getEndpoints_InputEndpoint();

		/**
		 * The meta object literal for the '<em><b>Internal Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINTS__INTERNAL_ENDPOINT = eINSTANCE.getEndpoints_InternalEndpoint();

		/**
		 * The meta object literal for the '<em><b>Instance Input Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINTS__INSTANCE_INPUT_ENDPOINT = eINSTANCE.getEndpoints_InstanceInputEndpoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EntryPointElementImpl <em>Entry Point Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.EntryPointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEntryPointElement()
		 * @generated
		 */
		EClass ENTRY_POINT_ELEMENT = eINSTANCE.getEntryPointElement();

		/**
		 * The meta object literal for the '<em><b>Net Fx Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT = eINSTANCE.getEntryPointElement_NetFxEntryPoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.EnvironmentImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__VARIABLE = eINSTANCE.getEnvironment_Variable();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.FromRoleImpl <em>From Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.FromRoleImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getFromRole()
		 * @generated
		 */
		EClass FROM_ROLE = eINSTANCE.getFromRole();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ROLE__ROLE_NAME = eINSTANCE.getFromRole_RoleName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ImportImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__MODULE_NAME = eINSTANCE.getImport_ModuleName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ImportsImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTS__GROUP = eINSTANCE.getImports_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__IMPORT = eINSTANCE.getImports_Import();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl <em>Input Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpoint()
		 * @generated
		 */
		EClass INPUT_ENDPOINT = eINSTANCE.getInputEndpoint();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__CERTIFICATE = eINSTANCE.getInputEndpoint_Certificate();

		/**
		 * The meta object literal for the '<em><b>Idle Timeout In Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES = eINSTANCE.getInputEndpoint_IdleTimeoutInMinutes();

		/**
		 * The meta object literal for the '<em><b>Ignore Role Instance Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS = eINSTANCE.getInputEndpoint_IgnoreRoleInstanceStatus();

		/**
		 * The meta object literal for the '<em><b>Load Balancer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__LOAD_BALANCER = eINSTANCE.getInputEndpoint_LoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION = eINSTANCE.getInputEndpoint_LoadBalancerDistribution();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Probe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__LOAD_BALANCER_PROBE = eINSTANCE.getInputEndpoint_LoadBalancerProbe();

		/**
		 * The meta object literal for the '<em><b>Local Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__LOCAL_PORT = eINSTANCE.getInputEndpoint_LocalPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__NAME = eINSTANCE.getInputEndpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__PORT = eINSTANCE.getInputEndpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINT__PROTOCOL = eINSTANCE.getInputEndpoint_Protocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointsTypeImpl <em>Input Endpoints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointsTypeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpointsType()
		 * @generated
		 */
		EClass INPUT_ENDPOINTS_TYPE = eINSTANCE.getInputEndpointsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ENDPOINTS_TYPE__GROUP = eINSTANCE.getInputEndpointsType_Group();

		/**
		 * The meta object literal for the '<em><b>Input Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ENDPOINTS_TYPE__INPUT_ENDPOINT = eINSTANCE.getInputEndpointsType_InputEndpoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointTypeImpl <em>Input Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InputEndpointTypeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInputEndpointType()
		 * @generated
		 */
		EClass INPUT_ENDPOINT_TYPE = eINSTANCE.getInputEndpointType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl <em>Instance Input Endpoint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInstanceInputEndpointElement()
		 * @generated
		 */
		EClass INSTANCE_INPUT_ENDPOINT_ELEMENT = eINSTANCE.getInstanceInputEndpointElement();

		/**
		 * The meta object literal for the '<em><b>Allocate Public Port From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM = eINSTANCE.getInstanceInputEndpointElement_AllocatePublicPortFrom();

		/**
		 * The meta object literal for the '<em><b>Idle Timeout In Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES = eINSTANCE.getInstanceInputEndpointElement_IdleTimeoutInMinutes();

		/**
		 * The meta object literal for the '<em><b>Local Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT = eINSTANCE.getInstanceInputEndpointElement_LocalPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME = eINSTANCE.getInstanceInputEndpointElement_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL = eINSTANCE.getInstanceInputEndpointElement_Protocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl <em>Internal Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalEndpoint()
		 * @generated
		 */
		EClass INTERNAL_ENDPOINT = eINSTANCE.getInternalEndpoint();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ENDPOINT__GROUP = eINSTANCE.getInternalEndpoint_Group();

		/**
		 * The meta object literal for the '<em><b>Fixed Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ENDPOINT__FIXED_PORT = eINSTANCE.getInternalEndpoint_FixedPort();

		/**
		 * The meta object literal for the '<em><b>Fixed Port Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ENDPOINT__FIXED_PORT_RANGE = eINSTANCE.getInternalEndpoint_FixedPortRange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ENDPOINT__NAME = eINSTANCE.getInternalEndpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ENDPOINT__PORT = eINSTANCE.getInternalEndpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ENDPOINT__PROTOCOL = eINSTANCE.getInternalEndpoint_Protocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointTypeImpl <em>Internal Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointTypeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalEndpointType()
		 * @generated
		 */
		EClass INTERNAL_ENDPOINT_TYPE = eINSTANCE.getInternalEndpointType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl <em>Load Balancer Probe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLoadBalancerProbe()
		 * @generated
		 */
		EClass LOAD_BALANCER_PROBE = eINSTANCE.getLoadBalancerProbe();

		/**
		 * The meta object literal for the '<em><b>Interval In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS = eINSTANCE.getLoadBalancerProbe_IntervalInSeconds();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__NAME = eINSTANCE.getLoadBalancerProbe_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__PATH = eINSTANCE.getLoadBalancerProbe_Path();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__PORT = eINSTANCE.getLoadBalancerProbe_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__PROTOCOL = eINSTANCE.getLoadBalancerProbe_Protocol();

		/**
		 * The meta object literal for the '<em><b>Timeout In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS = eINSTANCE.getLoadBalancerProbe_TimeoutInSeconds();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbesImpl <em>Load Balancer Probes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbesImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLoadBalancerProbes()
		 * @generated
		 */
		EClass LOAD_BALANCER_PROBES = eINSTANCE.getLoadBalancerProbes();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Probe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE = eINSTANCE.getLoadBalancerProbes_LoadBalancerProbe();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LocalResourcesImpl <em>Local Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.LocalResourcesImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLocalResources()
		 * @generated
		 */
		EClass LOCAL_RESOURCES = eINSTANCE.getLocalResources();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESOURCES__GROUP = eINSTANCE.getLocalResources_Group();

		/**
		 * The meta object literal for the '<em><b>Local Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_RESOURCES__LOCAL_STORAGE = eINSTANCE.getLocalResources_LocalStorage();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl <em>Local Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLocalStore()
		 * @generated
		 */
		EClass LOCAL_STORE = eINSTANCE.getLocalStore();

		/**
		 * The meta object literal for the '<em><b>Clean On Role Recycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE = eINSTANCE.getLocalStore_CleanOnRoleRecycle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_STORE__NAME = eINSTANCE.getLocalStore_Name();

		/**
		 * The meta object literal for the '<em><b>Size In MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_STORE__SIZE_IN_MB = eINSTANCE.getLocalStore_SizeInMB();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl <em>Net Fx Assembly Entry Point Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNetFxAssemblyEntryPointElement()
		 * @generated
		 */
		EClass NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT = eINSTANCE.getNetFxAssemblyEntryPointElement();

		/**
		 * The meta object literal for the '<em><b>Assembly Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME = eINSTANCE.getNetFxAssemblyEntryPointElement_AssemblyName();

		/**
		 * The meta object literal for the '<em><b>Target Framework Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION = eINSTANCE.getNetFxAssemblyEntryPointElement_TargetFrameworkVersion();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.NetworkTrafficRulesImpl <em>Network Traffic Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.NetworkTrafficRulesImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNetworkTrafficRules()
		 * @generated
		 */
		EClass NETWORK_TRAFFIC_RULES = eINSTANCE.getNetworkTrafficRules();

		/**
		 * The meta object literal for the '<em><b>Only Allow Traffic To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO = eINSTANCE.getNetworkTrafficRules_OnlyAllowTrafficTo();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl <em>Only Allow Traffic To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getOnlyAllowTrafficTo()
		 * @generated
		 */
		EClass ONLY_ALLOW_TRAFFIC_TO = eINSTANCE.getOnlyAllowTrafficTo();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS = eINSTANCE.getOnlyAllowTrafficTo_Destinations();

		/**
		 * The meta object literal for the '<em><b>Allow All Traffic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC = eINSTANCE.getOnlyAllowTrafficTo_AllowAllTraffic();

		/**
		 * The meta object literal for the '<em><b>When Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE = eINSTANCE.getOnlyAllowTrafficTo_WhenSource();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.PortImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT = eINSTANCE.getPort_Port();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.PortRangeImpl <em>Port Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.PortRangeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortRange()
		 * @generated
		 */
		EClass PORT_RANGE = eINSTANCE.getPortRange();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE__MAX = eINSTANCE.getPortRange_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_RANGE__MIN = eINSTANCE.getPortRange_Min();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl <em>Program Entry Point Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ProgramEntryPointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProgramEntryPointElement()
		 * @generated
		 */
		EClass PROGRAM_ENTRY_POINT_ELEMENT = eINSTANCE.getProgramEntryPointElement();

		/**
		 * The meta object literal for the '<em><b>Command Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE = eINSTANCE.getProgramEntryPointElement_CommandLine();

		/**
		 * The meta object literal for the '<em><b>Set Ready On Process Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START = eINSTANCE.getProgramEntryPointElement_SetReadyOnProcessStart();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RdmaEndpointElementImpl <em>Rdma Endpoint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RdmaEndpointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRdmaEndpointElement()
		 * @generated
		 */
		EClass RDMA_ENDPOINT_ELEMENT = eINSTANCE.getRdmaEndpointElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDMA_ENDPOINT_ELEMENT__NAME = eINSTANCE.getRdmaEndpointElement_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleEndpointImpl <em>Role Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleEndpointImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleEndpoint()
		 * @generated
		 */
		EClass ROLE_ENDPOINT = eINSTANCE.getRoleEndpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ENDPOINT__ENDPOINT_NAME = eINSTANCE.getRoleEndpoint_EndpointName();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ENDPOINT__ROLE_NAME = eINSTANCE.getRoleEndpoint_RoleName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleInstanceValueElementImpl <em>Role Instance Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleInstanceValueElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleInstanceValueElement()
		 * @generated
		 */
		EClass ROLE_INSTANCE_VALUE_ELEMENT = eINSTANCE.getRoleInstanceValueElement();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_INSTANCE_VALUE_ELEMENT__XPATH = eINSTANCE.getRoleInstanceValueElement_Xpath();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl <em>Role Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRoleModule()
		 * @generated
		 */
		EClass ROLE_MODULE = eINSTANCE.getRoleModule();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__STARTUP = eINSTANCE.getRoleModule_Startup();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__RUNTIME = eINSTANCE.getRoleModule_Runtime();

		/**
		 * The meta object literal for the '<em><b>Configuration Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__CONFIGURATION_SETTINGS = eINSTANCE.getRoleModule_ConfigurationSettings();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__ENDPOINTS = eINSTANCE.getRoleModule_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Local Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__LOCAL_RESOURCES = eINSTANCE.getRoleModule_LocalResources();

		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__CERTIFICATES = eINSTANCE.getRoleModule_Certificates();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODULE__SITES = eINSTANCE.getRoleModule_Sites();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MODULE__NAMESPACE = eINSTANCE.getRoleModule_Namespace();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME__ENVIRONMENT = eINSTANCE.getRuntime_Environment();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME__EXECUTION_CONTEXT = eINSTANCE.getRuntime_ExecutionContext();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeForRoleModuleImpl <em>Runtime For Role Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.RuntimeForRoleModuleImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getRuntimeForRoleModule()
		 * @generated
		 */
		EClass RUNTIME_FOR_ROLE_MODULE = eINSTANCE.getRuntimeForRoleModule();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getServiceDefinition()
		 * @generated
		 */
		EClass SERVICE_DEFINITION = eINSTANCE.getServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Load Balancer Probes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__LOAD_BALANCER_PROBES = eINSTANCE.getServiceDefinition_LoadBalancerProbes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__GROUP = eINSTANCE.getServiceDefinition_Group();

		/**
		 * The meta object literal for the '<em><b>Web Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__WEB_ROLE = eINSTANCE.getServiceDefinition_WebRole();

		/**
		 * The meta object literal for the '<em><b>Worker Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__WORKER_ROLE = eINSTANCE.getServiceDefinition_WorkerRole();

		/**
		 * The meta object literal for the '<em><b>Network Traffic Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES = eINSTANCE.getServiceDefinition_NetworkTrafficRules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__NAME = eINSTANCE.getServiceDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__SCHEMA_VERSION = eINSTANCE.getServiceDefinition_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Topology Change Discovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY = eINSTANCE.getServiceDefinition_TopologyChangeDiscovery();

		/**
		 * The meta object literal for the '<em><b>Upgrade Domain Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT = eINSTANCE.getServiceDefinition_UpgradeDomainCount();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.SiteImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__BINDINGS = eINSTANCE.getSite_Bindings();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SitesImpl <em>Sites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.SitesImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSites()
		 * @generated
		 */
		EClass SITES = eINSTANCE.getSites();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITES__GROUP = eINSTANCE.getSites_Group();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITES__SITE = eINSTANCE.getSites_Site();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.SourceDirectoryElementImpl <em>Source Directory Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.SourceDirectoryElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSourceDirectoryElement()
		 * @generated
		 */
		EClass SOURCE_DIRECTORY_ELEMENT = eINSTANCE.getSourceDirectoryElement();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DIRECTORY_ELEMENT__PATH = eINSTANCE.getSourceDirectoryElement_Path();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.StartupImpl <em>Startup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.StartupImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStartup()
		 * @generated
		 */
		EClass STARTUP = eINSTANCE.getStartup();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTUP__TASK = eINSTANCE.getStartup_Task();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTUP__PRIORITY = eINSTANCE.getStartup_Priority();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.TaskImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ENVIRONMENT = eINSTANCE.getTask_Environment();

		/**
		 * The meta object literal for the '<em><b>Command Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COMMAND_LINE = eINSTANCE.getTask_CommandLine();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__EXECUTION_CONTEXT = eINSTANCE.getTask_ExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_TYPE = eINSTANCE.getTask_TaskType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.VariableImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Role Instance Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ROLE_INSTANCE_VALUE = eINSTANCE.getVariable_RoleInstanceValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualApplicationImpl <em>Virtual Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.VirtualApplicationImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualApplication()
		 * @generated
		 */
		EClass VIRTUAL_APPLICATION = eINSTANCE.getVirtualApplication();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl <em>Virtual Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualDirectory()
		 * @generated
		 */
		EClass VIRTUAL_DIRECTORY = eINSTANCE.getVirtualDirectory();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_DIRECTORY__GROUP = eINSTANCE.getVirtualDirectory_Group();

		/**
		 * The meta object literal for the '<em><b>Virtual Directory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY = eINSTANCE.getVirtualDirectory_VirtualDirectory();

		/**
		 * The meta object literal for the '<em><b>Virtual Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION = eINSTANCE.getVirtualDirectory_VirtualApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_DIRECTORY__NAME = eINSTANCE.getVirtualDirectory_Name();

		/**
		 * The meta object literal for the '<em><b>Physical Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY = eINSTANCE.getVirtualDirectory_PhysicalDirectory();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl <em>Web Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWebRole()
		 * @generated
		 */
		EClass WEB_ROLE = eINSTANCE.getWebRole();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__IMPORTS = eINSTANCE.getWebRole_Imports();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__STARTUP = eINSTANCE.getWebRole_Startup();

		/**
		 * The meta object literal for the '<em><b>Local Storage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__LOCAL_STORAGE = eINSTANCE.getWebRole_LocalStorage();

		/**
		 * The meta object literal for the '<em><b>Local Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__LOCAL_RESOURCES = eINSTANCE.getWebRole_LocalResources();

		/**
		 * The meta object literal for the '<em><b>Configuration Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__CONFIGURATION_SETTINGS = eINSTANCE.getWebRole_ConfigurationSettings();

		/**
		 * The meta object literal for the '<em><b>Input Endpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__INPUT_ENDPOINTS = eINSTANCE.getWebRole_InputEndpoints();

		/**
		 * The meta object literal for the '<em><b>Internal Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__INTERNAL_ENDPOINT = eINSTANCE.getWebRole_InternalEndpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__ENDPOINTS = eINSTANCE.getWebRole_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__CERTIFICATES = eINSTANCE.getWebRole_Certificates();

		/**
		 * The meta object literal for the '<em><b>Sites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__SITES = eINSTANCE.getWebRole_Sites();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__RUNTIME = eINSTANCE.getWebRole_Runtime();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ROLE__CONTENTS = eINSTANCE.getWebRole_Contents();

		/**
		 * The meta object literal for the '<em><b>Enable Native Code Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION = eINSTANCE.getWebRole_EnableNativeCodeExecution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ROLE__NAME = eINSTANCE.getWebRole_Name();

		/**
		 * The meta object literal for the '<em><b>Vmsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ROLE__VMSIZE = eINSTANCE.getWebRole_Vmsize();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WebRuntimeImpl <em>Web Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WebRuntimeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWebRuntime()
		 * @generated
		 */
		EClass WEB_RUNTIME = eINSTANCE.getWebRuntime();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_RUNTIME__ENTRY_POINT = eINSTANCE.getWebRuntime_EntryPoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl <em>When Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WhenSourceImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWhenSource()
		 * @generated
		 */
		EClass WHEN_SOURCE = eINSTANCE.getWhenSource();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_SOURCE__GROUP = eINSTANCE.getWhenSource_Group();

		/**
		 * The meta object literal for the '<em><b>From Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_SOURCE__FROM_ROLE = eINSTANCE.getWhenSource_FromRole();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_SOURCE__MATCHES = eINSTANCE.getWhenSource_Matches();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl <em>Worker Entry Point Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerEntryPointElement()
		 * @generated
		 */
		EClass WORKER_ENTRY_POINT_ELEMENT = eINSTANCE.getWorkerEntryPointElement();

		/**
		 * The meta object literal for the '<em><b>Program Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT = eINSTANCE.getWorkerEntryPointElement_ProgramEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Net Fx Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT = eINSTANCE.getWorkerEntryPointElement_NetFxEntryPoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerRoleImpl <em>Worker Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerRoleImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerRole()
		 * @generated
		 */
		EClass WORKER_ROLE = eINSTANCE.getWorkerRole();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__IMPORTS = eINSTANCE.getWorkerRole_Imports();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__STARTUP = eINSTANCE.getWorkerRole_Startup();

		/**
		 * The meta object literal for the '<em><b>Local Storage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__LOCAL_STORAGE = eINSTANCE.getWorkerRole_LocalStorage();

		/**
		 * The meta object literal for the '<em><b>Local Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__LOCAL_RESOURCES = eINSTANCE.getWorkerRole_LocalResources();

		/**
		 * The meta object literal for the '<em><b>Configuration Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__CONFIGURATION_SETTINGS = eINSTANCE.getWorkerRole_ConfigurationSettings();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__ENDPOINTS = eINSTANCE.getWorkerRole_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__CERTIFICATES = eINSTANCE.getWorkerRole_Certificates();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__RUNTIME = eINSTANCE.getWorkerRole_Runtime();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_ROLE__CONTENTS = eINSTANCE.getWorkerRole_Contents();

		/**
		 * The meta object literal for the '<em><b>Enable Native Code Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER_ROLE__ENABLE_NATIVE_CODE_EXECUTION = eINSTANCE.getWorkerRole_EnableNativeCodeExecution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER_ROLE__NAME = eINSTANCE.getWorkerRole_Name();

		/**
		 * The meta object literal for the '<em><b>Vmsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER_ROLE__VMSIZE = eINSTANCE.getWorkerRole_Vmsize();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerRuntimeImpl <em>Worker Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.WorkerRuntimeImpl
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getWorkerRuntime()
		 * @generated
		 */
		EClass WORKER_RUNTIME = eINSTANCE.getWorkerRuntime();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER_RUNTIME__ENTRY_POINT = eINSTANCE.getWorkerRuntime_EntryPoint();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.AnyPort <em>Any Port</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAnyPort()
		 * @generated
		 */
		EEnum ANY_PORT = eINSTANCE.getAnyPort();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.BuiltinStoreName <em>Builtin Store Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBuiltinStoreName()
		 * @generated
		 */
		EEnum BUILTIN_STORE_NAME = eINSTANCE.getBuiltinStoreName();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.DistributionType <em>Distribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDistributionType()
		 * @generated
		 */
		EEnum DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.ExecutionContext <em>Execution Context</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getExecutionContext()
		 * @generated
		 */
		EEnum EXECUTION_CONTEXT = eINSTANCE.getExecutionContext();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.InternalProtocol <em>Internal Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalProtocol()
		 * @generated
		 */
		EEnum INTERNAL_PROTOCOL = eINSTANCE.getInternalProtocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.MatchMode <em>Match Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getMatchMode()
		 * @generated
		 */
		EEnum MATCH_MODE = eINSTANCE.getMatchMode();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.PermissionLevel <em>Permission Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPermissionLevel()
		 * @generated
		 */
		EEnum PERMISSION_LEVEL = eINSTANCE.getPermissionLevel();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.ProbeProtocol <em>Probe Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProbeProtocol()
		 * @generated
		 */
		EEnum PROBE_PROTOCOL = eINSTANCE.getProbeProtocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.Protocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.SchemaVersion <em>Schema Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EEnum SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.StoreLocation <em>Store Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreLocation()
		 * @generated
		 */
		EEnum STORE_LOCATION = eINSTANCE.getStoreLocation();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.TaskType <em>Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TaskType
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTaskType()
		 * @generated
		 */
		EEnum TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery <em>Topology Change Discovery</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTopologyChangeDiscovery()
		 * @generated
		 */
		EEnum TOPOLOGY_CHANGE_DISCOVERY = eINSTANCE.getTopologyChangeDiscovery();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdef.TransportProtocol <em>Transport Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTransportProtocol()
		 * @generated
		 */
		EEnum TRANSPORT_PROTOCOL = eINSTANCE.getTransportProtocol();

		/**
		 * The meta object literal for the '<em>Any Port Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.AnyPort
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getAnyPortObject()
		 * @generated
		 */
		EDataType ANY_PORT_OBJECT = eINSTANCE.getAnyPortObject();

		/**
		 * The meta object literal for the '<em>Builtin Store Name Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.BuiltinStoreName
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getBuiltinStoreNameObject()
		 * @generated
		 */
		EDataType BUILTIN_STORE_NAME_OBJECT = eINSTANCE.getBuiltinStoreNameObject();

		/**
		 * The meta object literal for the '<em>Distribution Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getDistributionTypeObject()
		 * @generated
		 */
		EDataType DISTRIBUTION_TYPE_OBJECT = eINSTANCE.getDistributionTypeObject();

		/**
		 * The meta object literal for the '<em>Execution Context Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getExecutionContextObject()
		 * @generated
		 */
		EDataType EXECUTION_CONTEXT_OBJECT = eINSTANCE.getExecutionContextObject();

		/**
		 * The meta object literal for the '<em>Internal Protocol Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getInternalProtocolObject()
		 * @generated
		 */
		EDataType INTERNAL_PROTOCOL_OBJECT = eINSTANCE.getInternalProtocolObject();

		/**
		 * The meta object literal for the '<em>LB Probe Interval</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeInterval()
		 * @generated
		 */
		EDataType LB_PROBE_INTERVAL = eINSTANCE.getLBProbeInterval();

		/**
		 * The meta object literal for the '<em>LB Probe Interval Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeIntervalObject()
		 * @generated
		 */
		EDataType LB_PROBE_INTERVAL_OBJECT = eINSTANCE.getLBProbeIntervalObject();

		/**
		 * The meta object literal for the '<em>LB Probe Timeout</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeTimeout()
		 * @generated
		 */
		EDataType LB_PROBE_TIMEOUT = eINSTANCE.getLBProbeTimeout();

		/**
		 * The meta object literal for the '<em>LB Probe Timeout Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getLBProbeTimeoutObject()
		 * @generated
		 */
		EDataType LB_PROBE_TIMEOUT_OBJECT = eINSTANCE.getLBProbeTimeoutObject();

		/**
		 * The meta object literal for the '<em>Match Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getMatchModeObject()
		 * @generated
		 */
		EDataType MATCH_MODE_OBJECT = eINSTANCE.getMatchModeObject();

		/**
		 * The meta object literal for the '<em>Named Element Name String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNamedElementNameString()
		 * @generated
		 */
		EDataType NAMED_ELEMENT_NAME_STRING = eINSTANCE.getNamedElementNameString();

		/**
		 * The meta object literal for the '<em>Non Empty String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getNonEmptyString()
		 * @generated
		 */
		EDataType NON_EMPTY_STRING = eINSTANCE.getNonEmptyString();

		/**
		 * The meta object literal for the '<em>Permission Level Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPermissionLevelObject()
		 * @generated
		 */
		EDataType PERMISSION_LEVEL_OBJECT = eINSTANCE.getPermissionLevelObject();

		/**
		 * The meta object literal for the '<em>Port Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortInteger()
		 * @generated
		 */
		EDataType PORT_INTEGER = eINSTANCE.getPortInteger();

		/**
		 * The meta object literal for the '<em>Port Integer Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortIntegerObject()
		 * @generated
		 */
		EDataType PORT_INTEGER_OBJECT = eINSTANCE.getPortIntegerObject();

		/**
		 * The meta object literal for the '<em>Port Specifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPortSpecifier()
		 * @generated
		 */
		EDataType PORT_SPECIFIER = eINSTANCE.getPortSpecifier();

		/**
		 * The meta object literal for the '<em>Positive Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPositiveInt()
		 * @generated
		 */
		EDataType POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '<em>Positive Int Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getPositiveIntObject()
		 * @generated
		 */
		EDataType POSITIVE_INT_OBJECT = eINSTANCE.getPositiveIntObject();

		/**
		 * The meta object literal for the '<em>Probe Protocol Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProbeProtocolObject()
		 * @generated
		 */
		EDataType PROBE_PROTOCOL_OBJECT = eINSTANCE.getProbeProtocolObject();

		/**
		 * The meta object literal for the '<em>Protocol Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.Protocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getProtocolObject()
		 * @generated
		 */
		EDataType PROTOCOL_OBJECT = eINSTANCE.getProtocolObject();

		/**
		 * The meta object literal for the '<em>Schema Version Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.SchemaVersion
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getSchemaVersionObject()
		 * @generated
		 */
		EDataType SCHEMA_VERSION_OBJECT = eINSTANCE.getSchemaVersionObject();

		/**
		 * The meta object literal for the '<em>Store Location Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreLocationObject()
		 * @generated
		 */
		EDataType STORE_LOCATION_OBJECT = eINSTANCE.getStoreLocationObject();

		/**
		 * The meta object literal for the '<em>Store Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getStoreName()
		 * @generated
		 */
		EDataType STORE_NAME = eINSTANCE.getStoreName();

		/**
		 * The meta object literal for the '<em>Task Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TaskType
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTaskTypeObject()
		 * @generated
		 */
		EDataType TASK_TYPE_OBJECT = eINSTANCE.getTaskTypeObject();

		/**
		 * The meta object literal for the '<em>Topology Change Discovery Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTopologyChangeDiscoveryObject()
		 * @generated
		 */
		EDataType TOPOLOGY_CHANGE_DISCOVERY_OBJECT = eINSTANCE.getTopologyChangeDiscoveryObject();

		/**
		 * The meta object literal for the '<em>Transport Protocol Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getTransportProtocolObject()
		 * @generated
		 */
		EDataType TRANSPORT_PROTOCOL_OBJECT = eINSTANCE.getTransportProtocolObject();

		/**
		 * The meta object literal for the '<em>Virtual Directory Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see eu.artist.migration.deployment.azure.csdef.impl.AzureCSDefPackageImpl#getVirtualDirectoryName()
		 * @generated
		 */
		EDataType VIRTUAL_DIRECTORY_NAME = eINSTANCE.getVirtualDirectoryName();

	}

} //AzureCSDefPackage

/**
 */
package deployment_provider;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see deployment_provider.Deployment_providerFactory
 * @model kind="package"
 * @generated
 */
public interface Deployment_providerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment_provider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://deployment-provider/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment-provider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Deployment_providerPackage eINSTANCE = deployment_provider.impl.Deployment_providerPackageImpl.init();

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudProviderImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Offerings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__OFFERINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudServiceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudService()
	 * @generated
	 */
	int CLOUD_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__CONFIGURED_BY = 1;

	/**
	 * The feature id for the '<em><b>Supported Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__SUPPORTED_CLIENTS = 2;

	/**
	 * The number of structural features of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudSoftwareServiceImpl <em>Cloud Software Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudSoftwareServiceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudSoftwareService()
	 * @generated
	 */
	int CLOUD_SOFTWARE_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_SERVICE__NAME = CLOUD_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_SERVICE__CONFIGURED_BY = CLOUD_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Supported Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_SERVICE__SUPPORTED_CLIENTS = CLOUD_SERVICE__SUPPORTED_CLIENTS;

	/**
	 * The number of structural features of the '<em>Cloud Software Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Software Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudDeploymentServiceImpl <em>Cloud Deployment Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudDeploymentServiceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudDeploymentService()
	 * @generated
	 */
	int CLOUD_DEPLOYMENT_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE__NAME = CLOUD_SOFTWARE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE__CONFIGURED_BY = CLOUD_SOFTWARE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Supported Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE__SUPPORTED_CLIENTS = CLOUD_SOFTWARE_SERVICE__SUPPORTED_CLIENTS;

	/**
	 * The feature id for the '<em><b>Uses Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT = CLOUD_SOFTWARE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES = CLOUD_SOFTWARE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cloud Deployment Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE_FEATURE_COUNT = CLOUD_SOFTWARE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cloud Deployment Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_DEPLOYMENT_SERVICE_OPERATION_COUNT = CLOUD_SOFTWARE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.DescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 26;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__OPTIONAL = 2;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.ServiceConfigurationDescriptorImpl <em>Service Configuration Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.ServiceConfigurationDescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getServiceConfigurationDescriptor()
	 * @generated
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR = 25;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR__ENTRIES = DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR__NAME = DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR__OPTIONAL = DESCRIPTOR__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Service Configuration Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Configuration Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_DESCRIPTOR_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.DeploymentDescriptorImpl <em>Deployment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.DeploymentDescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentDescriptor()
	 * @generated
	 */
	int DEPLOYMENT_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__ENTRIES = SERVICE_CONFIGURATION_DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__NAME = SERVICE_CONFIGURATION_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__OPTIONAL = SERVICE_CONFIGURATION_DESCRIPTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Relies On Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE = SERVICE_CONFIGURATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relies On Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE = SERVICE_CONFIGURATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT = SERVICE_CONFIGURATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT = SERVICE_CONFIGURATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.ApplicationDeploymentDescriptorImpl <em>Application Deployment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.ApplicationDeploymentDescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationDeploymentDescriptor()
	 * @generated
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR = 4;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__ENTRIES = DEPLOYMENT_DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__NAME = DEPLOYMENT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__OPTIONAL = DEPLOYMENT_DESCRIPTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Relies On Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE;

	/**
	 * The feature id for the '<em><b>Relies On Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY = DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT = DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT = DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.InfrastructureDeploymentDescriptorImpl <em>Infrastructure Deployment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.InfrastructureDeploymentDescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getInfrastructureDeploymentDescriptor()
	 * @generated
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__ENTRIES = DEPLOYMENT_DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__NAME = DEPLOYMENT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__OPTIONAL = DEPLOYMENT_DESCRIPTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Relies On Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE;

	/**
	 * The feature id for the '<em><b>Relies On Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS = DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT = DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Infrastructure Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT = DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudOfferingImpl <em>Cloud Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudOfferingImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudOffering()
	 * @generated
	 */
	int CLOUD_OFFERING = 6;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OFFERING__OFFERED_SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Offered Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OFFERING__OFFERED_FRAMEWORKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OFFERING__NAME = 2;

	/**
	 * The number of structural features of the '<em>Cloud Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OFFERING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OFFERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudInfrastructureOfferingImpl <em>Cloud Infrastructure Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudInfrastructureOfferingImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureOffering()
	 * @generated
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING = 7;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING__OFFERED_SERVICES = CLOUD_OFFERING__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING__OFFERED_FRAMEWORKS = CLOUD_OFFERING__OFFERED_FRAMEWORKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING__NAME = CLOUD_OFFERING__NAME;

	/**
	 * The feature id for the '<em><b>Comprised Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES = CLOUD_OFFERING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Infrastructure Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING_FEATURE_COUNT = CLOUD_OFFERING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Infrastructure Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OFFERING_OPERATION_COUNT = CLOUD_OFFERING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudPlatformOfferingImpl <em>Cloud Platform Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudPlatformOfferingImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudPlatformOffering()
	 * @generated
	 */
	int CLOUD_PLATFORM_OFFERING = 8;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING__OFFERED_SERVICES = CLOUD_OFFERING__OFFERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Offered Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING__OFFERED_FRAMEWORKS = CLOUD_OFFERING__OFFERED_FRAMEWORKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING__NAME = CLOUD_OFFERING__NAME;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING__SUPPORTED_LANGUAGES = CLOUD_OFFERING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Platform Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING_FEATURE_COUNT = CLOUD_OFFERING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Platform Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_OFFERING_OPERATION_COUNT = CLOUD_OFFERING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.EnvironmentDescriptorImpl <em>Environment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.EnvironmentDescriptorImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getEnvironmentDescriptor()
	 * @generated
	 */
	int ENVIRONMENT_DESCRIPTOR = 9;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DESCRIPTOR__ENTRIES = SERVICE_CONFIGURATION_DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DESCRIPTOR__NAME = SERVICE_CONFIGURATION_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DESCRIPTOR__OPTIONAL = SERVICE_CONFIGURATION_DESCRIPTOR__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Environment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DESCRIPTOR_FEATURE_COUNT = SERVICE_CONFIGURATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DESCRIPTOR_OPERATION_COUNT = SERVICE_CONFIGURATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.AuthenticationTokenImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getAuthenticationToken()
	 * @generated
	 */
	int AUTHENTICATION_TOKEN = 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__USER = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudHardwareServiceImpl <em>Cloud Hardware Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudHardwareServiceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudHardwareService()
	 * @generated
	 */
	int CLOUD_HARDWARE_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_HARDWARE_SERVICE__NAME = CLOUD_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_HARDWARE_SERVICE__CONFIGURED_BY = CLOUD_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Supported Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_HARDWARE_SERVICE__SUPPORTED_CLIENTS = CLOUD_SERVICE__SUPPORTED_CLIENTS;

	/**
	 * The number of structural features of the '<em>Cloud Hardware Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_HARDWARE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Hardware Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_HARDWARE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudInfrastructurePhysicalInstanceImpl <em>Cloud Infrastructure Physical Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudInfrastructurePhysicalInstanceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructurePhysicalInstance()
	 * @generated
	 */
	int CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Run VMs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS = 0;

	/**
	 * The number of structural features of the '<em>Cloud Infrastructure Physical Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Infrastructure Physical Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudInfrastructureVirtualInstanceImpl <em>Cloud Infrastructure Virtual Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudInfrastructureVirtualInstanceImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureVirtualInstance()
	 * @generated
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Cloud Infrastructure Virtual Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Infrastructure Virtual Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.StackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.StackImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 15;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudInfrastructureVirtualClusterImpl <em>Cloud Infrastructure Virtual Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudInfrastructureVirtualClusterImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureVirtualCluster()
	 * @generated
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER = 16;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES = 0;

	/**
	 * The number of structural features of the '<em>Cloud Infrastructure Virtual Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Infrastructure Virtual Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.FrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.FrameworkImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getFramework()
	 * @generated
	 */
	int FRAMEWORK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.ApplicationFrameworkImpl <em>Application Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.ApplicationFrameworkImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationFramework()
	 * @generated
	 */
	int APPLICATION_FRAMEWORK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FRAMEWORK__NAME = FRAMEWORK__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FRAMEWORK__VERSION = FRAMEWORK__VERSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FRAMEWORK__TYPE = FRAMEWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FRAMEWORK_FEATURE_COUNT = FRAMEWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FRAMEWORK_OPERATION_COUNT = FRAMEWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.AuthenticationAccountImpl <em>Authentication Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.AuthenticationAccountImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getAuthenticationAccount()
	 * @generated
	 */
	int AUTHENTICATION_ACCOUNT = 18;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ACCOUNT__USES = 0;

	/**
	 * The number of structural features of the '<em>Authentication Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ACCOUNT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authentication Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.DeploymentRecipeImpl <em>Deployment Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.DeploymentRecipeImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentRecipe()
	 * @generated
	 */
	int DEPLOYMENT_RECIPE = 19;

	/**
	 * The number of structural features of the '<em>Deployment Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_RECIPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deployment Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.DeploymentTemplateImpl <em>Deployment Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.DeploymentTemplateImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentTemplate()
	 * @generated
	 */
	int DEPLOYMENT_TEMPLATE = 20;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE__ENTRIES = DEPLOYMENT_DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE__NAME = DEPLOYMENT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE__OPTIONAL = DEPLOYMENT_DESCRIPTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Relies On Recipe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE__RELIES_ON_RECIPE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE;

	/**
	 * The feature id for the '<em><b>Relies On Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE__RELIES_ON_TEMPLATE = DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Deployment Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE_FEATURE_COUNT = DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployment Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TEMPLATE_OPERATION_COUNT = DEPLOYMENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.DescriptorEntryImpl <em>Descriptor Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.DescriptorEntryImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDescriptorEntry()
	 * @generated
	 */
	int DESCRIPTOR_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY__OPTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY__REF = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY__PARENT = 4;

	/**
	 * The number of structural features of the '<em>Descriptor Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Descriptor Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.CloudServiceClientImpl <em>Cloud Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.CloudServiceClientImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudServiceClient()
	 * @generated
	 */
	int CLOUD_SERVICE_CLIENT = 22;

	/**
	 * The feature id for the '<em><b>Supported Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_CLIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Supported Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES = 2;

	/**
	 * The number of structural features of the '<em>Cloud Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_provider.impl.ApplicationLanguageFrameworkImpl <em>Application Language Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.impl.ApplicationLanguageFrameworkImpl
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationLanguageFramework()
	 * @generated
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK__NAME = FRAMEWORK__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK__VERSION = FRAMEWORK__VERSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK__TYPE = FRAMEWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Language Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK_FEATURE_COUNT = FRAMEWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Language Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LANGUAGE_FRAMEWORK_OPERATION_COUNT = FRAMEWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_provider.ServiceInterface <em>Service Interface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.ServiceInterface
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 27;

	/**
	 * The meta object id for the '{@link deployment_provider.ApplicationTopology <em>Application Topology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.ApplicationTopology
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationTopology()
	 * @generated
	 */
	int APPLICATION_TOPOLOGY = 28;

	/**
	 * The meta object id for the '{@link deployment_provider.VirtualInstanceType <em>Virtual Instance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.VirtualInstanceType
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getVirtualInstanceType()
	 * @generated
	 */
	int VIRTUAL_INSTANCE_TYPE = 29;

	/**
	 * The meta object id for the '{@link deployment_provider.ApplicationFrameworkType <em>Application Framework Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.ApplicationFrameworkType
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationFrameworkType()
	 * @generated
	 */
	int APPLICATION_FRAMEWORK_TYPE = 30;

	/**
	 * The meta object id for the '{@link deployment_provider.LanguageFrameworkType <em>Language Framework Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_provider.LanguageFrameworkType
	 * @see deployment_provider.impl.Deployment_providerPackageImpl#getLanguageFrameworkType()
	 * @generated
	 */
	int LANGUAGE_FRAMEWORK_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Provider</em>'.
	 * @see deployment_provider.CloudProvider
	 * @generated
	 */
	EClass getCloudProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudProvider#getOfferings <em>Offerings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offerings</em>'.
	 * @see deployment_provider.CloudProvider#getOfferings()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_Offerings();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.CloudProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.CloudProvider#getName()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_Name();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Service</em>'.
	 * @see deployment_provider.CloudService
	 * @generated
	 */
	EClass getCloudService();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.CloudService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.CloudService#getName()
	 * @see #getCloudService()
	 * @generated
	 */
	EAttribute getCloudService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudService#getConfiguredBy <em>Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configured By</em>'.
	 * @see deployment_provider.CloudService#getConfiguredBy()
	 * @see #getCloudService()
	 * @generated
	 */
	EReference getCloudService_ConfiguredBy();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudService#getSupportedClients <em>Supported Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Clients</em>'.
	 * @see deployment_provider.CloudService#getSupportedClients()
	 * @see #getCloudService()
	 * @generated
	 */
	EReference getCloudService_SupportedClients();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudDeploymentService <em>Cloud Deployment Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Deployment Service</em>'.
	 * @see deployment_provider.CloudDeploymentService
	 * @generated
	 */
	EClass getCloudDeploymentService();

	/**
	 * Returns the meta object for the containment reference '{@link deployment_provider.CloudDeploymentService#getUsesAccount <em>Uses Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses Account</em>'.
	 * @see deployment_provider.CloudDeploymentService#getUsesAccount()
	 * @see #getCloudDeploymentService()
	 * @generated
	 */
	EReference getCloudDeploymentService_UsesAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudDeploymentService#getRequiredServices <em>Required Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Services</em>'.
	 * @see deployment_provider.CloudDeploymentService#getRequiredServices()
	 * @see #getCloudDeploymentService()
	 * @generated
	 */
	EReference getCloudDeploymentService_RequiredServices();

	/**
	 * Returns the meta object for class '{@link deployment_provider.DeploymentDescriptor <em>Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Descriptor</em>'.
	 * @see deployment_provider.DeploymentDescriptor
	 * @generated
	 */
	EClass getDeploymentDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.DeploymentDescriptor#getReliesOnRecipe <em>Relies On Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relies On Recipe</em>'.
	 * @see deployment_provider.DeploymentDescriptor#getReliesOnRecipe()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EReference getDeploymentDescriptor_ReliesOnRecipe();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.DeploymentDescriptor#getReliesOnTemplate <em>Relies On Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relies On Template</em>'.
	 * @see deployment_provider.DeploymentDescriptor#getReliesOnTemplate()
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	EReference getDeploymentDescriptor_ReliesOnTemplate();

	/**
	 * Returns the meta object for class '{@link deployment_provider.ApplicationDeploymentDescriptor <em>Application Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Deployment Descriptor</em>'.
	 * @see deployment_provider.ApplicationDeploymentDescriptor
	 * @generated
	 */
	EClass getApplicationDeploymentDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.ApplicationDeploymentDescriptor#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology</em>'.
	 * @see deployment_provider.ApplicationDeploymentDescriptor#getTopology()
	 * @see #getApplicationDeploymentDescriptor()
	 * @generated
	 */
	EAttribute getApplicationDeploymentDescriptor_Topology();

	/**
	 * Returns the meta object for class '{@link deployment_provider.InfrastructureDeploymentDescriptor <em>Infrastructure Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Deployment Descriptor</em>'.
	 * @see deployment_provider.InfrastructureDeploymentDescriptor
	 * @generated
	 */
	EClass getInfrastructureDeploymentDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.InfrastructureDeploymentDescriptor#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see deployment_provider.InfrastructureDeploymentDescriptor#getClusters()
	 * @see #getInfrastructureDeploymentDescriptor()
	 * @generated
	 */
	EReference getInfrastructureDeploymentDescriptor_Clusters();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudOffering <em>Cloud Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Offering</em>'.
	 * @see deployment_provider.CloudOffering
	 * @generated
	 */
	EClass getCloudOffering();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudOffering#getOfferedServices <em>Offered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Services</em>'.
	 * @see deployment_provider.CloudOffering#getOfferedServices()
	 * @see #getCloudOffering()
	 * @generated
	 */
	EReference getCloudOffering_OfferedServices();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudOffering#getOfferedFrameworks <em>Offered Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Frameworks</em>'.
	 * @see deployment_provider.CloudOffering#getOfferedFrameworks()
	 * @see #getCloudOffering()
	 * @generated
	 */
	EReference getCloudOffering_OfferedFrameworks();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.CloudOffering#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.CloudOffering#getName()
	 * @see #getCloudOffering()
	 * @generated
	 */
	EAttribute getCloudOffering_Name();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudInfrastructureOffering <em>Cloud Infrastructure Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Infrastructure Offering</em>'.
	 * @see deployment_provider.CloudInfrastructureOffering
	 * @generated
	 */
	EClass getCloudInfrastructureOffering();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudInfrastructureOffering#getComprisedInstances <em>Comprised Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comprised Instances</em>'.
	 * @see deployment_provider.CloudInfrastructureOffering#getComprisedInstances()
	 * @see #getCloudInfrastructureOffering()
	 * @generated
	 */
	EReference getCloudInfrastructureOffering_ComprisedInstances();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudPlatformOffering <em>Cloud Platform Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Platform Offering</em>'.
	 * @see deployment_provider.CloudPlatformOffering
	 * @generated
	 */
	EClass getCloudPlatformOffering();

	/**
	 * Returns the meta object for the attribute list '{@link deployment_provider.CloudPlatformOffering#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Languages</em>'.
	 * @see deployment_provider.CloudPlatformOffering#getSupportedLanguages()
	 * @see #getCloudPlatformOffering()
	 * @generated
	 */
	EAttribute getCloudPlatformOffering_SupportedLanguages();

	/**
	 * Returns the meta object for class '{@link deployment_provider.EnvironmentDescriptor <em>Environment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Descriptor</em>'.
	 * @see deployment_provider.EnvironmentDescriptor
	 * @generated
	 */
	EClass getEnvironmentDescriptor();

	/**
	 * Returns the meta object for class '{@link deployment_provider.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Token</em>'.
	 * @see deployment_provider.AuthenticationToken
	 * @generated
	 */
	EClass getAuthenticationToken();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.AuthenticationToken#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see deployment_provider.AuthenticationToken#getUser()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_User();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.AuthenticationToken#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see deployment_provider.AuthenticationToken#getPassword()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_Password();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudHardwareService <em>Cloud Hardware Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Hardware Service</em>'.
	 * @see deployment_provider.CloudHardwareService
	 * @generated
	 */
	EClass getCloudHardwareService();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudSoftwareService <em>Cloud Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Software Service</em>'.
	 * @see deployment_provider.CloudSoftwareService
	 * @generated
	 */
	EClass getCloudSoftwareService();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudInfrastructurePhysicalInstance <em>Cloud Infrastructure Physical Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Infrastructure Physical Instance</em>'.
	 * @see deployment_provider.CloudInfrastructurePhysicalInstance
	 * @generated
	 */
	EClass getCloudInfrastructurePhysicalInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudInfrastructurePhysicalInstance#getRunVMs <em>Run VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run VMs</em>'.
	 * @see deployment_provider.CloudInfrastructurePhysicalInstance#getRunVMs()
	 * @see #getCloudInfrastructurePhysicalInstance()
	 * @generated
	 */
	EReference getCloudInfrastructurePhysicalInstance_RunVMs();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudInfrastructureVirtualInstance <em>Cloud Infrastructure Virtual Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Infrastructure Virtual Instance</em>'.
	 * @see deployment_provider.CloudInfrastructureVirtualInstance
	 * @generated
	 */
	EClass getCloudInfrastructureVirtualInstance();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.CloudInfrastructureVirtualInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see deployment_provider.CloudInfrastructureVirtualInstance#getType()
	 * @see #getCloudInfrastructureVirtualInstance()
	 * @generated
	 */
	EAttribute getCloudInfrastructureVirtualInstance_Type();

	/**
	 * Returns the meta object for class '{@link deployment_provider.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see deployment_provider.Stack
	 * @generated
	 */
	EClass getStack();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.Stack#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see deployment_provider.Stack#getLayers()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_Layers();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudInfrastructureVirtualCluster <em>Cloud Infrastructure Virtual Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Infrastructure Virtual Cluster</em>'.
	 * @see deployment_provider.CloudInfrastructureVirtualCluster
	 * @generated
	 */
	EClass getCloudInfrastructureVirtualCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.CloudInfrastructureVirtualCluster#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manages</em>'.
	 * @see deployment_provider.CloudInfrastructureVirtualCluster#getManages()
	 * @see #getCloudInfrastructureVirtualCluster()
	 * @generated
	 */
	EReference getCloudInfrastructureVirtualCluster_Manages();

	/**
	 * Returns the meta object for class '{@link deployment_provider.ApplicationFramework <em>Application Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Framework</em>'.
	 * @see deployment_provider.ApplicationFramework
	 * @generated
	 */
	EClass getApplicationFramework();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.ApplicationFramework#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see deployment_provider.ApplicationFramework#getType()
	 * @see #getApplicationFramework()
	 * @generated
	 */
	EAttribute getApplicationFramework_Type();

	/**
	 * Returns the meta object for class '{@link deployment_provider.AuthenticationAccount <em>Authentication Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Account</em>'.
	 * @see deployment_provider.AuthenticationAccount
	 * @generated
	 */
	EClass getAuthenticationAccount();

	/**
	 * Returns the meta object for the containment reference '{@link deployment_provider.AuthenticationAccount#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses</em>'.
	 * @see deployment_provider.AuthenticationAccount#getUses()
	 * @see #getAuthenticationAccount()
	 * @generated
	 */
	EReference getAuthenticationAccount_Uses();

	/**
	 * Returns the meta object for class '{@link deployment_provider.DeploymentRecipe <em>Deployment Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Recipe</em>'.
	 * @see deployment_provider.DeploymentRecipe
	 * @generated
	 */
	EClass getDeploymentRecipe();

	/**
	 * Returns the meta object for class '{@link deployment_provider.DeploymentTemplate <em>Deployment Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Template</em>'.
	 * @see deployment_provider.DeploymentTemplate
	 * @generated
	 */
	EClass getDeploymentTemplate();

	/**
	 * Returns the meta object for class '{@link deployment_provider.DescriptorEntry <em>Descriptor Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Entry</em>'.
	 * @see deployment_provider.DescriptorEntry
	 * @generated
	 */
	EClass getDescriptorEntry();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.DescriptorEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see deployment_provider.DescriptorEntry#getKey()
	 * @see #getDescriptorEntry()
	 * @generated
	 */
	EAttribute getDescriptorEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.DescriptorEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see deployment_provider.DescriptorEntry#getValue()
	 * @see #getDescriptorEntry()
	 * @generated
	 */
	EAttribute getDescriptorEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.DescriptorEntry#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see deployment_provider.DescriptorEntry#isOptional()
	 * @see #getDescriptorEntry()
	 * @generated
	 */
	EAttribute getDescriptorEntry_Optional();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.DescriptorEntry#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see deployment_provider.DescriptorEntry#getRef()
	 * @see #getDescriptorEntry()
	 * @generated
	 */
	EAttribute getDescriptorEntry_Ref();

	/**
	 * Returns the meta object for the reference '{@link deployment_provider.DescriptorEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see deployment_provider.DescriptorEntry#getParent()
	 * @see #getDescriptorEntry()
	 * @generated
	 */
	EReference getDescriptorEntry_Parent();

	/**
	 * Returns the meta object for class '{@link deployment_provider.CloudServiceClient <em>Cloud Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Service Client</em>'.
	 * @see deployment_provider.CloudServiceClient
	 * @generated
	 */
	EClass getCloudServiceClient();

	/**
	 * Returns the meta object for the attribute list '{@link deployment_provider.CloudServiceClient#getSupportedInterfaces <em>Supported Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Interfaces</em>'.
	 * @see deployment_provider.CloudServiceClient#getSupportedInterfaces()
	 * @see #getCloudServiceClient()
	 * @generated
	 */
	EAttribute getCloudServiceClient_SupportedInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.CloudServiceClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.CloudServiceClient#getName()
	 * @see #getCloudServiceClient()
	 * @generated
	 */
	EAttribute getCloudServiceClient_Name();

	/**
	 * Returns the meta object for the attribute list '{@link deployment_provider.CloudServiceClient#getSupportedLanguages <em>Supported Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Languages</em>'.
	 * @see deployment_provider.CloudServiceClient#getSupportedLanguages()
	 * @see #getCloudServiceClient()
	 * @generated
	 */
	EAttribute getCloudServiceClient_SupportedLanguages();

	/**
	 * Returns the meta object for class '{@link deployment_provider.ApplicationLanguageFramework <em>Application Language Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Language Framework</em>'.
	 * @see deployment_provider.ApplicationLanguageFramework
	 * @generated
	 */
	EClass getApplicationLanguageFramework();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.ApplicationLanguageFramework#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see deployment_provider.ApplicationLanguageFramework#getType()
	 * @see #getApplicationLanguageFramework()
	 * @generated
	 */
	EAttribute getApplicationLanguageFramework_Type();

	/**
	 * Returns the meta object for class '{@link deployment_provider.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see deployment_provider.Framework
	 * @generated
	 */
	EClass getFramework();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.Framework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.Framework#getName()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_Name();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.Framework#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see deployment_provider.Framework#getVersion()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_Version();

	/**
	 * Returns the meta object for class '{@link deployment_provider.ServiceConfigurationDescriptor <em>Service Configuration Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Configuration Descriptor</em>'.
	 * @see deployment_provider.ServiceConfigurationDescriptor
	 * @generated
	 */
	EClass getServiceConfigurationDescriptor();

	/**
	 * Returns the meta object for class '{@link deployment_provider.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see deployment_provider.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_provider.Descriptor#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see deployment_provider.Descriptor#getEntries()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Entries();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.Descriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_provider.Descriptor#getName()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link deployment_provider.Descriptor#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see deployment_provider.Descriptor#isOptional()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Optional();

	/**
	 * Returns the meta object for enum '{@link deployment_provider.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Interface</em>'.
	 * @see deployment_provider.ServiceInterface
	 * @generated
	 */
	EEnum getServiceInterface();

	/**
	 * Returns the meta object for enum '{@link deployment_provider.ApplicationTopology <em>Application Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Topology</em>'.
	 * @see deployment_provider.ApplicationTopology
	 * @generated
	 */
	EEnum getApplicationTopology();

	/**
	 * Returns the meta object for enum '{@link deployment_provider.VirtualInstanceType <em>Virtual Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtual Instance Type</em>'.
	 * @see deployment_provider.VirtualInstanceType
	 * @generated
	 */
	EEnum getVirtualInstanceType();

	/**
	 * Returns the meta object for enum '{@link deployment_provider.ApplicationFrameworkType <em>Application Framework Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Framework Type</em>'.
	 * @see deployment_provider.ApplicationFrameworkType
	 * @generated
	 */
	EEnum getApplicationFrameworkType();

	/**
	 * Returns the meta object for enum '{@link deployment_provider.LanguageFrameworkType <em>Language Framework Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Framework Type</em>'.
	 * @see deployment_provider.LanguageFrameworkType
	 * @generated
	 */
	EEnum getLanguageFrameworkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Deployment_providerFactory getDeployment_providerFactory();

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
		 * The meta object literal for the '{@link deployment_provider.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudProviderImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudProvider()
		 * @generated
		 */
		EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '<em><b>Offerings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__OFFERINGS = eINSTANCE.getCloudProvider_Offerings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__NAME = eINSTANCE.getCloudProvider_Name();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudServiceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudService()
		 * @generated
		 */
		EClass CLOUD_SERVICE = eINSTANCE.getCloudService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE__NAME = eINSTANCE.getCloudService_Name();

		/**
		 * The meta object literal for the '<em><b>Configured By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SERVICE__CONFIGURED_BY = eINSTANCE.getCloudService_ConfiguredBy();

		/**
		 * The meta object literal for the '<em><b>Supported Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SERVICE__SUPPORTED_CLIENTS = eINSTANCE.getCloudService_SupportedClients();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudDeploymentServiceImpl <em>Cloud Deployment Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudDeploymentServiceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudDeploymentService()
		 * @generated
		 */
		EClass CLOUD_DEPLOYMENT_SERVICE = eINSTANCE.getCloudDeploymentService();

		/**
		 * The meta object literal for the '<em><b>Uses Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT = eINSTANCE.getCloudDeploymentService_UsesAccount();

		/**
		 * The meta object literal for the '<em><b>Required Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES = eINSTANCE.getCloudDeploymentService_RequiredServices();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.DeploymentDescriptorImpl <em>Deployment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.DeploymentDescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentDescriptor()
		 * @generated
		 */
		EClass DEPLOYMENT_DESCRIPTOR = eINSTANCE.getDeploymentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Relies On Recipe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE = eINSTANCE.getDeploymentDescriptor_ReliesOnRecipe();

		/**
		 * The meta object literal for the '<em><b>Relies On Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE = eINSTANCE.getDeploymentDescriptor_ReliesOnTemplate();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.ApplicationDeploymentDescriptorImpl <em>Application Deployment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.ApplicationDeploymentDescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationDeploymentDescriptor()
		 * @generated
		 */
		EClass APPLICATION_DEPLOYMENT_DESCRIPTOR = eINSTANCE.getApplicationDeploymentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY = eINSTANCE.getApplicationDeploymentDescriptor_Topology();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.InfrastructureDeploymentDescriptorImpl <em>Infrastructure Deployment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.InfrastructureDeploymentDescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getInfrastructureDeploymentDescriptor()
		 * @generated
		 */
		EClass INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR = eINSTANCE.getInfrastructureDeploymentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS = eINSTANCE.getInfrastructureDeploymentDescriptor_Clusters();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudOfferingImpl <em>Cloud Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudOfferingImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudOffering()
		 * @generated
		 */
		EClass CLOUD_OFFERING = eINSTANCE.getCloudOffering();

		/**
		 * The meta object literal for the '<em><b>Offered Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_OFFERING__OFFERED_SERVICES = eINSTANCE.getCloudOffering_OfferedServices();

		/**
		 * The meta object literal for the '<em><b>Offered Frameworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_OFFERING__OFFERED_FRAMEWORKS = eINSTANCE.getCloudOffering_OfferedFrameworks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_OFFERING__NAME = eINSTANCE.getCloudOffering_Name();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudInfrastructureOfferingImpl <em>Cloud Infrastructure Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudInfrastructureOfferingImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureOffering()
		 * @generated
		 */
		EClass CLOUD_INFRASTRUCTURE_OFFERING = eINSTANCE.getCloudInfrastructureOffering();

		/**
		 * The meta object literal for the '<em><b>Comprised Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES = eINSTANCE.getCloudInfrastructureOffering_ComprisedInstances();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudPlatformOfferingImpl <em>Cloud Platform Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudPlatformOfferingImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudPlatformOffering()
		 * @generated
		 */
		EClass CLOUD_PLATFORM_OFFERING = eINSTANCE.getCloudPlatformOffering();

		/**
		 * The meta object literal for the '<em><b>Supported Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PLATFORM_OFFERING__SUPPORTED_LANGUAGES = eINSTANCE.getCloudPlatformOffering_SupportedLanguages();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.EnvironmentDescriptorImpl <em>Environment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.EnvironmentDescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getEnvironmentDescriptor()
		 * @generated
		 */
		EClass ENVIRONMENT_DESCRIPTOR = eINSTANCE.getEnvironmentDescriptor();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.AuthenticationTokenImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getAuthenticationToken()
		 * @generated
		 */
		EClass AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationToken();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_TOKEN__USER = eINSTANCE.getAuthenticationToken_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_TOKEN__PASSWORD = eINSTANCE.getAuthenticationToken_Password();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudHardwareServiceImpl <em>Cloud Hardware Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudHardwareServiceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudHardwareService()
		 * @generated
		 */
		EClass CLOUD_HARDWARE_SERVICE = eINSTANCE.getCloudHardwareService();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudSoftwareServiceImpl <em>Cloud Software Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudSoftwareServiceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudSoftwareService()
		 * @generated
		 */
		EClass CLOUD_SOFTWARE_SERVICE = eINSTANCE.getCloudSoftwareService();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudInfrastructurePhysicalInstanceImpl <em>Cloud Infrastructure Physical Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudInfrastructurePhysicalInstanceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructurePhysicalInstance()
		 * @generated
		 */
		EClass CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE = eINSTANCE.getCloudInfrastructurePhysicalInstance();

		/**
		 * The meta object literal for the '<em><b>Run VMs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS = eINSTANCE.getCloudInfrastructurePhysicalInstance_RunVMs();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudInfrastructureVirtualInstanceImpl <em>Cloud Infrastructure Virtual Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudInfrastructureVirtualInstanceImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureVirtualInstance()
		 * @generated
		 */
		EClass CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE = eINSTANCE.getCloudInfrastructureVirtualInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE__TYPE = eINSTANCE.getCloudInfrastructureVirtualInstance_Type();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.StackImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__LAYERS = eINSTANCE.getStack_Layers();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudInfrastructureVirtualClusterImpl <em>Cloud Infrastructure Virtual Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudInfrastructureVirtualClusterImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudInfrastructureVirtualCluster()
		 * @generated
		 */
		EClass CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER = eINSTANCE.getCloudInfrastructureVirtualCluster();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES = eINSTANCE.getCloudInfrastructureVirtualCluster_Manages();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.ApplicationFrameworkImpl <em>Application Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.ApplicationFrameworkImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationFramework()
		 * @generated
		 */
		EClass APPLICATION_FRAMEWORK = eINSTANCE.getApplicationFramework();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_FRAMEWORK__TYPE = eINSTANCE.getApplicationFramework_Type();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.AuthenticationAccountImpl <em>Authentication Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.AuthenticationAccountImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getAuthenticationAccount()
		 * @generated
		 */
		EClass AUTHENTICATION_ACCOUNT = eINSTANCE.getAuthenticationAccount();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_ACCOUNT__USES = eINSTANCE.getAuthenticationAccount_Uses();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.DeploymentRecipeImpl <em>Deployment Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.DeploymentRecipeImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentRecipe()
		 * @generated
		 */
		EClass DEPLOYMENT_RECIPE = eINSTANCE.getDeploymentRecipe();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.DeploymentTemplateImpl <em>Deployment Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.DeploymentTemplateImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDeploymentTemplate()
		 * @generated
		 */
		EClass DEPLOYMENT_TEMPLATE = eINSTANCE.getDeploymentTemplate();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.DescriptorEntryImpl <em>Descriptor Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.DescriptorEntryImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDescriptorEntry()
		 * @generated
		 */
		EClass DESCRIPTOR_ENTRY = eINSTANCE.getDescriptorEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_ENTRY__KEY = eINSTANCE.getDescriptorEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_ENTRY__VALUE = eINSTANCE.getDescriptorEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_ENTRY__OPTIONAL = eINSTANCE.getDescriptorEntry_Optional();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_ENTRY__REF = eINSTANCE.getDescriptorEntry_Ref();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_ENTRY__PARENT = eINSTANCE.getDescriptorEntry_Parent();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.CloudServiceClientImpl <em>Cloud Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.CloudServiceClientImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getCloudServiceClient()
		 * @generated
		 */
		EClass CLOUD_SERVICE_CLIENT = eINSTANCE.getCloudServiceClient();

		/**
		 * The meta object literal for the '<em><b>Supported Interfaces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES = eINSTANCE.getCloudServiceClient_SupportedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE_CLIENT__NAME = eINSTANCE.getCloudServiceClient_Name();

		/**
		 * The meta object literal for the '<em><b>Supported Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES = eINSTANCE.getCloudServiceClient_SupportedLanguages();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.ApplicationLanguageFrameworkImpl <em>Application Language Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.ApplicationLanguageFrameworkImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationLanguageFramework()
		 * @generated
		 */
		EClass APPLICATION_LANGUAGE_FRAMEWORK = eINSTANCE.getApplicationLanguageFramework();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LANGUAGE_FRAMEWORK__TYPE = eINSTANCE.getApplicationLanguageFramework_Type();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.FrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.FrameworkImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getFramework()
		 * @generated
		 */
		EClass FRAMEWORK = eINSTANCE.getFramework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__NAME = eINSTANCE.getFramework_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__VERSION = eINSTANCE.getFramework_Version();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.ServiceConfigurationDescriptorImpl <em>Service Configuration Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.ServiceConfigurationDescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getServiceConfigurationDescriptor()
		 * @generated
		 */
		EClass SERVICE_CONFIGURATION_DESCRIPTOR = eINSTANCE.getServiceConfigurationDescriptor();

		/**
		 * The meta object literal for the '{@link deployment_provider.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.impl.DescriptorImpl
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__ENTRIES = eINSTANCE.getDescriptor_Entries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__NAME = eINSTANCE.getDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__OPTIONAL = eINSTANCE.getDescriptor_Optional();

		/**
		 * The meta object literal for the '{@link deployment_provider.ServiceInterface <em>Service Interface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.ServiceInterface
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getServiceInterface()
		 * @generated
		 */
		EEnum SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '{@link deployment_provider.ApplicationTopology <em>Application Topology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.ApplicationTopology
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationTopology()
		 * @generated
		 */
		EEnum APPLICATION_TOPOLOGY = eINSTANCE.getApplicationTopology();

		/**
		 * The meta object literal for the '{@link deployment_provider.VirtualInstanceType <em>Virtual Instance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.VirtualInstanceType
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getVirtualInstanceType()
		 * @generated
		 */
		EEnum VIRTUAL_INSTANCE_TYPE = eINSTANCE.getVirtualInstanceType();

		/**
		 * The meta object literal for the '{@link deployment_provider.ApplicationFrameworkType <em>Application Framework Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.ApplicationFrameworkType
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getApplicationFrameworkType()
		 * @generated
		 */
		EEnum APPLICATION_FRAMEWORK_TYPE = eINSTANCE.getApplicationFrameworkType();

		/**
		 * The meta object literal for the '{@link deployment_provider.LanguageFrameworkType <em>Language Framework Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_provider.LanguageFrameworkType
		 * @see deployment_provider.impl.Deployment_providerPackageImpl#getLanguageFrameworkType()
		 * @generated
		 */
		EEnum LANGUAGE_FRAMEWORK_TYPE = eINSTANCE.getLanguageFrameworkType();

	}

} //Deployment_providerPackage

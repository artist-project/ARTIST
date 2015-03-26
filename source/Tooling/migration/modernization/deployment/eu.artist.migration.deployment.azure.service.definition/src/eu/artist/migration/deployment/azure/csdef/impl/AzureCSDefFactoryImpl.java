/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement;
import eu.artist.migration.deployment.azure.csdef.AllowAllTraffic;
import eu.artist.migration.deployment.azure.csdef.AnyPort;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefFactory;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Binding;
import eu.artist.migration.deployment.azure.csdef.Bindings;
import eu.artist.migration.deployment.azure.csdef.BuiltinStoreName;
import eu.artist.migration.deployment.azure.csdef.Certificate;
import eu.artist.migration.deployment.azure.csdef.Certificates;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSetting;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSettings;
import eu.artist.migration.deployment.azure.csdef.ContentElement;
import eu.artist.migration.deployment.azure.csdef.ContentsElement;
import eu.artist.migration.deployment.azure.csdef.Destinations;
import eu.artist.migration.deployment.azure.csdef.DistributionType;
import eu.artist.migration.deployment.azure.csdef.DocumentRoot;
import eu.artist.migration.deployment.azure.csdef.Endpoints;
import eu.artist.migration.deployment.azure.csdef.EntryPointElement;
import eu.artist.migration.deployment.azure.csdef.Environment;
import eu.artist.migration.deployment.azure.csdef.ExecutionContext;
import eu.artist.migration.deployment.azure.csdef.FromRole;
import eu.artist.migration.deployment.azure.csdef.Import;
import eu.artist.migration.deployment.azure.csdef.Imports;
import eu.artist.migration.deployment.azure.csdef.InputEndpoint;
import eu.artist.migration.deployment.azure.csdef.InputEndpointType;
import eu.artist.migration.deployment.azure.csdef.InputEndpointsType;
import eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement;
import eu.artist.migration.deployment.azure.csdef.InternalEndpoint;
import eu.artist.migration.deployment.azure.csdef.InternalEndpointType;
import eu.artist.migration.deployment.azure.csdef.InternalProtocol;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes;
import eu.artist.migration.deployment.azure.csdef.LocalResources;
import eu.artist.migration.deployment.azure.csdef.LocalStore;
import eu.artist.migration.deployment.azure.csdef.MatchMode;
import eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules;
import eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo;
import eu.artist.migration.deployment.azure.csdef.PermissionLevel;
import eu.artist.migration.deployment.azure.csdef.Port;
import eu.artist.migration.deployment.azure.csdef.PortRange;
import eu.artist.migration.deployment.azure.csdef.ProbeProtocol;
import eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.Protocol;
import eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement;
import eu.artist.migration.deployment.azure.csdef.RoleEndpoint;
import eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement;
import eu.artist.migration.deployment.azure.csdef.RoleModule;
import eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule;
import eu.artist.migration.deployment.azure.csdef.SchemaVersion;
import eu.artist.migration.deployment.azure.csdef.ServiceDefinition;
import eu.artist.migration.deployment.azure.csdef.Site;
import eu.artist.migration.deployment.azure.csdef.Sites;
import eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement;
import eu.artist.migration.deployment.azure.csdef.Startup;
import eu.artist.migration.deployment.azure.csdef.StoreLocation;
import eu.artist.migration.deployment.azure.csdef.Task;
import eu.artist.migration.deployment.azure.csdef.TaskType;
import eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery;
import eu.artist.migration.deployment.azure.csdef.TransportProtocol;
import eu.artist.migration.deployment.azure.csdef.Variable;
import eu.artist.migration.deployment.azure.csdef.VirtualApplication;
import eu.artist.migration.deployment.azure.csdef.VirtualDirectory;
import eu.artist.migration.deployment.azure.csdef.WebRole;
import eu.artist.migration.deployment.azure.csdef.WebRuntime;
import eu.artist.migration.deployment.azure.csdef.WhenSource;
import eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.WorkerRole;
import eu.artist.migration.deployment.azure.csdef.WorkerRuntime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSDefFactoryImpl extends EFactoryImpl implements AzureCSDefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AzureCSDefFactory init() {
		try {
			AzureCSDefFactory theAzureCSDefFactory = (AzureCSDefFactory)EPackage.Registry.INSTANCE.getEFactory(AzureCSDefPackage.eNS_URI);
			if (theAzureCSDefFactory != null) {
				return theAzureCSDefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AzureCSDefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefFactoryImpl() {
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT: return createAllocatePublicPortFromElement();
			case AzureCSDefPackage.ALLOW_ALL_TRAFFIC: return createAllowAllTraffic();
			case AzureCSDefPackage.BINDING: return createBinding();
			case AzureCSDefPackage.BINDINGS: return createBindings();
			case AzureCSDefPackage.CERTIFICATE: return createCertificate();
			case AzureCSDefPackage.CERTIFICATES: return createCertificates();
			case AzureCSDefPackage.CONFIGURATION_SETTING: return createConfigurationSetting();
			case AzureCSDefPackage.CONFIGURATION_SETTINGS: return createConfigurationSettings();
			case AzureCSDefPackage.CONTENT_ELEMENT: return createContentElement();
			case AzureCSDefPackage.CONTENTS_ELEMENT: return createContentsElement();
			case AzureCSDefPackage.DESTINATIONS: return createDestinations();
			case AzureCSDefPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AzureCSDefPackage.ENDPOINTS: return createEndpoints();
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT: return createEntryPointElement();
			case AzureCSDefPackage.ENVIRONMENT: return createEnvironment();
			case AzureCSDefPackage.FROM_ROLE: return createFromRole();
			case AzureCSDefPackage.IMPORT: return createImport();
			case AzureCSDefPackage.IMPORTS: return createImports();
			case AzureCSDefPackage.INPUT_ENDPOINT: return createInputEndpoint();
			case AzureCSDefPackage.INPUT_ENDPOINTS_TYPE: return createInputEndpointsType();
			case AzureCSDefPackage.INPUT_ENDPOINT_TYPE: return createInputEndpointType();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT: return createInstanceInputEndpointElement();
			case AzureCSDefPackage.INTERNAL_ENDPOINT: return createInternalEndpoint();
			case AzureCSDefPackage.INTERNAL_ENDPOINT_TYPE: return createInternalEndpointType();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE: return createLoadBalancerProbe();
			case AzureCSDefPackage.LOAD_BALANCER_PROBES: return createLoadBalancerProbes();
			case AzureCSDefPackage.LOCAL_RESOURCES: return createLocalResources();
			case AzureCSDefPackage.LOCAL_STORE: return createLocalStore();
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT: return createNetFxAssemblyEntryPointElement();
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES: return createNetworkTrafficRules();
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO: return createOnlyAllowTrafficTo();
			case AzureCSDefPackage.PORT: return createPort();
			case AzureCSDefPackage.PORT_RANGE: return createPortRange();
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT: return createProgramEntryPointElement();
			case AzureCSDefPackage.RDMA_ENDPOINT_ELEMENT: return createRdmaEndpointElement();
			case AzureCSDefPackage.ROLE_ENDPOINT: return createRoleEndpoint();
			case AzureCSDefPackage.ROLE_INSTANCE_VALUE_ELEMENT: return createRoleInstanceValueElement();
			case AzureCSDefPackage.ROLE_MODULE: return createRoleModule();
			case AzureCSDefPackage.RUNTIME: return createRuntime();
			case AzureCSDefPackage.RUNTIME_FOR_ROLE_MODULE: return createRuntimeForRoleModule();
			case AzureCSDefPackage.SERVICE_DEFINITION: return createServiceDefinition();
			case AzureCSDefPackage.SITE: return createSite();
			case AzureCSDefPackage.SITES: return createSites();
			case AzureCSDefPackage.SOURCE_DIRECTORY_ELEMENT: return createSourceDirectoryElement();
			case AzureCSDefPackage.STARTUP: return createStartup();
			case AzureCSDefPackage.TASK: return createTask();
			case AzureCSDefPackage.VARIABLE: return createVariable();
			case AzureCSDefPackage.VIRTUAL_APPLICATION: return createVirtualApplication();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY: return createVirtualDirectory();
			case AzureCSDefPackage.WEB_ROLE: return createWebRole();
			case AzureCSDefPackage.WEB_RUNTIME: return createWebRuntime();
			case AzureCSDefPackage.WHEN_SOURCE: return createWhenSource();
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT: return createWorkerEntryPointElement();
			case AzureCSDefPackage.WORKER_ROLE: return createWorkerRole();
			case AzureCSDefPackage.WORKER_RUNTIME: return createWorkerRuntime();
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
			case AzureCSDefPackage.ANY_PORT:
				return createAnyPortFromString(eDataType, initialValue);
			case AzureCSDefPackage.BUILTIN_STORE_NAME:
				return createBuiltinStoreNameFromString(eDataType, initialValue);
			case AzureCSDefPackage.DISTRIBUTION_TYPE:
				return createDistributionTypeFromString(eDataType, initialValue);
			case AzureCSDefPackage.EXECUTION_CONTEXT:
				return createExecutionContextFromString(eDataType, initialValue);
			case AzureCSDefPackage.INTERNAL_PROTOCOL:
				return createInternalProtocolFromString(eDataType, initialValue);
			case AzureCSDefPackage.MATCH_MODE:
				return createMatchModeFromString(eDataType, initialValue);
			case AzureCSDefPackage.PERMISSION_LEVEL:
				return createPermissionLevelFromString(eDataType, initialValue);
			case AzureCSDefPackage.PROBE_PROTOCOL:
				return createProbeProtocolFromString(eDataType, initialValue);
			case AzureCSDefPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case AzureCSDefPackage.SCHEMA_VERSION:
				return createSchemaVersionFromString(eDataType, initialValue);
			case AzureCSDefPackage.STORE_LOCATION:
				return createStoreLocationFromString(eDataType, initialValue);
			case AzureCSDefPackage.TASK_TYPE:
				return createTaskTypeFromString(eDataType, initialValue);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY:
				return createTopologyChangeDiscoveryFromString(eDataType, initialValue);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL:
				return createTransportProtocolFromString(eDataType, initialValue);
			case AzureCSDefPackage.ANY_PORT_OBJECT:
				return createAnyPortObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.BUILTIN_STORE_NAME_OBJECT:
				return createBuiltinStoreNameObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.DISTRIBUTION_TYPE_OBJECT:
				return createDistributionTypeObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.EXECUTION_CONTEXT_OBJECT:
				return createExecutionContextObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.INTERNAL_PROTOCOL_OBJECT:
				return createInternalProtocolObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.LB_PROBE_INTERVAL:
				return createLBProbeIntervalFromString(eDataType, initialValue);
			case AzureCSDefPackage.LB_PROBE_INTERVAL_OBJECT:
				return createLBProbeIntervalObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT:
				return createLBProbeTimeoutFromString(eDataType, initialValue);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT_OBJECT:
				return createLBProbeTimeoutObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.MATCH_MODE_OBJECT:
				return createMatchModeObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.NAMED_ELEMENT_NAME_STRING:
				return createNamedElementNameStringFromString(eDataType, initialValue);
			case AzureCSDefPackage.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case AzureCSDefPackage.PERMISSION_LEVEL_OBJECT:
				return createPermissionLevelObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.PORT_INTEGER:
				return createPortIntegerFromString(eDataType, initialValue);
			case AzureCSDefPackage.PORT_INTEGER_OBJECT:
				return createPortIntegerObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.PORT_SPECIFIER:
				return createPortSpecifierFromString(eDataType, initialValue);
			case AzureCSDefPackage.POSITIVE_INT:
				return createPositiveIntFromString(eDataType, initialValue);
			case AzureCSDefPackage.POSITIVE_INT_OBJECT:
				return createPositiveIntObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.PROBE_PROTOCOL_OBJECT:
				return createProbeProtocolObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.PROTOCOL_OBJECT:
				return createProtocolObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.SCHEMA_VERSION_OBJECT:
				return createSchemaVersionObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.STORE_LOCATION_OBJECT:
				return createStoreLocationObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.STORE_NAME:
				return createStoreNameFromString(eDataType, initialValue);
			case AzureCSDefPackage.TASK_TYPE_OBJECT:
				return createTaskTypeObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY_OBJECT:
				return createTopologyChangeDiscoveryObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL_OBJECT:
				return createTransportProtocolObjectFromString(eDataType, initialValue);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY_NAME:
				return createVirtualDirectoryNameFromString(eDataType, initialValue);
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
			case AzureCSDefPackage.ANY_PORT:
				return convertAnyPortToString(eDataType, instanceValue);
			case AzureCSDefPackage.BUILTIN_STORE_NAME:
				return convertBuiltinStoreNameToString(eDataType, instanceValue);
			case AzureCSDefPackage.DISTRIBUTION_TYPE:
				return convertDistributionTypeToString(eDataType, instanceValue);
			case AzureCSDefPackage.EXECUTION_CONTEXT:
				return convertExecutionContextToString(eDataType, instanceValue);
			case AzureCSDefPackage.INTERNAL_PROTOCOL:
				return convertInternalProtocolToString(eDataType, instanceValue);
			case AzureCSDefPackage.MATCH_MODE:
				return convertMatchModeToString(eDataType, instanceValue);
			case AzureCSDefPackage.PERMISSION_LEVEL:
				return convertPermissionLevelToString(eDataType, instanceValue);
			case AzureCSDefPackage.PROBE_PROTOCOL:
				return convertProbeProtocolToString(eDataType, instanceValue);
			case AzureCSDefPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case AzureCSDefPackage.SCHEMA_VERSION:
				return convertSchemaVersionToString(eDataType, instanceValue);
			case AzureCSDefPackage.STORE_LOCATION:
				return convertStoreLocationToString(eDataType, instanceValue);
			case AzureCSDefPackage.TASK_TYPE:
				return convertTaskTypeToString(eDataType, instanceValue);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY:
				return convertTopologyChangeDiscoveryToString(eDataType, instanceValue);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL:
				return convertTransportProtocolToString(eDataType, instanceValue);
			case AzureCSDefPackage.ANY_PORT_OBJECT:
				return convertAnyPortObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.BUILTIN_STORE_NAME_OBJECT:
				return convertBuiltinStoreNameObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.DISTRIBUTION_TYPE_OBJECT:
				return convertDistributionTypeObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.EXECUTION_CONTEXT_OBJECT:
				return convertExecutionContextObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.INTERNAL_PROTOCOL_OBJECT:
				return convertInternalProtocolObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.LB_PROBE_INTERVAL:
				return convertLBProbeIntervalToString(eDataType, instanceValue);
			case AzureCSDefPackage.LB_PROBE_INTERVAL_OBJECT:
				return convertLBProbeIntervalObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT:
				return convertLBProbeTimeoutToString(eDataType, instanceValue);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT_OBJECT:
				return convertLBProbeTimeoutObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.MATCH_MODE_OBJECT:
				return convertMatchModeObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.NAMED_ELEMENT_NAME_STRING:
				return convertNamedElementNameStringToString(eDataType, instanceValue);
			case AzureCSDefPackage.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case AzureCSDefPackage.PERMISSION_LEVEL_OBJECT:
				return convertPermissionLevelObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.PORT_INTEGER:
				return convertPortIntegerToString(eDataType, instanceValue);
			case AzureCSDefPackage.PORT_INTEGER_OBJECT:
				return convertPortIntegerObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.PORT_SPECIFIER:
				return convertPortSpecifierToString(eDataType, instanceValue);
			case AzureCSDefPackage.POSITIVE_INT:
				return convertPositiveIntToString(eDataType, instanceValue);
			case AzureCSDefPackage.POSITIVE_INT_OBJECT:
				return convertPositiveIntObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.PROBE_PROTOCOL_OBJECT:
				return convertProbeProtocolObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.PROTOCOL_OBJECT:
				return convertProtocolObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.SCHEMA_VERSION_OBJECT:
				return convertSchemaVersionObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.STORE_LOCATION_OBJECT:
				return convertStoreLocationObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.STORE_NAME:
				return convertStoreNameToString(eDataType, instanceValue);
			case AzureCSDefPackage.TASK_TYPE_OBJECT:
				return convertTaskTypeObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY_OBJECT:
				return convertTopologyChangeDiscoveryObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL_OBJECT:
				return convertTransportProtocolObjectToString(eDataType, instanceValue);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY_NAME:
				return convertVirtualDirectoryNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatePublicPortFromElement createAllocatePublicPortFromElement() {
		AllocatePublicPortFromElementImpl allocatePublicPortFromElement = new AllocatePublicPortFromElementImpl();
		return allocatePublicPortFromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowAllTraffic createAllowAllTraffic() {
		AllowAllTrafficImpl allowAllTraffic = new AllowAllTrafficImpl();
		return allowAllTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bindings createBindings() {
		BindingsImpl bindings = new BindingsImpl();
		return bindings;
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
	public Certificates createCertificates() {
		CertificatesImpl certificates = new CertificatesImpl();
		return certificates;
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
	public ConfigurationSettings createConfigurationSettings() {
		ConfigurationSettingsImpl configurationSettings = new ConfigurationSettingsImpl();
		return configurationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentElement createContentElement() {
		ContentElementImpl contentElement = new ContentElementImpl();
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsElement createContentsElement() {
		ContentsElementImpl contentsElement = new ContentsElementImpl();
		return contentsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destinations createDestinations() {
		DestinationsImpl destinations = new DestinationsImpl();
		return destinations;
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
	public Endpoints createEndpoints() {
		EndpointsImpl endpoints = new EndpointsImpl();
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointElement createEntryPointElement() {
		EntryPointElementImpl entryPointElement = new EntryPointElementImpl();
		return entryPointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromRole createFromRole() {
		FromRoleImpl fromRole = new FromRoleImpl();
		return fromRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEndpoint createInputEndpoint() {
		InputEndpointImpl inputEndpoint = new InputEndpointImpl();
		return inputEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEndpointsType createInputEndpointsType() {
		InputEndpointsTypeImpl inputEndpointsType = new InputEndpointsTypeImpl();
		return inputEndpointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEndpointType createInputEndpointType() {
		InputEndpointTypeImpl inputEndpointType = new InputEndpointTypeImpl();
		return inputEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceInputEndpointElement createInstanceInputEndpointElement() {
		InstanceInputEndpointElementImpl instanceInputEndpointElement = new InstanceInputEndpointElementImpl();
		return instanceInputEndpointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEndpoint createInternalEndpoint() {
		InternalEndpointImpl internalEndpoint = new InternalEndpointImpl();
		return internalEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEndpointType createInternalEndpointType() {
		InternalEndpointTypeImpl internalEndpointType = new InternalEndpointTypeImpl();
		return internalEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerProbe createLoadBalancerProbe() {
		LoadBalancerProbeImpl loadBalancerProbe = new LoadBalancerProbeImpl();
		return loadBalancerProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerProbes createLoadBalancerProbes() {
		LoadBalancerProbesImpl loadBalancerProbes = new LoadBalancerProbesImpl();
		return loadBalancerProbes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResources createLocalResources() {
		LocalResourcesImpl localResources = new LocalResourcesImpl();
		return localResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalStore createLocalStore() {
		LocalStoreImpl localStore = new LocalStoreImpl();
		return localStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetFxAssemblyEntryPointElement createNetFxAssemblyEntryPointElement() {
		NetFxAssemblyEntryPointElementImpl netFxAssemblyEntryPointElement = new NetFxAssemblyEntryPointElementImpl();
		return netFxAssemblyEntryPointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTrafficRules createNetworkTrafficRules() {
		NetworkTrafficRulesImpl networkTrafficRules = new NetworkTrafficRulesImpl();
		return networkTrafficRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlyAllowTrafficTo createOnlyAllowTrafficTo() {
		OnlyAllowTrafficToImpl onlyAllowTrafficTo = new OnlyAllowTrafficToImpl();
		return onlyAllowTrafficTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRange createPortRange() {
		PortRangeImpl portRange = new PortRangeImpl();
		return portRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramEntryPointElement createProgramEntryPointElement() {
		ProgramEntryPointElementImpl programEntryPointElement = new ProgramEntryPointElementImpl();
		return programEntryPointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdmaEndpointElement createRdmaEndpointElement() {
		RdmaEndpointElementImpl rdmaEndpointElement = new RdmaEndpointElementImpl();
		return rdmaEndpointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEndpoint createRoleEndpoint() {
		RoleEndpointImpl roleEndpoint = new RoleEndpointImpl();
		return roleEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstanceValueElement createRoleInstanceValueElement() {
		RoleInstanceValueElementImpl roleInstanceValueElement = new RoleInstanceValueElementImpl();
		return roleInstanceValueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleModule createRoleModule() {
		RoleModuleImpl roleModule = new RoleModuleImpl();
		return roleModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.artist.migration.deployment.azure.csdef.Runtime createRuntime() {
		RuntimeImpl runtime = new RuntimeImpl();
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeForRoleModule createRuntimeForRoleModule() {
		RuntimeForRoleModuleImpl runtimeForRoleModule = new RuntimeForRoleModuleImpl();
		return runtimeForRoleModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition createServiceDefinition() {
		ServiceDefinitionImpl serviceDefinition = new ServiceDefinitionImpl();
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sites createSites() {
		SitesImpl sites = new SitesImpl();
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDirectoryElement createSourceDirectoryElement() {
		SourceDirectoryElementImpl sourceDirectoryElement = new SourceDirectoryElementImpl();
		return sourceDirectoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Startup createStartup() {
		StartupImpl startup = new StartupImpl();
		return startup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualApplication createVirtualApplication() {
		VirtualApplicationImpl virtualApplication = new VirtualApplicationImpl();
		return virtualApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualDirectory createVirtualDirectory() {
		VirtualDirectoryImpl virtualDirectory = new VirtualDirectoryImpl();
		return virtualDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRole createWebRole() {
		WebRoleImpl webRole = new WebRoleImpl();
		return webRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRuntime createWebRuntime() {
		WebRuntimeImpl webRuntime = new WebRuntimeImpl();
		return webRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenSource createWhenSource() {
		WhenSourceImpl whenSource = new WhenSourceImpl();
		return whenSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerEntryPointElement createWorkerEntryPointElement() {
		WorkerEntryPointElementImpl workerEntryPointElement = new WorkerEntryPointElementImpl();
		return workerEntryPointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerRole createWorkerRole() {
		WorkerRoleImpl workerRole = new WorkerRoleImpl();
		return workerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkerRuntime createWorkerRuntime() {
		WorkerRuntimeImpl workerRuntime = new WorkerRuntimeImpl();
		return workerRuntime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyPort createAnyPortFromString(EDataType eDataType, String initialValue) {
		AnyPort result = AnyPort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnyPortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltinStoreName createBuiltinStoreNameFromString(EDataType eDataType, String initialValue) {
		BuiltinStoreName result = BuiltinStoreName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltinStoreNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionTypeFromString(EDataType eDataType, String initialValue) {
		DistributionType result = DistributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext createExecutionContextFromString(EDataType eDataType, String initialValue) {
		ExecutionContext result = ExecutionContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalProtocol createInternalProtocolFromString(EDataType eDataType, String initialValue) {
		InternalProtocol result = InternalProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInternalProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchMode createMatchModeFromString(EDataType eDataType, String initialValue) {
		MatchMode result = MatchMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel createPermissionLevelFromString(EDataType eDataType, String initialValue) {
		PermissionLevel result = PermissionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbeProtocol createProbeProtocolFromString(EDataType eDataType, String initialValue) {
		ProbeProtocol result = ProbeProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbeProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
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
	public StoreLocation createStoreLocationFromString(EDataType eDataType, String initialValue) {
		StoreLocation result = StoreLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoreLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskTypeFromString(EDataType eDataType, String initialValue) {
		TaskType result = TaskType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyChangeDiscovery createTopologyChangeDiscoveryFromString(EDataType eDataType, String initialValue) {
		TopologyChangeDiscovery result = TopologyChangeDiscovery.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopologyChangeDiscoveryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol createTransportProtocolFromString(EDataType eDataType, String initialValue) {
		TransportProtocol result = TransportProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyPort createAnyPortObjectFromString(EDataType eDataType, String initialValue) {
		return createAnyPortFromString(AzureCSDefPackage.Literals.ANY_PORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnyPortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnyPortToString(AzureCSDefPackage.Literals.ANY_PORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltinStoreName createBuiltinStoreNameObjectFromString(EDataType eDataType, String initialValue) {
		return createBuiltinStoreNameFromString(AzureCSDefPackage.Literals.BUILTIN_STORE_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltinStoreNameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBuiltinStoreNameToString(AzureCSDefPackage.Literals.BUILTIN_STORE_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDistributionTypeFromString(AzureCSDefPackage.Literals.DISTRIBUTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDistributionTypeToString(AzureCSDefPackage.Literals.DISTRIBUTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext createExecutionContextObjectFromString(EDataType eDataType, String initialValue) {
		return createExecutionContextFromString(AzureCSDefPackage.Literals.EXECUTION_CONTEXT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionContextObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExecutionContextToString(AzureCSDefPackage.Literals.EXECUTION_CONTEXT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalProtocol createInternalProtocolObjectFromString(EDataType eDataType, String initialValue) {
		return createInternalProtocolFromString(AzureCSDefPackage.Literals.INTERNAL_PROTOCOL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInternalProtocolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInternalProtocolToString(AzureCSDefPackage.Literals.INTERNAL_PROTOCOL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLBProbeIntervalFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLBProbeIntervalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLBProbeIntervalObjectFromString(EDataType eDataType, String initialValue) {
		return createLBProbeIntervalFromString(AzureCSDefPackage.Literals.LB_PROBE_INTERVAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLBProbeIntervalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLBProbeIntervalToString(AzureCSDefPackage.Literals.LB_PROBE_INTERVAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLBProbeTimeoutFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLBProbeTimeoutToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLBProbeTimeoutObjectFromString(EDataType eDataType, String initialValue) {
		return createLBProbeTimeoutFromString(AzureCSDefPackage.Literals.LB_PROBE_TIMEOUT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLBProbeTimeoutObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLBProbeTimeoutToString(AzureCSDefPackage.Literals.LB_PROBE_TIMEOUT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchMode createMatchModeObjectFromString(EDataType eDataType, String initialValue) {
		return createMatchModeFromString(AzureCSDefPackage.Literals.MATCH_MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMatchModeToString(AzureCSDefPackage.Literals.MATCH_MODE, instanceValue);
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
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel createPermissionLevelObjectFromString(EDataType eDataType, String initialValue) {
		return createPermissionLevelFromString(AzureCSDefPackage.Literals.PERMISSION_LEVEL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionLevelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPermissionLevelToString(AzureCSDefPackage.Literals.PERMISSION_LEVEL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPortIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPortIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createPortIntegerFromString(AzureCSDefPackage.Literals.PORT_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortIntegerToString(AzureCSDefPackage.Literals.PORT_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPortSpecifierFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPortIntegerFromString(AzureCSDefPackage.Literals.PORT_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createAnyPortFromString(AzureCSDefPackage.Literals.ANY_PORT, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortSpecifierToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AzureCSDefPackage.Literals.PORT_INTEGER.isInstance(instanceValue)) {
			try {
				String value = convertPortIntegerToString(AzureCSDefPackage.Literals.PORT_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (AzureCSDefPackage.Literals.ANY_PORT.isInstance(instanceValue)) {
			try {
				String value = convertAnyPortToString(AzureCSDefPackage.Literals.ANY_PORT, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
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
		return createPositiveIntFromString(AzureCSDefPackage.Literals.POSITIVE_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositiveIntToString(AzureCSDefPackage.Literals.POSITIVE_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbeProtocol createProbeProtocolObjectFromString(EDataType eDataType, String initialValue) {
		return createProbeProtocolFromString(AzureCSDefPackage.Literals.PROBE_PROTOCOL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbeProtocolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProbeProtocolToString(AzureCSDefPackage.Literals.PROBE_PROTOCOL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolObjectFromString(EDataType eDataType, String initialValue) {
		return createProtocolFromString(AzureCSDefPackage.Literals.PROTOCOL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProtocolToString(AzureCSDefPackage.Literals.PROTOCOL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersionObjectFromString(EDataType eDataType, String initialValue) {
		return createSchemaVersionFromString(AzureCSDefPackage.Literals.SCHEMA_VERSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaVersionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSchemaVersionToString(AzureCSDefPackage.Literals.SCHEMA_VERSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreLocation createStoreLocationObjectFromString(EDataType eDataType, String initialValue) {
		return createStoreLocationFromString(AzureCSDefPackage.Literals.STORE_LOCATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoreLocationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStoreLocationToString(AzureCSDefPackage.Literals.STORE_LOCATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStoreNameFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createBuiltinStoreNameFromString(AzureCSDefPackage.Literals.BUILTIN_STORE_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(AzureCSDefPackage.Literals.NON_EMPTY_STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStoreNameToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (AzureCSDefPackage.Literals.BUILTIN_STORE_NAME.isInstance(instanceValue)) {
			try {
				String value = convertBuiltinStoreNameToString(AzureCSDefPackage.Literals.BUILTIN_STORE_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (AzureCSDefPackage.Literals.NON_EMPTY_STRING.isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(AzureCSDefPackage.Literals.NON_EMPTY_STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskTypeFromString(AzureCSDefPackage.Literals.TASK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskTypeToString(AzureCSDefPackage.Literals.TASK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyChangeDiscovery createTopologyChangeDiscoveryObjectFromString(EDataType eDataType, String initialValue) {
		return createTopologyChangeDiscoveryFromString(AzureCSDefPackage.Literals.TOPOLOGY_CHANGE_DISCOVERY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopologyChangeDiscoveryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTopologyChangeDiscoveryToString(AzureCSDefPackage.Literals.TOPOLOGY_CHANGE_DISCOVERY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol createTransportProtocolObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportProtocolFromString(AzureCSDefPackage.Literals.TRANSPORT_PROTOCOL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportProtocolObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportProtocolToString(AzureCSDefPackage.Literals.TRANSPORT_PROTOCOL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVirtualDirectoryNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualDirectoryNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefPackage getAzureCSDefPackage() {
		return (AzureCSDefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AzureCSDefPackage getPackage() {
		return AzureCSDefPackage.eINSTANCE;
	}

} //AzureCSDefFactoryImpl

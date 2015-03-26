/**
 */
package eu.artist.migration.deployment.azure.csdef.util;

import eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement;
import eu.artist.migration.deployment.azure.csdef.AllowAllTraffic;
import eu.artist.migration.deployment.azure.csdef.AnyPort;
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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
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
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage
 * @generated
 */
public class AzureCSDefValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AzureCSDefValidator INSTANCE = new AzureCSDefValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.artist.migration.deployment.azure.csdef";

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
	public AzureCSDefValidator() {
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
	  return AzureCSDefPackage.eINSTANCE;
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT:
				return validateAllocatePublicPortFromElement((AllocatePublicPortFromElement)value, diagnostics, context);
			case AzureCSDefPackage.ALLOW_ALL_TRAFFIC:
				return validateAllowAllTraffic((AllowAllTraffic)value, diagnostics, context);
			case AzureCSDefPackage.BINDING:
				return validateBinding((Binding)value, diagnostics, context);
			case AzureCSDefPackage.BINDINGS:
				return validateBindings((Bindings)value, diagnostics, context);
			case AzureCSDefPackage.CERTIFICATE:
				return validateCertificate((Certificate)value, diagnostics, context);
			case AzureCSDefPackage.CERTIFICATES:
				return validateCertificates((Certificates)value, diagnostics, context);
			case AzureCSDefPackage.CONFIGURATION_SETTING:
				return validateConfigurationSetting((ConfigurationSetting)value, diagnostics, context);
			case AzureCSDefPackage.CONFIGURATION_SETTINGS:
				return validateConfigurationSettings((ConfigurationSettings)value, diagnostics, context);
			case AzureCSDefPackage.CONTENT_ELEMENT:
				return validateContentElement((ContentElement)value, diagnostics, context);
			case AzureCSDefPackage.CONTENTS_ELEMENT:
				return validateContentsElement((ContentsElement)value, diagnostics, context);
			case AzureCSDefPackage.DESTINATIONS:
				return validateDestinations((Destinations)value, diagnostics, context);
			case AzureCSDefPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AzureCSDefPackage.ENDPOINTS:
				return validateEndpoints((Endpoints)value, diagnostics, context);
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT:
				return validateEntryPointElement((EntryPointElement)value, diagnostics, context);
			case AzureCSDefPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case AzureCSDefPackage.FROM_ROLE:
				return validateFromRole((FromRole)value, diagnostics, context);
			case AzureCSDefPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case AzureCSDefPackage.IMPORTS:
				return validateImports((Imports)value, diagnostics, context);
			case AzureCSDefPackage.INPUT_ENDPOINT:
				return validateInputEndpoint((InputEndpoint)value, diagnostics, context);
			case AzureCSDefPackage.INPUT_ENDPOINTS_TYPE:
				return validateInputEndpointsType((InputEndpointsType)value, diagnostics, context);
			case AzureCSDefPackage.INPUT_ENDPOINT_TYPE:
				return validateInputEndpointType((InputEndpointType)value, diagnostics, context);
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT:
				return validateInstanceInputEndpointElement((InstanceInputEndpointElement)value, diagnostics, context);
			case AzureCSDefPackage.INTERNAL_ENDPOINT:
				return validateInternalEndpoint((InternalEndpoint)value, diagnostics, context);
			case AzureCSDefPackage.INTERNAL_ENDPOINT_TYPE:
				return validateInternalEndpointType((InternalEndpointType)value, diagnostics, context);
			case AzureCSDefPackage.LOAD_BALANCER_PROBE:
				return validateLoadBalancerProbe((LoadBalancerProbe)value, diagnostics, context);
			case AzureCSDefPackage.LOAD_BALANCER_PROBES:
				return validateLoadBalancerProbes((LoadBalancerProbes)value, diagnostics, context);
			case AzureCSDefPackage.LOCAL_RESOURCES:
				return validateLocalResources((LocalResources)value, diagnostics, context);
			case AzureCSDefPackage.LOCAL_STORE:
				return validateLocalStore((LocalStore)value, diagnostics, context);
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT:
				return validateNetFxAssemblyEntryPointElement((NetFxAssemblyEntryPointElement)value, diagnostics, context);
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES:
				return validateNetworkTrafficRules((NetworkTrafficRules)value, diagnostics, context);
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO:
				return validateOnlyAllowTrafficTo((OnlyAllowTrafficTo)value, diagnostics, context);
			case AzureCSDefPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case AzureCSDefPackage.PORT_RANGE:
				return validatePortRange((PortRange)value, diagnostics, context);
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT:
				return validateProgramEntryPointElement((ProgramEntryPointElement)value, diagnostics, context);
			case AzureCSDefPackage.RDMA_ENDPOINT_ELEMENT:
				return validateRdmaEndpointElement((RdmaEndpointElement)value, diagnostics, context);
			case AzureCSDefPackage.ROLE_ENDPOINT:
				return validateRoleEndpoint((RoleEndpoint)value, diagnostics, context);
			case AzureCSDefPackage.ROLE_INSTANCE_VALUE_ELEMENT:
				return validateRoleInstanceValueElement((RoleInstanceValueElement)value, diagnostics, context);
			case AzureCSDefPackage.ROLE_MODULE:
				return validateRoleModule((RoleModule)value, diagnostics, context);
			case AzureCSDefPackage.RUNTIME:
				return validateRuntime((eu.artist.migration.deployment.azure.csdef.Runtime)value, diagnostics, context);
			case AzureCSDefPackage.RUNTIME_FOR_ROLE_MODULE:
				return validateRuntimeForRoleModule((RuntimeForRoleModule)value, diagnostics, context);
			case AzureCSDefPackage.SERVICE_DEFINITION:
				return validateServiceDefinition((ServiceDefinition)value, diagnostics, context);
			case AzureCSDefPackage.SITE:
				return validateSite((Site)value, diagnostics, context);
			case AzureCSDefPackage.SITES:
				return validateSites((Sites)value, diagnostics, context);
			case AzureCSDefPackage.SOURCE_DIRECTORY_ELEMENT:
				return validateSourceDirectoryElement((SourceDirectoryElement)value, diagnostics, context);
			case AzureCSDefPackage.STARTUP:
				return validateStartup((Startup)value, diagnostics, context);
			case AzureCSDefPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case AzureCSDefPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case AzureCSDefPackage.VIRTUAL_APPLICATION:
				return validateVirtualApplication((VirtualApplication)value, diagnostics, context);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY:
				return validateVirtualDirectory((VirtualDirectory)value, diagnostics, context);
			case AzureCSDefPackage.WEB_ROLE:
				return validateWebRole((WebRole)value, diagnostics, context);
			case AzureCSDefPackage.WEB_RUNTIME:
				return validateWebRuntime((WebRuntime)value, diagnostics, context);
			case AzureCSDefPackage.WHEN_SOURCE:
				return validateWhenSource((WhenSource)value, diagnostics, context);
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT:
				return validateWorkerEntryPointElement((WorkerEntryPointElement)value, diagnostics, context);
			case AzureCSDefPackage.WORKER_ROLE:
				return validateWorkerRole((WorkerRole)value, diagnostics, context);
			case AzureCSDefPackage.WORKER_RUNTIME:
				return validateWorkerRuntime((WorkerRuntime)value, diagnostics, context);
			case AzureCSDefPackage.ANY_PORT:
				return validateAnyPort((AnyPort)value, diagnostics, context);
			case AzureCSDefPackage.BUILTIN_STORE_NAME:
				return validateBuiltinStoreName((BuiltinStoreName)value, diagnostics, context);
			case AzureCSDefPackage.DISTRIBUTION_TYPE:
				return validateDistributionType((DistributionType)value, diagnostics, context);
			case AzureCSDefPackage.EXECUTION_CONTEXT:
				return validateExecutionContext((ExecutionContext)value, diagnostics, context);
			case AzureCSDefPackage.INTERNAL_PROTOCOL:
				return validateInternalProtocol((InternalProtocol)value, diagnostics, context);
			case AzureCSDefPackage.MATCH_MODE:
				return validateMatchMode((MatchMode)value, diagnostics, context);
			case AzureCSDefPackage.PERMISSION_LEVEL:
				return validatePermissionLevel((PermissionLevel)value, diagnostics, context);
			case AzureCSDefPackage.PROBE_PROTOCOL:
				return validateProbeProtocol((ProbeProtocol)value, diagnostics, context);
			case AzureCSDefPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case AzureCSDefPackage.SCHEMA_VERSION:
				return validateSchemaVersion((SchemaVersion)value, diagnostics, context);
			case AzureCSDefPackage.STORE_LOCATION:
				return validateStoreLocation((StoreLocation)value, diagnostics, context);
			case AzureCSDefPackage.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY:
				return validateTopologyChangeDiscovery((TopologyChangeDiscovery)value, diagnostics, context);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL:
				return validateTransportProtocol((TransportProtocol)value, diagnostics, context);
			case AzureCSDefPackage.ANY_PORT_OBJECT:
				return validateAnyPortObject((AnyPort)value, diagnostics, context);
			case AzureCSDefPackage.BUILTIN_STORE_NAME_OBJECT:
				return validateBuiltinStoreNameObject((BuiltinStoreName)value, diagnostics, context);
			case AzureCSDefPackage.DISTRIBUTION_TYPE_OBJECT:
				return validateDistributionTypeObject((DistributionType)value, diagnostics, context);
			case AzureCSDefPackage.EXECUTION_CONTEXT_OBJECT:
				return validateExecutionContextObject((ExecutionContext)value, diagnostics, context);
			case AzureCSDefPackage.INTERNAL_PROTOCOL_OBJECT:
				return validateInternalProtocolObject((InternalProtocol)value, diagnostics, context);
			case AzureCSDefPackage.LB_PROBE_INTERVAL:
				return validateLBProbeInterval((Integer)value, diagnostics, context);
			case AzureCSDefPackage.LB_PROBE_INTERVAL_OBJECT:
				return validateLBProbeIntervalObject((Integer)value, diagnostics, context);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT:
				return validateLBProbeTimeout((Integer)value, diagnostics, context);
			case AzureCSDefPackage.LB_PROBE_TIMEOUT_OBJECT:
				return validateLBProbeTimeoutObject((Integer)value, diagnostics, context);
			case AzureCSDefPackage.MATCH_MODE_OBJECT:
				return validateMatchModeObject((MatchMode)value, diagnostics, context);
			case AzureCSDefPackage.NAMED_ELEMENT_NAME_STRING:
				return validateNamedElementNameString((String)value, diagnostics, context);
			case AzureCSDefPackage.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			case AzureCSDefPackage.PERMISSION_LEVEL_OBJECT:
				return validatePermissionLevelObject((PermissionLevel)value, diagnostics, context);
			case AzureCSDefPackage.PORT_INTEGER:
				return validatePortInteger((Integer)value, diagnostics, context);
			case AzureCSDefPackage.PORT_INTEGER_OBJECT:
				return validatePortIntegerObject((Integer)value, diagnostics, context);
			case AzureCSDefPackage.PORT_SPECIFIER:
				return validatePortSpecifier(value, diagnostics, context);
			case AzureCSDefPackage.POSITIVE_INT:
				return validatePositiveInt((Integer)value, diagnostics, context);
			case AzureCSDefPackage.POSITIVE_INT_OBJECT:
				return validatePositiveIntObject((Integer)value, diagnostics, context);
			case AzureCSDefPackage.PROBE_PROTOCOL_OBJECT:
				return validateProbeProtocolObject((ProbeProtocol)value, diagnostics, context);
			case AzureCSDefPackage.PROTOCOL_OBJECT:
				return validateProtocolObject((Protocol)value, diagnostics, context);
			case AzureCSDefPackage.SCHEMA_VERSION_OBJECT:
				return validateSchemaVersionObject((SchemaVersion)value, diagnostics, context);
			case AzureCSDefPackage.STORE_LOCATION_OBJECT:
				return validateStoreLocationObject((StoreLocation)value, diagnostics, context);
			case AzureCSDefPackage.STORE_NAME:
				return validateStoreName(value, diagnostics, context);
			case AzureCSDefPackage.TASK_TYPE_OBJECT:
				return validateTaskTypeObject((TaskType)value, diagnostics, context);
			case AzureCSDefPackage.TOPOLOGY_CHANGE_DISCOVERY_OBJECT:
				return validateTopologyChangeDiscoveryObject((TopologyChangeDiscovery)value, diagnostics, context);
			case AzureCSDefPackage.TRANSPORT_PROTOCOL_OBJECT:
				return validateTransportProtocolObject((TransportProtocol)value, diagnostics, context);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY_NAME:
				return validateVirtualDirectoryName((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocatePublicPortFromElement(AllocatePublicPortFromElement allocatePublicPortFromElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocatePublicPortFromElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowAllTraffic(AllowAllTraffic allowAllTraffic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allowAllTraffic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindings(Bindings bindings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindings, diagnostics, context);
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
	public boolean validateCertificates(Certificates certificates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificates, diagnostics, context);
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
	public boolean validateConfigurationSettings(ConfigurationSettings configurationSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentElement(ContentElement contentElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsElement(ContentsElement contentsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinations(Destinations destinations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(destinations, diagnostics, context);
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
	public boolean validateEndpoints(Endpoints endpoints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointElement(EntryPointElement entryPointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFromRole(FromRole fromRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fromRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImports(Imports imports, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imports, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEndpoint(InputEndpoint inputEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEndpointsType(InputEndpointsType inputEndpointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputEndpointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputEndpointType(InputEndpointType inputEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceInputEndpointElement(InstanceInputEndpointElement instanceInputEndpointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceInputEndpointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalEndpoint(InternalEndpoint internalEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalEndpointType(InternalEndpointType internalEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerProbe(LoadBalancerProbe loadBalancerProbe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBalancerProbe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerProbes(LoadBalancerProbes loadBalancerProbes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBalancerProbes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalResources(LocalResources localResources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localResources, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalStore(LocalStore localStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetFxAssemblyEntryPointElement(NetFxAssemblyEntryPointElement netFxAssemblyEntryPointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(netFxAssemblyEntryPointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkTrafficRules(NetworkTrafficRules networkTrafficRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkTrafficRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyAllowTrafficTo(OnlyAllowTrafficTo onlyAllowTrafficTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onlyAllowTrafficTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortRange(PortRange portRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramEntryPointElement(ProgramEntryPointElement programEntryPointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programEntryPointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRdmaEndpointElement(RdmaEndpointElement rdmaEndpointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdmaEndpointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleEndpoint(RoleEndpoint roleEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleInstanceValueElement(RoleInstanceValueElement roleInstanceValueElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleInstanceValueElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleModule(RoleModule roleModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntime(eu.artist.migration.deployment.azure.csdef.Runtime runtime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeForRoleModule(RuntimeForRoleModule runtimeForRoleModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeForRoleModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDefinition(ServiceDefinition serviceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSite(Site site, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(site, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSites(Sites sites, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sites, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDirectoryElement(SourceDirectoryElement sourceDirectoryElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceDirectoryElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartup(Startup startup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualApplication(VirtualApplication virtualApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualDirectory(VirtualDirectory virtualDirectory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualDirectory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebRole(WebRole webRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebRuntime(WebRuntime webRuntime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webRuntime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhenSource(WhenSource whenSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whenSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkerEntryPointElement(WorkerEntryPointElement workerEntryPointElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workerEntryPointElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkerRole(WorkerRole workerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkerRuntime(WorkerRuntime workerRuntime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workerRuntime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyPort(AnyPort anyPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltinStoreName(BuiltinStoreName builtinStoreName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionType(DistributionType distributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionContext(ExecutionContext executionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalProtocol(InternalProtocol internalProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchMode(MatchMode matchMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionLevel(PermissionLevel permissionLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbeProtocol(ProbeProtocol probeProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateStoreLocation(StoreLocation storeLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopologyChangeDiscovery(TopologyChangeDiscovery topologyChangeDiscovery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportProtocol(TransportProtocol transportProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyPortObject(AnyPort anyPortObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltinStoreNameObject(BuiltinStoreName builtinStoreNameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionTypeObject(DistributionType distributionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionContextObject(ExecutionContext executionContextObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalProtocolObject(InternalProtocol internalProtocolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeInterval(int lbProbeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLBProbeInterval_Min(lbProbeInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLBProbeInterval_Min
	 */
	public static final int LB_PROBE_INTERVAL__MIN__VALUE = 5;

	/**
	 * Validates the Min constraint of '<em>LB Probe Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeInterval_Min(int lbProbeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lbProbeInterval >= LB_PROBE_INTERVAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AzureCSDefPackage.Literals.LB_PROBE_INTERVAL, lbProbeInterval, LB_PROBE_INTERVAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeIntervalObject(Integer lbProbeIntervalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLBProbeInterval_Min(lbProbeIntervalObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeTimeout(int lbProbeTimeout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLBProbeTimeout_Min(lbProbeTimeout, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLBProbeTimeout_Min
	 */
	public static final int LB_PROBE_TIMEOUT__MIN__VALUE = 11;

	/**
	 * Validates the Min constraint of '<em>LB Probe Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeTimeout_Min(int lbProbeTimeout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lbProbeTimeout >= LB_PROBE_TIMEOUT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AzureCSDefPackage.Literals.LB_PROBE_TIMEOUT, lbProbeTimeout, LB_PROBE_TIMEOUT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLBProbeTimeoutObject(Integer lbProbeTimeoutObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLBProbeTimeout_Min(lbProbeTimeoutObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchModeObject(MatchMode matchModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validatePattern(AzureCSDefPackage.Literals.NAMED_ELEMENT_NAME_STRING, namedElementNameString, NAMED_ELEMENT_NAME_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNonEmptyString_MaxLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AzureCSDefPackage.Literals.NON_EMPTY_STRING, nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MaxLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length <= 256;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AzureCSDefPackage.Literals.NON_EMPTY_STRING, nonEmptyString, length, 256, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionLevelObject(PermissionLevel permissionLevelObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInteger(int portInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortInteger_Min(portInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInteger_Max(portInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortInteger_Min
	 */
	public static final int PORT_INTEGER__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Port Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInteger_Min(int portInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portInteger >= PORT_INTEGER__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AzureCSDefPackage.Literals.PORT_INTEGER, portInteger, PORT_INTEGER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortInteger_Max
	 */
	public static final int PORT_INTEGER__MAX__VALUE = 65535;

	/**
	 * Validates the Max constraint of '<em>Port Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInteger_Max(int portInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portInteger <= PORT_INTEGER__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(AzureCSDefPackage.Literals.PORT_INTEGER, portInteger, PORT_INTEGER__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortIntegerObject(Integer portIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortInteger_Min(portIntegerObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortInteger_Max(portIntegerObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortSpecifier(Object portSpecifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortSpecifier_MemberTypes(portSpecifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Port Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortSpecifier_MemberTypes(Object portSpecifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AzureCSDefPackage.Literals.PORT_INTEGER.isInstance(portSpecifier)) {
				if (validatePortInteger((Integer)portSpecifier, tempDiagnostics, context)) return true;
			}
			if (AzureCSDefPackage.Literals.ANY_PORT.isInstance(portSpecifier)) {
				if (validateAnyPort((AnyPort)portSpecifier, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AzureCSDefPackage.Literals.PORT_INTEGER.isInstance(portSpecifier)) {
				if (validatePortInteger((Integer)portSpecifier, null, context)) return true;
			}
			if (AzureCSDefPackage.Literals.ANY_PORT.isInstance(portSpecifier)) {
				if (validateAnyPort((AnyPort)portSpecifier, null, context)) return true;
			}
		}
		return false;
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
			reportMinViolation(AzureCSDefPackage.Literals.POSITIVE_INT, positiveInt, POSITIVE_INT__MIN__VALUE, true, diagnostics, context);
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
	public boolean validateProbeProtocolObject(ProbeProtocol probeProtocolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolObject(Protocol protocolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateStoreLocationObject(StoreLocation storeLocationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreName(Object storeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStoreName_MemberTypes(storeName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Store Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreName_MemberTypes(Object storeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (AzureCSDefPackage.Literals.BUILTIN_STORE_NAME.isInstance(storeName)) {
				if (validateBuiltinStoreName((BuiltinStoreName)storeName, tempDiagnostics, context)) return true;
			}
			if (AzureCSDefPackage.Literals.NON_EMPTY_STRING.isInstance(storeName)) {
				if (validateNonEmptyString((String)storeName, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (AzureCSDefPackage.Literals.BUILTIN_STORE_NAME.isInstance(storeName)) {
				if (validateBuiltinStoreName((BuiltinStoreName)storeName, null, context)) return true;
			}
			if (AzureCSDefPackage.Literals.NON_EMPTY_STRING.isInstance(storeName)) {
				if (validateNonEmptyString((String)storeName, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskTypeObject(TaskType taskTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopologyChangeDiscoveryObject(TopologyChangeDiscovery topologyChangeDiscoveryObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportProtocolObject(TransportProtocol transportProtocolObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualDirectoryName(String virtualDirectoryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVirtualDirectoryName_Pattern(virtualDirectoryName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVirtualDirectoryName_Pattern
	 */
	public static final  PatternMatcher [][] VIRTUAL_DIRECTORY_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^[a-zA-Z_][^\\\\/\\?;:@&=\\+\\$,\\|\"<>\\`\\\'\\^]*(?<![\\.\\s])$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Virtual Directory Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualDirectoryName_Pattern(String virtualDirectoryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AzureCSDefPackage.Literals.VIRTUAL_DIRECTORY_NAME, virtualDirectoryName, VIRTUAL_DIRECTORY_NAME__PATTERN__VALUES, diagnostics, context);
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

} //AzureCSDefValidator

/**
 */
package eu.artist.migration.deployment.azure.csdef.util;

import eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement;
import eu.artist.migration.deployment.azure.csdef.AllowAllTraffic;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Binding;
import eu.artist.migration.deployment.azure.csdef.Bindings;
import eu.artist.migration.deployment.azure.csdef.Certificate;
import eu.artist.migration.deployment.azure.csdef.Certificates;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSetting;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSettings;
import eu.artist.migration.deployment.azure.csdef.ContentElement;
import eu.artist.migration.deployment.azure.csdef.ContentsElement;
import eu.artist.migration.deployment.azure.csdef.Destinations;
import eu.artist.migration.deployment.azure.csdef.DocumentRoot;
import eu.artist.migration.deployment.azure.csdef.Endpoints;
import eu.artist.migration.deployment.azure.csdef.EntryPointElement;
import eu.artist.migration.deployment.azure.csdef.Environment;
import eu.artist.migration.deployment.azure.csdef.FromRole;
import eu.artist.migration.deployment.azure.csdef.Import;
import eu.artist.migration.deployment.azure.csdef.Imports;
import eu.artist.migration.deployment.azure.csdef.InputEndpoint;
import eu.artist.migration.deployment.azure.csdef.InputEndpointType;
import eu.artist.migration.deployment.azure.csdef.InputEndpointsType;
import eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement;
import eu.artist.migration.deployment.azure.csdef.InternalEndpoint;
import eu.artist.migration.deployment.azure.csdef.InternalEndpointType;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes;
import eu.artist.migration.deployment.azure.csdef.LocalResources;
import eu.artist.migration.deployment.azure.csdef.LocalStore;
import eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules;
import eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo;
import eu.artist.migration.deployment.azure.csdef.Port;
import eu.artist.migration.deployment.azure.csdef.PortRange;
import eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement;
import eu.artist.migration.deployment.azure.csdef.RoleEndpoint;
import eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement;
import eu.artist.migration.deployment.azure.csdef.RoleModule;
import eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule;
import eu.artist.migration.deployment.azure.csdef.ServiceDefinition;
import eu.artist.migration.deployment.azure.csdef.Site;
import eu.artist.migration.deployment.azure.csdef.Sites;
import eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement;
import eu.artist.migration.deployment.azure.csdef.Startup;
import eu.artist.migration.deployment.azure.csdef.Task;
import eu.artist.migration.deployment.azure.csdef.Variable;
import eu.artist.migration.deployment.azure.csdef.VirtualApplication;
import eu.artist.migration.deployment.azure.csdef.VirtualDirectory;
import eu.artist.migration.deployment.azure.csdef.WebRole;
import eu.artist.migration.deployment.azure.csdef.WebRuntime;
import eu.artist.migration.deployment.azure.csdef.WhenSource;
import eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.WorkerRole;
import eu.artist.migration.deployment.azure.csdef.WorkerRuntime;

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
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage
 * @generated
 */
public class AzureCSDefSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AzureCSDefPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefSwitch() {
		if (modelPackage == null) {
			modelPackage = AzureCSDefPackage.eINSTANCE;
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT: {
				AllocatePublicPortFromElement allocatePublicPortFromElement = (AllocatePublicPortFromElement)theEObject;
				T result = caseAllocatePublicPortFromElement(allocatePublicPortFromElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ALLOW_ALL_TRAFFIC: {
				AllowAllTraffic allowAllTraffic = (AllowAllTraffic)theEObject;
				T result = caseAllowAllTraffic(allowAllTraffic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.BINDINGS: {
				Bindings bindings = (Bindings)theEObject;
				T result = caseBindings(bindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CERTIFICATE: {
				Certificate certificate = (Certificate)theEObject;
				T result = caseCertificate(certificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CERTIFICATES: {
				Certificates certificates = (Certificates)theEObject;
				T result = caseCertificates(certificates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CONFIGURATION_SETTING: {
				ConfigurationSetting configurationSetting = (ConfigurationSetting)theEObject;
				T result = caseConfigurationSetting(configurationSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CONFIGURATION_SETTINGS: {
				ConfigurationSettings configurationSettings = (ConfigurationSettings)theEObject;
				T result = caseConfigurationSettings(configurationSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CONTENT_ELEMENT: {
				ContentElement contentElement = (ContentElement)theEObject;
				T result = caseContentElement(contentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.CONTENTS_ELEMENT: {
				ContentsElement contentsElement = (ContentsElement)theEObject;
				T result = caseContentsElement(contentsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.DESTINATIONS: {
				Destinations destinations = (Destinations)theEObject;
				T result = caseDestinations(destinations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ENDPOINTS: {
				Endpoints endpoints = (Endpoints)theEObject;
				T result = caseEndpoints(endpoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT: {
				EntryPointElement entryPointElement = (EntryPointElement)theEObject;
				T result = caseEntryPointElement(entryPointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.FROM_ROLE: {
				FromRole fromRole = (FromRole)theEObject;
				T result = caseFromRole(fromRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INPUT_ENDPOINT: {
				InputEndpoint inputEndpoint = (InputEndpoint)theEObject;
				T result = caseInputEndpoint(inputEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INPUT_ENDPOINTS_TYPE: {
				InputEndpointsType inputEndpointsType = (InputEndpointsType)theEObject;
				T result = caseInputEndpointsType(inputEndpointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INPUT_ENDPOINT_TYPE: {
				InputEndpointType inputEndpointType = (InputEndpointType)theEObject;
				T result = caseInputEndpointType(inputEndpointType);
				if (result == null) result = caseInputEndpoint(inputEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT: {
				InstanceInputEndpointElement instanceInputEndpointElement = (InstanceInputEndpointElement)theEObject;
				T result = caseInstanceInputEndpointElement(instanceInputEndpointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INTERNAL_ENDPOINT: {
				InternalEndpoint internalEndpoint = (InternalEndpoint)theEObject;
				T result = caseInternalEndpoint(internalEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.INTERNAL_ENDPOINT_TYPE: {
				InternalEndpointType internalEndpointType = (InternalEndpointType)theEObject;
				T result = caseInternalEndpointType(internalEndpointType);
				if (result == null) result = caseInternalEndpoint(internalEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.LOAD_BALANCER_PROBE: {
				LoadBalancerProbe loadBalancerProbe = (LoadBalancerProbe)theEObject;
				T result = caseLoadBalancerProbe(loadBalancerProbe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.LOAD_BALANCER_PROBES: {
				LoadBalancerProbes loadBalancerProbes = (LoadBalancerProbes)theEObject;
				T result = caseLoadBalancerProbes(loadBalancerProbes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.LOCAL_RESOURCES: {
				LocalResources localResources = (LocalResources)theEObject;
				T result = caseLocalResources(localResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.LOCAL_STORE: {
				LocalStore localStore = (LocalStore)theEObject;
				T result = caseLocalStore(localStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT: {
				NetFxAssemblyEntryPointElement netFxAssemblyEntryPointElement = (NetFxAssemblyEntryPointElement)theEObject;
				T result = caseNetFxAssemblyEntryPointElement(netFxAssemblyEntryPointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES: {
				NetworkTrafficRules networkTrafficRules = (NetworkTrafficRules)theEObject;
				T result = caseNetworkTrafficRules(networkTrafficRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO: {
				OnlyAllowTrafficTo onlyAllowTrafficTo = (OnlyAllowTrafficTo)theEObject;
				T result = caseOnlyAllowTrafficTo(onlyAllowTrafficTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.PORT_RANGE: {
				PortRange portRange = (PortRange)theEObject;
				T result = casePortRange(portRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.PROGRAM_ENTRY_POINT_ELEMENT: {
				ProgramEntryPointElement programEntryPointElement = (ProgramEntryPointElement)theEObject;
				T result = caseProgramEntryPointElement(programEntryPointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.RDMA_ENDPOINT_ELEMENT: {
				RdmaEndpointElement rdmaEndpointElement = (RdmaEndpointElement)theEObject;
				T result = caseRdmaEndpointElement(rdmaEndpointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ROLE_ENDPOINT: {
				RoleEndpoint roleEndpoint = (RoleEndpoint)theEObject;
				T result = caseRoleEndpoint(roleEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ROLE_INSTANCE_VALUE_ELEMENT: {
				RoleInstanceValueElement roleInstanceValueElement = (RoleInstanceValueElement)theEObject;
				T result = caseRoleInstanceValueElement(roleInstanceValueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.ROLE_MODULE: {
				RoleModule roleModule = (RoleModule)theEObject;
				T result = caseRoleModule(roleModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.RUNTIME: {
				eu.artist.migration.deployment.azure.csdef.Runtime runtime = (eu.artist.migration.deployment.azure.csdef.Runtime)theEObject;
				T result = caseRuntime(runtime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.RUNTIME_FOR_ROLE_MODULE: {
				RuntimeForRoleModule runtimeForRoleModule = (RuntimeForRoleModule)theEObject;
				T result = caseRuntimeForRoleModule(runtimeForRoleModule);
				if (result == null) result = caseRuntime(runtimeForRoleModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.SERVICE_DEFINITION: {
				ServiceDefinition serviceDefinition = (ServiceDefinition)theEObject;
				T result = caseServiceDefinition(serviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = caseVirtualDirectory(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.SITES: {
				Sites sites = (Sites)theEObject;
				T result = caseSites(sites);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.SOURCE_DIRECTORY_ELEMENT: {
				SourceDirectoryElement sourceDirectoryElement = (SourceDirectoryElement)theEObject;
				T result = caseSourceDirectoryElement(sourceDirectoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.STARTUP: {
				Startup startup = (Startup)theEObject;
				T result = caseStartup(startup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.VIRTUAL_APPLICATION: {
				VirtualApplication virtualApplication = (VirtualApplication)theEObject;
				T result = caseVirtualApplication(virtualApplication);
				if (result == null) result = caseVirtualDirectory(virtualApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.VIRTUAL_DIRECTORY: {
				VirtualDirectory virtualDirectory = (VirtualDirectory)theEObject;
				T result = caseVirtualDirectory(virtualDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WEB_ROLE: {
				WebRole webRole = (WebRole)theEObject;
				T result = caseWebRole(webRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WEB_RUNTIME: {
				WebRuntime webRuntime = (WebRuntime)theEObject;
				T result = caseWebRuntime(webRuntime);
				if (result == null) result = caseRuntime(webRuntime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WHEN_SOURCE: {
				WhenSource whenSource = (WhenSource)theEObject;
				T result = caseWhenSource(whenSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT: {
				WorkerEntryPointElement workerEntryPointElement = (WorkerEntryPointElement)theEObject;
				T result = caseWorkerEntryPointElement(workerEntryPointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WORKER_ROLE: {
				WorkerRole workerRole = (WorkerRole)theEObject;
				T result = caseWorkerRole(workerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AzureCSDefPackage.WORKER_RUNTIME: {
				WorkerRuntime workerRuntime = (WorkerRuntime)theEObject;
				T result = caseWorkerRuntime(workerRuntime);
				if (result == null) result = caseRuntime(workerRuntime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocate Public Port From Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocate Public Port From Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatePublicPortFromElement(AllocatePublicPortFromElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allow All Traffic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allow All Traffic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowAllTraffic(AllowAllTraffic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindings(Bindings object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Certificates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificates(Certificates object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSettings(ConfigurationSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentElement(ContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contents Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contents Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentsElement(ContentsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destinations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destinations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinations(Destinations object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Endpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoints(Endpoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointElement(EntryPointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromRole(FromRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEndpoint(InputEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Endpoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Endpoints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEndpointsType(InputEndpointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEndpointType(InputEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Input Endpoint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Input Endpoint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceInputEndpointElement(InstanceInputEndpointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEndpoint(InternalEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEndpointType(InternalEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer Probe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer Probe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancerProbe(LoadBalancerProbe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer Probes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer Probes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancerProbes(LoadBalancerProbes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalResources(LocalResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalStore(LocalStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net Fx Assembly Entry Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net Fx Assembly Entry Point Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetFxAssemblyEntryPointElement(NetFxAssemblyEntryPointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Traffic Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Traffic Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkTrafficRules(NetworkTrafficRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Only Allow Traffic To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Only Allow Traffic To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlyAllowTrafficTo(OnlyAllowTrafficTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRange(PortRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Entry Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Entry Point Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramEntryPointElement(ProgramEntryPointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdma Endpoint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdma Endpoint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdmaEndpointElement(RdmaEndpointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleEndpoint(RoleEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instance Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instance Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstanceValueElement(RoleInstanceValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleModule(RoleModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntime(eu.artist.migration.deployment.azure.csdef.Runtime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime For Role Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime For Role Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeForRoleModule(RuntimeForRoleModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDefinition(ServiceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sites</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sites</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSites(Sites object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Directory Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Directory Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDirectoryElement(SourceDirectoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Startup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Startup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartup(Startup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualApplication(VirtualApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualDirectory(VirtualDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebRole(WebRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebRuntime(WebRuntime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenSource(WhenSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker Entry Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker Entry Point Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkerEntryPointElement(WorkerEntryPointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkerRole(WorkerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkerRuntime(WorkerRuntime object) {
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

} //AzureCSDefSwitch

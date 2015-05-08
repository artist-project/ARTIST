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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage
 * @generated
 */
public class AzureCSDefAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AzureCSDefPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AzureCSDefPackage.eINSTANCE;
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
	protected AzureCSDefSwitch<Adapter> modelSwitch =
		new AzureCSDefSwitch<Adapter>() {
			@Override
			public Adapter caseAllocatePublicPortFromElement(AllocatePublicPortFromElement object) {
				return createAllocatePublicPortFromElementAdapter();
			}
			@Override
			public Adapter caseAllowAllTraffic(AllowAllTraffic object) {
				return createAllowAllTrafficAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindings(Bindings object) {
				return createBindingsAdapter();
			}
			@Override
			public Adapter caseCertificate(Certificate object) {
				return createCertificateAdapter();
			}
			@Override
			public Adapter caseCertificates(Certificates object) {
				return createCertificatesAdapter();
			}
			@Override
			public Adapter caseConfigurationSetting(ConfigurationSetting object) {
				return createConfigurationSettingAdapter();
			}
			@Override
			public Adapter caseConfigurationSettings(ConfigurationSettings object) {
				return createConfigurationSettingsAdapter();
			}
			@Override
			public Adapter caseContentElement(ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseContentsElement(ContentsElement object) {
				return createContentsElementAdapter();
			}
			@Override
			public Adapter caseDestinations(Destinations object) {
				return createDestinationsAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndpoints(Endpoints object) {
				return createEndpointsAdapter();
			}
			@Override
			public Adapter caseEntryPointElement(EntryPointElement object) {
				return createEntryPointElementAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseFromRole(FromRole object) {
				return createFromRoleAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter caseInputEndpoint(InputEndpoint object) {
				return createInputEndpointAdapter();
			}
			@Override
			public Adapter caseInputEndpointsType(InputEndpointsType object) {
				return createInputEndpointsTypeAdapter();
			}
			@Override
			public Adapter caseInputEndpointType(InputEndpointType object) {
				return createInputEndpointTypeAdapter();
			}
			@Override
			public Adapter caseInstanceInputEndpointElement(InstanceInputEndpointElement object) {
				return createInstanceInputEndpointElementAdapter();
			}
			@Override
			public Adapter caseInternalEndpoint(InternalEndpoint object) {
				return createInternalEndpointAdapter();
			}
			@Override
			public Adapter caseInternalEndpointType(InternalEndpointType object) {
				return createInternalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseLoadBalancerProbe(LoadBalancerProbe object) {
				return createLoadBalancerProbeAdapter();
			}
			@Override
			public Adapter caseLoadBalancerProbes(LoadBalancerProbes object) {
				return createLoadBalancerProbesAdapter();
			}
			@Override
			public Adapter caseLocalResources(LocalResources object) {
				return createLocalResourcesAdapter();
			}
			@Override
			public Adapter caseLocalStore(LocalStore object) {
				return createLocalStoreAdapter();
			}
			@Override
			public Adapter caseNetFxAssemblyEntryPointElement(NetFxAssemblyEntryPointElement object) {
				return createNetFxAssemblyEntryPointElementAdapter();
			}
			@Override
			public Adapter caseNetworkTrafficRules(NetworkTrafficRules object) {
				return createNetworkTrafficRulesAdapter();
			}
			@Override
			public Adapter caseOnlyAllowTrafficTo(OnlyAllowTrafficTo object) {
				return createOnlyAllowTrafficToAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortRange(PortRange object) {
				return createPortRangeAdapter();
			}
			@Override
			public Adapter caseProgramEntryPointElement(ProgramEntryPointElement object) {
				return createProgramEntryPointElementAdapter();
			}
			@Override
			public Adapter caseRdmaEndpointElement(RdmaEndpointElement object) {
				return createRdmaEndpointElementAdapter();
			}
			@Override
			public Adapter caseRoleEndpoint(RoleEndpoint object) {
				return createRoleEndpointAdapter();
			}
			@Override
			public Adapter caseRoleInstanceValueElement(RoleInstanceValueElement object) {
				return createRoleInstanceValueElementAdapter();
			}
			@Override
			public Adapter caseRoleModule(RoleModule object) {
				return createRoleModuleAdapter();
			}
			@Override
			public Adapter caseRuntime(eu.artist.migration.deployment.azure.csdef.Runtime object) {
				return createRuntimeAdapter();
			}
			@Override
			public Adapter caseRuntimeForRoleModule(RuntimeForRoleModule object) {
				return createRuntimeForRoleModuleAdapter();
			}
			@Override
			public Adapter caseServiceDefinition(ServiceDefinition object) {
				return createServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseSite(Site object) {
				return createSiteAdapter();
			}
			@Override
			public Adapter caseSites(Sites object) {
				return createSitesAdapter();
			}
			@Override
			public Adapter caseSourceDirectoryElement(SourceDirectoryElement object) {
				return createSourceDirectoryElementAdapter();
			}
			@Override
			public Adapter caseStartup(Startup object) {
				return createStartupAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseVirtualApplication(VirtualApplication object) {
				return createVirtualApplicationAdapter();
			}
			@Override
			public Adapter caseVirtualDirectory(VirtualDirectory object) {
				return createVirtualDirectoryAdapter();
			}
			@Override
			public Adapter caseWebRole(WebRole object) {
				return createWebRoleAdapter();
			}
			@Override
			public Adapter caseWebRuntime(WebRuntime object) {
				return createWebRuntimeAdapter();
			}
			@Override
			public Adapter caseWhenSource(WhenSource object) {
				return createWhenSourceAdapter();
			}
			@Override
			public Adapter caseWorkerEntryPointElement(WorkerEntryPointElement object) {
				return createWorkerEntryPointElementAdapter();
			}
			@Override
			public Adapter caseWorkerRole(WorkerRole object) {
				return createWorkerRoleAdapter();
			}
			@Override
			public Adapter caseWorkerRuntime(WorkerRuntime object) {
				return createWorkerRuntimeAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement <em>Allocate Public Port From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement
	 * @generated
	 */
	public Adapter createAllocatePublicPortFromElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.AllowAllTraffic <em>Allow All Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.AllowAllTraffic
	 * @generated
	 */
	public Adapter createAllowAllTrafficAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Bindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Bindings
	 * @generated
	 */
	public Adapter createBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificate
	 * @generated
	 */
	public Adapter createCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Certificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Certificates
	 * @generated
	 */
	public Adapter createCertificatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSetting <em>Configuration Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSetting
	 * @generated
	 */
	public Adapter createConfigurationSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ConfigurationSettings <em>Configuration Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ConfigurationSettings
	 * @generated
	 */
	public Adapter createConfigurationSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ContentsElement <em>Contents Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ContentsElement
	 * @generated
	 */
	public Adapter createContentsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Destinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Destinations
	 * @generated
	 */
	public Adapter createDestinationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Endpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Endpoints
	 * @generated
	 */
	public Adapter createEndpointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.EntryPointElement <em>Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.EntryPointElement
	 * @generated
	 */
	public Adapter createEntryPointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.FromRole <em>From Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.FromRole
	 * @generated
	 */
	public Adapter createFromRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint <em>Input Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpoint
	 * @generated
	 */
	public Adapter createInputEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointsType <em>Input Endpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointsType
	 * @generated
	 */
	public Adapter createInputEndpointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InputEndpointType <em>Input Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InputEndpointType
	 * @generated
	 */
	public Adapter createInputEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement <em>Instance Input Endpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement
	 * @generated
	 */
	public Adapter createInstanceInputEndpointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint <em>Internal Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpoint
	 * @generated
	 */
	public Adapter createInternalEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpointType <em>Internal Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalEndpointType
	 * @generated
	 */
	public Adapter createInternalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe <em>Load Balancer Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe
	 * @generated
	 */
	public Adapter createLoadBalancerProbeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes <em>Load Balancer Probes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes
	 * @generated
	 */
	public Adapter createLoadBalancerProbesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.LocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalResources
	 * @generated
	 */
	public Adapter createLocalResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.LocalStore <em>Local Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.LocalStore
	 * @generated
	 */
	public Adapter createLocalStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement <em>Net Fx Assembly Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement
	 * @generated
	 */
	public Adapter createNetFxAssemblyEntryPointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules <em>Network Traffic Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules
	 * @generated
	 */
	public Adapter createNetworkTrafficRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo <em>Only Allow Traffic To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo
	 * @generated
	 */
	public Adapter createOnlyAllowTrafficToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.PortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.PortRange
	 * @generated
	 */
	public Adapter createPortRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement <em>Program Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement
	 * @generated
	 */
	public Adapter createProgramEntryPointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement <em>Rdma Endpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.RdmaEndpointElement
	 * @generated
	 */
	public Adapter createRdmaEndpointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint <em>Role Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleEndpoint
	 * @generated
	 */
	public Adapter createRoleEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement <em>Role Instance Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement
	 * @generated
	 */
	public Adapter createRoleInstanceValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.RoleModule <em>Role Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.RoleModule
	 * @generated
	 */
	public Adapter createRoleModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Runtime
	 * @generated
	 */
	public Adapter createRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule <em>Runtime For Role Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule
	 * @generated
	 */
	public Adapter createRuntimeForRoleModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.ServiceDefinition
	 * @generated
	 */
	public Adapter createServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Sites <em>Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Sites
	 * @generated
	 */
	public Adapter createSitesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement <em>Source Directory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement
	 * @generated
	 */
	public Adapter createSourceDirectoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Startup <em>Startup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Startup
	 * @generated
	 */
	public Adapter createStartupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.VirtualApplication <em>Virtual Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualApplication
	 * @generated
	 */
	public Adapter createVirtualApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory <em>Virtual Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.VirtualDirectory
	 * @generated
	 */
	public Adapter createVirtualDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WebRole <em>Web Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRole
	 * @generated
	 */
	public Adapter createWebRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WebRuntime <em>Web Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WebRuntime
	 * @generated
	 */
	public Adapter createWebRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WhenSource <em>When Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WhenSource
	 * @generated
	 */
	public Adapter createWhenSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement <em>Worker Entry Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement
	 * @generated
	 */
	public Adapter createWorkerEntryPointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WorkerRole <em>Worker Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRole
	 * @generated
	 */
	public Adapter createWorkerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.artist.migration.deployment.azure.csdef.WorkerRuntime <em>Worker Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.artist.migration.deployment.azure.csdef.WorkerRuntime
	 * @generated
	 */
	public Adapter createWorkerRuntimeAdapter() {
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

} //AzureCSDefAdapterFactory

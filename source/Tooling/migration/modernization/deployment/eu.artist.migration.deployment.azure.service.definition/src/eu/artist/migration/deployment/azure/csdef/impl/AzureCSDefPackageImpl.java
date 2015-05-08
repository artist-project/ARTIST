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

import eu.artist.migration.deployment.azure.csdef.util.AzureCSDefValidator;

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
public class AzureCSDefPackageImpl extends EPackageImpl implements AzureCSDefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatePublicPortFromElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowAllTrafficEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingsEClass = null;

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
	private EClass certificatesEClass = null;

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
	private EClass configurationSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationsEClass = null;

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
	private EClass endpointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEndpointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceInputEndpointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerProbeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerProbesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netFxAssemblyEntryPointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTrafficRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlyAllowTrafficToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEntryPointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdmaEndpointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceValueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeForRoleModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sitesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDirectoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webRuntimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerEntryPointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerRuntimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anyPortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtinStoreNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionContextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum internalProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum probeProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

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
	private EEnum storeLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum topologyChangeDiscoveryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyPortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType builtinStoreNameObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distributionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executionContextObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType internalProtocolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lbProbeIntervalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lbProbeIntervalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lbProbeTimeoutEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lbProbeTimeoutObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matchModeObjectEDataType = null;

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
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType permissionLevelObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portSpecifierEDataType = null;

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
	private EDataType probeProtocolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolObjectEDataType = null;

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
	private EDataType storeLocationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType storeNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType topologyChangeDiscoveryObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportProtocolObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType virtualDirectoryNameEDataType = null;

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AzureCSDefPackageImpl() {
		super(eNS_URI, AzureCSDefFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AzureCSDefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AzureCSDefPackage init() {
		if (isInited) return (AzureCSDefPackage)EPackage.Registry.INSTANCE.getEPackage(AzureCSDefPackage.eNS_URI);

		// Obtain or create and register package
		AzureCSDefPackageImpl theAzureCSDefPackage = (AzureCSDefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AzureCSDefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AzureCSDefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAzureCSDefPackage.createPackageContents();

		// Initialize created meta-data
		theAzureCSDefPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAzureCSDefPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AzureCSDefValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAzureCSDefPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AzureCSDefPackage.eNS_URI, theAzureCSDefPackage);
		return theAzureCSDefPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatePublicPortFromElement() {
		return allocatePublicPortFromElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocatePublicPortFromElement_FixedPortRange() {
		return (EReference)allocatePublicPortFromElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowAllTraffic() {
		return allowAllTrafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_EndpointName() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_HostHeader() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Name() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindings() {
		return bindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindings_Binding() {
		return (EReference)bindingsEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCertificate_PermissionLevel() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificate_StoreLocation() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificate_StoreName() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificates() {
		return certificatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCertificates_Certificate() {
		return (EReference)certificatesEClass.getEStructuralFeatures().get(0);
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
	public EClass getConfigurationSettings() {
		return configurationSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSettings_Setting() {
		return (EReference)configurationSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentElement() {
		return contentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentElement_SourceDirectory() {
		return (EReference)contentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentElement_Destination() {
		return (EAttribute)contentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentsElement() {
		return contentsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentsElement_Content() {
		return (EReference)contentsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestinations() {
		return destinationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestinations_Group() {
		return (EAttribute)destinationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestinations_RoleEndpoint() {
		return (EReference)destinationsEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_RoleModule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceDefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoints() {
		return endpointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoints_Group() {
		return (EAttribute)endpointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoints_InputEndpoint() {
		return (EReference)endpointsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoints_InternalEndpoint() {
		return (EReference)endpointsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoints_InstanceInputEndpoint() {
		return (EReference)endpointsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointElement() {
		return entryPointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointElement_NetFxEntryPoint() {
		return (EReference)entryPointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Variable() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromRole() {
		return fromRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromRole_RoleName() {
		return (EAttribute)fromRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ModuleName() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImports_Group() {
		return (EAttribute)importsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImports_Import() {
		return (EReference)importsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputEndpoint() {
		return inputEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_Certificate() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_IdleTimeoutInMinutes() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_IgnoreRoleInstanceStatus() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_LoadBalancer() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_LoadBalancerDistribution() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_LoadBalancerProbe() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_LocalPort() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_Name() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_Port() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpoint_Protocol() {
		return (EAttribute)inputEndpointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputEndpointsType() {
		return inputEndpointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputEndpointsType_Group() {
		return (EAttribute)inputEndpointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputEndpointsType_InputEndpoint() {
		return (EReference)inputEndpointsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputEndpointType() {
		return inputEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceInputEndpointElement() {
		return instanceInputEndpointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceInputEndpointElement_AllocatePublicPortFrom() {
		return (EReference)instanceInputEndpointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceInputEndpointElement_IdleTimeoutInMinutes() {
		return (EAttribute)instanceInputEndpointElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceInputEndpointElement_LocalPort() {
		return (EAttribute)instanceInputEndpointElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceInputEndpointElement_Name() {
		return (EAttribute)instanceInputEndpointElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceInputEndpointElement_Protocol() {
		return (EAttribute)instanceInputEndpointElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEndpoint() {
		return internalEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEndpoint_Group() {
		return (EAttribute)internalEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEndpoint_FixedPort() {
		return (EReference)internalEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEndpoint_FixedPortRange() {
		return (EReference)internalEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEndpoint_Name() {
		return (EAttribute)internalEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEndpoint_Port() {
		return (EAttribute)internalEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEndpoint_Protocol() {
		return (EAttribute)internalEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEndpointType() {
		return internalEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBalancerProbe() {
		return loadBalancerProbeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_IntervalInSeconds() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_Name() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_Path() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_Port() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_Protocol() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadBalancerProbe_TimeoutInSeconds() {
		return (EAttribute)loadBalancerProbeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBalancerProbes() {
		return loadBalancerProbesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancerProbes_LoadBalancerProbe() {
		return (EReference)loadBalancerProbesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalResources() {
		return localResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalResources_Group() {
		return (EAttribute)localResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalResources_LocalStorage() {
		return (EReference)localResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalStore() {
		return localStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalStore_CleanOnRoleRecycle() {
		return (EAttribute)localStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalStore_Name() {
		return (EAttribute)localStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalStore_SizeInMB() {
		return (EAttribute)localStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetFxAssemblyEntryPointElement() {
		return netFxAssemblyEntryPointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetFxAssemblyEntryPointElement_AssemblyName() {
		return (EAttribute)netFxAssemblyEntryPointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetFxAssemblyEntryPointElement_TargetFrameworkVersion() {
		return (EAttribute)netFxAssemblyEntryPointElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkTrafficRules() {
		return networkTrafficRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkTrafficRules_OnlyAllowTrafficTo() {
		return (EReference)networkTrafficRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlyAllowTrafficTo() {
		return onlyAllowTrafficToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlyAllowTrafficTo_Destinations() {
		return (EReference)onlyAllowTrafficToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlyAllowTrafficTo_AllowAllTraffic() {
		return (EReference)onlyAllowTrafficToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnlyAllowTrafficTo_WhenSource() {
		return (EReference)onlyAllowTrafficToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Port() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRange() {
		return portRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRange_Max() {
		return (EAttribute)portRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortRange_Min() {
		return (EAttribute)portRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramEntryPointElement() {
		return programEntryPointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramEntryPointElement_CommandLine() {
		return (EAttribute)programEntryPointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramEntryPointElement_SetReadyOnProcessStart() {
		return (EAttribute)programEntryPointElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdmaEndpointElement() {
		return rdmaEndpointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdmaEndpointElement_Name() {
		return (EAttribute)rdmaEndpointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleEndpoint() {
		return roleEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleEndpoint_EndpointName() {
		return (EAttribute)roleEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleEndpoint_RoleName() {
		return (EAttribute)roleEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstanceValueElement() {
		return roleInstanceValueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstanceValueElement_Xpath() {
		return (EAttribute)roleInstanceValueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleModule() {
		return roleModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_Startup() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_Runtime() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_ConfigurationSettings() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_Endpoints() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_LocalResources() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_Certificates() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleModule_Sites() {
		return (EReference)roleModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleModule_Namespace() {
		return (EAttribute)roleModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntime() {
		return runtimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntime_Environment() {
		return (EReference)runtimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntime_ExecutionContext() {
		return (EAttribute)runtimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeForRoleModule() {
		return runtimeForRoleModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDefinition() {
		return serviceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_LoadBalancerProbes() {
		return (EReference)serviceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefinition_Group() {
		return (EAttribute)serviceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_WebRole() {
		return (EReference)serviceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_WorkerRole() {
		return (EReference)serviceDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_NetworkTrafficRules() {
		return (EReference)serviceDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefinition_Name() {
		return (EAttribute)serviceDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefinition_SchemaVersion() {
		return (EAttribute)serviceDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefinition_TopologyChangeDiscovery() {
		return (EAttribute)serviceDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefinition_UpgradeDomainCount() {
		return (EAttribute)serviceDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSite() {
		return siteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSite_Bindings() {
		return (EReference)siteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSites() {
		return sitesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSites_Group() {
		return (EAttribute)sitesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSites_Site() {
		return (EReference)sitesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDirectoryElement() {
		return sourceDirectoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDirectoryElement_Path() {
		return (EAttribute)sourceDirectoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartup() {
		return startupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartup_Task() {
		return (EReference)startupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartup_Priority() {
		return (EAttribute)startupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Environment() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CommandLine() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ExecutionContext() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskType() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_RoleInstanceValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualApplication() {
		return virtualApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualDirectory() {
		return virtualDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualDirectory_Group() {
		return (EAttribute)virtualDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualDirectory_VirtualDirectory() {
		return (EReference)virtualDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualDirectory_VirtualApplication() {
		return (EReference)virtualDirectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualDirectory_Name() {
		return (EAttribute)virtualDirectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualDirectory_PhysicalDirectory() {
		return (EAttribute)virtualDirectoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebRole() {
		return webRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Imports() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Startup() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_LocalStorage() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_LocalResources() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_ConfigurationSettings() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_InputEndpoints() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_InternalEndpoint() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Endpoints() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Certificates() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Sites() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Runtime() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRole_Contents() {
		return (EReference)webRoleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRole_EnableNativeCodeExecution() {
		return (EAttribute)webRoleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRole_Name() {
		return (EAttribute)webRoleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebRole_Vmsize() {
		return (EAttribute)webRoleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebRuntime() {
		return webRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebRuntime_EntryPoint() {
		return (EReference)webRuntimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenSource() {
		return whenSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenSource_Group() {
		return (EAttribute)whenSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhenSource_FromRole() {
		return (EReference)whenSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenSource_Matches() {
		return (EAttribute)whenSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkerEntryPointElement() {
		return workerEntryPointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerEntryPointElement_ProgramEntryPoint() {
		return (EReference)workerEntryPointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerEntryPointElement_NetFxEntryPoint() {
		return (EReference)workerEntryPointElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkerRole() {
		return workerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Imports() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Startup() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_LocalStorage() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_LocalResources() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_ConfigurationSettings() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Endpoints() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Certificates() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Runtime() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRole_Contents() {
		return (EReference)workerRoleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkerRole_EnableNativeCodeExecution() {
		return (EAttribute)workerRoleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkerRole_Name() {
		return (EAttribute)workerRoleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkerRole_Vmsize() {
		return (EAttribute)workerRoleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkerRuntime() {
		return workerRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkerRuntime_EntryPoint() {
		return (EReference)workerRuntimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnyPort() {
		return anyPortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltinStoreName() {
		return builtinStoreNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistributionType() {
		return distributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionContext() {
		return executionContextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInternalProtocol() {
		return internalProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchMode() {
		return matchModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissionLevel() {
		return permissionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProbeProtocol() {
		return probeProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
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
	public EEnum getStoreLocation() {
		return storeLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskType() {
		return taskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTopologyChangeDiscovery() {
		return topologyChangeDiscoveryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportProtocol() {
		return transportProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnyPortObject() {
		return anyPortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuiltinStoreNameObject() {
		return builtinStoreNameObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistributionTypeObject() {
		return distributionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecutionContextObject() {
		return executionContextObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInternalProtocolObject() {
		return internalProtocolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLBProbeInterval() {
		return lbProbeIntervalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLBProbeIntervalObject() {
		return lbProbeIntervalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLBProbeTimeout() {
		return lbProbeTimeoutEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLBProbeTimeoutObject() {
		return lbProbeTimeoutObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatchModeObject() {
		return matchModeObjectEDataType;
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
	public EDataType getNonEmptyString() {
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPermissionLevelObject() {
		return permissionLevelObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortInteger() {
		return portIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortIntegerObject() {
		return portIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortSpecifier() {
		return portSpecifierEDataType;
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
	public EDataType getProbeProtocolObject() {
		return probeProtocolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolObject() {
		return protocolObjectEDataType;
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
	public EDataType getStoreLocationObject() {
		return storeLocationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStoreName() {
		return storeNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskTypeObject() {
		return taskTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTopologyChangeDiscoveryObject() {
		return topologyChangeDiscoveryObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportProtocolObject() {
		return transportProtocolObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVirtualDirectoryName() {
		return virtualDirectoryNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDefFactory getAzureCSDefFactory() {
		return (AzureCSDefFactory)getEFactoryInstance();
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
		allocatePublicPortFromElementEClass = createEClass(ALLOCATE_PUBLIC_PORT_FROM_ELEMENT);
		createEReference(allocatePublicPortFromElementEClass, ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE);

		allowAllTrafficEClass = createEClass(ALLOW_ALL_TRAFFIC);

		bindingEClass = createEClass(BINDING);
		createEAttribute(bindingEClass, BINDING__ENDPOINT_NAME);
		createEAttribute(bindingEClass, BINDING__HOST_HEADER);
		createEAttribute(bindingEClass, BINDING__NAME);

		bindingsEClass = createEClass(BINDINGS);
		createEReference(bindingsEClass, BINDINGS__BINDING);

		certificateEClass = createEClass(CERTIFICATE);
		createEAttribute(certificateEClass, CERTIFICATE__NAME);
		createEAttribute(certificateEClass, CERTIFICATE__PERMISSION_LEVEL);
		createEAttribute(certificateEClass, CERTIFICATE__STORE_LOCATION);
		createEAttribute(certificateEClass, CERTIFICATE__STORE_NAME);

		certificatesEClass = createEClass(CERTIFICATES);
		createEReference(certificatesEClass, CERTIFICATES__CERTIFICATE);

		configurationSettingEClass = createEClass(CONFIGURATION_SETTING);
		createEAttribute(configurationSettingEClass, CONFIGURATION_SETTING__NAME);

		configurationSettingsEClass = createEClass(CONFIGURATION_SETTINGS);
		createEReference(configurationSettingsEClass, CONFIGURATION_SETTINGS__SETTING);

		contentElementEClass = createEClass(CONTENT_ELEMENT);
		createEReference(contentElementEClass, CONTENT_ELEMENT__SOURCE_DIRECTORY);
		createEAttribute(contentElementEClass, CONTENT_ELEMENT__DESTINATION);

		contentsElementEClass = createEClass(CONTENTS_ELEMENT);
		createEReference(contentsElementEClass, CONTENTS_ELEMENT__CONTENT);

		destinationsEClass = createEClass(DESTINATIONS);
		createEAttribute(destinationsEClass, DESTINATIONS__GROUP);
		createEReference(destinationsEClass, DESTINATIONS__ROLE_ENDPOINT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROLE_MODULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_DEFINITION);

		endpointsEClass = createEClass(ENDPOINTS);
		createEAttribute(endpointsEClass, ENDPOINTS__GROUP);
		createEReference(endpointsEClass, ENDPOINTS__INPUT_ENDPOINT);
		createEReference(endpointsEClass, ENDPOINTS__INTERNAL_ENDPOINT);
		createEReference(endpointsEClass, ENDPOINTS__INSTANCE_INPUT_ENDPOINT);

		entryPointElementEClass = createEClass(ENTRY_POINT_ELEMENT);
		createEReference(entryPointElementEClass, ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__VARIABLE);

		fromRoleEClass = createEClass(FROM_ROLE);
		createEAttribute(fromRoleEClass, FROM_ROLE__ROLE_NAME);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__MODULE_NAME);

		importsEClass = createEClass(IMPORTS);
		createEAttribute(importsEClass, IMPORTS__GROUP);
		createEReference(importsEClass, IMPORTS__IMPORT);

		inputEndpointEClass = createEClass(INPUT_ENDPOINT);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__CERTIFICATE);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__LOAD_BALANCER);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__LOAD_BALANCER_PROBE);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__LOCAL_PORT);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__NAME);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__PORT);
		createEAttribute(inputEndpointEClass, INPUT_ENDPOINT__PROTOCOL);

		inputEndpointsTypeEClass = createEClass(INPUT_ENDPOINTS_TYPE);
		createEAttribute(inputEndpointsTypeEClass, INPUT_ENDPOINTS_TYPE__GROUP);
		createEReference(inputEndpointsTypeEClass, INPUT_ENDPOINTS_TYPE__INPUT_ENDPOINT);

		inputEndpointTypeEClass = createEClass(INPUT_ENDPOINT_TYPE);

		instanceInputEndpointElementEClass = createEClass(INSTANCE_INPUT_ENDPOINT_ELEMENT);
		createEReference(instanceInputEndpointElementEClass, INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM);
		createEAttribute(instanceInputEndpointElementEClass, INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES);
		createEAttribute(instanceInputEndpointElementEClass, INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT);
		createEAttribute(instanceInputEndpointElementEClass, INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME);
		createEAttribute(instanceInputEndpointElementEClass, INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL);

		internalEndpointEClass = createEClass(INTERNAL_ENDPOINT);
		createEAttribute(internalEndpointEClass, INTERNAL_ENDPOINT__GROUP);
		createEReference(internalEndpointEClass, INTERNAL_ENDPOINT__FIXED_PORT);
		createEReference(internalEndpointEClass, INTERNAL_ENDPOINT__FIXED_PORT_RANGE);
		createEAttribute(internalEndpointEClass, INTERNAL_ENDPOINT__NAME);
		createEAttribute(internalEndpointEClass, INTERNAL_ENDPOINT__PORT);
		createEAttribute(internalEndpointEClass, INTERNAL_ENDPOINT__PROTOCOL);

		internalEndpointTypeEClass = createEClass(INTERNAL_ENDPOINT_TYPE);

		loadBalancerProbeEClass = createEClass(LOAD_BALANCER_PROBE);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__NAME);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__PATH);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__PORT);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__PROTOCOL);
		createEAttribute(loadBalancerProbeEClass, LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS);

		loadBalancerProbesEClass = createEClass(LOAD_BALANCER_PROBES);
		createEReference(loadBalancerProbesEClass, LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE);

		localResourcesEClass = createEClass(LOCAL_RESOURCES);
		createEAttribute(localResourcesEClass, LOCAL_RESOURCES__GROUP);
		createEReference(localResourcesEClass, LOCAL_RESOURCES__LOCAL_STORAGE);

		localStoreEClass = createEClass(LOCAL_STORE);
		createEAttribute(localStoreEClass, LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE);
		createEAttribute(localStoreEClass, LOCAL_STORE__NAME);
		createEAttribute(localStoreEClass, LOCAL_STORE__SIZE_IN_MB);

		netFxAssemblyEntryPointElementEClass = createEClass(NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT);
		createEAttribute(netFxAssemblyEntryPointElementEClass, NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME);
		createEAttribute(netFxAssemblyEntryPointElementEClass, NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION);

		networkTrafficRulesEClass = createEClass(NETWORK_TRAFFIC_RULES);
		createEReference(networkTrafficRulesEClass, NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO);

		onlyAllowTrafficToEClass = createEClass(ONLY_ALLOW_TRAFFIC_TO);
		createEReference(onlyAllowTrafficToEClass, ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS);
		createEReference(onlyAllowTrafficToEClass, ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC);
		createEReference(onlyAllowTrafficToEClass, ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__PORT);

		portRangeEClass = createEClass(PORT_RANGE);
		createEAttribute(portRangeEClass, PORT_RANGE__MAX);
		createEAttribute(portRangeEClass, PORT_RANGE__MIN);

		programEntryPointElementEClass = createEClass(PROGRAM_ENTRY_POINT_ELEMENT);
		createEAttribute(programEntryPointElementEClass, PROGRAM_ENTRY_POINT_ELEMENT__COMMAND_LINE);
		createEAttribute(programEntryPointElementEClass, PROGRAM_ENTRY_POINT_ELEMENT__SET_READY_ON_PROCESS_START);

		rdmaEndpointElementEClass = createEClass(RDMA_ENDPOINT_ELEMENT);
		createEAttribute(rdmaEndpointElementEClass, RDMA_ENDPOINT_ELEMENT__NAME);

		roleEndpointEClass = createEClass(ROLE_ENDPOINT);
		createEAttribute(roleEndpointEClass, ROLE_ENDPOINT__ENDPOINT_NAME);
		createEAttribute(roleEndpointEClass, ROLE_ENDPOINT__ROLE_NAME);

		roleInstanceValueElementEClass = createEClass(ROLE_INSTANCE_VALUE_ELEMENT);
		createEAttribute(roleInstanceValueElementEClass, ROLE_INSTANCE_VALUE_ELEMENT__XPATH);

		roleModuleEClass = createEClass(ROLE_MODULE);
		createEReference(roleModuleEClass, ROLE_MODULE__STARTUP);
		createEReference(roleModuleEClass, ROLE_MODULE__RUNTIME);
		createEReference(roleModuleEClass, ROLE_MODULE__CONFIGURATION_SETTINGS);
		createEReference(roleModuleEClass, ROLE_MODULE__ENDPOINTS);
		createEReference(roleModuleEClass, ROLE_MODULE__LOCAL_RESOURCES);
		createEReference(roleModuleEClass, ROLE_MODULE__CERTIFICATES);
		createEReference(roleModuleEClass, ROLE_MODULE__SITES);
		createEAttribute(roleModuleEClass, ROLE_MODULE__NAMESPACE);

		runtimeEClass = createEClass(RUNTIME);
		createEReference(runtimeEClass, RUNTIME__ENVIRONMENT);
		createEAttribute(runtimeEClass, RUNTIME__EXECUTION_CONTEXT);

		runtimeForRoleModuleEClass = createEClass(RUNTIME_FOR_ROLE_MODULE);

		serviceDefinitionEClass = createEClass(SERVICE_DEFINITION);
		createEReference(serviceDefinitionEClass, SERVICE_DEFINITION__LOAD_BALANCER_PROBES);
		createEAttribute(serviceDefinitionEClass, SERVICE_DEFINITION__GROUP);
		createEReference(serviceDefinitionEClass, SERVICE_DEFINITION__WEB_ROLE);
		createEReference(serviceDefinitionEClass, SERVICE_DEFINITION__WORKER_ROLE);
		createEReference(serviceDefinitionEClass, SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES);
		createEAttribute(serviceDefinitionEClass, SERVICE_DEFINITION__NAME);
		createEAttribute(serviceDefinitionEClass, SERVICE_DEFINITION__SCHEMA_VERSION);
		createEAttribute(serviceDefinitionEClass, SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY);
		createEAttribute(serviceDefinitionEClass, SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT);

		siteEClass = createEClass(SITE);
		createEReference(siteEClass, SITE__BINDINGS);

		sitesEClass = createEClass(SITES);
		createEAttribute(sitesEClass, SITES__GROUP);
		createEReference(sitesEClass, SITES__SITE);

		sourceDirectoryElementEClass = createEClass(SOURCE_DIRECTORY_ELEMENT);
		createEAttribute(sourceDirectoryElementEClass, SOURCE_DIRECTORY_ELEMENT__PATH);

		startupEClass = createEClass(STARTUP);
		createEReference(startupEClass, STARTUP__TASK);
		createEAttribute(startupEClass, STARTUP__PRIORITY);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__ENVIRONMENT);
		createEAttribute(taskEClass, TASK__COMMAND_LINE);
		createEAttribute(taskEClass, TASK__EXECUTION_CONTEXT);
		createEAttribute(taskEClass, TASK__TASK_TYPE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__ROLE_INSTANCE_VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		virtualApplicationEClass = createEClass(VIRTUAL_APPLICATION);

		virtualDirectoryEClass = createEClass(VIRTUAL_DIRECTORY);
		createEAttribute(virtualDirectoryEClass, VIRTUAL_DIRECTORY__GROUP);
		createEReference(virtualDirectoryEClass, VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY);
		createEReference(virtualDirectoryEClass, VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION);
		createEAttribute(virtualDirectoryEClass, VIRTUAL_DIRECTORY__NAME);
		createEAttribute(virtualDirectoryEClass, VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY);

		webRoleEClass = createEClass(WEB_ROLE);
		createEReference(webRoleEClass, WEB_ROLE__IMPORTS);
		createEReference(webRoleEClass, WEB_ROLE__STARTUP);
		createEReference(webRoleEClass, WEB_ROLE__LOCAL_STORAGE);
		createEReference(webRoleEClass, WEB_ROLE__LOCAL_RESOURCES);
		createEReference(webRoleEClass, WEB_ROLE__CONFIGURATION_SETTINGS);
		createEReference(webRoleEClass, WEB_ROLE__INPUT_ENDPOINTS);
		createEReference(webRoleEClass, WEB_ROLE__INTERNAL_ENDPOINT);
		createEReference(webRoleEClass, WEB_ROLE__ENDPOINTS);
		createEReference(webRoleEClass, WEB_ROLE__CERTIFICATES);
		createEReference(webRoleEClass, WEB_ROLE__SITES);
		createEReference(webRoleEClass, WEB_ROLE__RUNTIME);
		createEReference(webRoleEClass, WEB_ROLE__CONTENTS);
		createEAttribute(webRoleEClass, WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION);
		createEAttribute(webRoleEClass, WEB_ROLE__NAME);
		createEAttribute(webRoleEClass, WEB_ROLE__VMSIZE);

		webRuntimeEClass = createEClass(WEB_RUNTIME);
		createEReference(webRuntimeEClass, WEB_RUNTIME__ENTRY_POINT);

		whenSourceEClass = createEClass(WHEN_SOURCE);
		createEAttribute(whenSourceEClass, WHEN_SOURCE__GROUP);
		createEReference(whenSourceEClass, WHEN_SOURCE__FROM_ROLE);
		createEAttribute(whenSourceEClass, WHEN_SOURCE__MATCHES);

		workerEntryPointElementEClass = createEClass(WORKER_ENTRY_POINT_ELEMENT);
		createEReference(workerEntryPointElementEClass, WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT);
		createEReference(workerEntryPointElementEClass, WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT);

		workerRoleEClass = createEClass(WORKER_ROLE);
		createEReference(workerRoleEClass, WORKER_ROLE__IMPORTS);
		createEReference(workerRoleEClass, WORKER_ROLE__STARTUP);
		createEReference(workerRoleEClass, WORKER_ROLE__LOCAL_STORAGE);
		createEReference(workerRoleEClass, WORKER_ROLE__LOCAL_RESOURCES);
		createEReference(workerRoleEClass, WORKER_ROLE__CONFIGURATION_SETTINGS);
		createEReference(workerRoleEClass, WORKER_ROLE__ENDPOINTS);
		createEReference(workerRoleEClass, WORKER_ROLE__CERTIFICATES);
		createEReference(workerRoleEClass, WORKER_ROLE__RUNTIME);
		createEReference(workerRoleEClass, WORKER_ROLE__CONTENTS);
		createEAttribute(workerRoleEClass, WORKER_ROLE__ENABLE_NATIVE_CODE_EXECUTION);
		createEAttribute(workerRoleEClass, WORKER_ROLE__NAME);
		createEAttribute(workerRoleEClass, WORKER_ROLE__VMSIZE);

		workerRuntimeEClass = createEClass(WORKER_RUNTIME);
		createEReference(workerRuntimeEClass, WORKER_RUNTIME__ENTRY_POINT);

		// Create enums
		anyPortEEnum = createEEnum(ANY_PORT);
		builtinStoreNameEEnum = createEEnum(BUILTIN_STORE_NAME);
		distributionTypeEEnum = createEEnum(DISTRIBUTION_TYPE);
		executionContextEEnum = createEEnum(EXECUTION_CONTEXT);
		internalProtocolEEnum = createEEnum(INTERNAL_PROTOCOL);
		matchModeEEnum = createEEnum(MATCH_MODE);
		permissionLevelEEnum = createEEnum(PERMISSION_LEVEL);
		probeProtocolEEnum = createEEnum(PROBE_PROTOCOL);
		protocolEEnum = createEEnum(PROTOCOL);
		schemaVersionEEnum = createEEnum(SCHEMA_VERSION);
		storeLocationEEnum = createEEnum(STORE_LOCATION);
		taskTypeEEnum = createEEnum(TASK_TYPE);
		topologyChangeDiscoveryEEnum = createEEnum(TOPOLOGY_CHANGE_DISCOVERY);
		transportProtocolEEnum = createEEnum(TRANSPORT_PROTOCOL);

		// Create data types
		anyPortObjectEDataType = createEDataType(ANY_PORT_OBJECT);
		builtinStoreNameObjectEDataType = createEDataType(BUILTIN_STORE_NAME_OBJECT);
		distributionTypeObjectEDataType = createEDataType(DISTRIBUTION_TYPE_OBJECT);
		executionContextObjectEDataType = createEDataType(EXECUTION_CONTEXT_OBJECT);
		internalProtocolObjectEDataType = createEDataType(INTERNAL_PROTOCOL_OBJECT);
		lbProbeIntervalEDataType = createEDataType(LB_PROBE_INTERVAL);
		lbProbeIntervalObjectEDataType = createEDataType(LB_PROBE_INTERVAL_OBJECT);
		lbProbeTimeoutEDataType = createEDataType(LB_PROBE_TIMEOUT);
		lbProbeTimeoutObjectEDataType = createEDataType(LB_PROBE_TIMEOUT_OBJECT);
		matchModeObjectEDataType = createEDataType(MATCH_MODE_OBJECT);
		namedElementNameStringEDataType = createEDataType(NAMED_ELEMENT_NAME_STRING);
		nonEmptyStringEDataType = createEDataType(NON_EMPTY_STRING);
		permissionLevelObjectEDataType = createEDataType(PERMISSION_LEVEL_OBJECT);
		portIntegerEDataType = createEDataType(PORT_INTEGER);
		portIntegerObjectEDataType = createEDataType(PORT_INTEGER_OBJECT);
		portSpecifierEDataType = createEDataType(PORT_SPECIFIER);
		positiveIntEDataType = createEDataType(POSITIVE_INT);
		positiveIntObjectEDataType = createEDataType(POSITIVE_INT_OBJECT);
		probeProtocolObjectEDataType = createEDataType(PROBE_PROTOCOL_OBJECT);
		protocolObjectEDataType = createEDataType(PROTOCOL_OBJECT);
		schemaVersionObjectEDataType = createEDataType(SCHEMA_VERSION_OBJECT);
		storeLocationObjectEDataType = createEDataType(STORE_LOCATION_OBJECT);
		storeNameEDataType = createEDataType(STORE_NAME);
		taskTypeObjectEDataType = createEDataType(TASK_TYPE_OBJECT);
		topologyChangeDiscoveryObjectEDataType = createEDataType(TOPOLOGY_CHANGE_DISCOVERY_OBJECT);
		transportProtocolObjectEDataType = createEDataType(TRANSPORT_PROTOCOL_OBJECT);
		virtualDirectoryNameEDataType = createEDataType(VIRTUAL_DIRECTORY_NAME);
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
		inputEndpointTypeEClass.getESuperTypes().add(this.getInputEndpoint());
		internalEndpointTypeEClass.getESuperTypes().add(this.getInternalEndpoint());
		runtimeForRoleModuleEClass.getESuperTypes().add(this.getRuntime());
		siteEClass.getESuperTypes().add(this.getVirtualDirectory());
		virtualApplicationEClass.getESuperTypes().add(this.getVirtualDirectory());
		webRuntimeEClass.getESuperTypes().add(this.getRuntime());
		workerRuntimeEClass.getESuperTypes().add(this.getRuntime());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocatePublicPortFromElementEClass, AllocatePublicPortFromElement.class, "AllocatePublicPortFromElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocatePublicPortFromElement_FixedPortRange(), this.getPortRange(), null, "fixedPortRange", null, 1, 1, AllocatePublicPortFromElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowAllTrafficEClass, AllowAllTraffic.class, "AllowAllTraffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinding_EndpointName(), this.getNamedElementNameString(), "endpointName", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_HostHeader(), theXMLTypePackage.getString(), "hostHeader", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Name(), this.getNamedElementNameString(), "name", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingsEClass, Bindings.class, "Bindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindings_Binding(), this.getBinding(), null, "binding", null, 1, -1, Bindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateEClass, Certificate.class, "Certificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificate_Name(), this.getNamedElementNameString(), "name", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_PermissionLevel(), this.getPermissionLevel(), "permissionLevel", "limitedOrElevated", 0, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_StoreLocation(), this.getStoreLocation(), "storeLocation", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_StoreName(), this.getStoreName(), "storeName", null, 1, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificatesEClass, Certificates.class, "Certificates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCertificates_Certificate(), this.getCertificate(), null, "certificate", null, 0, -1, Certificates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSettingEClass, ConfigurationSetting.class, "ConfigurationSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationSetting_Name(), this.getNamedElementNameString(), "name", null, 1, 1, ConfigurationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSettingsEClass, ConfigurationSettings.class, "ConfigurationSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationSettings_Setting(), this.getConfigurationSetting(), null, "setting", null, 0, -1, ConfigurationSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentElementEClass, ContentElement.class, "ContentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentElement_SourceDirectory(), this.getSourceDirectoryElement(), null, "sourceDirectory", null, 1, 1, ContentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentElement_Destination(), this.getNonEmptyString(), "destination", null, 1, 1, ContentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentsElementEClass, ContentsElement.class, "ContentsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentsElement_Content(), this.getContentElement(), null, "content", null, 0, -1, ContentsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destinationsEClass, Destinations.class, "Destinations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestinations_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Destinations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDestinations_RoleEndpoint(), this.getRoleEndpoint(), null, "roleEndpoint", null, 1, -1, Destinations.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RoleModule(), this.getRoleModule(), null, "roleModule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceDefinition(), this.getServiceDefinition(), null, "serviceDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endpointsEClass, Endpoints.class, "Endpoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpoints_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Endpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoints_InputEndpoint(), this.getInputEndpoint(), null, "inputEndpoint", null, 0, -1, Endpoints.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoints_InternalEndpoint(), this.getInternalEndpoint(), null, "internalEndpoint", null, 0, -1, Endpoints.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEndpoints_InstanceInputEndpoint(), this.getInstanceInputEndpointElement(), null, "instanceInputEndpoint", null, 0, -1, Endpoints.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entryPointElementEClass, EntryPointElement.class, "EntryPointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPointElement_NetFxEntryPoint(), this.getNetFxAssemblyEntryPointElement(), null, "netFxEntryPoint", null, 0, 1, EntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_Variable(), this.getVariable(), null, "variable", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromRoleEClass, FromRole.class, "FromRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromRole_RoleName(), this.getNamedElementNameString(), "roleName", null, 1, 1, FromRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ModuleName(), this.getNamedElementNameString(), "moduleName", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImports_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImports_Import(), this.getImport(), null, "import", null, 0, -1, Imports.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inputEndpointEClass, InputEndpoint.class, "InputEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputEndpoint_Certificate(), this.getNamedElementNameString(), "certificate", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_IdleTimeoutInMinutes(), this.getPositiveInt(), "idleTimeoutInMinutes", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_IgnoreRoleInstanceStatus(), theXMLTypePackage.getBoolean(), "ignoreRoleInstanceStatus", "false", 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_LoadBalancer(), this.getNamedElementNameString(), "loadBalancer", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_LoadBalancerDistribution(), this.getDistributionType(), "loadBalancerDistribution", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_LoadBalancerProbe(), this.getNamedElementNameString(), "loadBalancerProbe", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_LocalPort(), this.getPortSpecifier(), "localPort", null, 0, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_Name(), this.getNamedElementNameString(), "name", null, 1, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_Port(), this.getPortInteger(), "port", null, 1, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputEndpoint_Protocol(), this.getProtocol(), "protocol", null, 1, 1, InputEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEndpointsTypeEClass, InputEndpointsType.class, "InputEndpointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputEndpointsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InputEndpointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputEndpointsType_InputEndpoint(), this.getInputEndpointType(), null, "inputEndpoint", null, 1, 2, InputEndpointsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inputEndpointTypeEClass, InputEndpointType.class, "InputEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceInputEndpointElementEClass, InstanceInputEndpointElement.class, "InstanceInputEndpointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceInputEndpointElement_AllocatePublicPortFrom(), this.getAllocatePublicPortFromElement(), null, "allocatePublicPortFrom", null, 1, 1, InstanceInputEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceInputEndpointElement_IdleTimeoutInMinutes(), this.getPositiveInt(), "idleTimeoutInMinutes", null, 0, 1, InstanceInputEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceInputEndpointElement_LocalPort(), this.getPortInteger(), "localPort", null, 1, 1, InstanceInputEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceInputEndpointElement_Name(), this.getNamedElementNameString(), "name", null, 1, 1, InstanceInputEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceInputEndpointElement_Protocol(), this.getTransportProtocol(), "protocol", null, 1, 1, InstanceInputEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalEndpointEClass, InternalEndpoint.class, "InternalEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalEndpoint_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InternalEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalEndpoint_FixedPort(), this.getPort(), null, "fixedPort", null, 0, -1, InternalEndpoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInternalEndpoint_FixedPortRange(), this.getPortRange(), null, "fixedPortRange", null, 0, -1, InternalEndpoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalEndpoint_Name(), this.getNamedElementNameString(), "name", null, 1, 1, InternalEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalEndpoint_Port(), this.getPortSpecifier(), "port", null, 0, 1, InternalEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalEndpoint_Protocol(), this.getInternalProtocol(), "protocol", null, 1, 1, InternalEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalEndpointTypeEClass, InternalEndpointType.class, "InternalEndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadBalancerProbeEClass, LoadBalancerProbe.class, "LoadBalancerProbe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBalancerProbe_IntervalInSeconds(), this.getLBProbeInterval(), "intervalInSeconds", "15", 0, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerProbe_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerProbe_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerProbe_Port(), this.getPortInteger(), "port", null, 0, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerProbe_Protocol(), this.getProbeProtocol(), "protocol", null, 1, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerProbe_TimeoutInSeconds(), this.getLBProbeTimeout(), "timeoutInSeconds", "31", 0, 1, LoadBalancerProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBalancerProbesEClass, LoadBalancerProbes.class, "LoadBalancerProbes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadBalancerProbes_LoadBalancerProbe(), this.getLoadBalancerProbe(), null, "loadBalancerProbe", null, 0, -1, LoadBalancerProbes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localResourcesEClass, LocalResources.class, "LocalResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalResources_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LocalResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalResources_LocalStorage(), this.getLocalStore(), null, "localStorage", null, 0, -1, LocalResources.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(localStoreEClass, LocalStore.class, "LocalStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalStore_CleanOnRoleRecycle(), theXMLTypePackage.getBoolean(), "cleanOnRoleRecycle", "true", 0, 1, LocalStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalStore_Name(), this.getNamedElementNameString(), "name", null, 1, 1, LocalStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalStore_SizeInMB(), this.getPositiveInt(), "sizeInMB", "1000", 0, 1, LocalStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netFxAssemblyEntryPointElementEClass, NetFxAssemblyEntryPointElement.class, "NetFxAssemblyEntryPointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetFxAssemblyEntryPointElement_AssemblyName(), this.getNonEmptyString(), "assemblyName", null, 1, 1, NetFxAssemblyEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetFxAssemblyEntryPointElement_TargetFrameworkVersion(), this.getNonEmptyString(), "targetFrameworkVersion", null, 0, 1, NetFxAssemblyEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTrafficRulesEClass, NetworkTrafficRules.class, "NetworkTrafficRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkTrafficRules_OnlyAllowTrafficTo(), this.getOnlyAllowTrafficTo(), null, "onlyAllowTrafficTo", null, 0, -1, NetworkTrafficRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlyAllowTrafficToEClass, OnlyAllowTrafficTo.class, "OnlyAllowTrafficTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnlyAllowTrafficTo_Destinations(), this.getDestinations(), null, "destinations", null, 1, 1, OnlyAllowTrafficTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnlyAllowTrafficTo_AllowAllTraffic(), this.getAllowAllTraffic(), null, "allowAllTraffic", null, 0, 1, OnlyAllowTrafficTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnlyAllowTrafficTo_WhenSource(), this.getWhenSource(), null, "whenSource", null, 0, 1, OnlyAllowTrafficTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Port(), this.getPortInteger(), "port", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRangeEClass, PortRange.class, "PortRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortRange_Max(), this.getPortInteger(), "max", null, 1, 1, PortRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortRange_Min(), this.getPortInteger(), "min", null, 1, 1, PortRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEntryPointElementEClass, ProgramEntryPointElement.class, "ProgramEntryPointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramEntryPointElement_CommandLine(), this.getNonEmptyString(), "commandLine", null, 1, 1, ProgramEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramEntryPointElement_SetReadyOnProcessStart(), theXMLTypePackage.getBoolean(), "setReadyOnProcessStart", null, 1, 1, ProgramEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdmaEndpointElementEClass, RdmaEndpointElement.class, "RdmaEndpointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRdmaEndpointElement_Name(), this.getNamedElementNameString(), "name", null, 1, 1, RdmaEndpointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEndpointEClass, RoleEndpoint.class, "RoleEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleEndpoint_EndpointName(), this.getNamedElementNameString(), "endpointName", null, 1, 1, RoleEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleEndpoint_RoleName(), this.getNamedElementNameString(), "roleName", null, 1, 1, RoleEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleInstanceValueElementEClass, RoleInstanceValueElement.class, "RoleInstanceValueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleInstanceValueElement_Xpath(), theXMLTypePackage.getString(), "xpath", null, 1, 1, RoleInstanceValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleModuleEClass, RoleModule.class, "RoleModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleModule_Startup(), this.getStartup(), null, "startup", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_Runtime(), this.getRuntimeForRoleModule(), null, "runtime", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_ConfigurationSettings(), this.getConfigurationSettings(), null, "configurationSettings", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_Endpoints(), this.getEndpoints(), null, "endpoints", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_LocalResources(), this.getLocalResources(), null, "localResources", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_Certificates(), this.getCertificates(), null, "certificates", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleModule_Sites(), this.getSites(), null, "sites", null, 0, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleModule_Namespace(), this.getNamedElementNameString(), "namespace", null, 1, 1, RoleModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeEClass, eu.artist.migration.deployment.azure.csdef.Runtime.class, "Runtime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntime_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, eu.artist.migration.deployment.azure.csdef.Runtime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntime_ExecutionContext(), this.getExecutionContext(), "executionContext", "limited", 0, 1, eu.artist.migration.deployment.azure.csdef.Runtime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeForRoleModuleEClass, RuntimeForRoleModule.class, "RuntimeForRoleModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceDefinitionEClass, ServiceDefinition.class, "ServiceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDefinition_LoadBalancerProbes(), this.getLoadBalancerProbes(), null, "loadBalancerProbes", null, 0, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDefinition_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefinition_WebRole(), this.getWebRole(), null, "webRole", null, 0, -1, ServiceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefinition_WorkerRole(), this.getWorkerRole(), null, "workerRole", null, 0, -1, ServiceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefinition_NetworkTrafficRules(), this.getNetworkTrafficRules(), null, "networkTrafficRules", null, 0, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDefinition_Name(), this.getNamedElementNameString(), "name", null, 1, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDefinition_SchemaVersion(), this.getSchemaVersion(), "schemaVersion", "unspecified", 0, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDefinition_TopologyChangeDiscovery(), this.getTopologyChangeDiscovery(), "topologyChangeDiscovery", "UpgradeDomainWalk", 0, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDefinition_UpgradeDomainCount(), this.getPositiveInt(), "upgradeDomainCount", "5", 0, 1, ServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSite_Bindings(), this.getBindings(), null, "bindings", null, 1, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sitesEClass, Sites.class, "Sites", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSites_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Sites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSites_Site(), this.getSite(), null, "site", null, 1, -1, Sites.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sourceDirectoryElementEClass, SourceDirectoryElement.class, "SourceDirectoryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceDirectoryElement_Path(), this.getNonEmptyString(), "path", null, 1, 1, SourceDirectoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startupEClass, Startup.class, "Startup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartup_Task(), this.getTask(), null, "task", null, 0, -1, Startup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartup_Priority(), theXMLTypePackage.getInt(), "priority", "0", 0, 1, Startup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CommandLine(), this.getNonEmptyString(), "commandLine", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ExecutionContext(), this.getExecutionContext(), "executionContext", "limited", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TaskType(), this.getTaskType(), "taskType", "simple", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_RoleInstanceValue(), this.getRoleInstanceValueElement(), null, "roleInstanceValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), this.getNonEmptyString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualApplicationEClass, VirtualApplication.class, "VirtualApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualDirectoryEClass, VirtualDirectory.class, "VirtualDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualDirectory_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VirtualDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualDirectory_VirtualDirectory(), this.getVirtualDirectory(), null, "virtualDirectory", null, 0, -1, VirtualDirectory.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualDirectory_VirtualApplication(), this.getVirtualDirectory(), null, "virtualApplication", null, 0, -1, VirtualDirectory.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualDirectory_Name(), this.getVirtualDirectoryName(), "name", null, 1, 1, VirtualDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualDirectory_PhysicalDirectory(), theXMLTypePackage.getString(), "physicalDirectory", null, 0, 1, VirtualDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webRoleEClass, WebRole.class, "WebRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebRole_Imports(), this.getImports(), null, "imports", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Startup(), this.getStartup(), null, "startup", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_LocalStorage(), this.getLocalStore(), null, "localStorage", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_LocalResources(), this.getLocalResources(), null, "localResources", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_ConfigurationSettings(), this.getConfigurationSettings(), null, "configurationSettings", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_InputEndpoints(), this.getInputEndpointsType(), null, "inputEndpoints", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_InternalEndpoint(), this.getInternalEndpointType(), null, "internalEndpoint", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Endpoints(), this.getEndpoints(), null, "endpoints", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Certificates(), this.getCertificates(), null, "certificates", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Sites(), this.getSites(), null, "sites", null, 1, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Runtime(), this.getWebRuntime(), null, "runtime", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebRole_Contents(), this.getContentsElement(), null, "contents", null, 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebRole_EnableNativeCodeExecution(), theXMLTypePackage.getBoolean(), "enableNativeCodeExecution", "true", 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebRole_Name(), this.getNamedElementNameString(), "name", null, 1, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebRole_Vmsize(), theXMLTypePackage.getString(), "vmsize", "Small", 0, 1, WebRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webRuntimeEClass, WebRuntime.class, "WebRuntime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebRuntime_EntryPoint(), this.getEntryPointElement(), null, "entryPoint", null, 0, 1, WebRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenSourceEClass, WhenSource.class, "WhenSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenSource_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, WhenSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhenSource_FromRole(), this.getFromRole(), null, "fromRole", null, 0, -1, WhenSource.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenSource_Matches(), this.getMatchMode(), "matches", null, 1, 1, WhenSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workerEntryPointElementEClass, WorkerEntryPointElement.class, "WorkerEntryPointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkerEntryPointElement_ProgramEntryPoint(), this.getProgramEntryPointElement(), null, "programEntryPoint", null, 0, 1, WorkerEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerEntryPointElement_NetFxEntryPoint(), this.getNetFxAssemblyEntryPointElement(), null, "netFxEntryPoint", null, 0, 1, WorkerEntryPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workerRoleEClass, WorkerRole.class, "WorkerRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkerRole_Imports(), this.getImports(), null, "imports", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_Startup(), this.getStartup(), null, "startup", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_LocalStorage(), this.getLocalStore(), null, "localStorage", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_LocalResources(), this.getLocalResources(), null, "localResources", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_ConfigurationSettings(), this.getConfigurationSettings(), null, "configurationSettings", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_Endpoints(), this.getEndpoints(), null, "endpoints", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_Certificates(), this.getCertificates(), null, "certificates", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_Runtime(), this.getWorkerRuntime(), null, "runtime", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkerRole_Contents(), this.getContentsElement(), null, "contents", null, 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkerRole_EnableNativeCodeExecution(), theXMLTypePackage.getBoolean(), "enableNativeCodeExecution", "true", 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkerRole_Name(), this.getNamedElementNameString(), "name", null, 1, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkerRole_Vmsize(), theXMLTypePackage.getString(), "vmsize", "Small", 0, 1, WorkerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workerRuntimeEClass, WorkerRuntime.class, "WorkerRuntime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkerRuntime_EntryPoint(), this.getWorkerEntryPointElement(), null, "entryPoint", null, 0, 1, WorkerRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(anyPortEEnum, AnyPort.class, "AnyPort");
		addEEnumLiteral(anyPortEEnum, AnyPort._);

		initEEnum(builtinStoreNameEEnum, BuiltinStoreName.class, "BuiltinStoreName");
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.MY);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.ROOT);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.CA);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.TRUST);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.DISALLOWED);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.TRUSTED_PEOPLE);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.TRUSTED_PUBLISHER);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.AUTH_ROOT);
		addEEnumLiteral(builtinStoreNameEEnum, BuiltinStoreName.ADDRESS_BOOK);

		initEEnum(distributionTypeEEnum, DistributionType.class, "DistributionType");
		addEEnumLiteral(distributionTypeEEnum, DistributionType.SOURCE_IP);
		addEEnumLiteral(distributionTypeEEnum, DistributionType.SOURCE_IP_PROTOCOL);
		addEEnumLiteral(distributionTypeEEnum, DistributionType.NONE);

		initEEnum(executionContextEEnum, ExecutionContext.class, "ExecutionContext");
		addEEnumLiteral(executionContextEEnum, ExecutionContext.LIMITED);
		addEEnumLiteral(executionContextEEnum, ExecutionContext.ELEVATED);

		initEEnum(internalProtocolEEnum, InternalProtocol.class, "InternalProtocol");
		addEEnumLiteral(internalProtocolEEnum, InternalProtocol.HTTP);
		addEEnumLiteral(internalProtocolEEnum, InternalProtocol.TCP);
		addEEnumLiteral(internalProtocolEEnum, InternalProtocol.UDP);
		addEEnumLiteral(internalProtocolEEnum, InternalProtocol.ANY);

		initEEnum(matchModeEEnum, MatchMode.class, "MatchMode");
		addEEnumLiteral(matchModeEEnum, MatchMode.ANY_RULE);

		initEEnum(permissionLevelEEnum, PermissionLevel.class, "PermissionLevel");
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.LIMITED_OR_ELEVATED);
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.ELEVATED);

		initEEnum(probeProtocolEEnum, ProbeProtocol.class, "ProbeProtocol");
		addEEnumLiteral(probeProtocolEEnum, ProbeProtocol.HTTP);
		addEEnumLiteral(probeProtocolEEnum, ProbeProtocol.TCP);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.HTTPS);
		addEEnumLiteral(protocolEEnum, Protocol.TCP);
		addEEnumLiteral(protocolEEnum, Protocol.UDP);

		initEEnum(schemaVersionEEnum, SchemaVersion.class, "SchemaVersion");
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion.UNSPECIFIED);
		addEEnumLiteral(schemaVersionEEnum, SchemaVersion._20140624);

		initEEnum(storeLocationEEnum, StoreLocation.class, "StoreLocation");
		addEEnumLiteral(storeLocationEEnum, StoreLocation.CURRENT_USER);
		addEEnumLiteral(storeLocationEEnum, StoreLocation.LOCAL_MACHINE);

		initEEnum(taskTypeEEnum, TaskType.class, "TaskType");
		addEEnumLiteral(taskTypeEEnum, TaskType.SIMPLE);
		addEEnumLiteral(taskTypeEEnum, TaskType.FOREGROUND);
		addEEnumLiteral(taskTypeEEnum, TaskType.BACKGROUND);

		initEEnum(topologyChangeDiscoveryEEnum, TopologyChangeDiscovery.class, "TopologyChangeDiscovery");
		addEEnumLiteral(topologyChangeDiscoveryEEnum, TopologyChangeDiscovery.UPGRADE_DOMAIN_WALK);
		addEEnumLiteral(topologyChangeDiscoveryEEnum, TopologyChangeDiscovery.BLAST);

		initEEnum(transportProtocolEEnum, TransportProtocol.class, "TransportProtocol");
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.UDP);
		addEEnumLiteral(transportProtocolEEnum, TransportProtocol.TCP);

		// Initialize data types
		initEDataType(anyPortObjectEDataType, AnyPort.class, "AnyPortObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(builtinStoreNameObjectEDataType, BuiltinStoreName.class, "BuiltinStoreNameObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(distributionTypeObjectEDataType, DistributionType.class, "DistributionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(executionContextObjectEDataType, ExecutionContext.class, "ExecutionContextObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(internalProtocolObjectEDataType, InternalProtocol.class, "InternalProtocolObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lbProbeIntervalEDataType, int.class, "LBProbeInterval", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lbProbeIntervalObjectEDataType, Integer.class, "LBProbeIntervalObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lbProbeTimeoutEDataType, int.class, "LBProbeTimeout", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lbProbeTimeoutObjectEDataType, Integer.class, "LBProbeTimeoutObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matchModeObjectEDataType, MatchMode.class, "MatchModeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(namedElementNameStringEDataType, String.class, "NamedElementNameString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonEmptyStringEDataType, String.class, "NonEmptyString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(permissionLevelObjectEDataType, PermissionLevel.class, "PermissionLevelObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portIntegerEDataType, int.class, "PortInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portIntegerObjectEDataType, Integer.class, "PortIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portSpecifierEDataType, Object.class, "PortSpecifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntEDataType, int.class, "PositiveInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntObjectEDataType, Integer.class, "PositiveIntObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(probeProtocolObjectEDataType, ProbeProtocol.class, "ProbeProtocolObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(protocolObjectEDataType, Protocol.class, "ProtocolObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(schemaVersionObjectEDataType, SchemaVersion.class, "SchemaVersionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(storeLocationObjectEDataType, StoreLocation.class, "StoreLocationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(storeNameEDataType, Object.class, "StoreName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskTypeObjectEDataType, TaskType.class, "TaskTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(topologyChangeDiscoveryObjectEDataType, TopologyChangeDiscovery.class, "TopologyChangeDiscoveryObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transportProtocolObjectEDataType, TransportProtocol.class, "TransportProtocolObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(virtualDirectoryNameEDataType, String.class, "VirtualDirectoryName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (allocatePublicPortFromElementEClass, 
		   source, 
		   new String[] {
			 "name", "AllocatePublicPortFromElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAllocatePublicPortFromElement_FixedPortRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FixedPortRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (allowAllTrafficEClass, 
		   source, 
		   new String[] {
			 "name", "AllowAllTraffic",
			 "kind", "empty"
		   });	
		addAnnotation
		  (anyPortEEnum, 
		   source, 
		   new String[] {
			 "name", "AnyPort"
		   });	
		addAnnotation
		  (anyPortObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "AnyPort:Object",
			 "baseType", "AnyPort"
		   });	
		addAnnotation
		  (bindingEClass, 
		   source, 
		   new String[] {
			 "name", "Binding",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBinding_EndpointName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endpointName"
		   });	
		addAnnotation
		  (getBinding_HostHeader(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hostHeader"
		   });	
		addAnnotation
		  (getBinding_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (bindingsEClass, 
		   source, 
		   new String[] {
			 "name", "Bindings",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBindings_Binding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Binding",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (builtinStoreNameEEnum, 
		   source, 
		   new String[] {
			 "name", "BuiltinStoreName"
		   });	
		addAnnotation
		  (builtinStoreNameObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "BuiltinStoreName:Object",
			 "baseType", "BuiltinStoreName"
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
		  (getCertificate_PermissionLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "permissionLevel"
		   });	
		addAnnotation
		  (getCertificate_StoreLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "storeLocation"
		   });	
		addAnnotation
		  (getCertificate_StoreName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "storeName"
		   });	
		addAnnotation
		  (certificatesEClass, 
		   source, 
		   new String[] {
			 "name", "Certificates",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCertificates_Certificate(), 
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
		  (configurationSettingsEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationSettings",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConfigurationSettings_Setting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Setting",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (contentElementEClass, 
		   source, 
		   new String[] {
			 "name", "ContentElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContentElement_SourceDirectory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceDirectory",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getContentElement_Destination(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "destination"
		   });	
		addAnnotation
		  (contentsElementEClass, 
		   source, 
		   new String[] {
			 "name", "ContentsElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getContentsElement_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Content",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (destinationsEClass, 
		   source, 
		   new String[] {
			 "name", "Destinations",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDestinations_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getDestinations_RoleEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RoleEndpoint",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (distributionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DistributionType"
		   });	
		addAnnotation
		  (distributionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DistributionType:Object",
			 "baseType", "DistributionType"
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
		  (getDocumentRoot_RoleModule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RoleModule",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ServiceDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceDefinition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (endpointsEClass, 
		   source, 
		   new String[] {
			 "name", "Endpoints",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEndpoints_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getEndpoints_InputEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InputEndpoint",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getEndpoints_InternalEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InternalEndpoint",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getEndpoints_InstanceInputEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InstanceInputEndpoint",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (entryPointElementEClass, 
		   source, 
		   new String[] {
			 "name", "EntryPointElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEntryPointElement_NetFxEntryPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetFxEntryPoint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (environmentEClass, 
		   source, 
		   new String[] {
			 "name", "Environment",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnvironment_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (executionContextEEnum, 
		   source, 
		   new String[] {
			 "name", "ExecutionContext"
		   });	
		addAnnotation
		  (executionContextObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ExecutionContext:Object",
			 "baseType", "ExecutionContext"
		   });	
		addAnnotation
		  (fromRoleEClass, 
		   source, 
		   new String[] {
			 "name", "FromRole",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getFromRole_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleName"
		   });	
		addAnnotation
		  (importEClass, 
		   source, 
		   new String[] {
			 "name", "Import",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getImport_ModuleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moduleName"
		   });	
		addAnnotation
		  (importsEClass, 
		   source, 
		   new String[] {
			 "name", "Imports",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getImports_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getImports_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Import",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (inputEndpointEClass, 
		   source, 
		   new String[] {
			 "name", "InputEndpoint",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getInputEndpoint_Certificate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "certificate"
		   });	
		addAnnotation
		  (getInputEndpoint_IdleTimeoutInMinutes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idleTimeoutInMinutes"
		   });	
		addAnnotation
		  (getInputEndpoint_IgnoreRoleInstanceStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ignoreRoleInstanceStatus"
		   });	
		addAnnotation
		  (getInputEndpoint_LoadBalancer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loadBalancer"
		   });	
		addAnnotation
		  (getInputEndpoint_LoadBalancerDistribution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loadBalancerDistribution"
		   });	
		addAnnotation
		  (getInputEndpoint_LoadBalancerProbe(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "loadBalancerProbe"
		   });	
		addAnnotation
		  (getInputEndpoint_LocalPort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "localPort"
		   });	
		addAnnotation
		  (getInputEndpoint_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getInputEndpoint_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });	
		addAnnotation
		  (getInputEndpoint_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protocol"
		   });	
		addAnnotation
		  (inputEndpointsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InputEndpoints_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInputEndpointsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getInputEndpointsType_InputEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InputEndpoint",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (inputEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InputEndpoint_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (instanceInputEndpointElementEClass, 
		   source, 
		   new String[] {
			 "name", "InstanceInputEndpointElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInstanceInputEndpointElement_AllocatePublicPortFrom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AllocatePublicPortFrom",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInstanceInputEndpointElement_IdleTimeoutInMinutes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idleTimeoutInMinutes"
		   });	
		addAnnotation
		  (getInstanceInputEndpointElement_LocalPort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "localPort"
		   });	
		addAnnotation
		  (getInstanceInputEndpointElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getInstanceInputEndpointElement_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protocol"
		   });	
		addAnnotation
		  (internalEndpointEClass, 
		   source, 
		   new String[] {
			 "name", "InternalEndpoint",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInternalEndpoint_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getInternalEndpoint_FixedPort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FixedPort",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getInternalEndpoint_FixedPortRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FixedPortRange",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getInternalEndpoint_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getInternalEndpoint_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });	
		addAnnotation
		  (getInternalEndpoint_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protocol"
		   });	
		addAnnotation
		  (internalEndpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InternalEndpoint_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (internalProtocolEEnum, 
		   source, 
		   new String[] {
			 "name", "InternalProtocol"
		   });	
		addAnnotation
		  (internalProtocolObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "InternalProtocol:Object",
			 "baseType", "InternalProtocol"
		   });	
		addAnnotation
		  (lbProbeIntervalEDataType, 
		   source, 
		   new String[] {
			 "name", "LBProbeInterval",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "5"
		   });	
		addAnnotation
		  (lbProbeIntervalObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LBProbeInterval:Object",
			 "baseType", "LBProbeInterval"
		   });	
		addAnnotation
		  (lbProbeTimeoutEDataType, 
		   source, 
		   new String[] {
			 "name", "LBProbeTimeout",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "11"
		   });	
		addAnnotation
		  (lbProbeTimeoutObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LBProbeTimeout:Object",
			 "baseType", "LBProbeTimeout"
		   });	
		addAnnotation
		  (loadBalancerProbeEClass, 
		   source, 
		   new String[] {
			 "name", "LoadBalancerProbe",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_IntervalInSeconds(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "intervalInSeconds"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protocol"
		   });	
		addAnnotation
		  (getLoadBalancerProbe_TimeoutInSeconds(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeoutInSeconds"
		   });	
		addAnnotation
		  (loadBalancerProbesEClass, 
		   source, 
		   new String[] {
			 "name", "LoadBalancerProbes",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLoadBalancerProbes_LoadBalancerProbe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoadBalancerProbe",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (localResourcesEClass, 
		   source, 
		   new String[] {
			 "name", "LocalResources",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLocalResources_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getLocalResources_LocalStorage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalStorage",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (localStoreEClass, 
		   source, 
		   new String[] {
			 "name", "LocalStore",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getLocalStore_CleanOnRoleRecycle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cleanOnRoleRecycle"
		   });	
		addAnnotation
		  (getLocalStore_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getLocalStore_SizeInMB(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sizeInMB"
		   });	
		addAnnotation
		  (matchModeEEnum, 
		   source, 
		   new String[] {
			 "name", "MatchMode"
		   });	
		addAnnotation
		  (matchModeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MatchMode:Object",
			 "baseType", "MatchMode"
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
		  (netFxAssemblyEntryPointElementEClass, 
		   source, 
		   new String[] {
			 "name", "NetFxAssemblyEntryPointElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getNetFxAssemblyEntryPointElement_AssemblyName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "assemblyName"
		   });	
		addAnnotation
		  (getNetFxAssemblyEntryPointElement_TargetFrameworkVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetFrameworkVersion"
		   });	
		addAnnotation
		  (networkTrafficRulesEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkTrafficRules",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNetworkTrafficRules_OnlyAllowTrafficTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OnlyAllowTrafficTo",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (nonEmptyStringEDataType, 
		   source, 
		   new String[] {
			 "name", "NonEmptyString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "256"
		   });	
		addAnnotation
		  (onlyAllowTrafficToEClass, 
		   source, 
		   new String[] {
			 "name", "OnlyAllowTrafficTo",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOnlyAllowTrafficTo_Destinations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Destinations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOnlyAllowTrafficTo_AllowAllTraffic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AllowAllTraffic",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOnlyAllowTrafficTo_WhenSource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WhenSource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (permissionLevelEEnum, 
		   source, 
		   new String[] {
			 "name", "PermissionLevel"
		   });	
		addAnnotation
		  (permissionLevelObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PermissionLevel:Object",
			 "baseType", "PermissionLevel"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "name", "Port",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPort_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port"
		   });	
		addAnnotation
		  (portIntegerEDataType, 
		   source, 
		   new String[] {
			 "name", "PortInteger",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1",
			 "maxInclusive", "65535"
		   });	
		addAnnotation
		  (portIntegerObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PortInteger:Object",
			 "baseType", "PortInteger"
		   });	
		addAnnotation
		  (portRangeEClass, 
		   source, 
		   new String[] {
			 "name", "PortRange",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPortRange_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max"
		   });	
		addAnnotation
		  (getPortRange_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min"
		   });	
		addAnnotation
		  (portSpecifierEDataType, 
		   source, 
		   new String[] {
			 "name", "PortSpecifier",
			 "memberTypes", "PortInteger AnyPort"
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
		  (probeProtocolEEnum, 
		   source, 
		   new String[] {
			 "name", "ProbeProtocol"
		   });	
		addAnnotation
		  (probeProtocolObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ProbeProtocol:Object",
			 "baseType", "ProbeProtocol"
		   });	
		addAnnotation
		  (programEntryPointElementEClass, 
		   source, 
		   new String[] {
			 "name", "ProgramEntryPointElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getProgramEntryPointElement_CommandLine(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commandLine"
		   });	
		addAnnotation
		  (getProgramEntryPointElement_SetReadyOnProcessStart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "setReadyOnProcessStart"
		   });	
		addAnnotation
		  (protocolEEnum, 
		   source, 
		   new String[] {
			 "name", "Protocol"
		   });	
		addAnnotation
		  (protocolObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Protocol:Object",
			 "baseType", "Protocol"
		   });	
		addAnnotation
		  (rdmaEndpointElementEClass, 
		   source, 
		   new String[] {
			 "name", "RdmaEndpointElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRdmaEndpointElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (roleEndpointEClass, 
		   source, 
		   new String[] {
			 "name", "RoleEndpoint",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRoleEndpoint_EndpointName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endpointName"
		   });	
		addAnnotation
		  (getRoleEndpoint_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleName"
		   });	
		addAnnotation
		  (roleInstanceValueElementEClass, 
		   source, 
		   new String[] {
			 "name", "RoleInstanceValueElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRoleInstanceValueElement_Xpath(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xpath"
		   });	
		addAnnotation
		  (roleModuleEClass, 
		   source, 
		   new String[] {
			 "name", "RoleModule",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRoleModule_Startup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Startup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_Runtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Runtime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_ConfigurationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConfigurationSettings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_Endpoints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endpoints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_LocalResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_Certificates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificates",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_Sites(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sites",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRoleModule_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });	
		addAnnotation
		  (runtimeEClass, 
		   source, 
		   new String[] {
			 "name", "Runtime",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRuntime_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Environment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRuntime_ExecutionContext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "executionContext"
		   });	
		addAnnotation
		  (runtimeForRoleModuleEClass, 
		   source, 
		   new String[] {
			 "name", "RuntimeForRoleModule",
			 "kind", "elementOnly"
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
		  (serviceDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceDefinition",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getServiceDefinition_LoadBalancerProbes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoadBalancerProbes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceDefinition_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getServiceDefinition_WebRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WebRole",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getServiceDefinition_WorkerRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WorkerRole",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });	
		addAnnotation
		  (getServiceDefinition_NetworkTrafficRules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkTrafficRules",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getServiceDefinition_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getServiceDefinition_SchemaVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schemaVersion"
		   });	
		addAnnotation
		  (getServiceDefinition_TopologyChangeDiscovery(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "topologyChangeDiscovery"
		   });	
		addAnnotation
		  (getServiceDefinition_UpgradeDomainCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "upgradeDomainCount"
		   });	
		addAnnotation
		  (siteEClass, 
		   source, 
		   new String[] {
			 "name", "Site",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSite_Bindings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bindings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (sitesEClass, 
		   source, 
		   new String[] {
			 "name", "Sites",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSites_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getSites_Site(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Site",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (sourceDirectoryElementEClass, 
		   source, 
		   new String[] {
			 "name", "SourceDirectoryElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSourceDirectoryElement_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });	
		addAnnotation
		  (startupEClass, 
		   source, 
		   new String[] {
			 "name", "Startup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStartup_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Task",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStartup_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority"
		   });	
		addAnnotation
		  (storeLocationEEnum, 
		   source, 
		   new String[] {
			 "name", "StoreLocation"
		   });	
		addAnnotation
		  (storeLocationObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "StoreLocation:Object",
			 "baseType", "StoreLocation"
		   });	
		addAnnotation
		  (storeNameEDataType, 
		   source, 
		   new String[] {
			 "name", "StoreName",
			 "memberTypes", "BuiltinStoreName NonEmptyString"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "name", "Task",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTask_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Environment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTask_CommandLine(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commandLine"
		   });	
		addAnnotation
		  (getTask_ExecutionContext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "executionContext"
		   });	
		addAnnotation
		  (getTask_TaskType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "taskType"
		   });	
		addAnnotation
		  (taskTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TaskType"
		   });	
		addAnnotation
		  (taskTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaskType:Object",
			 "baseType", "TaskType"
		   });	
		addAnnotation
		  (topologyChangeDiscoveryEEnum, 
		   source, 
		   new String[] {
			 "name", "TopologyChangeDiscovery"
		   });	
		addAnnotation
		  (topologyChangeDiscoveryObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TopologyChangeDiscovery:Object",
			 "baseType", "TopologyChangeDiscovery"
		   });	
		addAnnotation
		  (transportProtocolEEnum, 
		   source, 
		   new String[] {
			 "name", "TransportProtocol"
		   });	
		addAnnotation
		  (transportProtocolObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TransportProtocol:Object",
			 "baseType", "TransportProtocol"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "name", "Variable",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVariable_RoleInstanceValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RoleInstanceValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getVariable_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (virtualApplicationEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualApplication",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (virtualDirectoryEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualDirectory",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVirtualDirectory_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getVirtualDirectory_VirtualDirectory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VirtualDirectory",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getVirtualDirectory_VirtualApplication(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VirtualApplication",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getVirtualDirectory_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getVirtualDirectory_PhysicalDirectory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "physicalDirectory"
		   });	
		addAnnotation
		  (virtualDirectoryNameEDataType, 
		   source, 
		   new String[] {
			 "name", "VirtualDirectoryName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "^[a-zA-Z_][^\\\\/\\?;:@&=\\+\\$,\\|\"<>\\`\\\'\\^]*(?<![\\.\\s])$"
		   });	
		addAnnotation
		  (webRoleEClass, 
		   source, 
		   new String[] {
			 "name", "WebRole",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWebRole_Imports(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Imports",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Startup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Startup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_LocalStorage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalStorage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_LocalResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_ConfigurationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConfigurationSettings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_InputEndpoints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InputEndpoints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_InternalEndpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InternalEndpoint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Endpoints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endpoints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Certificates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificates",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Sites(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sites",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Runtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Runtime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_Contents(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contents",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWebRole_EnableNativeCodeExecution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enableNativeCodeExecution"
		   });	
		addAnnotation
		  (getWebRole_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getWebRole_Vmsize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vmsize"
		   });	
		addAnnotation
		  (webRuntimeEClass, 
		   source, 
		   new String[] {
			 "name", "WebRuntime",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWebRuntime_EntryPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EntryPoint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (whenSourceEClass, 
		   source, 
		   new String[] {
			 "name", "WhenSource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWhenSource_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getWhenSource_FromRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FromRole",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getWhenSource_Matches(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "matches"
		   });	
		addAnnotation
		  (workerEntryPointElementEClass, 
		   source, 
		   new String[] {
			 "name", "WorkerEntryPointElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWorkerEntryPointElement_ProgramEntryPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProgramEntryPoint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerEntryPointElement_NetFxEntryPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetFxEntryPoint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (workerRoleEClass, 
		   source, 
		   new String[] {
			 "name", "WorkerRole",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWorkerRole_Imports(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Imports",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_Startup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Startup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_LocalStorage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalStorage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_LocalResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LocalResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_ConfigurationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConfigurationSettings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_Endpoints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endpoints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_Certificates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificates",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_Runtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Runtime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_Contents(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contents",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWorkerRole_EnableNativeCodeExecution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enableNativeCodeExecution"
		   });	
		addAnnotation
		  (getWorkerRole_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getWorkerRole_Vmsize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vmsize"
		   });	
		addAnnotation
		  (workerRuntimeEClass, 
		   source, 
		   new String[] {
			 "name", "WorkerRuntime",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWorkerRuntime_EntryPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EntryPoint",
			 "namespace", "##targetNamespace"
		   });
	}

} //AzureCSDefPackageImpl

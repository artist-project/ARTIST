/**
 */
package deployment_provider.impl;

import deployment_app.Deployment_appPackage;

import deployment_app.impl.Deployment_appPackageImpl;

import deployment_provider.ApplicationDeploymentDescriptor;
import deployment_provider.ApplicationFramework;
import deployment_provider.ApplicationFrameworkType;
import deployment_provider.ApplicationLanguageFramework;
import deployment_provider.ApplicationTopology;
import deployment_provider.AuthenticationAccount;
import deployment_provider.AuthenticationToken;
import deployment_provider.CloudDeploymentService;
import deployment_provider.CloudHardwareService;
import deployment_provider.CloudInfrastructureOffering;
import deployment_provider.CloudInfrastructurePhysicalInstance;
import deployment_provider.CloudInfrastructureVirtualCluster;
import deployment_provider.CloudInfrastructureVirtualInstance;
import deployment_provider.CloudOffering;
import deployment_provider.CloudPlatformOffering;
import deployment_provider.CloudProvider;
import deployment_provider.CloudService;
import deployment_provider.CloudServiceClient;
import deployment_provider.CloudSoftwareService;
import deployment_provider.DeploymentDescriptor;
import deployment_provider.DeploymentRecipe;
import deployment_provider.DeploymentTemplate;
import deployment_provider.Deployment_providerFactory;
import deployment_provider.Deployment_providerPackage;
import deployment_provider.DescriptorEntry;
import deployment_provider.EnvironmentDescriptor;
import deployment_provider.Framework;
import deployment_provider.InfrastructureDeploymentDescriptor;
import deployment_provider.LanguageFrameworkType;
import deployment_provider.ServiceConfigurationDescriptor;
import deployment_provider.ServiceInterface;
import deployment_provider.Stack;
import deployment_provider.VirtualInstanceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Deployment_providerPackageImpl extends EPackageImpl implements Deployment_providerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudDeploymentServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDeploymentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureDeploymentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudOfferingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudInfrastructureOfferingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudPlatformOfferingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudHardwareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudSoftwareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudInfrastructurePhysicalInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudInfrastructureVirtualInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudInfrastructureVirtualClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentRecipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudServiceClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLanguageFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConfigurationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceInterfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationTopologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum virtualInstanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationFrameworkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageFrameworkTypeEEnum = null;

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
	 * @see deployment_provider.Deployment_providerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Deployment_providerPackageImpl() {
		super(eNS_URI, Deployment_providerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Deployment_providerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Deployment_providerPackage init() {
		if (isInited) return (Deployment_providerPackage)EPackage.Registry.INSTANCE.getEPackage(Deployment_providerPackage.eNS_URI);

		// Obtain or create and register package
		Deployment_providerPackageImpl theDeployment_providerPackage = (Deployment_providerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Deployment_providerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Deployment_providerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Deployment_appPackageImpl theDeployment_appPackage = (Deployment_appPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Deployment_appPackage.eNS_URI) instanceof Deployment_appPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Deployment_appPackage.eNS_URI) : Deployment_appPackage.eINSTANCE);

		// Create package meta-data objects
		theDeployment_providerPackage.createPackageContents();
		theDeployment_appPackage.createPackageContents();

		// Initialize created meta-data
		theDeployment_providerPackage.initializePackageContents();
		theDeployment_appPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeployment_providerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Deployment_providerPackage.eNS_URI, theDeployment_providerPackage);
		return theDeployment_providerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudProvider_Offerings() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudProvider_Name() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudService() {
		return cloudServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudService_Name() {
		return (EAttribute)cloudServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudService_ConfiguredBy() {
		return (EReference)cloudServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudService_SupportedClients() {
		return (EReference)cloudServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudDeploymentService() {
		return cloudDeploymentServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudDeploymentService_UsesAccount() {
		return (EReference)cloudDeploymentServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudDeploymentService_RequiredServices() {
		return (EReference)cloudDeploymentServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentDescriptor() {
		return deploymentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentDescriptor_ReliesOnRecipe() {
		return (EReference)deploymentDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentDescriptor_ReliesOnTemplate() {
		return (EReference)deploymentDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDeploymentDescriptor() {
		return applicationDeploymentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDeploymentDescriptor_Topology() {
		return (EAttribute)applicationDeploymentDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureDeploymentDescriptor() {
		return infrastructureDeploymentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureDeploymentDescriptor_Clusters() {
		return (EReference)infrastructureDeploymentDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudOffering() {
		return cloudOfferingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudOffering_OfferedServices() {
		return (EReference)cloudOfferingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudOffering_OfferedFrameworks() {
		return (EReference)cloudOfferingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudOffering_Name() {
		return (EAttribute)cloudOfferingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudInfrastructureOffering() {
		return cloudInfrastructureOfferingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudInfrastructureOffering_ComprisedInstances() {
		return (EReference)cloudInfrastructureOfferingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudPlatformOffering() {
		return cloudPlatformOfferingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudPlatformOffering_SupportedLanguages() {
		return (EAttribute)cloudPlatformOfferingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentDescriptor() {
		return environmentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationToken() {
		return authenticationTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationToken_User() {
		return (EAttribute)authenticationTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationToken_Password() {
		return (EAttribute)authenticationTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudHardwareService() {
		return cloudHardwareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudSoftwareService() {
		return cloudSoftwareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudInfrastructurePhysicalInstance() {
		return cloudInfrastructurePhysicalInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudInfrastructurePhysicalInstance_RunVMs() {
		return (EReference)cloudInfrastructurePhysicalInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudInfrastructureVirtualInstance() {
		return cloudInfrastructureVirtualInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudInfrastructureVirtualInstance_Type() {
		return (EAttribute)cloudInfrastructureVirtualInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_Layers() {
		return (EReference)stackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudInfrastructureVirtualCluster() {
		return cloudInfrastructureVirtualClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudInfrastructureVirtualCluster_Manages() {
		return (EReference)cloudInfrastructureVirtualClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationFramework() {
		return applicationFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationFramework_Type() {
		return (EAttribute)applicationFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationAccount() {
		return authenticationAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationAccount_Uses() {
		return (EReference)authenticationAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentRecipe() {
		return deploymentRecipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTemplate() {
		return deploymentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorEntry() {
		return descriptorEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorEntry_Key() {
		return (EAttribute)descriptorEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorEntry_Value() {
		return (EAttribute)descriptorEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorEntry_Optional() {
		return (EAttribute)descriptorEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorEntry_Ref() {
		return (EAttribute)descriptorEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptorEntry_Parent() {
		return (EReference)descriptorEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudServiceClient() {
		return cloudServiceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudServiceClient_SupportedInterfaces() {
		return (EAttribute)cloudServiceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudServiceClient_Name() {
		return (EAttribute)cloudServiceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudServiceClient_SupportedLanguages() {
		return (EAttribute)cloudServiceClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationLanguageFramework() {
		return applicationLanguageFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationLanguageFramework_Type() {
		return (EAttribute)applicationLanguageFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFramework() {
		return frameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFramework_Name() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFramework_Version() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConfigurationDescriptor() {
		return serviceConfigurationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Entries() {
		return (EReference)descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Name() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Optional() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceInterface() {
		return serviceInterfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationTopology() {
		return applicationTopologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualInstanceType() {
		return virtualInstanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationFrameworkType() {
		return applicationFrameworkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageFrameworkType() {
		return languageFrameworkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_providerFactory getDeployment_providerFactory() {
		return (Deployment_providerFactory)getEFactoryInstance();
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
		cloudProviderEClass = createEClass(CLOUD_PROVIDER);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__OFFERINGS);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__NAME);

		cloudServiceEClass = createEClass(CLOUD_SERVICE);
		createEAttribute(cloudServiceEClass, CLOUD_SERVICE__NAME);
		createEReference(cloudServiceEClass, CLOUD_SERVICE__CONFIGURED_BY);
		createEReference(cloudServiceEClass, CLOUD_SERVICE__SUPPORTED_CLIENTS);

		cloudDeploymentServiceEClass = createEClass(CLOUD_DEPLOYMENT_SERVICE);
		createEReference(cloudDeploymentServiceEClass, CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT);
		createEReference(cloudDeploymentServiceEClass, CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES);

		deploymentDescriptorEClass = createEClass(DEPLOYMENT_DESCRIPTOR);
		createEReference(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE);
		createEReference(deploymentDescriptorEClass, DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE);

		applicationDeploymentDescriptorEClass = createEClass(APPLICATION_DEPLOYMENT_DESCRIPTOR);
		createEAttribute(applicationDeploymentDescriptorEClass, APPLICATION_DEPLOYMENT_DESCRIPTOR__TOPOLOGY);

		infrastructureDeploymentDescriptorEClass = createEClass(INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR);
		createEReference(infrastructureDeploymentDescriptorEClass, INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR__CLUSTERS);

		cloudOfferingEClass = createEClass(CLOUD_OFFERING);
		createEReference(cloudOfferingEClass, CLOUD_OFFERING__OFFERED_SERVICES);
		createEReference(cloudOfferingEClass, CLOUD_OFFERING__OFFERED_FRAMEWORKS);
		createEAttribute(cloudOfferingEClass, CLOUD_OFFERING__NAME);

		cloudInfrastructureOfferingEClass = createEClass(CLOUD_INFRASTRUCTURE_OFFERING);
		createEReference(cloudInfrastructureOfferingEClass, CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES);

		cloudPlatformOfferingEClass = createEClass(CLOUD_PLATFORM_OFFERING);
		createEAttribute(cloudPlatformOfferingEClass, CLOUD_PLATFORM_OFFERING__SUPPORTED_LANGUAGES);

		environmentDescriptorEClass = createEClass(ENVIRONMENT_DESCRIPTOR);

		authenticationTokenEClass = createEClass(AUTHENTICATION_TOKEN);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__USER);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__PASSWORD);

		cloudHardwareServiceEClass = createEClass(CLOUD_HARDWARE_SERVICE);

		cloudSoftwareServiceEClass = createEClass(CLOUD_SOFTWARE_SERVICE);

		cloudInfrastructurePhysicalInstanceEClass = createEClass(CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE);
		createEReference(cloudInfrastructurePhysicalInstanceEClass, CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS);

		cloudInfrastructureVirtualInstanceEClass = createEClass(CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE);
		createEAttribute(cloudInfrastructureVirtualInstanceEClass, CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE__TYPE);

		stackEClass = createEClass(STACK);
		createEReference(stackEClass, STACK__LAYERS);

		cloudInfrastructureVirtualClusterEClass = createEClass(CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER);
		createEReference(cloudInfrastructureVirtualClusterEClass, CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES);

		applicationFrameworkEClass = createEClass(APPLICATION_FRAMEWORK);
		createEAttribute(applicationFrameworkEClass, APPLICATION_FRAMEWORK__TYPE);

		authenticationAccountEClass = createEClass(AUTHENTICATION_ACCOUNT);
		createEReference(authenticationAccountEClass, AUTHENTICATION_ACCOUNT__USES);

		deploymentRecipeEClass = createEClass(DEPLOYMENT_RECIPE);

		deploymentTemplateEClass = createEClass(DEPLOYMENT_TEMPLATE);

		descriptorEntryEClass = createEClass(DESCRIPTOR_ENTRY);
		createEAttribute(descriptorEntryEClass, DESCRIPTOR_ENTRY__KEY);
		createEAttribute(descriptorEntryEClass, DESCRIPTOR_ENTRY__VALUE);
		createEAttribute(descriptorEntryEClass, DESCRIPTOR_ENTRY__OPTIONAL);
		createEAttribute(descriptorEntryEClass, DESCRIPTOR_ENTRY__REF);
		createEReference(descriptorEntryEClass, DESCRIPTOR_ENTRY__PARENT);

		cloudServiceClientEClass = createEClass(CLOUD_SERVICE_CLIENT);
		createEAttribute(cloudServiceClientEClass, CLOUD_SERVICE_CLIENT__SUPPORTED_INTERFACES);
		createEAttribute(cloudServiceClientEClass, CLOUD_SERVICE_CLIENT__NAME);
		createEAttribute(cloudServiceClientEClass, CLOUD_SERVICE_CLIENT__SUPPORTED_LANGUAGES);

		applicationLanguageFrameworkEClass = createEClass(APPLICATION_LANGUAGE_FRAMEWORK);
		createEAttribute(applicationLanguageFrameworkEClass, APPLICATION_LANGUAGE_FRAMEWORK__TYPE);

		frameworkEClass = createEClass(FRAMEWORK);
		createEAttribute(frameworkEClass, FRAMEWORK__NAME);
		createEAttribute(frameworkEClass, FRAMEWORK__VERSION);

		serviceConfigurationDescriptorEClass = createEClass(SERVICE_CONFIGURATION_DESCRIPTOR);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEReference(descriptorEClass, DESCRIPTOR__ENTRIES);
		createEAttribute(descriptorEClass, DESCRIPTOR__NAME);
		createEAttribute(descriptorEClass, DESCRIPTOR__OPTIONAL);

		// Create enums
		serviceInterfaceEEnum = createEEnum(SERVICE_INTERFACE);
		applicationTopologyEEnum = createEEnum(APPLICATION_TOPOLOGY);
		virtualInstanceTypeEEnum = createEEnum(VIRTUAL_INSTANCE_TYPE);
		applicationFrameworkTypeEEnum = createEEnum(APPLICATION_FRAMEWORK_TYPE);
		languageFrameworkTypeEEnum = createEEnum(LANGUAGE_FRAMEWORK_TYPE);
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
		Deployment_appPackage theDeployment_appPackage = (Deployment_appPackage)EPackage.Registry.INSTANCE.getEPackage(Deployment_appPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloudDeploymentServiceEClass.getESuperTypes().add(this.getCloudSoftwareService());
		deploymentDescriptorEClass.getESuperTypes().add(this.getServiceConfigurationDescriptor());
		applicationDeploymentDescriptorEClass.getESuperTypes().add(this.getDeploymentDescriptor());
		infrastructureDeploymentDescriptorEClass.getESuperTypes().add(this.getDeploymentDescriptor());
		cloudInfrastructureOfferingEClass.getESuperTypes().add(this.getCloudOffering());
		cloudPlatformOfferingEClass.getESuperTypes().add(this.getCloudOffering());
		environmentDescriptorEClass.getESuperTypes().add(this.getServiceConfigurationDescriptor());
		cloudHardwareServiceEClass.getESuperTypes().add(this.getCloudService());
		cloudSoftwareServiceEClass.getESuperTypes().add(this.getCloudService());
		applicationFrameworkEClass.getESuperTypes().add(this.getFramework());
		deploymentTemplateEClass.getESuperTypes().add(this.getDeploymentDescriptor());
		applicationLanguageFrameworkEClass.getESuperTypes().add(this.getFramework());
		serviceConfigurationDescriptorEClass.getESuperTypes().add(this.getDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudProvider_Offerings(), this.getCloudOffering(), null, "offerings", null, 1, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudServiceEClass, CloudService.class, "CloudService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudService_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudService_ConfiguredBy(), this.getServiceConfigurationDescriptor(), null, "configuredBy", null, 0, -1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudService_SupportedClients(), this.getCloudServiceClient(), null, "supportedClients", null, 0, -1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudDeploymentServiceEClass, CloudDeploymentService.class, "CloudDeploymentService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudDeploymentService_UsesAccount(), this.getAuthenticationAccount(), null, "usesAccount", null, 0, 1, CloudDeploymentService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudDeploymentService_RequiredServices(), this.getCloudService(), null, "requiredServices", null, 0, -1, CloudDeploymentService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentDescriptorEClass, DeploymentDescriptor.class, "DeploymentDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentDescriptor_ReliesOnRecipe(), this.getDeploymentRecipe(), null, "reliesOnRecipe", null, 0, -1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentDescriptor_ReliesOnTemplate(), this.getDeploymentTemplate(), null, "reliesOnTemplate", null, 0, -1, DeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationDeploymentDescriptorEClass, ApplicationDeploymentDescriptor.class, "ApplicationDeploymentDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationDeploymentDescriptor_Topology(), this.getApplicationTopology(), "topology", null, 1, 1, ApplicationDeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureDeploymentDescriptorEClass, InfrastructureDeploymentDescriptor.class, "InfrastructureDeploymentDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureDeploymentDescriptor_Clusters(), this.getCloudInfrastructureVirtualCluster(), null, "clusters", null, 0, -1, InfrastructureDeploymentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudOfferingEClass, CloudOffering.class, "CloudOffering", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudOffering_OfferedServices(), this.getCloudService(), null, "offeredServices", null, 1, -1, CloudOffering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudOffering_OfferedFrameworks(), this.getFramework(), null, "offeredFrameworks", null, 0, -1, CloudOffering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudOffering_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudOffering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudInfrastructureOfferingEClass, CloudInfrastructureOffering.class, "CloudInfrastructureOffering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudInfrastructureOffering_ComprisedInstances(), this.getCloudInfrastructurePhysicalInstance(), null, "comprisedInstances", null, 1, -1, CloudInfrastructureOffering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudPlatformOfferingEClass, CloudPlatformOffering.class, "CloudPlatformOffering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudPlatformOffering_SupportedLanguages(), theDeployment_appPackage.getProgrammingLanguage(), "supportedLanguages", null, 1, -1, CloudPlatformOffering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentDescriptorEClass, EnvironmentDescriptor.class, "EnvironmentDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationTokenEClass, AuthenticationToken.class, "AuthenticationToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationToken_User(), ecorePackage.getEString(), "user", null, 0, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationToken_Password(), ecorePackage.getEString(), "password", null, 0, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudHardwareServiceEClass, CloudHardwareService.class, "CloudHardwareService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudSoftwareServiceEClass, CloudSoftwareService.class, "CloudSoftwareService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudInfrastructurePhysicalInstanceEClass, CloudInfrastructurePhysicalInstance.class, "CloudInfrastructurePhysicalInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudInfrastructurePhysicalInstance_RunVMs(), this.getCloudInfrastructureVirtualInstance(), null, "runVMs", null, 0, -1, CloudInfrastructurePhysicalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudInfrastructureVirtualInstanceEClass, CloudInfrastructureVirtualInstance.class, "CloudInfrastructureVirtualInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudInfrastructureVirtualInstance_Type(), this.getVirtualInstanceType(), "type", null, 0, 1, CloudInfrastructureVirtualInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStack_Layers(), this.getCloudInfrastructureVirtualCluster(), null, "layers", null, 0, -1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudInfrastructureVirtualClusterEClass, CloudInfrastructureVirtualCluster.class, "CloudInfrastructureVirtualCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudInfrastructureVirtualCluster_Manages(), this.getCloudInfrastructureVirtualInstance(), null, "manages", null, 1, -1, CloudInfrastructureVirtualCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationFrameworkEClass, ApplicationFramework.class, "ApplicationFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationFramework_Type(), this.getApplicationFrameworkType(), "type", null, 1, 1, ApplicationFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationAccountEClass, AuthenticationAccount.class, "AuthenticationAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthenticationAccount_Uses(), this.getAuthenticationToken(), null, "uses", null, 0, 1, AuthenticationAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentRecipeEClass, DeploymentRecipe.class, "DeploymentRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentTemplateEClass, DeploymentTemplate.class, "DeploymentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptorEntryEClass, DescriptorEntry.class, "DescriptorEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptorEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, DescriptorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, DescriptorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorEntry_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, DescriptorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorEntry_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, DescriptorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptorEntry_Parent(), this.getDescriptorEntry(), null, "parent", null, 0, 1, DescriptorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudServiceClientEClass, CloudServiceClient.class, "CloudServiceClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudServiceClient_SupportedInterfaces(), this.getServiceInterface(), "supportedInterfaces", null, 1, -1, CloudServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudServiceClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudServiceClient_SupportedLanguages(), theDeployment_appPackage.getProgrammingLanguage(), "supportedLanguages", null, 0, -1, CloudServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationLanguageFrameworkEClass, ApplicationLanguageFramework.class, "ApplicationLanguageFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationLanguageFramework_Type(), this.getLanguageFrameworkType(), "type", null, 0, 1, ApplicationLanguageFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameworkEClass, Framework.class, "Framework", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFramework_Name(), ecorePackage.getEString(), "name", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFramework_Version(), ecorePackage.getEString(), "version", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigurationDescriptorEClass, ServiceConfigurationDescriptor.class, "ServiceConfigurationDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptorEClass, deployment_provider.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptor_Entries(), this.getDescriptorEntry(), null, "entries", null, 0, -1, deployment_provider.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, deployment_provider.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, deployment_provider.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceInterfaceEEnum, ServiceInterface.class, "ServiceInterface");
		addEEnumLiteral(serviceInterfaceEEnum, ServiceInterface.CLI);
		addEEnumLiteral(serviceInterfaceEEnum, ServiceInterface.IDE);
		addEEnumLiteral(serviceInterfaceEEnum, ServiceInterface.WEB);
		addEEnumLiteral(serviceInterfaceEEnum, ServiceInterface.API);
		addEEnumLiteral(serviceInterfaceEEnum, ServiceInterface.FTP);

		initEEnum(applicationTopologyEEnum, ApplicationTopology.class, "ApplicationTopology");
		addEEnumLiteral(applicationTopologyEEnum, ApplicationTopology.SINGLE_INSTANCE);
		addEEnumLiteral(applicationTopologyEEnum, ApplicationTopology.LOAD_BALANCED);
		addEEnumLiteral(applicationTopologyEEnum, ApplicationTopology.MULTIPLE_INSTANCES);

		initEEnum(virtualInstanceTypeEEnum, VirtualInstanceType.class, "VirtualInstanceType");
		addEEnumLiteral(virtualInstanceTypeEEnum, VirtualInstanceType.COMPUTED_OPTIMIZED);
		addEEnumLiteral(virtualInstanceTypeEEnum, VirtualInstanceType.MEMORY_OPTIMIZED);
		addEEnumLiteral(virtualInstanceTypeEEnum, VirtualInstanceType.GENERAL_PURPOSE);
		addEEnumLiteral(virtualInstanceTypeEEnum, VirtualInstanceType.STORAGE_OPTIMIZED);

		initEEnum(applicationFrameworkTypeEEnum, ApplicationFrameworkType.class, "ApplicationFrameworkType");
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.SPRING);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.RAILS);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.SINATRA);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.PLAY);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.LIFT);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.DJANGO);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.STRUTS);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.WORD_PRESS);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.UMBRACO);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.DOT_NET_NUKE);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.DRUPAL);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.CAKE_PHP);
		addEEnumLiteral(applicationFrameworkTypeEEnum, ApplicationFrameworkType.EXPRESS);

		initEEnum(languageFrameworkTypeEEnum, LanguageFrameworkType.class, "LanguageFrameworkType");
		addEEnumLiteral(languageFrameworkTypeEEnum, LanguageFrameworkType.JAVA_SE);
		addEEnumLiteral(languageFrameworkTypeEEnum, LanguageFrameworkType.JAVA_EE);
		addEEnumLiteral(languageFrameworkTypeEEnum, LanguageFrameworkType.CSHARP);
		addEEnumLiteral(languageFrameworkTypeEEnum, LanguageFrameworkType.JAVA_SCRIPT);
		addEEnumLiteral(languageFrameworkTypeEEnum, LanguageFrameworkType.ASPNET);

		// Create resource
		createResource(eNS_URI);
	}

} //Deployment_providerPackageImpl

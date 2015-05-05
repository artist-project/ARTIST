/**
 */
package deployment_provider.impl;

import deployment_provider.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Deployment_providerFactoryImpl extends EFactoryImpl implements Deployment_providerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Deployment_providerFactory init() {
		try {
			Deployment_providerFactory theDeployment_providerFactory = (Deployment_providerFactory)EPackage.Registry.INSTANCE.getEFactory(Deployment_providerPackage.eNS_URI);
			if (theDeployment_providerFactory != null) {
				return theDeployment_providerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Deployment_providerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_providerFactoryImpl() {
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
			case Deployment_providerPackage.CLOUD_PROVIDER: return createCloudProvider();
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE: return createCloudDeploymentService();
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR: return createDeploymentDescriptor();
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR: return createApplicationDeploymentDescriptor();
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR: return createInfrastructureDeploymentDescriptor();
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING: return createCloudInfrastructureOffering();
			case Deployment_providerPackage.CLOUD_PLATFORM_OFFERING: return createCloudPlatformOffering();
			case Deployment_providerPackage.ENVIRONMENT_DESCRIPTOR: return createEnvironmentDescriptor();
			case Deployment_providerPackage.AUTHENTICATION_TOKEN: return createAuthenticationToken();
			case Deployment_providerPackage.CLOUD_HARDWARE_SERVICE: return createCloudHardwareService();
			case Deployment_providerPackage.CLOUD_SOFTWARE_SERVICE: return createCloudSoftwareService();
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE: return createCloudInfrastructurePhysicalInstance();
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE: return createCloudInfrastructureVirtualInstance();
			case Deployment_providerPackage.STACK: return createStack();
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER: return createCloudInfrastructureVirtualCluster();
			case Deployment_providerPackage.APPLICATION_FRAMEWORK: return createApplicationFramework();
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT: return createAuthenticationAccount();
			case Deployment_providerPackage.DEPLOYMENT_RECIPE: return createDeploymentRecipe();
			case Deployment_providerPackage.DEPLOYMENT_TEMPLATE: return createDeploymentTemplate();
			case Deployment_providerPackage.DESCRIPTOR_ENTRY: return createDescriptorEntry();
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT: return createCloudServiceClient();
			case Deployment_providerPackage.APPLICATION_LANGUAGE_FRAMEWORK: return createApplicationLanguageFramework();
			case Deployment_providerPackage.SERVICE_CONFIGURATION_DESCRIPTOR: return createServiceConfigurationDescriptor();
			case Deployment_providerPackage.DESCRIPTOR: return createDescriptor();
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
			case Deployment_providerPackage.SERVICE_INTERFACE:
				return createServiceInterfaceFromString(eDataType, initialValue);
			case Deployment_providerPackage.APPLICATION_TOPOLOGY:
				return createApplicationTopologyFromString(eDataType, initialValue);
			case Deployment_providerPackage.VIRTUAL_INSTANCE_TYPE:
				return createVirtualInstanceTypeFromString(eDataType, initialValue);
			case Deployment_providerPackage.APPLICATION_FRAMEWORK_TYPE:
				return createApplicationFrameworkTypeFromString(eDataType, initialValue);
			case Deployment_providerPackage.LANGUAGE_FRAMEWORK_TYPE:
				return createLanguageFrameworkTypeFromString(eDataType, initialValue);
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
			case Deployment_providerPackage.SERVICE_INTERFACE:
				return convertServiceInterfaceToString(eDataType, instanceValue);
			case Deployment_providerPackage.APPLICATION_TOPOLOGY:
				return convertApplicationTopologyToString(eDataType, instanceValue);
			case Deployment_providerPackage.VIRTUAL_INSTANCE_TYPE:
				return convertVirtualInstanceTypeToString(eDataType, instanceValue);
			case Deployment_providerPackage.APPLICATION_FRAMEWORK_TYPE:
				return convertApplicationFrameworkTypeToString(eDataType, instanceValue);
			case Deployment_providerPackage.LANGUAGE_FRAMEWORK_TYPE:
				return convertLanguageFrameworkTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudDeploymentService createCloudDeploymentService() {
		CloudDeploymentServiceImpl cloudDeploymentService = new CloudDeploymentServiceImpl();
		return cloudDeploymentService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDescriptor createDeploymentDescriptor() {
		DeploymentDescriptorImpl deploymentDescriptor = new DeploymentDescriptorImpl();
		return deploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDeploymentDescriptor createApplicationDeploymentDescriptor() {
		ApplicationDeploymentDescriptorImpl applicationDeploymentDescriptor = new ApplicationDeploymentDescriptorImpl();
		return applicationDeploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureDeploymentDescriptor createInfrastructureDeploymentDescriptor() {
		InfrastructureDeploymentDescriptorImpl infrastructureDeploymentDescriptor = new InfrastructureDeploymentDescriptorImpl();
		return infrastructureDeploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudInfrastructureOffering createCloudInfrastructureOffering() {
		CloudInfrastructureOfferingImpl cloudInfrastructureOffering = new CloudInfrastructureOfferingImpl();
		return cloudInfrastructureOffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPlatformOffering createCloudPlatformOffering() {
		CloudPlatformOfferingImpl cloudPlatformOffering = new CloudPlatformOfferingImpl();
		return cloudPlatformOffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentDescriptor createEnvironmentDescriptor() {
		EnvironmentDescriptorImpl environmentDescriptor = new EnvironmentDescriptorImpl();
		return environmentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationToken createAuthenticationToken() {
		AuthenticationTokenImpl authenticationToken = new AuthenticationTokenImpl();
		return authenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudHardwareService createCloudHardwareService() {
		CloudHardwareServiceImpl cloudHardwareService = new CloudHardwareServiceImpl();
		return cloudHardwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSoftwareService createCloudSoftwareService() {
		CloudSoftwareServiceImpl cloudSoftwareService = new CloudSoftwareServiceImpl();
		return cloudSoftwareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudInfrastructurePhysicalInstance createCloudInfrastructurePhysicalInstance() {
		CloudInfrastructurePhysicalInstanceImpl cloudInfrastructurePhysicalInstance = new CloudInfrastructurePhysicalInstanceImpl();
		return cloudInfrastructurePhysicalInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudInfrastructureVirtualInstance createCloudInfrastructureVirtualInstance() {
		CloudInfrastructureVirtualInstanceImpl cloudInfrastructureVirtualInstance = new CloudInfrastructureVirtualInstanceImpl();
		return cloudInfrastructureVirtualInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStack() {
		StackImpl stack = new StackImpl();
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudInfrastructureVirtualCluster createCloudInfrastructureVirtualCluster() {
		CloudInfrastructureVirtualClusterImpl cloudInfrastructureVirtualCluster = new CloudInfrastructureVirtualClusterImpl();
		return cloudInfrastructureVirtualCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFramework createApplicationFramework() {
		ApplicationFrameworkImpl applicationFramework = new ApplicationFrameworkImpl();
		return applicationFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationAccount createAuthenticationAccount() {
		AuthenticationAccountImpl authenticationAccount = new AuthenticationAccountImpl();
		return authenticationAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentRecipe createDeploymentRecipe() {
		DeploymentRecipeImpl deploymentRecipe = new DeploymentRecipeImpl();
		return deploymentRecipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTemplate createDeploymentTemplate() {
		DeploymentTemplateImpl deploymentTemplate = new DeploymentTemplateImpl();
		return deploymentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorEntry createDescriptorEntry() {
		DescriptorEntryImpl descriptorEntry = new DescriptorEntryImpl();
		return descriptorEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudServiceClient createCloudServiceClient() {
		CloudServiceClientImpl cloudServiceClient = new CloudServiceClientImpl();
		return cloudServiceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLanguageFramework createApplicationLanguageFramework() {
		ApplicationLanguageFrameworkImpl applicationLanguageFramework = new ApplicationLanguageFrameworkImpl();
		return applicationLanguageFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfigurationDescriptor createServiceConfigurationDescriptor() {
		ServiceConfigurationDescriptorImpl serviceConfigurationDescriptor = new ServiceConfigurationDescriptorImpl();
		return serviceConfigurationDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterfaceFromString(EDataType eDataType, String initialValue) {
		ServiceInterface result = ServiceInterface.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceInterfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTopology createApplicationTopologyFromString(EDataType eDataType, String initialValue) {
		ApplicationTopology result = ApplicationTopology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTopologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualInstanceType createVirtualInstanceTypeFromString(EDataType eDataType, String initialValue) {
		VirtualInstanceType result = VirtualInstanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualInstanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFrameworkType createApplicationFrameworkTypeFromString(EDataType eDataType, String initialValue) {
		ApplicationFrameworkType result = ApplicationFrameworkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationFrameworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFrameworkType createLanguageFrameworkTypeFromString(EDataType eDataType, String initialValue) {
		LanguageFrameworkType result = LanguageFrameworkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageFrameworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_providerPackage getDeployment_providerPackage() {
		return (Deployment_providerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Deployment_providerPackage getPackage() {
		return Deployment_providerPackage.eINSTANCE;
	}

} //Deployment_providerFactoryImpl

/**
 */
package deployment_provider;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage
 * @generated
 */
public interface Deployment_providerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Deployment_providerFactory eINSTANCE = deployment_provider.impl.Deployment_providerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>Cloud Deployment Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Deployment Service</em>'.
	 * @generated
	 */
	CloudDeploymentService createCloudDeploymentService();

	/**
	 * Returns a new object of class '<em>Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Descriptor</em>'.
	 * @generated
	 */
	DeploymentDescriptor createDeploymentDescriptor();

	/**
	 * Returns a new object of class '<em>Application Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Deployment Descriptor</em>'.
	 * @generated
	 */
	ApplicationDeploymentDescriptor createApplicationDeploymentDescriptor();

	/**
	 * Returns a new object of class '<em>Infrastructure Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Deployment Descriptor</em>'.
	 * @generated
	 */
	InfrastructureDeploymentDescriptor createInfrastructureDeploymentDescriptor();

	/**
	 * Returns a new object of class '<em>Cloud Infrastructure Offering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Infrastructure Offering</em>'.
	 * @generated
	 */
	CloudInfrastructureOffering createCloudInfrastructureOffering();

	/**
	 * Returns a new object of class '<em>Cloud Platform Offering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Platform Offering</em>'.
	 * @generated
	 */
	CloudPlatformOffering createCloudPlatformOffering();

	/**
	 * Returns a new object of class '<em>Environment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Descriptor</em>'.
	 * @generated
	 */
	EnvironmentDescriptor createEnvironmentDescriptor();

	/**
	 * Returns a new object of class '<em>Authentication Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Token</em>'.
	 * @generated
	 */
	AuthenticationToken createAuthenticationToken();

	/**
	 * Returns a new object of class '<em>Cloud Hardware Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Hardware Service</em>'.
	 * @generated
	 */
	CloudHardwareService createCloudHardwareService();

	/**
	 * Returns a new object of class '<em>Cloud Software Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Software Service</em>'.
	 * @generated
	 */
	CloudSoftwareService createCloudSoftwareService();

	/**
	 * Returns a new object of class '<em>Cloud Infrastructure Physical Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Infrastructure Physical Instance</em>'.
	 * @generated
	 */
	CloudInfrastructurePhysicalInstance createCloudInfrastructurePhysicalInstance();

	/**
	 * Returns a new object of class '<em>Cloud Infrastructure Virtual Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Infrastructure Virtual Instance</em>'.
	 * @generated
	 */
	CloudInfrastructureVirtualInstance createCloudInfrastructureVirtualInstance();

	/**
	 * Returns a new object of class '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack</em>'.
	 * @generated
	 */
	Stack createStack();

	/**
	 * Returns a new object of class '<em>Cloud Infrastructure Virtual Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Infrastructure Virtual Cluster</em>'.
	 * @generated
	 */
	CloudInfrastructureVirtualCluster createCloudInfrastructureVirtualCluster();

	/**
	 * Returns a new object of class '<em>Application Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Framework</em>'.
	 * @generated
	 */
	ApplicationFramework createApplicationFramework();

	/**
	 * Returns a new object of class '<em>Authentication Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Account</em>'.
	 * @generated
	 */
	AuthenticationAccount createAuthenticationAccount();

	/**
	 * Returns a new object of class '<em>Deployment Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Recipe</em>'.
	 * @generated
	 */
	DeploymentRecipe createDeploymentRecipe();

	/**
	 * Returns a new object of class '<em>Deployment Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Template</em>'.
	 * @generated
	 */
	DeploymentTemplate createDeploymentTemplate();

	/**
	 * Returns a new object of class '<em>Descriptor Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Entry</em>'.
	 * @generated
	 */
	DescriptorEntry createDescriptorEntry();

	/**
	 * Returns a new object of class '<em>Cloud Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Service Client</em>'.
	 * @generated
	 */
	CloudServiceClient createCloudServiceClient();

	/**
	 * Returns a new object of class '<em>Application Language Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Language Framework</em>'.
	 * @generated
	 */
	ApplicationLanguageFramework createApplicationLanguageFramework();

	/**
	 * Returns a new object of class '<em>Service Configuration Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Configuration Descriptor</em>'.
	 * @generated
	 */
	ServiceConfigurationDescriptor createServiceConfigurationDescriptor();

	/**
	 * Returns a new object of class '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor</em>'.
	 * @generated
	 */
	Descriptor createDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Deployment_providerPackage getDeployment_providerPackage();

} //Deployment_providerFactory

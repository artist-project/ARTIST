/**
 */
package deployment_provider.util;

import deployment_provider.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deployment_provider.Deployment_providerPackage
 * @generated
 */
public class Deployment_providerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Deployment_providerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_providerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Deployment_providerPackage.eINSTANCE;
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
	protected Deployment_providerSwitch<Adapter> modelSwitch =
		new Deployment_providerSwitch<Adapter>() {
			@Override
			public Adapter caseCloudProvider(CloudProvider object) {
				return createCloudProviderAdapter();
			}
			@Override
			public Adapter caseCloudService(CloudService object) {
				return createCloudServiceAdapter();
			}
			@Override
			public Adapter caseCloudDeploymentService(CloudDeploymentService object) {
				return createCloudDeploymentServiceAdapter();
			}
			@Override
			public Adapter caseDeploymentDescriptor(DeploymentDescriptor object) {
				return createDeploymentDescriptorAdapter();
			}
			@Override
			public Adapter caseApplicationDeploymentDescriptor(ApplicationDeploymentDescriptor object) {
				return createApplicationDeploymentDescriptorAdapter();
			}
			@Override
			public Adapter caseInfrastructureDeploymentDescriptor(InfrastructureDeploymentDescriptor object) {
				return createInfrastructureDeploymentDescriptorAdapter();
			}
			@Override
			public Adapter caseCloudOffering(CloudOffering object) {
				return createCloudOfferingAdapter();
			}
			@Override
			public Adapter caseCloudInfrastructureOffering(CloudInfrastructureOffering object) {
				return createCloudInfrastructureOfferingAdapter();
			}
			@Override
			public Adapter caseCloudPlatformOffering(CloudPlatformOffering object) {
				return createCloudPlatformOfferingAdapter();
			}
			@Override
			public Adapter caseEnvironmentDescriptor(EnvironmentDescriptor object) {
				return createEnvironmentDescriptorAdapter();
			}
			@Override
			public Adapter caseAuthenticationToken(AuthenticationToken object) {
				return createAuthenticationTokenAdapter();
			}
			@Override
			public Adapter caseCloudHardwareService(CloudHardwareService object) {
				return createCloudHardwareServiceAdapter();
			}
			@Override
			public Adapter caseCloudSoftwareService(CloudSoftwareService object) {
				return createCloudSoftwareServiceAdapter();
			}
			@Override
			public Adapter caseCloudInfrastructurePhysicalInstance(CloudInfrastructurePhysicalInstance object) {
				return createCloudInfrastructurePhysicalInstanceAdapter();
			}
			@Override
			public Adapter caseCloudInfrastructureVirtualInstance(CloudInfrastructureVirtualInstance object) {
				return createCloudInfrastructureVirtualInstanceAdapter();
			}
			@Override
			public Adapter caseStack(Stack object) {
				return createStackAdapter();
			}
			@Override
			public Adapter caseCloudInfrastructureVirtualCluster(CloudInfrastructureVirtualCluster object) {
				return createCloudInfrastructureVirtualClusterAdapter();
			}
			@Override
			public Adapter caseApplicationFramework(ApplicationFramework object) {
				return createApplicationFrameworkAdapter();
			}
			@Override
			public Adapter caseAuthenticationAccount(AuthenticationAccount object) {
				return createAuthenticationAccountAdapter();
			}
			@Override
			public Adapter caseDeploymentRecipe(DeploymentRecipe object) {
				return createDeploymentRecipeAdapter();
			}
			@Override
			public Adapter caseDeploymentTemplate(DeploymentTemplate object) {
				return createDeploymentTemplateAdapter();
			}
			@Override
			public Adapter caseDescriptorEntry(DescriptorEntry object) {
				return createDescriptorEntryAdapter();
			}
			@Override
			public Adapter caseCloudServiceClient(CloudServiceClient object) {
				return createCloudServiceClientAdapter();
			}
			@Override
			public Adapter caseApplicationLanguageFramework(ApplicationLanguageFramework object) {
				return createApplicationLanguageFrameworkAdapter();
			}
			@Override
			public Adapter caseFramework(Framework object) {
				return createFrameworkAdapter();
			}
			@Override
			public Adapter caseServiceConfigurationDescriptor(ServiceConfigurationDescriptor object) {
				return createServiceConfigurationDescriptorAdapter();
			}
			@Override
			public Adapter caseDescriptor(Descriptor object) {
				return createDescriptorAdapter();
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
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudProvider
	 * @generated
	 */
	public Adapter createCloudProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudService
	 * @generated
	 */
	public Adapter createCloudServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudDeploymentService <em>Cloud Deployment Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudDeploymentService
	 * @generated
	 */
	public Adapter createCloudDeploymentServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.DeploymentDescriptor <em>Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.DeploymentDescriptor
	 * @generated
	 */
	public Adapter createDeploymentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.ApplicationDeploymentDescriptor <em>Application Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.ApplicationDeploymentDescriptor
	 * @generated
	 */
	public Adapter createApplicationDeploymentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.InfrastructureDeploymentDescriptor <em>Infrastructure Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.InfrastructureDeploymentDescriptor
	 * @generated
	 */
	public Adapter createInfrastructureDeploymentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudOffering <em>Cloud Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudOffering
	 * @generated
	 */
	public Adapter createCloudOfferingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudInfrastructureOffering <em>Cloud Infrastructure Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudInfrastructureOffering
	 * @generated
	 */
	public Adapter createCloudInfrastructureOfferingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudPlatformOffering <em>Cloud Platform Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudPlatformOffering
	 * @generated
	 */
	public Adapter createCloudPlatformOfferingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.EnvironmentDescriptor <em>Environment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.EnvironmentDescriptor
	 * @generated
	 */
	public Adapter createEnvironmentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.AuthenticationToken
	 * @generated
	 */
	public Adapter createAuthenticationTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudHardwareService <em>Cloud Hardware Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudHardwareService
	 * @generated
	 */
	public Adapter createCloudHardwareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudSoftwareService <em>Cloud Software Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudSoftwareService
	 * @generated
	 */
	public Adapter createCloudSoftwareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudInfrastructurePhysicalInstance <em>Cloud Infrastructure Physical Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudInfrastructurePhysicalInstance
	 * @generated
	 */
	public Adapter createCloudInfrastructurePhysicalInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudInfrastructureVirtualInstance <em>Cloud Infrastructure Virtual Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudInfrastructureVirtualInstance
	 * @generated
	 */
	public Adapter createCloudInfrastructureVirtualInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.Stack
	 * @generated
	 */
	public Adapter createStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudInfrastructureVirtualCluster <em>Cloud Infrastructure Virtual Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudInfrastructureVirtualCluster
	 * @generated
	 */
	public Adapter createCloudInfrastructureVirtualClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.ApplicationFramework <em>Application Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.ApplicationFramework
	 * @generated
	 */
	public Adapter createApplicationFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.AuthenticationAccount <em>Authentication Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.AuthenticationAccount
	 * @generated
	 */
	public Adapter createAuthenticationAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.DeploymentRecipe <em>Deployment Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.DeploymentRecipe
	 * @generated
	 */
	public Adapter createDeploymentRecipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.DeploymentTemplate <em>Deployment Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.DeploymentTemplate
	 * @generated
	 */
	public Adapter createDeploymentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.DescriptorEntry <em>Descriptor Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.DescriptorEntry
	 * @generated
	 */
	public Adapter createDescriptorEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.CloudServiceClient <em>Cloud Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.CloudServiceClient
	 * @generated
	 */
	public Adapter createCloudServiceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.ApplicationLanguageFramework <em>Application Language Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.ApplicationLanguageFramework
	 * @generated
	 */
	public Adapter createApplicationLanguageFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.Framework
	 * @generated
	 */
	public Adapter createFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.ServiceConfigurationDescriptor <em>Service Configuration Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.ServiceConfigurationDescriptor
	 * @generated
	 */
	public Adapter createServiceConfigurationDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
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

} //Deployment_providerAdapterFactory

/**
 */
package deployment_provider.util;

import deployment_provider.*;

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
 * @see deployment_provider.Deployment_providerPackage
 * @generated
 */
public class Deployment_providerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Deployment_providerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_providerSwitch() {
		if (modelPackage == null) {
			modelPackage = Deployment_providerPackage.eINSTANCE;
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
			case Deployment_providerPackage.CLOUD_PROVIDER: {
				CloudProvider cloudProvider = (CloudProvider)theEObject;
				T result = caseCloudProvider(cloudProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_SERVICE: {
				CloudService cloudService = (CloudService)theEObject;
				T result = caseCloudService(cloudService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE: {
				CloudDeploymentService cloudDeploymentService = (CloudDeploymentService)theEObject;
				T result = caseCloudDeploymentService(cloudDeploymentService);
				if (result == null) result = caseCloudSoftwareService(cloudDeploymentService);
				if (result == null) result = caseCloudService(cloudDeploymentService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR: {
				DeploymentDescriptor deploymentDescriptor = (DeploymentDescriptor)theEObject;
				T result = caseDeploymentDescriptor(deploymentDescriptor);
				if (result == null) result = caseServiceConfigurationDescriptor(deploymentDescriptor);
				if (result == null) result = caseDescriptor(deploymentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.APPLICATION_DEPLOYMENT_DESCRIPTOR: {
				ApplicationDeploymentDescriptor applicationDeploymentDescriptor = (ApplicationDeploymentDescriptor)theEObject;
				T result = caseApplicationDeploymentDescriptor(applicationDeploymentDescriptor);
				if (result == null) result = caseDeploymentDescriptor(applicationDeploymentDescriptor);
				if (result == null) result = caseServiceConfigurationDescriptor(applicationDeploymentDescriptor);
				if (result == null) result = caseDescriptor(applicationDeploymentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.INFRASTRUCTURE_DEPLOYMENT_DESCRIPTOR: {
				InfrastructureDeploymentDescriptor infrastructureDeploymentDescriptor = (InfrastructureDeploymentDescriptor)theEObject;
				T result = caseInfrastructureDeploymentDescriptor(infrastructureDeploymentDescriptor);
				if (result == null) result = caseDeploymentDescriptor(infrastructureDeploymentDescriptor);
				if (result == null) result = caseServiceConfigurationDescriptor(infrastructureDeploymentDescriptor);
				if (result == null) result = caseDescriptor(infrastructureDeploymentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_OFFERING: {
				CloudOffering cloudOffering = (CloudOffering)theEObject;
				T result = caseCloudOffering(cloudOffering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING: {
				CloudInfrastructureOffering cloudInfrastructureOffering = (CloudInfrastructureOffering)theEObject;
				T result = caseCloudInfrastructureOffering(cloudInfrastructureOffering);
				if (result == null) result = caseCloudOffering(cloudInfrastructureOffering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_PLATFORM_OFFERING: {
				CloudPlatformOffering cloudPlatformOffering = (CloudPlatformOffering)theEObject;
				T result = caseCloudPlatformOffering(cloudPlatformOffering);
				if (result == null) result = caseCloudOffering(cloudPlatformOffering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.ENVIRONMENT_DESCRIPTOR: {
				EnvironmentDescriptor environmentDescriptor = (EnvironmentDescriptor)theEObject;
				T result = caseEnvironmentDescriptor(environmentDescriptor);
				if (result == null) result = caseServiceConfigurationDescriptor(environmentDescriptor);
				if (result == null) result = caseDescriptor(environmentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.AUTHENTICATION_TOKEN: {
				AuthenticationToken authenticationToken = (AuthenticationToken)theEObject;
				T result = caseAuthenticationToken(authenticationToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_HARDWARE_SERVICE: {
				CloudHardwareService cloudHardwareService = (CloudHardwareService)theEObject;
				T result = caseCloudHardwareService(cloudHardwareService);
				if (result == null) result = caseCloudService(cloudHardwareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_SOFTWARE_SERVICE: {
				CloudSoftwareService cloudSoftwareService = (CloudSoftwareService)theEObject;
				T result = caseCloudSoftwareService(cloudSoftwareService);
				if (result == null) result = caseCloudService(cloudSoftwareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE: {
				CloudInfrastructurePhysicalInstance cloudInfrastructurePhysicalInstance = (CloudInfrastructurePhysicalInstance)theEObject;
				T result = caseCloudInfrastructurePhysicalInstance(cloudInfrastructurePhysicalInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_INSTANCE: {
				CloudInfrastructureVirtualInstance cloudInfrastructureVirtualInstance = (CloudInfrastructureVirtualInstance)theEObject;
				T result = caseCloudInfrastructureVirtualInstance(cloudInfrastructureVirtualInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.STACK: {
				Stack stack = (Stack)theEObject;
				T result = caseStack(stack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER: {
				CloudInfrastructureVirtualCluster cloudInfrastructureVirtualCluster = (CloudInfrastructureVirtualCluster)theEObject;
				T result = caseCloudInfrastructureVirtualCluster(cloudInfrastructureVirtualCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.APPLICATION_FRAMEWORK: {
				ApplicationFramework applicationFramework = (ApplicationFramework)theEObject;
				T result = caseApplicationFramework(applicationFramework);
				if (result == null) result = caseFramework(applicationFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT: {
				AuthenticationAccount authenticationAccount = (AuthenticationAccount)theEObject;
				T result = caseAuthenticationAccount(authenticationAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.DEPLOYMENT_RECIPE: {
				DeploymentRecipe deploymentRecipe = (DeploymentRecipe)theEObject;
				T result = caseDeploymentRecipe(deploymentRecipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.DEPLOYMENT_TEMPLATE: {
				DeploymentTemplate deploymentTemplate = (DeploymentTemplate)theEObject;
				T result = caseDeploymentTemplate(deploymentTemplate);
				if (result == null) result = caseDeploymentDescriptor(deploymentTemplate);
				if (result == null) result = caseServiceConfigurationDescriptor(deploymentTemplate);
				if (result == null) result = caseDescriptor(deploymentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.DESCRIPTOR_ENTRY: {
				DescriptorEntry descriptorEntry = (DescriptorEntry)theEObject;
				T result = caseDescriptorEntry(descriptorEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.CLOUD_SERVICE_CLIENT: {
				CloudServiceClient cloudServiceClient = (CloudServiceClient)theEObject;
				T result = caseCloudServiceClient(cloudServiceClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.APPLICATION_LANGUAGE_FRAMEWORK: {
				ApplicationLanguageFramework applicationLanguageFramework = (ApplicationLanguageFramework)theEObject;
				T result = caseApplicationLanguageFramework(applicationLanguageFramework);
				if (result == null) result = caseFramework(applicationLanguageFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.FRAMEWORK: {
				Framework framework = (Framework)theEObject;
				T result = caseFramework(framework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.SERVICE_CONFIGURATION_DESCRIPTOR: {
				ServiceConfigurationDescriptor serviceConfigurationDescriptor = (ServiceConfigurationDescriptor)theEObject;
				T result = caseServiceConfigurationDescriptor(serviceConfigurationDescriptor);
				if (result == null) result = caseDescriptor(serviceConfigurationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_providerPackage.DESCRIPTOR: {
				Descriptor descriptor = (Descriptor)theEObject;
				T result = caseDescriptor(descriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudProvider(CloudProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudService(CloudService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Deployment Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Deployment Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudDeploymentService(CloudDeploymentService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentDescriptor(DeploymentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Deployment Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDeploymentDescriptor(ApplicationDeploymentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Deployment Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureDeploymentDescriptor(InfrastructureDeploymentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Offering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Offering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudOffering(CloudOffering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Infrastructure Offering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Infrastructure Offering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudInfrastructureOffering(CloudInfrastructureOffering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Platform Offering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Platform Offering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudPlatformOffering(CloudPlatformOffering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentDescriptor(EnvironmentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationToken(AuthenticationToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Hardware Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Hardware Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudHardwareService(CloudHardwareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Software Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Software Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudSoftwareService(CloudSoftwareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Infrastructure Physical Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Infrastructure Physical Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudInfrastructurePhysicalInstance(CloudInfrastructurePhysicalInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Infrastructure Virtual Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Infrastructure Virtual Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudInfrastructureVirtualInstance(CloudInfrastructureVirtualInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStack(Stack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Infrastructure Virtual Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Infrastructure Virtual Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudInfrastructureVirtualCluster(CloudInfrastructureVirtualCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationFramework(ApplicationFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationAccount(AuthenticationAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Recipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Recipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentRecipe(DeploymentRecipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTemplate(DeploymentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptorEntry(DescriptorEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Service Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudServiceClient(CloudServiceClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Language Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Language Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLanguageFramework(ApplicationLanguageFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramework(Framework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Configuration Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Configuration Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConfigurationDescriptor(ServiceConfigurationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptor(Descriptor object) {
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

} //Deployment_providerSwitch

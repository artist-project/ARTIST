/**
 */
package deployment_app;

import deployment_provider.DeploymentDescriptor;
import deployment_provider.ServiceConfigurationDescriptor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Application Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_app.CloudApplicationDeploymentUnit#getIsConfiguredBy <em>Is Configured By</em>}</li>
 *   <li>{@link deployment_app.CloudApplicationDeploymentUnit#getConfigureServices <em>Configure Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_app.Deployment_appPackage#getCloudApplicationDeploymentUnit()
 * @model abstract="true"
 * @generated
 */
public interface CloudApplicationDeploymentUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Configured By</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.DeploymentDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Configured By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Configured By</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplicationDeploymentUnit_IsConfiguredBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DeploymentDescriptor> getIsConfiguredBy();

	/**
	 * Returns the value of the '<em><b>Configure Services</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.ServiceConfigurationDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure Services</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplicationDeploymentUnit_ConfigureServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConfigurationDescriptor> getConfigureServices();

} // CloudApplicationDeploymentUnit

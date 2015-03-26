/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Deployment Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudDeploymentService#getUsesAccount <em>Uses Account</em>}</li>
 *   <li>{@link deployment_provider.CloudDeploymentService#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudDeploymentService()
 * @model
 * @generated
 */
public interface CloudDeploymentService extends CloudSoftwareService {
	/**
	 * Returns the value of the '<em><b>Uses Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Account</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Account</em>' containment reference.
	 * @see #setUsesAccount(AuthenticationAccount)
	 * @see deployment_provider.Deployment_providerPackage#getCloudDeploymentService_UsesAccount()
	 * @model containment="true"
	 * @generated
	 */
	AuthenticationAccount getUsesAccount();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudDeploymentService#getUsesAccount <em>Uses Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Account</em>' containment reference.
	 * @see #getUsesAccount()
	 * @generated
	 */
	void setUsesAccount(AuthenticationAccount value);

	/**
	 * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Services</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudDeploymentService_RequiredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudService> getRequiredServices();

} // CloudDeploymentService

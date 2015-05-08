/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudService#getName <em>Name</em>}</li>
 *   <li>{@link deployment_provider.CloudService#getConfiguredBy <em>Configured By</em>}</li>
 *   <li>{@link deployment_provider.CloudService#getSupportedClients <em>Supported Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudService()
 * @model abstract="true"
 * @generated
 */
public interface CloudService extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see deployment_provider.Deployment_providerPackage#getCloudService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configured By</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.ServiceConfigurationDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured By</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudService_ConfiguredBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConfigurationDescriptor> getConfiguredBy();

	/**
	 * Returns the value of the '<em><b>Supported Clients</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Clients</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudService_SupportedClients()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudServiceClient> getSupportedClients();

} // CloudService

/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Infrastructure Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudInfrastructureOffering#getComprisedInstances <em>Comprised Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureOffering()
 * @model
 * @generated
 */
public interface CloudInfrastructureOffering extends CloudOffering {
	/**
	 * Returns the value of the '<em><b>Comprised Instances</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudInfrastructurePhysicalInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprised Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprised Instances</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureOffering_ComprisedInstances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudInfrastructurePhysicalInstance> getComprisedInstances();

} // CloudInfrastructureOffering

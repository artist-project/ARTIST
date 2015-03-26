/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.InfrastructureDeploymentDescriptor#getClusters <em>Clusters</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getInfrastructureDeploymentDescriptor()
 * @model
 * @generated
 */
public interface InfrastructureDeploymentDescriptor extends DeploymentDescriptor {
	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudInfrastructureVirtualCluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clusters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getInfrastructureDeploymentDescriptor_Clusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudInfrastructureVirtualCluster> getClusters();

} // InfrastructureDeploymentDescriptor

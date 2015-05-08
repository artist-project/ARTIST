/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Infrastructure Virtual Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudInfrastructureVirtualCluster#getManages <em>Manages</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureVirtualCluster()
 * @model
 * @generated
 */
public interface CloudInfrastructureVirtualCluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Manages</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudInfrastructureVirtualInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureVirtualCluster_Manages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudInfrastructureVirtualInstance> getManages();

} // CloudInfrastructureVirtualCluster

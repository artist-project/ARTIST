/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Infrastructure Physical Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudInfrastructurePhysicalInstance#getRunVMs <em>Run VMs</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructurePhysicalInstance()
 * @model
 * @generated
 */
public interface CloudInfrastructurePhysicalInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Run VMs</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudInfrastructureVirtualInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run VMs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run VMs</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructurePhysicalInstance_RunVMs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudInfrastructureVirtualInstance> getRunVMs();

} // CloudInfrastructurePhysicalInstance

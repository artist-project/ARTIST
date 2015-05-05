/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancers Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A list of load balancers associated with this deployment.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement#getLoadBalancer <em>Load Balancer</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getLoadBalancersElement()
 * @model extendedMetaData="name='LoadBalancersElement' kind='elementOnly'"
 * @generated
 */
public interface LoadBalancersElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Load Balancer</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getLoadBalancersElement_LoadBalancer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LoadBalancer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadBalancerElement> getLoadBalancer();

} // LoadBalancersElement

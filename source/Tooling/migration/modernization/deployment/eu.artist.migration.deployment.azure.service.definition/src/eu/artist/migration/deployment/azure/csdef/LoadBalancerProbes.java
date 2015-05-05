/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer Probes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes#getLoadBalancerProbe <em>Load Balancer Probe</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbes()
 * @model extendedMetaData="name='LoadBalancerProbes' kind='elementOnly'"
 * @generated
 */
public interface LoadBalancerProbes extends EObject {
	/**
	 * Returns the value of the '<em><b>Load Balancer Probe</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancer Probe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer Probe</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbes_LoadBalancerProbe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LoadBalancerProbe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoadBalancerProbe> getLoadBalancerProbe();

} // LoadBalancerProbes

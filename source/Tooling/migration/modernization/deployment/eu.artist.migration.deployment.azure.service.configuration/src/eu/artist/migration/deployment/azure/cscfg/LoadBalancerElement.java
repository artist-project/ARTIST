/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A load balancer for distributing network load across instances in this deployment.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getFrontendIPConfiguration <em>Frontend IP Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getLoadBalancerElement()
 * @model extendedMetaData="name='LoadBalancerElement' kind='elementOnly'"
 * @generated
 */
public interface LoadBalancerElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Frontend IP Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frontend IP Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frontend IP Configuration</em>' containment reference.
	 * @see #setFrontendIPConfiguration(FrontendIPConfigurationElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getLoadBalancerElement_FrontendIPConfiguration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FrontendIPConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	FrontendIPConfigurationElement getFrontendIPConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getFrontendIPConfiguration <em>Frontend IP Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frontend IP Configuration</em>' containment reference.
	 * @see #getFrontendIPConfiguration()
	 * @generated
	 */
	void setFrontendIPConfiguration(FrontendIPConfigurationElement value);

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
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getLoadBalancerElement_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LoadBalancerElement

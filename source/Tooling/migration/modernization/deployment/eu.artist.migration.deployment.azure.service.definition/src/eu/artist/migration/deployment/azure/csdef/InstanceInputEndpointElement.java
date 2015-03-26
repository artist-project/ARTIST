/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Input Endpoint Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An endpoint that is associated with a specific role instance by using port forwarding in the load balancer.
 *         Each instance is mapped to a specific port from a range of possible ports.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getAllocatePublicPortFrom <em>Allocate Public Port From</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement()
 * @model extendedMetaData="name='InstanceInputEndpointElement' kind='elementOnly'"
 * @generated
 */
public interface InstanceInputEndpointElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocate Public Port From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocate Public Port From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocate Public Port From</em>' containment reference.
	 * @see #setAllocatePublicPortFrom(AllocatePublicPortFromElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement_AllocatePublicPortFrom()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AllocatePublicPortFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	AllocatePublicPortFromElement getAllocatePublicPortFrom();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getAllocatePublicPortFrom <em>Allocate Public Port From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocate Public Port From</em>' containment reference.
	 * @see #getAllocatePublicPortFrom()
	 * @generated
	 */
	void setAllocatePublicPortFrom(AllocatePublicPortFromElement value);

	/**
	 * Returns the value of the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Optional specifier to control the TCP idle connection timeout for the endpoint.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Timeout In Minutes</em>' attribute.
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement_IdleTimeoutInMinutes()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='idleTimeoutInMinutes'"
	 * @generated
	 */
	int getIdleTimeoutInMinutes();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout In Minutes</em>' attribute.
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @generated
	 */
	void setIdleTimeoutInMinutes(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @generated
	 */
	void unsetIdleTimeoutInMinutes();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Idle Timeout In Minutes</em>' attribute is set.
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @generated
	 */
	boolean isSetIdleTimeoutInMinutes();

	/**
	 * Returns the value of the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Specifier that defines the same fixed local port that all instances will listen to
	 *           to get incomming traffic forwarded to the instance.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Port</em>' attribute.
	 * @see #isSetLocalPort()
	 * @see #unsetLocalPort()
	 * @see #setLocalPort(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement_LocalPort()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PortInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='localPort'"
	 * @generated
	 */
	int getLocalPort();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Port</em>' attribute.
	 * @see #isSetLocalPort()
	 * @see #unsetLocalPort()
	 * @see #getLocalPort()
	 * @generated
	 */
	void setLocalPort(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalPort()
	 * @see #getLocalPort()
	 * @see #setLocalPort(int)
	 * @generated
	 */
	void unsetLocalPort();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getLocalPort <em>Local Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Port</em>' attribute is set.
	 * @see #unsetLocalPort()
	 * @see #getLocalPort()
	 * @see #setLocalPort(int)
	 * @generated
	 */
	boolean isSetLocalPort();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the endpoint.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.TransportProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The transport protocol of the endpoint. Note use "tcp" for http/https based traffic.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(TransportProtocol)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInstanceInputEndpointElement_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	TransportProtocol getProtocol();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TransportProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(TransportProtocol value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(TransportProtocol)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(TransportProtocol)
	 * @generated
	 */
	boolean isSetProtocol();

} // InstanceInputEndpointElement

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An endpoint of a service specifies the transport protocol and port on which the service receives requests.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancer <em>Load Balancer</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerProbe <em>Load Balancer Probe</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint()
 * @model extendedMetaData="name='InputEndpoint' kind='empty'"
 * @generated
 */
public interface InputEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the certificate for use with https endpoints.
	 *           The store location and store names for https configuration is automatic and need not be defined.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see #setCertificate(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_Certificate()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString"
	 *        extendedMetaData="kind='attribute' name='certificate'"
	 * @generated
	 */
	String getCertificate();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' attribute.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(String value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_IdleTimeoutInMinutes()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='idleTimeoutInMinutes'"
	 * @generated
	 */
	int getIdleTimeoutInMinutes();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
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
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @generated
	 */
	void unsetIdleTimeoutInMinutes();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ignore Role Instance Status</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Set this value to true to ensure a load balanced endpoint is always available regardless of 
	 *           the role instance status. The default value is false.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Role Instance Status</em>' attribute.
	 * @see #isSetIgnoreRoleInstanceStatus()
	 * @see #unsetIgnoreRoleInstanceStatus()
	 * @see #setIgnoreRoleInstanceStatus(boolean)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_IgnoreRoleInstanceStatus()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ignoreRoleInstanceStatus'"
	 * @generated
	 */
	boolean isIgnoreRoleInstanceStatus();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Role Instance Status</em>' attribute.
	 * @see #isSetIgnoreRoleInstanceStatus()
	 * @see #unsetIgnoreRoleInstanceStatus()
	 * @see #isIgnoreRoleInstanceStatus()
	 * @generated
	 */
	void setIgnoreRoleInstanceStatus(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreRoleInstanceStatus()
	 * @see #isIgnoreRoleInstanceStatus()
	 * @see #setIgnoreRoleInstanceStatus(boolean)
	 * @generated
	 */
	void unsetIgnoreRoleInstanceStatus();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Role Instance Status</em>' attribute is set.
	 * @see #unsetIgnoreRoleInstanceStatus()
	 * @see #isIgnoreRoleInstanceStatus()
	 * @see #setIgnoreRoleInstanceStatus(boolean)
	 * @generated
	 */
	boolean isSetIgnoreRoleInstanceStatus();

	/**
	 * Returns the value of the '<em><b>Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Reference to a load balancer defined for this deployment.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balancer</em>' attribute.
	 * @see #setLoadBalancer(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_LoadBalancer()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString"
	 *        extendedMetaData="kind='attribute' name='loadBalancer'"
	 * @generated
	 */
	String getLoadBalancer();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancer <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer</em>' attribute.
	 * @see #getLoadBalancer()
	 * @generated
	 */
	void setLoadBalancer(String value);

	/**
	 * Returns the value of the '<em><b>Load Balancer Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.DistributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Optional specifier to control LoadBalancer Policy of an endpoint.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balancer Distribution</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @see #isSetLoadBalancerDistribution()
	 * @see #unsetLoadBalancerDistribution()
	 * @see #setLoadBalancerDistribution(DistributionType)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_LoadBalancerDistribution()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='loadBalancerDistribution'"
	 * @generated
	 */
	DistributionType getLoadBalancerDistribution();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Distribution</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.DistributionType
	 * @see #isSetLoadBalancerDistribution()
	 * @see #unsetLoadBalancerDistribution()
	 * @see #getLoadBalancerDistribution()
	 * @generated
	 */
	void setLoadBalancerDistribution(DistributionType value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadBalancerDistribution()
	 * @see #getLoadBalancerDistribution()
	 * @see #setLoadBalancerDistribution(DistributionType)
	 * @generated
	 */
	void unsetLoadBalancerDistribution();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Balancer Distribution</em>' attribute is set.
	 * @see #unsetLoadBalancerDistribution()
	 * @see #getLoadBalancerDistribution()
	 * @see #setLoadBalancerDistribution(DistributionType)
	 * @generated
	 */
	boolean isSetLoadBalancerDistribution();

	/**
	 * Returns the value of the '<em><b>Load Balancer Probe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Custom load balancer probe.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balancer Probe</em>' attribute.
	 * @see #setLoadBalancerProbe(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_LoadBalancerProbe()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString"
	 *        extendedMetaData="kind='attribute' name='loadBalancerProbe'"
	 * @generated
	 */
	String getLoadBalancerProbe();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLoadBalancerProbe <em>Load Balancer Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer Probe</em>' attribute.
	 * @see #getLoadBalancerProbe()
	 * @generated
	 */
	void setLoadBalancerProbe(String value);

	/**
	 * Returns the value of the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Optional specifier to control the assignement of the local port used for a loadbalanced endpoint.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Port</em>' attribute.
	 * @see #setLocalPort(Object)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_LocalPort()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.PortSpecifier"
	 *        extendedMetaData="kind='attribute' name='localPort'"
	 * @generated
	 */
	Object getLocalPort();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getLocalPort <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Port</em>' attribute.
	 * @see #getLocalPort()
	 * @generated
	 */
	void setLocalPort(Object value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #setPort(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_Port()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PortInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getPort <em>Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port</em>' attribute is set.
	 * @see #unsetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	boolean isSetPort();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(Protocol)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInputEndpoint_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.Protocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(Protocol)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InputEndpoint#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(Protocol)
	 * @generated
	 */
	boolean isSetProtocol();

} // InputEndpoint

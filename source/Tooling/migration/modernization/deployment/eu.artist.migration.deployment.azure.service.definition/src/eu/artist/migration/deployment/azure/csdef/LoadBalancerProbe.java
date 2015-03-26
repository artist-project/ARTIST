/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds <em>Interval In Seconds</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPath <em>Path</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds <em>Timeout In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe()
 * @model extendedMetaData="name='LoadBalancerProbe' kind='empty'"
 * @generated
 */
public interface LoadBalancerProbe extends EObject {
	/**
	 * Returns the value of the '<em><b>Interval In Seconds</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval In Seconds</em>' attribute.
	 * @see #isSetIntervalInSeconds()
	 * @see #unsetIntervalInSeconds()
	 * @see #setIntervalInSeconds(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_IntervalInSeconds()
	 * @model default="15" unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.LBProbeInterval"
	 *        extendedMetaData="kind='attribute' name='intervalInSeconds'"
	 * @generated
	 */
	int getIntervalInSeconds();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds <em>Interval In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval In Seconds</em>' attribute.
	 * @see #isSetIntervalInSeconds()
	 * @see #unsetIntervalInSeconds()
	 * @see #getIntervalInSeconds()
	 * @generated
	 */
	void setIntervalInSeconds(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds <em>Interval In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalInSeconds()
	 * @see #getIntervalInSeconds()
	 * @see #setIntervalInSeconds(int)
	 * @generated
	 */
	void unsetIntervalInSeconds();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getIntervalInSeconds <em>Interval In Seconds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval In Seconds</em>' attribute is set.
	 * @see #unsetIntervalInSeconds()
	 * @see #getIntervalInSeconds()
	 * @see #setIntervalInSeconds(int)
	 * @generated
	 */
	boolean isSetIntervalInSeconds();

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_Port()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PortInteger"
	 *        extendedMetaData="kind='attribute' name='port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort <em>Port</em>}' attribute.
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
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getPort <em>Port</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.ProbeProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(ProbeProtocol)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	ProbeProtocol getProtocol();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.ProbeProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProbeProtocol value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProbeProtocol)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProbeProtocol)
	 * @generated
	 */
	boolean isSetProtocol();

	/**
	 * Returns the value of the '<em><b>Timeout In Seconds</b></em>' attribute.
	 * The default value is <code>"31"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout In Seconds</em>' attribute.
	 * @see #isSetTimeoutInSeconds()
	 * @see #unsetTimeoutInSeconds()
	 * @see #setTimeoutInSeconds(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLoadBalancerProbe_TimeoutInSeconds()
	 * @model default="31" unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.LBProbeTimeout"
	 *        extendedMetaData="kind='attribute' name='timeoutInSeconds'"
	 * @generated
	 */
	int getTimeoutInSeconds();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds <em>Timeout In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout In Seconds</em>' attribute.
	 * @see #isSetTimeoutInSeconds()
	 * @see #unsetTimeoutInSeconds()
	 * @see #getTimeoutInSeconds()
	 * @generated
	 */
	void setTimeoutInSeconds(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds <em>Timeout In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeoutInSeconds()
	 * @see #getTimeoutInSeconds()
	 * @see #setTimeoutInSeconds(int)
	 * @generated
	 */
	void unsetTimeoutInSeconds();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe#getTimeoutInSeconds <em>Timeout In Seconds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout In Seconds</em>' attribute is set.
	 * @see #unsetTimeoutInSeconds()
	 * @see #getTimeoutInSeconds()
	 * @see #setTimeoutInSeconds(int)
	 * @generated
	 */
	boolean isSetTimeoutInSeconds();

} // LoadBalancerProbe

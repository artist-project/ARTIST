/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         An endpoint of a role that can be used for inter role communication. It specifies the transport protocol, 
 *         and optional a set of fixed port ranges that can be used to communicate to the endpoint.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPort <em>Fixed Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getFixedPortRange <em>Fixed Port Range</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint()
 * @model extendedMetaData="name='InternalEndpoint' kind='elementOnly'"
 * @generated
 */
public interface InternalEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The collection of fixed port ranges.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Fixed Port</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Port</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_FixedPort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FixedPort' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Port> getFixedPort();

	/**
	 * Returns the value of the '<em><b>Fixed Port Range</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.PortRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Port Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Port Range</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_FixedPortRange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FixedPortRange' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PortRange> getFixedPortRange();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the endpoint
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Optional specifier to control the assignement of the port used for the internal endpoint.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Object)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_Port()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.PortSpecifier"
	 *        extendedMetaData="kind='attribute' name='port'"
	 * @generated
	 */
	Object getPort();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Object value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.InternalProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The protocol of the endpoint
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(InternalProtocol)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getInternalEndpoint_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol'"
	 * @generated
	 */
	InternalProtocol getProtocol();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.InternalProtocol
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(InternalProtocol value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(InternalProtocol)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.InternalEndpoint#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(InternalProtocol)
	 * @generated
	 */
	boolean isSetProtocol();

} // InternalEndpoint

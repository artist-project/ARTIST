/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleEndpoint()
 * @model extendedMetaData="name='RoleEndpoint' kind='empty'"
 * @generated
 */
public interface RoleEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Name</em>' attribute.
	 * @see #setEndpointName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleEndpoint_EndpointName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='endpointName'"
	 * @generated
	 */
	String getEndpointName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getEndpointName <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Name</em>' attribute.
	 * @see #getEndpointName()
	 * @generated
	 */
	void setEndpointName(String value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleEndpoint_RoleName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='roleName'"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // RoleEndpoint

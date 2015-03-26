/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Acl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclType()
 * @model extendedMetaData="name='EndpointAcl_._type' kind='empty'"
 * @generated
 */
public interface EndpointAclType extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' attribute.
	 * @see #setAccessControl(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclType_AccessControl()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='accessControl'"
	 * @generated
	 */
	String getAccessControl();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getAccessControl <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' attribute.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(String value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclType_EndPoint()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='endPoint'"
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclType_Role()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // EndpointAclType

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.FromRole#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getFromRole()
 * @model extendedMetaData="name='FromRole' kind='empty'"
 * @generated
 */
public interface FromRole extends EObject {
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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getFromRole_RoleName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='roleName'"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.FromRole#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // FromRole

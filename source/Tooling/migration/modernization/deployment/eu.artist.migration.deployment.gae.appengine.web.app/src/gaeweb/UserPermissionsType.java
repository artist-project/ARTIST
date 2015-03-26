/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.UserPermissionsType#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getUserPermissionsType()
 * @model extendedMetaData="name='userPermissionsType' kind='elementOnly'"
 * @generated
 */
public interface UserPermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.PermissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getUserPermissionsType_Permission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PermissionType> getPermission();

} // UserPermissionsType

/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.AdminConsole#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getAdminConsole()
 * @model extendedMetaData="name='admin-console' kind='elementOnly'"
 * @generated
 */
public interface AdminConsole extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.AdminConsolePageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getAdminConsole_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdminConsolePageType> getPage();

} // AdminConsole

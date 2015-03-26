/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Error Handlers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.StaticErrorHandlers#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getStaticErrorHandlers()
 * @model extendedMetaData="name='static-error-handlers' kind='elementOnly'"
 * @generated
 */
public interface StaticErrorHandlers extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.StaticErrorHandlersHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getStaticErrorHandlers_Handler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticErrorHandlersHandler> getHandler();

} // StaticErrorHandlers

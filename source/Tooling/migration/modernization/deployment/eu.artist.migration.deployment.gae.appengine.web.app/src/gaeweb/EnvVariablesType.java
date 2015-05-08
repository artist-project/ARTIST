/**
 */
package gaeweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Variables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.EnvVariablesType#getEnvVar <em>Env Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getEnvVariablesType()
 * @model extendedMetaData="name='env-variablesType' kind='elementOnly'"
 * @generated
 */
public interface EnvVariablesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Env Var</b></em>' containment reference list.
	 * The list contents are of type {@link gaeweb.EnvVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Var</em>' containment reference list.
	 * @see gaeweb.GaewebPackage#getEnvVariablesType_EnvVar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-var' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnvVarType> getEnvVar();

} // EnvVariablesType

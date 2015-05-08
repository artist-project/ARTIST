/**
 */
package deployment_provider;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.AuthenticationAccount#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getAuthenticationAccount()
 * @model
 * @generated
 */
public interface AuthenticationAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference.
	 * @see #setUses(AuthenticationToken)
	 * @see deployment_provider.Deployment_providerPackage#getAuthenticationAccount_Uses()
	 * @model containment="true"
	 * @generated
	 */
	AuthenticationToken getUses();

	/**
	 * Sets the value of the '{@link deployment_provider.AuthenticationAccount#getUses <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' containment reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(AuthenticationToken value);

} // AuthenticationAccount

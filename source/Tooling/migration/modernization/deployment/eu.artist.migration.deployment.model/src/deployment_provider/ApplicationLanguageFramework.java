/**
 */
package deployment_provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Language Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.ApplicationLanguageFramework#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getApplicationLanguageFramework()
 * @model
 * @generated
 */
public interface ApplicationLanguageFramework extends Framework {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_provider.LanguageFrameworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.LanguageFrameworkType
	 * @see #setType(LanguageFrameworkType)
	 * @see deployment_provider.Deployment_providerPackage#getApplicationLanguageFramework_Type()
	 * @model
	 * @generated
	 */
	LanguageFrameworkType getType();

	/**
	 * Sets the value of the '{@link deployment_provider.ApplicationLanguageFramework#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.LanguageFrameworkType
	 * @see #getType()
	 * @generated
	 */
	void setType(LanguageFrameworkType value);

} // ApplicationLanguageFramework

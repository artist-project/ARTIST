/**
 */
package deployment_provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.ApplicationFramework#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getApplicationFramework()
 * @model
 * @generated
 */
public interface ApplicationFramework extends Framework {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_provider.ApplicationFrameworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.ApplicationFrameworkType
	 * @see #setType(ApplicationFrameworkType)
	 * @see deployment_provider.Deployment_providerPackage#getApplicationFramework_Type()
	 * @model required="true"
	 * @generated
	 */
	ApplicationFrameworkType getType();

	/**
	 * Sets the value of the '{@link deployment_provider.ApplicationFramework#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.ApplicationFrameworkType
	 * @see #getType()
	 * @generated
	 */
	void setType(ApplicationFrameworkType value);

} // ApplicationFramework

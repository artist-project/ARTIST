/**
 */
package eu.artist.migration.deployment.azure.csdef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WebRuntime#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRuntime()
 * @model extendedMetaData="name='WebRuntime' kind='elementOnly'"
 * @generated
 */
public interface WebRuntime extends eu.artist.migration.deployment.azure.csdef.Runtime {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference.
	 * @see #setEntryPoint(EntryPointElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWebRuntime_EntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryPointElement getEntryPoint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WebRuntime#getEntryPoint <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' containment reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(EntryPointElement value);

} // WebRuntime

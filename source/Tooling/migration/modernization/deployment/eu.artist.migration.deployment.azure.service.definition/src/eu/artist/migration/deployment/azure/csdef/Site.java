/**
 */
package eu.artist.migration.deployment.azure.csdef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Defintion of a single IIS7 site associted with a Web Role
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Site#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getSite()
 * @model extendedMetaData="name='Site' kind='elementOnly'"
 * @generated
 */
public interface Site extends VirtualDirectory {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference.
	 * @see #setBindings(Bindings)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getSite_Bindings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bindings' namespace='##targetNamespace'"
	 * @generated
	 */
	Bindings getBindings();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Site#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(Bindings value);

} // Site

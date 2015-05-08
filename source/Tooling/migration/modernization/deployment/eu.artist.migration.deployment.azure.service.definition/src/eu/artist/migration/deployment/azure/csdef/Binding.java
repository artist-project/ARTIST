/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A site uses a list of bindings
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Binding#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Binding#getHostHeader <em>Host Header</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Binding#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getBinding()
 * @model extendedMetaData="name='Binding' kind='empty'"
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the endpooint on the Web Role
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint Name</em>' attribute.
	 * @see #setEndpointName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getBinding_EndpointName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='endpointName'"
	 * @generated
	 */
	String getEndpointName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Binding#getEndpointName <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Name</em>' attribute.
	 * @see #getEndpointName()
	 * @generated
	 */
	void setEndpointName(String value);

	/**
	 * Returns the value of the '<em><b>Host Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Host name used, if any.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Header</em>' attribute.
	 * @see #setHostHeader(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getBinding_HostHeader()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hostHeader'"
	 * @generated
	 */
	String getHostHeader();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Binding#getHostHeader <em>Host Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Header</em>' attribute.
	 * @see #getHostHeader()
	 * @generated
	 */
	void setHostHeader(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the binding.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getBinding_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Binding

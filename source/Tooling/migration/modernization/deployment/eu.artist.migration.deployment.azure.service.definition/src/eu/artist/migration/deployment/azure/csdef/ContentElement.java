/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Defines the contents of a role.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getSourceDirectory <em>Source Directory</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getContentElement()
 * @model extendedMetaData="name='ContentElement' kind='elementOnly'"
 * @generated
 */
public interface ContentElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Directory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Directory</em>' containment reference.
	 * @see #setSourceDirectory(SourceDirectoryElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getContentElement_SourceDirectory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceDirectoryElement getSourceDirectory();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getSourceDirectory <em>Source Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Directory</em>' containment reference.
	 * @see #getSourceDirectory()
	 * @generated
	 */
	void setSourceDirectory(SourceDirectoryElement value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Location to place the contents relative to "approot"
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getContentElement_Destination()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='destination'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.ContentElement#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

} // ContentElement

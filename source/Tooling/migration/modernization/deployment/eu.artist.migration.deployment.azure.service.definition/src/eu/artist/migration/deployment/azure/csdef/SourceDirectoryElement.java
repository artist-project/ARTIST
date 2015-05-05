/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Directory Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A local directory to recursively copy content from.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getSourceDirectoryElement()
 * @model extendedMetaData="name='SourceDirectoryElement' kind='empty'"
 * @generated
 */
public interface SourceDirectoryElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Relative or absolute path to a directory to copy from.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getSourceDirectoryElement_Path()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.SourceDirectoryElement#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // SourceDirectoryElement

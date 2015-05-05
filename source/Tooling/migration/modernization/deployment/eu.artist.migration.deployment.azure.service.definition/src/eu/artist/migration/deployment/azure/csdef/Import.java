/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Import#getModuleName <em>Module Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getImport()
 * @model extendedMetaData="name='Import' kind='empty'"
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the module to include.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getImport_ModuleName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString"
	 *        extendedMetaData="kind='attribute' name='moduleName'"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Import#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

} // Import

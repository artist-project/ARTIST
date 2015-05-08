/**
 */
package eu.artist.migration.deployment.azure.csdes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.Project#getToolsVersion <em>Tools Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.Project#getPropertyGroup <em>Property Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Tools Version</b></em>' attribute.
	 * The default value is <code>"12.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools Version</em>' attribute.
	 * @see #setToolsVersion(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getProject_ToolsVersion()
	 * @model default="12.0" required="true"
	 * @generated
	 */
	String getToolsVersion();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.Project#getToolsVersion <em>Tools Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools Version</em>' attribute.
	 * @see #getToolsVersion()
	 * @generated
	 */
	void setToolsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Property Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Group</em>' containment reference.
	 * @see #setPropertyGroup(PropertyGroup)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getProject_PropertyGroup()
	 * @model containment="true"
	 * @generated
	 */
	PropertyGroup getPropertyGroup();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.Project#getPropertyGroup <em>Property Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Group</em>' containment reference.
	 * @see #getPropertyGroup()
	 * @generated
	 */
	void setPropertyGroup(PropertyGroup value);

} // Project

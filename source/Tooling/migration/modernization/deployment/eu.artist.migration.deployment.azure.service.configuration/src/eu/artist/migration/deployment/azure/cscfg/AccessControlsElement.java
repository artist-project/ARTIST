/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Controls Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A list of AccessControls
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.AccessControlsElement#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getAccessControlsElement()
 * @model extendedMetaData="name='AccessControlsElement' kind='elementOnly'"
 * @generated
 */
public interface AccessControlsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.AccessControlElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getAccessControlsElement_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessControlElement> getAccessControl();

} // AccessControlsElement

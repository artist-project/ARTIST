/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Specifies a value based on the configuration of the current role instance.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement#getXpath <em>Xpath</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleInstanceValueElement()
 * @model extendedMetaData="name='RoleInstanceValueElement' kind='empty'"
 * @generated
 */
public interface RoleInstanceValueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           XPath that selects the a value from the instance configuration document.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath</em>' attribute.
	 * @see #setXpath(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRoleInstanceValueElement_Xpath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='xpath'"
	 * @generated
	 */
	String getXpath();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.RoleInstanceValueElement#getXpath <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' attribute.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(String value);

} // RoleInstanceValueElement

/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Security Group Ref Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getNetworkSecurityGroup <em>Network Security Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkSecurityGroupRefElement()
 * @model extendedMetaData="name='NetworkSecurityGroupRefElement' kind='elementOnly'"
 * @generated
 */
public interface NetworkSecurityGroupRefElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Security Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Security Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Security Group</em>' containment reference.
	 * @see #setNetworkSecurityGroup(NetworkSecurityGroupElement)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkSecurityGroupRefElement_NetworkSecurityGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NetworkSecurityGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkSecurityGroupElement getNetworkSecurityGroup();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getNetworkSecurityGroup <em>Network Security Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Security Group</em>' containment reference.
	 * @see #getNetworkSecurityGroup()
	 * @generated
	 */
	void setNetworkSecurityGroup(NetworkSecurityGroupElement value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkSecurityGroupRefElement_RoleName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='roleName'"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // NetworkSecurityGroupRefElement

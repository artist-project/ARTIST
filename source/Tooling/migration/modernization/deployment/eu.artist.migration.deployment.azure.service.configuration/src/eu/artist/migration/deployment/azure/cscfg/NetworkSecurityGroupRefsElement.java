/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Security Group Refs Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement#getNetworkSecurityGroupRef <em>Network Security Group Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkSecurityGroupRefsElement()
 * @model extendedMetaData="name='NetworkSecurityGroupRefsElement' kind='elementOnly'"
 * @generated
 */
public interface NetworkSecurityGroupRefsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Security Group Ref</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Security Group Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Security Group Ref</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getNetworkSecurityGroupRefsElement_NetworkSecurityGroupRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NetworkSecurityGroupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkSecurityGroupRefElement> getNetworkSecurityGroupRef();

} // NetworkSecurityGroupRefsElement

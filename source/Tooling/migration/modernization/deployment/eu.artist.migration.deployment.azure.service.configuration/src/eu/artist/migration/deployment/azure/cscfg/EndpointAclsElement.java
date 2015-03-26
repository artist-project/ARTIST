/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Acls Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The EndpontAcl associates an ACL to a role and endpoint combination
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement#getEndpointAcl <em>Endpoint Acl</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclsElement()
 * @model extendedMetaData="name='EndpointAclsElement' kind='elementOnly'"
 * @generated
 */
public interface EndpointAclsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Acl</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.EndpointAclType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Acl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Acl</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getEndpointAclsElement_EndpointAcl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndpointAcl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EndpointAclType> getEndpointAcl();

} // EndpointAclsElement

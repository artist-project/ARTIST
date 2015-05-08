/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnets Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.SubnetsElement#getSubnet <em>Subnet</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getSubnetsElement()
 * @model extendedMetaData="name='SubnetsElement' kind='elementOnly'"
 * @generated
 */
public interface SubnetsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.SubnetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getSubnetsElement_Subnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subnet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubnetElement> getSubnet();

} // SubnetsElement

/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Network Site Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getVirtualNetworkSiteElement()
 * @model extendedMetaData="name='VirtualNetworkSiteElement' kind='empty'"
 * @generated
 */
public interface VirtualNetworkSiteElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getVirtualNetworkSiteElement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VirtualNetworkSiteElement

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate Public Port From Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The set of ports used to public ports for instance input endpoints allocated from.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement#getFixedPortRange <em>Fixed Port Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getAllocatePublicPortFromElement()
 * @model extendedMetaData="name='AllocatePublicPortFromElement' kind='elementOnly'"
 * @generated
 */
public interface AllocatePublicPortFromElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Port Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Port Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Port Range</em>' containment reference.
	 * @see #setFixedPortRange(PortRange)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getAllocatePublicPortFromElement_FixedPortRange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FixedPortRange' namespace='##targetNamespace'"
	 * @generated
	 */
	PortRange getFixedPortRange();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement#getFixedPortRange <em>Fixed Port Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Port Range</em>' containment reference.
	 * @see #getFixedPortRange()
	 * @generated
	 */
	void setFixedPortRange(PortRange value);

} // AllocatePublicPortFromElement

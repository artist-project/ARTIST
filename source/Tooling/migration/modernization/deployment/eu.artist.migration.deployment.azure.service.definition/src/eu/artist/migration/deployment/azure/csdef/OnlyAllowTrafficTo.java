/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Only Allow Traffic To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Rule that allow the service to restrict traffic between roles
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getAllowAllTraffic <em>Allow All Traffic</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getWhenSource <em>When Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getOnlyAllowTrafficTo()
 * @model extendedMetaData="name='OnlyAllowTrafficTo' kind='elementOnly'"
 * @generated
 */
public interface OnlyAllowTrafficTo extends EObject {
	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' containment reference.
	 * @see #setDestinations(Destinations)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getOnlyAllowTrafficTo_Destinations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Destinations' namespace='##targetNamespace'"
	 * @generated
	 */
	Destinations getDestinations();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getDestinations <em>Destinations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destinations</em>' containment reference.
	 * @see #getDestinations()
	 * @generated
	 */
	void setDestinations(Destinations value);

	/**
	 * Returns the value of the '<em><b>Allow All Traffic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow All Traffic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow All Traffic</em>' containment reference.
	 * @see #setAllowAllTraffic(AllowAllTraffic)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getOnlyAllowTrafficTo_AllowAllTraffic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllowAllTraffic' namespace='##targetNamespace'"
	 * @generated
	 */
	AllowAllTraffic getAllowAllTraffic();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getAllowAllTraffic <em>Allow All Traffic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow All Traffic</em>' containment reference.
	 * @see #getAllowAllTraffic()
	 * @generated
	 */
	void setAllowAllTraffic(AllowAllTraffic value);

	/**
	 * Returns the value of the '<em><b>When Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Source</em>' containment reference.
	 * @see #setWhenSource(WhenSource)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getOnlyAllowTrafficTo_WhenSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WhenSource' namespace='##targetNamespace'"
	 * @generated
	 */
	WhenSource getWhenSource();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo#getWhenSource <em>When Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Source</em>' containment reference.
	 * @see #getWhenSource()
	 * @generated
	 */
	void setWhenSource(WhenSource value);

} // OnlyAllowTrafficTo

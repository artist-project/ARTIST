/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destinations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Destinations#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Destinations#getRoleEndpoint <em>Role Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDestinations()
 * @model extendedMetaData="name='Destinations' kind='elementOnly'"
 * @generated
 */
public interface Destinations extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDestinations_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Role Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.RoleEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Endpoint</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDestinations_RoleEndpoint()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RoleEndpoint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleEndpoint> getRoleEndpoint();

} // Destinations

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getFromRole <em>From Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWhenSource()
 * @model extendedMetaData="name='WhenSource' kind='elementOnly'"
 * @generated
 */
public interface WhenSource extends EObject {
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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWhenSource_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>From Role</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.FromRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Role</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWhenSource_FromRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FromRole' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FromRole> getFromRole();

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.MatchMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @see #isSetMatches()
	 * @see #unsetMatches()
	 * @see #setMatches(MatchMode)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getWhenSource_Matches()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='matches'"
	 * @generated
	 */
	MatchMode getMatches();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.MatchMode
	 * @see #isSetMatches()
	 * @see #unsetMatches()
	 * @see #getMatches()
	 * @generated
	 */
	void setMatches(MatchMode value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatches()
	 * @see #getMatches()
	 * @see #setMatches(MatchMode)
	 * @generated
	 */
	void unsetMatches();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.WhenSource#getMatches <em>Matches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Matches</em>' attribute is set.
	 * @see #unsetMatches()
	 * @see #getMatches()
	 * @see #setMatches(MatchMode)
	 * @generated
	 */
	boolean isSetMatches();

} // WhenSource

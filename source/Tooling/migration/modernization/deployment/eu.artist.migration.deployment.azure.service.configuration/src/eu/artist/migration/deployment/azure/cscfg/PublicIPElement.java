/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public IP Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getPublicIPElement()
 * @model extendedMetaData="name='PublicIPElement' kind='empty'"
 * @generated
 */
public interface PublicIPElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Idle Timeout In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Timeout In Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Timeout In Minutes</em>' attribute.
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getPublicIPElement_IdleTimeoutInMinutes()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.cscfg.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='idleTimeoutInMinutes'"
	 * @generated
	 */
	int getIdleTimeoutInMinutes();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout In Minutes</em>' attribute.
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @generated
	 */
	void setIdleTimeoutInMinutes(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @generated
	 */
	void unsetIdleTimeoutInMinutes();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Idle Timeout In Minutes</em>' attribute is set.
	 * @see #unsetIdleTimeoutInMinutes()
	 * @see #getIdleTimeoutInMinutes()
	 * @see #setIdleTimeoutInMinutes(int)
	 * @generated
	 */
	boolean isSetIdleTimeoutInMinutes();

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
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getPublicIPElement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.PublicIPElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PublicIPElement

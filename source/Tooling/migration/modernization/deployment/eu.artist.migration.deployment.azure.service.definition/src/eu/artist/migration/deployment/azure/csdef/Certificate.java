/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A certificate setting is the mapping of a named  certificate to its destination.
 *         The mapping from the name of the certificate to the actual certificate is defined in the service configuration file.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Certificate#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel <em>Permission Level</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreName <em>Store Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getCertificate()
 * @model extendedMetaData="name='Certificate' kind='empty'"
 * @generated
 */
public interface Certificate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the certificate.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getCertificate_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permission Level</b></em>' attribute.
	 * The default value is <code>"limitedOrElevated"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.PermissionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Set this to elevated to retrict access to elevated exceutionContext startup or runtime process to access the private key.
	 *           Set this to limitedOrElevated to allow both limited and elevated executionContext startup or runtime processes to access the private key
	 *           Default value is limitedOrElevated which is backwards compatible.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permission Level</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @see #isSetPermissionLevel()
	 * @see #unsetPermissionLevel()
	 * @see #setPermissionLevel(PermissionLevel)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getCertificate_PermissionLevel()
	 * @model default="limitedOrElevated" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='permissionLevel'"
	 * @generated
	 */
	PermissionLevel getPermissionLevel();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel <em>Permission Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Level</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.PermissionLevel
	 * @see #isSetPermissionLevel()
	 * @see #unsetPermissionLevel()
	 * @see #getPermissionLevel()
	 * @generated
	 */
	void setPermissionLevel(PermissionLevel value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel <em>Permission Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermissionLevel()
	 * @see #getPermissionLevel()
	 * @see #setPermissionLevel(PermissionLevel)
	 * @generated
	 */
	void unsetPermissionLevel();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getPermissionLevel <em>Permission Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permission Level</em>' attribute is set.
	 * @see #unsetPermissionLevel()
	 * @see #getPermissionLevel()
	 * @see #setPermissionLevel(PermissionLevel)
	 * @generated
	 */
	boolean isSetPermissionLevel();

	/**
	 * Returns the value of the '<em><b>Store Location</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.StoreLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The location of the store where the certificate needs to be deployed.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Store Location</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @see #isSetStoreLocation()
	 * @see #unsetStoreLocation()
	 * @see #setStoreLocation(StoreLocation)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getCertificate_StoreLocation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='storeLocation'"
	 * @generated
	 */
	StoreLocation getStoreLocation();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Location</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.StoreLocation
	 * @see #isSetStoreLocation()
	 * @see #unsetStoreLocation()
	 * @see #getStoreLocation()
	 * @generated
	 */
	void setStoreLocation(StoreLocation value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStoreLocation()
	 * @see #getStoreLocation()
	 * @see #setStoreLocation(StoreLocation)
	 * @generated
	 */
	void unsetStoreLocation();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreLocation <em>Store Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Store Location</em>' attribute is set.
	 * @see #unsetStoreLocation()
	 * @see #getStoreLocation()
	 * @see #setStoreLocation(StoreLocation)
	 * @generated
	 */
	boolean isSetStoreLocation();

	/**
	 * Returns the value of the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the store where the certificate needs to be deployed.
	 *           Either built in stores like My (for Personal), Root(for Trusted Root CA), CA (for Intermediate CA), Trust (for Enterprise Trust)
	 *           or a custom certificate store
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Store Name</em>' attribute.
	 * @see #setStoreName(Object)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getCertificate_StoreName()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.StoreName" required="true"
	 *        extendedMetaData="kind='attribute' name='storeName'"
	 * @generated
	 */
	Object getStoreName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Certificate#getStoreName <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Name</em>' attribute.
	 * @see #getStoreName()
	 * @generated
	 */
	void setStoreName(Object value);

} // Certificate

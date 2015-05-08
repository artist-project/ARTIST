/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Configuration of a local storage resource
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB <em>Size In MB</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLocalStore()
 * @model extendedMetaData="name='LocalStore' kind='empty'"
 * @generated
 */
public interface LocalStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Clean On Role Recycle</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Deletes the contents of the local storage on role recycle.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clean On Role Recycle</em>' attribute.
	 * @see #isSetCleanOnRoleRecycle()
	 * @see #unsetCleanOnRoleRecycle()
	 * @see #setCleanOnRoleRecycle(boolean)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLocalStore_CleanOnRoleRecycle()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='cleanOnRoleRecycle'"
	 * @generated
	 */
	boolean isCleanOnRoleRecycle();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean On Role Recycle</em>' attribute.
	 * @see #isSetCleanOnRoleRecycle()
	 * @see #unsetCleanOnRoleRecycle()
	 * @see #isCleanOnRoleRecycle()
	 * @generated
	 */
	void setCleanOnRoleRecycle(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCleanOnRoleRecycle()
	 * @see #isCleanOnRoleRecycle()
	 * @see #setCleanOnRoleRecycle(boolean)
	 * @generated
	 */
	void unsetCleanOnRoleRecycle();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clean On Role Recycle</em>' attribute is set.
	 * @see #unsetCleanOnRoleRecycle()
	 * @see #isCleanOnRoleRecycle()
	 * @see #setCleanOnRoleRecycle(boolean)
	 * @generated
	 */
	boolean isSetCleanOnRoleRecycle();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name of the resource. This is used by the role's code to map to a directory in the local file system.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLocalStore_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NamedElementNameString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size In MB</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The desired storage space (in MB)
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size In MB</em>' attribute.
	 * @see #isSetSizeInMB()
	 * @see #unsetSizeInMB()
	 * @see #setSizeInMB(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getLocalStore_SizeInMB()
	 * @model default="1000" unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='sizeInMB'"
	 * @generated
	 */
	int getSizeInMB();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB <em>Size In MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In MB</em>' attribute.
	 * @see #isSetSizeInMB()
	 * @see #unsetSizeInMB()
	 * @see #getSizeInMB()
	 * @generated
	 */
	void setSizeInMB(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB <em>Size In MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInMB()
	 * @see #getSizeInMB()
	 * @see #setSizeInMB(int)
	 * @generated
	 */
	void unsetSizeInMB();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.LocalStore#getSizeInMB <em>Size In MB</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In MB</em>' attribute is set.
	 * @see #unsetSizeInMB()
	 * @see #getSizeInMB()
	 * @see #setSizeInMB(int)
	 * @generated
	 */
	boolean isSetSizeInMB();

} // LocalStore

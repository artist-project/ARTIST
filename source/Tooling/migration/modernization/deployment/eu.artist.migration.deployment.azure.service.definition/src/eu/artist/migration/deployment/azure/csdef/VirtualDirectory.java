/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualDirectory <em>Virtual Directory</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getVirtualApplication <em>Virtual Application</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getPhysicalDirectory <em>Physical Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory()
 * @model extendedMetaData="name='VirtualDirectory' kind='elementOnly'"
 * @generated
 */
public interface VirtualDirectory extends EObject {
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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Virtual Directory</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Directory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Directory</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory_VirtualDirectory()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VirtualDirectory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VirtualDirectory> getVirtualDirectory();

	/**
	 * Returns the value of the '<em><b>Virtual Application</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Application</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Application</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory_VirtualApplication()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VirtualApplication' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VirtualDirectory> getVirtualApplication();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The name which is reflected in the virtual path
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.VirtualDirectoryName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Physical Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Location of the physical directory, can also be specified during packaging. 
	 *           A relative path is assumed to be relative to the location of the csdef.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Directory</em>' attribute.
	 * @see #setPhysicalDirectory(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVirtualDirectory_PhysicalDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='physicalDirectory'"
	 * @generated
	 */
	String getPhysicalDirectory();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.VirtualDirectory#getPhysicalDirectory <em>Physical Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Directory</em>' attribute.
	 * @see #getPhysicalDirectory()
	 * @generated
	 */
	void setPhysicalDirectory(String value);

} // VirtualDirectory

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getRoleModule <em>Role Module</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getServiceDefinition <em>Service Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Role Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Module</em>' containment reference.
	 * @see #setRoleModule(RoleModule)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot_RoleModule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RoleModule' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleModule getRoleModule();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getRoleModule <em>Role Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Module</em>' containment reference.
	 * @see #getRoleModule()
	 * @generated
	 */
	void setRoleModule(RoleModule value);

	/**
	 * Returns the value of the '<em><b>Service Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definition</em>' containment reference.
	 * @see #setServiceDefinition(ServiceDefinition)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getDocumentRoot_ServiceDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceDefinition getServiceDefinition();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.DocumentRoot#getServiceDefinition <em>Service Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Definition</em>' containment reference.
	 * @see #getServiceDefinition()
	 * @generated
	 */
	void setServiceDefinition(ServiceDefinition value);

} // DocumentRoot

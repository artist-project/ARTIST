/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         A certificate setting is a mapping of a name of a certificate to the identifying value (ie. SHA1 thumbprint).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprint <em>Thumbprint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificate()
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
	 *           The name of the certificate. The name should match the name of a certificate
	 *           declared in the service definition.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Thumbprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The digest (or thumbprint) of the certificate data used to uniquely identify a certificate.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbprint</em>' attribute.
	 * @see #setThumbprint(String)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificate_Thumbprint()
	 * @model dataType="eu.artist.migration.deployment.azure.cscfg.ThumbprintType" required="true"
	 *        extendedMetaData="kind='attribute' name='thumbprint'"
	 * @generated
	 */
	String getThumbprint();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprint <em>Thumbprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbprint</em>' attribute.
	 * @see #getThumbprint()
	 * @generated
	 */
	void setThumbprint(String value);

	/**
	 * Returns the value of the '<em><b>Thumbprint Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The hash algorithm that generates a digest of data (or thumbprint)
	 *           for digital signatures such as MD5, SHA1, SHA256. This is different than
	 *           the algorithm used in creating the signature inside the certificate.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbprint Algorithm</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @see #isSetThumbprintAlgorithm()
	 * @see #unsetThumbprintAlgorithm()
	 * @see #setThumbprintAlgorithm(ThumbprintAlgorithmTypes)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificate_ThumbprintAlgorithm()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='thumbprintAlgorithm'"
	 * @generated
	 */
	ThumbprintAlgorithmTypes getThumbprintAlgorithm();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbprint Algorithm</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes
	 * @see #isSetThumbprintAlgorithm()
	 * @see #unsetThumbprintAlgorithm()
	 * @see #getThumbprintAlgorithm()
	 * @generated
	 */
	void setThumbprintAlgorithm(ThumbprintAlgorithmTypes value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThumbprintAlgorithm()
	 * @see #getThumbprintAlgorithm()
	 * @see #setThumbprintAlgorithm(ThumbprintAlgorithmTypes)
	 * @generated
	 */
	void unsetThumbprintAlgorithm();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.Certificate#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thumbprint Algorithm</em>' attribute is set.
	 * @see #unsetThumbprintAlgorithm()
	 * @see #getThumbprintAlgorithm()
	 * @see #setThumbprintAlgorithm(ThumbprintAlgorithmTypes)
	 * @generated
	 */
	boolean isSetThumbprintAlgorithm();

} // Certificate

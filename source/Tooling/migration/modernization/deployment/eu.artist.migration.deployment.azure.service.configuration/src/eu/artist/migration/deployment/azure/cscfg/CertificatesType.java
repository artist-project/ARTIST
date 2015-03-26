/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.CertificatesType#getCertificate <em>Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificatesType()
 * @model extendedMetaData="name='Certificates_._type' kind='elementOnly'"
 * @generated
 */
public interface CertificatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.cscfg.Certificate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getCertificatesType_Certificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Certificate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Certificate> getCertificate();

} // CertificatesType

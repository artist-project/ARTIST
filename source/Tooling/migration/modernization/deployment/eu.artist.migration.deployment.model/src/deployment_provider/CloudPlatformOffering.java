/**
 */
package deployment_provider;

import deployment_app.ProgrammingLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Platform Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudPlatformOffering#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudPlatformOffering()
 * @model
 * @generated
 */
public interface CloudPlatformOffering extends CloudOffering {
	/**
	 * Returns the value of the '<em><b>Supported Languages</b></em>' attribute list.
	 * The list contents are of type {@link deployment_app.ProgrammingLanguage}.
	 * The literals are from the enumeration {@link deployment_app.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Languages</em>' attribute list.
	 * @see deployment_app.ProgrammingLanguage
	 * @see deployment_provider.Deployment_providerPackage#getCloudPlatformOffering_SupportedLanguages()
	 * @model required="true"
	 * @generated
	 */
	EList<ProgrammingLanguage> getSupportedLanguages();

} // CloudPlatformOffering

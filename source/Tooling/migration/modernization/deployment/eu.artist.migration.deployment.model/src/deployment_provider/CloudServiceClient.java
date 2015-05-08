/**
 */
package deployment_provider;

import deployment_app.ProgrammingLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudServiceClient#getSupportedInterfaces <em>Supported Interfaces</em>}</li>
 *   <li>{@link deployment_provider.CloudServiceClient#getName <em>Name</em>}</li>
 *   <li>{@link deployment_provider.CloudServiceClient#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudServiceClient()
 * @model
 * @generated
 */
public interface CloudServiceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported Interfaces</b></em>' attribute list.
	 * The list contents are of type {@link deployment_provider.ServiceInterface}.
	 * The literals are from the enumeration {@link deployment_provider.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Interfaces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Interfaces</em>' attribute list.
	 * @see deployment_provider.ServiceInterface
	 * @see deployment_provider.Deployment_providerPackage#getCloudServiceClient_SupportedInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceInterface> getSupportedInterfaces();

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
	 * @see deployment_provider.Deployment_providerPackage#getCloudServiceClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudServiceClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see deployment_provider.Deployment_providerPackage#getCloudServiceClient_SupportedLanguages()
	 * @model
	 * @generated
	 */
	EList<ProgrammingLanguage> getSupportedLanguages();

} // CloudServiceClient

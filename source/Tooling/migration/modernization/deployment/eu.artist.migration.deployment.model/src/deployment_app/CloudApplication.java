/**
 */
package deployment_app;

import deployment_provider.ApplicationFramework;
import deployment_provider.CloudOffering;
import deployment_provider.CloudService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_app.CloudApplication#getDeploymentUnits <em>Deployment Units</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getLanguage <em>Language</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getName <em>Name</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getRequiredFrameworks <em>Required Frameworks</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getHostedOnOffering <em>Hosted On Offering</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getComprisedComponents <em>Comprised Components</em>}</li>
 *   <li>{@link deployment_app.CloudApplication#getIsConfiguredBy <em>Is Configured By</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_app.Deployment_appPackage#getCloudApplication()
 * @model
 * @generated
 */
public interface CloudApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Units</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_app.CloudApplicationDeploymentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Units</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_DeploymentUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudApplicationDeploymentUnit> getDeploymentUnits();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_app.ProgrammingLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see deployment_app.ProgrammingLanguage
	 * @see #setLanguage(ProgrammingLanguage)
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_Language()
	 * @model
	 * @generated
	 */
	ProgrammingLanguage getLanguage();

	/**
	 * Sets the value of the '{@link deployment_app.CloudApplication#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see deployment_app.ProgrammingLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ProgrammingLanguage value);

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
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment_app.CloudApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Frameworks</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.ApplicationFramework}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Frameworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Frameworks</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_RequiredFrameworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationFramework> getRequiredFrameworks();

	/**
	 * Returns the value of the '<em><b>Hosted On Offering</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudOffering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted On Offering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted On Offering</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_HostedOnOffering()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudOffering> getHostedOnOffering();

	/**
	 * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Services</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_RequiredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudService> getRequiredServices();

	/**
	 * Returns the value of the '<em><b>Comprised Components</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_app.ApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprised Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprised Components</em>' containment reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_ComprisedComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationComponent> getComprisedComponents();

	/**
	 * Returns the value of the '<em><b>Is Configured By</b></em>' reference list.
	 * The list contents are of type {@link deployment_app.ApplicationDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Configured By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Configured By</em>' reference list.
	 * @see deployment_app.Deployment_appPackage#getCloudApplication_IsConfiguredBy()
	 * @model
	 * @generated
	 */
	EList<ApplicationDescriptor> getIsConfiguredBy();

} // CloudApplication

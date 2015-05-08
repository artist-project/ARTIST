/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudOffering#getOfferedServices <em>Offered Services</em>}</li>
 *   <li>{@link deployment_provider.CloudOffering#getOfferedFrameworks <em>Offered Frameworks</em>}</li>
 *   <li>{@link deployment_provider.CloudOffering#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudOffering()
 * @model abstract="true"
 * @generated
 */
public interface CloudOffering extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Services</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Services</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudOffering_OfferedServices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudService> getOfferedServices();

	/**
	 * Returns the value of the '<em><b>Offered Frameworks</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.Framework}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Frameworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Frameworks</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudOffering_OfferedFrameworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Framework> getOfferedFrameworks();

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
	 * @see deployment_provider.Deployment_providerPackage#getCloudOffering_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudOffering#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CloudOffering

/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudProvider#getOfferings <em>Offerings</em>}</li>
 *   <li>{@link deployment_provider.CloudProvider#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudProvider()
 * @model
 * @generated
 */
public interface CloudProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Offerings</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudOffering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offerings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offerings</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getCloudProvider_Offerings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudOffering> getOfferings();

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
	 * @see deployment_provider.Deployment_providerPackage#getCloudProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CloudProvider

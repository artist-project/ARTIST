/**
 */
package deployment_provider;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Infrastructure Virtual Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.CloudInfrastructureVirtualInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureVirtualInstance()
 * @model
 * @generated
 */
public interface CloudInfrastructureVirtualInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_provider.VirtualInstanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.VirtualInstanceType
	 * @see #setType(VirtualInstanceType)
	 * @see deployment_provider.Deployment_providerPackage#getCloudInfrastructureVirtualInstance_Type()
	 * @model
	 * @generated
	 */
	VirtualInstanceType getType();

	/**
	 * Sets the value of the '{@link deployment_provider.CloudInfrastructureVirtualInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see deployment_provider.VirtualInstanceType
	 * @see #getType()
	 * @generated
	 */
	void setType(VirtualInstanceType value);

} // CloudInfrastructureVirtualInstance

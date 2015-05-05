/**
 */
package deployment_app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Application Platform Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_app.CloudApplicationPlatformDeploymentUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_app.Deployment_appPackage#getCloudApplicationPlatformDeploymentUnit()
 * @model
 * @generated
 */
public interface CloudApplicationPlatformDeploymentUnit extends CloudApplicationDeploymentUnit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_app.PlatformDeploymentUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see deployment_app.PlatformDeploymentUnitType
	 * @see #setType(PlatformDeploymentUnitType)
	 * @see deployment_app.Deployment_appPackage#getCloudApplicationPlatformDeploymentUnit_Type()
	 * @model required="true"
	 * @generated
	 */
	PlatformDeploymentUnitType getType();

	/**
	 * Sets the value of the '{@link deployment_app.CloudApplicationPlatformDeploymentUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see deployment_app.PlatformDeploymentUnitType
	 * @see #getType()
	 * @generated
	 */
	void setType(PlatformDeploymentUnitType value);

} // CloudApplicationPlatformDeploymentUnit

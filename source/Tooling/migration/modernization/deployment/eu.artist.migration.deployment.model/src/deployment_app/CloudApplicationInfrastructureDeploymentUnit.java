/**
 */
package deployment_app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Application Infrastructure Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_app.CloudApplicationInfrastructureDeploymentUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_app.Deployment_appPackage#getCloudApplicationInfrastructureDeploymentUnit()
 * @model
 * @generated
 */
public interface CloudApplicationInfrastructureDeploymentUnit extends CloudApplicationDeploymentUnit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_app.InfrastructureDeploymentUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see deployment_app.InfrastructureDeploymentUnitType
	 * @see #setType(InfrastructureDeploymentUnitType)
	 * @see deployment_app.Deployment_appPackage#getCloudApplicationInfrastructureDeploymentUnit_Type()
	 * @model required="true"
	 * @generated
	 */
	InfrastructureDeploymentUnitType getType();

	/**
	 * Sets the value of the '{@link deployment_app.CloudApplicationInfrastructureDeploymentUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see deployment_app.InfrastructureDeploymentUnitType
	 * @see #getType()
	 * @generated
	 */
	void setType(InfrastructureDeploymentUnitType value);

} // CloudApplicationInfrastructureDeploymentUnit

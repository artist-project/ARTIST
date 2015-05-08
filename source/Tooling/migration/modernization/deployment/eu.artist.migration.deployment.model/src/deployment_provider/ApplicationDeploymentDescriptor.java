/**
 */
package deployment_provider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.ApplicationDeploymentDescriptor#getTopology <em>Topology</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getApplicationDeploymentDescriptor()
 * @model
 * @generated
 */
public interface ApplicationDeploymentDescriptor extends DeploymentDescriptor {
	/**
	 * Returns the value of the '<em><b>Topology</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment_provider.ApplicationTopology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' attribute.
	 * @see deployment_provider.ApplicationTopology
	 * @see #setTopology(ApplicationTopology)
	 * @see deployment_provider.Deployment_providerPackage#getApplicationDeploymentDescriptor_Topology()
	 * @model required="true"
	 * @generated
	 */
	ApplicationTopology getTopology();

	/**
	 * Sets the value of the '{@link deployment_provider.ApplicationDeploymentDescriptor#getTopology <em>Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' attribute.
	 * @see deployment_provider.ApplicationTopology
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(ApplicationTopology value);

} // ApplicationDeploymentDescriptor

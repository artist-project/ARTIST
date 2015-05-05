/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.DeploymentDescriptor#getReliesOnRecipe <em>Relies On Recipe</em>}</li>
 *   <li>{@link deployment_provider.DeploymentDescriptor#getReliesOnTemplate <em>Relies On Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getDeploymentDescriptor()
 * @model
 * @generated
 */
public interface DeploymentDescriptor extends ServiceConfigurationDescriptor {
	/**
	 * Returns the value of the '<em><b>Relies On Recipe</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.DeploymentRecipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relies On Recipe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relies On Recipe</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getDeploymentDescriptor_ReliesOnRecipe()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentRecipe> getReliesOnRecipe();

	/**
	 * Returns the value of the '<em><b>Relies On Template</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.DeploymentTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relies On Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relies On Template</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getDeploymentDescriptor_ReliesOnTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentTemplate> getReliesOnTemplate();

} // DeploymentDescriptor

/**
 */
package deployment_provider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment_provider.Stack#getLayers <em>Layers</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment_provider.Deployment_providerPackage#getStack()
 * @model
 * @generated
 */
public interface Stack extends EObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link deployment_provider.CloudInfrastructureVirtualCluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see deployment_provider.Deployment_providerPackage#getStack_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudInfrastructureVirtualCluster> getLayers();

} // Stack

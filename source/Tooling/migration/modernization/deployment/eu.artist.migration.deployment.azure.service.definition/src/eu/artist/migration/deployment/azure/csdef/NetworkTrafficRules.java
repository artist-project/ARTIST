/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Traffic Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Definition of rules that allow the control of interrole traffic.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules#getOnlyAllowTrafficTo <em>Only Allow Traffic To</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getNetworkTrafficRules()
 * @model extendedMetaData="name='NetworkTrafficRules' kind='elementOnly'"
 * @generated
 */
public interface NetworkTrafficRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Only Allow Traffic To</b></em>' containment reference list.
	 * The list contents are of type {@link eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Allow Traffic To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Allow Traffic To</em>' containment reference list.
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getNetworkTrafficRules_OnlyAllowTrafficTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OnlyAllowTrafficTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnlyAllowTrafficTo> getOnlyAllowTrafficTo();

} // NetworkTrafficRules

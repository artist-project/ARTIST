/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Variable#getRoleInstanceValue <em>Role Instance Value</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Variable#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Variable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVariable()
 * @model extendedMetaData="name='Variable' kind='elementOnly'"
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Instance Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Instance Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instance Value</em>' containment reference.
	 * @see #setRoleInstanceValue(RoleInstanceValueElement)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVariable_RoleInstanceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleInstanceValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleInstanceValueElement getRoleInstanceValue();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Variable#getRoleInstanceValue <em>Role Instance Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Instance Value</em>' containment reference.
	 * @see #getRoleInstanceValue()
	 * @generated
	 */
	void setRoleInstanceValue(RoleInstanceValueElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Specifies that name of the environment variable.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVariable_Name()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Specifies that name of the value of the envrironment value.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getVariable_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Variable

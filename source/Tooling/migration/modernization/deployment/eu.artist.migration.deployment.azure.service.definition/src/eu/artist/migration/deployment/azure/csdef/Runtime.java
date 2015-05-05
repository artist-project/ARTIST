/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Controls the runtime environment of the Windows Azure host process.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Runtime#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRuntime()
 * @model extendedMetaData="name='Runtime' kind='elementOnly'"
 * @generated
 */
public interface Runtime extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRuntime_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Environment' namespace='##targetNamespace'"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Execution Context</b></em>' attribute.
	 * The default value is <code>"limited"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.ExecutionContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Context</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @see #isSetExecutionContext()
	 * @see #unsetExecutionContext()
	 * @see #setExecutionContext(ExecutionContext)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getRuntime_ExecutionContext()
	 * @model default="limited" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='executionContext'"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.ExecutionContext
	 * @see #isSetExecutionContext()
	 * @see #unsetExecutionContext()
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(ExecutionContext value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionContext()
	 * @see #getExecutionContext()
	 * @see #setExecutionContext(ExecutionContext)
	 * @generated
	 */
	void unsetExecutionContext();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.Runtime#getExecutionContext <em>Execution Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Context</em>' attribute is set.
	 * @see #unsetExecutionContext()
	 * @see #getExecutionContext()
	 * @see #setExecutionContext(ExecutionContext)
	 * @generated
	 */
	boolean isSetExecutionContext();

} // Runtime

/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Task#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Task#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.Task#getTaskType <em>Task Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
public interface Task extends EObject {
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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTask_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Environment' namespace='##targetNamespace'"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Line</em>' attribute.
	 * @see #setCommandLine(String)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTask_CommandLine()
	 * @model dataType="eu.artist.migration.deployment.azure.csdef.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='commandLine'"
	 * @generated
	 */
	String getCommandLine();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getCommandLine <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line</em>' attribute.
	 * @see #getCommandLine()
	 * @generated
	 */
	void setCommandLine(String value);

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
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTask_ExecutionContext()
	 * @model default="limited" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='executionContext'"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext <em>Execution Context</em>}' attribute.
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
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionContext()
	 * @see #getExecutionContext()
	 * @see #setExecutionContext(ExecutionContext)
	 * @generated
	 */
	void unsetExecutionContext();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getExecutionContext <em>Execution Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Context</em>' attribute is set.
	 * @see #unsetExecutionContext()
	 * @see #getExecutionContext()
	 * @see #setExecutionContext(ExecutionContext)
	 * @generated
	 */
	boolean isSetExecutionContext();

	/**
	 * Returns the value of the '<em><b>Task Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link eu.artist.migration.deployment.azure.csdef.TaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Type</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @see #isSetTaskType()
	 * @see #unsetTaskType()
	 * @see #setTaskType(TaskType)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getTask_TaskType()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='taskType'"
	 * @generated
	 */
	TaskType getTaskType();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Type</em>' attribute.
	 * @see eu.artist.migration.deployment.azure.csdef.TaskType
	 * @see #isSetTaskType()
	 * @see #unsetTaskType()
	 * @see #getTaskType()
	 * @generated
	 */
	void setTaskType(TaskType value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getTaskType <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaskType()
	 * @see #getTaskType()
	 * @see #setTaskType(TaskType)
	 * @generated
	 */
	void unsetTaskType();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.Task#getTaskType <em>Task Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Task Type</em>' attribute is set.
	 * @see #unsetTaskType()
	 * @see #getTaskType()
	 * @see #setTaskType(TaskType)
	 * @generated
	 */
	boolean isSetTaskType();

} // Task

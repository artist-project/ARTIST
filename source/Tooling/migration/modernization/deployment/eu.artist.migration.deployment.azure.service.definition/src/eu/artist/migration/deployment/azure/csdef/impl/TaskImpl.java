/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Environment;
import eu.artist.migration.deployment.azure.csdef.ExecutionContext;
import eu.artist.migration.deployment.azure.csdef.Task;
import eu.artist.migration.deployment.azure.csdef.TaskType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.TaskImpl#getTaskType <em>Task Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The default value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected String commandLine = COMMAND_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionContext() <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionContext EXECUTION_CONTEXT_EDEFAULT = ExecutionContext.LIMITED;

	/**
	 * The cached value of the '{@link #getExecutionContext() <em>Execution Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionContext()
	 * @generated
	 * @ordered
	 */
	protected ExecutionContext executionContext = EXECUTION_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Execution Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executionContextESet;

	/**
	 * The default value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected static final TaskType TASK_TYPE_EDEFAULT = TaskType.SIMPLE;

	/**
	 * The cached value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected TaskType taskType = TASK_TYPE_EDEFAULT;

	/**
	 * This is true if the Task Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taskTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.TASK__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.TASK__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.TASK__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.TASK__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandLine() {
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandLine(String newCommandLine) {
		String oldCommandLine = commandLine;
		commandLine = newCommandLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.TASK__COMMAND_LINE, oldCommandLine, commandLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext getExecutionContext() {
		return executionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(ExecutionContext newExecutionContext) {
		ExecutionContext oldExecutionContext = executionContext;
		executionContext = newExecutionContext == null ? EXECUTION_CONTEXT_EDEFAULT : newExecutionContext;
		boolean oldExecutionContextESet = executionContextESet;
		executionContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.TASK__EXECUTION_CONTEXT, oldExecutionContext, executionContext, !oldExecutionContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecutionContext() {
		ExecutionContext oldExecutionContext = executionContext;
		boolean oldExecutionContextESet = executionContextESet;
		executionContext = EXECUTION_CONTEXT_EDEFAULT;
		executionContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.TASK__EXECUTION_CONTEXT, oldExecutionContext, EXECUTION_CONTEXT_EDEFAULT, oldExecutionContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutionContext() {
		return executionContextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType getTaskType() {
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskType(TaskType newTaskType) {
		TaskType oldTaskType = taskType;
		taskType = newTaskType == null ? TASK_TYPE_EDEFAULT : newTaskType;
		boolean oldTaskTypeESet = taskTypeESet;
		taskTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.TASK__TASK_TYPE, oldTaskType, taskType, !oldTaskTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaskType() {
		TaskType oldTaskType = taskType;
		boolean oldTaskTypeESet = taskTypeESet;
		taskType = TASK_TYPE_EDEFAULT;
		taskTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.TASK__TASK_TYPE, oldTaskType, TASK_TYPE_EDEFAULT, oldTaskTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaskType() {
		return taskTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.TASK__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.TASK__ENVIRONMENT:
				return getEnvironment();
			case AzureCSDefPackage.TASK__COMMAND_LINE:
				return getCommandLine();
			case AzureCSDefPackage.TASK__EXECUTION_CONTEXT:
				return getExecutionContext();
			case AzureCSDefPackage.TASK__TASK_TYPE:
				return getTaskType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AzureCSDefPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case AzureCSDefPackage.TASK__COMMAND_LINE:
				setCommandLine((String)newValue);
				return;
			case AzureCSDefPackage.TASK__EXECUTION_CONTEXT:
				setExecutionContext((ExecutionContext)newValue);
				return;
			case AzureCSDefPackage.TASK__TASK_TYPE:
				setTaskType((TaskType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AzureCSDefPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case AzureCSDefPackage.TASK__COMMAND_LINE:
				setCommandLine(COMMAND_LINE_EDEFAULT);
				return;
			case AzureCSDefPackage.TASK__EXECUTION_CONTEXT:
				unsetExecutionContext();
				return;
			case AzureCSDefPackage.TASK__TASK_TYPE:
				unsetTaskType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AzureCSDefPackage.TASK__ENVIRONMENT:
				return environment != null;
			case AzureCSDefPackage.TASK__COMMAND_LINE:
				return COMMAND_LINE_EDEFAULT == null ? commandLine != null : !COMMAND_LINE_EDEFAULT.equals(commandLine);
			case AzureCSDefPackage.TASK__EXECUTION_CONTEXT:
				return isSetExecutionContext();
			case AzureCSDefPackage.TASK__TASK_TYPE:
				return isSetTaskType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commandLine: ");
		result.append(commandLine);
		result.append(", executionContext: ");
		if (executionContextESet) result.append(executionContext); else result.append("<unset>");
		result.append(", taskType: ");
		if (taskTypeESet) result.append(taskType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskImpl

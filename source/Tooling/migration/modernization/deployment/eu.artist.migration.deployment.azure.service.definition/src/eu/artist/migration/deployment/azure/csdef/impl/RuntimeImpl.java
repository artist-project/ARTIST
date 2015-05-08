/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Environment;
import eu.artist.migration.deployment.azure.csdef.ExecutionContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RuntimeImpl#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeImpl extends MinimalEObjectImpl.Container implements eu.artist.migration.deployment.azure.csdef.Runtime {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.RUNTIME;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.RUNTIME__ENVIRONMENT, oldEnvironment, newEnvironment);
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
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.RUNTIME__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.RUNTIME__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.RUNTIME__ENVIRONMENT, newEnvironment, newEnvironment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT, oldExecutionContext, executionContext, !oldExecutionContextESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT, oldExecutionContext, EXECUTION_CONTEXT_EDEFAULT, oldExecutionContextESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.RUNTIME__ENVIRONMENT:
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
			case AzureCSDefPackage.RUNTIME__ENVIRONMENT:
				return getEnvironment();
			case AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT:
				return getExecutionContext();
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
			case AzureCSDefPackage.RUNTIME__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT:
				setExecutionContext((ExecutionContext)newValue);
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
			case AzureCSDefPackage.RUNTIME__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT:
				unsetExecutionContext();
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
			case AzureCSDefPackage.RUNTIME__ENVIRONMENT:
				return environment != null;
			case AzureCSDefPackage.RUNTIME__EXECUTION_CONTEXT:
				return isSetExecutionContext();
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
		result.append(" (executionContext: ");
		if (executionContextESet) result.append(executionContext); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RuntimeImpl

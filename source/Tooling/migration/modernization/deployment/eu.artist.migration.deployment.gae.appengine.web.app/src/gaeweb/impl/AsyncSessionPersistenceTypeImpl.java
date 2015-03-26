/**
 */
package gaeweb.impl;

import gaeweb.AsyncSessionPersistenceType;
import gaeweb.GaewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async Session Persistence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.AsyncSessionPersistenceTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gaeweb.impl.AsyncSessionPersistenceTypeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link gaeweb.impl.AsyncSessionPersistenceTypeImpl#getQueueName <em>Queue Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsyncSessionPersistenceTypeImpl extends MinimalEObjectImpl.Container implements AsyncSessionPersistenceType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected String queueName = QUEUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsyncSessionPersistenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.ASYNC_SESSION_PERSISTENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueName(String newQueueName) {
		String oldQueueName = queueName;
		queueName = newQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME, oldQueueName, queueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__VALUE:
				return getValue();
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED:
				return isEnabled();
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME:
				return getQueueName();
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
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME:
				setQueueName((String)newValue);
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
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED:
				unsetEnabled();
				return;
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME:
				setQueueName(QUEUE_NAME_EDEFAULT);
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
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED:
				return isSetEnabled();
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME:
				return QUEUE_NAME_EDEFAULT == null ? queueName != null : !QUEUE_NAME_EDEFAULT.equals(queueName);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", queueName: ");
		result.append(queueName);
		result.append(')');
		return result.toString();
	}

} //AsyncSessionPersistenceTypeImpl

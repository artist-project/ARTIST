/**
 */
package gaeweb.impl;

import gaeweb.BasicScalingType;
import gaeweb.GaewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.BasicScalingTypeImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link gaeweb.impl.BasicScalingTypeImpl#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicScalingTypeImpl extends MinimalEObjectImpl.Container implements BasicScalingType {
	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected String maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String IDLE_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected String idleTimeout = IDLE_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicScalingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.BASIC_SCALING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(String newMaxInstances) {
		String oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.BASIC_SCALING_TYPE__MAX_INSTANCES, oldMaxInstances, maxInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdleTimeout() {
		return idleTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdleTimeout(String newIdleTimeout) {
		String oldIdleTimeout = idleTimeout;
		idleTimeout = newIdleTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.BASIC_SCALING_TYPE__IDLE_TIMEOUT, oldIdleTimeout, idleTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.BASIC_SCALING_TYPE__MAX_INSTANCES:
				return getMaxInstances();
			case GaewebPackage.BASIC_SCALING_TYPE__IDLE_TIMEOUT:
				return getIdleTimeout();
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
			case GaewebPackage.BASIC_SCALING_TYPE__MAX_INSTANCES:
				setMaxInstances((String)newValue);
				return;
			case GaewebPackage.BASIC_SCALING_TYPE__IDLE_TIMEOUT:
				setIdleTimeout((String)newValue);
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
			case GaewebPackage.BASIC_SCALING_TYPE__MAX_INSTANCES:
				setMaxInstances(MAX_INSTANCES_EDEFAULT);
				return;
			case GaewebPackage.BASIC_SCALING_TYPE__IDLE_TIMEOUT:
				setIdleTimeout(IDLE_TIMEOUT_EDEFAULT);
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
			case GaewebPackage.BASIC_SCALING_TYPE__MAX_INSTANCES:
				return MAX_INSTANCES_EDEFAULT == null ? maxInstances != null : !MAX_INSTANCES_EDEFAULT.equals(maxInstances);
			case GaewebPackage.BASIC_SCALING_TYPE__IDLE_TIMEOUT:
				return IDLE_TIMEOUT_EDEFAULT == null ? idleTimeout != null : !IDLE_TIMEOUT_EDEFAULT.equals(idleTimeout);
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
		result.append(" (maxInstances: ");
		result.append(maxInstances);
		result.append(", idleTimeout: ");
		result.append(idleTimeout);
		result.append(')');
		return result.toString();
	}

} //BasicScalingTypeImpl

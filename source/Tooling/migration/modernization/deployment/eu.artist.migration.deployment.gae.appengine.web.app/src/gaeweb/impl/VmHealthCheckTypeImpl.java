/**
 */
package gaeweb.impl;

import gaeweb.GaewebPackage;
import gaeweb.VmHealthCheckType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm Health Check Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#isEnableHealthCheck <em>Enable Health Check</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getCheckIntervalSec <em>Check Interval Sec</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getTimeoutSec <em>Timeout Sec</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getRestartThreshold <em>Restart Threshold</em>}</li>
 *   <li>{@link gaeweb.impl.VmHealthCheckTypeImpl#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VmHealthCheckTypeImpl extends MinimalEObjectImpl.Container implements VmHealthCheckType {
	/**
	 * The default value of the '{@link #isEnableHealthCheck() <em>Enable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_HEALTH_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableHealthCheck() <em>Enable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean enableHealthCheck = ENABLE_HEALTH_CHECK_EDEFAULT;

	/**
	 * This is true if the Enable Health Check attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableHealthCheckESet;

	/**
	 * The default value of the '{@link #getCheckIntervalSec() <em>Check Interval Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIntervalSec()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECK_INTERVAL_SEC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCheckIntervalSec() <em>Check Interval Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckIntervalSec()
	 * @generated
	 * @ordered
	 */
	protected long checkIntervalSec = CHECK_INTERVAL_SEC_EDEFAULT;

	/**
	 * This is true if the Check Interval Sec attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkIntervalSecESet;

	/**
	 * The default value of the '{@link #getTimeoutSec() <em>Timeout Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutSec()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_SEC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeoutSec() <em>Timeout Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutSec()
	 * @generated
	 * @ordered
	 */
	protected long timeoutSec = TIMEOUT_SEC_EDEFAULT;

	/**
	 * This is true if the Timeout Sec attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutSecESet;

	/**
	 * The default value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final long UNHEALTHY_THRESHOLD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected long unhealthyThreshold = UNHEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * This is true if the Unhealthy Threshold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unhealthyThresholdESet;

	/**
	 * The default value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final long HEALTHY_THRESHOLD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected long healthyThreshold = HEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * This is true if the Healthy Threshold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean healthyThresholdESet;

	/**
	 * The default value of the '{@link #getRestartThreshold() <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final long RESTART_THRESHOLD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRestartThreshold() <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartThreshold()
	 * @generated
	 * @ordered
	 */
	protected long restartThreshold = RESTART_THRESHOLD_EDEFAULT;

	/**
	 * This is true if the Restart Threshold attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restartThresholdESet;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmHealthCheckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.VM_HEALTH_CHECK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableHealthCheck() {
		return enableHealthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableHealthCheck(boolean newEnableHealthCheck) {
		boolean oldEnableHealthCheck = enableHealthCheck;
		enableHealthCheck = newEnableHealthCheck;
		boolean oldEnableHealthCheckESet = enableHealthCheckESet;
		enableHealthCheckESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK, oldEnableHealthCheck, enableHealthCheck, !oldEnableHealthCheckESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableHealthCheck() {
		boolean oldEnableHealthCheck = enableHealthCheck;
		boolean oldEnableHealthCheckESet = enableHealthCheckESet;
		enableHealthCheck = ENABLE_HEALTH_CHECK_EDEFAULT;
		enableHealthCheckESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK, oldEnableHealthCheck, ENABLE_HEALTH_CHECK_EDEFAULT, oldEnableHealthCheckESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableHealthCheck() {
		return enableHealthCheckESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckIntervalSec() {
		return checkIntervalSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckIntervalSec(long newCheckIntervalSec) {
		long oldCheckIntervalSec = checkIntervalSec;
		checkIntervalSec = newCheckIntervalSec;
		boolean oldCheckIntervalSecESet = checkIntervalSecESet;
		checkIntervalSecESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC, oldCheckIntervalSec, checkIntervalSec, !oldCheckIntervalSecESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckIntervalSec() {
		long oldCheckIntervalSec = checkIntervalSec;
		boolean oldCheckIntervalSecESet = checkIntervalSecESet;
		checkIntervalSec = CHECK_INTERVAL_SEC_EDEFAULT;
		checkIntervalSecESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC, oldCheckIntervalSec, CHECK_INTERVAL_SEC_EDEFAULT, oldCheckIntervalSecESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckIntervalSec() {
		return checkIntervalSecESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeoutSec() {
		return timeoutSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutSec(long newTimeoutSec) {
		long oldTimeoutSec = timeoutSec;
		timeoutSec = newTimeoutSec;
		boolean oldTimeoutSecESet = timeoutSecESet;
		timeoutSecESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC, oldTimeoutSec, timeoutSec, !oldTimeoutSecESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeoutSec() {
		long oldTimeoutSec = timeoutSec;
		boolean oldTimeoutSecESet = timeoutSecESet;
		timeoutSec = TIMEOUT_SEC_EDEFAULT;
		timeoutSecESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC, oldTimeoutSec, TIMEOUT_SEC_EDEFAULT, oldTimeoutSecESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeoutSec() {
		return timeoutSecESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUnhealthyThreshold() {
		return unhealthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnhealthyThreshold(long newUnhealthyThreshold) {
		long oldUnhealthyThreshold = unhealthyThreshold;
		unhealthyThreshold = newUnhealthyThreshold;
		boolean oldUnhealthyThresholdESet = unhealthyThresholdESet;
		unhealthyThresholdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD, oldUnhealthyThreshold, unhealthyThreshold, !oldUnhealthyThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnhealthyThreshold() {
		long oldUnhealthyThreshold = unhealthyThreshold;
		boolean oldUnhealthyThresholdESet = unhealthyThresholdESet;
		unhealthyThreshold = UNHEALTHY_THRESHOLD_EDEFAULT;
		unhealthyThresholdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD, oldUnhealthyThreshold, UNHEALTHY_THRESHOLD_EDEFAULT, oldUnhealthyThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnhealthyThreshold() {
		return unhealthyThresholdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHealthyThreshold() {
		return healthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthyThreshold(long newHealthyThreshold) {
		long oldHealthyThreshold = healthyThreshold;
		healthyThreshold = newHealthyThreshold;
		boolean oldHealthyThresholdESet = healthyThresholdESet;
		healthyThresholdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD, oldHealthyThreshold, healthyThreshold, !oldHealthyThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHealthyThreshold() {
		long oldHealthyThreshold = healthyThreshold;
		boolean oldHealthyThresholdESet = healthyThresholdESet;
		healthyThreshold = HEALTHY_THRESHOLD_EDEFAULT;
		healthyThresholdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD, oldHealthyThreshold, HEALTHY_THRESHOLD_EDEFAULT, oldHealthyThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHealthyThreshold() {
		return healthyThresholdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRestartThreshold() {
		return restartThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartThreshold(long newRestartThreshold) {
		long oldRestartThreshold = restartThreshold;
		restartThreshold = newRestartThreshold;
		boolean oldRestartThresholdESet = restartThresholdESet;
		restartThresholdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD, oldRestartThreshold, restartThreshold, !oldRestartThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestartThreshold() {
		long oldRestartThreshold = restartThreshold;
		boolean oldRestartThresholdESet = restartThresholdESet;
		restartThreshold = RESTART_THRESHOLD_EDEFAULT;
		restartThresholdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD, oldRestartThreshold, RESTART_THRESHOLD_EDEFAULT, oldRestartThresholdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestartThreshold() {
		return restartThresholdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.VM_HEALTH_CHECK_TYPE__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK:
				return isEnableHealthCheck();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC:
				return getCheckIntervalSec();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC:
				return getTimeoutSec();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD:
				return getUnhealthyThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD:
				return getHealthyThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD:
				return getRestartThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HOST:
				return getHost();
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
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK:
				setEnableHealthCheck((Boolean)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC:
				setCheckIntervalSec((Long)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC:
				setTimeoutSec((Long)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD:
				setUnhealthyThreshold((Long)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD:
				setHealthyThreshold((Long)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD:
				setRestartThreshold((Long)newValue);
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HOST:
				setHost((String)newValue);
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
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK:
				unsetEnableHealthCheck();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC:
				unsetCheckIntervalSec();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC:
				unsetTimeoutSec();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD:
				unsetUnhealthyThreshold();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD:
				unsetHealthyThreshold();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD:
				unsetRestartThreshold();
				return;
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HOST:
				setHost(HOST_EDEFAULT);
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
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK:
				return isSetEnableHealthCheck();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC:
				return isSetCheckIntervalSec();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC:
				return isSetTimeoutSec();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD:
				return isSetUnhealthyThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD:
				return isSetHealthyThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD:
				return isSetRestartThreshold();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
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
		result.append(" (enableHealthCheck: ");
		if (enableHealthCheckESet) result.append(enableHealthCheck); else result.append("<unset>");
		result.append(", checkIntervalSec: ");
		if (checkIntervalSecESet) result.append(checkIntervalSec); else result.append("<unset>");
		result.append(", timeoutSec: ");
		if (timeoutSecESet) result.append(timeoutSec); else result.append("<unset>");
		result.append(", unhealthyThreshold: ");
		if (unhealthyThresholdESet) result.append(unhealthyThreshold); else result.append("<unset>");
		result.append(", healthyThreshold: ");
		if (healthyThresholdESet) result.append(healthyThreshold); else result.append("<unset>");
		result.append(", restartThreshold: ");
		if (restartThresholdESet) result.append(restartThreshold); else result.append("<unset>");
		result.append(", host: ");
		result.append(host);
		result.append(')');
		return result.toString();
	}

} //VmHealthCheckTypeImpl

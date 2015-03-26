/**
 */
package gaeweb.impl;

import gaeweb.AutomaticScalingType;
import gaeweb.CpuUtilizationType;
import gaeweb.GaewebPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automatic Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMinPendingLatency <em>Min Pending Latency</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMaxPendingLatency <em>Max Pending Latency</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMinIdleInstances <em>Min Idle Instances</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMaxIdleInstances <em>Max Idle Instances</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMinNumInstances <em>Min Num Instances</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getMaxNumInstances <em>Max Num Instances</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getCoolDownPeriodSec <em>Cool Down Period Sec</em>}</li>
 *   <li>{@link gaeweb.impl.AutomaticScalingTypeImpl#getCpuUtilization <em>Cpu Utilization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutomaticScalingTypeImpl extends MinimalEObjectImpl.Container implements AutomaticScalingType {
	/**
	 * The default value of the '{@link #getMinPendingLatency() <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_PENDING_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinPendingLatency() <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected String minPendingLatency = MIN_PENDING_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPendingLatency() <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_PENDING_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPendingLatency() <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected String maxPendingLatency = MAX_PENDING_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIdleInstances() <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_IDLE_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIdleInstances() <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected String minIdleInstances = MIN_IDLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxIdleInstances() <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_IDLE_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxIdleInstances() <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected String maxIdleInstances = MAX_IDLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_CONCURRENT_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected String maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinNumInstances() <em>Min Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumInstances()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_NUM_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinNumInstances() <em>Min Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumInstances()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minNumInstances = MIN_NUM_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumInstances() <em>Max Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumInstances()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_NUM_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumInstances() <em>Max Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumInstances()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxNumInstances = MAX_NUM_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolDownPeriodSec() <em>Cool Down Period Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownPeriodSec()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COOL_DOWN_PERIOD_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoolDownPeriodSec() <em>Cool Down Period Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownPeriodSec()
	 * @generated
	 * @ordered
	 */
	protected BigInteger coolDownPeriodSec = COOL_DOWN_PERIOD_SEC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCpuUtilization() <em>Cpu Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUtilization()
	 * @generated
	 * @ordered
	 */
	protected CpuUtilizationType cpuUtilization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomaticScalingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.AUTOMATIC_SCALING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinPendingLatency() {
		return minPendingLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPendingLatency(String newMinPendingLatency) {
		String oldMinPendingLatency = minPendingLatency;
		minPendingLatency = newMinPendingLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY, oldMinPendingLatency, minPendingLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxPendingLatency() {
		return maxPendingLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPendingLatency(String newMaxPendingLatency) {
		String oldMaxPendingLatency = maxPendingLatency;
		maxPendingLatency = newMaxPendingLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY, oldMaxPendingLatency, maxPendingLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinIdleInstances() {
		return minIdleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIdleInstances(String newMinIdleInstances) {
		String oldMinIdleInstances = minIdleInstances;
		minIdleInstances = newMinIdleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES, oldMinIdleInstances, minIdleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxIdleInstances() {
		return maxIdleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIdleInstances(String newMaxIdleInstances) {
		String oldMaxIdleInstances = maxIdleInstances;
		maxIdleInstances = newMaxIdleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES, oldMaxIdleInstances, maxIdleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxConcurrentRequests() {
		return maxConcurrentRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConcurrentRequests(String newMaxConcurrentRequests) {
		String oldMaxConcurrentRequests = maxConcurrentRequests;
		maxConcurrentRequests = newMaxConcurrentRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, maxConcurrentRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinNumInstances() {
		return minNumInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNumInstances(BigInteger newMinNumInstances) {
		BigInteger oldMinNumInstances = minNumInstances;
		minNumInstances = newMinNumInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES, oldMinNumInstances, minNumInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxNumInstances() {
		return maxNumInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumInstances(BigInteger newMaxNumInstances) {
		BigInteger oldMaxNumInstances = maxNumInstances;
		maxNumInstances = newMaxNumInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES, oldMaxNumInstances, maxNumInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCoolDownPeriodSec() {
		return coolDownPeriodSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolDownPeriodSec(BigInteger newCoolDownPeriodSec) {
		BigInteger oldCoolDownPeriodSec = coolDownPeriodSec;
		coolDownPeriodSec = newCoolDownPeriodSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC, oldCoolDownPeriodSec, coolDownPeriodSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuUtilizationType getCpuUtilization() {
		return cpuUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpuUtilization(CpuUtilizationType newCpuUtilization, NotificationChain msgs) {
		CpuUtilizationType oldCpuUtilization = cpuUtilization;
		cpuUtilization = newCpuUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION, oldCpuUtilization, newCpuUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuUtilization(CpuUtilizationType newCpuUtilization) {
		if (newCpuUtilization != cpuUtilization) {
			NotificationChain msgs = null;
			if (cpuUtilization != null)
				msgs = ((InternalEObject)cpuUtilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION, null, msgs);
			if (newCpuUtilization != null)
				msgs = ((InternalEObject)newCpuUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION, null, msgs);
			msgs = basicSetCpuUtilization(newCpuUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION, newCpuUtilization, newCpuUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION:
				return basicSetCpuUtilization(null, msgs);
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
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY:
				return getMinPendingLatency();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY:
				return getMaxPendingLatency();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES:
				return getMinIdleInstances();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES:
				return getMaxIdleInstances();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS:
				return getMaxConcurrentRequests();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES:
				return getMinNumInstances();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES:
				return getMaxNumInstances();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC:
				return getCoolDownPeriodSec();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION:
				return getCpuUtilization();
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
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY:
				setMinPendingLatency((String)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY:
				setMaxPendingLatency((String)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES:
				setMinIdleInstances((String)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES:
				setMaxIdleInstances((String)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests((String)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES:
				setMinNumInstances((BigInteger)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES:
				setMaxNumInstances((BigInteger)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC:
				setCoolDownPeriodSec((BigInteger)newValue);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION:
				setCpuUtilization((CpuUtilizationType)newValue);
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
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY:
				setMinPendingLatency(MIN_PENDING_LATENCY_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY:
				setMaxPendingLatency(MAX_PENDING_LATENCY_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES:
				setMinIdleInstances(MIN_IDLE_INSTANCES_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES:
				setMaxIdleInstances(MAX_IDLE_INSTANCES_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests(MAX_CONCURRENT_REQUESTS_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES:
				setMinNumInstances(MIN_NUM_INSTANCES_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES:
				setMaxNumInstances(MAX_NUM_INSTANCES_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC:
				setCoolDownPeriodSec(COOL_DOWN_PERIOD_SEC_EDEFAULT);
				return;
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION:
				setCpuUtilization((CpuUtilizationType)null);
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
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY:
				return MIN_PENDING_LATENCY_EDEFAULT == null ? minPendingLatency != null : !MIN_PENDING_LATENCY_EDEFAULT.equals(minPendingLatency);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY:
				return MAX_PENDING_LATENCY_EDEFAULT == null ? maxPendingLatency != null : !MAX_PENDING_LATENCY_EDEFAULT.equals(maxPendingLatency);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES:
				return MIN_IDLE_INSTANCES_EDEFAULT == null ? minIdleInstances != null : !MIN_IDLE_INSTANCES_EDEFAULT.equals(minIdleInstances);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES:
				return MAX_IDLE_INSTANCES_EDEFAULT == null ? maxIdleInstances != null : !MAX_IDLE_INSTANCES_EDEFAULT.equals(maxIdleInstances);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS:
				return MAX_CONCURRENT_REQUESTS_EDEFAULT == null ? maxConcurrentRequests != null : !MAX_CONCURRENT_REQUESTS_EDEFAULT.equals(maxConcurrentRequests);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES:
				return MIN_NUM_INSTANCES_EDEFAULT == null ? minNumInstances != null : !MIN_NUM_INSTANCES_EDEFAULT.equals(minNumInstances);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES:
				return MAX_NUM_INSTANCES_EDEFAULT == null ? maxNumInstances != null : !MAX_NUM_INSTANCES_EDEFAULT.equals(maxNumInstances);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC:
				return COOL_DOWN_PERIOD_SEC_EDEFAULT == null ? coolDownPeriodSec != null : !COOL_DOWN_PERIOD_SEC_EDEFAULT.equals(coolDownPeriodSec);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION:
				return cpuUtilization != null;
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
		result.append(" (minPendingLatency: ");
		result.append(minPendingLatency);
		result.append(", maxPendingLatency: ");
		result.append(maxPendingLatency);
		result.append(", minIdleInstances: ");
		result.append(minIdleInstances);
		result.append(", maxIdleInstances: ");
		result.append(maxIdleInstances);
		result.append(", maxConcurrentRequests: ");
		result.append(maxConcurrentRequests);
		result.append(", minNumInstances: ");
		result.append(minNumInstances);
		result.append(", maxNumInstances: ");
		result.append(maxNumInstances);
		result.append(", coolDownPeriodSec: ");
		result.append(coolDownPeriodSec);
		result.append(')');
		return result.toString();
	}

} //AutomaticScalingTypeImpl

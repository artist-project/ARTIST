/**
 */
package gaeweb.impl;

import gaeweb.CpuUtilizationType;
import gaeweb.GaewebPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpu Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.CpuUtilizationTypeImpl#getTargetUtilization <em>Target Utilization</em>}</li>
 *   <li>{@link gaeweb.impl.CpuUtilizationTypeImpl#getAggregationWindowLengthSec <em>Aggregation Window Length Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CpuUtilizationTypeImpl extends MinimalEObjectImpl.Container implements CpuUtilizationType {
	/**
	 * The default value of the '{@link #getTargetUtilization() <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TARGET_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetUtilization() <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilization()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal targetUtilization = TARGET_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationWindowLengthSec() <em>Aggregation Window Length Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationWindowLengthSec()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AGGREGATION_WINDOW_LENGTH_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationWindowLengthSec() <em>Aggregation Window Length Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationWindowLengthSec()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aggregationWindowLengthSec = AGGREGATION_WINDOW_LENGTH_SEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuUtilizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.CPU_UTILIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTargetUtilization() {
		return targetUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUtilization(BigDecimal newTargetUtilization) {
		BigDecimal oldTargetUtilization = targetUtilization;
		targetUtilization = newTargetUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.CPU_UTILIZATION_TYPE__TARGET_UTILIZATION, oldTargetUtilization, targetUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAggregationWindowLengthSec() {
		return aggregationWindowLengthSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationWindowLengthSec(BigInteger newAggregationWindowLengthSec) {
		BigInteger oldAggregationWindowLengthSec = aggregationWindowLengthSec;
		aggregationWindowLengthSec = newAggregationWindowLengthSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC, oldAggregationWindowLengthSec, aggregationWindowLengthSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.CPU_UTILIZATION_TYPE__TARGET_UTILIZATION:
				return getTargetUtilization();
			case GaewebPackage.CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC:
				return getAggregationWindowLengthSec();
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
			case GaewebPackage.CPU_UTILIZATION_TYPE__TARGET_UTILIZATION:
				setTargetUtilization((BigDecimal)newValue);
				return;
			case GaewebPackage.CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC:
				setAggregationWindowLengthSec((BigInteger)newValue);
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
			case GaewebPackage.CPU_UTILIZATION_TYPE__TARGET_UTILIZATION:
				setTargetUtilization(TARGET_UTILIZATION_EDEFAULT);
				return;
			case GaewebPackage.CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC:
				setAggregationWindowLengthSec(AGGREGATION_WINDOW_LENGTH_SEC_EDEFAULT);
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
			case GaewebPackage.CPU_UTILIZATION_TYPE__TARGET_UTILIZATION:
				return TARGET_UTILIZATION_EDEFAULT == null ? targetUtilization != null : !TARGET_UTILIZATION_EDEFAULT.equals(targetUtilization);
			case GaewebPackage.CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC:
				return AGGREGATION_WINDOW_LENGTH_SEC_EDEFAULT == null ? aggregationWindowLengthSec != null : !AGGREGATION_WINDOW_LENGTH_SEC_EDEFAULT.equals(aggregationWindowLengthSec);
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
		result.append(" (targetUtilization: ");
		result.append(targetUtilization);
		result.append(", aggregationWindowLengthSec: ");
		result.append(aggregationWindowLengthSec);
		result.append(')');
		return result.toString();
	}

} //CpuUtilizationTypeImpl

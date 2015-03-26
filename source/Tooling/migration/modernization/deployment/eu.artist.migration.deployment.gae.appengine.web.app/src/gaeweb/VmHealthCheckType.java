/**
 */
package gaeweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Health Check Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.VmHealthCheckType#isEnableHealthCheck <em>Enable Health Check</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getCheckIntervalSec <em>Check Interval Sec</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getTimeoutSec <em>Timeout Sec</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getRestartThreshold <em>Restart Threshold</em>}</li>
 *   <li>{@link gaeweb.VmHealthCheckType#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getVmHealthCheckType()
 * @model extendedMetaData="name='vm-health-checkType' kind='elementOnly'"
 * @generated
 */
public interface VmHealthCheckType extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable Health Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Health Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Health Check</em>' attribute.
	 * @see #isSetEnableHealthCheck()
	 * @see #unsetEnableHealthCheck()
	 * @see #setEnableHealthCheck(boolean)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_EnableHealthCheck()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='enable-health-check' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableHealthCheck();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#isEnableHealthCheck <em>Enable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Health Check</em>' attribute.
	 * @see #isSetEnableHealthCheck()
	 * @see #unsetEnableHealthCheck()
	 * @see #isEnableHealthCheck()
	 * @generated
	 */
	void setEnableHealthCheck(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#isEnableHealthCheck <em>Enable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableHealthCheck()
	 * @see #isEnableHealthCheck()
	 * @see #setEnableHealthCheck(boolean)
	 * @generated
	 */
	void unsetEnableHealthCheck();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#isEnableHealthCheck <em>Enable Health Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Health Check</em>' attribute is set.
	 * @see #unsetEnableHealthCheck()
	 * @see #isEnableHealthCheck()
	 * @see #setEnableHealthCheck(boolean)
	 * @generated
	 */
	boolean isSetEnableHealthCheck();

	/**
	 * Returns the value of the '<em><b>Check Interval Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Interval Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Interval Sec</em>' attribute.
	 * @see #isSetCheckIntervalSec()
	 * @see #unsetCheckIntervalSec()
	 * @see #setCheckIntervalSec(long)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_CheckIntervalSec()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='check-interval-sec' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCheckIntervalSec();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getCheckIntervalSec <em>Check Interval Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Interval Sec</em>' attribute.
	 * @see #isSetCheckIntervalSec()
	 * @see #unsetCheckIntervalSec()
	 * @see #getCheckIntervalSec()
	 * @generated
	 */
	void setCheckIntervalSec(long value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#getCheckIntervalSec <em>Check Interval Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckIntervalSec()
	 * @see #getCheckIntervalSec()
	 * @see #setCheckIntervalSec(long)
	 * @generated
	 */
	void unsetCheckIntervalSec();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#getCheckIntervalSec <em>Check Interval Sec</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check Interval Sec</em>' attribute is set.
	 * @see #unsetCheckIntervalSec()
	 * @see #getCheckIntervalSec()
	 * @see #setCheckIntervalSec(long)
	 * @generated
	 */
	boolean isSetCheckIntervalSec();

	/**
	 * Returns the value of the '<em><b>Timeout Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Sec</em>' attribute.
	 * @see #isSetTimeoutSec()
	 * @see #unsetTimeoutSec()
	 * @see #setTimeoutSec(long)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_TimeoutSec()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='timeout-sec' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTimeoutSec();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getTimeoutSec <em>Timeout Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Sec</em>' attribute.
	 * @see #isSetTimeoutSec()
	 * @see #unsetTimeoutSec()
	 * @see #getTimeoutSec()
	 * @generated
	 */
	void setTimeoutSec(long value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#getTimeoutSec <em>Timeout Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeoutSec()
	 * @see #getTimeoutSec()
	 * @see #setTimeoutSec(long)
	 * @generated
	 */
	void unsetTimeoutSec();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#getTimeoutSec <em>Timeout Sec</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout Sec</em>' attribute is set.
	 * @see #unsetTimeoutSec()
	 * @see #getTimeoutSec()
	 * @see #setTimeoutSec(long)
	 * @generated
	 */
	boolean isSetTimeoutSec();

	/**
	 * Returns the value of the '<em><b>Unhealthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unhealthy Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #isSetUnhealthyThreshold()
	 * @see #unsetUnhealthyThreshold()
	 * @see #setUnhealthyThreshold(long)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_UnhealthyThreshold()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='unhealthy-threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUnhealthyThreshold();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getUnhealthyThreshold <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #isSetUnhealthyThreshold()
	 * @see #unsetUnhealthyThreshold()
	 * @see #getUnhealthyThreshold()
	 * @generated
	 */
	void setUnhealthyThreshold(long value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#getUnhealthyThreshold <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnhealthyThreshold()
	 * @see #getUnhealthyThreshold()
	 * @see #setUnhealthyThreshold(long)
	 * @generated
	 */
	void unsetUnhealthyThreshold();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#getUnhealthyThreshold <em>Unhealthy Threshold</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unhealthy Threshold</em>' attribute is set.
	 * @see #unsetUnhealthyThreshold()
	 * @see #getUnhealthyThreshold()
	 * @see #setUnhealthyThreshold(long)
	 * @generated
	 */
	boolean isSetUnhealthyThreshold();

	/**
	 * Returns the value of the '<em><b>Healthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Healthy Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #isSetHealthyThreshold()
	 * @see #unsetHealthyThreshold()
	 * @see #setHealthyThreshold(long)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_HealthyThreshold()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='healthy-threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	long getHealthyThreshold();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getHealthyThreshold <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #isSetHealthyThreshold()
	 * @see #unsetHealthyThreshold()
	 * @see #getHealthyThreshold()
	 * @generated
	 */
	void setHealthyThreshold(long value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#getHealthyThreshold <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHealthyThreshold()
	 * @see #getHealthyThreshold()
	 * @see #setHealthyThreshold(long)
	 * @generated
	 */
	void unsetHealthyThreshold();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#getHealthyThreshold <em>Healthy Threshold</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Healthy Threshold</em>' attribute is set.
	 * @see #unsetHealthyThreshold()
	 * @see #getHealthyThreshold()
	 * @see #setHealthyThreshold(long)
	 * @generated
	 */
	boolean isSetHealthyThreshold();

	/**
	 * Returns the value of the '<em><b>Restart Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Threshold</em>' attribute.
	 * @see #isSetRestartThreshold()
	 * @see #unsetRestartThreshold()
	 * @see #setRestartThreshold(long)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_RestartThreshold()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='restart-threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRestartThreshold();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getRestartThreshold <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Threshold</em>' attribute.
	 * @see #isSetRestartThreshold()
	 * @see #unsetRestartThreshold()
	 * @see #getRestartThreshold()
	 * @generated
	 */
	void setRestartThreshold(long value);

	/**
	 * Unsets the value of the '{@link gaeweb.VmHealthCheckType#getRestartThreshold <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestartThreshold()
	 * @see #getRestartThreshold()
	 * @see #setRestartThreshold(long)
	 * @generated
	 */
	void unsetRestartThreshold();

	/**
	 * Returns whether the value of the '{@link gaeweb.VmHealthCheckType#getRestartThreshold <em>Restart Threshold</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restart Threshold</em>' attribute is set.
	 * @see #unsetRestartThreshold()
	 * @see #getRestartThreshold()
	 * @see #setRestartThreshold(long)
	 * @generated
	 */
	boolean isSetRestartThreshold();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see gaeweb.GaewebPackage#getVmHealthCheckType_Host()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='host' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link gaeweb.VmHealthCheckType#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

} // VmHealthCheckType

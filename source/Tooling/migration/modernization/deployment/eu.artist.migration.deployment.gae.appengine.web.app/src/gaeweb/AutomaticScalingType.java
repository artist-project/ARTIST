/**
 */
package gaeweb;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.AutomaticScalingType#getMinPendingLatency <em>Min Pending Latency</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMaxPendingLatency <em>Max Pending Latency</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMinIdleInstances <em>Min Idle Instances</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMaxIdleInstances <em>Max Idle Instances</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMinNumInstances <em>Min Num Instances</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getMaxNumInstances <em>Max Num Instances</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getCoolDownPeriodSec <em>Cool Down Period Sec</em>}</li>
 *   <li>{@link gaeweb.AutomaticScalingType#getCpuUtilization <em>Cpu Utilization</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getAutomaticScalingType()
 * @model extendedMetaData="name='automatic-scaling-type' kind='elementOnly'"
 * @generated
 */
public interface AutomaticScalingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Pending Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Pending Latency</em>' attribute.
	 * @see #setMinPendingLatency(String)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MinPendingLatency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='min-pending-latency' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinPendingLatency();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMinPendingLatency <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Pending Latency</em>' attribute.
	 * @see #getMinPendingLatency()
	 * @generated
	 */
	void setMinPendingLatency(String value);

	/**
	 * Returns the value of the '<em><b>Max Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pending Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pending Latency</em>' attribute.
	 * @see #setMaxPendingLatency(String)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MaxPendingLatency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max-pending-latency' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxPendingLatency();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMaxPendingLatency <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pending Latency</em>' attribute.
	 * @see #getMaxPendingLatency()
	 * @generated
	 */
	void setMaxPendingLatency(String value);

	/**
	 * Returns the value of the '<em><b>Min Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Idle Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Idle Instances</em>' attribute.
	 * @see #setMinIdleInstances(String)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MinIdleInstances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='min-idle-instances' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinIdleInstances();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMinIdleInstances <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Idle Instances</em>' attribute.
	 * @see #getMinIdleInstances()
	 * @generated
	 */
	void setMinIdleInstances(String value);

	/**
	 * Returns the value of the '<em><b>Max Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Idle Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Idle Instances</em>' attribute.
	 * @see #setMaxIdleInstances(String)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MaxIdleInstances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max-idle-instances' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxIdleInstances();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMaxIdleInstances <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Idle Instances</em>' attribute.
	 * @see #getMaxIdleInstances()
	 * @generated
	 */
	void setMaxIdleInstances(String value);

	/**
	 * Returns the value of the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Concurrent Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #setMaxConcurrentRequests(String)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MaxConcurrentRequests()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max-concurrent-requests' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxConcurrentRequests();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 */
	void setMaxConcurrentRequests(String value);

	/**
	 * Returns the value of the '<em><b>Min Num Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Num Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Num Instances</em>' attribute.
	 * @see #setMinNumInstances(BigInteger)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MinNumInstances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='min-num-instances' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinNumInstances();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMinNumInstances <em>Min Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Num Instances</em>' attribute.
	 * @see #getMinNumInstances()
	 * @generated
	 */
	void setMinNumInstances(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Num Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num Instances</em>' attribute.
	 * @see #setMaxNumInstances(BigInteger)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_MaxNumInstances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='max-num-instances' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxNumInstances();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getMaxNumInstances <em>Max Num Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num Instances</em>' attribute.
	 * @see #getMaxNumInstances()
	 * @generated
	 */
	void setMaxNumInstances(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cool Down Period Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cool Down Period Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cool Down Period Sec</em>' attribute.
	 * @see #setCoolDownPeriodSec(BigInteger)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_CoolDownPeriodSec()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='cool-down-period-sec' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCoolDownPeriodSec();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getCoolDownPeriodSec <em>Cool Down Period Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cool Down Period Sec</em>' attribute.
	 * @see #getCoolDownPeriodSec()
	 * @generated
	 */
	void setCoolDownPeriodSec(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cpu Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Utilization</em>' containment reference.
	 * @see #setCpuUtilization(CpuUtilizationType)
	 * @see gaeweb.GaewebPackage#getAutomaticScalingType_CpuUtilization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cpu-utilization' namespace='##targetNamespace'"
	 * @generated
	 */
	CpuUtilizationType getCpuUtilization();

	/**
	 * Sets the value of the '{@link gaeweb.AutomaticScalingType#getCpuUtilization <em>Cpu Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Utilization</em>' containment reference.
	 * @see #getCpuUtilization()
	 * @generated
	 */
	void setCpuUtilization(CpuUtilizationType value);

} // AutomaticScalingType

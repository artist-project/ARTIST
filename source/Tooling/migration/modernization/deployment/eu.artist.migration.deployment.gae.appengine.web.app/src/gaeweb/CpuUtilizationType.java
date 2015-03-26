/**
 */
package gaeweb;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpu Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.CpuUtilizationType#getTargetUtilization <em>Target Utilization</em>}</li>
 *   <li>{@link gaeweb.CpuUtilizationType#getAggregationWindowLengthSec <em>Aggregation Window Length Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getCpuUtilizationType()
 * @model extendedMetaData="name='cpu-utilization-type' kind='elementOnly'"
 * @generated
 */
public interface CpuUtilizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Utilization</em>' attribute.
	 * @see #setTargetUtilization(BigDecimal)
	 * @see gaeweb.GaewebPackage#getCpuUtilizationType_TargetUtilization()
	 * @model dataType="gaeweb.TargetUtilizationType"
	 *        extendedMetaData="kind='element' name='target-utilization' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTargetUtilization();

	/**
	 * Sets the value of the '{@link gaeweb.CpuUtilizationType#getTargetUtilization <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Utilization</em>' attribute.
	 * @see #getTargetUtilization()
	 * @generated
	 */
	void setTargetUtilization(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Aggregation Window Length Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Window Length Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Window Length Sec</em>' attribute.
	 * @see #setAggregationWindowLengthSec(BigInteger)
	 * @see gaeweb.GaewebPackage#getCpuUtilizationType_AggregationWindowLengthSec()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='aggregation-window-length-sec' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAggregationWindowLengthSec();

	/**
	 * Sets the value of the '{@link gaeweb.CpuUtilizationType#getAggregationWindowLengthSec <em>Aggregation Window Length Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Window Length Sec</em>' attribute.
	 * @see #getAggregationWindowLengthSec()
	 * @generated
	 */
	void setAggregationWindowLengthSec(BigInteger value);

} // CpuUtilizationType

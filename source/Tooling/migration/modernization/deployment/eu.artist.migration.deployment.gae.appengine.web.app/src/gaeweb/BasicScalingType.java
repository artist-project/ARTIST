/**
 */
package gaeweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Scaling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.BasicScalingType#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link gaeweb.BasicScalingType#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getBasicScalingType()
 * @model extendedMetaData="name='basic-scaling-type' kind='elementOnly'"
 * @generated
 */
public interface BasicScalingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #setMaxInstances(String)
	 * @see gaeweb.GaewebPackage#getBasicScalingType_MaxInstances()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='max-instances' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxInstances();

	/**
	 * Sets the value of the '{@link gaeweb.BasicScalingType#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(String value);

	/**
	 * Returns the value of the '<em><b>Idle Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Timeout</em>' attribute.
	 * @see #setIdleTimeout(String)
	 * @see gaeweb.GaewebPackage#getBasicScalingType_IdleTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='idle-timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdleTimeout();

	/**
	 * Sets the value of the '{@link gaeweb.BasicScalingType#getIdleTimeout <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout</em>' attribute.
	 * @see #getIdleTimeout()
	 * @generated
	 */
	void setIdleTimeout(String value);

} // BasicScalingType

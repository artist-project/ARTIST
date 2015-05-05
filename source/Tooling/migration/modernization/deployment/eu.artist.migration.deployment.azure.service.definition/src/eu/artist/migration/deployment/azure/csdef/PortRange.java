/**
 */
package eu.artist.migration.deployment.azure.csdef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMax <em>Max</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getPortRange()
 * @model extendedMetaData="name='PortRange' kind='empty'"
 * @generated
 */
public interface PortRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getPortRange_Max()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PortInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='max'"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(int)
	 * @see eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage#getPortRange_Min()
	 * @model unsettable="true" dataType="eu.artist.migration.deployment.azure.csdef.PortInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='min'"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.csdef.PortRange#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	boolean isSetMin();

} // PortRange

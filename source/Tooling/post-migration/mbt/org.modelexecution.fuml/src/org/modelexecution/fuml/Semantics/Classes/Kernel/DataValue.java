/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Syntax.Classes.Kernel.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data value is a compund value whose (single) type is a data type other than a
 *                 primitive type or an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getDataValue()
 * @model
 * @generated
 */
public interface DataValue extends CompoundValue {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this data value. This must not be a primitive or an
	 *                 enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getDataValue_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.DataValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // DataValue

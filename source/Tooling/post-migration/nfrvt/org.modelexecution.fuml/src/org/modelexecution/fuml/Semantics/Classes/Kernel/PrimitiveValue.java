/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Syntax.Classes.Kernel.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A primitive value is a value whose (single) type is a primitive type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getPrimitiveValue()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveValue extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PrimitiveType)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getPrimitiveValue_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.PrimitiveValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // PrimitiveValue

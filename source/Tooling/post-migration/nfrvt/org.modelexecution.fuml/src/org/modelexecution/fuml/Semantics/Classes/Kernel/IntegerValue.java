/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An integer value is a primitive value whose type is Integer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getIntegerValue()
 * @model
 * @generated
 */
public interface IntegerValue extends PrimitiveValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual Integer value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getIntegerValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.IntegerValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValue

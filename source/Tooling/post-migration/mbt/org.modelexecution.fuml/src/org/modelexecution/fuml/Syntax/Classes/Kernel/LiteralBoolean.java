/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getLiteralBoolean()
 * @model
 * @generated
 */
public interface LiteralBoolean extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getLiteralBoolean_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // LiteralBoolean

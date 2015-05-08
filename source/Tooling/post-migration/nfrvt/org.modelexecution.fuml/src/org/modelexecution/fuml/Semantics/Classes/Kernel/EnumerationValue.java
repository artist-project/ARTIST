/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration;
import org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An enumeration value is a value whose (single) type is an enumeration. 
 *                 It's literal must be an owned literal of it's type.
 *  
 *  
 *               
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends Value {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literal value of this enumeration value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(EnumerationLiteral)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getEnumerationValue_Literal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EnumerationLiteral getLiteral();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Enumeration)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getEnumerationValue_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getType();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.EnumerationValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Enumeration value);

} // EnumerationValue

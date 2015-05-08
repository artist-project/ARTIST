/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference is an access path to a specific object. There may be multiple
 *                 references to the same object.
 *  As a structured value, the reference acts
 *                 just the same as its referent in terms of type, features, operations, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Reference#getReferent <em>Referent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends StructuredValue {
	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(org.modelexecution.fuml.Semantics.Classes.Kernel.Object)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getReference_Referent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.modelexecution.fuml.Semantics.Classes.Kernel.Object getReferent();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Reference#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(org.modelexecution.fuml.Semantics.Classes.Kernel.Object value);

} // Reference

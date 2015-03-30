/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Syntax.Classes.Kernel.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link is an extensional value whose (single) type is an association. (However,
 *                 if the link has been destroyed, then it has no type.)
 *  A link must at have
 *                 most one feature value for each structural feature owned by its type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Link#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends ExtensionalValue {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getLink_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Link#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

} // Link

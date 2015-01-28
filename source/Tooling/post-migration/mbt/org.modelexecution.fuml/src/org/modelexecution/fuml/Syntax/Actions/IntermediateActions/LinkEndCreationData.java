/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#isReplaceAll <em>Replace All</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndCreationData()
 * @model
 * @generated
 */
public interface LinkEndCreationData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the existing links emanating from the object on this end
	 *                   should be destroyed before creating a new link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace All</em>' attribute.
	 * @see #setReplaceAll(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndCreationData_ReplaceAll()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isReplaceAll();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#isReplaceAll <em>Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace All</em>' attribute.
	 * @see #isReplaceAll()
	 * @generated
	 */
	void setReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies where the new link should be inserted for ordered association ends,
	 *                   or where an existing link should be moved to. The type of the input is
	 *                   UnlimitedNatural, but the input cannot be zero. This pin is omitted for
	 *                   association ends that are not ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' reference.
	 * @see #setInsertAt(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndCreationData_InsertAt()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData#getInsertAt <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

} // LinkEndCreationData

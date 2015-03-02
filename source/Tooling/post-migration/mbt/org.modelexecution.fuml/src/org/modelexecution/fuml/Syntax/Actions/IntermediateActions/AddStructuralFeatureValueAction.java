/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#isReplaceAll <em>Replace All</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getAddStructuralFeatureValueAction()
 * @model
 * @generated
 */
public interface AddStructuralFeatureValueAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether existing values of the structural feature of the object
	 *                   should be removed before adding the new value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace All</em>' attribute.
	 * @see #setReplaceAll(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getAddStructuralFeatureValueAction_ReplaceAll()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isReplaceAll();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#isReplaceAll <em>Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace All</em>' attribute.
	 * @see #isReplaceAll()
	 * @generated
	 */
	void setReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert At</em>' containment reference.
	 * @see #setInsertAt(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getAddStructuralFeatureValueAction_InsertAt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' containment reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

} // AddStructuralFeatureValueAction

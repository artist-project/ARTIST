/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#isRemoveDuplicates <em>Remove Duplicates</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getRemoveStructuralFeatureValueAction()
 * @model
 * @generated
 */
public interface RemoveStructuralFeatureValueAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Remove Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to remove duplicates of the value in nonunique structural
	 *                   features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Duplicates</em>' attribute.
	 * @see #setRemoveDuplicates(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getRemoveStructuralFeatureValueAction_RemoveDuplicates()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isRemoveDuplicates();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#isRemoveDuplicates <em>Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Duplicates</em>' attribute.
	 * @see #isRemoveDuplicates()
	 * @generated
	 */
	void setRemoveDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the position of an existing value to remove in ordered nonunique
	 *                   structural features. The type of the pin is UnlimitedNatural, but the value cannot
	 *                   be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getRemoveStructuralFeatureValueAction_RemoveAt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

} // RemoveStructuralFeatureValueAction

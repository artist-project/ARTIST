/**
 */
package org.modelexecution.fuml.Syntax.Actions.BasicActions;

import org.modelexecution.fuml.Syntax.Classes.Kernel.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallOperationAction()
 * @model
 * @generated
 */
public interface CallOperationAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation to be invoked by the action execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallOperationAction_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target object to which the request is sent. The classifier of the target
	 *                   object is used to dynamically determine a behavior to invoke. This object
	 *                   constitutes the context of the execution of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallOperationAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // CallOperationAction

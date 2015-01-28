/**
 */
package org.modelexecution.fuml.Syntax.Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the call is synchronous and the caller waits for completion of the
	 *                   invoked behavior. If false, the call is asynchronous and the caller proceeds
	 *                   immediately and does not expect a return values. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #setSynchronous(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallAction_Synchronous()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins where the results of performing the invocation are
	 *                   placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // CallAction

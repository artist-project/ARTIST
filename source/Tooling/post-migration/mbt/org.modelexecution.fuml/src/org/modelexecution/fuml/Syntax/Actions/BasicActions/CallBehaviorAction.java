/**
 */
package org.modelexecution.fuml.Syntax.Actions.BasicActions;

import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallBehaviorAction()
 * @model
 * @generated
 */
public interface CallBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invoked behavior. It must be capable of accepting and returning
	 *                 control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getCallBehaviorAction_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.CallBehaviorAction#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // CallBehaviorAction

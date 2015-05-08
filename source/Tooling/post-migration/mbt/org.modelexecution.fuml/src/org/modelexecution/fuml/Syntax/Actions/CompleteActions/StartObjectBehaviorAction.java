/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getStartObjectBehaviorAction()
 * @model
 * @generated
 */
public interface StartObjectBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getStartObjectBehaviorAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // StartObjectBehaviorAction

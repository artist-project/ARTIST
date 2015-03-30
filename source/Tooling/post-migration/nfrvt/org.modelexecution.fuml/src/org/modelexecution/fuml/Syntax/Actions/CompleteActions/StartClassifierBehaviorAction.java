/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Classifier Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getStartClassifierBehaviorAction()
 * @model
 * @generated
 */
public interface StartClassifierBehaviorAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the object on which to start the owned behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getStartClassifierBehaviorAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // StartClassifierBehaviorAction

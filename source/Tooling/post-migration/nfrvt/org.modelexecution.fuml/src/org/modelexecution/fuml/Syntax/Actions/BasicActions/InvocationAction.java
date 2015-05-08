/**
 */
package org.modelexecution.fuml.Syntax.Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.InvocationAction#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage#getInvocationAction_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getArgument();

} // InvocationAction

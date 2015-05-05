/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getEndData <em>End Data</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkAction#getInputValue <em>Input Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data identifying one end of a link by the objects on its ends and
	 *                 qualifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction_EndData()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<LinkEndData> getEndData();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction_InputValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getInputValue();

} // LinkAction

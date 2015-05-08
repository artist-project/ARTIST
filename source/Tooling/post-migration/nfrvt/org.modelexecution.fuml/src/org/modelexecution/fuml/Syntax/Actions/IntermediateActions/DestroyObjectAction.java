/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyLinks <em>Destroy Links</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyOwnedObjects <em>Destroy Owned Objects</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Destroy Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether links in which the object participates are destroyed along
	 *                   with the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy Links</em>' attribute.
	 * @see #setDestroyLinks(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_DestroyLinks()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyLinks();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyLinks <em>Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Links</em>' attribute.
	 * @see #isDestroyLinks()
	 * @generated
	 */
	void setDestroyLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Destroy Owned Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether objects owned by the object are destroyed along with the
	 *                   object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy Owned Objects</em>' attribute.
	 * @see #setDestroyOwnedObjects(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_DestroyOwnedObjects()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#isDestroyOwnedObjects <em>Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Owned Objects</em>' attribute.
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 */
	void setDestroyOwnedObjects(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin providing the object to be destroyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getDestroyObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // DestroyObjectAction

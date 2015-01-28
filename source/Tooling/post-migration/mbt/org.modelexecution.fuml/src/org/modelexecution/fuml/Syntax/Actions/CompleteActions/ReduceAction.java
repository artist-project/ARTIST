/**
 */
package org.modelexecution.fuml.Syntax.Actions.CompleteActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.Action;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#isOrdered <em>Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getReduceAction()
 * @model
 * @generated
 */
public interface ReduceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behavior that is applied to two elements of the input collection to produce a
	 *                   value that is the same type as elements of the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reducer</em>' reference.
	 * @see #setReducer(Behavior)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Reducer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getReducer();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(Behavior value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the output pin on which the result is put.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection to be reduced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Collection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getCollection();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(InputPin value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the order of the input collection should determine the order in
	 *                   which the behavior is applied to its elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Ordered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

} // ReduceAction

/**
 */
package org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getTest <em>Test</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBody <em>Body</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getBodyOutput <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested activity fragment with a designated output pin that specifies the
	 *                   result of the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_Test()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getTest();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested activity fragment that is executed if the test evaluates to true and
	 *                   the clause is chosen over any concurrent clauses that also evaluate to
	 *                 true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_Body()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExecutableNode> getBody();

	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getSuccessorClause <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of clauses whose tests must all evaluate false before the current clause
	 *                   can be tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_PredecessorClause()
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getSuccessorClause
	 * @model opposite="successorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of clauses which may not be tested unless the current clause tests
	 *                   false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successor Clause</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_SuccessorClause()
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getPredecessorClause
	 * @model opposite="predecessorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getSuccessorClause();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An output pin within the test fragment the value of which is examined after
	 *                   execution of the test to determine whether the body should be executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_Decider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins within the body fragment whose values are moved to the
	 *                   result pins of the containing conditional node after execution of the clause
	 *                 body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getClause_BodyOutput()
	 * @model
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

} // Clause

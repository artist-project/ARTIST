/**
 */
package org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isDeterminate <em>Determinate</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isAssured <em>Assured</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that at most one test will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Determinate</em>' attribute.
	 * @see #setDeterminate(boolean)
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getConditionalNode_Determinate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDeterminate();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isDeterminate <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determinate</em>' attribute.
	 * @see #isDeterminate()
	 * @generated
	 */
	void setDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Assured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that at least one test will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assured</em>' attribute.
	 * @see #setAssured(boolean)
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getConditionalNode_Assured()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAssured();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode#isAssured <em>Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assured</em>' attribute.
	 * @see #isAssured()
	 * @generated
	 */
	void setAssured(boolean value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of clauses composing the conditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getConditionalNode_Clause()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins that constitute the data flow outputs of the
	 *                   conditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage#getConditionalNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ConditionalNode

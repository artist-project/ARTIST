/**
 */
package org.modelexecution.fuml.Syntax.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#getNode <em>Node</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Behavior {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes coordinated by the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivity_Node()
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this activity must not make any changes to variables outside the
	 *                   activity or to objects. (This is an assertion, not an executable property. It may
	 *                   be used by an execution engine to optimize model execution. If the assertion is
	 *                   violated by the action, then the model is ill-formed.) The default is false (an
	 *                   activity may make nonlocal changes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivity_ReadOnly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges expressing flow between nodes of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivity_Edge()
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

} // Activity

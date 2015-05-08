/**
 */
package org.modelexecution.fuml.Syntax.Activities.IntermediateActivities;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.fuml.Syntax.Classes.Kernel.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured activity node containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNode_InStructuredNode()
	 * @see org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNode_Activity()
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges that have the node as source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNode_Outgoing()
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges that have the node as target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityNode_Incoming()
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

} // ActivityNode

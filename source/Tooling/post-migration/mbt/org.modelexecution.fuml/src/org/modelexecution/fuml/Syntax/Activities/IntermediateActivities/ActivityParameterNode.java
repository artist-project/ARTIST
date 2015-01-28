/**
 */
package org.modelexecution.fuml.Syntax.Activities.IntermediateActivities;

import org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityParameterNode#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityParameterNode()
 * @model
 * @generated
 */
public interface ActivityParameterNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter the object node will be accepting or providing values
	 *                 for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityParameterNode_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityParameterNode#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ActivityParameterNode

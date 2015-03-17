/**
 */
package org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities;

import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ObjectNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode()
 * @model
 * @generated
 */
public interface ExpansionNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expansion region for which the node is an output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode_RegionAsOutput()
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement
	 * @model opposite="outputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expansion region for which the node is an input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode_RegionAsInput()
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement
	 * @model opposite="inputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

} // ExpansionNode

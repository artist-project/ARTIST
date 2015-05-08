/**
 */
package org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way in which the executions interact: parallel: all interactions are
	 *                   independent iterative: the interactions occur in order of the elements stream: a
	 *                   stream of values flows into a single execution 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_Mode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object node that holds a separate element of the input collection during
	 *                   each of the multiple executions of the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_InputElement()
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object node that accepts a separate element of the output collection during
	 *                   each of the multiple executions of the region. The values are formed into a
	 *                   collection that is available when the execution of the region is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_OutputElement()
	 * @see org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

} // ExpansionRegion

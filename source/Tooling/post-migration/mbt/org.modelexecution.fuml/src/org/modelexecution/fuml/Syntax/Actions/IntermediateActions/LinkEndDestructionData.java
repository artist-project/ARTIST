/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions;

import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#isDestroyDuplicates <em>Destroy Duplicates</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData()
 * @model
 * @generated
 */
public interface LinkEndDestructionData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Destroy Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to destroy duplicates of the value in nonunique association
	 *                   ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy Duplicates</em>' attribute.
	 * @see #setDestroyDuplicates(boolean)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData_DestroyDuplicates()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyDuplicates();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#isDestroyDuplicates <em>Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Duplicates</em>' attribute.
	 * @see #isDestroyDuplicates()
	 * @generated
	 */
	void setDestroyDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the position of an existing link to be destroyed in ordered
	 *                   nonunique association ends. The type of the pin is UnlimitedNatural, but the value
	 *                   cannot be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy At</em>' reference.
	 * @see #setDestroyAt(InputPin)
	 * @see org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndDestructionData_DestroyAt()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getDestroyAt();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy At</em>' reference.
	 * @see #getDestroyAt()
	 * @generated
	 */
	void setDestroyAt(InputPin value);

} // LinkEndDestructionData

/**
 */
package org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Value;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter value gives the value(s) for a specific parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue()
 * @model
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Semantics.Classes.Kernel.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The values of for the parameter. Zero or more values are possible, as
	 *                   constrained by the multiplicity of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.modelexecution.fuml.Semantics.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getParameterValue_Values()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Value> getValues();

} // ParameterValue

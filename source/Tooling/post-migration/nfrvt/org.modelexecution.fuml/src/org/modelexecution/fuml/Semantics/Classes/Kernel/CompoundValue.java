/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A compound value is a structured value with by-value semantics. Values are
 *                 associated with each structural feature specified by the type(s) of the compound
 *                 value.
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.CompoundValue#getFeatureValues <em>Feature Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getCompoundValue()
 * @model abstract="true"
 * @generated
 */
public interface CompoundValue extends StructuredValue {
	/**
	 * Returns the value of the '<em><b>Feature Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Values</em>' containment reference list.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getCompoundValue_FeatureValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FeatureValue> getFeatureValues();

} // CompoundValue

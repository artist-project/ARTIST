/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Syntax.Classes.Kernel.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A feature value gives the value(s) that a single structural feature has in a
 *                 specific structured value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getValues <em>Values</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getFeatureValue()
 * @model
 * @generated
 */
public interface FeatureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural feature being given value(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(StructuralFeature)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getFeatureValue_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Semantics.Classes.Kernel.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The values of for the feature. Zero or more values are possible, as
	 *                   constrained by the multiplicity of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getFeatureValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of this feature value in a set of ordered values for a feature of
	 *                   an association.
	 *  [This is only relevant if the feature value is for a link
	 *                   and the feature is ordered.]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getFeatureValue_Position()
	 * @model ordered="false"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // FeatureValue

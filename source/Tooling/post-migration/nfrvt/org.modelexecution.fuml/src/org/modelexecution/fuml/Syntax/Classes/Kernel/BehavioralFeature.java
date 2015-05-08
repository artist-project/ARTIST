/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getMethod <em>Method</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ordered set of formal parameters of this
	 *                 BehavioralFeature.
	 * Specifies the ordered set of formal parameters owned by this
	 *                   BehavioralFeature. The parameter direction can be 'in', 'inout', 'out', pr
	 *                   'return' to specify input, output, or return parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getBehavioralFeature_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the behavioral feature does not have an implementation, and one
	 *                   must be supplied by a more specific element. If false, the behavioral feature must
	 *                   have an implementation in the classifier or one must be inherited from a more
	 *                   general element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getBehavioralFeature_Abstract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavioral description that implements the behavioral feature. There may be
	 *                   at most one behavior for a particular pairing of a classifier (as owner of the
	 *                   behavior) and a behavioral feature (as specification of the behavior).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getBehavioralFeature_Method()
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getSpecification
	 * @model opposite="specification" ordered="false"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the semantics of concurrent calls to the same passive instance
	 *                   (i.e., an instance originating from a class with isActive being false). Active
	 *                   instances control access to their own behavioral features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getBehavioralFeature_Concurrency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

} // BehavioralFeature

/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#isReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends org.modelexecution.fuml.Syntax.Classes.Kernel.Class {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates a behavioral feature that the behavior implements. The behavioral
	 *                   feature must be owned by the classifier that owns the behavior or be inherited by
	 *                   it. The parameters of the behavioral feature and the implementing behavior must
	 *                   match. If a behavior does not have a specification, it is directly associated with
	 *                   a classifier (i.e., it is the behavior of the classifier as a whole).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getBehavior_Specification()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the behavior can be invoked while it is still executing from a
	 *                   previous invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reentrant</em>' attribute.
	 * @see #setReentrant(boolean)
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getBehavior_Reentrant()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isReentrant();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#isReentrant <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reentrant</em>' attribute.
	 * @see #isReentrant()
	 * @generated
	 */
	void setReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a list of parameters to the behavior which describes the order and
	 *                   type of arguments that can be given when the behavior is invoked and of the values
	 *                   which will be returned when the behavior completes its execution. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getBehavior_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that is the context for the execution of the behavior. If the
	 *                   behavior is owned by a BehavioredClassifier, that classifier is the context.
	 *                   Otherwise, the context is the first BehavioredClassifier reached by following the
	 *                   chain of owner relationships. For example, following this algorithm, the context
	 *                   of an entry action in a state machine is the classifier that owns the state
	 *                   machine. The features of the context classifier as well as the elements visible to
	 *                   the context classifier are visible to the behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(BehavioredClassifier)
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getBehavior_Context()
	 * @model ordered="false"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BehavioredClassifier value);

} // Behavior

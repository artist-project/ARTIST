/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BehavioredClassifier;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Only an active class may specialize an active class.
 * Only an abstract class may have abstract behavioral features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#isActive <em>Active</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_OwnedAttribute()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Property#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operations owned by the class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_OwnedOperation()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Operation#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This gives the superclasses of a class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_SuperClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether an object specified by this class is active or not. If
	 *                   true, then the owning class is referred to as an active class. If false, then such
	 *                   a class is referred to as a passive class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_Active()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Receptions that objects of this class are willing to accept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_OwnedReception()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClass_NestedClassifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getNestedClassifier();

} // Class

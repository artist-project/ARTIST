/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getInstanceSpecification()
 * @model
 * @generated
 */
public interface InstanceSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier or classifiers of the represented instance. If multiple
	 *                   classifiers are specified, the instance is classified by all of them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getInstanceSpecification_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot giving the value or values of a structural feature of the instance. An
	 *                   instance specification can have one slot per structural feature of its
	 *                   classifiers, including inherited features. It is not necessary to model a slot for
	 *                   each structural feature, in which case the instance specification is a partial
	 *                   description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getInstanceSpecification_Slot()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Slot#getOwningInstance
	 * @model opposite="owningInstance" containment="true" ordered="false"
	 * @generated
	 */
	EList<Slot> getSlot();

} // InstanceSpecification

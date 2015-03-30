/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isFinalSpecialization <em>Final Specialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace, Type {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier does not provide a complete declaration and can
	 *                   typically not be instantiated. An abstract classifier is intended to be used by
	 *                   other classifiers e.g. as the target of general metarelationships or
	 *                   generalization relationships. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_Abstract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Generalization relationships for this Classifier. These
	 *                   Generalizations navigaten to more general classifiers in the generalization
	 *                   hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_Generalization()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization#getSpecific
	 * @model opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefines the corresponding association in Abstractions. Note that there may
	 *                   be members of the Classifier that are of the type Feature but are not included in
	 *                   this association, e.g. inherited features.
	 * Specifies each feature defined in the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_Feature()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies all elements inherited by this classifier from the general
	 *                   classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_InheritedMember()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to all of the Properties that are direct (i.e. not inherited or import
	 *                   fUML.Syntax.d) attributes of the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_Attribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_General()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Specialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Specialization</em>' attribute.
	 * @see #setFinalSpecialization(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getClassifier_FinalSpecialization()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isFinalSpecialization();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#isFinalSpecialization <em>Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Specialization</em>' attribute.
	 * @see #isFinalSpecialization()
	 * @generated
	 */
	void setFinalSpecialization(boolean value);

} // Classifier

/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefines the corresponding association in Abstractions.
	 * The Classifiers that have this Feature as a feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getFeature_FeaturingClassifier()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier#getFeature
	 * @model opposite="feature" ordered="false"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifier();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this feature characterizes individual instances classified
	 *                   by the classifier (false) or the classifier itself (true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getFeature_Static()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Feature#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // Feature

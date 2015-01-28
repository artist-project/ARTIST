/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getComment_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getComment_Body()
	 * @model ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Comment

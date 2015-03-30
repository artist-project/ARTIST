/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamedElement_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines where the NamedElement appears within different Namespaces within
	 *                   the overall model, and its accessibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamedElement_Visibility()
	 * @model ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which allows the NamedElement to be identified within a hierarchy of
	 *                   nested Namespaces. It is constructed from the names of the containing namespaces
	 *                   starting at the root of the hierarchy and ending with the name of the NamedElement
	 *                   itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamedElement_QualifiedName()
	 * @model ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamedElement_Namespace()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getOwnedMember
	 * @model opposite="ownedMember" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

} // NamedElement

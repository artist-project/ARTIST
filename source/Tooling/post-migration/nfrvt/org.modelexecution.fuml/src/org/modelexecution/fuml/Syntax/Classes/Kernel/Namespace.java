/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace_Member()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace_ElementImport()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace_PackageImport()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace_ImportedMember()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage#getNamespace_OwnedMember()
	 * @see org.modelexecution.fuml.Syntax.Classes.Kernel.NamedElement#getNamespace
	 * @model opposite="namespace" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

} // Namespace

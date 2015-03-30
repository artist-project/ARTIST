/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object is an extensional value that may have multiple types, all of which
 *                 must be classes. (Note that a destroyed object has no types.)
 *  An object has
 *                 a unique identity. Usually, references to objects are manipulated, rather than the
 *                 objects themselves, and there may be multiple references to the same
 *                 object.
 *  If an object is active, it has an object activation that handle the
 *                 execution of its classifier behavior(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.Object#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends ExtensionalValue {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Syntax.Classes.Kernel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classes under which this object is currently classified. (A destroyed
	 *                   object has no types.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getObject_Types()
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.modelexecution.fuml.Syntax.Classes.Kernel.Class> getTypes();

} // Object

/**
 */
package org.modelexecution.fuml.Semantics.Loci.LociL1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A locus is a place at which extensional values (objects or links) can exist. The
 *                 extent of a class or association is the set of objects or links of that type that
 *                 exist at a certain locus.
 *  A locus also has an executor and a factory
 *                 associated with it, used to execute behaviors as a result of requests dispatched to
 *                 objects at the locus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Loci.LociL1.Locus#getExtensionalValues <em>Extensional Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package#getLocus()
 * @model
 * @generated
 */
public interface Locus extends EObject {
	/**
	 * Returns the value of the '<em><b>Extensional Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue}.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus <em>Locus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensional Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of values that are members of classifier extents at this locus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensional Values</em>' containment reference list.
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package#getLocus_ExtensionalValues()
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus
	 * @model opposite="locus" containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionalValue> getExtensionalValues();

} // Locus

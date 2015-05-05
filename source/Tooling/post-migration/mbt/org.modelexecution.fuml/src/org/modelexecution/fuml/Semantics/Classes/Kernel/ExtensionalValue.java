/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Semantics.Loci.LociL1.Locus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extensional value is a data value that is part of the extent of some
 *                 classifier at a specific locus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus <em>Locus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getExtensionalValue()
 * @model abstract="true"
 * @generated
 */
public interface ExtensionalValue extends CompoundValue {

	/**
	 * Returns the value of the '<em><b>Locus</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.modelexecution.fuml.Semantics.Loci.LociL1.Locus#getExtensionalValues <em>Extensional Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The locus of the extent of which this value is a member. (If the value has
	 *                   been destroyed, it has no locus.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locus</em>' container reference.
	 * @see #setLocus(Locus)
	 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getExtensionalValue_Locus()
	 * @see org.modelexecution.fuml.Semantics.Loci.LociL1.Locus#getExtensionalValues
	 * @model opposite="extensionalValues" transient="false" ordered="false"
	 * @generated
	 */
	Locus getLocus();

	/**
	 * Sets the value of the '{@link org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue#getLocus <em>Locus</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locus</em>' container reference.
	 * @see #getLocus()
	 * @generated
	 */
	void setLocus(Locus value);
} // ExtensionalValue

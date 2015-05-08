/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel;

import org.modelexecution.fuml.Semantics.Loci.LociL1.SemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value is an instance of one or more classifiers, which are its types. A value
 *                 is always representable using a value specification.
 *  
 *  [Note: Value
 *                 specializes SemanticVisitor to allow the Execution subclass to be a semantic
 *                 visitor, without requiring multiple generalization of Execution.]
 * <!-- end-model-doc -->
 *
 *
 * @see org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends SemanticVisitor {
} // Value

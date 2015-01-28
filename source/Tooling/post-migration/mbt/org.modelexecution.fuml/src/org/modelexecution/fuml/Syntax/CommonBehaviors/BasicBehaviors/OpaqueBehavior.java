/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior#getBody <em>Body</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getOpaqueBehavior_Body()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage#getOpaqueBehavior_Language()
	 * @model
	 * @generated
	 */
	EList<String> getLanguage();

} // OpaqueBehavior

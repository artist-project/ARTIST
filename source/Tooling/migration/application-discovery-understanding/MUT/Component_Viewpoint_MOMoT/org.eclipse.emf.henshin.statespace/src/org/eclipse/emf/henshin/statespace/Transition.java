/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import org.eclipse.emf.henshin.model.Rule;

/**
 * Interface for transitions.
 * 
 * @generated
 */
public interface Transition extends Storage {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.statespace.State#getOutgoing <em>Outgoing</em>}'.
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see org.eclipse.emf.henshin.statespace.State#getOutgoing
	 * @model opposite="outgoing" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.Transition#getSource <em>Source</em>}' container reference.
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.statespace.State#getIncoming <em>Incoming</em>}'.
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.emf.henshin.statespace.State#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.Transition#getTarget <em>Target</em>}' reference.
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @model
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.Transition#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Get the label of this transition.
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see #setMatch(int)
	 * @model
	 * @generated
	 */
	int getMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.Transition#getMatch <em>Match</em>}' attribute.
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(int value);

	/**
	 * Get the number of parameters for this transition.
	 * @return the value of the '<em>Parameter Count</em>' attribute.
	 * @see #setParameterCount(int)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getTransition_ParameterCount()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	int getParameterCount();

	/**
	 * Set the number of parameters for this transition.
	 * @param value the new value of the '<em>Parameter Count</em>' attribute.
	 * @see #getParameterCount()
	 * @generated
	 */
	void setParameterCount(int value);

	/**
	 * Get the parameter keys for this transition.
	 * @see #setParameterKeys(int[])
	 * @model dataType="org.eclipse.emf.henshin.statespace.IntegerArray" transient="true" volatile="true"
	 * @generated
	 */
	int[] getParameterKeys();

	/**
	 * Set the parameter keys for this transition.
	 * @see #getParameterKeys()
	 * @generated
	 */
	void setParameterKeys(int[] value);

}
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Interface for states.
 * 
 * @generated
 */
public interface State extends Storage {

	/**
	 * Color for normal states (RGB).
	 */
	public final static int[] COLOR_DEFAULT = new int[] { 220,220,220 };

	/**
	 * Color for initial states (RGB).
	 */
	public final static int[] COLOR_INITIAL = new int[] { 40,220,40 };

	/**
	 * Color for terminal states (RGB).
	 */
	public final static int[] COLOR_TERMINAL = new int[] { 250,60,60 };

	/**
	 * Color for open states (RGB).
	 */
	public final static int[] COLOR_OPEN = new int[] { 100,100,250 };

	/**
	 * Color for pruned states (RGB).
	 */
	public final static int[] COLOR_PRUNED = new int[] { 255,40,167 };

	/**
	 * Get the index of this state.
	 * @return the index of this state.
	 * @see #setIndex(int)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getState_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Set the index of this state. Should be done only by {@link StateSpaceManager}s.
	 * @param value the new index.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' attribute.
	 * @see #setDerivedFrom(int)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getState_DerivedFrom()
	 * @model volatile="true"
	 * @generated
	 */
	int getDerivedFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.State#getDerivedFrom <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' attribute.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(int value);

	/**
	 * Get the list of incoming transitions of this state. 
	 * @return list of incoming transitions.
	 * @see org.eclipse.emf.henshin.statespace.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Get the list of outgoing transitions of this state. 
	 * @return the outgoing transitions.
	 * @see org.eclipse.emf.henshin.statespace.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Get the associated model of this state.
	 * @return the associated model.
	 * @see #setModel(Resource)
	 * @model transient="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Set the model for this state.
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Get the state space that contains this state. 
	 * @return the state space that contains this state.
	 * @see #setStateSpace(StateSpace)
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	StateSpace getStateSpace();

	/**
	 * Set the state space that contains this state.
	 * @param stateSpace the container state space.
	 * @see #getStateSpace()
	 * @generated
	 */
	void setStateSpace(StateSpace value);

	/**
	 * Get the location of this state. This always returns 
	 * an integer array of size 3 (X,Y and Z coordinate).
	 * @return the location of this state.
	 * @see #setLocation(int[])
	 * @model dataType="org.eclipse.emf.henshin.statespace.IntegerArray" transient="true" volatile="true"
	 * @generated
	 */
	int[] getLocation();

	/**
	 * Sets the location of this state. The argument must have length 3.
	 * @param the new location of the state.
	 * @see #getLocation()
	 * @generated NOT
	 */
	void setLocation(int... location);

	/**
	 * Check whether this state is open.
	 * @return <code>true</code> if it is open.
	 * @see #setOpen(boolean)
	 * @model default="false"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Set the open flag.
	 * @param value the new value of the open flag.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(boolean)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getState_Goal()
	 * @model default="false" transient="true" volatile="true"
	 * @generated
	 */
	boolean isGoal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.State#isGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #isGoal()
	 * @generated
	 */
	void setGoal(boolean value);

	/**
	 * Returns the value of the '<em><b>Pruned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pruned</em>' attribute.
	 * @see #setPruned(boolean)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getState_Pruned()
	 * @model default="false" transient="true" volatile="true"
	 * @generated
	 */
	boolean isPruned();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.statespace.State#isPruned <em>Pruned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruned</em>' attribute.
	 * @see #isPruned()
	 * @generated
	 */
	void setPruned(boolean value);

	/**
	 * Get the hash code of this state.
	 * @return the hash code.
	 * @see #setHashCode(int)
	 * @model default="0" transient="true" volatile="true"
	 * @generated
	 */
	int getHashCode();

	/**
	 * Set the hash code of this state.
	 * @param hashCode the hash code.
	 * @see #getHashCode()
	 * @generated
	 */
	void setHashCode(int value);

	/**
	 * Get the number of nodes in this state's model.
	 * @return the value of the '<em>Node Count</em>' attribute.
	 * @see #setObjectCount(int)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getState_NodeCount()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	int getObjectCount();

	/**
	 * Set the number of objects in this state's model.
	 * @param objectCount the new value of the '<em>Object Count</em>' attribute.
	 * @see #getObjectCount()
	 * @generated
	 */
	void setObjectCount(int value);

	/**
	 * Get the object keys for the current state model.
	 * @return the value of the '<em>Object Keys</em>' attribute.
	 * @model dataType="org.eclipse.emf.henshin.statespace.IntegerArray" transient="true" volatile="true"
	 * @generated
	 */
	int[] getObjectKeys();

	/**
	 * Set the object keys for the current state model.
	 * @param objectKeys the new value of the '<em>Object Keys</em>' attribute.
	 * @see #getObjectKeys()
	 * @generated
	 */
	void setObjectKeys(int[] value);

	/**
	 * Check whether this state is an initial one. A state is initial
	 * if {@link #getModel()} returns a resource with a non-<code>null</code> URI.
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paramIDsDataType="org.eclipse.emf.henshin.statespace.IntegerArray"
	 * @generated
	 */
	Transition getOutgoing(State target, Rule rule, int match, int[] paramIDs);

}
/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Edge#getIndexConstant <em>Index Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='equalParentGraphs'"
 * @generated
 */
public interface Edge extends ModelElement, GraphElement {
	
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_Source()
	 * @see org.eclipse.emf.henshin.model.Node#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_Target()
	 * @see org.eclipse.emf.henshin.model.Node#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EReference)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_Type()
	 * @model
	 * @generated
	 */
	EReference getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Edge#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EReference value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_Graph()
	 * @see org.eclipse.emf.henshin.model.Graph#getEdges
	 * @model opposite="edges" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Edge#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Edge#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Index Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Constant</em>' attribute.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getEdge_IndexConstant()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Integer getIndexConstant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Edge getActionEdge();

} // Edge

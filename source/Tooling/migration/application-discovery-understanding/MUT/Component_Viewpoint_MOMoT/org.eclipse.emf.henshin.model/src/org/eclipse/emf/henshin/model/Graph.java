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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.Graph#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraph()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNodeNames'"
 * @generated
 */
public interface Graph extends NamedElement {
	
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraph_Nodes()
	 * @see org.eclipse.emf.henshin.model.Node#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.model.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraph_Edges()
	 * @see org.eclipse.emf.henshin.model.Edge#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Formula)
	 * @see org.eclipse.emf.henshin.model.HenshinPackage#getGraph_Formula()
	 * @model containment="true"
	 * @generated
	 */
	Formula getFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.model.Graph#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Formula value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the {@link Rule} this graph is contained in or <code>null</code> if it is not directly contained in a {@link Rule}.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Rule getRule();

	/**
	 * <!-- begin-user-doc -->
	 * Get the first node in this graph that has the given argument name.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node getNode(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Get all nodes in this graph that are of a specific type.
	 * This returns an unmodifiable list of nodes.
	 * <!-- end-user-doc -->
	 * @model ordered="false" nodeTypeRequired="true"
	 * @generated
	 */
	EList<Node> getNodes(EClass nodeType);

	/**
	 * <!-- begin-user-doc -->
	 * Get all edges in this graph that are of a specific type.
	 * This returns an unmodifiable list of edge.
	 * <!-- end-user-doc -->
	 * @model ordered="false" edgeTypeRequired="true"
	 * @generated
	 */
	EList<Edge> getEdges(EReference edgeType);

	/**
	 * <!-- begin-user-doc -->
	 * Get all nested conditions that occur in the formula of this graph.
	 * This returns an unmodifiable list of nested condition objects.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NestedCondition> getNestedConditions();

	/**
	 * <!-- begin-user-doc -->
	 * Get a positive application condition (PAC) of this graph with a given name.
	 * This returns the first PAC with this name.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NestedCondition getPAC(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Get a negative application condition (PAC) of this graph with a given name.
	 * This returns the first NAC with this name.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NestedCondition getNAC(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NestedCondition> getPACs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NestedCondition> getNACs();

	/**
	 * <!-- begin-user-doc -->
	 * Check whether this graph is the left-hand side of a rule.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isLhs();

	/**
	 * <!-- begin-user-doc -->
	 * Check whether this graph is the right-hand side of a rule.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRhs();

	/**
	 * <!-- begin-user-doc -->
	 * Check whether this graph is a nested condition of a rule.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isNestedCondition();
	
	/**
	 * <!-- begin-user-doc -->
	 * Create a new positive application condition (PAC) in this graphs formula.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NestedCondition createPAC(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Create a new negative application condition (NAC) in this graphs formula.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NestedCondition createNAC(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Removes the given node from this graph. All attached edges are automatically removed.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeNode(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * Detaches the given edge from its source and target node and removes it from this graph.
	 * <!-- end-user-doc -->
	 * @model edgeRequired="true"
	 * @generated
	 */
	boolean removeEdge(Edge edge);

	/**
	 * <!-- begin-user-doc -->
	 * Remove a nested condition from this graph's formula.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeNestedCondition(NestedCondition nestedCondition);

} // Graph

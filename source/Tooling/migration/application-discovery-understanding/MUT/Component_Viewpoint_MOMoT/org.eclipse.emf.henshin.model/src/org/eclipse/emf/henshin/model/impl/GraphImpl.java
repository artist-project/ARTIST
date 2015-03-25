/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.And;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Not;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.UnaryFormula;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Graph</b></em>'. 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.GraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.GraphImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends NamedElementImpl implements Graph {
	
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;
	
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;
	
	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected Formula formula;
	
	/**
	 * <!-- begin-user-doc -->
	 * Default constructor.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Convenience constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GraphImpl(String name) {
		super();
		setName(name);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HenshinPackage.Literals.GRAPH;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, HenshinPackage.GRAPH__NODES, HenshinPackage.NODE__GRAPH);
		}
		return nodes;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, HenshinPackage.GRAPH__EDGES, HenshinPackage.EDGE__GRAPH);
		}
		return edges;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getFormula() {
		return formula;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(Formula newFormula, NotificationChain msgs) {
		Formula oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HenshinPackage.GRAPH__FORMULA, oldFormula, newFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(Formula newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.GRAPH__FORMULA, null, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.GRAPH__FORMULA, null, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.GRAPH__FORMULA, newFormula, newFormula));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeNode(Node node) {
		if (!getNodes().contains(node)) {
			return false;
		}
		for (Edge edge : node.getAllEdges()) {
			removeEdge(edge);
		}
		getNodes().remove(node);
		return true;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEdge(Edge edge) {	
		if (!getEdges().contains(edge)) {
			return false;
		}
		edge.setSource(null);
		edge.setTarget(null);
		getEdges().remove(edge);
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeNestedCondition(NestedCondition nestedCondition) {
		
		// Nested condition must be contained in this rule:
		if (!EcoreUtil.isAncestor(this, nestedCondition)) {
			return false;
		}
		
		// Remember the container and destroy the object:
		EObject container = nestedCondition.eContainer();
		EcoreUtil.remove(nestedCondition);
		
		// Destroy unary containers:
		while (container instanceof UnaryFormula) {
			EObject dummy = container;
			container = container.eContainer();
			EcoreUtil.remove(dummy);
		}
		
		// Check if the container was a binary formula:
		if (container instanceof BinaryFormula) {
			BinaryFormula binary = (BinaryFormula) container;
			
			// Replace the formula by the remaining sub-formula:
			Formula remainder = (binary.getLeft() != null) ? binary.getLeft() : binary.getRight();
			EcoreUtil.replace(binary, remainder);
		}
		
		// Done.
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NestedCondition createPAC(String name) {
		
		// Create the PAC:
		NestedCondition pac = new NestedConditionImpl();
		Graph graph = new GraphImpl();
		graph.setName(name);
		pac.setConclusion(graph);
		
		// Add it to the formula:
		if (formula==null) {
			setFormula(pac);
		} else {
			And and = new AndImpl();
			and.setLeft(formula);
			and.setRight(pac);
			setFormula(and);
		}
		return pac;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NestedCondition createNAC(String name) {
		
		// Create the NAC:
		NestedCondition nac = new NestedConditionImpl();
		Graph graph = new GraphImpl();
		graph.setName(name);
		nac.setConclusion(graph);
		Not not = new NotImpl();
		not.setChild(nac);
		
		// Add it to the formula:
		if (formula==null) {
			setFormula(not);
		} else {
			And and = new AndImpl();
			and.setLeft(formula);
			and.setRight(not);
			setFormula(and);
		}
		return nac;
		
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule getRule() {
		EObject container = eContainer();
		while (container!=null) {
			if (container instanceof Rule) {
				return (Rule) container;
			}
			container = container.eContainer();
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Node getNode(String name) {
		if (name==null) name = ""; 
		else name = name.trim();
		for (Node node : getNodes()) {
			String n = node.getName();
			n = (n==null) ? "" : n.trim();
			if (name.equals(n)) return node;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getNodes(EClass nodeType) {
		EList<Node> result = new BasicEList<Node>();
		for (Node node : this.getNodes()) {
			if (nodeType.equals(node.getType()))
				result.add(node);
		}
		return ECollections.unmodifiableEList(result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Edge> getEdges(EReference edgeType) {
		EList<Edge> result = new BasicEList<Edge>();
		for (Edge edge : this.getEdges()) {
			if (edgeType.equals(edge.getType()))
				result.add(edge);
		}
		return ECollections.unmodifiableEList(result);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<NestedCondition> getNestedConditions() {
		EList<NestedCondition> result = new BasicEList<NestedCondition>();
		collectNestedConditions(getFormula(), result);
		return ECollections.unmodifiableEList(result);
	}

	/*
	 * Collect nested conditions.
	 */
	private void collectNestedConditions(Formula formula, EList<NestedCondition> nestedConditions) {
		if (formula instanceof NestedCondition) {
			nestedConditions.add((NestedCondition) formula);
		} else if (formula instanceof UnaryFormula) {
			collectNestedConditions(((UnaryFormula) formula).getChild(), nestedConditions);
		} else if (formula instanceof BinaryFormula) {
			collectNestedConditions(((BinaryFormula) formula).getLeft(), nestedConditions);
			collectNestedConditions(((BinaryFormula) formula).getRight(), nestedConditions);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NestedCondition getPAC(String name) {
		return getPACorNAC(name, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NestedCondition getNAC(String name) {
		return getPACorNAC(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<NestedCondition> getPACs() {
		EList<NestedCondition> pacs = new BasicEList<NestedCondition>();
		for (NestedCondition nestedCondition : getNestedConditions()) {
			if (nestedCondition.isPAC()) {
				pacs.add(nestedCondition);
			}
		}
		return ECollections.unmodifiableEList(pacs); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<NestedCondition> getNACs() {
		EList<NestedCondition> nacs = new BasicEList<NestedCondition>();
		for (NestedCondition nestedCondition : getNestedConditions()) {
			if (nestedCondition.isNAC()) {
				nacs.add(nestedCondition);
			}
		}
		return ECollections.unmodifiableEList(nacs); 
	}

	/*
	 * Get a PAC or a NAC with a given name.
	 */
	private NestedCondition getPACorNAC(String name, boolean isPAC) {
		name = (name==null) ? "" : name.trim();
		for (NestedCondition cond : getNestedConditions()) {
			if (cond.getConclusion()==null) continue;
			if (isPAC && !cond.isPAC()) continue;
			if (!isPAC && !cond.isNAC()) continue;
			String n = cond.getConclusion().getName();
			n = (n==null) ? "" : n.trim();
			if (name.equals(n))	return cond;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLhs() {
		return (eContainer() instanceof Rule) && (((Rule) eContainer()).getLhs()==this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRhs() {
		return (eContainer() instanceof Rule) && (((Rule) eContainer()).getRhs()==this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated
	 */
	public boolean isHost() {
		return (eContainer() instanceof Module);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isNestedCondition() {
		return (eContainer() instanceof NestedCondition);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case HenshinPackage.GRAPH__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case HenshinPackage.GRAPH__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case HenshinPackage.GRAPH__FORMULA:
				return basicSetFormula(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				return getNodes();
			case HenshinPackage.GRAPH__EDGES:
				return getEdges();
			case HenshinPackage.GRAPH__FORMULA:
				return getFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case HenshinPackage.GRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case HenshinPackage.GRAPH__FORMULA:
				setFormula((Formula)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case HenshinPackage.GRAPH__EDGES:
				getEdges().clear();
				return;
			case HenshinPackage.GRAPH__FORMULA:
				setFormula((Formula)null);
				return;
		}
		super.eUnset(featureID);
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HenshinPackage.GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case HenshinPackage.GRAPH__EDGES:
				return edges != null && !edges.isEmpty();
			case HenshinPackage.GRAPH__FORMULA:
				return formula != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "Graph " + name;
	}

} // GraphImpl

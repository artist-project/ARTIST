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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.actions.EdgeActionHelper;
import org.eclipse.emf.henshin.model.actions.NodeActionHelper;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Rule</b></em>'. 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getAttributeConditions <em>Attribute Conditions</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#isCheckDangling <em>Check Dangling</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#isInjectiveMatching <em>Injective Matching</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getMultiRules <em>Multi Rules</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getMultiMappings <em>Multi Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.model.impl.RuleImpl#getJavaImports <em>Java Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends UnitImpl implements Rule {
	
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Graph lhs;
	
	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Graph rhs;
		
	/**
	 * The cached value of the '{@link #getAttributeConditions() <em>Attribute Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeCondition> attributeConditions;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The default value of the '{@link #isCheckDangling() <em>Check Dangling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckDangling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_DANGLING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCheckDangling() <em>Check Dangling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckDangling()
	 * @generated
	 * @ordered
	 */
	protected boolean checkDangling = CHECK_DANGLING_EDEFAULT;

	/**
	 * The default value of the '{@link #isInjectiveMatching() <em>Injective Matching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjectiveMatching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INJECTIVE_MATCHING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInjectiveMatching() <em>Injective Matching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjectiveMatching()
	 * @generated
	 * @ordered
	 */
	protected boolean injectiveMatching = INJECTIVE_MATCHING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiRules() <em>Multi Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> multiRules;

	/**
	 * The cached value of the '{@link #getMultiMappings() <em>Multi Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> multiMappings;
	
	/**
	 * The cached value of the '{@link #getJavaImports() <em>Java Imports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> javaImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RuleImpl(String name) {
		setName(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HenshinPackage.Literals.RULE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Graph getLhs() {
		if (lhs==null) {
			Graph theLhs = new GraphImpl();
			theLhs.setName("Lhs");
			setLhs(theLhs);  // required for setting the container feature
		}
		return lhs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Graph newLhs, NotificationChain msgs) {
		Graph oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Graph newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.RULE__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.RULE__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__LHS, newLhs, newLhs));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Graph getRhs() {
		if (rhs==null) {
			Graph theRhs = new GraphImpl();
			theRhs.setName("Rhs");
			setRhs(theRhs);  // required for setting the container feature
		}
		return rhs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Graph newRhs, NotificationChain msgs) {
		Graph oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Graph newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.RULE__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HenshinPackage.RULE__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__RHS, newRhs, newRhs));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeCondition> getAttributeConditions() {
		if (attributeConditions == null) {
			attributeConditions = new EObjectContainmentWithInverseEList<AttributeCondition>(AttributeCondition.class, this, HenshinPackage.RULE__ATTRIBUTE_CONDITIONS, HenshinPackage.ATTRIBUTE_CONDITION__RULE);
		}
		return attributeConditions;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MappingList getMappings() {
		if (mappings == null) {
			mappings = new MappingContainmentListImpl(this, HenshinPackage.RULE__MAPPINGS);
		}
		return (MappingList) mappings;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule getKernelRule() {
		EObject container = eContainer();
		if (container instanceof Rule) {
			return (Rule) container;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule getRootRule() {
		Rule kernel = getKernelRule();
		if (kernel==null) {
			return this;
		}
		while (kernel.getKernelRule()!=null) {
			kernel = kernel.getKernelRule();
		}
		return kernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rule getMultiRule(String name) {
		name = (name==null) ? "" : name.trim();
		for (Rule multiRule : getMultiRules()) {
			String n = multiRule.getName();
			n = (n==null) ? "" : n.trim();
			if (name.equals(n))	return multiRule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Rule> getMultiRulePath(Rule multiRule) {
		List<Rule> path = new Vector<Rule>();
		while (multiRule!=null && multiRule!=this) {
			path.add(0, multiRule);
			multiRule = multiRule.getKernelRule();
		}
		if (multiRule!=this) {
			path.clear();
		}
		return ECollections.unmodifiableEList(new BasicEList<Rule>(path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Rule> getAllMultiRules() {
		EList<Rule> allMultiRules = new BasicEList<Rule>();
		allMultiRules.addAll(getMultiRules());
		for (Rule multiRule : getMultiRules()) {
			allMultiRules.addAll(multiRule.getAllMultiRules());
		}
		return ECollections.unmodifiableEList(allMultiRules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MappingList getAllMappings() {
		MappingList mappings = new MappingListImpl();
		TreeIterator<EObject> it = eAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof Mapping) {
				mappings.add((Mapping) obj);
			}
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getActionNodes(Action action) {
		List<Node> result = NodeActionHelper.INSTANCE.getActionElements(this, action);
		return ECollections.unmodifiableEList(new BasicEList<Node>(result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Edge> getActionEdges(Action action) {
		List<Edge> result = EdgeActionHelper.INSTANCE.getActionElements(this, action);
		return ECollections.unmodifiableEList(new BasicEList<Edge>(result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getParameterNodes() {
		EList<Node> nodes = new BasicEList<Node>();
		for (Parameter param : getParameters()) {
			Node node = findNodeByName(param.getName());
			if (node!=null) nodes.add(node);
		}
		return nodes;
	}

	/*
	 * Find a node in a graph based on its name.
	 */
	private static Node findNodeByName(String name, Graph graph) {
		for (Node node : graph.getNodes()) {
			if (name.equals(node.getName())) return node;
		}
		return null;
	}
	
	/*
	 * Find a node in a rule based on its name.
	 */
	private Node findNodeByName(String name) {
		Node node = findNodeByName(name, getLhs());
		if (node==null) {
			node = findNodeByName(name, getRhs());
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isMultiRule() {
		return getKernelRule()!=null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Node createNode(EClass type) {
		
		// Create nodes in the Lhs and the Rhs:
		Node lhsNode = new NodeImpl();
		Node rhsNode = new NodeImpl();
		
		// Set the type:
		lhsNode.setType(type);
		rhsNode.setType(type);
		
		// Add the nodes to the Lhs and the Rhs:
		getLhs().getNodes().add(lhsNode);
		getRhs().getNodes().add(rhsNode);
		
		// Add a mapping:
		getMappings().add(lhsNode, rhsNode);
		
		// Return the action node:
		return lhsNode.getActionNode();
		
	}

	/**
	 * Get all mappings referring to a node. Can also do it transitively.
	 * @param nodes Nodes for which we want to find mappings.
	 * @param mappings Collected mappings.
	 * @param transitive if <code>true</code>, mapped nodes are added.
	 */
	private void getNodeMappings(Set<Node> nodes, Set<Mapping> mappings, boolean transitive) {
		boolean changed;
		do {
			changed = false;
			// Add all mappings that refer to the nodes:
			for (Mapping m : getAllMappings()) {
				if (!mappings.contains(m)) {
					for (Node n : nodes) {
						if (m.getOrigin()==n || m.getImage()==n) {
							mappings.add(m);
							changed = true;
							break;
						}
					}
				}
			}
			// Add all mapped nodes if necessary:
			if (changed && transitive) {
				for (Mapping m : mappings) {
					if (m.getOrigin()!=null) {
						nodes.add(m.getOrigin());
					}
					if (m.getImage()!=null) {
						nodes.add(m.getImage());
					}
				}
			}
		} while (changed);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeNode(Node node, boolean removeMapped) {
		
		// Must be invoked from the root kernel rule:
		if (getRootRule()!=this) {
			return getRootRule().removeNode(node, removeMapped);
		}
		
		// Collect all mappings and nodes to delete:
		Set<Mapping> mappings = new HashSet<Mapping>();
		Set<Node> nodes = new HashSet<Node>();
		nodes.add(node);
		getNodeMappings(nodes, mappings, removeMapped);
		
		// Now remove the collected mappings and nodes:
		for (Mapping m : mappings) {
			m.setOrigin(null);
			m.setImage(null);
			EcoreUtil.remove(m);
		}
		for (Node n : nodes) {
			n.getGraph().removeNode(n);
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Edge createEdge(Node source, Node target, EReference type) {

		// Must be called at the root rule:
		if (getRootRule()!=this) {
			return getRootRule().createEdge(source, target, type);
		}

		// Check if we really can create an edge:
		if (!canCreateEdge(source, target, type)) {
			return null;
		}

		// Get the real source and target:
		List<Node> sourceAndTarget = getSourceAndTargetForEdgeCreation(source, target, false);
		source = sourceAndTarget.get(0);
		target = sourceAndTarget.get(1);

		// Check if there is an edge and create a new one if necessary:
		Edge edge = source.getOutgoing(type, target);
		if (edge==null) {
			edge = HenshinFactory.eINSTANCE.createEdge(source, target, type);			
		}
		
		// If the source and the target lie both in an LHS, try to create an image in the RHS as well:
		Graph sourceGraph = source.getGraph();
		if (sourceGraph!=null && sourceGraph.isLhs() && sourceGraph==target.getGraph() && sourceGraph.getRule()!=null) {
			
			// Get the node images in the RHS:
			source = sourceGraph.getRule().getMappings().getImage(source, sourceGraph.getRule().getRhs());
			target = sourceGraph.getRule().getMappings().getImage(target, sourceGraph.getRule().getRhs());
			
			// Node images must be found:
			if (source!=null && target!=null) {
				Edge edge2 = source.getOutgoing(type, target);
				if (edge2==null) {
					edge2 = HenshinFactory.eINSTANCE.createEdge(source, target, type);
				}
			}
		}
		
		// Done.
		return edge;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean canCreateEdge(Node source, Node target, EReference type) {

		// Must be called at the root rule:
		if (getRootRule()!=this) {
			return getRootRule().canCreateEdge(source, target, type);
		}
		
		// Get the source and target type.
		EClass targetType = target.getType();
		EClass sourceType = source.getType();

		// Everything must be set.
		if (source == null || target == null || sourceType == null || targetType == null || type == null) {
			return false;
		}

		// Reference must be owned by source.
		if (!sourceType.getEAllReferences().contains(type)) {
			return false;
		}

		// Target type must be ok. Extra check for EObjects!!!
		if (!type.getEReferenceType().isSuperTypeOf(targetType) &&
			!targetType.isSuperTypeOf(type.getEReferenceType())
				&& type.getEReferenceType() != EcorePackage.eINSTANCE
						.getEObject()) {
			return false;
		}

		// Check whether we get the proper source and target nodes for the edges creation:
		List<Node> sourceAndTarget = getSourceAndTargetForEdgeCreation(source, target, false);
		if (sourceAndTarget==null || sourceAndTarget.size()!=2) {
			return false;
		}
		source = sourceAndTarget.get(0);
		target = sourceAndTarget.get(1);

		// Check if there is already an edge:
		Edge edge = source.getOutgoing(type, target);
		if (edge!=null) {
			return false;
		}

		// Everything ok:
		return true;
	}

	/*
	 * Get the source and target nodes to be used for creating an edge.
	 * This returns either a list of two nodes in the same graph, or null.
	 */
	private List<Node> getSourceAndTargetForEdgeCreation(Node source, Node target, boolean reverse) {

		// Get the source and target graphs:
		Graph sourceGraph = source.getGraph();
		Graph targetGraph = target.getGraph();
		if (sourceGraph==null || targetGraph==null) {
			return null;
		}

		// Get the rules:
		Rule sourceRule = sourceGraph.getRule();
		Rule targetRule = targetGraph.getRule();
		if (sourceRule==null || targetRule==null) {
			return null;
		}
		
		// Must be this rule or a multi-rule:
		List<Rule> multis = getAllMultiRules();
		if (sourceRule!=this && !multis.contains(sourceRule)) {
			return null;
		}
		if (targetRule!=this && !multis.contains(targetRule)) {
			return null;
		}

		// Create the result list:
		List<Node> result = new Vector<Node>();
		
		// Same rule?
		if (sourceRule==targetRule) {
			if (sourceGraph==targetGraph) {		// same graphs?
				result.add(source);
				result.add(target);
			}
			else if (sourceGraph.isLhs()) {		// otherwise at least one graph should be an LHS
				MappingList mappings = null;				
				if (targetGraph.isRhs()) {
					mappings = targetRule.getMappings();
				} else if (targetGraph.isNestedCondition()) {
					mappings = ((NestedCondition) targetGraph.eContainer()).getMappings();
				}
				if (mappings!=null) {
					Node sourceImage = mappings.getImage(source, targetGraph);
					if (sourceImage!=null) {
						result.add(sourceImage);
						result.add(target);
					}
				}
			}
			else if (targetGraph.isLhs()) {		// symmetric case
				result = getSourceAndTargetForEdgeCreation(target, source, true);
			}
		}
		else {
			
			// Otherwise one rule should be a direct or indirect multi-rule of the other:
			EList<Rule> path = sourceRule.getMultiRulePath(targetRule);
			if (!path.isEmpty()) {
				
				// Find the corresponding node in the target rule:
				Node newSource = source;
				for (Rule multiRule : path) {
					newSource = multiRule.getMultiMappings().getImage(newSource, null);	// at most one image
					if (newSource==null) break;
				}
				
				// If the new source was found, we can use it instead of the old one:
				if (newSource!=null) {
					return getSourceAndTargetForEdgeCreation(newSource, target, reverse);
				}
			}
			else {
				path = targetRule.getMultiRulePath(sourceRule);
				if (!path.isEmpty()) {		// symmetric case
					result = getSourceAndTargetForEdgeCreation(target, source, true);
				}
			}
		}

		// Reverse the result?
		if (reverse) {
			Collections.reverse(result);
		}
		
		// Done.
		return (result==null || result.isEmpty()) ? null : result;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeEdge(Edge edge, boolean removeMapped) {
		
		// Must be invoked from the root kernel rule:
		if (getRootRule()!=this) {
			return getRootRule().removeEdge(edge, removeMapped);
		}
		
		// Edges to be removed:
		Set<Edge> edges = new HashSet<Edge>();
		edges.add(edge);
		
		// Collect mapped edges if necessary:
		if (removeMapped) {
			// Collect a list of ALL mappings:
			MappingList mappings = getAllMappings();
			// Now collect edges to be removed:
			boolean changed;
			do {
				changed = false;
				TreeIterator<EObject> it = eAllContents();
				while (it.hasNext()) {
					EObject obj = it.next();
					if (obj instanceof Edge) {
						Edge e = (Edge) obj;
						if (e.getType()!=edge.getType() || edges.contains(e)) {
							continue;
						}
						if ((mappings.get(edge.getSource(), e.getSource())!=null &&
							 mappings.get(edge.getTarget(), e.getTarget())!=null) ||
							(mappings.get(e.getSource(), edge.getSource())!=null &&
							 mappings.get(e.getTarget(), edge.getTarget())!=null)) {
							edges.add(e);
							changed = true;
						}
					}
				}
			} while (changed);
		}
		
		// Now remove the collected edges:
		for (Edge e : edges) {
			e.getGraph().removeEdge(e);
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeAttribute(Attribute attribute, boolean removeMapped) {
		// Node must be set:
		if (attribute.getNode()==null) {
			return false;
		}
		// Must be invoked from the root kernel rule:
		if (getRootRule()!=this) {
			return getRootRule().removeAttribute(attribute, removeMapped);
		}
		if (removeMapped && attribute.getType()!=null) {
			Set<Node> nodes = new HashSet<Node>();
			Set<Mapping> mappings = new HashSet<Mapping>();
			nodes.add(attribute.getNode());
			getNodeMappings(nodes, mappings, true);
			for (Node n : nodes) {
				Attribute a = n.getAttribute(attribute.getType());
				if (a!=null) n.getAttributes().remove(a);
			}
		} else {
			attribute.setNode(null);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckDangling() {
		return checkDangling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckDangling(boolean newCheckDangling) {
		boolean oldCheckDangling = checkDangling;
		checkDangling = newCheckDangling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__CHECK_DANGLING, oldCheckDangling, checkDangling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInjectiveMatching() {
		return injectiveMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectiveMatching(boolean newInjectiveMatching) {
		boolean oldInjectiveMatching = injectiveMatching;
		injectiveMatching = newInjectiveMatching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HenshinPackage.RULE__INJECTIVE_MATCHING, oldInjectiveMatching, injectiveMatching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getMultiRules() {
		if (multiRules == null) {
			multiRules = new EObjectContainmentEList<Rule>(Rule.class, this, HenshinPackage.RULE__MULTI_RULES);
		}
		return multiRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MappingList getMultiMappings() {
		if (multiMappings == null) {
			multiMappings = new MappingContainmentListImpl(this, HenshinPackage.RULE__MULTI_MAPPINGS);
		}
		return (MappingList) multiMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getJavaImports() {
		if (javaImports == null) {
			javaImports = new EDataTypeUniqueEList<String>(String.class, this, HenshinPackage.RULE__JAVA_IMPORTS);
		}
		return javaImports;
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
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeConditions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 *  <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case HenshinPackage.RULE__LHS:
				return basicSetLhs(null, msgs);
			case HenshinPackage.RULE__RHS:
				return basicSetRhs(null, msgs);
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				return ((InternalEList<?>)getAttributeConditions()).basicRemove(otherEnd, msgs);
			case HenshinPackage.RULE__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case HenshinPackage.RULE__MULTI_RULES:
				return ((InternalEList<?>)getMultiRules()).basicRemove(otherEnd, msgs);
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				return ((InternalEList<?>)getMultiMappings()).basicRemove(otherEnd, msgs);
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
			case HenshinPackage.RULE__LHS:
				return getLhs();
			case HenshinPackage.RULE__RHS:
				return getRhs();
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				return getAttributeConditions();
			case HenshinPackage.RULE__MAPPINGS:
				return getMappings();
			case HenshinPackage.RULE__CHECK_DANGLING:
				return isCheckDangling();
			case HenshinPackage.RULE__INJECTIVE_MATCHING:
				return isInjectiveMatching();
			case HenshinPackage.RULE__MULTI_RULES:
				return getMultiRules();
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				return getMultiMappings();
			case HenshinPackage.RULE__JAVA_IMPORTS:
				return getJavaImports();
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
			case HenshinPackage.RULE__LHS:
				setLhs((Graph)newValue);
				return;
			case HenshinPackage.RULE__RHS:
				setRhs((Graph)newValue);
				return;
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				getAttributeConditions().addAll((Collection<? extends AttributeCondition>)newValue);
				return;
			case HenshinPackage.RULE__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case HenshinPackage.RULE__CHECK_DANGLING:
				setCheckDangling((Boolean)newValue);
				return;
			case HenshinPackage.RULE__INJECTIVE_MATCHING:
				setInjectiveMatching((Boolean)newValue);
				return;
			case HenshinPackage.RULE__MULTI_RULES:
				getMultiRules().clear();
				getMultiRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				getMultiMappings().clear();
				getMultiMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case HenshinPackage.RULE__JAVA_IMPORTS:
				getJavaImports().clear();
				getJavaImports().addAll((Collection<? extends String>)newValue);
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
			case HenshinPackage.RULE__LHS:
				setLhs((Graph)null);
				return;
			case HenshinPackage.RULE__RHS:
				setRhs((Graph)null);
				return;
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				return;
			case HenshinPackage.RULE__MAPPINGS:
				getMappings().clear();
				return;
			case HenshinPackage.RULE__CHECK_DANGLING:
				setCheckDangling(CHECK_DANGLING_EDEFAULT);
				return;
			case HenshinPackage.RULE__INJECTIVE_MATCHING:
				setInjectiveMatching(INJECTIVE_MATCHING_EDEFAULT);
				return;
			case HenshinPackage.RULE__MULTI_RULES:
				getMultiRules().clear();
				return;
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				getMultiMappings().clear();
				return;
			case HenshinPackage.RULE__JAVA_IMPORTS:
				getJavaImports().clear();
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
			case HenshinPackage.RULE__LHS:
				return lhs != null;
			case HenshinPackage.RULE__RHS:
				return rhs != null;
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
				return attributeConditions != null && !attributeConditions.isEmpty();
			case HenshinPackage.RULE__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case HenshinPackage.RULE__CHECK_DANGLING:
				return checkDangling != CHECK_DANGLING_EDEFAULT;
			case HenshinPackage.RULE__INJECTIVE_MATCHING:
				return injectiveMatching != INJECTIVE_MATCHING_EDEFAULT;
			case HenshinPackage.RULE__MULTI_RULES:
				return multiRules != null && !multiRules.isEmpty();
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				return multiMappings != null && !multiMappings.isEmpty();
			case HenshinPackage.RULE__JAVA_IMPORTS:
				return javaImports != null && !javaImports.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.impl.UnitImpl#getSubUnits()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Unit> getSubUnits() {
		return (EList<Unit>) ECollections.EMPTY_ELIST;
	}
	
} // RuleImpl

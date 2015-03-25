/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Node;

/**
 * {@link Graph}-to-{@link EGraph} converter.
 */
public class HenshinEGraph extends EGraphImpl implements Adapter {
	
	// Generated serial ID
	private static final long serialVersionUID = -2408288653525326829L;

	// The Henshin graph:
	protected final Graph henshinGraph;
	
	// Correspondence maps: 
	protected Map<Node, EObject> node2object;
	protected Map<EObject, Node> object2node;
	
	/**
	 * Default constructor.
	 * @param graph The Henshin graph.
	 */
	public HenshinEGraph(Graph graph) {
		henshinGraph = graph;
		node2object = new HashMap<Node, EObject>();
		object2node = new HashMap<EObject, Node>();
		henshin2emfGraph();
	}
	
	/**
	 * Translates the Henshin {@link Graph} in {@link #henshinGraph} into an
	 * ordinary EMF graph with {@link EObject}s, {@link EReference}s and so on.
	 * Afterwards, corresponding {@link EObject}s can be found in
	 * <code>eObjects</code> and correspondences in <code>eObject2nodeMap</code>
	 * and <code>node2eObjectMap</code>.
	 * <p>
	 * <strong>Remark:</strong> Currently, edges typed over <i>derived</i>
	 * {@link EReference}s (see {@link EReference#isDerived()}) are omitted
	 * during translation. Furthermore, if a typing {@link EReference}s is
	 * non-changeable (see {@link EReference#isChangeable()}) but its opposite
	 * (see {@link EReference#getEOpposite()}) is changeable, the reference is
	 * translated into its opposite.
	 */
	@SuppressWarnings("unchecked")
	private void henshin2emfGraph() {
		
		clear();
		// henshinGraph.eAdapters().clear();
		object2node.clear();
		node2object.clear();
		
		for (Node node : henshinGraph.getNodes()) {
			EObject eObject = node2object.get(node);
			
			if (eObject == null) {
				EClass nodeType = node.getType();
				EFactory factory = nodeType.getEPackage().getEFactoryInstance();
				eObject = factory.create(nodeType);
				add(eObject);
				addSynchronizedPair(node, eObject);
			}
			
			for (Attribute attr : node.getAttributes()) {
				// don't notify me about changes that I made
				eObject.eAdapters().remove(this);
				EAttribute attrType = attr.getType();
				String attrValue = attr.getValue();
				attrValue = attrValue.replaceAll("\"", "");
				
				if (attrType.isMany()) {
					List<Object> attrValues = (List<Object>) eObject.eGet(attrType);
					attrValues.add(attrValue);
				} else {
					eObject.eSet(attrType,
							EcoreUtil.createFromString(attrType.getEAttributeType(), attrValue));
				}
				
				eObject.eAdapters().add(this);
			}
		}
		
		for (Edge edge : new ArrayList<Edge>(henshinGraph.getEdges())) {
			EReference edgeType = edge.getType();
			/*
			 * If reference <code>edgeType</code> is derived it is available
			 * implicitly and does not need to be set. Furthermore, if a
			 * reference is not changeable it is omitted as well.
			 */
			if (edgeType.isDerived())
				continue;
			
			EObject ownerObject = node2object.get(edge.getSource());
			EObject targetObject = node2object.get(edge.getTarget());
			
			/*
			 * If the edgeType is not changeable but its opposite is, then we
			 * switch to the opposite.
			 */
			if (!edgeType.isChangeable()) {
				if (edgeType.getEOpposite() != null && edgeType.getEOpposite().isChangeable()) {
					edgeType = edgeType.getEOpposite();
					// switch source and target
					EObject temp = ownerObject;
					ownerObject = targetObject;
					targetObject = temp;
				} else
					/*
					 * Otherwise we cannot handle the edge and omit it (or
					 * better: shall throw an exception)
					 */
					continue;
			}// if
			
			// don't notify me about changes that I made
			ownerObject.eAdapters().remove(this);
			
			if (edgeType.isMany()) {
				List<Object> edgeValues = (List<Object>) ownerObject.eGet(edgeType);
				edgeValues.add(targetObject);
			} else {
				ownerObject.eSet(edgeType, targetObject);
			}
			
			ownerObject.eAdapters().add(this);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#didAdd(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void didAdd(EObject eObject) {
		super.didAdd(eObject);			
		Node node = object2node.get(eObject);
		if (node == null) {
			node = createNode();
			node.setType(eObject.eClass());
			henshinGraph.getNodes().add(node);
			addSynchronizedPair(node, eObject);
		} else {
			if (!henshinGraph.getNodes().contains(node))
				henshinGraph.getNodes().add(node);
		}
	}
	
	protected Attribute createAttribute() {
		return HenshinFactory.eINSTANCE.createAttribute();
	}

	protected Edge createEdge() {
		return HenshinFactory.eINSTANCE.createEdge();
	}

	protected Node createNode() {
		return HenshinFactory.eINSTANCE.createNode();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.EGraphImpl#didRemove(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void didRemove(EObject object) {
		super.didRemove(object);
		Node node = object2node.get(object);
		if (node != null) {
			henshinGraph.getNodes().remove(node);
			List<Edge> list = new ArrayList<Edge>(node.getIncoming());
			list.addAll(node.getOutgoing());
			for (Edge edge : list) {
				edge.setSource(null);
				edge.setTarget(null);
				edge.setGraph(null);
			}
			removeSynchronizedPair(node, (EObject) object);
		}
	}
	
	/**
	 * This methods will update the EMF representation of the Henshin-Graph.
	 */
	public void updateEGraph() {
		henshin2emfGraph();
	}
	
	/*
	 * Add a synchronized pair of a node and an object.
	 */
	private void addSynchronizedPair(Node node, EObject eObject) {
		node2object.put(node, eObject);
		object2node.put(eObject, node);
		eObject.eAdapters().add(this);
	}
	
	/*
	 * Remove a synchronized pair of a node and an object.
	 */
	private void removeSynchronizedPair(Node node, EObject eObject) {
		// node2eObjectMap.remove(node);
		// eObject2nodeMap.remove(eObject);
		// eObject.eAdapters().remove(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	@Override
	public Notifier getTarget() {
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		EObject owner = (EObject) notification.getNotifier();
		Node ownerNode = object2node.get(owner);
		Object feature = notification.getFeature();
		Object oldValue = notification.getOldValue();
		Object newValue = notification.getNewValue();
		if (feature instanceof EStructuralFeature && ownerNode != null) {
			// remove all deleted structures from the henshin graph
			if (oldValue != null && newValue != oldValue) {
				removeFromHenshinGraph(ownerNode, (EStructuralFeature) feature, oldValue);
			}
			// add new structures to henshin graph
			if (newValue != null) {
				addToHenshinGraph(owner, (EStructuralFeature) feature, newValue);
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void setTarget(Notifier newTarget) {
	}
	
	/*
	 * Remove an object from the Henshin graph.
	 */
	private void removeFromHenshinGraph(Node owner, EStructuralFeature feature, Object value) {
		if (feature instanceof EAttribute) {
			Attribute attribute = null;
			for (Attribute nodeAttribute : owner.getAttributes()) {
				if (nodeAttribute.getType() == feature) {
					attribute = nodeAttribute;
					break;
				}
			}
			if (attribute != null) {
				attribute.setNode(null);
			}
		} else if (feature instanceof EReference) {
			Edge edge = null;
			if (value instanceof EObject) {
				Node targetNode = object2node.get(value);
				for (Edge outgoingEdge : owner.getOutgoing()) {
					if (outgoingEdge.getTarget() == targetNode && outgoingEdge.getType() == feature) {
						edge = outgoingEdge;
						break;
					}
				}
				if (edge != null) {
					edge.setSource(null);
					edge.setTarget(null);
					edge.setGraph(null);
				}
			}
		}
	}
	
	/*
	 * Add an object to the Henshin graph.
	 */
	private void addToHenshinGraph(EObject owner, EStructuralFeature feature, Object value) {
		Node node = object2node.get(owner);
		if (node != null && value != null) {
			if (feature instanceof EAttribute) {
				Attribute attribute = null;
				for (Attribute nodeAttribute : node.getAttributes()) {
					if (nodeAttribute.getType() == feature) {
						attribute = nodeAttribute;
						break;
					}
				}
				if (attribute == null) {
					attribute = createAttribute();
					attribute.setType((EAttribute) feature);
					attribute.setNode(node);
				}
				attribute.setValue(value.toString());
				
			} else if (feature instanceof EReference) {
				Edge edge = null;
				if (value instanceof EObject) {
					Node targetNode = object2node.get(value);
					for (Edge outgoingEdge : node.getOutgoing()) {
						if (outgoingEdge.getTarget() == targetNode
								&& outgoingEdge.getType() == feature) {
							edge = outgoingEdge;
							break;
						}
					}
					if (edge == null) {
						edge = createEdge();
						edge.setSource(node);
						edge.setTarget(targetNode);
						edge.setGraph(henshinGraph);
						edge.setType((EReference) feature);
					}
				}
			}
		}
	}
	
	public Map<Node, EObject> getNode2ObjectMap() {
		return node2object;
	}
	
	public void setNode2ObjectMap(Map<Node,EObject> node2object) {
		this.node2object = node2object;
	}
	
	public Map<EObject, Node> getObject2NodeMap() {
		return object2node;
	}
	
	public void setObject2NodeMap(Map<EObject, Node> object2node) {
		this.object2node = object2node;
	}
	
}

/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Copies a subgraph which is defined by a set of nodes into another given graph
 * and creates corresponding mappings.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CopySubgraphCommand extends CompoundCommand {

	private EditingDomain domain;
	private Collection<Node> subgraphNodes;
	private Collection<Mapping> mappings;

	private Graph targetGraph;
	private Graph sourceGraph;
	private Collection<Node> newNodes;
	private Collection<Mapping> newMappings;

	private Map<Collection<Mapping>, Collection<Mapping>> orthoMappings;

	private Collection<Edge> newEdges;

	private Map<Node, Node> map = new HashMap<Node, Node>();

	private boolean isMappingOrigin = true;

	/**
	 * @param domain
	 */
	public void setDomain(EditingDomain domain) {
		this.domain = domain;
	}

	/**
	 * @param nodes
	 */
	public void setNodes(Collection<Node> nodes) {
		this.subgraphNodes = nodes;
	}

	/**
	 * @param mappings
	 */
	public void setMappings(Collection<Mapping> mappings) {
		this.mappings = mappings;
	}

	/**
	 * @param targetGraph
	 */
	public void setTargetGraph(Graph targetGraph) {
		this.targetGraph = targetGraph;
	}

	/**
	 * @param sourceGraph
	 */
	public void setSourceGraph(Graph sourceGraph) {
		this.sourceGraph = sourceGraph;
	}

	/**
	 * @param isMappingOrigin
	 */
	public void setMappingOrigin(boolean isMappingOrigin) {
		this.isMappingOrigin = isMappingOrigin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		for (Node node : subgraphNodes) {
			if (!node.getGraph().equals(sourceGraph)) {
				return false;
			}// if
		}// for
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.CompoundCommand#execute()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void execute() {

		Collection<Node> nodesToCopy = new ArrayList<Node>();
		for (Node node : subgraphNodes) {
			if (!isMapped(node))
				nodesToCopy.add(node);
		}
		Command copyCmd = CopyCommand.create(domain, nodesToCopy);
		appendAndExecute(copyCmd);
		newNodes = (Collection<Node>) copyCmd.getResult();

		newMappings = new ArrayList<Mapping>();
		orthoMappings = new IdentityHashMap<Collection<Mapping>, Collection<Mapping>>();
		Iterator<Node> origNodeIter = nodesToCopy.iterator();
		Iterator<Node> newNodeIter = newNodes.iterator();
		while (origNodeIter.hasNext() && newNodeIter.hasNext()) {
			Node origNode = origNodeIter.next();
			Node newNode = newNodeIter.next();
			Mapping m;
			if (isMappingOrigin) {
				m = HenshinFactory.eINSTANCE.createMapping(origNode, newNode);
				
			} else {
				m = HenshinFactory.eINSTANCE.createMapping(newNode, origNode);
				//collectOrthoMappings(newNode, origNode);
			}
			map.put(origNode, newNode);
			newMappings.add(m);
			collectOrthoMappings(origNode, newNode);
		}

		newEdges = new ArrayList<Edge>();

		for (Edge origEdge : sourceGraph.getEdges()) {
			// check only edges between selected nodes
			//
			if (subgraphNodes.contains(origEdge.getSource())
					&& subgraphNodes.contains(origEdge.getTarget())) {

				// new edges need to be created if
				// 1. at least one of its nodes is copied.
				//
				if (nodesToCopy.contains(origEdge.getSource())
						|| nodesToCopy.contains(origEdge.getTarget())) {
					Node sourceNode;
					Node targetNode;
					if (map.containsKey(origEdge.getSource()))
						sourceNode = map.get(origEdge.getSource());
					else
						sourceNode = getMappedNode(origEdge.getSource());

					if (map.containsKey(origEdge.getTarget()))
						targetNode = map.get(origEdge.getTarget());
					else
						targetNode = getMappedNode(origEdge.getTarget());
					newEdges.add(HenshinFactory.eINSTANCE.createEdge(
							sourceNode, targetNode, origEdge.getType()));
				} else {
					// or
					// 2. both edges already exists without edge between them
					//
					boolean edgeFound = false;

					Node sourceNode = getMappedNode(origEdge.getSource());
					Node targetNode = getMappedNode(origEdge.getTarget());
					for (Edge targetEdge : targetGraph.getEdges()) {
						if (targetEdge.getSource() == sourceNode
								&& targetEdge.getTarget() == targetNode) {
							edgeFound = true;
							break;
						}
					}
					if (!edgeFound)
						newEdges.add(HenshinFactory.eINSTANCE.createEdge(
								sourceNode, targetNode, origEdge.getType()));

				}
			}
		}

		redo();
	}

	/*
	 * Cases:
	 * 
	 * 1) LR-copying in multiRule: if origNode is in kernelRule and mapped there
	 * has to be a mapping from the kernel to the new Node.
	 * 
	 * 2) K2M-copying: if origNode is mapped in kernel and image in kernel is
	 * mapped to multiRule, there has to be a mapping of the kernelImage to the
	 * newNode.
	 */
	private void collectOrthoMappings(Node origNode, Node newNode) {

		// case 1)
		//
		if (sourceGraph.getRule() == targetGraph.getRule()) {
			Rule rule = sourceGraph.getRule();
			if (rule.getKernelRule() != null) {
				Rule kernelRule = rule.getKernelRule();
				Node kernelOrig = rule.getMultiMappings().getOrigin(origNode);
				if (kernelOrig != null) {
					if (sourceGraph.isLhs()) {
						Node kernelImage = kernelRule.getMappings().getImage(kernelOrig, kernelRule.getRhs());
						if (kernelImage != null) {
							Mapping m = HenshinFactory.eINSTANCE.createMapping(
									kernelImage, newNode);
							if (!orthoMappings.containsKey(rule
									.getMultiMappings()))
								orthoMappings.put(rule.getMultiMappings(),
										new ArrayList<Mapping>());
							orthoMappings.get(rule.getMultiMappings()).add(m);
						}
					} else {
						Node kernelOrigin = kernelRule.getMappings().getOrigin(kernelOrig);
						if (kernelOrigin != null) {
							Mapping m = HenshinFactory.eINSTANCE.createMapping(
									kernelOrigin, newNode);
							if (!orthoMappings.containsKey(rule
									.getMultiMappings()))
								orthoMappings.put(rule.getMultiMappings(),
										new ArrayList<Mapping>());
							orthoMappings.get(rule.getMultiMappings()).add(m);
						}
					}
				}
			}
		}

		// case 2)
		//
		if (sourceGraph.getRule() == targetGraph.getRule()
				.getKernelRule()) {
			
			Rule rule = sourceGraph.getRule();
			Rule multiRule = targetGraph.getRule();
			if (sourceGraph.isLhs()) {
				Node kernelImage = rule.getMappings().getImage(origNode, rule.getRhs());
				if (kernelImage != null) {
					Node multiImage = multiRule.getMultiMappings().getImage(kernelImage, multiRule.getRhs());
					if (multiImage != null) {
						Collection<Mapping> mTarget = multiRule.getMappings();
						Mapping m = HenshinFactory.eINSTANCE.createMapping(
								newNode, multiImage);
						if (!orthoMappings.containsKey(mTarget))
							orthoMappings
									.put(mTarget, new ArrayList<Mapping>());
						orthoMappings.get(mTarget).add(m);
					}
				}
			} else {// sourceGraph.isRHS()				
				Node kernelOrigin = rule.getMappings().getOrigin(origNode);
				if (kernelOrigin != null) {
					Node multiOrigin = multiRule.getMultiMappings().getImage(kernelOrigin, multiRule.getLhs());
					if (multiOrigin != null) {
						Collection<Mapping> mTarget = multiRule.getMappings();
						Mapping m = HenshinFactory.eINSTANCE.createMapping(
								multiOrigin, newNode);
						if (!orthoMappings.containsKey(mTarget))
							orthoMappings
									.put(mTarget, new ArrayList<Mapping>());
						orthoMappings.get(mTarget).add(m);
					}
				}
			}

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.CompoundCommand#redo()
	 */
	@Override
	public void redo() {
		targetGraph.getNodes().addAll(newNodes);
		targetGraph.getEdges().addAll(newEdges);
		mappings.addAll(newMappings);
		for (Collection<Mapping> target : orthoMappings.keySet())
			target.addAll(orthoMappings.get(target));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.CompoundCommand#undo()
	 */
	@Override
	public void undo() {
		targetGraph.getNodes().removeAll(newNodes);
		targetGraph.getEdges().removeAll(newEdges);
		mappings.removeAll(newMappings);
		for (Collection<Mapping> target : orthoMappings.keySet())
			target.removeAll(orthoMappings.get(target));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.CompoundCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}

	/**
	 * @param node
	 * @return
	 */
	private boolean isMapped(Node node) {
		for (Mapping m : mappings) {
			if (isMappingOrigin) {
				if (m.getOrigin() == node)
					return true;
			} else if (m.getImage() == node)
				return true;
		}
		return false;
	}

	/**
	 * @param sourceGraphNode
	 * @return
	 */
	private Node getMappedNode(Node sourceGraphNode) {
		for (Mapping m : mappings) {
			if (isMappingOrigin) {
				if (m.getOrigin() == sourceGraphNode)
					return m.getImage();
			} else {
				if (m.getImage() == sourceGraphNode)
					return m.getOrigin();
			}
		}
		return null;
	}

}

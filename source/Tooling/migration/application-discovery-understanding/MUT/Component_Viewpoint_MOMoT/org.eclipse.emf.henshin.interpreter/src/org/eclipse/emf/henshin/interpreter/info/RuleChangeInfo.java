/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.info;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

public class RuleChangeInfo {
	
	private final List<Node> createdNodes;
	private final List<Node> deletedNodes;
	private final List<Node> preservedNodes;
	private final List<Edge> createdEdges;
	private final List<Edge> deletedEdges;
	private final List<Attribute> attributeChanges;
	private final List<Edge> indexChanges;
	
	public RuleChangeInfo(Rule rule) {
		createdNodes = new ArrayList<Node>();
		deletedNodes = new ArrayList<Node>();
		preservedNodes = new ArrayList<Node>();		
		createdEdges = new ArrayList<Edge>();
		deletedEdges = new ArrayList<Edge>();
		attributeChanges = new ArrayList<Attribute>();
		indexChanges = new ArrayList<Edge>();
		
		// Deleted nodes:
		for (Node node : rule.getLhs().getNodes()) {
			if (rule.getMultiMappings().getOrigin(node)!=null) {
				continue;
			}
			if (rule.getMappings().getImage(node, rule.getRhs())==null) {
				deletedNodes.add(node);
			}
		}
		
		// Created, preserved nodes; attribute changes:
		for (Node node : rule.getRhs().getNodes()) {
			if (rule.getMultiMappings().getOrigin(node)!=null) {
				continue;
			}
			if (rule.getMappings().getOrigin(node)==null) {
				createdNodes.add(node);
			} else {
				preservedNodes.add(node);
			}			
			for (Attribute attribute : node.getAttributes()) {
				attributeChanges.add(attribute);
			}
		}
		
		// Deleted edges:
		for (Edge edge : rule.getLhs().getEdges()) {
			if (rule.getMultiMappings().getOrigin(edge)!=null) {
				continue;
			}
			if (rule.getMappings().getImage(edge, rule.getRhs())==null) {
				deletedEdges.add(edge);
			}
		}
		
		// Created edges and index changes:
		for (Edge edge : rule.getRhs().getEdges()) {
			if (rule.getMultiMappings().getOrigin(edge)!=null) {
				continue;
			}
			if (rule.getMappings().getOrigin(edge)==null) {
				createdEdges.add(edge);
			}
			if (edge.getIndex()!=null && edge.getIndex().trim().length()>0) {
				indexChanges.add(edge);
			}
		}
		
	}
	
	/**
	 * @return the createdNodes
	 */
	public List<Node> getCreatedNodes() {
		return createdNodes;
	}
	
	/**
	 * @return the preservedNodes
	 */
	public List<Node> getPreservedNodes() {
		return preservedNodes;
	}
	
	/**
	 * @return the createdEdges
	 */
	public List<Edge> getCreatedEdges() {
		return createdEdges;
	}
	
	/**
	 * @return the deletedEdges
	 */
	public List<Edge> getDeletedEdges() {
		return deletedEdges;
	}
	
	/**
	 * @return the attributeChanges
	 */
	public List<Attribute> getAttributeChanges() {
		return attributeChanges;
	}
	
	/**
	 * @return the deletedNodes
	 */
	public List<Node> getDeletedNodes() {
		return deletedNodes;
	}
		
	/**
	 * @return the index changes
	 */
	public List<Edge> getIndexChanges() {
		return indexChanges;
	}
	
}

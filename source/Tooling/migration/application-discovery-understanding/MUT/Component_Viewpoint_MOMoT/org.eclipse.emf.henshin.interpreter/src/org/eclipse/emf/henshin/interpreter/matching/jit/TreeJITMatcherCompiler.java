/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.jit;

import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class TreeJITMatcherCompiler extends AbstractJITMatcherCompiler {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.jit.AbstractJITCompiler#generateNextMatchMethod(org.eclipse.emf.henshin.model.Rule, org.eclipse.emf.henshin.interpreter.matching.jit.AbstractJITCompiler.MatchingCodeGenerator)
	 */
	@Override
	protected boolean generateNextMatchMethod(Rule rule, MatchingCodeGenerator gen) {
		
		// Find the root node:
		Node root = null;
		for (Node node : rule.getLhs().getNodes()) {
			if (node.getOutgoing().size()==rule.getLhs().getEdges().size() &&
				node.getOutgoing().size()==rule.getLhs().getNodes().size()-1) {
				root = node;
				break;
			}
		}
		if (root==null) {
			return false;
		}
		
		// Ok, create the rule model fields:
		initRuleFields(rule, gen);
		
		// Domain of the root node:
		gen.matcherFields.println("List<EObject> rootDomain = graph.getDomain(" + typeField(root) + ", false);");
		
		// Declare the index fields for the node matches:
		for (Node node : rule.getLhs().getNodes()) {
			gen.matcherFields.println("int " + indexField(node) + " = 0;");
		}
		
		/* --- Matching code --- */

		gen.matcherCode.println("boolean valid = false;");
		gen.matcherCode.println("while (!valid) {");
		
		// Check whether a target for the root node is left:
		gen.matcherCode.println("  if (" + indexField(root) + "<rootDomain.size()) {");
		gen.matcherCode.println("    break;");
		gen.matcherCode.println("  }");
		gen.matcherCode.println("  EObject root = rootDomain.get(" + indexField(root) + ");");
		
		// Check whether the rest of the nodes can be matched:
		for (Node node : rule.getLhs().getNodes()) {
			if (node==root) continue;
			
			
		}
				
		gen.matcherCode.println("}");
		
		// Match found?
		gen.matcherCode.println("if (!valid) {");
		gen.matcherCode.println("  return null;");
		gen.matcherCode.println("}");

		// Construct the match:
		gen.matcherCode.println("Match rootMatch = new MatchImpl(" + objField(rule) + ");");
//		gen.matcherCode.println("rootMatch.setNodeTarget(node" + root.hashCode() + ", rootDomain.get(rootIndex));");
//		gen.matcherCode.println("Match match = rootMatch;");
		
		
		// Matching code for the multi-rules:
		//if (!generateMultiRuleCode(rule, root, gen)) {
		//	return false;
		//}

		// Increase the root index for the next match:
//		gen.matcherCode.println("rootIndex++;");
		
		// Return the generated match:
		gen.matcherCode.println("return rootMatch;");

		// Success.
		return true;
		
	}
	
	@SuppressWarnings("unused")
	private boolean generateMultiRuleCode(Rule rule, Node parent, MatchingCodeGenerator gen) {

		// No multi-rule? Ok!
		if (rule.getMultiRules().isEmpty()) {
			return true;
		}
		// At most one multi-rule:
		if (rule.getMultiRules().size()>1) {
			return false;
		}
		
		// The multi-rule:
		Rule multiRule = rule.getMultiRules().get(0);
		Graph multiLhs = multiRule.getLhs();
		List<Node> multiNodes = multiLhs.getNodes();
		List<Edge> multiEdges = multiLhs.getEdges();
		MappingList multiMappings = multiRule.getMultiMappings();
		
		if (multiNodes.size()!=2) {
			return false;
		}
		
		// Get the parent and child node in the multi-rule:
		Node parentImage = multiMappings.getImage(parent, multiLhs);
		if (parentImage==null) {
			return false;
		}
		int childIndex = (multiNodes.get(0)==parentImage) ? 1 : 0;
		Node child = multiNodes.get(childIndex);
		if (multiMappings.getOrigin(child)!=null) {
			return false;
		}
		
		// Edge that connects parent and child:
		if (multiEdges.size()!=1) {
			return false;
		}
		Edge edge = multiLhs.getEdges().get(0);
		if (multiMappings.getOrigin(edge)!=null) {
			return false;
		}
		if (edge.getSource()!=parentImage || edge.getTarget()!=child) {
			return false;
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		HenshinResourceSet resourceSet = new HenshinResourceSet(
				"../org.eclipse.emf.henshin.examples/src/org/eclipse/emf/henshin/examples/probbroadcast");
		Rule rule = (Rule) resourceSet.getModule("probbroadcast.henshin", false).getUnit("send");
		
		JITMatcher finder = JITMatcherCompiler.INSTANCE.generateMatcher(rule, null);
		EGraph graph = new EGraphImpl(resourceSet.getEObject("init-grid4x4.xmi"));
		
		for (Match match : finder.findMatches(graph)) {
			System.out.println(match);
		}
		
	}

}

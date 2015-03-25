package org.eclipse.emf.henshin.interpreter.giraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.info.RuleChangeInfo;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.staticanalysis.NodeEquivalence;

public class GiraphRuleData {

	public static class MatchingStep {

		public Node node;

		public Edge edge;

		public Node verifyEdgeTo;

		public Node sendBackTo;

		public Node keepMatchesOf;

		public boolean isStart;

		public boolean isMatching;

		public boolean isJoin;

		public MatchingStep(Node node, Edge edge, Node sendBackTo, Node verifyEdgeTo, boolean isStart, boolean isMatching, boolean isJoin) {
			this.node = node;
			this.edge = edge;
			this.verifyEdgeTo = verifyEdgeTo;
			this.sendBackTo = sendBackTo;
			this.isStart = isStart;
			this.isMatching = isMatching;
			this.isJoin = isJoin;
		}

	}

	public final Rule rule;

	public final RuleChangeInfo changeInfo;

	public List<MatchingStep> matchingSteps;

	public List<Node> orderedLhsNodes;

	public List<Node> requiredNodes;
	
	public Map<Node,NodeEquivalence> requiredNodesEquivalences;
	
	public GiraphRuleData(Rule rule) throws Exception {
		rule = preprocessPrule(rule);
		this.rule = rule;
		this.changeInfo = new RuleChangeInfo(rule);
		this.matchingSteps = generateMatchingSteps();
		if (matchingSteps==null) {
			throw new RuntimeException("Cannot generate matching data for rule " + rule.getName());
		}
		generateOrderedLhsNodes();
	}

	private Rule preprocessPrule(Rule rule) {
		
		// Make a copy of the rule first:
		Rule copy = EcoreUtil.copy(rule);
		rule = null;
		
		// Compute the required nodes:
		requiredNodes = new ArrayList<Node>();
		for (Node node : copy.getActionNodes(null)) {
			Action action = node.getAction();
			if (action.getType()==Action.Type.REQUIRE) {
				requiredNodes.add(node);
			}
		}

		// Compute the required nodes equivalences:
		requiredNodesEquivalences = new HashMap<Node,NodeEquivalence>();
		TreeIterator<EObject> it = copy.eAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof Graph) {
				NestedCondition pac = copy.getLhs().getPAC(((Graph) obj).getName());
				if (pac!=null) {
					List<NodeEquivalence> equivalences = NodeEquivalence.computeEquivalences(pac.getConclusion());
					for (NodeEquivalence equi : equivalences) {
						for (int i=0; i<equi.size(); i++) {
							if (pac.getMappings().getOrigin(equi.get(i))!=null) {
								equi.remove(i--);
							}
						}
						if (equi.size()>1) {
							for (Node node : equi) {
								requiredNodesEquivalences.put(node, equi);								
							}
						}
					}
				}
			}
		}

		// Move the required nodes to the LHS:
		boolean changed;
		do {
			changed = false;
			for (Node node : copy.getActionNodes(null)) {
				Action action = node.getAction();
				if (action.getType()==Action.Type.REQUIRE) {
					node.setAction(new Action(Action.Type.PRESERVE));
					changed = true;
					break;
				}
			}
			for (Edge edge : copy.getActionEdges(null)) {
				Action action = edge.getAction();
				if (action.getType()==Action.Type.REQUIRE) {
					edge.setAction(new Action(Action.Type.PRESERVE));
					changed = true;
					break;
				}
			}
		} while (changed);
		
		// Replace required nodes if necessary:
		for (int i=0; i<requiredNodes.size(); i++) {
			Node node = requiredNodes.get(i);
			if (!node.getGraph().isLhs()) {
				Node lhsNode = ((NestedCondition) node.getGraph().eContainer()).getMappings().getOrigin(node);
				requiredNodes.set(i, lhsNode);
				if (requiredNodesEquivalences.containsKey(node)) {
					requiredNodesEquivalences.put(lhsNode, requiredNodesEquivalences.get(node));
					requiredNodesEquivalences.remove(node);
				}
				for (NodeEquivalence equi : requiredNodesEquivalences.values()) {
					for (int j=0; j<equi.size(); j++) {
						if (equi.get(j)==node) {
							equi.set(j, lhsNode);
						}
					}
				}
			}
		}
		
		return copy;
	}
	
	private List<MatchingStep> generateMatchingSteps() {
		List<Node> nodesToMatch = new ArrayList<Node>(rule.getLhs().getNodes());
		List<MatchingStep> result = new ArrayList<GiraphRuleData.MatchingStep>();
		while (!nodesToMatch.isEmpty()) {
			
			// The next matching steps:
			List<MatchingStep> newSteps = getLongestMatchingSteps(nodesToMatch);
			
			// Find the join node:
			Node joinNode = null;
			for (int i=0; i<newSteps.size(); i++) {
				for (MatchingStep oldStep : result) {
					if (oldStep.node==newSteps.get(i).node) {
						joinNode = oldStep.node;
						break;
					}
				}
				if (joinNode!=null) {
					break;
				}
			}
			
			// In the last old matching step, send the matches to the join node:
			if (joinNode!=null && !result.isEmpty()) {
				result.get(result.size()-1).sendBackTo = joinNode;
			}
			
			// Add all new matching steps until the join node is reached:
			for (MatchingStep step : newSteps) {
				step.keepMatchesOf = joinNode;
				result.add(step);
				// Remember new matched nodes:
				nodesToMatch.remove(step.node);
				if (step.edge!=null) {
					nodesToMatch.remove(step.edge.getTarget());
				}
				// Stop if we reached the join node:
				if (step.node==joinNode) {
					step.edge = null;
					step.isJoin = true;
					break;
				}
			}
		}
		
		// Any edges which still need to be checked?
		List<Edge> missingEdges = new ArrayList<Edge>(rule.getLhs().getEdges());
		for (MatchingStep step : result) {
			if (step.edge!=null) {
				missingEdges.remove(step.edge);
			}
		}
		for (Edge edge : missingEdges) {
			MatchingStep lastStep = result.get(result.size()-1);
			lastStep.sendBackTo = edge.getSource();
			result.add(new MatchingStep(
					edge.getSource(), // node
					edge, // edge
					null, // send back to
					edge.getTarget(), // verify edge to
					false, // is start
					false, // is matching
					false // is join
					));
		}
		
		// If the last node is a require node, we need to send the
		// matches back to a real node:
		if (!result.isEmpty()) {
			Node last = result.get(result.size()-1).node;
			if (requiredNodes.contains(last)) {
				Node target = null;
				for (MatchingStep step : result) {
					if (!requiredNodes.contains(step.node)) {
						target = step.node;
						break;
					}
				}
				if (target!=null) {
					result.get(result.size()-1).sendBackTo = target;
					result.add(new MatchingStep(target, null, null, null, false, false, false));
				}
			}
		}
		return result;
	}

	private List<MatchingStep> getLongestMatchingSteps(List<Node> nodes) {
		List<MatchingStep> result = null;
		for (Node start : nodes) {
			List<MatchingStep> matchingSteps = getMatchingSteps(rule, start);
			if (matchingSteps!=null) {
				if (result==null || matchingSteps.size()>result.size()) {
					result = matchingSteps;
				}
			}
		}
		return result;
	}

	private List<MatchingStep> getMatchingSteps(Rule rule, Node start) {
		List<MatchingStep> matchingSteps = new ArrayList<MatchingStep>();
		if (start.getOutgoing().isEmpty()) {
			matchingSteps.add(new MatchingStep(
					start, // node
					null, // edge
					null, // send back to
					null, // verify edge to
					true, // is start
					true, // is matching
					false // is join
					));
		}
		Deque<Edge> edgeQueue = new ArrayDeque<Edge>();
		edgeQueue.addAll(start.getOutgoing());
		Set<Node> lockedNodes = new HashSet<Node>();
		Set<Edge> visitedEdges = new HashSet<Edge>();
		while (!edgeQueue.isEmpty()) {
			Edge edge = edgeQueue.pop();
			
			boolean isMatching = lockedNodes.add(edge.getSource());
			
			// Add the next matching step:
			Node sendBackTo = null;
			if (lockedNodes.contains(edge.getTarget()) && !edgeQueue.isEmpty()) {
				sendBackTo = edgeQueue.getFirst().getSource();
			}
			Node verifyEdgeTo = null;
			if (lockedNodes.contains(edge.getTarget())) {
				verifyEdgeTo = edge.getTarget();
			}
			matchingSteps.add(new MatchingStep(
					edge.getSource(), // node
					edge, // edge
					sendBackTo, // send back to
					verifyEdgeTo, // verify edge to
					lockedNodes.size()==1, // is start
					isMatching, // is matching
					false // is join
					));

			visitedEdges.add(edge);

			if (edge.getTarget().getOutgoing().isEmpty()) {

				// Leaf:
				if (!lockedNodes.contains(edge.getTarget())) {
					sendBackTo = null;
					if (!edgeQueue.isEmpty()) {
						sendBackTo = edgeQueue.getFirst().getSource();
					}
					matchingSteps.add(new MatchingStep(
							edge.getTarget(), 
							null, 
							sendBackTo, 
							null, 
							false, 
							true, 
							false));
					lockedNodes.add(edge.getTarget());
				}

			} else {

				// Intermediate node:
				for (Edge succ : edge.getTarget().getOutgoing()) {
					if (!visitedEdges.contains(succ) && !edgeQueue.contains(succ)) {
						edgeQueue.push(succ);
					}
				}

			}

			lockedNodes.add(edge.getSource());

		}
		return matchingSteps;
	}

	private void generateOrderedLhsNodes() {
		orderedLhsNodes = new ArrayList<Node>();
		for (MatchingStep step : matchingSteps) {
			if (step.node!=null && !orderedLhsNodes.contains(step.node)) {
				orderedLhsNodes.add(step.node);
			}
		}
		// Sort all require node equivalences:
		for (NodeEquivalence equi : requiredNodesEquivalences.values()) {
			Collections.sort(equi, new Comparator<Node>() {
				@Override
				public int compare(Node x, Node y) {
					return orderedLhsNodes.indexOf(x) - orderedLhsNodes.indexOf(y);
				}
			});
		}
	}

}

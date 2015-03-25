package org.eclipse.emf.henshin.model.actions;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;

public class ConditionElemMapEditor {
	
	// Source and target conditions.
	private final NestedCondition source, target;
	
	private final boolean sameRule;
	
	public ConditionElemMapEditor(NestedCondition source, NestedCondition target) {
		this.source = source;
		this.target = target;
		this.sameRule = (source.getHost().getRule()==target.getHost().getRule());
	}
	
	private static void ensureCompleteness(NestedCondition cond) {
		Graph graph = cond.getConclusion();
		if (graph==null) return;
		for (Node node : cond.getHost().getRule().getLhs().getNodes()) {
			if (cond.getMappings().getImage(node, graph)==null) {
				Node image = EcoreUtil.copy(node);
				image.getAttributes().clear();
				graph.getNodes().add(image);
				cond.getMappings().add(node, image);
			}
		}
		for (Edge edge : cond.getHost().getRule().getLhs().getEdges()) {
			if (cond.getMappings().getImage(edge, graph)==null) {
				Edge image = EcoreUtil.copy(edge);
				image.setSource(cond.getMappings().getImage(edge.getSource(), graph));
				image.setTarget(cond.getMappings().getImage(edge.getTarget(), graph));
				graph.getEdges().add(image);
			}
		}
	}
	
	private Node getOppositeCondNode(Node node) {
		if (node.getGraph().eContainer()==source) {
			return target.getMappings().getImage(getOppositeLhsNode(source.getMappings().getOrigin(node)), target.getConclusion());			
		} else {
			return source.getMappings().getImage(getOppositeLhsNode(target.getMappings().getOrigin(node)), source.getConclusion());
		}
	}
	
	private Node getOppositeLhsNode(Node lhsNode) {
		if (sameRule) return lhsNode;
		if (lhsNode.getGraph()==source.getHost().getRule().getLhs()) {
			return target.getHost().getRule().getMultiMappings().getImage(lhsNode, target.getHost().getRule().getLhs());
		} else {
			return target.getHost().getRule().getMultiMappings().getOrigin(lhsNode);
		}
	}
	
	/**
	 * Move a condition node.
	 * @param node Node to be moved.
	 */
	public void moveConditionNode(Node node) {
		
		// Check whether it is really a condition node:
		if (((NestedCondition) node.getGraph().eContainer()).getMappings().getOrigin(node)!=null) {
			return;
		}
		
		ensureCompleteness(source);
		ensureCompleteness(target);
		
		Graph oppGraph = node.getGraph()==source.getConclusion() ? target.getConclusion() : source.getConclusion();
		
		for (Edge incoming : node.getIncoming()) {
			incoming.setSource(getOppositeCondNode(incoming.getSource()));
			incoming.setGraph(oppGraph);
		}
		for (Edge outgoing : node.getOutgoing()) {
			outgoing.setTarget(getOppositeCondNode(outgoing.getTarget()));
			outgoing.setGraph(oppGraph);
		}
		node.setGraph(oppGraph);
		
	}

	/**
	 * Move a condition edge.
	 * @param edge Edge to be moved.
	 */
	public void moveConditionEdge(Edge edge) {

		// Check whether it is really a condition edge:
		if (((NestedCondition) edge.getGraph().eContainer()).getMappings().getOrigin(edge)!=null) {
			return;
		}
		
		ensureCompleteness(source);
		ensureCompleteness(target);
		
		Graph oppGraph = edge.getGraph()==source.getConclusion() ? target.getConclusion() : source.getConclusion();
		edge.setSource(getOppositeCondNode(edge.getSource()));
		edge.setTarget(getOppositeCondNode(edge.getTarget()));
		edge.setGraph(oppGraph);
		
	}

	/**
	 * Move a condition attribute.
	 * @param attribute Attribute to be moved.
	 */
	public void moveConditionAttribute(Attribute attribute) {

		// Check whether it is really a condition edge:
		if (((NestedCondition) attribute.getGraph().eContainer()).getMappings().getOrigin(attribute)!=null) {
			return;
		}
		
		ensureCompleteness(source);
		ensureCompleteness(target);
		
		attribute.setNode(getOppositeCondNode(attribute.getNode()));
		
	}

	/**
	 * Move a condition element. This can be either a node or
	 * an edge. If it is neither, nothing happens.
	 * @param element Element to be moved.
	 */
	public void moveConditionElement(Object element) {
		if (element instanceof Node) {
			moveConditionNode((Node) element);
		} else if (element instanceof Edge) {
			moveConditionEdge((Edge) element);
		} else if (element instanceof Attribute) {
			moveConditionAttribute((Attribute) element);
		}
	}
	
}

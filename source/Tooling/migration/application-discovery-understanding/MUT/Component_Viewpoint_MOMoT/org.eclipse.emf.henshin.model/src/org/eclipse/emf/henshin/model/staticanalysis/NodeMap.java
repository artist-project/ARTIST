package org.eclipse.emf.henshin.model.staticanalysis;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Node;

public class NodeMap extends LinkedHashMap<Node,Node> {

	private static final long serialVersionUID = 1L;

	private final Graph source;

	private final Graph target;

	public NodeMap(Graph source, Graph target) {
		this.source = source;
		this.target = target;
	}
		
	public boolean isTotal() {
		return source.getNodes().size() == keySet().size() &&
				keySet().containsAll(source.getNodes());
	}

	public boolean isInjective() {
		Set<Node> images = new HashSet<Node>();
		for (Node origin : keySet()) {
			if (!images.add(get(origin))) return false;
		}
		return true;
	}

	public boolean isSurjective() {
		return target.getNodes().size() == values().size() &&
				values().containsAll(target.getNodes());
	}

	public boolean isBijective() {
		return isTotal() && isInjective() && isSurjective();
	}
	
	public boolean isGraphMorphism() {
		// Check node types:
		for (Node origin : keySet()) {
			if (origin.getType()!=get(origin).getType()) return false;
		}
		// Check edges:
		for (Edge edge : source.getEdges()) {
			Node srcImage = get(edge.getSource());
			Node trgImage = get(edge.getTarget());
			if (srcImage!=null && trgImage!=null) {
				if (srcImage.getOutgoing(edge.getType(), trgImage)==null) {
					return false;
				}
			}
		}
		return true;
	}
	
	public NodeMap getInverse() throws Exception {
		if (!isInjective()) {
			throw new RuntimeException("Cannot invert non-injective graph morphism");
		}
		NodeMap inverse = new NodeMap(target, source);
		for (Node origin : keySet()) {
			inverse.put(get(origin), origin);
		}
		return inverse;
	}
	
}

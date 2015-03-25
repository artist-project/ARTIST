package org.eclipse.emf.henshin.model.staticanalysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;

public class Path {

	final List<Node> nodes = new ArrayList<Node>();
	final List<Edge> edges = new ArrayList<Edge>();
	
	public boolean isCyclic() {
		int length = nodes.size();
		for (int i=0; i<length; i++) {
			Node n = nodes.get(i);
			for (int j=i+1; j<length; j++) {
				if (nodes.get(j)==n) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Node firstNode() {
		return nodes.get(0);
	}
	
	public Node lastNode() {
		return nodes.get(nodes.size()-1);
	}
	
	public void append(Path path) {
		for (int i=0; i<path.edges.size(); i++) {
			nodes.add(path.nodes.get(i+1));
			edges.add(path.edges.get(i));
		}
	}
	
	public Path copy() {
		Path copy = new Path();
		copy.nodes.addAll(nodes);
		copy.edges.addAll(edges);
		return copy;
	}
	
	public boolean isViaPAC() {
		List<GraphElement> elems = new ArrayList<GraphElement>();
		elems.addAll(nodes);
		elems.addAll(edges);
		for (GraphElement elem : elems) {
			if (elem.getGraph().isNestedCondition()) {
				NestedCondition nested = (NestedCondition) elem.getGraph().eContainer();
				if (nested.isPAC()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void retract() {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i=0; i<nodes.size(); i++) {
				Node node = nodes.get(i);
				if (node.getGraph()!=null && node.getGraph().isNestedCondition()) {
					NestedCondition nested = (NestedCondition) node.getGraph().eContainer();
					Node origin = nested.getMappings().getOrigin(node);
					if (origin!=null) {
						nodes.set(i, origin);
						changed = true;
					}
				}
			}
			for (int i=0; i<edges.size(); i++) {
				Edge edge = edges.get(i);
				if (edge.getGraph()!=null && edge.getGraph().isNestedCondition()) {
					NestedCondition nested = (NestedCondition) edge.getGraph().eContainer();
					Edge origin = nested.getMappings().getOrigin(edge);
					if (origin!=null) {
						edges.set(i, origin);
						changed = true;
					}
				}
			}
		}
	}

	public List<EReference> toReferenceList(boolean revertInverse) {
		List<EReference> refs = new ArrayList<EReference>();
		for (int i=0; i<edges.size(); i++) {
			Node source = nodes.get(i);
			Edge edge = edges.get(i);
			Node realSource = edge.getSource();
			while (realSource.getGraph()!=source.getGraph()) {
				NestedCondition nested = (NestedCondition) realSource.getGraph().eContainer();
				realSource = nested.getMappings().getOrigin(realSource);
			}
			if (realSource==source || !revertInverse) {
				refs.add(edge.getType());
			} else {
				EReference opp = edge.getType().getEOpposite();
				if (opp!=null) {
					refs.add(opp);
				} else {
					return null; // error
				}
			}
		}
		return refs;
	}
	
	public boolean isViaNestedCondition() {
		for (Edge edge : edges) {
			if (edge.getGraph()!=null && edge.getGraph().isNestedCondition()) return true;
		}
		return false;
	}
	
}

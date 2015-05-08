package org.eclipse.emf.henshin.model.impl;

import java.util.List;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;

/**
 * Internal mapping list helper class.
 * @author Christian Krause
 */
class MappingListHelper {

	static Mapping get(List<Mapping> list, Node origin, Node image) {
		for (Mapping m : list) {
			if (m.getOrigin()==origin && m.getImage()==image) {
				return m;
			}
		}
		return null;
	}

	static Mapping add(List<Mapping> list, Node origin, Node image) {
		Mapping m = get(list, origin, image);
		if (m==null) {
			m = new MappingImpl();
			m.setOrigin(origin);
			m.setImage(image);
			list.add(m);
		}
		return m;
	}

	static void add(List<Mapping> list, Edge origin, Edge image) {
		add(list, origin.getSource(), image.getSource());
		add(list, origin.getTarget(), image.getTarget());
	}

	static Mapping add(List<Mapping> list, Attribute origin, Attribute image) {
		return add(list, origin.getNode(), image.getNode());
	}

	static <E extends GraphElement> void add(List<Mapping> list, E origin, E image) {
		if (origin instanceof Node) {
			add(list, (Node) origin, (Node) image);
		}
		else if (origin instanceof Edge) {
			add(list, (Edge) origin, (Edge) image);
		}
		else if (origin instanceof Attribute) {
			add(list, (Attribute) origin, (Attribute) image);
		}
		else {
			throw new IllegalArgumentException("Element of unknown type: " + image);
		}
	}

	static Mapping remove(List<Mapping> list, Node origin, Node image) {
		Mapping m = get(list, origin, image);
		if (m!=null) {
			list.remove(m);
		}
		return m;
	}
	
	static void remove(List<Mapping> list, Edge origin, Edge image) {
		remove(list, origin.getSource(), image.getSource());
		remove(list, origin.getTarget(), image.getTarget());
	}

	static Mapping remove(List<Mapping> list, Attribute origin, Attribute image) {
		return remove(list, origin.getNode(), image.getNode());
	}

	static <E extends GraphElement> void remove(List<Mapping> list, E origin, E image) {
		if (origin instanceof Node) {
			remove(list, (Node) origin, (Node) image);
		}
		else if (origin instanceof Edge) {
			remove(list, (Edge) origin, (Edge) image);
		}
		else if (origin instanceof Attribute) {
			remove(list, (Attribute) origin, (Attribute) image);
		}
		else {
			throw new IllegalArgumentException("Element of unknown type: " + origin);
		}
	}
	
	static Node getImage(List<Mapping> list, Node origin, Graph imageGraph) {
		for (Mapping m : list) {
			if (m.getOrigin()==origin && m.getImage()!=null && 
				(imageGraph==null || imageGraph==m.getImage().getGraph())) {
				return m.getImage();
			}
		}
		return null;
	}

	static Node getOrigin(List<Mapping> list, Node image) {
		for (Mapping m : list) {
			if (m.getImage()==image && m.getOrigin()!=null) {
				return m.getOrigin();
			}
		}
		return null;
	}

	static Edge getImage(List<Mapping> list, Edge origin, Graph imageGraph) {
		if (origin.getSource()==null || origin.getTarget()==null) {
			return null;
		}
		Node source = getImage(list, origin.getSource(), imageGraph);
		Node target = getImage(list, origin.getTarget(), imageGraph);
		if (source==null || target==null) {
			return null;
		}
		return source.getOutgoing(origin.getType(), target);
	}

	static Edge getOrigin(List<Mapping> list, Edge image) {
		if (image.getSource()==null || image.getTarget()==null) {
			return null;
		}
		Node source = getOrigin(list, image.getSource());
		Node target = getOrigin(list, image.getTarget());
		if (source==null || target==null) {
			return null;
		}
		return source.getOutgoing(image.getType(), target);
	}

	static Attribute getImage(List<Mapping> list, Attribute origin, Graph imageGraph) {
		if (origin.getNode()==null) {
			return null;
		}
		Node nodeImage = getImage(list, origin.getNode(), imageGraph);
		if (nodeImage==null) {
			return null;
		}
		return nodeImage.getAttribute(origin.getType());
	}

	static Attribute getOrigin(List<Mapping> list, Attribute image) {
		if (image.getNode()==null) {
			return null;
		}
		Node nodeOrigin = getOrigin(list, image.getNode());
		if (nodeOrigin==null) {
			return null;
		}
		return nodeOrigin.getAttribute(image.getType());
	}

	@SuppressWarnings("unchecked")
	static <E extends GraphElement> E getOrigin(List<Mapping> list, E image) {
		if (image instanceof Node) {
			return (E) getOrigin(list, (Node) image);
		}
		else if (image instanceof Edge) {
			return (E) getOrigin(list, (Edge) image);
		}
		else if (image instanceof Attribute) {
			return (E) getOrigin(list, (Attribute) image);
		}
		else {
			throw new IllegalArgumentException("Element of unknown type: " + image);
		}
	}

	@SuppressWarnings("unchecked")
	static <E extends GraphElement> E getImage(List<Mapping> list, E origin, Graph imageGraph) {
		if (origin instanceof Node) {
			return (E) getImage(list, (Node) origin, imageGraph);
		}
		else if (origin instanceof Edge) {
			return (E) getImage(list, (Edge) origin, imageGraph);
		}
		else if (origin instanceof Attribute) {
			return (E) getImage(list, (Attribute) origin, imageGraph);
		}
		else {
			throw new IllegalArgumentException("Element of unknown type: " + origin);
		}
	}

	static boolean isOnto(List<Mapping> list, Graph imageGraph) {
		if (imageGraph==null) {
			return false;
		}
		for (Node node : imageGraph.getNodes()) {
			// Not the image of a mapping? Or a different type?
			Node nodeOrigin = getOrigin(list, node);
			if (nodeOrigin==null || nodeOrigin.getType()!=node.getType()) {
				return false;
			}
			// Check the attributes of this node as well.
			for (Attribute attribute : node.getAttributes()) {
				Attribute attOrigin = getOrigin(list, attribute);
				if (attOrigin==null || !valueEquals(attribute.getValue(), attOrigin.getValue())) {
					return false;
				}
			}
		}
		for (Edge edge : imageGraph.getEdges()) {
			// Not the image of a mapping? Or a different type?
			Edge edgeOrigin = getOrigin(list, edge);
			if (edgeOrigin==null || edgeOrigin.getType()!=edge.getType()) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Check if to attribute values are equal.
	 */
	static boolean valueEquals(String v1, String v2) {
		if (v1==null) {
			return (v2==null);
		}
		if (v2==null) {
			return false;
		}
		return v1.trim().equals(v2.trim());
	}

}

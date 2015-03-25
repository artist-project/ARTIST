package org.eclipse.emf.henshin.model.staticanalysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;

public class PathFinder {

	public static Map<List<EReference>,Integer> findReferencePaths(Node source, Node target, boolean withPACs, boolean onlyPACs) {
		Map<List<EReference>,Integer> reflists = new LinkedHashMap<List<EReference>,Integer>();
		for (Path path : findEdgePaths(source, target, true, withPACs)) {
			if (onlyPACs && !path.isViaNestedCondition()) {
				continue;
			}
			List<EReference> list = path.toReferenceList(true);
			if (list!=null) {
				Integer count = reflists.get(list);
				if (count!=null) {
					reflists.put(list, count + 1);
				} else {
					reflists.put(list, 1);
				}
			}
		}
		return reflists;
	}
	
	public static List<Path> findEdgePaths(Node source, Node target, boolean withInverse, boolean withPACs) {
		
		Graph graph = source.getGraph();
		
		Path initial = new Path();
		initial.nodes.add(source);
		List<Path> tempPaths = new ArrayList<Path>(); 
		tempPaths.add(initial);
		List<Path> finalPaths = new ArrayList<Path>(); 

		while (!tempPaths.isEmpty()) {
			List<Path> newTempPaths = new ArrayList<Path>(); 
			for (Path path : tempPaths) {
				Node last = path.lastNode();
				
				List<Path> steps = doStep(last, withInverse);
				if (withPACs) {
					for (NestedCondition pac : graph.getPACs()) {
						Node image = pac.getMappings().getImage(last, pac.getConclusion());
						if (image!=null) {
							steps.addAll(doStep(image, withInverse));
						}
					}
				}
				
				for (Path step : steps) {
					step.retract();
					Path extended = path.copy();
					extended.append(step);
					if (extended.isCyclic()) {
						continue;
					}
					if (extended.lastNode()==target) {
						finalPaths.add(extended);
					} else {
						newTempPaths.add(extended);
					}
				}
				
			}
			tempPaths = newTempPaths;
		}
		return finalPaths;
	}
		
	private static List<Path> doStep(Node node, boolean withInverse) {
		List<Path> paths = new ArrayList<Path>();
		for (Edge outgoing : node.getOutgoing()) {
			Path path = new Path();
			path.nodes.add(node);
			path.edges.add(outgoing);
			path.nodes.add(outgoing.getTarget());
			paths.add(path);
		}
		if (withInverse) {
			for (Edge incoming : node.getIncoming()) {
				Path path = new Path();
				path.nodes.add(node);
				path.edges.add(incoming);
				path.nodes.add(incoming.getSource());
				paths.add(path);
			}
		}
		return paths;
	}
	
	public static List<Path> findAllPaths(Graph graph, boolean withPACs) {
		List<Path> paths = new ArrayList<Path>();
		for (int i=0; i<graph.getNodes().size(); i++) {
			for (int j=0; i<graph.getNodes().size(); i++) {
				paths.addAll(findEdgePaths(graph.getNodes().get(i), graph.getNodes().get(j), true, withPACs));
			}
		}
		return paths;
	}
	
	public static boolean pacConsistsOnlyOfPaths(NestedCondition pac) {
		if (!pac.isPAC()) {
			return false;
		}
		
		// Collect reached edges and nodes:
		Set<Node> reachedPACNodes = new HashSet<Node>();
		Set<Edge> reachedPACEdges = new HashSet<Edge>();
		for (Path path : findAllPaths(pac.getHost(), true)) {
			for (Node node : path.nodes) {
				if (node.getGraph()==pac.getConclusion()) {
					reachedPACNodes.add(node);
				} else {
					Node image = pac.getMappings().getImage(node, pac.getConclusion());
					if (image!=null) reachedPACNodes.add(image);
				}
			}
			for (Edge edge : path.edges) {
				if (edge.getGraph()==pac.getConclusion()) {
					reachedPACEdges.add(edge);
				} else {
					Edge image = pac.getMappings().getImage(edge, pac.getConclusion());
					if (image!=null) reachedPACEdges.add(image);
				}
			}
		}
		
		// Check if any of the PAC nodes or edges is missing:
		if (!reachedPACNodes.containsAll(pac.getConclusion().getNodes())) {
			return false;
		}
		if (!reachedPACEdges.containsAll(pac.getConclusion().getEdges())) {
			return false;
		}
		
		// Check if any node has an attribute:
		for (Node node : reachedPACNodes) {
			if (!node.getAttributes().isEmpty()) {
				return false;
			}
		}
		
		// Check if any of the node types does not match the LHS node type:
		for (Node node : reachedPACNodes) {
			Node origin = pac.getMappings().getOrigin(node);
			if (origin!=null && origin.getType()!=node.getType()) {
				return false;
			}
		}
		
		// Ok.
		return true;
		
	}
	
}

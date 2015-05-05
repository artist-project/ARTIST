package org.eclipse.emf.henshin.model.staticanalysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Node;

/**
 * A <i>node equivalence</i> is a set <i>E</i> of at least 2 nodes in a graph <i>G</i>
 * satisfying the following property:
 * <ul>
 * <li><i>for all nodes x&ne;y &isin; E there exists a bijective graph morphism m:G&rarr;G such that m(x)=y and m(y)=x (i.e. a non-trivial automorphism).</i></li>
 * </ul>
 * @author Christian Krause
 */
public class NodeEquivalence extends ArrayList<Node> {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Compute the require node equivalences for a given rule.
	 * Every node equivalence has at least two nodes.
	 * @param rule The rule.
	 * @return The list of require node equivalences.
	 */
	public static List<NodeEquivalence> computeEquivalences(Graph graph) {
		List<NodeEquivalence> equivalences = new ArrayList<NodeEquivalence>();
		Set<Node> usedNodes = new HashSet<Node>();
		for (Node x : graph.getNodes()) {
			if (usedNodes.contains(x)) {
				continue;
			}
			NodeEquivalence equivalence = new NodeEquivalence();
			equivalence.add(x);
			for (Node y : graph.getNodes()) {
				if (x==y || usedNodes.contains(y) || x.getType()!=y.getType()) {
					continue;
				}
				NodeMap map = new NodeMap(graph, graph);
				for (Node z : graph.getNodes()) {
					if (z==x) {
						map.put(z, y);
					} else if (z==y) {
						map.put(z, x);
					} else {
						map.put(z, z);						
					}
				}
				if (map.isGraphMorphism()) {
					try {
						if (map.getInverse().isGraphMorphism()) {
							equivalence.add(y);
							usedNodes.add(x);
							usedNodes.add(y);
						}
					} catch (Exception e) {
						// do nothing
					}
				}
			}
			if (equivalence.size()>1) {
				equivalences.add(equivalence);
			}
		}
		return equivalences;
	}
	
}

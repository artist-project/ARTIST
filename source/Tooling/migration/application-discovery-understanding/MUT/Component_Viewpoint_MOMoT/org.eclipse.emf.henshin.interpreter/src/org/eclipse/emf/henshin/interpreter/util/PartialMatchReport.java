package org.eclipse.emf.henshin.interpreter.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * This class contains informations about partial matches for a given module and generates a textual report,which can be used to give the Henshin users a detailed feedback.
 * 
 * @author Svetlana Arifulina
 *
 */
public class PartialMatchReport {

	/**
	 * Module to be used.
	 */
	Module module;
	/**
	 * List of partial matches.
	 */
	List<Match> matches;
	/**
	 * Map connecting a rule from the module with partial matches, which have been found for it.
	 */
	Map<Rule, List<PartialMatchInfo>> infos = new HashMap<Rule, List<PartialMatchInfo>>();

	/**
	 * @return
	 */
	public Map<Rule, List<PartialMatchInfo>> getInfos() {
		return infos;
	}

	/**
	 * Constructor
	 */
	public PartialMatchReport(Module module, List<Match> matches) {
		super();
		this.module = module;
		this.matches = matches;
	}

	/**
	 * @return
	 */
	public Module getModule() {
		return module;
	}
	
	/**
	 * Helping class containing the information about one partial match and the delta with the lhs.
	 * 
	 * @author Svetlana Arifulina
	 *
	 */
	public class PartialMatchInfo {

		/**
		 * Complete or partial match
		 */
		Match match;
		/**
		 * Delta from the partial match to the lhs
		 */
		Graph delta;
		/**
		 * Flag to indicate a complete match
		 */
		boolean isComplete = false;
		/**
		 * Coverage of the lhs with the partial match
		 */
		double coverage;

		public double getCoverage() {
			return coverage;
		}

		public void setCoverage(double coverage) {
			this.coverage = coverage;
		}

		public boolean isComplete() {
			return isComplete;
		}

		public void setComplete(boolean isComplete) {
			this.isComplete = isComplete;
		}

		public Match getMatch() {
			return match;
		}

		public void setMatch(Match match) {
			this.match = match;
		}

		public Graph getDelta() {
			return delta;
		}

		public void setDelta(Graph delta) {
			this.delta = delta;
		}

	}

	/**
	 * The method generating a textual report.
	 * 
	 * @return Textual report
	 */
	public String getReport() {

		StringBuffer buffer = new StringBuffer();

		buffer.append("============================\n");
		buffer.append("Partial match statistics\n");

		if (infos.isEmpty()) {
			buffer.append("No matches were found.\n");
		} else {
			for (Rule rule : infos.keySet()) {
				
				for (PartialMatchInfo partialMatchInfo : infos.get(rule)) {
					if (partialMatchInfo.isComplete()) {
						buffer.append("============================\n");
						buffer.append("This is a complete match for " + rule.getName() + "\n");
						buffer.append(partialMatchInfo.getMatch().toString() + "\n");
					} else {
						buffer.append("============================\n");
						buffer.append("This is a partial match for " + rule.getName() + "\n");
						buffer.append(partialMatchInfo.getMatch().toString() + "\n");
						buffer.append("----------------------------------\n");
						buffer.append("Deltas are:\n");
						buffer.append(partialMatchInfo.getDelta().toString() + "\n");

						for (Node node : partialMatchInfo.getDelta().getNodes()) {
							buffer.append(node.toString() + "\n");
						}
						
						for (Edge edge : partialMatchInfo.getDelta().getEdges()) {
							buffer.append(edge.toString() + "\n");
						}
					}
					
				}
				
			}
		}
		buffer.append("============================\n");

		return buffer.toString();

	}

	/**
	 * Method collecting the report information for the given partial matches
	 * 
	 * @param originalRule Rule to collect infos about partial matches for.
	 * @param matches Module to be used.
	 * @return 
	 */
	public void collectPartialMatchInfos(
			Rule originalRule, List<Match> matches) {
		
		for (Match match : matches) {

			if (!infos.containsKey(originalRule)) {
				infos.put(originalRule, new ArrayList<PartialMatchInfo>());
			}

			PartialMatchInfo info = new PartialMatchInfo();
			info.setMatch(match);
			
			info.setDelta(computeDelta(originalRule, match));
			
			if (info.getDelta().getNodes().isEmpty()
					&& info.getDelta().getEdges().isEmpty()) {
				info.setComplete(true);
			}
			
			double coverage = 1 - (double)(info.getDelta().getNodes().size() + info.getDelta().getEdges().size())/(originalRule.getLhs().getNodes().size() + originalRule.getLhs().getEdges().size());
			coverage = (double)Math.round(100 * coverage)/100;
			info.setCoverage(coverage);

			infos.get(originalRule).add(info);
		}
	}

	/**
	 * Method computing the different between a partial match and a lhs.
	 * 
	 * @param originalRule Rule to compute a delta with the partial match for
	 * @param match (Partial) match for originalRule
	 * @return Graph as a delta between the originalRule and the given (partial) match
	 */
	private Graph computeDelta(Rule originalRule, Match match) {

		Graph delta = EcoreUtil.copy(originalRule.getLhs());
		Rule matchingRule = match.getRule();
		delta.setName("Partial match delta for " + matchingRule.getName());
		List<Node> nodesToRemove = new ArrayList<Node>();
		List<Edge> edgesToRemove = new ArrayList<Edge>();

		for (Node node : delta.getNodes()) {
			for (Node node2 : matchingRule.getLhs().getNodes()) {
				if (node.getType().equals(node2.getType()) && node.getName() == (node2.getName())) {
					nodesToRemove.add(node);
					break;
				}
			}
		}
		
		for (Edge edge : delta.getEdges()) {
			for (Edge edge2 : matchingRule.getLhs().getEdges()) {
				if(edge.getType().equals(edge2.getType())) {
					edgesToRemove.add(edge);
					break;
				}
			}
		}
		
		for (Node node : nodesToRemove) {
			List<Edge> edgesToAdd = new ArrayList<Edge>();
			edgesToAdd.addAll(node.getIncoming());
			edgesToAdd.addAll(node.getOutgoing());
			
			delta.removeNode(node);
			delta.getEdges().addAll(edgesToAdd);
		}
		
		for (Edge edge : edgesToRemove) {
			delta.removeEdge(edge);
		}
		
		return delta;
	}

	/**
	 * Method computing the coverage of a lhs by a partial match
	 * 
	 * @return Coverage of the module by the matches
	 */
	public double getCoverage() {
		
		double coverage = 0;
		
		if(!infos.isEmpty()) {
			for (Rule rule : infos.keySet()) {
				for (PartialMatchInfo info : infos.get(rule)) {
					coverage += info.getCoverage();
				}
			}
			
			coverage = coverage/infos.keySet().size();
		}
		
		return coverage;
	}

}

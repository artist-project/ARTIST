package at.ac.tuwien.big.momot.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.IMatchVariable;

public class MomotUtil {	
	
	public static EGraph copy(EGraph original) {
		if(original == null)
			return null;

		// Copy the resource.
		try {
			Resource copiedResource = new ResourceImpl();
			Copier copier = new Copier();
			copiedResource.getContents().addAll(copier.copyAll(original.getRoots().get(0).eResource().getContents()));
			copier.copyReferences();
			// Copy the graph:
			EGraph copiedGraph = original.copy(copier);
			return copiedGraph;
		} catch(Exception e) {
			return new EGraphImpl(EcoreUtil.copy(original.getRoots().get(0)));
		}
	}
	
	public static MatchSolution asMatchSolution(Solution solution) {
		return CastUtil.asClass(solution, MatchSolution.class);
	}
	
	public static MatchSolution assertMatchSolution(Solution solution) {
		return CastUtil.assertClass(solution, MatchSolution.class);
	}
	
	public static Assignment copy(Assignment assignment) {
		if(assignment instanceof IMatchVariable)
			return ((IMatchVariable) assignment).copy();
		if(assignment instanceof Match)
			return new MatchImpl(assignment, assignment.isResult());
		return new AssignmentImpl(assignment, assignment.isResult());
	}
}

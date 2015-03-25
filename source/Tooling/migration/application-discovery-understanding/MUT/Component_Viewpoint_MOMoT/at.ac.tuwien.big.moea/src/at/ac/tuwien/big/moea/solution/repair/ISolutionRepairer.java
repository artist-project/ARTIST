package at.ac.tuwien.big.moea.solution.repair;

import org.moeaframework.core.Solution;

public interface ISolutionRepairer<S extends Solution> {
	S repair(S solution);
}

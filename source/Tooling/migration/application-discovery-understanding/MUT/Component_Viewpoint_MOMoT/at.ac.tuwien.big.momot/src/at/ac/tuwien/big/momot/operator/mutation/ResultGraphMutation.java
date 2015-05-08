package at.ac.tuwien.big.momot.operator.mutation;

import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Rule;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.problem.ModelTransformationProblem;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class ResultGraphMutation extends AbstractMatchSolutionMutation {

	private ModelTransformationProblem problem;
	private Rule rule;

	public ResultGraphMutation(double probability, Rule rule, ModelTransformationProblem problem) {
		super(probability);
		this.rule = rule;
		this.problem = problem;
	}

	public ModelTransformationProblem getProblem() {
		return problem;
	}
	
	public Rule getRule() {
		return rule;
	}

	@Override
	protected MatchSolution mutate(MatchSolution mutant) {
		ExecutionResult execute = mutant.execute(getProblem());
		
		Iterable<Match> allMatches = getProblem().getEngine().findMatches(rule, execute.getResultGraph(), null);
		Match randomMatch = allMatches.iterator().next();
		if(randomMatch != null)
			mutant.addResultMutation(randomMatch);
		return mutant;
	}
	
}

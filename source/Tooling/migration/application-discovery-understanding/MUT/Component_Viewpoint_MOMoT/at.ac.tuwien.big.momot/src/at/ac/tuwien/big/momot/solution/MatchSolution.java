package at.ac.tuwien.big.momot.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;

import at.ac.tuwien.big.moea.solution.MOEASolution;
import at.ac.tuwien.big.momot.fitness.IEGraphFitnessFunction;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.problem.ModelTransformationProblem;
import at.ac.tuwien.big.momot.variable.IMatchVariable;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;
import at.ac.tuwien.big.momot.variable.MatchVariable;

public class MatchSolution extends MOEASolution implements Comparable<MatchSolution> {
	
	public static final String ATTRIBUTE_EXECUTION_RESULT = "ExecutionResult";
	public static final String ATTRIBUTE_MATCH_EXECUTION_RESULTS = "MatchExecutionResults";
	
	private static final long serialVersionUID = 3862075867187279004L;
	
	private IMatchVariable[] matchVariables;
	private List<IMatchVariable> resultMutations = new ArrayList<>();
	
	public MatchSolution(double... objectives) {
		super(objectives);
	}

	public MatchSolution(int numberOfVariables, int numberOfObjectives,
			int numberOfConstraints) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints);
		matchVariables = new IMatchVariable[numberOfVariables];
	}

	public MatchSolution(int numberOfVariables, int numberOfObjectives) {
		super(numberOfVariables, numberOfObjectives);
		matchVariables = new IMatchVariable[numberOfVariables];
	}

	public MatchSolution(Solution solution) {
		this(solution.getNumberOfVariables(), solution.getNumberOfObjectives(),
				solution.getNumberOfConstraints());

		matchVariables = new IMatchVariable[getNumberOfVariables()];
		for (int i = 0; i < getNumberOfVariables(); i++) 
			setVariable(i, solution.getVariable(i).copy());

		for (int i = 0; i < getNumberOfObjectives(); i++)
			setObjective(i, solution.getObjective(i));
		
		for (int i = 0; i < getNumberOfConstraints(); i++)
			setConstraint(i, solution.getConstraint(i));
		
		if (solution instanceof MatchSolution) {
			MatchSolution matchSolution = (MatchSolution) solution;

			for(IMatchVariable variable : matchSolution.getResultMutations())
				addResultMutation(variable.copy());
		}
	}
	
	public MatchSolution(List<? extends Assignment> matches, int numberOfObjectives,
			int numberOfConstraints) {
		super(matches.size(), numberOfObjectives, numberOfConstraints);
		matchVariables = new IMatchVariable[matches.size()];
		for(int i = 0; i < getNumberOfVariables(); i++)
			if(matches.get(i) == null || matches.get(i) instanceof MatchPlaceholderVariable)
				setVariable(i, new MatchPlaceholderVariable());
			else
				setVariable(i, new MatchVariable(matches.get(i)));
	}
	
	public MatchSolution(List<Match> matches, int numberOfObjectives) {
		this(matches, numberOfObjectives, 0);
	}
	
	@Override
	public void setVariable(int index, Variable variable) {
		if(index >= getNumberOfVariables())
			return;
		if(variable != null && variable instanceof IMatchVariable)
			matchVariables[index] = (IMatchVariable)variable;
		else
			throw new IllegalArgumentException("MatchSolution only supports the IMatchVariable variable type.");
	}
	
	@Override
	public int getNumberOfVariables() {
		return matchVariables.length;
	}
	
	public int getNumberOfVariables(boolean skipPlaceholders) {
		if(!skipPlaceholders)
			return super.getNumberOfVariables();
		int nr = 0;
		for(IMatchVariable var : getMatchVariables())
			if(!(var instanceof MatchPlaceholderVariable))
				nr++;
		return nr;
	}
	
	@Override
	public Variable getVariable(int index) {
		return matchVariables[index];
	}
	
	public List<IMatchVariable> getMatchVariables() {
		return Arrays.asList(matchVariables);
	}
	
	public IMatchVariable getMatchVariable(int index) {
		return matchVariables[index];
	}
	
	public List<IMatchVariable> getResultMutations() {
		return resultMutations;
	}
	
	public void addResultMutation(IMatchVariable variable) {
		resultMutations.add(variable);
	}
	
	public void addResultMutation(Match match) {
		resultMutations.add(new MatchVariable(match));
	}
	
	public void storeExecutionResult(ExecutionResult result) {
		setAttribute(ATTRIBUTE_EXECUTION_RESULT, result);
	}
	
	public void removeStoredExecutionResult() {
		removeAttribute(ATTRIBUTE_EXECUTION_RESULT);
	}
	
	public ExecutionResult getStoredExecutionResult() {
		return getAttribute(ATTRIBUTE_EXECUTION_RESULT, ExecutionResult.class);
	}
	
	public void storeMatchExecutionSuccess(Boolean[] matchExecutionSuccess) {
		setAttribute(ATTRIBUTE_MATCH_EXECUTION_RESULTS, matchExecutionSuccess);
	}
	
	public Boolean[] getStoredMatchExecutionSuccess() {
		return getAttribute(ATTRIBUTE_MATCH_EXECUTION_RESULTS, Boolean[].class);
	}
	
	public void removeStoredMatchExecutionSuccess() {
		removeAttribute(ATTRIBUTE_MATCH_EXECUTION_RESULTS);
	}
	
	public EGraph getStoredResultGraph() {
		ExecutionResult result = getStoredExecutionResult();
		if(result == null)
			return null;
		return result.getResultGraph();
	}
	
	public ExecutionResult execute(MatchHelper executor, EGraph graph) {
		return executor.execute(graph, this);
	}

	public ExecutionResult execute(IEGraphFitnessFunction fitnessFunction) {
		if(fitnessFunction == null)
			return null;
		return execute(fitnessFunction.getMatchHelper(), fitnessFunction.getInitialGraph());
	}
	
	public ExecutionResult execute(ModelTransformationProblem problem) {
		if(problem == null)
			return null;
		return execute(problem.getFitnessFunction());
	}
	
	@Override
	public int compareTo(MatchSolution other) {
		int compare = 0;
		
		Integer matchVariables = getMatchVariables().size();
		Integer otherMatchVariables = other.getMatchVariables().size();
		
		compare = matchVariables.compareTo(otherMatchVariables);
		if(compare != 0)
			return compare;
		
		for(int i = 0; i < matchVariables; i++) {
			compare = getMatchVariable(i).compareTo(other.getMatchVariable(i));
			if(compare != 0)
				return compare;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return getMatchVariables().toString() + "\n" + getResultMutations().toString();
	}
	
	@Override
	public MatchSolution copy() {
		return new MatchSolution(this);
	}
	
	public static MatchSolution removePlaceholders(MatchSolution solution) {
		List<IMatchVariable> nonEmptyVariables = new ArrayList<>();
		for(IMatchVariable variable : solution.getMatchVariables())
			if(variable != null && !(variable instanceof MatchPlaceholderVariable))
				nonEmptyVariables.add(variable.copy());
		
		return new MatchSolution(nonEmptyVariables, solution.getNumberOfObjectives(), solution.getNumberOfConstraints());
	}

}
